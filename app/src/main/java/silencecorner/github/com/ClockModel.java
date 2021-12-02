package silencecorner.github.com;

import android.databinding.ObservableField;

public class ClockModel {
    public ObservableField<String> getTime() {
        return time;
    }

    public void setTime(ObservableField<String> time) {
        this.time = time;
    }

    public ObservableField<String> time;
}
