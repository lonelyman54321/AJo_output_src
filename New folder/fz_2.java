/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FZ
 */
public final class fz_2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ fz_2(cz_1 cz_12) {
        this.a = cz_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

