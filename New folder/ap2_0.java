/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ap2
 */
public final class ap2_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ap2_0(zo2_0 zo2_02) {
        this.a = zo2_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

