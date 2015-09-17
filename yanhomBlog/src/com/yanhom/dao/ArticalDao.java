package com.yanhom.dao;

import java.util.List;

import com.yanhom.entity.Artical;
import com.yanhom.entity.ArticalAndCategory;

public interface ArticalDao {

	public List<Artical> getAll();
	public ArticalAndCategory getOne(String id);
	public List<Artical> queryByCategory(String id);
	public List<ArticalAndCategory> queryAAC();
	public List<ArticalAndCategory> queryAAC(String id);
}
