/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.pickfromstore.PickFromStore;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.network.api.StoreApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import io.reactivex.Scheduler;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public class PickFromStoreRepo
implements BaseRepo {
    public static final int $stable = 8;
    private final StoreApi storeApi;

    public PickFromStoreRepo() {
        StoreApi storeApi;
        this.storeApi = storeApi = AjioApiConnector.INSTANCE.getStoreApi();
    }

    public static /* synthetic */ DataCallback a(PickFromStoreRepo pickFromStoreRepo, String string2, Throwable throwable) {
        return PickFromStoreRepo.getPickUpStoreList$lambda$2(pickFromStoreRepo, string2, throwable);
    }

    public static /* synthetic */ DataCallback b(PickFromStoreRepo pickFromStoreRepo, String string2, dl2_2 dl2_22) {
        return PickFromStoreRepo.getPickUpStoreList$lambda$0(pickFromStoreRepo, string2, dl2_22);
    }

    public static /* synthetic */ DataCallback c(vs2_2 vs2_22, Object object) {
        return PickFromStoreRepo.getPickUpStoreList$lambda$1(vs2_22, object);
    }

    private static final DataCallback getPickUpStoreList$lambda$0(PickFromStoreRepo object, String string2, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (PickFromStore)dl2_22.b;
        Object[] objectArray = dl2_22.a;
        boolean bl2 = objectArray.d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            int n3 = objectArray.d();
            objectArray = null;
            String string3 = "AddressRepository";
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

    private static final DataCallback getPickUpStoreList$lambda$1(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getPickUpStoreList$lambda$2(PickFromStoreRepo pickFromStoreRepo, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(pickFromStoreRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return pickFromStoreRepo.handleApiException(throwable, string2);
    }

    private final DataCallback handleApiError(String string2, dl2_2 dl2_22, String string3) {
        return ApiErrorRepo.handleApiError$default(ApiErrorRepo.INSTANCE, string2, dl2_22, string3, false, null, null, 56, null);
    }

    public g53_0 getPickUpStoreList(String object, String object2, String object3, String object4, HashMap serializable) {
        Intrinsics.checkNotNullParameter(object, "userId");
        Intrinsics.checkNotNullParameter(object2, "requestID");
        Intrinsics.checkNotNullParameter(object3, "accessToken");
        Intrinsics.checkNotNullParameter(object4, "cartID");
        Intrinsics.checkNotNullParameter(serializable, "query");
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        UrlHelper urlHelper = urlHelper$Companion.getInstance();
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object4;
        object = urlHelper.getApiUrl("cart", "pick_from_store_list", objectArray);
        object = urlHelper$Companion.getInstance().addParams((String)object, (HashMap)serializable);
        object4 = this.storeApi;
        serializable = new StringBuilder("Bearer ");
        ((StringBuilder)serializable).append((String)object3);
        object3 = ((StringBuilder)serializable).toString();
        object = object4.getStorePickUpList((String)object, (String)object3, (String)object2);
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new vs2_2(this, (String)object2);
        object4 = new ac_0(n3, (Function1)object3);
        object3 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new ws2_2(this, (String)object2);
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }

    public final DataCallback handleApiException(Throwable throwable, String string2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }
}

