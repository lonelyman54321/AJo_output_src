/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.CalculatedWindowInsetsType$animatedInsets$2;
import com.google.accompanist.insets.CalculatedWindowInsetsType$animationFraction$2;
import com.google.accompanist.insets.CalculatedWindowInsetsType$animationInProgress$2;
import com.google.accompanist.insets.CalculatedWindowInsetsType$isVisible$2;
import com.google.accompanist.insets.CalculatedWindowInsetsType$layoutInsets$2;
import com.google.accompanist.insets.Insets;
import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class CalculatedWindowInsetsType
implements WindowInsets$Type {
    private final ib3_0 animatedInsets$delegate;
    private final ib3_0 animationFraction$delegate;
    private final ib3_0 animationInProgress$delegate;
    private final ib3_0 isVisible$delegate;
    private final ib3_0 layoutInsets$delegate;

    public CalculatedWindowInsetsType(WindowInsets$Type ... object) {
        Intrinsics.checkNotNullParameter(object, "types");
        Object object2 = new CalculatedWindowInsetsType$layoutInsets$2((WindowInsets$Type[])object);
        this.layoutInsets$delegate = object2 = J83.e((Function0)object2);
        object2 = new CalculatedWindowInsetsType$animatedInsets$2((WindowInsets$Type[])object);
        this.animatedInsets$delegate = object2 = J83.e((Function0)object2);
        object2 = new CalculatedWindowInsetsType$isVisible$2((WindowInsets$Type[])object);
        this.isVisible$delegate = object2 = J83.e((Function0)object2);
        object2 = new CalculatedWindowInsetsType$animationInProgress$2((WindowInsets$Type[])object);
        this.animationInProgress$delegate = object2 = J83.e((Function0)object2);
        object2 = new CalculatedWindowInsetsType$animationFraction$2((WindowInsets$Type[])object);
        this.animationFraction$delegate = object = J83.e((Function0)object2);
    }

    public final /* synthetic */ Insets copy(int n3, int n4, int n7, int n8) {
        return di1_0.a(this, n3, n4, n7, n8);
    }

    public Insets getAnimatedInsets() {
        return (Insets)this.animatedInsets$delegate.getValue();
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

    public Insets getLayoutInsets() {
        return (Insets)this.layoutInsets$delegate.getValue();
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

    public final /* synthetic */ Insets plus(Insets insets) {
        return di1_0.c(this, insets);
    }
}

