/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.ReferralApi;
import com.ril.ajio.services.network.api.UserApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class jH2 {
    public final ReferralApi a;
    public final UserInformation b;
    public final String c;
    public final String d;
    public final UserApi e;

    public jH2(Context object) {
        ReferralApi referralApi;
        Intrinsics.checkNotNullParameter(object, "context");
        AjioApiConnector ajioApiConnector = AjioApiConnector.INSTANCE;
        this.a = referralApi = ajioApiConnector.getReferralApi();
        object = UserInformation.getInstance(object);
        this.b = object;
        this.c = "Android";
        object = em_1.a(AJIOApplication.Companion);
        this.d = object;
        object = ajioApiConnector.getUserApi();
        this.e = object;
    }

    public static DataCallback d(String string2, Throwable throwable, boolean bl2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, bl2, null, null, 24, null);
    }

    public final u53_0 a(zr1_1 object) {
        Intrinsics.checkNotNullParameter(object, "referralCashMLD");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = this.b;
        Object object4 = ((UserInformation)object3).getUserId();
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object4;
        String string2 = ((UrlHelper)object2).getApiUrl("referral", "referral_wallet_balance", objectArray);
        Intrinsics.checkNotNullExpressionValue(object3, "userInformation");
        object2 = ServiceUtil.getToken((UserInformation)object3);
        String string3 = kp1_0.c("Bearer ", (String)object2);
        String string4 = this.c;
        Intrinsics.checkNotNullExpressionValue(string4, "clientType");
        ReferralApi referralApi = this.a;
        String string5 = this.d;
        object2 = referralApi.getReferralCash(string2, string3, string4, string5, "referral_cash");
        object3 = new WG2((zr1_1)object, this);
        object4 = new XG2((WG2)object3);
        object2.getClass();
        object3 = new k63_0((q63_0)object2, (bx0_2)object4);
        object2 = new yg2_0((zr1_1)object, this);
        object4 = new wc0_0(object2, n3);
        object2 = new n53_0((q63_0)object3, (bx0_2)object4);
        object3 = new zg2_0((zr1_1)object, this);
        object = new uf0_1(object3);
        object3 = new k63_0((q63_0)object2, (bx0_2)object);
        object = new Object();
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }

    public final u53_0 b(zr1_1 object, String object2) {
        Intrinsics.checkNotNullParameter(object, "referralFAQMLD");
        Intrinsics.checkNotNullParameter(object2, "pageLabel");
        Object object3 = UrlHelper.Companion.getInstance();
        int n3 = 1;
        Object object4 = new Object[n3];
        object4[0] = object2;
        String string2 = ((UrlHelper)object3).getApiUrl("referral", "referral_faq", object4);
        object2 = this.b;
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        object2 = ServiceUtil.getToken((UserInformation)object2);
        String string3 = kp1_0.c("Bearer ", (String)object2);
        String string4 = this.c;
        Intrinsics.checkNotNullExpressionValue(string4, "clientType");
        ReferralApi referralApi = this.a;
        String string5 = this.d;
        object2 = referralApi.getReferralFAQ(string2, string3, string4, string5, "BackGround_referral_faq");
        object3 = new mg2_1((zr1_1)object, this);
        object4 = new tc0_1(object3, n3);
        object2.getClass();
        object3 = new k63_0((q63_0)object2, (bx0_2)object4);
        object2 = new bH2((zr1_1)object, this);
        yc0_0 yc0_02 = new yc0_0((Function1)object2);
        object2 = new n53_0((q63_0)object3, yc0_02);
        object3 = new fH2((zr1_1)object, this);
        object = new ad0_2(3, (Function1)object3);
        object3 = new k63_0((q63_0)object2, (bx0_2)object);
        object = new Object();
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }

    public final k63_0 c(zr1_1 object) {
        Intrinsics.checkNotNullParameter(object, "referralConfigCashMLD");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = "referral";
        Object object4 = new Object[]{object3};
        String string2 = ((UrlHelper)object2).getApiUrl((String)object3, "referral_configs", object4);
        object2 = this.b;
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        object2 = ServiceUtil.getToken((UserInformation)object2);
        String string3 = kp1_0.c("Bearer ", (String)object2);
        String string4 = this.c;
        Intrinsics.checkNotNullExpressionValue(string4, "clientType");
        ReferralApi referralApi = this.a;
        String string5 = this.d;
        object2 = referralApi.getReferralConfigs(string2, string3, string4, string5, "referral_configs");
        object3 = new gH2((zr1_1)object, this);
        object4 = new hH2((gH2)object3);
        object2.getClass();
        object3 = new k63_0((q63_0)object2, (bx0_2)object4);
        object2 = new iH2((zr1_1)object, this);
        object4 = new ng2_0(object2);
        object2 = new n53_0((q63_0)object3, (bx0_2)object4);
        object3 = new og2_0((zr1_1)object, this);
        object = new pg2_1(object3);
        object3 = new k63_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorResumeNext(...)");
        return object3;
    }
}

