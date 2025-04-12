/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from be0
 */
public final class be0_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ be0_1(ae0_0 ae0_02) {
        this.a = ae0_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

