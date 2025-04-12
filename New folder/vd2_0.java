/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VD2
 */
public final class vd2_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ vd2_0(UD2 uD2) {
        this.a = uD2;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

