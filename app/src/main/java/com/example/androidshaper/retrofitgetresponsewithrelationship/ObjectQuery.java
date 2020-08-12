package com.example.androidshaper.retrofitgetresponsewithrelationship;

public class ObjectQuery {
    private TeamClass data;

    public ObjectQuery() {
    }

    public ObjectQuery(TeamClass data) {
        this.data = data;
    }

    public TeamClass getData() {
        return data;
    }

    public void setData(TeamClass data) {
        this.data = data;
    }
}
