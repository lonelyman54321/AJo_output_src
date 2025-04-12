/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kc2
 */
public final class kc2_1
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ kc2_1(yp0_2 yp0_22, je1_0 je1_02, qz1_2 qz1_22, int n3) {
        this.a = yp0_22;
        this.b = je1_02;
        this.c = qz1_22;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$onCloseButtonClicked");
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$onUpdateClicked");
        qz1_2 qz1_22 = this.c;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        object2 = (yp0_2)object2;
        function1 = (je1_0)function1;
        jd2_1.h((yp0_2)object2, (je1_0)function1, qz1_22, (b30_0)object, n3);
        return Unit.a;
    }
}

