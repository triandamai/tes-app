package com.trian.cexup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
 
    RequestQueue requestQueue;
    TextView tv1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         requestQueue = Volley.newRequestQueue(this);

        tv1 = findViewById(R.id.tv1);

        getData();

    }
    private void getData() {
        String url = "https://devdevice.cexup.com/api/measurement/history?member_id=CXPq9AD0XZoOO&all=true&latest=true&type=1&from=1635821282937&to=1635821282937";
        StringRequest request = new StringRequest(Request.Method.GET, url, response -> {
           try {
                JSONObject jsonObject = new JSONObject(response);
                JSONArray data = jsonObject.getJSONArray("data");
               String status = jsonObject.getString("status");
               JSONObject dataObject = data.getJSONObject(0);

               String id = dataObject.getString("id");
//                    tv1.setText(jsonObject.getString("status"));
               Log.e("DEBOOOGSS", status);
               Log.e("Data", data+"");
               Log.e("Datass", id);

           }catch (Exception e){
               e.printStackTrace();
           }
        }, error -> Log.e("TAG", error+"" )){
            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> headers = new HashMap<String, String>();
                headers.put("X-Api-Key", "MTYzNTEzMDIzNDY0MA==16351302346401636020598822");
                headers.put("Accept", "application/json");
                headers.put("Content-Type", "application/json");

                return headers;
            }


//            @Nullable
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<String, String>();
//                params.put("member_id", "CXPq9AD0XZoOO");
//                params.put("all", "true");
//                params.put("latest", "true");
//                params.put("type", "1");
//                params.put("from", "1635821282937");
//                params.put("to", "1635821282937");
//                return params;
//
//            }
        };

        requestQueue.add(request);
    }
}