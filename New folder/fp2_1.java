/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fp2
 */
public final class fp2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ fp2_1(p8_0 p8_02) {
        this.a = p8_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

