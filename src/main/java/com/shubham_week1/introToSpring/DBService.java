package com.shubham_week1.introToSpring;

import org.apache.catalina.util.ToStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

@Service
public class DBService {


    final public DB db;

    public DBService(DB db){
        this.db = db;
    }


    public String getDB(){


        return db.getData();


    }


}
