/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YE1
 */
public final class ye1_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ye1_1(ht_1 ht_12) {
        this.a = ht_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

