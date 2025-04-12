/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.CartApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SO
 */
public final class so_1 {
    public final CartApi a;
    public final jo_2 b;
    public final UserInformation c;

    public so_1(Application object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = AjioApiConnector.INSTANCE.getCartDataApi();
        this.a = object2;
        this.b = object2 = new jo_2((Context)object);
        object = UserInformation.getInstance((Context)object);
        this.c = object;
    }

    public final u53_0 a() {
        Object object;
        Object object2 = this.c;
        Object object3 = ((UserInformation)object2).getCustomerUUID();
        Object object4 = new HashMap();
        boolean bl2 = ((UserInformation)object2).isUserOnline();
        if (!bl2) {
            boolean bl3 = ap_0.c();
            if (bl3) {
                object3 = ap_0.a.getGuId();
                if (object3 == null) {
                    object3 = "";
                }
                object = "guid";
                ((HashMap)object4).put(object, object3);
            }
            object3 = ((UserInformation)object2).getUserId();
        }
        ((HashMap)object4).put("client_type", "Android");
        AJIOApplication.Companion.getClass();
        object = p90.a((Context)AJIOApplication$a.a());
        ((HashMap)object4).put("client_version", object);
        object = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{object3};
        object3 = ww0_2.d(((UrlHelper)object).getApiUrl("closet", "wishlist_microcart", objectArray));
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        object2 = ServiceUtil.getToken((UserInformation)object2);
        object2 = kp1_0.c("Bearer ", (String)object2);
        object2 = this.a.getCartWishListCount((String)object3, (Map)object4, (String)object2, "BackGround_CartWishListCount");
        object3 = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object3);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = new qo_1(this);
        object4 = new ro_2((qo_1)object3);
        object3 = new s53_0((q63_0)object2, (bx0_2)object4);
        object2 = new Object();
        object4 = new u53_0((q63_0)object3, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object4, "onErrorReturn(...)");
        return object4;
    }
}

