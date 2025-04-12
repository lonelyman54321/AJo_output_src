/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public final class B43$b {
    public final Activity a;
    public final Executor b;
    public final p60_0 c;
    public gH3 d;

    public B43$b(Activity activity, jl1_0 jl1_02, gg3_0 gg3_02) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(jl1_02, "executor");
        Intrinsics.checkNotNullParameter(gg3_02, "callback");
        this.a = activity;
        this.b = jl1_02;
        this.c = gg3_02;
    }
}

