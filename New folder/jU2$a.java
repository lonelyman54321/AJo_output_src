/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

public final class jU2$a
extends Lambda
implements Function1 {
    public final /* synthetic */ ju2_2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Ns2 e;

    public jU2$a(ju2_2 ju2_22, int n3, Ns2 ns2) {
        this.c = ju2_22;
        this.d = n3;
        this.e = ns2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Object object2 = this.c;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = ((ju2_2)object2).n.a;
        int n3 = parcelableSnapshotMutableIntState.o();
        int n4 = this.d;
        n3 = f.g(n3, 0, n4);
        boolean bl2 = ((ju2_2)object2).o;
        n3 = bl2 ? (n3 -= n4) : -n3;
        boolean bl3 = ((ju2_2)object2).p;
        n4 = bl3 ? 0 : n3;
        if (!bl3) {
            n3 = 0;
            parcelableSnapshotMutableIntState = null;
        }
        Ns2 ns2 = this.e;
        object2 = new iu2_1(n4, n3, ns2);
        ((Ns2$a)object).a = true;
        ((iu2_1)object2).invoke(object);
        ((Ns2$a)object).a = false;
        return Unit.a;
    }
}

