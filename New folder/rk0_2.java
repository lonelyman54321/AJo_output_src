/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rK0
 */
public final class rk0_2
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ Component c;

    public /* synthetic */ rk0_2(dr0_0 dr0_02, Activity activity, Component component) {
        this.a = activity;
        this.b = dr0_02;
        this.c = component;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Resource)object;
        object2 = (Boolean)object2;
        boolean bl2 = (Boolean)object2;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Activity activity = this.a;
        if (activity != null) {
            Object object3 = this.c;
            ok0_2 ok0_22 = new ok0_2(dr0_02, bl2, (Resource)object, (Component)object3);
            object3 = new pk0_1(dr0_02);
            dr0_02.getClass();
            dr0_0.T(activity, bl2, (Resource)object, ok0_22, (Function0)object3);
        }
        return Unit.a;
    }
}

