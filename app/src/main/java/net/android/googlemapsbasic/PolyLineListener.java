package net.android.googlemapsbasic;

import com.google.android.gms.maps.model.PolylineOptions;
public interface PolyLineListener {

    void whenDone(PolylineOptions output);

    void whenFail(String statusCode);
}
