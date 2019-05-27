package com.cafe24.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cafe24.springcontainer.user.User;
import com.cafe24.springcontainer.user.User1;

public class ContainerTest {

	public static void main(String[] args) {
//		testBeanFactory();
		testApplicationContext();
	}

	public static void testApplicationContext() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/user/applicationContext2.xml");

		User1 user1 = appContext.getBean(User1.class);
		System.out.println(user1.getName());

		// 오류 : 빈 설정은 id나 name 설정을 해야 한다.
//		User1 user1 = (User1) appContext.getBean("user1");
//		System.out.println(user1.getName());

		// name으로 가져오기
		User user = (User) appContext.getBean("user");
		System.out.println(user);
		// id로 가져오기 id를 쓰는것을 추천
		user = (User) appContext.getBean("usr");
		System.out.println(user);

		// Class로 가져오기 -> 오류 : 같은 타입의 빈이 2개이상 존재하면 타입으로 빈을 가져올 수 없다.
//		user = appContext.getBean(User.class);

		// Constructor-arg 로 생성하기
		user = (User) appContext.getBean("usr2");
		System.out.println(user);

		// Constructor-arg index를 줘서 생성하기
		user = (User) appContext.getBean("usr3");
		System.out.println(user);

		// property로 생성하기
		user = (User) appContext.getBean("usr4");
		System.out.println(user);

		
		((ConfigurableApplicationContext) appContext).close();
	}

	public static void testBeanFactory() {
		// Auto-Configuration(Scanning) 인 경우
		// Bean의 id가 자동으로 만들어 진다.
		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext.xml"));
		User1 user = (User1) bf1.getBean("user1");
		System.out.println(user.getName());

		// XML Bean 설정인 경우에는 id가 자동으로 부여되지 않는다.
		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext2.xml"));
//		user = (User1) bf2.getBean("user1");
//		System.out.println(user.getName());

		// 직접 클래스를 넣어주어야 한다.
		user = bf2.getBean(User1.class);
		System.out.println(user.getName());

	}

}
