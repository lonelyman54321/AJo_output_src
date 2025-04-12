/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zp2
 */
public final class zp2_2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ zp2_2(yp2_1 yp2_12) {
        this.a = yp2_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

