package com.zaraj.katalog.domain;

public class Plant {

	private String plantId;
	private String plantSpecies; // rodzaj - ex. swierk
	private String plantGenus; // gatunek - ex. hopsii
	private String plantColor;
	private String plantShape;
	private long plantsPrice;
	private long plantsInStock;
	
	
	public String getPlantId() {
		return plantId;
	}
	public void setPlantId(String plantId) {
		this.plantId = plantId;
	}
	public String getPlantSpecies() {
		return plantSpecies;
	}
	public void setPlantSpecies(String plantSpecies) {
		this.plantSpecies = plantSpecies;
	}
	public String getPlantGenus() {
		return plantGenus;
	}
	public void setPlantGenus(String plantGenus) {
		this.plantGenus = plantGenus;
	}
	public String getPlantColor() {
		return plantColor;
	}
	public void setPlantColor(String plantColor) {
		this.plantColor = plantColor;
	}
	public String getPlantShape() {
		return plantShape;
	}
	public void setPlantShape(String plantShape) {
		this.plantShape = plantShape;
	}
	public long getPlantsPrice() {
		return plantsPrice;
	}
	public void setPlantsPrice(long plantsPrice) {
		this.plantsPrice = plantsPrice;
	}
	public long getPlantsInStock() {
		return plantsInStock;
	}
	public void setPlantsInStock(long plantsInStock) {
		this.plantsInStock = plantsInStock;
	}
	
	
	
}
