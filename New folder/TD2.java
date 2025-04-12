/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class TD2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ TD2(m61_0 m61_02) {
        this.a = m61_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

