/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aF1
 */
public final class af1_2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ af1_2(ze1_1 ze1_12) {
        this.a = ze1_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

