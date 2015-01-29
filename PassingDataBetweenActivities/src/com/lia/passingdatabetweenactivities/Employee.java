package com.lia.passingdatabetweenactivities;

import android.os.Parcel;
import android.os.Parcelable;
 
public class Employee implements Parcelable {
    int id;
    String name;
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
 
 
    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 1;
    }
 
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeInt(id);
        dest.writeString(name);
 
    }
 
    public Employee(Parcel source) {
        // TODO Auto-generated method stub
        id = source.readInt();
        name = source.readString();
 
    }
 
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
 
        @Override
        public Employee createFromParcel(Parcel source) {
            // TODO Auto-generated method stub
            return new Employee(source);
        }
 
        @Override
        public Employee[] newArray(int size) {
            // TODO Auto-generated method stub
            return new Employee[size];
        }
    };
 
}
