/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from td2
 */
public final class td2_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ td2_2(qz1_2 qz1_22, boolean bl2, int n3, int n4) {
        this.a = qz1_22;
        this.b = bl2;
        this.c = n3;
        this.d = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.c | 1);
        boolean bl2 = this.b;
        int n4 = this.d;
        de2_0.b(qz1_22, bl2, (b30_0)object, n3, n4);
        return Unit.a;
    }
}

