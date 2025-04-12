/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zJ0
 */
public final class zj0_2
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ zj0_2(int n3, Function1 function1) {
        this.a = function1;
        this.b = n3;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onItemClicked");
        Integer n3 = this.b;
        function1.invoke(n3);
        return Unit.a;
    }
}

