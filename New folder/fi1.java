/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class fi1
implements op1_1,
pp1_0,
sp1_0 {
    public final lg3_0 b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;

    public fi1(oO0 object) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.b = object;
        this.c = parcelableSnapshotMutableState = J83.g(object);
        this.d = object = J83.g(object);
    }

    public final void a(TP1 object) {
        Object object2 = dh3_0.a;
        object = (lg3_0)object.U((OP1)object2);
        oO0 oO02 = (oO0)this.b;
        object2 = new de0_1(oO02, (lg3_0)object);
        this.c.setValue(object2);
        object2 = new Vv3(oO02, (lg3_0)object);
        this.d.setValue(object2);
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof fi1;
        if (!bl2) {
            return false;
        }
        object = ((fi1)object).b;
        lg3_0 lg3_02 = this.b;
        return Intrinsics.areEqual(object, lg3_02);
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final LB2 getKey() {
        return dh3_0.a;
    }

    public final Object getValue() {
        return (lg3_0)this.d.getValue();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.c;
        lg3_0 lg3_02 = (lg3_0)parcelableSnapshotMutableState.getValue();
        bp1_0 bp1_02 = dl1_12.getLayoutDirection();
        int n3 = lg3_02.d(dl1_12, bp1_02);
        int n4 = ((lg3_0)parcelableSnapshotMutableState.getValue()).a(dl1_12);
        lg3_0 lg3_03 = (lg3_0)parcelableSnapshotMutableState.getValue();
        bp1_0 bp1_03 = dl1_12.getLayoutDirection();
        int n7 = lg3_03.b(dl1_12, bp1_03);
        int n8 = ((lg3_0)parcelableSnapshotMutableState.getValue()).c(dl1_12);
        int n10 = -(n7 += n3);
        int n14 = -(n8 += n4);
        long l3 = f60.k(n10, n14, l2);
        object = object.Q(l3);
        n7 = f60.h(((Ns2)object).a + n7, l2);
        int n15 = f60.g(((Ns2)object).b + n8, l2);
        fi1$a fi1$a = new fi1$a(n3, n4, (Ns2)object);
        return cl1_0.a(dl1_12, n7, n15, fi1$a);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.d(this, rj1, qj1, n3);
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

