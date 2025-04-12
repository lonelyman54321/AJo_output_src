/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QG0
 */
public final class qg0_0
implements Function2 {
    public final /* synthetic */ gh0_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ qg0_0(GH0$d gH0$d, dr0_0 dr0_02, yT1 yT12, int n3) {
        this.a = gH0$d;
        this.b = dr0_02;
        this.c = yT12;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$state");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.c;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        int n3 = Me3.b(this.d | 1);
        fh0_0.a((GH0$d)object2, dr0_02, yT12, (b30_0)object, n3);
        return Unit.a;
    }
}

