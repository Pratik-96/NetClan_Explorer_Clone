package com.example.netclanexplorerclone;

import static java.lang.System.in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.netclanexplorerclone.adapters.Adapter;
import com.example.netclanexplorerclone.adapters.PersonalAdapter;
import com.example.netclanexplorerclone.databinding.ActivityMainBinding;
import com.example.netclanexplorerclone.fragments.Businesses;
import com.example.netclanexplorerclone.fragments.Personal;
import com.example.netclanexplorerclone.fragments.Services;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());



        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.tabLayout.setupWithViewPager(binding.viewPager);

        Adapter adapter = new Adapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new Personal(),"Personal");
        adapter.addFragment(new Services(),"Services");
        adapter.addFragment(new Businesses(),"Businesses");
        binding.viewPager.setAdapter(adapter);

        binding.refine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, refine.class));
            }
        });





    }
}