package com.yanhom.service;

import java.util.List;

import com.yanhom.entity.Artical;
import com.yanhom.entity.ArticalAndCategory;

public interface ArticalService {
	public List<Artical> getAllArtical();
	public ArticalAndCategory getOne(String id);
    public List<Artical> queryByCategory(String id);
	public List<ArticalAndCategory> getAAC();
	public List<ArticalAndCategory> getAAC(String id);
}
