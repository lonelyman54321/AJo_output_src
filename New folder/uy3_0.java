/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uy3
 */
public final class uy3_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ uy3_0(xy1_2 xy1_22) {
        this.a = xy1_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

