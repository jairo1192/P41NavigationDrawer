package com.example.p41navigationdrawer.ui.ejemplo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EjemploViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EjemploViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ejemplo fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}