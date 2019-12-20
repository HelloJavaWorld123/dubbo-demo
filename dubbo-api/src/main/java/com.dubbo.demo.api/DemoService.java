package com.dubbo.demo.api;

/**
 * @author : RXK
 * Date : 2019/12/20 16:25
 * Desc: RPC export API
 */
public interface DemoService{

	void SayHello(String param);

	void doYouHaveTime(String param);

	void exchangeWechat(String man,String fileMan);
}
