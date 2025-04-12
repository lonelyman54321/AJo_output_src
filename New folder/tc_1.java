/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TC
 */
public final class tc_1
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ yp0_0 d;
    public final /* synthetic */ String e;

    public /* synthetic */ tc_1(dr0_0 dr0_02, yT1 yT12, c80 c802, yp0_0 yp0_02, String string2) {
        this.a = dr0_02;
        this.b = yT12;
        this.c = c802;
        this.d = yp0_02;
        this.e = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (String)object;
        object2 = (String)object2;
        object3 = (String)object3;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$fleekViewModel");
        object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$fleekAppNavigationController");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.d;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        object2.getClass();
        dr0_0.G((String)object, (yT1)object3);
        object2 = this.e;
        object = new cd_2(yp0_02, (String)object2, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

