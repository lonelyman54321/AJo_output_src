/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.ranges.f;

public final class Ne$a
implements Ws0 {
    public final /* synthetic */ Re a;

    public Ne$a(Re re) {
        this.a = re;
    }

    public final void a(float f5) {
        float f6;
        Re re = this.a;
        Ke ke = re.n;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = re.j;
        float f7 = parcelableSnapshotMutableFloatState.c();
        boolean bl2 = Float.isNaN(f7);
        if (bl2) {
            f6 = 0.0f;
            parcelableSnapshotMutableFloatState = null;
        } else {
            f6 = parcelableSnapshotMutableFloatState.c();
        }
        f6 += f5;
        f5 = re.d().d();
        float f8 = re.d().f();
        f5 = f.f(f6, f5, f8);
        ke.a(f5, 0.0f);
    }
}

