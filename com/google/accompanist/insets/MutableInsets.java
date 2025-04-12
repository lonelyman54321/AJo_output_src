/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.accompanist.insets.Insets;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MutableInsets
implements Insets {
    private final tr1_0 bottom$delegate;
    private final tr1_0 left$delegate;
    private final tr1_0 right$delegate;
    private final tr1_0 top$delegate;

    public MutableInsets() {
        this(0, 0, 0, 0, 15, null);
    }

    public MutableInsets(int n3, int n4, int n7, int n8) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = J83.g(n3);
        this.left$delegate = parcelableSnapshotMutableState;
        parcelableSnapshotMutableState = J83.g(n4);
        this.top$delegate = parcelableSnapshotMutableState;
        parcelableSnapshotMutableState = J83.g(n7);
        this.right$delegate = parcelableSnapshotMutableState;
        parcelableSnapshotMutableState = J83.g(n8);
        this.bottom$delegate = parcelableSnapshotMutableState;
    }

    public /* synthetic */ MutableInsets(int n3, int n4, int n7, int n8, int n10, DefaultConstructorMarker defaultConstructorMarker) {
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
        return ((Number)this.bottom$delegate.getValue()).intValue();
    }

    public int getLeft() {
        return ((Number)this.left$delegate.getValue()).intValue();
    }

    public int getRight() {
        return ((Number)this.right$delegate.getValue()).intValue();
    }

    public int getTop() {
        return ((Number)this.top$delegate.getValue()).intValue();
    }

    public final /* synthetic */ Insets minus(Insets insets) {
        return di1_0.b(this, insets);
    }

    public final /* synthetic */ Insets plus(Insets insets) {
        return di1_0.c(this, insets);
    }

    public final void reset() {
        this.setLeft(0);
        this.setTop(0);
        this.setRight(0);
        this.setBottom(0);
    }

    public void setBottom(int n3) {
        tr1_0 tr1_02 = this.bottom$delegate;
        Integer n4 = n3;
        tr1_02.setValue(n4);
    }

    public void setLeft(int n3) {
        tr1_0 tr1_02 = this.left$delegate;
        Integer n4 = n3;
        tr1_02.setValue(n4);
    }

    public void setRight(int n3) {
        tr1_0 tr1_02 = this.right$delegate;
        Integer n4 = n3;
        tr1_02.setValue(n4);
    }

    public void setTop(int n3) {
        tr1_0 tr1_02 = this.top$delegate;
        Integer n4 = n3;
        tr1_02.setValue(n4);
    }
}

