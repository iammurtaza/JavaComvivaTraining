package com.comviva;

public class HelloService implements IService {
	private String name;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public HelloService() {
	}

	public HelloService(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public String sayHello() {
		return sayHello(name, city);
	}

	@Override
	public String sayHello(String name, String city) {
		String formatStrings[] = {
				"Hey how are you Mr/Ms/Mrs: %s & How is your city %s ",
				"Good Afternoon, Mr/Ms/Mrs: %s Heard you are in %s ",
				"There is something good food Mr/Ms/Mrs: %s in city %s " };

		int randomNumber = (int) (Math.random() * 3);
		return String
				.format(formatStrings[randomNumber].toString(), name, city);
	}
}
