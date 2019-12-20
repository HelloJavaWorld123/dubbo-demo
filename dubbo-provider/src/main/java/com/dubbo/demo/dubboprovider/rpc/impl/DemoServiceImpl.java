package com.dubbo.demo.dubboprovider.rpc.impl;

import com.dubbo.demo.api.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author : RXK
 * Date : 2019/12/20 16:29
 * Desc:
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService{

	public void SayHello(String param){
		System.out.println("Hello,"+param);
	}

	public void doYouHaveTime(String param){
		System.out.println(param+" 明天有空吗?");
	}

	public void exchangeWechat(String man, String fileMan){
		System.out.println(fileMan+"我扫你，"+""+man+"给你二维码");
	}
}
