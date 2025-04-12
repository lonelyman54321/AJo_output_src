/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.GameZoneRepo$Companion;
import com.ril.ajio.services.data.gamezop.GameZoneRewards;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.GameZoneApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class GameZoneRepo
implements BaseRepo {
    public static final int $stable = 0;
    public static final GameZoneRepo$Companion Companion;
    private static final String FIELD_FULL = "FULL";
    private static final String authorizedQueryParams;
    private static final String clientType;
    private static final String clientVersion;
    private final GameZoneApi gameZoneApi;
    private final UserInformation userInformation;

    static {
        Object object = new GameZoneRepo$Companion(null);
        Companion = object;
        $stable = 8;
        clientType = "Android";
        clientVersion = object = em_1.a(AJIOApplication.Companion);
        authorizedQueryParams = "client_type=Android&client_version=".concat((String)object);
    }

    public GameZoneRepo(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = UserInformation.getInstance(object);
        this.userInformation = object;
        object = AjioApiConnector.INSTANCE.getGameZoneApi();
        this.gameZoneApi = object;
    }

    public static /* synthetic */ DataCallback a(dl2_2 dl2_22) {
        return GameZoneRepo.getGameZoneRewards$lambda$0(dl2_22);
    }

    public static /* synthetic */ DataCallback b(oy0_1 oy0_12, Object object) {
        return GameZoneRepo.getGameZoneRewards$lambda$1(oy0_12, object);
    }

    public static /* synthetic */ DataCallback c(Throwable throwable) {
        return GameZoneRepo.getGameZoneRewards$lambda$2(throwable);
    }

    private static final DataCallback getGameZoneRewards$lambda$0(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "response");
        Object object2 = (GameZoneRewards)((dl2_2)object).b;
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
            String string4 = "gameZoneRewards";
            boolean bl3 = true;
            object = ApiErrorRepo.handleApiError$default(apiErrorRepo, (String)object2, (dl2_2)object, string4, bl3, null, null, n4, null);
        }
        return object;
    }

    private static final DataCallback getGameZoneRewards$lambda$1(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getGameZoneRewards$lambda$2(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "gameZoneRewards", false, null, null, 28, null);
    }

    public final g53_0 getGameZoneRewards(String string2, String string3, int n3) {
        Object object = string2;
        Object object2 = string3;
        Object object3 = "gameCode";
        Intrinsics.checkNotNullParameter(string2, (String)object3);
        String string4 = "sessionId";
        Intrinsics.checkNotNullParameter(string3, string4);
        HashMap<String, String> hashMap = this.userInformation.getUserId();
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{hashMap};
        String string5 = urlHelper.getApiUrl("my_account", "gamezop_rewards", objectArray);
        hashMap = new HashMap<String, String>();
        hashMap.put(string4, string3);
        hashMap.put((String)object3, string2);
        object = n3;
        hashMap.put("score", (String)object);
        GameZoneApi gameZoneApi = this.gameZoneApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string6 = kp1_0.c("Bearer ", (String)object);
        String string7 = clientType;
        Intrinsics.checkNotNullExpressionValue(string7, "clientType");
        String string8 = clientVersion;
        object = gameZoneApi.getGameZoneRewards(string5, string6, string7, string8, "gameZoneRewards", hashMap);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new py0_1(0, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }
}

