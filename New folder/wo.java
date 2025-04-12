/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

public final class wo {
    public final xo_0 a;
    public final Activity b;

    public wo(xo_0 xo_02, Activity activity) {
        Intrinsics.checkNotNullParameter(xo_02, "appUpdateListener");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = xo_02;
        this.b = activity;
    }
}

