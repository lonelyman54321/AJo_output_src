/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GB
 */
public final class gb_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ f23_0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ gb_2(String string2, dr0_0 dr0_02, yT1 yT12, f23_0 f23_02, int n3) {
        this.a = string2;
        this.b = dr0_02;
        this.c = yT12;
        this.d = f23_02;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.c;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        f23_0 f23_02 = this.d;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekViewModel");
        int n3 = Me3.b(this.e | 1);
        WB.a(this.a, dr0_02, yT12, f23_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

