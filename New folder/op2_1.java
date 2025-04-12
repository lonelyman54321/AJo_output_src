/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from op2
 */
public final class op2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ op2_1(np2_1 np2_12) {
        this.a = np2_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

