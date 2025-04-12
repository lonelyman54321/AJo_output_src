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
 * Renamed from YJ0
 */
public final class yj0_0
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Component e;
    public final /* synthetic */ FeedEngineData f;
    public final /* synthetic */ String g;

    public /* synthetic */ yj0_0(Activity activity, dr0_0 dr0_02, boolean bl2, String string2, Component component, FeedEngineData feedEngineData, String string3) {
        this.a = activity;
        this.b = dr0_02;
        this.c = bl2;
        this.d = string2;
        this.e = component;
        this.f = feedEngineData;
        this.g = string3;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.a;
        if (object2 != null) {
            String string2 = this.g;
            FeedEngineData feedEngineData = this.f;
            boolean bl2 = this.c;
            Object object3 = new fk0_2((dr0_0)object, feedEngineData, bl2, string2);
            object.getClass();
            dr0_0.c(object2, (Function0)object3);
            object = pp0_0.a;
            boolean bl3 = bl2 ^ true;
            object = bl3 ? "post brand follow" : "post brand unfollow";
            object2 = this.d;
            object3 = "";
            if (object2 == null) {
                object2 = object3;
            }
            if ((string2 = this.e.getPostId()) != null) {
                object3 = string2;
            }
            pp0_0.a((String)object, (String)object2, (String)object3);
        }
        return Unit.a;
    }
}

