package com.ad.model;

import java.util.*;

import com.emp.model.EmpVO;

public interface AdDAO_interface {
	
	  public void insert(AdVO adVO);
      public void update(AdVO adVO);
      public void delete(Integer adId);
      public AdVO findByPrimaryKey(Integer adId);
      public List<AdVO> getAll();
	

}
