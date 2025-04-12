/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class cE2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ cE2(bE2 bE22) {
        this.a = bE22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

