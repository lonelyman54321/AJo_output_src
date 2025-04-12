/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LJ0
 */
public final class lj0_1
implements Function2 {
    public final /* synthetic */ f23_0 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ lj0_1(f23_0 f23_02, yT1 yT12, dr0_0 dr0_02, int n3) {
        this.a = f23_02;
        this.b = yT12;
        this.c = dr0_02;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        f23_0 f23_02 = this.a;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekVM");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.d | 1);
        gk0_1.b(f23_02, yT12, dr0_02, (b30_0)object, n3);
        return Unit.a;
    }
}

