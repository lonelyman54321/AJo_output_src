/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pC
 */
public final class pc_2
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ Component c;

    public /* synthetic */ pc_2(dr0_0 dr0_02, Activity activity, Component component) {
        this.a = activity;
        this.b = dr0_02;
        this.c = component;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$dataComponent");
        Object object3 = this.a;
        if (object3 != null) {
            object.getClass();
            object = dr0_0.w(object3);
            object3 = dr0_0.z((Component)object2);
            Object object4 = "";
            if (object3 == null) {
                object3 = object4;
            }
            if ((object2 = dr0_0.y((Component)object2)) != null) {
                object4 = object2;
            }
            ((fq0_2)object).Za((String)object3, (String)object4);
        }
        return Unit.a;
    }
}

