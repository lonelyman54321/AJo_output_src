/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.services.data.referral.transform.ReferralAjioWalletTransform;
import com.ril.ajio.services.data.referral.transform.ReferralFAQTransform;
import com.ril.ajio.services.data.referral.transform.ReferralImageDataTransform;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.UserApi;
import com.ril.ajio.services.network.api.UserApi$DefaultImpls;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class tH2
extends Hj {
    public final jH2 a;
    public final t30_0 b;
    public final zr1_1 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public ReferralImageDataTransform i;
    public ReferralAjioWalletTransform j;
    public ReferralFAQTransform k;
    public final zr1_1 l;
    public final zr1_1 m;

    public tH2(Application object) {
        jH2 jH22;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        this.a = jH22 = new jH2((Context)object);
        super();
        this.b = object;
        super();
        this.c = object;
        this.d = object;
        super();
        this.e = object;
        this.f = object;
        super();
        this.g = object;
        this.h = object;
        super();
        this.l = object;
        this.m = object;
    }

    public final void b(boolean bl2) {
        Object object;
        tH2 tH22 = this;
        Object object2 = this.c;
        Object object3 = this.e;
        Object object4 = this.g;
        Object object5 = this.a;
        object5.getClass();
        Intrinsics.checkNotNullParameter(object2, "referralImageMLD");
        Intrinsics.checkNotNullParameter(object3, "referralCashMLD");
        Object object6 = "referralFAQMLD";
        Intrinsics.checkNotNullParameter(object4, (String)object6);
        if (bl2) {
            object6 = g53_0.d(Boolean.TRUE);
            object = "just(...)";
            Intrinsics.checkNotNullExpressionValue(object6, (String)object);
        } else {
            object6 = UrlHelper.Companion.getInstance();
            object = new Object[]{};
            String string2 = "get_profile_uaas";
            String string3 = object6.getApiUrl("my_account", string2, object);
            object6 = ((jH2)object5).b;
            Intrinsics.checkNotNullExpressionValue(object6, "userInformation");
            object6 = ServiceUtil.getToken((UserInformation)object6);
            String string4 = kp1_0.c("Bearer ", (String)object6);
            String string5 = "UserProfile";
            UserApi userApi = ((jH2)object5).e;
            String string6 = ((jH2)object5).c;
            String string7 = ((jH2)object5).d;
            int n3 = 32;
            object6 = UserApi$DefaultImpls.getUserProfile$default(userApi, string3, string4, string6, string7, string5, null, n3, null);
            object = new Object();
            bx0_2 bx0_22 = new nh1_1(object, 1);
            object6.getClass();
            object = new k63_0((q63_0)object6, bx0_22);
            object6 = new xb_0(object5, 2);
            bx0_22 = new Yb(2, (Function1)object6);
            object6 = new n53_0((q63_0)object, bx0_22);
            int n4 = 3;
            object = new zb_0(object5, n4);
            int n7 = 3;
            bx0_22 = new ac_0(n7, (Function1)object);
            object = new k63_0((q63_0)object6, bx0_22);
            Intrinsics.checkNotNullExpressionValue(object, "onErrorResumeNext(...)");
            object6 = object;
        }
        object = new qg2_2((zr1_1)object2, (jH2)object5);
        object2 = new rg2_0(object);
        object = new n53_0((q63_0)object6, (bx0_2)object2);
        object2 = new sg2_1((zr1_1)object3, (jH2)object5);
        object3 = new tg2_0(object2);
        object2 = new n53_0((q63_0)object, (bx0_2)object3);
        object3 = new ug2_0((zr1_1)object4, (jH2)object5);
        object4 = new VG2((ug2_0)object3);
        object3 = new n53_0((q63_0)object2, (bx0_2)object4);
        Intrinsics.checkNotNullExpressionValue(object3, "flatMap(...)");
        object2 = qt2_2.c;
        object2 = ((g53_0)object3).h((Scheduler)object2);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = new lc_2(2);
        object4 = new m_0(1, (Function1)object3);
        object3 = new Object();
        object5 = new pH2((oH2)object3);
        object2 = ((g53_0)object2).f((o60_0)object4, (o60_0)object5);
        tH22.b.b((yr0_2)object2);
    }

    public final void onCleared() {
        super.onCleared();
        this.b.d();
    }
}

