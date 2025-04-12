/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

public final class AjioLoaderView
extends FrameLayout {
    public static final int $stable = 8;
    private LottieAnimationView animationView;

    public AjioLoaderView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.initLayout(context);
    }

    public AjioLoaderView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.initLayout(context);
    }

    public AjioLoaderView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.initLayout(context);
    }

    public AjioLoaderView(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3, n4);
        this.initLayout(context);
    }

    private final void initLayout(Context object) {
        int n3 = R$layout.loader_layout_lottie_anim;
        object = View.inflate((Context)object, (int)n3, (ViewGroup)this);
        n3 = R$id.loader_lottie_anim_view;
        object = (LottieAnimationView)object.findViewById(n3);
        this.animationView = object;
    }

    public final void startLoader() {
        this.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.animationView;
        Intrinsics.checkNotNull((Object)lottieAnimationView);
        lottieAnimationView.f();
    }

    public final void stopLoader() {
        this.setVisibility(8);
        LottieAnimationView lottieAnimationView = this.animationView;
        Intrinsics.checkNotNull((Object)lottieAnimationView);
        lottieAnimationView.i = false;
        lottieAnimationView.e.l();
    }
}

