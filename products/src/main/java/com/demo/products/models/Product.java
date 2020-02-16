package com.demo.products.models;

public class Product {
	
	private String id;
	private String name;
	private String providerId;
	private Provider provider;
	
	public Product() {
		
	}

	public Product(String id, String name, String providerId) {
		this.id = id;
		this.name = name;
		this.providerId = providerId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
}
