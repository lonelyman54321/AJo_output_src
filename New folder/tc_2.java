/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.FnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tC
 */
public final class tc_2
implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ yp0_0 d;
    public final /* synthetic */ Component e;

    public /* synthetic */ tc_2(Activity activity, dr0_0 dr0_02, c80 c802, yp0_0 yp0_02, Component component) {
        this.a = activity;
        this.b = dr0_02;
        this.c = c802;
        this.d = yp0_02;
        this.e = component;
    }

    public final Object invoke(Object object) {
        object = (Resource)object;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$fleekViewModel");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.d;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Object object3 = this.a;
        if (object3 != null) {
            Object object4;
            if (object == null || (object4 = ((Resource)object).getFnlColorVariantData()) == null || (object4 = ((FnlColorVariantData)object4).getColorGroup()) == null) {
                object4 = "";
            }
            object2.getClass();
            dr0_0.F(object3, (String)object4);
            object3 = this.e;
            object4 = null;
            object2 = new zc_2(yp0_02, (Resource)object, (Component)object3, null);
            int n3 = 3;
            Ae3.d(i90_02, null, null, (Function2)object2, n3);
        }
        return Unit.a;
    }
}

