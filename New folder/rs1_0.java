/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/*
 * Renamed from rs1
 */
public final class rs1_0
implements cs2_0,
Cs2$a,
ws1$a {
    public final Object a;
    public final ws1_0 b;
    public final ParcelableSnapshotMutableIntState c;
    public final ParcelableSnapshotMutableIntState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;

    public rs1_0(Object object, ws1_0 object2) {
        this.a = object;
        this.b = object2;
        this.c = object = Pv2.b(-1);
        this.d = object = Pv2.b(0);
        this.e = object2 = J83.g(null);
        this.f = object = J83.g(null);
    }

    public final rs1_0 a() {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.d;
        int n3 = parcelableSnapshotMutableIntState.o();
        if (n3 == 0) {
            this.b.a.add(this);
            cs2_0 cs2_02 = (cs2_0)this.f.getValue();
            if (cs2_02 != null) {
                cs2_02 = cs2_02.a();
            } else {
                n3 = 0;
                cs2_02 = null;
            }
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.e;
            parcelableSnapshotMutableState.setValue(cs2_02);
        }
        n3 = parcelableSnapshotMutableIntState.o() + 1;
        parcelableSnapshotMutableIntState.e(n3);
        return this;
    }

    public final int getIndex() {
        return this.c.o();
    }

    public final Object getKey() {
        return this.a;
    }

    public final void release() {
        Object object = this.d;
        int n3 = ((e83_0)object).o();
        if (n3 > 0) {
            n3 = ((e83_0)object).o() + -1;
            ((e83_0)object).e(n3);
            int n4 = ((e83_0)object).o();
            if (n4 == 0) {
                this.b.a.remove(this);
                object = this.e;
                Cs2$a cs2$a = (Cs2$a)((h83_0)object).getValue();
                if (cs2$a != null) {
                    cs2$a.release();
                }
                n3 = 0;
                cs2$a = null;
                ((h83_0)object).setValue(null);
            }
            return;
        }
        String string2 = "Release should only be called once".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

