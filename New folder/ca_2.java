/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ca
 */
public final class ca_2
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ca_2(ba_2 ba_22) {
        this.a = ba_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

