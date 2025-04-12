/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vy3
 */
public final class vy3_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ vy3_0(ty3_0 ty3_02) {
        this.a = ty3_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

