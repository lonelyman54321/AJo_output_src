/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.StoredPaymentInstrument;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.StatusNew;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from q21
 */
public final class q21_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q21_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "";
        int n3 = 0;
        Object object3 = null;
        Object object4 = "this$0";
        Object object5 = this.b;
        boolean bl2 = false;
        Object object6 = null;
        int n4 = 1;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object7 = object;
                object7 = (dl2_2)object;
                object5 = (oo2_1)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                String string2 = "PAYMENT_StoredPaymentInstrument";
                Intrinsics.checkNotNullParameter(string2, "$requestID");
                Intrinsics.checkNotNullParameter(object7, "response");
                object = (StoredPaymentInstrument)((dl2_2)object7).b;
                object4 = ((dl2_2)object7).a;
                bl2 = ((cl2_2)object4).d();
                if (bl2 && object != null) {
                    object6 = ((StoredPaymentInstrument)object).getError();
                    if (object6 != null) {
                        object6 = ((Error)object6).getCode();
                    } else {
                        bl2 = false;
                        object6 = null;
                    }
                    if (object6 != null) {
                        object6 = ((StoredPaymentInstrument)object).getError();
                        if (object6 != null) {
                            object3 = ((Error)object6).getDescription();
                        }
                        if (object3 != null) {
                            object3 = ((StoredPaymentInstrument)object).getError();
                            if (object3 != null && (object3 = ((Error)object3).getDescription()) != null) {
                                object2 = object3;
                            }
                            object5.getClass();
                            n3 = ((cl2_2)object4).d;
                            oo2_1.h(n3, string2, (String)object2);
                        }
                    }
                    object2 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object2).onSuccess(object);
                } else {
                    ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                    String string3 = "single page checkout";
                    String string4 = "Forward";
                    boolean bl3 = true;
                    object = apiErrorRepo.handleApiError((dl2_2)object7, string2, bl3, string3, string4);
                }
                return object;
            }
            case 1: {
                object = (UY2)object;
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                object5 = (String)object5;
                RY2.e((UY2)object, (String)object5);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object5 = (t21_0)object5;
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object4 = cp_1.Companion;
        int n8 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n8 != 0) {
            int n10;
            kx3_0.a = n4;
            object4 = ((t21_0)object5).c;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n8 = 0;
                object4 = null;
            }
            object4.stopLoader();
            n8 = ((DataCallback)object).getStatus();
            String string5 = "format(...)";
            String string6 = "closetViewModel";
            if (n8 == 0) {
                if ((object = (SaveForLaterResponse)((DataCallback)object).getData()) != null && (object4 = ((SaveForLaterResponse)object).getStatusCode()) != null && (n8 = ((Integer)object4).intValue()) == 0) {
                    object4 = ((SaveForLaterResponse)object).getStatus();
                    if (object4 != null) {
                        object4 = ((StatusNew)object4).getMessageDescription();
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n8 = ((String)object4).length()) != 0) {
                        if ((object = ((SaveForLaterResponse)object).getStatus()) != null && (object = ((StatusNew)object).getMessageDescription()) != null) {
                            object2 = object;
                        }
                    } else {
                        n10 = R$string.revamp_moved_to_closet_successfully;
                        object2 = hv3_0.K(n10);
                    }
                    object = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_alert_message;
                    object = hv3_0.K(n10);
                    object4 = new Object[n4];
                    object4[0] = object2;
                    object = xh2_0.a((Object[])object4, n4, (String)object, string5);
                    ((t21_0)object5).Ta((String)object2, (String)object);
                    object = ((t21_0)object5).h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n10 = 0;
                        object = null;
                    }
                    if ((object = ((ky1_0)object).i.b) != null) {
                        object2 = el1_2.a;
                        object2 = yt2_2.CART;
                        el1_2.c((yt2_2)((Object)object2), (Product)object);
                    }
                    object = ((t21_0)object5).j;
                    object2 = "closetListAdaptor";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n10 = 0;
                        object = null;
                    }
                    object = ((np_2)object).b;
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.Product>");
                    object = (ArrayList)object;
                    object4 = ((t21_0)object5).h;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n8 = 0;
                        object4 = null;
                    }
                    object4 = ((ky1_0)object4).i.b;
                    Intrinsics.checkNotNull(object4);
                    ((ArrayList)object).add(0, object4);
                    object = ((t21_0)object5).j;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n10 = 0;
                        object = null;
                    }
                    ((RecyclerView$f)object).notifyDataSetChanged();
                } else {
                    if (object != null && (object4 = ((SaveForLaterResponse)object).getStatus()) != null) {
                        object4 = ((StatusNew)object4).getMessageDescription();
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n8 = ((String)object4).length()) != 0) {
                        if (object != null && (object = ((SaveForLaterResponse)object).getStatus()) != null && (object = ((StatusNew)object).getMessageDescription()) != null) {
                            object2 = object;
                        }
                    } else {
                        n10 = R$string.revamp_closet_alert_msg;
                        object2 = hv3_0.K(n10);
                    }
                    object = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_alert_message;
                    object = hv3_0.K(n10);
                    object4 = new Object[n4];
                    object4[0] = object2;
                    object = xh2_0.a((Object[])object4, n4, (String)object, string5);
                    ((t21_0)object5).Ta((String)object2, (String)object);
                }
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                object2 = "wishlist_state_enable";
                n10 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
                if (n10 != 0 && (object = ((t21_0)object5).z) != null) {
                    int n14;
                    object2 = ((t21_0)object5).h;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n14 = 0;
                        object2 = null;
                    }
                    n14 = (object2 = ((ky1_0)object2).i.b) != null ? ((Product)object2).getViewHolderPos() : -1;
                    ((n32_0)object).Oa(n14);
                }
            } else {
                n10 = ((DataCallback)object).getStatus();
                if (n10 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message;
                    object = hv3_0.K(n10);
                    int n15 = R$string.pdp_details_not_available;
                    object2 = ((Fragment)object5).getString(n15);
                    object4 = new Object[n4];
                    object4[0] = object2;
                    object = xh2_0.a((Object[])object4, n4, (String)object, string5);
                    n15 = R$string.pdp_details_not_available;
                    object2 = ((Fragment)object5).getString(n15);
                    object4 = "getString(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                    ((t21_0)object5).Ta((String)object2, (String)object);
                }
            }
            if ((object = ((t21_0)object5).h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string6);
                n10 = 0;
                object = null;
            }
            object = ((ky1_0)object).i;
            ((BH3)object).b = null;
        }
        return Unit.a;
    }
}

