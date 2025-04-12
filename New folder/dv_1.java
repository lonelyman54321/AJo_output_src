/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dv
 */
public final class dv_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ dv_1(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        int n3 = this.b;
        int n4 = this.a;
        Jv$a jv$a = new Jv$a(n3, n4);
        u10 u102 = new u10(-1592456280, jv$a, true);
        bt1.b((dt1_0)object, n4, null, u102, 6);
        return Unit.a;
    }
}

