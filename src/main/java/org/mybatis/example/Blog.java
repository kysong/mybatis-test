package org.mybatis.example;

import java.util.Date;

public class Blog {
	private long id;
	private String subject;
	private String article;
	private Date datetime;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" / "+subject+" / "+article+" / "+datetime;
	}
}
