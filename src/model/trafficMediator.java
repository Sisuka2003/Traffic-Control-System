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
public interface trafficMediator {
    public abstract void addVehicle(Vehicle vehicle);
    public abstract void addLane(Lane lane);
    
    
    public abstract void requestInfo(Lane lane);
}
