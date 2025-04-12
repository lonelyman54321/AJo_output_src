/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gp2
 */
public final class gp2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ gp2_1(ap2_1 ap2_12) {
        this.a = ap2_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

