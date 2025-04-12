/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
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
 * Renamed from jW1
 */
public final class jw1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jw1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        String string2 = null;
        int n3 = 1;
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                object2 = (yx3)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((yx3)object2).e.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object2 = (ex1_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 != 0) {
            int n8;
            kx3_0.a = n3;
            object3 = ((ex1_0)object2).m;
            n4 = 0;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n7 = 0;
                object3 = null;
            }
            object3.stopLoader();
            n7 = ((DataCallback)object).getStatus();
            String string3 = "format(...)";
            String string4 = "closetViewModel";
            if (n7 == 0) {
                int n10;
                Object object4;
                object = (SaveForLaterResponse)((DataCallback)object).getData();
                object3 = "";
                if (object != null && (object4 = ((SaveForLaterResponse)object).getStatusCode()) != null && (n10 = object4.intValue()) == 0) {
                    object4 = ((SaveForLaterResponse)object).getStatus();
                    if (object4 != null) {
                        object4 = object4.getMessageDescription();
                    } else {
                        n10 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n10 = object4.length()) != 0) {
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
                    object4 = new Object[n3];
                    object4[0] = object3;
                    object = xh2_0.a(object4, n3, (String)object, string3);
                    ((ex1_0)object2).Kb((String)object3, (String)object);
                    object = ((ex1_0)object2).u;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n8 = 0;
                        object = null;
                    }
                    if ((object = ((ky1_0)object).i.b) != null) {
                        object3 = el1_2.a;
                        object3 = yt2_2.CART;
                        el1_2.c((yt2_2)((Object)object3), (Product)object);
                    }
                    if ((object = ((ex1_0)object2).S) != null) {
                        object = ((bo_1)object).g();
                    } else {
                        n8 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = ((ex1_0)object2).S;
                        if (object != null) {
                            object = ((bo_1)object).g();
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.Product>");
                        object3 = ((ex1_0)object2).u;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n7 = 0;
                            object3 = null;
                        }
                        object3 = ((ky1_0)object3).i.b;
                        Intrinsics.checkNotNull(object3);
                        ((ArrayList)object).add(0, object3);
                        object = ((ex1_0)object2).S;
                        if (object != null) {
                            ((bo_1)object).h();
                        }
                    }
                } else {
                    if (object != null && (object4 = ((SaveForLaterResponse)object).getStatus()) != null) {
                        object4 = object4.getMessageDescription();
                    } else {
                        n10 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n10 = object4.length()) != 0) {
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
                    object4 = new Object[n3];
                    object4[0] = object3;
                    object = xh2_0.a(object4, n3, (String)object, string3);
                    ((ex1_0)object2).Kb((String)object3, (String)object);
                }
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                object3 = "wishlist_state_enable";
                n8 = (int)(((ao0_0)object).a((String)object3) ? 1 : 0);
                if (n8 != 0 && (object = ((ex1_0)object2).I0) != null) {
                    object3 = ((ex1_0)object2).u;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n7 = 0;
                        object3 = null;
                    }
                    n7 = (object3 = ((ky1_0)object3).i.b) != null ? ((Product)object3).getViewHolderPos() : -1;
                    ((n32_0)object).Oa(n7);
                }
            } else {
                n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_alert_message;
                    object = hv3_0.K(n8);
                    n7 = R$string.pdp_details_not_available;
                    object3 = ((Fragment)object2).getString(n7);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object = xh2_0.a(objectArray, n3, (String)object, string3);
                    n7 = R$string.pdp_details_not_available;
                    object3 = ((Fragment)object2).getString(n7);
                    string2 = "getString(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                    ((ex1_0)object2).Kb((String)object3, (String)object);
                }
            }
            if ((object = ((ex1_0)object2).u) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n8 = 0;
                object = null;
            }
            object = ((ky1_0)object).i;
            ((BH3)object).b = null;
        }
        return Unit.a;
    }
}

