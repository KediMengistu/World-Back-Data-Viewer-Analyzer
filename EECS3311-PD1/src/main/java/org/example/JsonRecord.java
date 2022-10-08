package org.example;

import com.alibaba.fastjson.JSONObject;

public class JsonRecord implements IRecord {
    private final String key;
    private final JSONObject object;

    public JsonRecord(String key, JSONObject object) {
        this.key = key;
        this.object = object;
    }

    @Override
    public String getKey(String id) {
        return key;
    }

    @Override
    public Object getCell(String name) {
        return object.getString(name);
    }
}
