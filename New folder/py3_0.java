/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from py3
 */
public final class py3_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ py3_0(oy3_0 oy3_02) {
        this.a = oy3_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

