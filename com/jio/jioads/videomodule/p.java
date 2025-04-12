/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.TextView
 */
package com.jio.jioads.videomodule;

import android.view.View;
import android.widget.TextView;
import com.jio.jioads.videomodule.renderer.f;
import kotlin.jvm.internal.Intrinsics;

public final class p
implements View.OnFocusChangeListener {
    public final /* synthetic */ f a;

    public /* synthetic */ p(f f5) {
        this.a = f5;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "$holder";
        f f5 = this.a;
        Intrinsics.checkNotNullParameter(f5, (String)object);
        int n3 = 8;
        if (!bl2) {
            TextView textView = f5.N;
            if (textView != null) {
                textView.setVisibility(n3);
            }
            object = f5.L;
            if (object != null) {
                bl2 = false;
                textView = null;
                object.setVisibility(0);
            }
        } else {
            TextView textView = f5.L;
            if (textView != null) {
                textView.setVisibility(n3);
            }
        }
    }
}

