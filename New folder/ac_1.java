/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from aC
 */
public final class ac_1
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ Component e;
    public final /* synthetic */ yp0_0 f;

    public /* synthetic */ ac_1(Activity activity, dr0_0 dr0_02, Ref$ObjectRef ref$ObjectRef, c80 c802, Component component, yp0_0 yp0_02) {
        this.a = activity;
        this.b = dr0_02;
        this.c = ref$ObjectRef;
        this.d = c802;
        this.e = component;
        this.f = yp0_02;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (Subcomponent)object;
        boolean bl2 = (Boolean)object2;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Ref$ObjectRef ref$ObjectRef = this.c;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$brandsPageData");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$coroutineScope");
        yp0_0 yp0_02 = this.f;
        Object object4 = "$fleekBrandPageGAEventsUtil";
        Intrinsics.checkNotNullParameter(yp0_02, (String)object4);
        Activity activity = this.a;
        if (activity != null) {
            jc_1 jc_12;
            Component component = this.e;
            Object object5 = object2;
            object5 = (c80)object2;
            object4 = jc_12;
            jc_12 = new jc_1(ref$ObjectRef, (c80)object5, (dr0_0)object, (Subcomponent)object3, component, bl2, yp0_02);
            object.getClass();
            dr0_0.c(activity, jc_12);
        }
        return Unit.a;
    }
}

