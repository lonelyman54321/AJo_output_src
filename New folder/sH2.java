/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class sH2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ sH2(sg0_0 sg0_02) {
        this.a = sg0_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

