package cn.edu.huel.owl.datasource;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import com.alibaba.druid.pool.DruidDataSource;

public class DruidDatasourceFactory extends UnpooledDataSourceFactory {

	public DruidDatasourceFactory() {
		this.dataSource = new DruidDataSource();
	}
       
}
