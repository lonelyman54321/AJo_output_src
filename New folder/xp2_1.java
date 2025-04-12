/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xp2
 */
public final class xp2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ xp2_1(a8_0 a8_02) {
        this.a = a8_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

