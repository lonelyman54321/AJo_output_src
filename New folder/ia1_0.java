/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iA1
 */
public final class ia1_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ia1_0(oA1 oA12) {
        this.a = oA12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

