/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class Slingshot {
    public static final int $stable;
    private final tr1_0 arrowScale$delegate;
    private final tr1_0 endTrim$delegate;
    private final tr1_0 offset$delegate;
    private final tr1_0 rotation$delegate;
    private final tr1_0 startTrim$delegate;

    public Slingshot() {
        Object object = J83.g(0);
        this.offset$delegate = object;
        object = Float.valueOf(0.0f);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = J83.g(object);
        this.startTrim$delegate = parcelableSnapshotMutableState;
        parcelableSnapshotMutableState = J83.g(object);
        this.endTrim$delegate = parcelableSnapshotMutableState;
        parcelableSnapshotMutableState = J83.g(object);
        this.rotation$delegate = parcelableSnapshotMutableState;
        this.arrowScale$delegate = object = J83.g(object);
    }

    public final float getArrowScale() {
        return ((Number)this.arrowScale$delegate.getValue()).floatValue();
    }

    public final float getEndTrim() {
        return ((Number)this.endTrim$delegate.getValue()).floatValue();
    }

    public final int getOffset() {
        return ((Number)this.offset$delegate.getValue()).intValue();
    }

    public final float getRotation() {
        return ((Number)this.rotation$delegate.getValue()).floatValue();
    }

    public final float getStartTrim() {
        return ((Number)this.startTrim$delegate.getValue()).floatValue();
    }

    public final void setArrowScale(float f5) {
        tr1_0 tr1_02 = this.arrowScale$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public final void setEndTrim(float f5) {
        tr1_0 tr1_02 = this.endTrim$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public final void setOffset(int n3) {
        tr1_0 tr1_02 = this.offset$delegate;
        Integer n4 = n3;
        tr1_02.setValue(n4);
    }

    public final void setRotation(float f5) {
        tr1_0 tr1_02 = this.rotation$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public final void setStartTrim(float f5) {
        tr1_0 tr1_02 = this.startTrim$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }
}

