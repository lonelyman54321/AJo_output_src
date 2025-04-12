/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import com.ril.ajio.services.data.referral.transform.ReferralFAQTransform;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wc
 */
public final class wc_1
extends Hj {
    public final dc a;
    public final jH2 b;
    public final t30_0 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;
    public AjioWalletTransform j;
    public ReferralConfigCash k;
    public ReferralFAQTransform l;

    public wc_1(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Object object2 = dc.a;
        this.a = object2;
        this.b = object2 = new jH2((Context)object);
        super();
        this.c = object;
        super();
        this.d = object;
        this.e = object;
        super();
        this.f = object;
        this.g = object;
        super();
        this.h = object;
        this.i = object;
    }

    public final void b() {
        Object object = this.d;
        this.a.getClass();
        Intrinsics.checkNotNullParameter(object, "ajioWalletMLD");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = dc.c;
        Object object4 = ((UserInformation)object3).getUserId();
        Object[] objectArray = new Object[]{object4};
        object2 = ((UrlHelper)object2).getApiUrl("ajio_cash", "cash_bonus", objectArray);
        Intrinsics.checkNotNullExpressionValue(object3, "userInformation");
        object3 = ServiceUtil.getToken((UserInformation)object3);
        object3 = kp1_0.c("Bearer ", (String)object3);
        object2 = dc.b.getAjioWallet((String)object2, (String)object3, "AJIOCashBonus");
        object3 = new xb_0(object, 0);
        object4 = new Yb(0, (Function1)object3);
        object2.getClass();
        object3 = new k63_0((q63_0)object2, (bx0_2)object4);
        object2 = new zb_0(object, 0);
        object4 = new ac_0(0, (Function1)object2);
        object2 = new n53_0((q63_0)object3, (bx0_2)object4);
        object3 = new bc_1(object, 0);
        object = new cc_1((Function1)object3);
        object3 = new k63_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorResumeNext(...)");
        object = qt2_2.c;
        object = ((g53_0)object3).h((Scheduler)object);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new vc((uc_1)object2);
        object2 = new fc_2(0);
        object4 = new gc_0(0, (Function1)object2);
        q60_0 q60_02 = ((g53_0)object).f((o60_0)object3, (o60_0)object4);
        this.c.b(q60_02);
    }

    public final void onCleared() {
        super.onCleared();
        this.c.d();
    }
}

