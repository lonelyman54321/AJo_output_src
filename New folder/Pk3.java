/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.ranges.f;

public final class Pk3 {
    public static final ds2_0 f;
    public final ParcelableSnapshotMutableFloatState a;
    public final ParcelableSnapshotMutableFloatState b;
    public aG2 c;
    public long d;
    public final ParcelableSnapshotMutableState e;

    static {
        Pk3$a pk3$a = Pk3$a.c;
        Pk3$b pk3$b = Pk3$b.c;
        f = sr0_2.a(pk3$a, pk3$b);
    }

    public Pk3() {
        pg2_0 pg2_02 = pg2_0.Vertical;
        this(pg2_02);
    }

    public /* synthetic */ Pk3(pg2_0 pg2_02) {
        this(pg2_02, 0.0f);
    }

    public Pk3(pg2_0 object, float f5) {
        long l2;
        Object object2 = tp1_0.e(f5);
        this.a = object2;
        object2 = tp1_0.e(0.0f);
        this.b = object2;
        this.c = object2 = aG2.e;
        this.d = l2 = mm3.b;
        J83.l();
        object2 = qi_2.b;
        object = J83.f(object, (I83)object2);
        this.e = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(pg2_0 pg2_02, aG2 aG22, int n3, int n4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11 = n4 -= n3;
        this.b.k(f11);
        aG2 aG23 = this.c;
        float f12 = aG23.a;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.a;
        float f14 = aG22.a;
        float f15 = aG22.b;
        float f16 = f14 == f12 ? 0 : (f14 < f12 ? -1 : 1);
        if (f16 != false || (f8 = (f7 = f15 - (f6 = aG23.b)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) != false) {
            float f17;
            float f18;
            float f19;
            float f20;
            int n7;
            pg2_0 pg2_03 = pg2_0.Vertical;
            if (pg2_02 == pg2_03) {
                n7 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n7 = 0;
                f5 = 0.0f;
                pg2_02 = null;
            }
            if (n7 != 0) {
                f14 = f15;
            }
            f5 = n7 != 0 ? aG22.d : aG22.c;
            f6 = parcelableSnapshotMutableFloatState.c();
            float f22 = n3;
            f12 = f6 + f22;
            float f23 = f5 == f12 ? 0 : (f5 > f12 ? 1 : -1);
            if (f23 > 0 || (f23 = f14 == f6 ? 0 : (f14 < f6 ? -1 : 1)) < 0 && (f20 = (f19 = (f18 = f5 - f14) - f22) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1)) > 0) {
                f5 -= f12;
            } else if (f23 < 0 && (n7 = (f17 = (f5 -= f14) - f22) == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1)) <= 0) {
                f5 = f14 - f6;
            } else {
                n7 = 0;
                f5 = 0.0f;
                pg2_02 = null;
            }
            f22 = parcelableSnapshotMutableFloatState.c() + f5;
            parcelableSnapshotMutableFloatState.k(f22);
            this.c = aG22;
        }
        f5 = kotlin.ranges.f.f(parcelableSnapshotMutableFloatState.c(), 0.0f, f11);
        parcelableSnapshotMutableFloatState.k(f5);
    }
}

