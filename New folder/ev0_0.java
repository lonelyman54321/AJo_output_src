/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ev0
 */
public final class ev0_0
implements Function2 {
    public final /* synthetic */ ov0_0 a;
    public final /* synthetic */ Bv0$d b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ev0_0(ov0_0 ov0_02, Bv0$d bv0$d, uv0_2 uv0_22, xv0_2 xv0_22, int n3) {
        this.a = ov0_02;
        this.b = bv0$d;
        this.c = uv0_22;
        this.d = xv0_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        ov0_0 ov0_02 = this.a;
        Intrinsics.checkNotNullParameter(ov0_02, "$viewModel");
        Bv0$d bv0$d = this.b;
        Intrinsics.checkNotNullParameter(bv0$d, "$state");
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$onCloseClick");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$onResult");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (uv0_2)object;
        Object object5 = object2;
        object5 = (xv0_2)object2;
        rv0_1.a(ov0_02, bv0$d, (uv0_2)object4, (xv0_2)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

