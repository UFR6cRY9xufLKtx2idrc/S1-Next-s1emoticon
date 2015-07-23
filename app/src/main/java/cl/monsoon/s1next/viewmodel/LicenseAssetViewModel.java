package cl.monsoon.s1next.viewmodel;

import android.databinding.ObservableField;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;

public final class LicenseAssetViewModel {

    public final ObservableField<CharSequence> filePath = new ObservableField<>();

    public LicenseAssetViewModel(CharSequence filePath) {
        this.filePath.set(filePath);
    }

    public MovementMethod getScrollingMovementMethod() {
        return ScrollingMovementMethod.getInstance();
    }
}