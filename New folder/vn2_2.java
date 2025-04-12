/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.google.gson.JsonObject;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.OrderDetailFunctionalRepo;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.CustomerCare.ChatStatus;
import com.ril.ajio.services.data.CustomerCare.InitiateChat;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Vn2
 */
public final class vn2_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vn2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 0;
        Object object3 = null;
        int n7 = 1;
        Object[] objectArray = this.b;
        Object object4 = "this$0";
        int bl2 = this.a;
        switch (bl2) {
            default: {
                Object object5 = object;
                object5 = (Throwable)object;
                objectArray = (hy3_0)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object4);
                object = objectArray.s;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object5);
                object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object5, "UpdateUserProfile", false, null, null, 28, null);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                objectArray = (yn2_2)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object4);
                object4 = cp_1.Companion;
                boolean bl3 = nn_2.b((cp$a)object4, (DataCallback)object);
                if (bl3) {
                    int n8;
                    object4 = "requireActivity(...)";
                    if (object != null && (n8 = ((DataCallback)object).getStatus()) == 0) {
                        objectArray.P = object = (InitiateChat)((DataCallback)object).getData();
                        if (object != null) {
                            int n10;
                            if ((object = ((InitiateChat)object).getStatus()) != null && ((object = objectArray.P) == null || (object = ((InitiateChat)object).getStatus()) == null || (n10 = ((ChatStatus)object).getStatusCode()) != 0)) {
                                object = objectArray.P;
                                Intrinsics.checkNotNull(object);
                                object = ((InitiateChat)object).getStatus();
                                Intrinsics.checkNotNull(object);
                                object = ((ChatStatus)object).getMessageDescription();
                                Intrinsics.checkNotNull(object);
                                object2 = StringCompanionObject.INSTANCE;
                                n3 = R$string.acc_alert_message;
                                object2 = hv3_0.K(n3);
                                objectArray = new Object[n7];
                                objectArray[0] = object;
                                object3 = "format(...)";
                                ZK1.e(objectArray, n7, (String)object2, (String)object3, (String)object);
                            } else {
                                object = OrderDetailFunctionalRepo.INSTANCE;
                                Object object6 = objectArray.h;
                                Object object7 = objectArray.B;
                                object6 = ((OrderDetailFunctionalRepo)object).getReturnObject((CartOrder)object6, (String)object7);
                                object7 = objectArray.h;
                                Object object8 = objectArray.B;
                                object = ((OrderDetailFunctionalRepo)object).getReturnOrderRawStatus((CartOrder)object7, (String)object8);
                                if (object6 != null && (object7 = ((ReturnRequest)object6).getReturnEntries()) != null && (object7 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object7)) != null) {
                                    object7 = ((OrderDetailLineItem)object7).getEntry();
                                } else {
                                    boolean bl4 = false;
                                    object7 = null;
                                }
                                object8 = UserInformation.getInstance(objectArray.requireContext().getApplicationContext());
                                String string2 = ((UserInformation)object8).getUserEmailId();
                                String string3 = ((UserInformation)object8).getUserName();
                                object8 = ((UserInformation)object8).getCustomerUUID();
                                String string4 = cp$a.a();
                                Object object9 = objectArray.h;
                                object9 = object9 != null ? ((CartOrder)object9).getCode() : null;
                                if (object == null) {
                                    if (object6 != null) {
                                        object = ((ReturnRequest)object6).getReturnStatus();
                                    } else {
                                        n10 = 0;
                                        object = null;
                                    }
                                }
                                object6 = objectArray.Pa();
                                Object object10 = object7 != null ? ((CartEntry)object7).getProduct() : null;
                                object6.getClass();
                                object6 = qz1_2.q((Product)object10);
                                if (object7 != null) {
                                    object2 = ((CartEntry)object7).getCode();
                                }
                                boolean bl5 = objectArray.Q;
                                String string5 = "|Customer Name:";
                                String string6 = "|Customer Email:";
                                object8 = og_1.a("Customer ID:", (String)object8, string5, string3, string6);
                                object10 = "|Order Status:";
                                X50.a((StringBuilder)object8, string2, "|Order Number:", (String)object9, (String)object10);
                                string2 = "|Issue Category:Where is my order?|Product Name:";
                                string3 = "|Product Code:";
                                X50.a((StringBuilder)object8, (String)object, string2, (String)object6, string3);
                                ((StringBuilder)object8).append((String)object2);
                                ((StringBuilder)object8).append("|Luxury Order:");
                                ((StringBuilder)object8).append(bl5);
                                ((StringBuilder)object8).append("|Intervention Intent:POST_ORDER|Source:ODP");
                                object = ((StringBuilder)object8).toString();
                                n3 = (int)(TextUtils.isEmpty((CharSequence)string4) ? 1 : 0);
                                if (n3 == 0) {
                                    object2 = "|version:";
                                    object = n1.a((String)object, (String)object2, string4);
                                }
                                object = Ft2.a((String)object, "{task}");
                                object2 = objectArray.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                                object6 = objectArray.P;
                                Intrinsics.checkNotNull(object6);
                                v31.c((FragmentActivity)object2, (InitiateChat)object6, (String)object, false);
                            }
                        }
                    } else {
                        int n14 = ((DataCallback)object).getStatus();
                        if (n14 == n7) {
                            object = ab0_0.Companion;
                            object2 = objectArray.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                            object.getClass();
                            aB0$a.a((Activity)object2);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object3 = object;
        object3 = (dl2_2)object;
        objectArray = (oo2_1)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object4);
        String string7 = "PAYMENT_PayNowByIW";
        Intrinsics.checkNotNullParameter(string7, "$requestID");
        Intrinsics.checkNotNullParameter(object3, "response");
        object = (JsonObject)((dl2_2)object3).b;
        object4 = ((dl2_2)object3).a;
        boolean bl6 = ((cl2_2)object4).d();
        if (bl6 && object != null) {
            object3 = JsonUtils.toJson(object);
            Object object11 = PayNowResponse.class;
            if ((object3 = (PayNowResponse)JsonUtils.fromJson((String)object3, object11)) != null && (object11 = ((PayNowResponse)object3).getError()) != null) {
                object11 = ((Error)object11).getCode();
            } else {
                boolean bl7 = false;
                object11 = null;
            }
            if (object11 != null) {
                object11 = ((PayNowResponse)object3).getError();
                if (object11 != null) {
                    object2 = ((Error)object11).getDescription();
                }
                if (object2 != null) {
                    object2 = ((PayNowResponse)object3).getError();
                    if (object2 == null || (object2 = ((Error)object2).getDescription()) == null) {
                        object2 = "";
                    }
                    objectArray.getClass();
                    n4 = ((cl2_2)object4).d;
                    oo2_1.h(n4, string7, (String)object2);
                }
            }
            object2 = DataCallback.Companion;
            object = ((DataCallback$Companion)object2).onSuccess(object);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            object4 = "single page checkout";
            String string8 = "Forward";
            boolean bl8 = true;
            object = ((ApiErrorRepo)object2).handleApiError((dl2_2)object3, string7, bl8, (String)object4, string8);
        }
        return object;
    }
}

