/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 */
import android.animation.TimeInterpolator;
import in.juspay.hypersdk.core.InflateView;

/*
 * Renamed from ch1
 */
public final class ch1_2
implements TimeInterpolator {
    public final /* synthetic */ float[] a;

    public /* synthetic */ ch1_2(float[] fArray) {
        this.a = fArray;
    }

    public final float getInterpolation(float f5) {
        float[] fArray = this.a;
        return InflateView.a(f5, fArray);
    }
}

