/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rv3
 */
public final class rv3_0
implements Function1 {
    public final /* synthetic */ Ns2 a;
    public final /* synthetic */ Ns2 b;
    public final /* synthetic */ dl1_1 c;
    public final /* synthetic */ float d;

    public /* synthetic */ rv3_0(dl1_1 dl1_12, Ns2 ns2, Ns2 ns22) {
        float f5 = uq0_0.k;
        this.a = ns2;
        this.b = ns22;
        this.c = dl1_12;
        this.d = f5;
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2 ns2 = this.a;
        Intrinsics.checkNotNullParameter(ns2, "$contentPlaceable");
        Ns2 ns22 = this.b;
        Intrinsics.checkNotNullParameter(ns22, "$brandImagePlaceable");
        dl1_1 dl1_12 = this.c;
        Intrinsics.checkNotNullParameter(dl1_12, "$this_Layout");
        Intrinsics.checkNotNullParameter(object, "$this$layout");
        int n3 = ns22.b / 2;
        Ns2$a.f((Ns2$a)object, ns2, 0, n3);
        float f5 = this.d;
        int n4 = dl1_12.e0(f5);
        Ns2$a.f((Ns2$a)object, ns22, n4, 0);
        return Unit.a;
    }
}

