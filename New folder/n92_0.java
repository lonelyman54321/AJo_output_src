/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from n92
 */
public final class n92_0
implements Function2 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n92_0(yT1 yT12, dr0_0 dr0_02, int n3) {
        this.a = yT12;
        this.b = dr0_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        yT1 yT12 = this.a;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        t92_0.a(Me3.b(this.c | 1), (b30_0)object, dr0_02, yT12);
        return Unit.a;
    }
}

