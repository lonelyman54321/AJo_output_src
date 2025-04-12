/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cy3
 */
public final class cy3_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ cy3_0(xn2_2 xn2_22) {
        this.a = xn2_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

