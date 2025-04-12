/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yd2
 */
public final class yd2_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ yd2_2(int n3, qz1_2 qz1_22, String string2, boolean bl2) {
        this.a = qz1_22;
        this.b = string2;
        this.c = bl2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        String string2 = this.b;
        boolean bl2 = this.c;
        de2_0.r(n3, (b30_0)object, qz1_22, string2, bl2);
        return Unit.a;
    }
}

