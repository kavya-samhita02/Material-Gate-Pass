/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

public class gpcreation {


  private String creation_date;
private String gp_type;
private String gate_name;
private String vhcl_no;
private String destination;
private String agency_name;
private String agency_address ;

    public int getGp_no() {
        return gp_no;
    }

    public void setGp_no(int gp_no) {
        this.gp_no = gp_no;
    }
//private String gp_status;
private int gp_no;
//private int created_by;
//private int expected_retn_dt;
//private int cleared_by;
//private int cleared_date;
//private String gp_remarks;
 
    public gpcreation(){
    
    }
   // gpcreation gcreate=new gpcreation();
    public gpcreation(String creation_date, String gp_type, String gate_name, String vhcl_no, String destination, String agency_name, String agency_address,int gp_no) {
    
this.creation_date=creation_date;
this. gp_type = gp_type;
this. gate_name = gate_name;
this. vhcl_no=vhcl_no;
this.destination=destination;
this.agency_name=agency_name;
this.agency_address=agency_address;
this.gp_no=gp_no;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getGp_type() {
        return gp_type;
    }

    public void setGp_type(String gp_type) {
        this.gp_type = gp_type;
    }

    public String getGate_name() {
        return gate_name;
    }

    public void setGate_name(String gate_name) {
        this.gate_name = gate_name;
    }

    public String getVhcl_no() {
        return vhcl_no;
    }

    public void setVhcl_no(String vhcl_no) {
        this.vhcl_no = vhcl_no;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAgency_name() {
        return agency_name;
    }

    public void setAgency_name(String agency_name) {
        this.agency_name = agency_name;
    }

    public String getAgency_address() {
        return agency_address;
    }

    public void setAgency_address(String agency_address) {
        this.agency_address = agency_address;
    }

//    public gpcreation getGcreate() {
//        return gcreate;
//    }
//
//    public void setGcreate(gpcreation gcreate) {
//        this.gcreate = gcreate;
//    }
}