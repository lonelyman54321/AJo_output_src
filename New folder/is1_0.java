/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/*
 * Renamed from is1
 */
public final class is1_0
implements ib3_0 {
    public final int a;
    public final int b;
    public final ParcelableSnapshotMutableState c;
    public int d;

    public is1_0(int n3, int n4, int n7) {
        this.a = n4;
        this.b = n7;
        int n8 = n3 / n4 * n4;
        int n10 = Math.max(n8 - n7, 0);
        n8 = n8 + n4 + n7;
        Object object = f.m(n10, n8);
        J83.l();
        qi_2 qi_22 = qi_2.b;
        this.c = object = J83.f(object, qi_22);
        this.d = n3;
    }

    public final void d(int n3) {
        int n4 = this.d;
        if (n3 != n4) {
            this.d = n3;
            n4 = this.a;
            n3 = n3 / n4 * n4;
            int n7 = this.b;
            int n8 = Math.max(n3 - n7, 0);
            n3 = n3 + n4 + n7;
            IntRange intRange = f.m(n8, n3);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.c;
            parcelableSnapshotMutableState.setValue(intRange);
        }
    }

    public final Object getValue() {
        return (IntRange)this.c.getValue();
    }
}

