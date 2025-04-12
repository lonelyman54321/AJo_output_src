/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ro2
 */
public final class ro2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ro2_1(az1_1 az1_12) {
        this.a = az1_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

