/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nj0
 */
public final class nj0_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ nj0_2(dr0_0 dr0_02, yT1 yT12, yT1 yT13, int n3) {
        this.a = dr0_02;
        this.b = yT12;
        this.c = yT13;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$bottomNavigationController");
        yT1 yT13 = this.c;
        Intrinsics.checkNotNullParameter(yT13, "$fleekAppNavigationController");
        int n3 = Me3.b(this.d | 1);
        uj0_0.a(dr0_02, yT12, yT13, (b30_0)object, n3);
        return Unit.a;
    }
}

