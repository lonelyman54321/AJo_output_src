/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Spatializer
 *  android.media.Spatializer$OnSpatializerStateChangedListener
 */
import android.media.Spatializer;

public final class Hn0
implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ zn0 a;

    public Hn0(zn0 zn02) {
        this.a = zn02;
    }

    public final void onSpatializerAvailableChanged(Spatializer object, boolean bl2) {
        object = this.a;
        ((zn0)object).k();
    }

    public final void onSpatializerEnabledChanged(Spatializer object, boolean bl2) {
        object = this.a;
        ((zn0)object).k();
    }
}

