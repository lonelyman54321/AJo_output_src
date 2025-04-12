/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class qH2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ qH2(ha1_2 ha1_22) {
        this.a = ha1_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

