package bask.app.pubgrehberi.ui.Hakkımızda;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HakkimizdeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HakkimizdeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Burası Hakkımızda Kısmı");
    }

    public LiveData<String> getText() {
        return mText;
    }
}