/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
package com.jio.jioads.videomodule;

import android.view.View;
import com.jio.jioads.videomodule.r;
import com.jio.jioads.videomodule.renderer.f;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class j
implements View.OnFocusChangeListener {
    public final /* synthetic */ s a;
    public final /* synthetic */ f b;

    public /* synthetic */ j(s s7, f f5) {
        this.a = s7;
        this.b = f5;
    }

    public final void onFocusChange(View object, boolean bl2) {
        int n3;
        s s7 = this.a;
        Intrinsics.checkNotNullParameter(s7, "this$0");
        object = "$holder";
        f f5 = this.b;
        Intrinsics.checkNotNullParameter(f5, (String)object);
        if (bl2 && (n3 = s7.S) == 0 && (object = f5.t) != null) {
            r r5;
            object = f5.w;
            if (object != null) {
                int n4 = 8;
                object.setVisibility(n4);
            }
            object = f5.t;
            if (object != null) {
                boolean bl3 = false;
                r5 = null;
                object.setVisibility(0);
            }
            object = f5.t;
            if (object != null) {
                r5 = new r(f5);
                object.setOnFocusChangeListener((View.OnFocusChangeListener)r5);
            }
            object = f5.t;
            if (object != null) {
                object.requestFocus();
            }
        }
    }
}

