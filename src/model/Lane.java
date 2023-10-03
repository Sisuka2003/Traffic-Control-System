/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sisuk
 */
public abstract class Lane {
    
    private trafficMediator trafficMediator;
    private String laneNumber;

    public Lane(trafficMediator trafficMediator, String laneNumber) {
        super();
        this.trafficMediator = trafficMediator;
        this.laneNumber = laneNumber;
    }

    public trafficMediator getTrafficMediator() {
        return trafficMediator;
    }

    public String getLaneNumber() {
        return laneNumber;
    }

    public abstract void getVehicleList();
    
    public abstract void addVehicleToLane(Vehicle vehicle);
    public abstract void removeVehicleFromLane(Vehicle vehicle);
    
    
    
    
    
    
}
