/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q93
 */
public final class q93_0
implements Function2 {
    public final /* synthetic */ yh0_0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q93_0(yh0_0 yh0_02, v93_0 v93_02, int n3) {
        this.a = yh0_02;
        this.b = v93_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onDismissClick");
        int n3 = Me3.b(this.c | 1);
        function0 = (v93_0)function0;
        r93_0.b((yh0_0)object2, (v93_0)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

