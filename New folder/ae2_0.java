/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aE2
 */
public final class ae2_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ae2_0(zd2_0 zd2_02) {
        this.a = zd2_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

