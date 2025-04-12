/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IS
 */
public final class is_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ is_0(A9 a9) {
        this.a = a9;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

