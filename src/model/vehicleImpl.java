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
public class vehicleImpl extends Vehicle{
    private trafficMediator trafficMediator;
    private String vehicleNumber;
    private String vehicleOwner;
    private String vehicleType;

    public vehicleImpl(model.trafficMediator trafficMediator, String vehicleNumber,String vehicleOwner,String vehicleType) {
        super(trafficMediator, vehicleNumber,vehicleOwner,vehicleType);
        this.trafficMediator = trafficMediator;
        this.vehicleNumber = vehicleNumber;
        this.vehicleOwner=vehicleOwner;
        this.vehicleType=vehicleType;
    }

    @Override
    public void vehicleRequestingInfo(Lane lane) {
       trafficMediator.requestInfo(lane);
    }
    
}
