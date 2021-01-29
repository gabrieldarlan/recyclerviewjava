package com.gdarlan.recyclermasterjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gdarlan.recyclermasterjava.model.Email;
import com.gdarlan.recyclermasterjava.model.Emails;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailAdapter emailAdapter = new EmailAdapter(new ArrayList<>(Emails.fakeEmails()));
        RecyclerView rv = findViewById(R.id.recycler_view_main);
        rv.setAdapter(emailAdapter);


    }
}