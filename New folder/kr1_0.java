/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import java.io.Serializable;

/*
 * Renamed from kr1
 */
public final class kr1_0 {
    public final ParcelableSnapshotMutableIntState a;
    public final ParcelableSnapshotMutableIntState b;
    public boolean c;
    public Object d;
    public final is1_0 e;

    public kr1_0(int n3, int n4) {
        ib3_0 ib3_02;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        this.a = parcelableSnapshotMutableIntState = Pv2.b(n3);
        this.b = ib3_02 = Pv2.b(n4);
        super(n3, 90, 200);
        this.e = ib3_02;
    }

    public final void a(int n3, int n4) {
        float f5 = n3;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object >= 0) {
            this.a.e(n3);
            this.e.d(n3);
            this.b.e(n4);
            return;
        }
        Serializable serializable = new StringBuilder("Index should be non-negative (");
        serializable.append(n3);
        serializable.append(')');
        String string2 = serializable.toString();
        string2 = string2.toString();
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }
}

