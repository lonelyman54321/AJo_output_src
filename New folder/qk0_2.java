/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qK0
 */
public final class qk0_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ yp0_0 d;

    public /* synthetic */ qk0_2(String string2, dr0_0 dr0_02, yT1 yT12, yp0_0 yp0_02) {
        this.a = string2;
        this.b = dr0_02;
        this.c = yT12;
        this.d = yp0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.c;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        yp0_0 yp0_02 = this.d;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        String string2 = this.a;
        gk0_2 gk0_22 = new gk0_2(string2, dr0_02, yT12, yp0_02);
        ai0_2.r(gk0_22, object, object2);
        return Unit.a;
    }
}

