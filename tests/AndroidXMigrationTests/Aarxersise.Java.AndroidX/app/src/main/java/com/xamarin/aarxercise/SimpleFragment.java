package com.xamarin.aarxercise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.legacy.widget.Space;

public class SimpleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.simplefragment, container, false);
    }

    public Fragment getSomething() {
        return null;
    }

    public Space getAnotherThing() {
        return null;
    }

    public void setSomething(Fragment fragment) {
    }
}
