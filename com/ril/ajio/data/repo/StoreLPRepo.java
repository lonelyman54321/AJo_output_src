/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.sis.StoreMetaData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.StoreLpApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class StoreLPRepo
implements BaseRepo {
    public static final int $stable = 8;
    private final StoreLpApi storeLpApi;

    public StoreLPRepo() {
        StoreLpApi storeLpApi;
        this.storeLpApi = storeLpApi = AjioApiConnector.INSTANCE.getStoreLpApi();
    }

    public static /* synthetic */ DataCallback a(zp0_1 zp0_12, Object object) {
        return StoreLPRepo.getStoreCategories$lambda$4(zp0_12, object);
    }

    public static /* synthetic */ DataCallback b(StoreLPRepo storeLPRepo, dl2_2 dl2_22) {
        return StoreLPRepo.getStoreInfo$lambda$0(storeLPRepo, "BackGround_StoreMetaData", dl2_22);
    }

    public static /* synthetic */ DataCallback c(StoreLPRepo storeLPRepo, Throwable throwable) {
        return StoreLPRepo.getStoreInfo$lambda$2(storeLPRepo, "BackGround_StoreMetaData", throwable);
    }

    public static /* synthetic */ DataCallback d(xf2_1 xf2_12, Object object) {
        return StoreLPRepo.getStoreInfo$lambda$1(xf2_12, object);
    }

    public static /* synthetic */ DataCallback e(StoreLPRepo storeLPRepo, Throwable throwable) {
        return StoreLPRepo.getStoreCategories$lambda$5(storeLPRepo, "BackGround_AllCategories", throwable);
    }

    public static /* synthetic */ DataCallback f(StoreLPRepo storeLPRepo, dl2_2 dl2_22) {
        return StoreLPRepo.getStoreCategories$lambda$3(storeLPRepo, "BackGround_AllCategories", dl2_22);
    }

    private static final DataCallback getStoreCategories$lambda$3(StoreLPRepo object, String string2, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "navigationResp");
        Object object2 = (NavigationParent)dl2_22.b;
        Object[] objectArray = dl2_22.a;
        boolean bl2 = objectArray.d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            int n3 = objectArray.d();
            objectArray = null;
            String string3 = "StoreLpRepo";
            if (n3 != 0) {
                n3 = R$string.something_wrong_msg;
                object2 = hv3_0.K(n3);
                yn3$a yn3$a = yn3_0.a;
                yn3$a.l(string3);
                string3 = "Data not present";
                objectArray = new Object[]{};
                yn3$a.a(string3, objectArray);
            } else {
                object2 = dl2_22.c;
                if (object2 != null) {
                    object2 = ((il2_2)object2).k();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                yn3$a yn3$a = yn3_0.a;
                String string4 = "ErrorBody: ";
                string3 = U4.a(yn3$a, string3, string4, (String)object2);
                objectArray = new Object[]{};
                yn3$a.d(string3, objectArray);
            }
            object = super.handleApiError((String)object2, dl2_22, string2);
        }
        return object;
    }

    private static final DataCallback getStoreCategories$lambda$4(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getStoreCategories$lambda$5(StoreLPRepo storeLPRepo, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(storeLPRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return storeLPRepo.handleApiException(throwable, string2);
    }

    private static final DataCallback getStoreInfo$lambda$0(StoreLPRepo object, String string2, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (StoreMetaData)dl2_22.b;
        Object[] objectArray = dl2_22.a;
        boolean bl2 = objectArray.d();
        if (bl2 && object2 != null) {
            lr2_2.Companion.getClass();
            lR2$a.b((StoreMetaData)object2);
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            int n3 = objectArray.d();
            objectArray = null;
            String string3 = "StoreLpRepo";
            if (n3 != 0) {
                n3 = R$string.something_wrong_msg;
                object2 = hv3_0.K(n3);
                yn3$a yn3$a = yn3_0.a;
                yn3$a.l(string3);
                string3 = "Data not present";
                objectArray = new Object[]{};
                yn3$a.a(string3, objectArray);
            } else {
                object2 = dl2_22.c;
                if (object2 != null) {
                    object2 = ((il2_2)object2).k();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                yn3$a yn3$a = yn3_0.a;
                String string4 = "ErrorBody: ";
                string3 = U4.a(yn3$a, string3, string4, (String)object2);
                objectArray = new Object[]{};
                yn3$a.d(string3, objectArray);
            }
            object = super.handleApiError((String)object2, dl2_22, string2);
        }
        return object;
    }

    private static final DataCallback getStoreInfo$lambda$1(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getStoreInfo$lambda$2(StoreLPRepo storeLPRepo, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(storeLPRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return storeLPRepo.handleApiException(throwable, string2);
    }

    private final DataCallback handleApiError(String string2, dl2_2 dl2_22, String string3) {
        return ApiErrorRepo.handleApiError$default(ApiErrorRepo.INSTANCE, string2, dl2_22, string3, false, null, null, 56, null);
    }

    public final g53_0 getStoreCategories(String object) {
        Intrinsics.checkNotNullParameter(object, "storeId");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("homepage", "nav_menu", object3);
        object3 = Ft2.a((String)object, "appnavbar");
        object = Ft2.a((String)object, "appnavnode");
        object = this.storeLpApi.getCategoryNavigation((String)object2, (String)object3, (String)object, "BackGround_AllCategories");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new zp0_1(this, 1);
        object3 = new ap0_0(object2, 2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new kf0_1(this);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getStoreInfo(String object) {
        Intrinsics.checkNotNullParameter(object, "storeId");
        Object object2 = (StoreMetaData)g62_0.c.b.get(object);
        if (object2 != null) {
            object = g53_0.d(DataCallback.Companion.onSuccess(object2));
            Intrinsics.checkNotNull(object);
            return object;
        }
        lr2_2.Companion.getClass();
        object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("homepage", "sis_store_cms_meta_data", object3);
        object = this.storeLpApi.getStoreMetadata((String)object2, (String)object, "BackGround_StoreMetaData");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new xf2_1(this, 1);
        object3 = new y81_0(1, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new hf0_0(this);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final DataCallback handleApiException(Throwable throwable, String string2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }
}

