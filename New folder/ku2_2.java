/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ku2
 */
public final class ku2_2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ku2_2(nw1_1 nw1_12) {
        this.a = nw1_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

