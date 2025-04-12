/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.network.api.RtbApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.mp.services.R$string;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class RtbRepo {
    public static final int $stable = 8;
    private final jo_2 appPreferences;
    private final RtbApi rtbApi;

    public RtbRepo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object object = AjioApiConnector.INSTANCE.getRtbApi();
        this.rtbApi = object;
        this.appPreferences = object = new jo_2(context);
    }

    public static /* synthetic */ DataCallback a(qa_0 qa_02, Object object) {
        return RtbRepo.sendRTBRequest$lambda$1(qa_02, object);
    }

    public static /* synthetic */ DataCallback b(String string2, Throwable throwable) {
        return RtbRepo.sendRTBRequest$lambda$2("BackGround_RTB_Request", string2, throwable);
    }

    public static /* synthetic */ DataCallback c(String string2, dl2_2 dl2_22) {
        return RtbRepo.sendRTBRequest$lambda$0("BackGround_RTB_Request", string2, dl2_22);
    }

    private static final DataCallback sendRTBRequest$lambda$0(String object, String string2, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(string2, "$screenName");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (il2_2)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 16;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, string2, null, n3, null);
        }
        return object;
    }

    private static final DataCallback sendRTBRequest$lambda$1(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback sendRTBRequest$lambda$2(String string2, String string3, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(string3, "$screenName");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, string3, null, 16, null);
    }

    public final g53_0 sendRTBRequest(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "Url");
        Intrinsics.checkNotNullParameter(object2, "screenName");
        int n3 = R$string.rtb_url;
        String string2 = this.appPreferences.a();
        int n4 = 3;
        Object[] objectArray = new Object[n4];
        objectArray[0] = "AAID";
        objectArray[1] = string2;
        int n7 = 2;
        objectArray[n7] = object;
        object = hv3_0.L(n3, objectArray);
        AnalyticsManager.Companion.getInstance().getFirebaseEvents().pushRTBApiFiredEvent((String)object2);
        object = this.rtbApi.sendRTBRequest((String)object, "BackGround_RTB_Request");
        Object object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = qt2_2.b;
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new qa_0(object2, n4);
        jp2_1 jp2_12 = new jp2_1((Function1)object3);
        object3 = new s53_0((q63_0)object, jp2_12);
        object = new x02(object2, n7);
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }
}

