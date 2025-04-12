/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ComponentActivity$i
extends Lambda
implements Function0 {
    public final /* synthetic */ ComponentActivity c;

    public ComponentActivity$i(ComponentActivity componentActivity) {
        this.c = componentActivity;
        super(0);
    }

    public final Object invoke() {
        ComponentActivity componentActivity = this.c;
        Object object = null;
        d10 d102 = new d10(componentActivity, 0);
        d82_0 d82_02 = new d82_0(d102);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            d102 = Looper.myLooper();
            n3 = (int)(Intrinsics.areEqual(d102, object = Looper.getMainLooper()) ? 1 : 0);
            if (n3 == 0) {
                object = Looper.getMainLooper();
                d102 = new Handler(object);
                object = new e10(componentActivity, d82_02);
                d102.post((Runnable)object);
            } else {
                ComponentActivity.access$addObserverForBackInvoker(componentActivity, d82_02);
            }
        }
        return d82_02;
    }
}

