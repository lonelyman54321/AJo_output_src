/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class VR1
extends Mr3 {
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;

    public VR1(Object object) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.b = parcelableSnapshotMutableState = J83.g(object);
        this.c = object = J83.g(object);
    }

    public final Object a() {
        return this.b.getValue();
    }

    public final Object b() {
        return this.c.getValue();
    }

    public final void c(Object object) {
        this.b.setValue(object);
    }

    public final void d(gr3 gr32) {
    }

    public final void e() {
    }
}

