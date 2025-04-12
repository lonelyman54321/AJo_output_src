/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eo2
 */
public final class eo2_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eo2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                hy3_0 hy3_02 = (hy3_0)this.b;
                Intrinsics.checkNotNullParameter(hy3_02, "this$0");
                hy3_02.l.k(object);
                return Unit.a;
            }
            case 0: 
        }
        Object object2 = object;
        object2 = (dl2_2)object;
        object = (oo2_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = "PAYMENT_PayNowByEMI";
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
                    int n4 = cl2_22.d;
                    oo2_1.h(n4, string2, (String)object2);
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

