/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tc
 */
public final class tc_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ tc_0(sc_2 sc_22) {
        this.a = sc_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

