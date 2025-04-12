/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets;
import com.google.accompanist.insets.MutableInsets;
import com.google.accompanist.insets.MutableWindowInsetsType$animationInProgress$2;
import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.jvm.functions.Function0;

public final class MutableWindowInsetsType
implements WindowInsets$Type {
    private final MutableInsets animatedInsets;
    private final tr1_0 animationFraction$delegate;
    private final ib3_0 animationInProgress$delegate;
    private final tr1_0 isVisible$delegate;
    private final MutableInsets layoutInsets;
    private final tr1_0 ongoingAnimationsCount$delegate;

    public MutableWindowInsetsType() {
        Object object = J83.g(0);
        this.ongoingAnimationsCount$delegate = object;
        this.layoutInsets = object = new MutableInsets(0, 0, 0, 0, 15, null);
        this.animatedInsets = object = new MutableInsets(0, 0, 0, 0, 15, null);
        this.isVisible$delegate = object = J83.g(Boolean.TRUE);
        object = new MutableWindowInsetsType$animationInProgress$2(this);
        this.animationInProgress$delegate = object = J83.e((Function0)object);
        this.animationFraction$delegate = object = J83.g(Float.valueOf(0.0f));
    }

    public static final /* synthetic */ int access$getOngoingAnimationsCount(MutableWindowInsetsType mutableWindowInsetsType) {
        return mutableWindowInsetsType.getOngoingAnimationsCount();
    }

    private final int getOngoingAnimationsCount() {
        return ((Number)this.ongoingAnimationsCount$delegate.getValue()).intValue();
    }

    private final void setOngoingAnimationsCount(int n3) {
        tr1_0 tr1_02 = this.ongoingAnimationsCount$delegate;
        Integer n4 = n3;
        tr1_02.setValue(n4);
    }

    public final /* synthetic */ Insets copy(int n3, int n4, int n7, int n8) {
        return di1_0.a(this, n3, n4, n7, n8);
    }

    public MutableInsets getAnimatedInsets() {
        return this.animatedInsets;
    }

    public float getAnimationFraction() {
        return ((Number)this.animationFraction$delegate.getValue()).floatValue();
    }

    public boolean getAnimationInProgress() {
        return (Boolean)this.animationInProgress$delegate.getValue();
    }

    public final /* synthetic */ int getBottom() {
        return kg3_2.a(this);
    }

    public MutableInsets getLayoutInsets() {
        return this.layoutInsets;
    }

    public final /* synthetic */ int getLeft() {
        return kg3_2.b(this);
    }

    public final /* synthetic */ int getRight() {
        return kg3_2.c(this);
    }

    public final /* synthetic */ int getTop() {
        return kg3_2.d(this);
    }

    public boolean isVisible() {
        return (Boolean)this.isVisible$delegate.getValue();
    }

    public final /* synthetic */ Insets minus(Insets insets) {
        return di1_0.b(this, insets);
    }

    public final void onAnimationEnd() {
        int n3 = this.getOngoingAnimationsCount() + -1;
        this.setOngoingAnimationsCount(n3);
        n3 = this.getOngoingAnimationsCount();
        if (n3 == 0) {
            ((MutableInsets)this.getAnimatedInsets()).reset();
            n3 = 0;
            this.setAnimationFraction(0.0f);
        }
    }

    public final void onAnimationStart() {
        int n3 = this.getOngoingAnimationsCount() + 1;
        this.setOngoingAnimationsCount(n3);
    }

    public final /* synthetic */ Insets plus(Insets insets) {
        return di1_0.c(this, insets);
    }

    public void setAnimationFraction(float f5) {
        tr1_0 tr1_02 = this.animationFraction$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public void setVisible(boolean bl2) {
        tr1_0 tr1_02 = this.isVisible$delegate;
        Boolean bl3 = bl2;
        tr1_02.setValue(bl3);
    }
}

