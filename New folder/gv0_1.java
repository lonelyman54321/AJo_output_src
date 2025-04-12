/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gv0
 */
public final class gv0_1
implements Function1 {
    public final /* synthetic */ ov0_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ gv0_1(ov0_0 ov0_02, int n3) {
        this.a = ov0_02;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        object = (Integer)object;
        object.getClass();
        ov0_0 ov0_02 = this.a;
        Intrinsics.checkNotNullParameter(ov0_02, "$viewModel");
        ov0_02.getClass();
        aW aW2 = md3_0.c(ov0_02);
        int n3 = this.b;
        jv0_1 jv0_12 = new jv0_1(ov0_02, n3, (Integer)object, null);
        Ae3.d(aW2, null, null, jv0_12, 3);
        return Unit.a;
    }
}

