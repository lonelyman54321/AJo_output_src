/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ao2
 */
public final class ao2_2
implements Function1 {
    public final /* synthetic */ oo2_1 a;

    public /* synthetic */ ao2_2(oo2_1 oo2_12) {
        this.a = oo2_12;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (dl2_2)object;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = "PAYMENT_PayNowByCard";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "response");
        Object object3 = (JsonObject)((dl2_2)object2).b;
        cl2_2 cl2_22 = ((dl2_2)object2).a;
        boolean bl2 = cl2_22.d();
        if (bl2 && object3 != null) {
            Object object4;
            object2 = (PayNowResponse)JsonUtils.fromJson(JsonUtils.toJson(object3), PayNowResponse.class);
            bl2 = false;
            String string3 = null;
            object4 = object2 != null && (object4 = ((PayNowResponse)object2).getError()) != null ? ((Error)object4).getCode() : null;
            if (object4 != null) {
                object4 = ((PayNowResponse)object2).getError();
                if (object4 != null) {
                    string3 = ((Error)object4).getDescription();
                }
                if (string3 != null) {
                    if ((object2 = ((PayNowResponse)object2).getError()) == null || (object2 = ((Error)object2).getDescription()) == null) {
                        object2 = "";
                    }
                    object.getClass();
                    int n3 = cl2_22.d;
                    oo2_1.h(n3, string2, (String)object2);
                }
            }
            object = DataCallback.Companion.onSuccess(object3);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            String string4 = "single page checkout";
            String string5 = "Forward";
            boolean bl3 = true;
            object = ((ApiErrorRepo)object3).handleApiError((dl2_2)object2, string2, bl3, string4, string5);
        }
        return object;
    }
}

