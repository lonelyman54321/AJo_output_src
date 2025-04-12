/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Spatializer
 *  android.media.Spatializer$OnSpatializerStateChangedListener
 */
import android.media.Spatializer;
import com.google.android.gms.internal.ads.zzyv;
import java.util.concurrent.Executor;

/*
 * Renamed from nL3
 */
public final class nl3_1 {
    public static /* bridge */ /* synthetic */ void a(Spatializer spatializer, zzyv zzyv2, Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener) {
        spatializer.addOnSpatializerStateChangedListener((Executor)zzyv2, onSpatializerStateChangedListener);
    }
}

