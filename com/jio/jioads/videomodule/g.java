/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.TextView
 */
package com.jio.jioads.videomodule;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.videomodule.p;
import com.jio.jioads.videomodule.renderer.f;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class g
implements View.OnFocusChangeListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ s b;

    public /* synthetic */ g(s s7, f f5) {
        this.a = f5;
        this.b = s7;
    }

    public final void onFocusChange(View object, boolean bl2) {
        f f5 = this.a;
        Intrinsics.checkNotNullParameter(f5, "$holder");
        object = "this$0";
        s s7 = this.b;
        Intrinsics.checkNotNullParameter(s7, (String)object);
        if (bl2 && (object = f5.N) != null) {
            boolean bl3;
            Object object2;
            object = f5.L;
            if (object != null) {
                int n3 = 8;
                object.setVisibility(n3);
            }
            object = f5.N;
            if (object != null) {
                boolean bl4 = false;
                object2 = null;
                object.setVisibility(0);
            }
            object = f5.N;
            if (object != null) {
                object2 = new p(f5);
                object.setOnFocusChangeListener((View.OnFocusChangeListener)object2);
            }
            object = s7.N;
            if (object == null && !(bl3 = j_0.l((Context)(object2 = (object = s7.d).Y()))) && (object = object.K()) == (object2 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                object = f5.L;
                boolean bl5 = false;
                object2 = null;
                object = object != null ? object.getLayoutParams() : null;
                int n4 = -1;
                if (object != null) {
                    object.width = n4;
                }
                TextView textView = f5.L;
                if (textView != null) {
                    textView.setLayoutParams((ViewGroup.LayoutParams)object);
                }
                object = f5.N;
                if (object != null) {
                    object2 = object.getLayoutParams();
                }
                if (object2 != null) {
                    ((ViewGroup.LayoutParams)object2).width = n4;
                }
                object = f5.N;
                if (object != null) {
                    object.setLayoutParams((ViewGroup.LayoutParams)object2);
                }
            }
            if ((object = f5.N) != null) {
                object.requestFocus();
            }
        }
    }
}

