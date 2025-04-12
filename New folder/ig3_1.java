/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iG3
 */
public final class ig3_1
implements fg3_0 {
    public final YF3 b;

    public ig3_1(hH3 hH32, YF3 yF3) {
        Intrinsics.checkNotNullParameter(hH32, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(yF3, "windowBackend");
        this.b = yF3;
    }

    public final br2_2 a(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        hg3_2 hg3_22 = new hg3_2(this, (Activity)object, null);
        object = new br2_2(hg3_22);
        return object;
    }
}

