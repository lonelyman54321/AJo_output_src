/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class rH2
implements o60_0,
wJ2$b {
    public final /* synthetic */ Object a;

    public /* synthetic */ rH2(Object object) {
        this.a = object;
    }

    public void a(long l2, Xm2 xm2) {
        wp3[] wp3Array = ((DX2)this.a).b;
        ir_0.a(l2, xm2, wp3Array);
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

