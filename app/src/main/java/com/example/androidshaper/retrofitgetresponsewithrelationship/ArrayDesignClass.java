package com.example.androidshaper.retrofitgetresponsewithrelationship;

import java.util.List;

public class ArrayDesignClass {

    List<ObjectDesignClass> data;

    public ArrayDesignClass() {
    }

    public ArrayDesignClass(List<ObjectDesignClass> data) {
        this.data = data;
    }

    public List<ObjectDesignClass> getData() {
        return data;
    }

    public void setData(List<ObjectDesignClass> data) {
        this.data = data;
    }
}
