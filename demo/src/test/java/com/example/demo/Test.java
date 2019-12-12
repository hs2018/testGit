package com.example.demo;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Product;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
/**
 * @author huangxinyi
 * jackson实现对象和json,集合和json之间的互相转换
 * 
 */
public class Test {

	private ObjectMapper objectMapper = new ObjectMapper();


	@org.junit.Test
	public void test() {
		String jsonArr = "[{\"brand\":\"联想\",\"type\":\"电脑\",\"color\":\"白色\",\"price\":\"3000\"}," +
				"{\"brand\":\"小米\",\"type\":\"手机\",\"color\":\"黑色\",\"price\":\"2500\"}," +
				"{\"brand\":\"华为\",\"type\":\"手机\",\"color\":\"白色\",\"price\":\"2000\"}," +
				"{\"brand\":\"戴尔\",\"type\":\"电脑\",\"color\":\"蓝色\",\"price\":\"4000\"}," +
				"{\"brand\":\"苹果\",\"type\":\"手机\",\"color\":\"红色\",\"price\":\"5000\"}]";

		try {

			//json转集合
			List<Product> plist = objectMapper.readValue(jsonArr, new TypeReference<List<Product>>() {
			});
			System.out.println(plist);

			//json转对象
			Product p = objectMapper.readValue("{\"brand\":\"小米\",\"type\":\"手机\",\"color\":\"黑色\",\"price\":\"2500\"}", Product.class);
			System.out.println(p.toString());
			
		/*	//对象转json
			String json_p = objectMapper.writeValueAsString(new Product("小米","手机","黑色",2500.00));
			System.out.println(json_p);*/

			//集合转json
			String json_list = objectMapper.writeValueAsString(plist);
			System.out.println(json_list.toString());

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









