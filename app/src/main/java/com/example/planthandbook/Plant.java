package com.example.planthandbook;

public class Plant {

    private String name;
    private String plantDescription; //описание растения
    private int plantResource; //ресурс растения (картинка)
    private String populationSize;

    public Plant(String name, String plantDescription, int plantResource, String populationSize) {
        this.name = name;
        this.plantDescription = plantDescription;
        this.plantResource = plantResource;
        this.populationSize = populationSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlantDescription() {
        return plantDescription;
    }

    public void setPlantDescription(String plantDescription) {
        this.plantDescription = plantDescription;
    }

    public int getPlantResource() {
        return plantResource;
    }

    public void setPlantResource(int plantResource) {
        this.plantResource = plantResource;
    }

    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }
}
