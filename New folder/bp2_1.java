/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bp2
 */
public final class bp2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ bp2_1(G8 g8) {
        this.a = g8;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

