/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from md
 */
public final class md_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ md_2(dr0_0 dr0_02, yT1 yT12, int n3) {
        this.a = 0;
        this.c = dr0_02;
        this.b = yT12;
        this.d = n3;
    }

    public /* synthetic */ md_2(yT1 yT12, dr0_0 dr0_02, int n3) {
        this.a = 1;
        this.b = yT12;
        this.c = dr0_02;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.a;
        object = (b30_0)object;
        object2 = (Integer)object2;
        ((Integer)object2).intValue();
        switch (n3) {
            default: {
                yT1 yT12 = this.b;
                Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
                dr0_0 dr0_02 = this.c;
                Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
                fh0_0.b(Me3.b(this.d | 1), (b30_0)object, dr0_02, yT12);
                return Unit.a;
            }
            case 0: 
        }
        dr0_0 dr0_03 = this.c;
        Intrinsics.checkNotNullParameter(dr0_03, "$fleekViewModel");
        yT1 yT13 = this.b;
        Intrinsics.checkNotNullParameter(yT13, "$fleekAppNavigationController");
        qd_0.e(Me3.b(this.d | 1), (b30_0)object, dr0_03, yT13);
        return Unit.a;
    }
}

