/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class XC2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ XC2(WC2 wC2) {
        this.a = wC2;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

