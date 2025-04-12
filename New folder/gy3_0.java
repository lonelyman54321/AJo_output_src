/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gy3
 */
public final class gy3_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ gy3_0(jy1_0 jy1_02) {
        this.a = jy1_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

