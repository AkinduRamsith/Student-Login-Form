package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String age;
    private String phoneNumber;
    private String email;
    private String address;
    private String institute;
    private String batch;
    private String gender;

    public void setFirstName(String firstName){
        if(null==firstName)return;
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        if(null==lastName)return;
        this.lastName=lastName;
    }
    public void setAge(String age){
        if(null==age && Integer.parseInt(age)<10)return;
        this.age=age;
    }
    public void setPhoneNumber(String phoneNumber){
        if(null==firstName && phoneNumber.length()!=10 && phoneNumber.substring(0,1).equals(0))return;
        this.phoneNumber=phoneNumber;
    }

    public void setEmail(String email){
        if(null==email)return;
       this.email=email;
    }

    public void setAddress(String address){
        if(null==address)return;
        this.address=address;
    }

    public void setInstitute(String institute){
        if(null==institute)return;
        this.institute=institute;
    }

    public void setBatch(String batch){
        if(null==batch)return;
        this.batch=batch;
    }

    public void setGender(String gender){
        if(null==gender)return;
        this.gender=gender;
    }

}
