/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OC
 */
public final class oc_0
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ yp0_0 d;

    public /* synthetic */ oc_0(Activity activity, dr0_0 dr0_02, c80 c802, yp0_0 yp0_02) {
        this.a = activity;
        this.b = dr0_02;
        this.c = c802;
        this.d = yp0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Resource)object;
        object2 = (Boolean)object2;
        boolean bl2 = (Boolean)object2;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$coroutineScope");
        yp0_0 yp0_02 = this.d;
        Object object4 = "$fleekBrandPageGAEventsUtil";
        Intrinsics.checkNotNullParameter(yp0_02, (String)object4);
        Activity activity = this.a;
        if (activity != null) {
            kc_1 kc_12;
            i90_0 i90_02 = object3;
            i90_02 = (c80)object3;
            object3 = kc_12;
            object4 = dr0_02;
            kc_12 = new kc_1(dr0_02, bl2, (c80)i90_02, yp0_02, (Resource)object);
            object4 = null;
            object3 = new lc_0(dr0_02, 0);
            dr0_02.getClass();
            dr0_0.T(activity, bl2, (Resource)object, kc_12, (Function0)object3);
        }
        return Unit.a;
    }
}

