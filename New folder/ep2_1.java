/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ep2
 */
public final class ep2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ep2_1(N8 n8) {
        this.a = n8;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

