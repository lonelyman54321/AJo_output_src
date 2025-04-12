/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from P13
 */
public final class p13_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ p13_0(xy0_2 xy0_22) {
        this.a = xy0_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

