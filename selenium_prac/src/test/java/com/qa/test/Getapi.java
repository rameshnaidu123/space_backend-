package com.qa.test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;
import netscape.javascript.JSObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Getapi extends TestBase{

    TestBase testBase;

    String url;
    String tools_endpoint;
    String apilink;

    public Getapi() throws FileNotFoundException {
    }


    @BeforeMethod
        public void beforeMethod () throws FileNotFoundException {
            testBase = new TestBase();
            url = prop.getProperty("url");
            tools_endpoint = prop.getProperty("tools_endpoint");
            apilink = url + tools_endpoint;

        }

        @Test
        public void getTest () throws IOException {
            RestClient restClient = new RestClient();

            CloseableHttpResponse closeableHttpResponse = restClient.get(apilink);
            String reponse = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
            JSONObject jsonresponse = null;

            try{
                jsonresponse = new JSONObject(reponse);


            }
            catch(Exception e){
                e.printStackTrace();
            }

            System.out.println(jsonresponse);


        }

    }



//            jsonresponse = new JSONObject(reponse);
//            obj=jsonresponse;
//
//            for(String s:jpath.split("/")){
//            if(!s.isEmpty())
//            if(!(s.contains("[")||s.contains("]")))
//            obj=((JSONObject)obj).get(s);
//            else if(s.contains("[")||s.contains("]"))
//            obj=((JSONArray)((JSONObject)obj).get(s.split("\\[")[0])).get(Integer.parseInt(s.split("\\[")[1].replace("]","")));
//            System.out.println(obj.toString());
