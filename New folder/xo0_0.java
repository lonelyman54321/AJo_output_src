/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xO0
 */
public final class xo0_0
implements Kx$d,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ xo0_0(Object object) {
        this.a = object;
    }

    public long a(long l2) {
        EO0 eO0 = (EO0)this.a;
        long l3 = eO0.e;
        long l4 = l2 * l3 / 1000000L;
        long l7 = eO0.j - 1L;
        return gz3.i(l4, 0L, l7);
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

