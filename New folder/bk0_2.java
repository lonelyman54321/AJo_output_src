/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bK0
 */
public final class bk0_2
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ yp0_0 c;

    public /* synthetic */ bk0_2(dr0_0 dr0_02, yT1 yT12, yp0_0 yp0_02) {
        this.a = dr0_02;
        this.b = yT12;
        this.c = yp0_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (String)object;
        object2 = (String)object2;
        object3 = (String)object3;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$fleekViewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        yp0_0 yp0_02 = this.c;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        sq0_1.g((String)object3, "logo");
        object2.getClass();
        dr0_0.G((String)object, yT12);
        yp0_02.c((String)object3);
        return Unit.a;
    }
}

