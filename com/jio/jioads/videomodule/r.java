/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.jio.jioads.videomodule;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jio.jioads.videomodule.renderer.f;
import kotlin.jvm.internal.Intrinsics;

public final class r
implements View.OnFocusChangeListener {
    public final /* synthetic */ f a;

    public /* synthetic */ r(f f5) {
        this.a = f5;
    }

    public final void onFocusChange(View view, boolean bl2) {
        f f5 = this.a;
        Intrinsics.checkNotNullParameter(f5, "$holder");
        view = null;
        int n3 = 8;
        if (!bl2) {
            TextView textView = f5.t;
            if (textView != null) {
                textView.setVisibility(n3);
            }
            textView = f5.w;
            if (textView != null) {
                textView.setVisibility(0);
            }
            view = f5.i;
            if (view != null) {
                view.setVisibility(n3);
            }
        } else {
            RelativeLayout relativeLayout = f5.i;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(n3);
            }
            relativeLayout = f5.w;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(n3);
            }
            relativeLayout = f5.t;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        }
    }
}

