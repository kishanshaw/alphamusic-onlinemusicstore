package com.service;

import com.bean.cartBean;
import com.dao.cartDao;

public class cartService {
	
	public int addTocart(cartBean b)
	{
		cartDao cd=new cartDao();
		return cd.add(b);
	}
}
