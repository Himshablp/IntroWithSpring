package com.practise.IntroWithSpringCore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	
	double price;
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("This is the init block Pepsi bean implemented by InitializingInterface");
		
	}

	public void destroy() throws Exception {
		System.out.println("This is the destroy block of Pepsi bean implemented by DisposableBean Interface");
		
	}

}
