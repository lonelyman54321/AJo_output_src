/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

public final class ss1
implements Cr0 {
    public final /* synthetic */ rs1_0 a;

    public ss1(rs1_0 rs1_02) {
        this.a = rs1_02;
    }

    public final void dispose() {
        rs1_0 rs1_02 = this.a;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = rs1_02.d;
        int n3 = parcelableSnapshotMutableIntState.o();
        for (int i3 = 0; i3 < n3; ++i3) {
            rs1_02.release();
        }
    }
}

