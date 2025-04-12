/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 *  android.view.animation.ScaleAnimation
 *  android.widget.FrameLayout
 */
package com.ril.ajio.fleek.stories.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar$a;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar$b;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar$c;
import kotlin.jvm.internal.Intrinsics;

public final class PausableProgressBar
extends FrameLayout {
    public static final PausableProgressBar$b Companion;
    public final View a;
    public final View b;
    public xn2 c;
    public long d;
    public PausableProgressBar$a e;
    public boolean f;

    static {
        PausableProgressBar$b pausableProgressBar$b;
        Companion = pausableProgressBar$b = new Object();
    }

    public PausableProgressBar(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 6, 0);
    }

    public PausableProgressBar(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 4, 0);
    }

    public PausableProgressBar(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.d = 4000L;
        context = LayoutInflater.from((Context)context);
        int n4 = R$layout.pausable_progress;
        context.inflate(n4, (ViewGroup)this);
        int n7 = R$id.front_progress;
        context = this.findViewById(n7);
        this.a = context;
        n7 = R$id.max_progress;
        context = this.findViewById(n7);
        this.b = context;
    }

    public /* synthetic */ PausableProgressBar(Context context, AttributeSet attributeSet, int n3, int n4) {
        if ((n3 &= 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, 0);
    }

    /*
     * WARNING - void declaration
     */
    public final void a(boolean bl2) {
        void var1_4;
        Object object;
        View view = this.b;
        if (bl2) {
            Intrinsics.checkNotNull(view);
            int n3 = R$color.progress_max_active;
            view.setBackgroundResource(n3);
        }
        Intrinsics.checkNotNull(view);
        if (bl2) {
            boolean bl3 = false;
            object = null;
        } else {
            int n4 = 8;
        }
        view.setVisibility((int)var1_4);
        object = this.c;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            view = null;
            object.setAnimationListener(null);
            object = this.c;
            Intrinsics.checkNotNull(object);
            object.cancel();
            object = this.e;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object.b();
            }
        }
    }

    public final void b() {
        Object object = this.b;
        Intrinsics.checkNotNull(object);
        int n3 = 8;
        object.setVisibility(n3);
        long l2 = this.d;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 <= 0) {
            this.d = l2 = 4000L;
        }
        object = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 0, 0.0f, 1, 0.0f);
        this.c = object;
        Intrinsics.checkNotNull(object);
        long l7 = this.d;
        object.setDuration(l7);
        object = this.c;
        Intrinsics.checkNotNull(object);
        Object object2 = new LinearInterpolator();
        object.setInterpolator((Interpolator)object2);
        object = this.c;
        Intrinsics.checkNotNull(object);
        object2 = new PausableProgressBar$c(this);
        object.setAnimationListener((Animation.AnimationListener)object2);
        object = this.c;
        Intrinsics.checkNotNull(object);
        object.setFillAfter(true);
        object = this.a;
        Intrinsics.checkNotNull(object);
        object2 = this.c;
        object.startAnimation((Animation)object2);
    }

    public final void setCallback(PausableProgressBar$a pausableProgressBar$a) {
        Intrinsics.checkNotNullParameter(pausableProgressBar$a, "callback");
        this.e = pausableProgressBar$a;
    }

    public final void setDuration(long l2) {
        this.d = l2;
        xn2 xn22 = this.c;
        if (xn22 != null) {
            xn22 = null;
            this.c = null;
            this.b();
        }
    }

    public final void setMax() {
        this.a(true);
    }

    public final void setMaxWithoutCallback() {
        Object object = this.b;
        Intrinsics.checkNotNull(object);
        int n3 = R$color.progress_max_active;
        object.setBackgroundResource(n3);
        Intrinsics.checkNotNull(object);
        n3 = 0;
        object.setVisibility(0);
        object = this.c;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            n3 = 0;
            object.setAnimationListener(null);
            object = this.c;
            Intrinsics.checkNotNull(object);
            object.cancel();
        }
    }

    public final void setMin() {
        this.a(false);
    }

    public final void setMinWithoutCallback() {
        Object object = this.b;
        Intrinsics.checkNotNull(object);
        int n3 = R$color.progress_secondary;
        object.setBackgroundResource(n3);
        Intrinsics.checkNotNull(object);
        n3 = 0;
        object.setVisibility(0);
        object = this.c;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            n3 = 0;
            object.setAnimationListener(null);
            object = this.c;
            Intrinsics.checkNotNull(object);
            object.cancel();
        }
    }
}

