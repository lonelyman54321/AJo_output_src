/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.RVApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import io.reactivex.Scheduler;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class bD2 {
    public final jo_2 a;
    public final String b;
    public final String c;
    public final RVApi d;
    public final UserInformation e;

    public bD2(Context object) {
        jo_2 jo_22;
        Intrinsics.checkNotNullParameter(object, "context");
        this.a = jo_22 = new jo_2((Context)object);
        this.b = "Android";
        object = em_1.a(AJIOApplication.Companion);
        this.c = object;
        object = AjioApiConnector.INSTANCE.getRVApi();
        this.d = object;
        object = UserInformation.getInstance((Context)AJIOApplication$a.a());
        this.e = object;
    }

    public final u53_0 a(String object, String object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object2, "requestID");
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object3 = UrlHelper.Companion.getInstance();
        int n4 = 1;
        Object object4 = new Object[n4];
        object4[0] = object;
        String string2 = ((UrlHelper)object3).getApiUrl("pdp", "recently_viewed_list", (Object[])object4);
        object = cp_1.Companion;
        object.getClass();
        int n7 = cp$a.p();
        object3 = this.a;
        if (n7 != 0 && (object = ((jo_2)object3).f()) != null && (n7 = ((String)object).length()) != 0) {
            object = String.valueOf(((jo_2)object3).f());
            object4 = "customertype";
            hashMap.put(object4, object);
        }
        if ((object4 = ((UserInformation)(object = this.e)).getUserSegementIds()) != null && (n3 = ((String)object4).length()) != 0) {
            object4 = "segmentIds";
            object = ((UserInformation)object).getUserSegementIds();
            hashMap.put(object4, object);
        }
        object = h40_0.a;
        n7 = (int)(h40_0.b2() ? 1 : 0);
        if (n7 != 0) {
            object = "displayRatings";
            object4 = "true";
            hashMap.put(object, object4);
        }
        if ((n7 = (int)(h40_0.Q1() ? 1 : 0)) != 0 && (object = ((jo_2)object3).m()) != null && (n7 = ((String)object).length()) != 0) {
            object = String.valueOf(((jo_2)object3).m());
            object3 = "pincode";
            hashMap.put(object3, object);
        }
        object = CustomerStoreType.a;
        object = "rilfnl_v1";
        object3 = ScreenType.SCREEN_PDP;
        String string3 = CustomerStoreType.a((String)object, (ScreenType)((Object)object3));
        n7 = (int)(mz3_0.y(string3) ? 1 : 0);
        if (n7 != 0 && (n7 = (int)(ww0_2.c() ? 1 : 0)) != 0 && (n7 = string3.length()) != 0) {
            object = "userClusterId";
            hashMap.put(object, string3);
        }
        TU2.a(hashMap);
        String string4 = this.c;
        object4 = this.d;
        String string5 = this.b;
        object = object4.getRvProducts(string2, string5, string4, hashMap, (String)object2, string3);
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new sp2_2(object2, n4);
        object4 = new J02(2, (Function1)object3);
        object3 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new pq_1(object2, n4);
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }
}

