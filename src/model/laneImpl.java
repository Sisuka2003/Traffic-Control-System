/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.requestedTraffic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author sisuk
 */
public class laneImpl extends Lane {

    private trafficMediator trafficMediator;
    private String laneNumber;
    private ArrayList<Vehicle> vehicleList=new ArrayList<Vehicle>();
    

    public laneImpl(model.trafficMediator trafficMediator, String laneNumber) {
        super(trafficMediator, laneNumber);
        this.trafficMediator = trafficMediator;
        this.laneNumber = laneNumber;
       
    }

    
    
    @Override
    public void addVehicleToLane(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    @Override
    public void removeVehicleFromLane(Vehicle vehicle) {
        vehicleList.remove(vehicle);
    }

    @Override
    public void getVehicleList() {
        TableModel tm = requestedTraffic.requestedTable.getModel();
        DefaultTableModel dtm=(DefaultTableModel) tm;
        
        for(Vehicle v: vehicleList){
            Vector vec=new Vector();
            
            int rowCount = requestedTraffic.requestedTable.getRowCount();
            int updateRow=rowCount+1;
            
            String vehicleNumber = v.getVehicleNumber();
            String vehicleOwner = v.getVehicleOwner();
            String vehicleType = v.getVehicleType();
            
            vec.add(updateRow);
            vec.add(vehicleOwner);
            vec.add(vehicleNumber);
            vec.add(vehicleType);
            
            dtm.addRow(vec);
            
        }
        
    }

}
