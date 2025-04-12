/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vp2
 */
public final class vp2_2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ vp2_2(p02_0 p02_02) {
        this.a = p02_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

