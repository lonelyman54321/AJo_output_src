/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kp2
 */
public final class kp2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ kp2_1(ta_0 ta_02) {
        this.a = ta_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

