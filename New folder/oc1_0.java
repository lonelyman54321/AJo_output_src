/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
import android.graphics.drawable.Drawable;

/*
 * Renamed from oC1
 */
public final class oc1_0
implements Runnable {
    public final /* synthetic */ yc1_1 a;

    public /* synthetic */ oc1_0(yc1_1 yc1_12) {
        this.a = yc1_12;
    }

    public final void run() {
        yc1_1 yc1_12 = this.a;
        Drawable.Callback callback2 = yc1_12.getCallback();
        if (callback2 != null) {
            callback2.invalidateDrawable((Drawable)yc1_12);
        }
    }
}

