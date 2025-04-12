/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from To2
 */
public final class to2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ to2_1(jm0_2 jm0_22) {
        this.a = jm0_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

