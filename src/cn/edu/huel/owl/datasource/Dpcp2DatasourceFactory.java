package cn.edu.huel.owl.datasource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;


public class Dpcp2DatasourceFactory extends UnpooledDataSourceFactory {

	public Dpcp2DatasourceFactory() {
		this.dataSource = new BasicDataSource();
		}
       
	
}
