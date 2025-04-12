/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from oD2
 */
public final class od2_0
implements Function2 {
    public final /* synthetic */ wd2_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ od2_0(wd2_0 wd2_02, int n3) {
        this.a = wd2_02;
        this.b = n3;
    }

    public final Object invoke(Object object, Object objectArray) {
        Object object2 = null;
        int n3 = 1;
        Object object3 = object;
        object3 = (Long)object;
        long l2 = (Long)object3;
        Object object4 = objectArray;
        object4 = (Long)objectArray;
        long l3 = (Long)object4;
        Object object5 = this.a;
        Intrinsics.checkNotNullParameter(object5, "this$0");
        AJIOApplication.Companion.getClass();
        ArrayList<Object[]> arrayList = AJIOApplication$a.a();
        boolean bl2 = vV1.e((Context)arrayList);
        if (bl2) {
            object5 = ((wd2_0)object5).a;
            if (object5 != null) {
                arrayList = sE2.a;
                arrayList = new ArrayList<Object[]>();
                object4 = String.valueOf(l3);
                arrayList.add((Object[])object4);
                object4 = sE2.a;
                String string2 = ((UserInformation)object4).getCustomerUUID();
                Object object6 = UrlHelper.Companion.getInstance();
                Object object7 = new Object[n3];
                object7[0] = string2;
                object7 = ((UrlHelper)object6).getApiUrl("ratings", "delete_review_images", object7);
                Intrinsics.checkNotNullExpressionValue(object4, "userInformation");
                object2 = ServiceUtil.getToken((UserInformation)object4);
                string2 = "Bearer ";
                String string3 = kp1_0.c(string2, (String)object2);
                String string4 = String.valueOf(l2);
                object2 = ((UserInformation)object4).getUserEmailId();
                Intrinsics.checkNotNullExpressionValue(object2, "getUserEmailId(...)");
                object6 = sE2.b;
                String string5 = sE2.e;
                String string6 = sE2.c;
                String string7 = sE2.d;
                String string8 = "deleteReviewImage";
                object2 = object6.deleteReviewImage((String)object7, string5, string3, string6, string7, string8, string4, arrayList, (String)object2);
                object3 = qt2_2.c;
                object2 = ((g53_0)object2).h((Scheduler)object3);
                object3 = ti_2.a();
                object2 = ((g53_0)object2).e((Scheduler)object3);
                object3 = new Object();
                Object object8 = new B12(n3, (Function1)object3);
                object3 = new s53_0((q63_0)object2, (bx0_2)object8);
                object2 = new C12(n3);
                Object object9 = new u53_0((q63_0)object3, (bx0_2)object2);
                Intrinsics.checkNotNullExpressionValue(object9, "onErrorReturn(...)");
                int n4 = this.b;
                object2 = new xd2_0((gE2)object5, n4);
                object8 = new yd2_0((xd2_0)object2);
                object2 = new zd2_0((gE2)object5, n4);
                object3 = new ae2_0((zd2_0)object2);
                object2 = ((g53_0)object9).f((o60_0)object8, (o60_0)object3);
                object9 = ((gE2)object5).c;
                ((t30_0)object9).b((yr0_2)object2);
                object2 = Unit.a;
            } else {
                object2 = null;
            }
        } else {
            int n7 = R$string.pesdk_internet_alert_msg;
            object3 = hv3_0.K(n7);
            Object object10 = StringCompanionObject.INSTANCE;
            int n8 = R$string.acc_error_message;
            object10 = hv3_0.K(n8);
            object4 = new Object[n3];
            object4[0] = object3;
            object2 = xh2_0.a((Object[])object4, n3, (String)object10, "format(...)");
            hv3_0 hv3_02 = hv3_0.a;
            hv3_02.getClass();
            hv3_0.l0((String)object3, (String)object2);
            object2 = Unit.a;
        }
        return object2;
    }
}

