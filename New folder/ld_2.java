/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ld
 */
public final class ld_2
implements Function2 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ HD c;
    public final /* synthetic */ int d;

    public /* synthetic */ ld_2(yT1 yT12, dr0_0 dr0_02, HD$d hD$d, int n3) {
        this.a = yT12;
        this.b = dr0_02;
        this.c = hD$d;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$fleekAppNavigationController");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        HD hD = this.c;
        Intrinsics.checkNotNullParameter(hD, "$state");
        int n3 = Me3.b(this.d | 1);
        hD = (HD$d)hD;
        qd_0.b((yT1)object2, dr0_02, (HD$d)hD, (b30_0)object, n3);
        return Unit.a;
    }
}

