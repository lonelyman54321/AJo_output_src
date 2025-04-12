/*
 * Decompiled with CFR 0.152.
 */
package com.airbnb.lottie.compose;

import kotlin.jvm.internal.Intrinsics;

public final class LottieAnimationSizeElement
extends up1_0 {
    public final int b;
    public final int c;

    public LottieAnimationSizeElement(int n3, int n4) {
        this.b = n3;
        this.c = n4;
    }

    public final LP1$c b() {
        int n3;
        KB1 kB1 = new LP1$c();
        kB1.n = n3 = this.b;
        kB1.o = n3 = this.c;
        return kB1;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof LottieAnimationSizeElement;
        if (n3 == 0) {
            return false;
        }
        object = (LottieAnimationSizeElement)object;
        int n4 = this.b;
        n3 = ((LottieAnimationSizeElement)object).b;
        if (n4 != n3) {
            return false;
        }
        n3 = this.c;
        int n7 = ((LottieAnimationSizeElement)object).c;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.b * 31;
        int n4 = this.c;
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        int n3;
        lP1$c = (KB1)lP1$c;
        Intrinsics.checkNotNullParameter(lP1$c, "node");
        ((KB1)lP1$c).n = n3 = this.b;
        ((KB1)lP1$c).o = n3 = this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LottieAnimationSizeElement(width=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", height=");
        return g30.a(this.c, ")", stringBuilder);
    }
}

