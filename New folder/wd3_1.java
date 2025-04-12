/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wd3
 */
public final class wd3_1
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ wd3_1(Function0 function0, int n3) {
        this.a = function0;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onRetryClicked");
        int n3 = Me3.b(this.b | 1);
        yd3_2.a(function0, (b30_0)object, n3);
        return Unit.a;
    }
}

