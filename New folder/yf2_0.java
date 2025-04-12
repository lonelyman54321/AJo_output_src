/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.CustomerCare.ChatStatus;
import com.ril.ajio.services.data.CustomerCare.InitiateChat;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Yf2
 */
public final class yf2_0
implements Function1 {
    public final /* synthetic */ bg2_1 a;

    public /* synthetic */ yf2_0(bg2_1 bg2_12) {
        this.a = bg2_12;
    }

    public final Object invoke(Object object) {
        Object object2 = null;
        int n3 = 1;
        object = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object[] objectArray = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)objectArray, (DataCallback)object);
        if (bl2) {
            int n4;
            objectArray = "requireActivity(...)";
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                ((bg2_1)object3).v = object = (InitiateChat)((DataCallback)object).getData();
                if (object != null) {
                    int n7;
                    if ((object = ((InitiateChat)object).getStatus()) != null && ((object = ((bg2_1)object3).v) == null || (object = ((InitiateChat)object).getStatus()) == null || (n7 = ((ChatStatus)object).getStatusCode()) != 0)) {
                        object = ((bg2_1)object3).v;
                        Intrinsics.checkNotNull(object);
                        object = ((InitiateChat)object).getStatus();
                        Intrinsics.checkNotNull(object);
                        object = ((ChatStatus)object).getMessageDescription();
                        Intrinsics.checkNotNull(object);
                        object3 = StringCompanionObject.INSTANCE;
                        int n8 = R$string.acc_alert_message;
                        object3 = hv3_0.K(n8);
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        object2 = "format(...)";
                        ZK1.e(objectArray, n3, (String)object3, (String)object2, (String)object);
                    } else {
                        object = (SelectedOrderItem)CollectionsKt.firstOrNull((List)((bg2_1)object3).Pa().m.getValue());
                        ((bg2_1)object3).Pa().getClass();
                        Object object4 = qz1_2.l((SelectedOrderItem)object);
                        n4 = 0;
                        String string2 = null;
                        if (object4 != null) {
                            object4 = ((CartEntry)object4).getProduct();
                        } else {
                            n3 = 0;
                            object4 = null;
                        }
                        Object object5 = UserInformation.getInstance(((Fragment)object3).requireContext().getApplicationContext());
                        String string3 = ((UserInformation)object5).getUserEmailId();
                        String string4 = ((UserInformation)object5).getUserName();
                        object5 = ((UserInformation)object5).getCustomerUUID();
                        Object object6 = (CartOrder)((bg2_1)object3).Pa().l.getValue();
                        String string5 = cp$a.a();
                        object6 = object6 != null ? ((CartOrder)object6).getCode() : null;
                        if (object != null) {
                            object = ((SelectedOrderItem)object).getRawEntryStatus();
                        } else {
                            n7 = 0;
                            object = null;
                        }
                        ((bg2_1)object3).Pa().getClass();
                        String string6 = qz1_2.q((Product)object4);
                        if (object4 != null) {
                            string2 = ((Product)object4).getCode();
                        }
                        n3 = (int)(((bg2_1)object3).w ? 1 : 0);
                        String string7 = "|Customer Name:";
                        String string8 = "|Customer Email:";
                        object5 = og_1.a("Customer ID:", (String)object5, string7, string4, string8);
                        String string9 = "|Order Status:";
                        X50.a((StringBuilder)object5, string3, "|Order Number:", (String)object6, string9);
                        string3 = "|Issue Category:Where is my order?|Product Name:";
                        string4 = "|Product Code:";
                        X50.a((StringBuilder)object5, (String)object, string3, string6, string4);
                        ((StringBuilder)object5).append(string2);
                        ((StringBuilder)object5).append("|Luxury Order:");
                        ((StringBuilder)object5).append(n3 != 0);
                        ((StringBuilder)object5).append("|Intervention Intent:POST_ORDER|Source:ODP");
                        object = ((StringBuilder)object5).toString();
                        n3 = TextUtils.isEmpty((CharSequence)string5);
                        if (!n3) {
                            object4 = "|version:";
                            object = n1.a((String)object, (String)object4, string5);
                        }
                        object = Ft2.a((String)object, "{task}");
                        object4 = ((Fragment)object3).requireActivity();
                        Intrinsics.checkNotNullExpressionValue(object4, (String)objectArray);
                        object3 = ((bg2_1)object3).v;
                        Intrinsics.checkNotNull(object3);
                        v31.c((FragmentActivity)object4, (InitiateChat)object3, (String)object, false);
                    }
                }
            } else {
                int n10 = ((DataCallback)object).getStatus();
                if (n10 == n3) {
                    object = ab0_0.Companion;
                    object2 = ((Fragment)object3).requireActivity();
                    Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray);
                    object.getClass();
                    aB0$a.a((Activity)object2);
                }
            }
        }
        return Unit.a;
    }
}

