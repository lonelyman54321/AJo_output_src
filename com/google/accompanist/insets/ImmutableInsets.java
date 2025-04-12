/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ImmutableInsets
implements Insets {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public ImmutableInsets() {
        this(0, 0, 0, 0, 15, null);
    }

    public ImmutableInsets(int n3, int n4, int n7, int n8) {
        this.left = n3;
        this.top = n4;
        this.right = n7;
        this.bottom = n8;
    }

    public /* synthetic */ ImmutableInsets(int n3, int n4, int n7, int n8, int n10, DefaultConstructorMarker defaultConstructorMarker) {
        int n14 = n10 & 1;
        if (n14 != 0) {
            n3 = 0;
        }
        if ((n14 = n10 & 2) != 0) {
            n4 = 0;
        }
        if ((n14 = n10 & 4) != 0) {
            n7 = 0;
        }
        if ((n10 &= 8) != 0) {
            n8 = 0;
        }
        this(n3, n4, n7, n8);
    }

    public final /* synthetic */ Insets copy(int n3, int n4, int n7, int n8) {
        return di1_0.a(this, n3, n4, n7, n8);
    }

    public int getBottom() {
        return this.bottom;
    }

    public int getLeft() {
        return this.left;
    }

    public int getRight() {
        return this.right;
    }

    public int getTop() {
        return this.top;
    }

    public final /* synthetic */ Insets minus(Insets insets) {
        return di1_0.b(this, insets);
    }

    public final /* synthetic */ Insets plus(Insets insets) {
        return di1_0.c(this, insets);
    }
}

