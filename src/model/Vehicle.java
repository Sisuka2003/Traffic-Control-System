/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sisuk
 */
public abstract class Vehicle {
    private trafficMediator trafficMediator;
    private String vehicleNumber;
    private String vehicleOwner;
    private String vehicleType;

    public Vehicle(trafficMediator trafficMediator, String vehicleNumber,String vehicleOwner,String vehicleType) {
        super();
        this.trafficMediator = trafficMediator;
        this.vehicleNumber = vehicleNumber;
        this.vehicleOwner=vehicleOwner;
        this.vehicleType=vehicleType;
    }

    public trafficMediator getTrafficMediator() {
        return trafficMediator;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    
    
    public abstract void vehicleRequestingInfo(Lane lane);
}
