/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.earlyaccess.entity.EarlyAccessBannerData;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.kmm.shared.util.CommonFlow;
import com.ril.ajio.kmm.shared.util.CommonFlowKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xw0
 */
public final class xw0_2
extends jD3 {
    public final kb3_2 a;
    public final CommonFlow b;
    public List c;

    public xw0_2() {
        BaseResponse baseResponse;
        ResponseStatusType responseStatusType = ResponseStatusType.API_LOADING;
        Object object = baseResponse;
        baseResponse = new BaseResponse(responseStatusType, null, null, null, null, null, 62, null);
        this.a = object = lb3_2.a(baseResponse);
        this.b = object = CommonFlowKt.asCommonFlow((es0_2)object);
    }

    public static boolean b(String object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "cohortIds");
        boolean bl3 = mz3_0.y((String)object);
        boolean bl4 = false;
        if (bl3) {
            Object object2;
            object = tr2_2.a;
            object = tr2_2.b();
            if (object != null) {
                object = ((EarlyAccessBannerData)object).getEnableEarlyAccess();
                object2 = Boolean.TRUE;
                bl3 = Intrinsics.areEqual(object, object2);
            } else {
                bl3 = false;
                object = null;
            }
            if (bl3 && !(bl3 = tr2_2.i())) {
                object = tr2_2.c;
                object2 = qr2_1.PRE_SALE;
                if (object == object2) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object = null;
                }
                if (!bl3 && !bl2) {
                    bl4 = true;
                }
            }
        }
        return bl4;
    }

    public final void c(ScreenInfo screenInfo, String string2, HomeReq homeReq, Map map2, Map map3) {
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(homeReq, "homeReq");
        aW aW2 = md3_0.c(this);
        Xw0$a xw0$a = new Xw0$a(this);
        Xw0$b xw0$b = new Xw0$b(screenInfo, string2, homeReq, map2, map3, this, null);
        Ae3.d(aW2, xw0$a, null, xw0$b, 2);
    }
}

