/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uu3
 */
public final class uu3_0
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ uu3_0(int n3, Function1 function1) {
        this.a = function1;
        this.b = n3;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onBannerClick");
        Integer n3 = this.b;
        function1.invoke(n3);
        return Unit.a;
    }
}

