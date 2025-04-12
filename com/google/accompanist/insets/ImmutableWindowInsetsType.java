/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets;
import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ImmutableWindowInsetsType
implements WindowInsets$Type {
    private final Insets animatedInsets;
    private final float animationFraction;
    private final boolean animationInProgress;
    private final boolean isVisible;
    private final Insets layoutInsets;

    public ImmutableWindowInsetsType() {
        this(null, null, false, false, 0.0f, 31, null);
    }

    public ImmutableWindowInsetsType(Insets insets, Insets insets2, boolean bl2, boolean bl3, float f5) {
        Intrinsics.checkNotNullParameter(insets, "layoutInsets");
        Intrinsics.checkNotNullParameter(insets2, "animatedInsets");
        this.layoutInsets = insets;
        this.animatedInsets = insets2;
        this.isVisible = bl2;
        this.animationInProgress = bl3;
        this.animationFraction = f5;
    }

    public /* synthetic */ ImmutableWindowInsetsType(Insets insets, Insets insets2, boolean bl2, boolean bl3, float f5, int n3, DefaultConstructorMarker object) {
        float f6;
        int n4 = n3 & 1;
        if (n4 != 0) {
            insets = Insets.Companion.getEmpty();
        }
        if ((n4 = n3 & 2) != 0) {
            insets2 = Insets.Companion.getEmpty();
        }
        Insets insets3 = insets2;
        int n7 = n3 & 4;
        boolean bl4 = false;
        boolean bl5 = n7 != 0 ? false : bl2;
        n7 = n3 & 8;
        if (n7 == 0) {
            bl4 = bl3;
        }
        n7 = n3 & 0x10;
        if (n7 != 0) {
            f5 = 0.0f;
            f6 = 0.0f;
        } else {
            f6 = f5;
        }
        insets2 = this;
        boolean bl6 = bl4;
        this(insets, insets3, bl5, bl4, f6);
    }

    public final /* synthetic */ Insets copy(int n3, int n4, int n7, int n8) {
        return di1_0.a(this, n3, n4, n7, n8);
    }

    public Insets getAnimatedInsets() {
        return this.animatedInsets;
    }

    public float getAnimationFraction() {
        return this.animationFraction;
    }

    public boolean getAnimationInProgress() {
        return this.animationInProgress;
    }

    public final /* synthetic */ int getBottom() {
        return kg3_2.a(this);
    }

    public Insets getLayoutInsets() {
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
        return this.isVisible;
    }

    public final /* synthetic */ Insets minus(Insets insets) {
        return di1_0.b(this, insets);
    }

    public final /* synthetic */ Insets plus(Insets insets) {
        return di1_0.c(this, insets);
    }
}

