package android.bignerdranch.com;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CrimeActivity extends SingleFragmentActivity{
    // TextView mTextView;      // Làm chơi cho vui
    // Button mButton;          // Làm chơi cho vui

    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}