/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

public final class AjioPromotionView
extends LinearLayout {
    public static final int $stable;

    public AjioPromotionView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.init(context);
    }

    public AjioPromotionView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.init(context);
    }

    public AjioPromotionView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.init(context);
    }

    public AjioPromotionView(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3, n4);
        this.init(context);
    }

    private final void init(Context context) {
        context = LayoutInflater.from((Context)context);
        int n3 = R$layout.ajio_promotion_view_layout;
        context.inflate(n3, (ViewGroup)this, true);
    }
}

