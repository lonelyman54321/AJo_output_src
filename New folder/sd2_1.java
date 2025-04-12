/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sd2
 */
public final class sd2_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ sd2_1(qz1_2 qz1_22, int n3) {
        this.a = qz1_22;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.b | 1);
        de2_0.A(qz1_22, (b30_0)object, n3);
        return Unit.a;
    }
}

