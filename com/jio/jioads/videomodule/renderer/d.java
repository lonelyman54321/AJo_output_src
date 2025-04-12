/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
package com.jio.jioads.videomodule.renderer;

import android.widget.TextView;
import com.jio.jioads.videomodule.renderer.e;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements Runnable {
    public final /* synthetic */ e a;

    public /* synthetic */ d(e e2) {
        this.a = e2;
    }

    public final void run() {
        e e2 = this.a;
        Intrinsics.checkNotNullParameter(e2, "$this_run");
        TextView textView = e2.d.L;
        if (textView != null) {
            textView.requestFocus();
        }
    }
}

