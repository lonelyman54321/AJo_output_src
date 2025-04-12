/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IQ0
 */
public final class iq0_1
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ iq0_1(dr0_0 dr0_02, yT1 yT12, int n3) {
        this.a = dr0_02;
        this.b = yT12;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$bottomNavigationController");
        UQ0.c(Me3.b(this.c | 1), (b30_0)object, dr0_02, yT12);
        return Unit.a;
    }
}

