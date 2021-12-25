package com.example.julialistclient;

public class Contact {
    private String _name = "";
    private String _phone = "";
    private int _my_id;

    public String get_name() {
        return _name;
    }

    public String get_phone() {
        return _phone;
    }

    public int get_my_id() {
        return _my_id;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setPhone(String phone) {
        _phone = phone;
    }

    public void setMyId(int my_id) {
        _my_id = my_id;
    }
}
