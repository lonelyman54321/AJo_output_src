/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.webkit.WebView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.ril.ajio.customviews.widgets.PeAjioCustomWebView$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class PeAjioCustomWebView
extends WebView {
    public static final int $stable;
    public static final PeAjioCustomWebView$Companion Companion;

    static {
        PeAjioCustomWebView$Companion peAjioCustomWebView$Companion;
        Companion = peAjioCustomWebView$Companion = new PeAjioCustomWebView$Companion(null);
    }

    public PeAjioCustomWebView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context = Companion.getFixedContext(context);
        super(context);
    }

    public PeAjioCustomWebView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        context = Companion.getFixedContext(context);
        super(context, attributeSet);
    }

    public PeAjioCustomWebView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        context = Companion.getFixedContext(context);
        super(context, attributeSet, n3);
    }

    public PeAjioCustomWebView(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        context = Companion.getFixedContext(context);
        super(context, attributeSet, n3, n4);
    }
}

