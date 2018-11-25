package com.example.jonfi.cardocreader.view.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jonfi.cardocreader.R;

public class MainActivity extends AppCompatActivity {

    private TextView TVAutoCode, TVAutoBody, TVAutoModel, TVAutoProductionYear,
            TVAutoHorsePower, TVAutoRagistrationDate;
    private EditText ETAutoCode, ETAutoBody, ETAutoModel, ETAutoProductionYear,
            ETAutoHorsePower, ETAutoRagistrationDate;
    private Button ButtSave;

    private EditText[] autoVar = new EditText[]{ETAutoCode, ETAutoBody, ETAutoHorsePower,
            ETAutoHorsePower,ETAutoModel, ETAutoProductionYear, ETAutoRagistrationDate};


    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TVAutoCode = (TextView) findViewById(R.id.TVAutoCode);
        TVAutoBody = (TextView) findViewById(R.id.TVAutoBody);
        TVAutoModel = (TextView) findViewById(R.id.TVAutoModel);
        TVAutoProductionYear = (TextView) findViewById(R.id.TVAutoProductionYear);
        TVAutoHorsePower = (TextView) findViewById(R.id.TVAutoHorsePower);
        TVAutoRagistrationDate = (TextView) findViewById(R.id.TVAutoRagistrationDate);

        ETAutoCode = (EditText) findViewById(R.id.ETAutoCode);
        ETAutoBody = (EditText) findViewById(R.id.ETAutoBody);
        ETAutoModel = (EditText) findViewById(R.id.ETAutoModel);
        ETAutoProductionYear = (EditText) findViewById(R.id.ETAutoProductionYear);
        ETAutoHorsePower = (EditText) findViewById(R.id.ETAutoHorsePower);
        ETAutoRagistrationDate = (EditText) findViewById(R.id.ETAutoRagistrationDate);

        ButtSave = (Button) findViewById(R.id.ButtSave);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        Log.d(TAG, "onOptionsItemSelected runs");
        switch (item.getItemId()) {
            case R.id.MainMenuItem0_UploadData:
                //TODO: Use OCR
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
