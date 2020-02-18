package bask.app.pubgrehberi.ui.Haritalar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HaritalarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HaritalarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Burası Haritalar Kısmı");
    }

    public LiveData<String> getText() {
        return mText;
    }
}