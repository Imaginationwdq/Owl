package cn.edu.huel.owl.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	
	private static SqlSessionFactory sqlSessionFactory = null;
	static {
		 //加载xml文件
	  	  InputStream is;
			try {
				is = Resources.getResourceAsStream("Mybatis-config.xml");
				//构造会话工厂
		    	  sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		    	  //创建或者打开SqlSession
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static SqlSession getSqlSession() {
		 
		return sqlSessionFactory.openSession();
		
	}
} 
