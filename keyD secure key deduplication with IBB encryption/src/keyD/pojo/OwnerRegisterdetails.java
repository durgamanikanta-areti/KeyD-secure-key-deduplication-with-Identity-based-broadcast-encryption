/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyD.pojo;

/**
 *
 * @author DELL
 */
public class OwnerRegisterdetails {
    public OwnerRegisterdetails(){
        
    }

    public OwnerRegisterdetails(String OwnerName, String Password, String Email, String Org, String Address, String PhoneNo) {
        this.OwnerName = OwnerName;
        this.Password = Password;
        this.Email = Email;
        this.Org = Org;
        this.Address = Address;
        this.PhoneNo = PhoneNo;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getOrg() {
        return Org;
    }

    public void setOrg(String Org) {
        this.Org = Org;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }
    private String OwnerName;
    private String Password;
    private String Email;
    private String Org;
    private String Address;
    private String PhoneNo;
    
    
}
