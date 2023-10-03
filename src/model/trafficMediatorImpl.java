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
public class trafficMediatorImpl implements trafficMediator{

    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Lane> laneList;

    public trafficMediatorImpl() {
    vehicleList=new ArrayList<Vehicle>();
    laneList=new ArrayList<Lane>();
    }
    
    
    
    
    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    @Override
    public void addLane(Lane lane) {
        laneList.add(lane);
    }

    
    
    
    @Override
    public void requestInfo(Lane lane) {
        for(Lane l: laneList){
        
            if(l.getLaneNumber().equals(lane.getLaneNumber())){
                l.getVehicleList();
            }
        }
    }
    
}
