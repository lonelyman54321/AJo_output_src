/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aK0
 */
public final class ak0_1
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Component e;
    public final /* synthetic */ FeedEngineData f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public /* synthetic */ ak0_1(Activity activity, dr0_0 dr0_02, boolean bl2, String string2, Component component, FeedEngineData feedEngineData, String string3, String string4) {
        this.a = activity;
        this.b = dr0_02;
        this.c = bl2;
        this.d = string2;
        this.e = component;
        this.f = feedEngineData;
        this.g = string3;
        this.h = string4;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.b;
        Object object = "$fleekViewModel";
        Intrinsics.checkNotNullParameter(dr0_02, (String)object);
        Activity activity = this.a;
        if (activity != null) {
            String string2;
            jk0_2 jk0_22;
            String string3 = this.g;
            String string4 = this.h;
            Object object2 = this.f;
            boolean bl2 = this.c;
            object = jk0_22;
            Object object3 = dr0_02;
            jk0_22 = new jk0_2(dr0_02, (FeedEngineData)object2, bl2, string3, string4);
            dr0_02.getClass();
            dr0_0.c(activity, jk0_22);
            object = pp0_0.a;
            object = bl2 ? "post unliked" : "post liked";
            object3 = this.d;
            object2 = "";
            if (object3 == null) {
                object3 = object2;
            }
            if ((string2 = dr0_0.x(this.e)) != null) {
                object2 = string2;
            }
            pp0_0.b((String)object, (String)object3, (String)object2);
        }
        return Unit.a;
    }
}

