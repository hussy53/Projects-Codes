package com.example.mcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }
    public void buttonClicked(View v) {
        EditText principleView = (EditText) findViewById(R.id.principleBox);
        String principle = principleView.getText().toString();
        EditText amortView = (EditText) findViewById(R.id.amortBox);
        String amortization = amortView.getText().toString();
        EditText interestView = (EditText) findViewById(R.id.interestBox);
        String interest = interestView.getText().toString();

        MortgageModel model = new MortgageModel(principle, amortization, interest);
        String compute = model.computePayment();
        ((TextView) findViewById(R.id.answer)).setText(compute);

    }
}
