/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from R22
 */
public final class r22_0
implements Function1 {
    public final /* synthetic */ q22_0 a;

    public /* synthetic */ r22_0(q22_0 q22_02) {
        this.a = q22_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        List list = object;
        list = (BaseResponse)object;
        cp_1.Companion.getClass();
        Object object2 = cp$a.e();
        object2.getClass();
        boolean bl2 = cp_1.I((BaseResponse)((Object)list));
        if (bl2 && (object2 = (HomeData)((BaseResponse)((Object)list)).getData()) != null && (object2 = ((HomeData)object2).getHomeRowData()) != null) {
            object2 = (Collection)object2;
            bl2 = object2.isEmpty();
            boolean bl3 = true;
            if ((bl2 ^= bl3) == bl3) {
                r22_0 r22_02;
                list = (HomeData)((BaseResponse)((Object)list)).getData();
                bl2 = false;
                object2 = null;
                if (list != null) {
                    list = ((HomeData)((Object)list)).getHomeRowData();
                    r22_02 = this;
                } else {
                    r22_02 = this;
                    list = null;
                }
                q22_0 q22_02 = r22_02.a;
                Object object3 = q22_02.Xa();
                list = list != null && (list = (HomeRowData)list.get(0)) != null ? ((HomeRowData)((Object)list)).getBanners() : null;
                ((xw0_2)object3).c = list;
                q22_02.lb();
                HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                list = q22_02.Xa().c;
                if (list != null) {
                    object2 = list = list.get(0);
                    object2 = (BannerData)((Object)list);
                }
                if (object2 != null) {
                    list = ((BannerData)object2).getUuid();
                    object3 = "0|0|";
                    list = kp1_0.c((String)object3, (String)((Object)list));
                    object2 = String.valueOf(((BannerData)object2).getBannerUrl());
                    hashMap.put(list, object2);
                }
                list = AnalyticsManager.Companion.getInstance();
                NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager)((Object)list)).getNewEEcommerceEventsRevamp();
                String string2 = o72_0.a;
                String string3 = q22_02.E0;
                String string4 = q22_02.F0;
                String string5 = "view_item";
                String string6 = "plp screen";
                String string7 = "";
                boolean bl4 = true;
                int n3 = 768;
                NewEEcommerceEventsRevamp.pushEEBannerImpression$default(newEEcommerceEventsRevamp, string5, hashMap, string2, string3, string6, string4, string7, bl4, false, null, n3, null);
                return Unit.a;
            }
        }
        r22_0 r22_03 = this;
        return Unit.a;
    }
}

