/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 */
package in.juspay.hypersdk.core;

import android.animation.ObjectAnimator;
import in.juspay.hypersdk.core.AndroidInterface;

public final class r
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ ObjectAnimator b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ r(AndroidInterface androidInterface, ObjectAnimator objectAnimator, String string2, String string3) {
        this.a = androidInterface;
        this.b = objectAnimator;
        this.c = string2;
        this.d = string3;
    }

    public final void run() {
        String string2 = this.c;
        String string3 = this.d;
        AndroidInterface androidInterface = this.a;
        ObjectAnimator objectAnimator = this.b;
        AndroidInterface.a(androidInterface, objectAnimator, string2, string3);
    }
}

