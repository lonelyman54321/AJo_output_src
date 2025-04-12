/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.webkit.WebView
 */
package com.ril.ajio.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.ril.ajio.web.AjioCustomWebView$a;
import kotlin.jvm.internal.Intrinsics;

public final class AjioCustomWebView
extends WebView {
    public static final AjioCustomWebView$a Companion;

    static {
        AjioCustomWebView$a ajioCustomWebView$a;
        Companion = ajioCustomWebView$a = new Object();
    }

    public AjioCustomWebView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Companion.getClass();
        context = AjioCustomWebView$a.a(context);
        super(context);
    }

    public AjioCustomWebView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        Companion.getClass();
        context = AjioCustomWebView$a.a(context);
        super(context, attributeSet);
    }

    public AjioCustomWebView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        Companion.getClass();
        context = AjioCustomWebView$a.a(context);
        super(context, attributeSet, n3);
    }

    public final void onOverScrolled(int n3, int n4, boolean bl2, boolean bl3) {
        if (n4 == 0) {
            boolean bl4 = false;
            this.requestDisallowInterceptTouchEvent(false);
        } else {
            boolean bl5 = true;
            this.requestDisallowInterceptTouchEvent(bl5);
        }
        super.onOverScrolled(n3, n4, bl2, bl3);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}

