/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from M13
 */
public final class m13_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ m13_0(l13_0 l13_02) {
        this.a = l13_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

