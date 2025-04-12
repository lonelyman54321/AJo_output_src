/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.Status;
import kotlin.jvm.internal.Intrinsics;

public final class W12
implements F62 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ W12(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "eddResultDataCallback");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0) {
            n3 = ((DataCallback)object).getStatus();
            Object object4 = "pdp screen";
            String string2 = "EDD on PDP";
            if (n3 == 0) {
                if ((object = (EddResult)((DataCallback)object).getData()) != null && (object3 = ((EddResult)object).getStatus()) != null && (n3 = ((Status)(object3 = ((EddResult)object).getStatus())).getStatusCode()) == 0) {
                    ((NewProductDetailsFragment)object2).Nb((EddResult)object);
                    n3 = (int)(h40_0.Q1() ? 1 : 0);
                    if (n3 != 0 && (n3 = (int)(((NewProductDetailsFragment)object2).K1 ? 1 : 0)) != 0) {
                        object = ((NewProductDetailsFragment)object2).F1;
                        if (object != null) {
                            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                        }
                        if ((object = ((NewProductDetailsFragment)object2).E1) != null) {
                            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                        }
                        if ((object = ((NewProductDetailsFragment)object2).G1) != null) {
                            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                        }
                        boolean bl2 = false;
                        object = null;
                        ((NewProductDetailsFragment)object2).K1 = false;
                        object3 = ((NewProductDetailsFragment)object2).T0;
                        if (object3 != null) {
                            object4 = AddressType.Address;
                            ((CartDeliveryAddress)object3).setAddressType((AddressType)((Object)object4));
                        }
                        if ((n3 = (int)(((NewProductDetailsFragment)object2).L1 ? 1 : 0)) != 0) {
                            object3 = ((NewProductDetailsFragment)object2).T0;
                            if (object3 != null) {
                                object3 = ((CartDeliveryAddress)object3).getFormattedAddress();
                            } else {
                                n3 = 0;
                                object3 = null;
                            }
                            if ((object3 == null || (n3 = ((String)object3).length()) == 0) && (object3 = ((NewProductDetailsFragment)object2).T0) != null) {
                                object4 = ai0_2.g((CartDeliveryAddress)object3);
                                ((CartDeliveryAddress)object3).setFormattedAddress((String)object4);
                            }
                        }
                        ((NewProductDetailsFragment)object2).L1 = false;
                        object = ((NewProductDetailsFragment)object2).Wa();
                        object3 = ((NewProductDetailsFragment)object2).T0;
                        ((jo_2)object).F((CartDeliveryAddress)object3);
                        object = ((NewProductDetailsFragment)object2).Wa();
                        object2 = ((NewProductDetailsFragment)object2).J1;
                        ((jo_2)object).G((String)object2);
                    } else {
                        n3 = (int)(h40_0.Q1() ? 1 : 0);
                        if (n3 != 0 && (n3 = (int)(((NewProductDetailsFragment)object2).K1 ? 1 : 0)) == 0) {
                            object2 = ((NewProductDetailsFragment)object2).Wa();
                            if ((object = ((EddResult)object).getPinCode()) == null) {
                                object = "";
                            }
                            ((jo_2)object2).G((String)object);
                        }
                    }
                } else {
                    tj2_2.Companion.getClass();
                    object = tj2$a_0.a().a;
                    boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                    if (!bl3) {
                        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object2 = tj2$a_0.a().a;
                        object3 = "please try later -";
                        cP.b((String)object3, (String)object2, (GTMEvents)object, string2, object4);
                    }
                }
            } else {
                int n4 = ((DataCallback)object).getStatus();
                if (n4 == (n3 = 1)) {
                    object = ((NewProductDetailsFragment)object2).F1;
                    if (object != null) {
                        ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                    }
                    if ((object = ((NewProductDetailsFragment)object2).E1) != null) {
                        ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                    }
                    if ((object = ((NewProductDetailsFragment)object2).G1) != null) {
                        ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                    }
                    object = AnalyticsManager.Companion;
                    object2 = "please try later";
                    tj2_0.e((AnalyticsManager$Companion)object, string2, (String)object2, object4);
                }
            }
        }
    }
}

