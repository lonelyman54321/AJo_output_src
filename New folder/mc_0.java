/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mc
 */
public final class mc_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ mc_0(lc_2 lc_22) {
        this.a = lc_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

