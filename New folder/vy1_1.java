/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vY1
 */
public final class vy1_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ vy1_1(uy1_2 uy1_22) {
        this.a = uy1_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

