package org.mybatis.example;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSimpleTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource = "org/mybatis/example/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		try {
		  Blog blog = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 1);
		  System.out.println(blog);
		  
		  BlogMapper mapper2 = session.getMapper(BlogMapper.class);
		  Blog blog2 = mapper2.selectBlog(1);
		  System.out.println(blog2);
		} finally {
		  session.close();
		}		
		
//		BlogMapper mapper = session.getMapper(BlogMapper.class);
//		Blog blog = mapper.selectBlog(101);
	}

}
