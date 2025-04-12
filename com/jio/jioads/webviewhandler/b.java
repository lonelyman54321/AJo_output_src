/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
package com.jio.jioads.webviewhandler;

import android.view.View;
import com.jio.jioads.webviewhandler.InAppWebView;
import kotlin.jvm.internal.Intrinsics;

public final class b
implements View.OnFocusChangeListener {
    public final /* synthetic */ InAppWebView a;

    public /* synthetic */ b(InAppWebView inAppWebView) {
        this.a = inAppWebView;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        InAppWebView inAppWebView = this.a;
        Intrinsics.checkNotNullParameter((Object)inAppWebView, (String)object);
        if (!bl2) {
            object = inAppWebView.b;
            if (object != null) {
                int n3 = 8;
                object.setVisibility(n3);
            }
            object = inAppWebView.a;
            if (object != null) {
                boolean bl3 = false;
                object.setVisibility(0);
            }
        }
    }
}

