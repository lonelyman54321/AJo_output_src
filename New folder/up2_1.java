/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from up2
 */
public final class up2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ up2_1(n02_0 n02_02) {
        this.a = n02_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

