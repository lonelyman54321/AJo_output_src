/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vS
 */
public final class vs_2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ vs_2(us_1 us_12) {
        this.a = us_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

