package bask.app.pubgrehberi.ui.Silahlar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class silahlarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public silahlarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Burası Silahlar Kısmı");
    }

    public LiveData<String> getText() {
        return mText;
    }
}