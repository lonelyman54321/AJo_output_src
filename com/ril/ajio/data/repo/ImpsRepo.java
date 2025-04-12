/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.ImpsRepo$Companion;
import com.ril.ajio.services.data.Order.IfscResponse;
import com.ril.ajio.services.data.Order.ImpsData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.ImpsApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QueryImps;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ImpsRepo
implements BaseRepo {
    public static final int $stable = 0;
    public static final ImpsRepo$Companion Companion;
    private static final String FIELD_FULL = "FULL";
    private static final String authorizedQueryParams;
    private static final String clientType;
    private static final String clientVersion;
    private final ImpsApi impsApi;
    private final UserInformation userInformation;

    static {
        Object object = new ImpsRepo$Companion(null);
        Companion = object;
        $stable = 8;
        clientType = "Android";
        clientVersion = object = em_1.a(AJIOApplication.Companion);
        authorizedQueryParams = "client_type=Android&client_version=".concat((String)object);
    }

    public ImpsRepo() {
        Object object = VX0.a(AJIOApplication.Companion);
        this.userInformation = object;
        this.impsApi = object = AjioApiConnector.INSTANCE.getImpsApi();
    }

    public static /* synthetic */ DataCallback a(dl2_2 dl2_22) {
        return ImpsRepo.getIfscDetail$lambda$0(dl2_22);
    }

    public static /* synthetic */ DataCallback b(j5_0 j5_02, Object object) {
        return ImpsRepo.getIfscDetail$lambda$1(j5_02, object);
    }

    public static /* synthetic */ DataCallback c(qj0_1 qj0_12, Object object) {
        return ImpsRepo.getImps$lambda$4(qj0_12, object);
    }

    public static /* synthetic */ DataCallback d(Throwable throwable) {
        return ImpsRepo.getIfscDetail$lambda$2(throwable);
    }

    public static /* synthetic */ DataCallback e(Throwable throwable) {
        return ImpsRepo.getImps$lambda$5(throwable);
    }

    public static /* synthetic */ DataCallback f(dl2_2 dl2_22) {
        return ImpsRepo.getImps$lambda$3(dl2_22);
    }

    private static final DataCallback getIfscDetail$lambda$0(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "response");
        Object object2 = (IfscResponse)((dl2_2)object).b;
        Object[] objectArray = ((dl2_2)object).a;
        boolean bl2 = objectArray.d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            int n3 = objectArray.d();
            objectArray = null;
            if (n3 != 0) {
                n3 = R$string.pdp_details_not_available;
                object2 = hv3_0.K(n3);
                yn3$a yn3$a = yn3_0.a;
                String string2 = "Data not present";
                objectArray = new Object[]{};
                yn3$a.a(string2, objectArray);
            } else {
                object2 = ((dl2_2)object).c;
                if (object2 != null) {
                    object2 = ((il2_2)object2).k();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                yn3$a yn3$a = yn3_0.a;
                String string3 = kp1_0.c("ErrorBody: ", (String)object2);
                objectArray = new Object[]{};
                yn3$a.d(string3, objectArray);
            }
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            int n4 = 48;
            String string4 = "ifscDetail";
            boolean bl3 = true;
            object = ApiErrorRepo.handleApiError$default(apiErrorRepo, (String)object2, (dl2_2)object, string4, bl3, null, null, n4, null);
        }
        return object;
    }

    private static final DataCallback getIfscDetail$lambda$1(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getIfscDetail$lambda$2(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "ifscDetail", false, null, null, 28, null);
    }

    private static final DataCallback getImps$lambda$3(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "response");
        Object object2 = (ImpsData)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "impsRequest";
            boolean bl3 = true;
            object3 = object;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object, string2, bl3, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getImps$lambda$4(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getImps$lambda$5(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "impsRequest", true, null, null, 24, null);
    }

    public final g53_0 getIfscDetail(String object) {
        Object object2;
        int n3 = 1;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            Intrinsics.checkNotNull(object);
            object = ((String)object).toUpperCase();
            object2 = "toUpperCase(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        } else {
            object = "";
        }
        object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[n3];
        object3[0] = object;
        object = ((UrlHelper)object2).getApiUrl("order", "ifsc_check", object3);
        object2 = this.impsApi;
        object3 = clientType;
        Intrinsics.checkNotNullExpressionValue(object3, "clientType");
        String string2 = clientVersion;
        object = object2.getIfscData((String)object, (String)object3, string2, "ifscDetail");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new j5_0(n3);
        object3 = new k5(object2, n3);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new l5(n3);
        u53_0 u53_02 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(u53_02, "onErrorReturn(...)");
        return u53_02;
    }

    public final g53_0 getImps(QueryImps object, String object2) {
        Intrinsics.checkNotNullParameter(object, "queryImps");
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        object3 = ((UrlHelper)object3).getApiUrl("order", "imps_request", object4);
        object4 = authorizedQueryParams;
        String string2 = n1.a((String)object3, "?fields=FULL&", (String)object4);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object3 = ((QueryImps)object).getExtnSalesOrderNo();
        object4 = ((QueryImps)object).getExtnBeneAccNo();
        String string3 = ((QueryImps)object).getExtnBeneIFSC();
        Object object5 = ((QueryImps)object).getExtnBeneMobileNo();
        String string4 = ((QueryImps)object).getExtnBeneCustomerMailId();
        String string5 = ((QueryImps)object).getExtnAmount();
        String string6 = ((QueryImps)object).getExtnReturnOrderNo();
        object = ((QueryImps)object).getAjiowalletpage();
        String string7 = "\", \"ExtnBeneAccNo\":\"";
        String string8 = "\", \"ExtnBeneIFSC\":\"";
        object3 = og_1.a("{\"ExtnSalesOrderNo\":\"", (String)object3, string7, (String)object4, string8);
        String string9 = "\", \"ExtnBeneCustomerMailId\":\"";
        X50.a((StringBuilder)object3, string3, "\", \"ExtnBeneMobileNo\":\"", (String)object5, string9);
        string3 = "\", \"ExtnReturnOrderNo\":\"";
        X50.a((StringBuilder)object3, string4, "\", \"ExtnAmount\":\"", string5, string3);
        ((StringBuilder)object3).append(string6);
        object4 = "\",\"ajiowalletpage\":\"";
        ((StringBuilder)object3).append((String)object4);
        ((StringBuilder)object3).append(object);
        ((StringBuilder)object3).append("\"}");
        object = ((StringBuilder)object3).toString();
        object3 = "impsJson";
        hashMap.put(object3, object);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            Intrinsics.checkNotNull(object2);
            object = "adId";
            hashMap.put(object, object2);
        }
        object5 = this.impsApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        string4 = kp1_0.c("Bearer ", (String)object);
        string5 = clientType;
        Intrinsics.checkNotNullExpressionValue(string5, "clientType");
        string6 = clientVersion;
        object = object5.getImpsData(string2, string4, string5, string6, "impsRequest", hashMap);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new qj0_1(1);
        object3 = new lf1_2((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }
}

