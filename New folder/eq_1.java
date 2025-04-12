/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EQ
 */
public final class eq_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ eq_1(I8 i8) {
        this.a = i8;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

