/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qA
 */
public final class qa_2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ qa_2(pa_2 pa_22) {
        this.a = pa_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

