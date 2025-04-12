/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 */
package com.jio.jioads.webviewhandler;

import android.view.View;
import com.jio.jioads.webviewhandler.InAppWebView;
import com.jio.jioads.webviewhandler.b;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements View.OnFocusChangeListener {
    public final /* synthetic */ InAppWebView a;

    public /* synthetic */ a(InAppWebView inAppWebView) {
        this.a = inAppWebView;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        InAppWebView inAppWebView = this.a;
        Intrinsics.checkNotNullParameter((Object)inAppWebView, (String)object);
        if (bl2) {
            b b2;
            object = inAppWebView.a;
            if (object != null) {
                int n3 = 8;
                object.setVisibility(n3);
            }
            object = inAppWebView.b;
            if (object != null) {
                boolean bl3 = false;
                b2 = null;
                object.setVisibility(0);
            }
            object = inAppWebView.b;
            if (object != null) {
                b2 = new b(inAppWebView);
                object.setOnFocusChangeListener((View.OnFocusChangeListener)b2);
            }
            object = inAppWebView.b;
            if (object != null) {
                object.setOnClickListener((View.OnClickListener)inAppWebView);
            }
            if ((object = inAppWebView.b) != null) {
                object.requestFocus();
            }
            if ((object = inAppWebView.b) != null) {
                object.bringToFront();
            }
        }
    }
}

