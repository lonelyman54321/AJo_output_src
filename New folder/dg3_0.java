/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/*
 * Renamed from dG3
 */
public final class dg3_0
implements cg3_0 {
    public static final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState a;

    static {
        kw2 kw22 = new kw2(0);
        b = J83.g(kw22);
    }

    public dg3_0() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.a = parcelableSnapshotMutableState = J83.g(Boolean.FALSE);
    }

    public final boolean a() {
        return (Boolean)this.a.getValue();
    }
}

