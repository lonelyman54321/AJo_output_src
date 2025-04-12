/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qp2
 */
public final class qp2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ qp2_1(pp2_2 pp2_22) {
        this.a = pp2_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

