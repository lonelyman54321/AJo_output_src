/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mu2
 */
public final class mu2_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ mu2_1(eu2_0 eu2_02) {
        this.a = eu2_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

