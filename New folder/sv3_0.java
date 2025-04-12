/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sv3
 */
public final class sv3_0
implements al1_1 {
    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List object, long l2) {
        Intrinsics.checkNotNullParameter(dl1_12, "$this$Layout");
        Intrinsics.checkNotNullParameter(object, "measurables");
        Object object2 = (xk1_0)object.get(0);
        object = (xk1_0)object.get(1);
        long l3 = l2;
        l3 = c60.b(l2, 0, 0, 0, 0, 10);
        object = object.Q(l3);
        object2 = object2.Q(l3);
        int n3 = c60.i(l2);
        int n4 = ((Ns2)object).b / 2;
        int n7 = ((Ns2)object2).b;
        rv3_0 rv3_02 = new rv3_0(dl1_12, (Ns2)object2, (Ns2)object);
        return cl1_0.a(dl1_12, n3, n4 += n7, rv3_02);
    }

    public final /* synthetic */ int h(Rj1 rj1, List list, int n3) {
        return ZK1.d(this, rj1, list, n3);
    }

    public final /* synthetic */ int i(Rj1 rj1, List list, int n3) {
        return ZK1.a(this, rj1, list, n3);
    }

    public final /* synthetic */ int j(Rj1 rj1, List list, int n3) {
        return ZK1.c(this, rj1, list, n3);
    }
}

