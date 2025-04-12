/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HC
 */
public final class hc_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ yp0_0 e;
    public final /* synthetic */ Component f;

    public /* synthetic */ hc_0(String string2, dr0_0 dr0_02, yT1 yT12, c80 c802, yp0_0 yp0_02, Component component) {
        this.a = string2;
        this.b = dr0_02;
        this.c = yT12;
        this.d = c802;
        this.e = yp0_02;
        this.f = component;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$fleekViewModel");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$fleekAppNavigationController");
        i90_0 i90_02 = this.d;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.e;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Object object4 = sq0_1.a;
        object4 = this.a;
        if (object4 == null) {
            object4 = "";
        }
        sq0_1.g((String)object4, "logo");
        object2.getClass();
        dr0_0.G((String)object, (yT1)object3);
        object3 = this.f;
        object = new xc_1(yp0_02, (dr0_0)object2, (Component)object3, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

