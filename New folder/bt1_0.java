/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.Unit;

/*
 * Renamed from Bt1
 */
public final class bt1_0
implements zs1_0 {
    public final /* synthetic */ qr1_0 a;

    public bt1_0(qr1_0 qr1_02) {
        this.a = qr1_02;
    }

    public final int a() {
        qr1_0 qr1_02 = this.a;
        int n3 = qr1_02.g().e();
        return qr1_02.g().c() + n3;
    }

    public final float b() {
        float f5;
        qr1_0 qr1_02 = this.a;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = qr1_02.b.a;
        int n3 = parcelableSnapshotMutableIntState.o();
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = qr1_02.b.b;
        int n4 = parcelableSnapshotMutableIntState2.o();
        boolean bl2 = qr1_02.d();
        if (bl2) {
            f5 = n3 * 500 + n4;
            n3 = 100;
            float f6 = n3;
            f5 += f6;
        } else {
            n3 = n3 * 500 + n4;
            f5 = n3;
        }
        return f5;
    }

    public final qX c() {
        int n3 = -1;
        qX qX2 = new qX(n3, n3);
        return qX2;
    }

    public final Object d(int n3, f80_0 object) {
        Object object2 = qr1_0.t;
        object2 = this.a;
        object2.getClass();
        rr1_2 rr1_22 = new rr1_2((qr1_0)object2, n3, 0, null);
        Object object3 = aS1.Default;
        object3 = ((qr1_0)object2).a((aS1)((Object)object3), rr1_22, (f80_0)object);
        object = j90_0.COROUTINE_SUSPENDED;
        if (object3 != object) {
            object3 = Unit.a;
        }
        if (object3 == object) {
            return object3;
        }
        return Unit.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int e() {
        long l2;
        pg2_0 pg2_02;
        Object object = this.a;
        pg2_0 pg2_03 = ((qr1_0)object).g().a();
        if (pg2_03 == (pg2_02 = pg2_0.Vertical)) {
            object = ((qr1_0)object).g();
            l2 = object.b();
            long l3 = 0xFFFFFFFFL;
            l2 &= l3;
            return (int)l2;
        }
        object = ((qr1_0)object).g();
        l2 = object.b();
        int n3 = 32;
        l2 >>= n3;
        return (int)l2;
    }

    public final float f() {
        qr1_0 qr1_02 = this.a;
        int n3 = qr1_02.b.a.o();
        int n4 = qr1_02.b.b.o();
        return n3 * 500 + n4;
    }
}

