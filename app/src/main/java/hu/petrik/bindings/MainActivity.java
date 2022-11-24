package hu.petrik.bindings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hu.petrik.bindings.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //        binding.submit.setOnClickListener(view -> {
        //         String text = binding.input.getText().toString().trim();
        //        binding.setText(text);
        //     });
    }
}