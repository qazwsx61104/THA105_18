package com.ad.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.ad.model.AdService;
import com.ad.model.AdVO;
import com.emp.model.EmpService;

@MultipartConfig(fileSizeThreshold = 1024*1024 , maxFileSize = 10 * 1024 * 1024 , maxRequestSize = 10*10*1024*1024)
public class AdServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		System.out.println(action);

		if ("getOne_For_Display".equals(action)) {

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs); // 因為要把errorMsg forward出去 , 所以用req設定參數

			/*************************** 1.接收請求參數 - 輸入格式的錯誤處理 **********************/
			String str = req.getParameter("adId");
			if (str == null || (str.trim()).length() == 0) {
				errorMsgs.add("請輸入廣告編號");
			}

			if (!errorMsgs.isEmpty()) {
				RequestDispatcher failureView = req.getRequestDispatcher("/ad/select_page.jsp");
				failureView.forward(req, res); // RequestDispatcher 下面就要有forward
				return;
			}

			Integer adId = null;
			try {
				adId = Integer.valueOf(str); // Integer轉型放入字串會跳Exception
			} catch (Exception e) {
				errorMsgs.add("廣告編號格式不正確");
			}

			if (!errorMsgs.isEmpty()) {
				RequestDispatcher failureView = req.getRequestDispatcher("/ad/select_page.jsp");
				failureView.forward(req, res);
				return;
			}

			/*************************** 2.開始查詢資料 *****************************************/
			AdService adSvc = new AdService();
			AdVO adVO = adSvc.getOneAd(adId);
			if (adVO == null) {
				errorMsgs.add("查無資料");
			}

			if (!errorMsgs.isEmpty()) {
				RequestDispatcher failureView = req.getRequestDispatcher("/ad/select_page.jsp");
				failureView.forward(req, res);
				return;
			}

			/**************************** 3.查詢完成,準備轉交(Send the Success view) *****************************************/
			req.setAttribute("adVO", adVO);
			String url = "/ad/listOneAd.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}
		

		if ("insert".equals(action)) {
			System.out.println("INSERT");
			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);

			/*********************** 1.接收請求參數 - 輸入格式的錯誤處理 *************************/
String adName = req.getParameter("adName");
			String adNameReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{2,10}$";
			if (adName == null || adName.trim().length() == 0) {
				errorMsgs.add("廣告名稱:請勿空白");
			} else if (!adName.trim().matches(adNameReg)) { // 以下練習正則(規)表示式(regular-expression)
				errorMsgs.add("廣告名稱: 只能是中、英文字母、數字和_ , 且長度必需在2到10之間");
			}
			
Integer sellerId = null;
			try {
sellerId = Integer.valueOf(req.getParameter("sellerId").trim());
			} catch(NumberFormatException e) {
				sellerId = 0;
				errorMsgs.add("賣家ID請填數字");
			}
			
String adUrl = req.getParameter("adUrl");
			String adUrlReg = "^(https?|ftp):\\/\\/[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+(\\/[^\\s]*)?$";			
			if(adUrl == null || adUrl.trim().length() ==0 ) {
				errorMsgs.add("廣告網址:請勿空白");
			}else if( !adUrl.trim().matches(adUrlReg)) {
				errorMsgs.add("廣告網址:只能是網址格式");
			}
			
			java.sql.Timestamp adStartTime = null;
			try {
adStartTime = java.sql.Timestamp.valueOf(req.getParameter("adStartTime").trim());
			} catch (IllegalArgumentException e) {
				adStartTime = new java.sql.Timestamp(System.currentTimeMillis());
				errorMsgs.add("請輸入起始日期");
			}
			
			java.sql.Timestamp adEndTime = null;
			try {
adEndTime = java.sql.Timestamp.valueOf(req.getParameter("adEndTime").trim());
			} catch (IllegalArgumentException e) {
				adStartTime = new java.sql.Timestamp(System.currentTimeMillis());
				errorMsgs.add("請輸入結束日期");
			}
			
Integer adLv = Integer.valueOf(req.getParameter("adLv").trim());


Part filePart = req.getPart("adImg");
				InputStream in = filePart.getInputStream();
				byte[] adImg =in.readAllBytes();
				in.close();
				
java.sql.Timestamp adImgUploadTime = java.sql.Timestamp.valueOf(java.time.LocalDateTime.now());

String adMemo = req.getParameter("adMemo");
				String adMemoReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{2,100}$";
				if (adMemo == null || adName.trim().length() == 0) {
					errorMsgs.add("廣告名稱:請勿空白");
				} else if (!adMemo.trim().matches(adNameReg)) { // 以下練習正則(規)表示式(regular-expression)
					errorMsgs.add("廣告名稱: 只能是中、英文字母、數字和_ , 且長度必需在2到100之間");
				}
				
Boolean isAdConfirm = Boolean.valueOf(req.getParameter("isAdConfirm").trim());

java.sql.Timestamp adCreateTime = java.sql.Timestamp.valueOf(java.time.LocalDateTime.now());

Boolean isEnabled = Boolean.valueOf(req.getParameter("isEnabled").trim());




				AdVO adVO = new AdVO();
				adVO.setSellerId(sellerId);
				adVO.setAdImg(adImg);
				adVO.setAdImgUploadTime(adImgUploadTime);
				adVO.setAdName(adName);
				adVO.setAdUrl(adUrl);
				adVO.setAdStartTime(adStartTime);
				adVO.setAdEndTime(adEndTime);
				adVO.setAdLv(adLv);
				adVO.setAdMemo(adMemo);
				adVO.setIsAdConfirm(isAdConfirm);
				adVO.setAdCreateTime(adCreateTime);
				adVO.setIsEnabled(isEnabled);	
				
				System.out.println("AdVO"+adVO);
				
				if(!errorMsgs.isEmpty()) {
				req.setAttribute("Advo", adVO);
				RequestDispatcher failureView = req.getRequestDispatcher("/ad/addAd.jsp");
				failureView.forward(req, res);
				return;
				}

				/***************************2.開始新增資料***************************************/
				AdService adSvc = new AdService();
				adVO = adSvc.addAd(sellerId,adImg,adImgUploadTime,adName,adUrl,adStartTime,adEndTime,adLv,adMemo,isAdConfirm,adCreateTime,isEnabled);
				
				/***************************3.新增完成,準備轉交(Send the Success view)***********/
				String url = "/ad/listAllAd.jsp" ;
				RequestDispatcher successView = req.getRequestDispatcher(url);
				successView.forward(req, res);		
		}	
		
		if("update".equals(action)) {
			
			List<String> errorMsgs = new LinkedList<String>();
			
			req.setAttribute("errorMsgs", errorMsgs);
			
Integer adId = Integer.valueOf(req.getParameter("adId").trim());

Integer sellerId = null;
			try {
			sellerId = Integer.valueOf(req.getParameter("sellerId").trim());
			} catch(NumberFormatException e) {
				sellerId = 0;
				errorMsgs.add("賣家ID請填數字");								
			}
			
			
			
			
String adName = req.getParameter("adName");
			String adNameReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{2,10}$";
			if (adName == null || adName.trim().length() == 0) {
				errorMsgs.add("廣告名稱:請勿空白");
			} else if (!adName.trim().matches(adNameReg)) { // 以下練習正則(規)表示式(regular-expression)
				errorMsgs.add("廣告名稱: 只能是中、英文字母、數字和_ , 且長度必需在2到10之間");
			}
String adUrl = req.getParameter("adUrl");
			String adUrlReg = "^(https?|ftp):\\/\\/[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+(\\/[^\\s]*)?$";			
			if(adUrl == null || adUrl.trim().length() ==0 ) {
				errorMsgs.add("廣告網址:請勿空白");
			}else if( !adUrl.trim().matches(adUrlReg)) {
				errorMsgs.add("廣告網址:只能是網址格式");
			}
			
			java.sql.Timestamp adStartTime = null;
			try {
adStartTime = java.sql.Timestamp.valueOf(req.getParameter("adStartTime").trim());
			} catch (IllegalArgumentException e) {
				adStartTime = new java.sql.Timestamp(System.currentTimeMillis());
				errorMsgs.add("請輸入起始日期");
			}
			
			java.sql.Timestamp adEndTime = null;
			try {
adEndTime = java.sql.Timestamp.valueOf(req.getParameter("adEndTime").trim());
			} catch (IllegalArgumentException e) {
				adStartTime = new java.sql.Timestamp(System.currentTimeMillis());
				errorMsgs.add("請輸入結束日期");
			}
			
Integer adLv = Integer.valueOf(req.getParameter("adLv").trim());


Part filePart = req.getPart("adImg");
				InputStream in = filePart.getInputStream();
				byte[] adImg =in.readAllBytes();
				in.close();
				
java.sql.Timestamp adImgUploadTime = java.sql.Timestamp.valueOf(java.time.LocalDateTime.now());

String adMemo = req.getParameter("adName");
				String adMemoReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{2,100}$";
				if (adMemo == null || adName.trim().length() == 0) {
					errorMsgs.add("廣告名稱:請勿空白");
				} else if (!adMemo.trim().matches(adNameReg)) { // 以下練習正則(規)表示式(regular-expression)
					errorMsgs.add("廣告名稱: 只能是中、英文字母、數字和_ , 且長度必需在2到100之間");
				}
				
Boolean isAdConfirm = Boolean.valueOf(req.getParameter("isAdConfirm").trim());

java.sql.Timestamp adCreateTime = java.sql.Timestamp.valueOf(java.time.LocalDateTime.now());

Boolean isEnabled = Boolean.valueOf(req.getParameter("isEnabled").trim());

				AdVO adVO = new AdVO();
				adVO.setSellerId(sellerId);
				adVO.setAdImg(adImg);
				adVO.setAdImgUploadTime(adImgUploadTime);
				adVO.setAdName(adName);
				adVO.setAdUrl(adUrl);
				adVO.setAdStartTime(adStartTime);
				adVO.setAdEndTime(adEndTime);
				adVO.setAdLv(adLv);
				adVO.setAdMemo(adMemo);
				adVO.setIsAdConfirm(isAdConfirm);
				adVO.setAdCreateTime(adCreateTime);
				adVO.setIsEnabled(isEnabled);	
				
				if(!errorMsgs.isEmpty()) {
				req.setAttribute("Advo", adVO);
				RequestDispatcher failureView = req.getRequestDispatcher("/ad/update_ad_input.jsp");
				failureView.forward(req, res);
				return;
				}

				/***************************2.開始修改資料***************************************/
				AdService adSvc = new AdService();
				adVO = adSvc.updateAd(adId,sellerId,adImg,adImgUploadTime,adName,adUrl,adStartTime,adEndTime,adLv,adMemo,isAdConfirm,adCreateTime,isEnabled);
				
				/***************************3.修改完成,準備轉交(Send the Success view)***********/
				String url = "/ad/listAllAd.jsp" ;
				RequestDispatcher successView = req.getRequestDispatcher(url);
				successView.forward(req, res);					
			
		}
		
		if("getOne_For_Update".equals(action)) {
			List<String>errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
			
			/***************************1.接收請求參數****************************************/
			Integer adId = Integer.valueOf(req.getParameter("adId"));
			
			/***************************2.開始查詢資料****************************************/
			AdService adSvc = new AdService();
			AdVO adVO = adSvc.getOneAd(adId);
			
			/***************************2.開始查詢資料****************************************/
			
			req.setAttribute("adVO", adVO);
			String url =  "/ad/update_ad_input.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);			
			
		}
		
		if("delete".equals(action)) {
			List<String>errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
			/***************************1.接收請求參數***************************************/
			Integer adId = Integer.valueOf(req.getParameter("adId"));
			
			/***************************2.開始刪除資料***************************************/
			AdService adSvc = new AdService();
			adSvc.deleteAd(adId);
			
			/***************************3.刪除完成,準備轉交(Send the Success view)***********/								
			String url = "/ad/listAllAd.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);// 刪除成功後,轉交回送出刪除的來源網頁
			successView.forward(req, res);			
		}

	}

}
