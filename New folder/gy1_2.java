/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.StatusNew;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from gY1
 */
public final class gy1_2
implements Function1 {
    public final /* synthetic */ oy1_1 a;

    public /* synthetic */ gy1_2(oy1_1 oy1_12) {
        this.a = oy1_12;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        object = (DataCallback)object;
        oy1_1 oy1_12 = this.a;
        Intrinsics.checkNotNullParameter(oy1_12, "this$0");
        Object object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 != 0) {
            kx3_0.a = n4;
            object3 = oy1_12.Pa();
            object3.stopLoader();
            n7 = ((DataCallback)object).getStatus();
            String string2 = "format(...)";
            if (n7 == 0) {
                Object object4;
                int n8;
                int n10;
                Object object5;
                object = (SaveForLaterResponse)((DataCallback)object).getData();
                object3 = "";
                if (object != null && (object5 = ((SaveForLaterResponse)object).getStatusCode()) != null && (n10 = object5.intValue()) == 0) {
                    object5 = ((SaveForLaterResponse)object).getStatus();
                    if (object5 != null) {
                        object5 = object5.getMessageDescription();
                    } else {
                        n10 = 0;
                        object5 = null;
                    }
                    if (object5 != null && (n10 = object5.length()) != 0) {
                        if ((object = ((SaveForLaterResponse)object).getStatus()) != null && (object = ((StatusNew)object).getMessageDescription()) != null) {
                            object3 = object;
                        }
                    } else {
                        n8 = R$string.revamp_moved_to_closet_successfully;
                        object3 = hv3_0.K(n8);
                    }
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_alert_message;
                    object = hv3_0.K(n8);
                    object5 = new Object[n4];
                    object5[0] = object3;
                    object = xh2_0.a(object5, n4, (String)object, string2);
                    oy1_12.gb((String)object3, (String)object);
                    object = oy1_12.Qa().i.b;
                    if (object != null) {
                        object4 = el1_2.a;
                        object4 = yt2_2.WISHLIST;
                        el1_2.c((yt2_2)((Object)object4), (Product)object);
                    }
                } else {
                    if (object != null && (object5 = ((SaveForLaterResponse)object).getStatus()) != null) {
                        object5 = object5.getMessageDescription();
                    } else {
                        n10 = 0;
                        object5 = null;
                    }
                    if (object5 != null && (n10 = object5.length()) != 0) {
                        if (object != null && (object = ((SaveForLaterResponse)object).getStatus()) != null && (object = ((StatusNew)object).getMessageDescription()) != null) {
                            object3 = object;
                        }
                    } else {
                        n8 = R$string.revamp_closet_alert_msg;
                        object3 = hv3_0.K(n8);
                    }
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_alert_message;
                    object = hv3_0.K(n8);
                    object5 = new Object[n4];
                    object5[0] = object3;
                    object = xh2_0.a(object5, n4, (String)object, string2);
                    oy1_12.gb((String)object3, (String)object);
                }
                if ((object = oy1_12.Qa().i.b) != null) {
                    object = oy1_12.Qa().y;
                    object4 = oy1_12.Qa().i.b;
                    Intrinsics.checkNotNull(object4);
                    ((ArrayList)object).add(0, object4);
                    object2 = oy1_12.Qa().z;
                    oy1_12.cb((ArrayList)object, (ArrayList)object2);
                }
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                object2 = "wishlist_state_enable";
                n8 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
                if (n8 != 0 && (object = oy1_12.T) != null) {
                    object2 = oy1_12.Qa().i.b;
                    n3 = object2 != null ? ((Product)object2).getViewHolderPos() : -1;
                    ((n32_0)object).Oa(n3);
                }
            } else {
                int n14 = ((DataCallback)object).getStatus();
                if (n14 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n14 = R$string.acc_error_message;
                    object = hv3_0.K(n14);
                    n7 = R$string.pdp_details_not_available;
                    object3 = hv3_0.K(n7);
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object3;
                    object = xh2_0.a(objectArray, n4, (String)object, string2);
                    n3 = R$string.pdp_details_not_available;
                    object2 = oy1_12.getString(n3);
                    String string3 = "getString(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    oy1_12.gb((String)object2, (String)object);
                }
            }
            object = oy1_12.Qa().i;
            ((BH3)object).b = null;
        }
        return Unit.a;
    }
}

