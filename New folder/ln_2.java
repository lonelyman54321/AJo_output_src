/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lN
 */
public final class ln_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ln_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object4 = object;
                object4 = (dl2_2)object;
                object3 = (oo2_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                String string2 = "PAYMENT_PayNowByCOD";
                Intrinsics.checkNotNullParameter(string2, "$requestID");
                Intrinsics.checkNotNullParameter(object4, "response");
                object = (JsonObject)((dl2_2)object4).b;
                object2 = ((dl2_2)object4).a;
                n4 = (int)(((cl2_2)object2).d() ? 1 : 0);
                if (n4 != 0 && object != null) {
                    Object object5 = (PayNowResponse)JsonUtils.fromJson(JsonUtils.toJson(object), PayNowResponse.class);
                    String string3 = null;
                    object4 = object5 != null && (object4 = ((PayNowResponse)object5).getError()) != null ? ((Error)object4).getCode() : null;
                    if (object4 != null) {
                        object4 = ((PayNowResponse)object5).getError();
                        if (object4 != null) {
                            string3 = ((Error)object4).getDescription();
                        }
                        if (string3 != null) {
                            if ((object5 = ((PayNowResponse)object5).getError()) == null || (object5 = ((Error)object5).getDescription()) == null) {
                                object5 = "";
                            }
                            object3.getClass();
                            int n7 = ((cl2_2)object2).d;
                            oo2_1.h(n7, string2, (String)object5);
                        }
                    }
                    object2 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object2).onSuccess(object);
                } else {
                    ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                    String string4 = "single page checkout";
                    String string5 = "Forward";
                    boolean bl2 = true;
                    object = apiErrorRepo.handleApiError((dl2_2)object4, string2, bl2, string4, string5);
                }
                return object;
            }
            case 2: {
                object = (DataCallback)object;
                object3 = (db2_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                ((db2_1)object3).u.k(object);
                return Unit.a;
            }
            case 1: {
                object = (Throwable)object;
                object3 = (ky1_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = ((ky1_0)object3).k;
                Intrinsics.checkNotNull(object);
                object = ((ky1_0)object3).c.handleApiException((Throwable)object, "ShowWishList");
                ((LiveData)object2).k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        qn$a_0 qn$a_0 = qn_2.Companion;
        object3 = (qn_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        Intrinsics.checkNotNullParameter(object, "userDataCallback");
        object2 = cp_1.Companion;
        boolean bl3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (bl3 && (n3 = ((DataCallback)object).getStatus()) == 0) {
            ((qn_2)object3).Qa();
        }
        return Unit.a;
    }
}

