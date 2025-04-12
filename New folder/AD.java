/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AD
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ AD(uj0_2 uj0_22, int n3) {
        this.a = uj0_22;
        this.b = n3;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        Integer n3 = this.b;
        function1.invoke(n3);
        return Unit.a;
    }
}

