/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NJ0
 */
public final class nj0_0
implements Function2 {
    public final /* synthetic */ HK0$d a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ f23_0 d;
    public final /* synthetic */ ft1_2 e;
    public final /* synthetic */ int f;

    public /* synthetic */ nj0_0(HK0$d hK0$d, dr0_0 dr0_02, yT1 yT12, f23_0 f23_02, ft1_2 ft1_22, int n3) {
        this.a = hK0$d;
        this.b = dr0_02;
        this.c = yT12;
        this.d = f23_02;
        this.e = ft1_22;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        HK0$d hK0$d = this.a;
        Intrinsics.checkNotNullParameter(hK0$d, "$state");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.c;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        f23_0 f23_02 = this.d;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekVM");
        ft1_2 ft1_22 = this.e;
        Intrinsics.checkNotNullParameter(ft1_22, "$listState");
        int n3 = Me3.b(this.f | 1);
        gk0_1.a(hK0$d, dr0_02, yT12, f23_02, ft1_22, (b30_0)object3, n3);
        return Unit.a;
    }
}

