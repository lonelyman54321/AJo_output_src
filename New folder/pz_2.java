/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel;
import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel$Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pz
 */
public final class pz_2
implements Function1 {
    public final /* synthetic */ sz_2 a;

    public /* synthetic */ pz_2(sz_2 sz_22) {
        this.a = sz_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object4, (DataCallback)object2);
        if (n3 == 0) return Unit.a;
        ((sz_2)object3).Qa();
        object4 = ((sz_2)object3).l;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            n3 = 0;
            object4 = null;
        }
        ai0_2.i((View)object4);
        object4 = ((sz_2)object3).Oa();
        int n4 = 1;
        object4.setClickable(n4 != 0);
        n3 = ((DataCallback)object2).getStatus();
        if (n3 == 0) {
            if ((object2 = (AjioGiftCardModel)((DataCallback)object2).getData()) == null) return Unit.a;
            object4 = ((AjioGiftCardModel)object2).getStatus();
            if (object4 != null && (n3 = ((AjioGiftCardModel$Status)object4).getStatusCode()) == n4) {
                object4 = ((AjioGiftCardModel)object2).getStatus();
                if (object4 != null) {
                    object4 = ((AjioGiftCardModel$Status)object4).getMessageDescription();
                } else {
                    n3 = 0;
                    object4 = null;
                }
                n3 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                if (n3 == 0) {
                    object4 = ((AjioGiftCardModel)object2).getStatus();
                    if (object4 == null || (object4 = ((AjioGiftCardModel$Status)object4).getMessageDescription()) == null) {
                        object4 = "";
                    }
                    ai0_2.B((View)((sz_2)object3).Pa());
                    TextView textView = ((sz_2)object3).Pa();
                    textView.setText((CharSequence)object4);
                    object4 = ((sz_2)object3).Pa();
                    ai0_2.a((View)object4);
                    object2 = ((AjioGiftCardModel)object2).getStatus();
                    String string2 = object2 != null ? ((AjioGiftCardModel$Status)object2).getMessageDescription() : null;
                    object2 = ((sz_2)object3).d;
                    boolean bl2 = ((sz_2)object3).c;
                    v7_0.a(string2, (String)object2, bl2);
                    return Unit.a;
                }
            }
            ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
            n3 = (int)(((sz_2)object3).c ? 1 : 0);
            String string3 = ((sz_2)object3).d;
            String string4 = "calledFrom";
            Intrinsics.checkNotNullParameter(string3, string4);
            Bundle bundle = new Bundle();
            double d2 = ((AjioGiftCardModel)object2).getAmount();
            String string5 = "gift_card_value";
            bundle.putDouble(string5, d2);
            Object object5 = "expiry";
            Object object6 = "dd MMM, yyyy";
            if (n3 != 0) {
                long l2 = ((AjioGiftCardModel)object2).getExpiryDate();
                object6 = k7.f(l2, (String)object6);
                bundle.putString((String)object5, (String)object6);
            } else {
                long l3 = ((AjioGiftCardModel)object2).getCardExpiryDate();
                object6 = k7.f(l3, (String)object6);
                bundle.putString((String)object5, (String)object6);
            }
            object4 = n3 != 0 ? "gift_card_submit_success" : "check_balance_submit";
            Object object7 = object4;
            object4 = AnalyticsManager.Companion;
            String string6 = bv_0.a((AnalyticsManager$Companion)object4);
            String string7 = cv_0.a((AnalyticsManager$Companion)object4);
            object5 = ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp();
            object6 = "wallet screen";
            boolean bl3 = Intrinsics.areEqual(string3, object6);
            object4 = bl3 ? ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp().getEC_WALLET_INTERACTION() : ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp().getEC_PAYMENT_INSTRUMENT_SCR_TYPE();
            object6 = object4;
            object4 = null;
            string5 = "gift card submit";
            String string8 = "success";
            int n7 = 1536;
            Object object8 = string4;
            string4 = null;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object6, string5, string8, (String)object7, string3, string3, string6, bundle, string7, false, null, n7, null);
            n3 = (int)(((sz_2)object3).c ? 1 : 0);
            object5 = "walletTypeString";
            object6 = "ajioGiftCardListener";
            if (n3 != 0) {
                object4 = ((sz_2)object3).o;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n3 = 0;
                    object4 = null;
                }
                if (object4 != null) {
                    object4.H9((AjioGiftCardModel)object2);
                }
                object4 = new la_1();
                object6 = ((sz_2)object3).d;
                Intrinsics.checkNotNullParameter(object6, (String)object8);
                ((la_1)object4).d = object6;
                ((la_1)object4).c = object2;
                object2 = ((sz_2)object3).r;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    object8 = null;
                } else {
                    object8 = object2;
                }
                Intrinsics.checkNotNullParameter(object8, (String)object5);
                ((la_1)object4).b = object8;
                object2 = ((Fragment)object3).requireActivity().getSupportFragmentManager();
                object3 = "SuccessGiftCardDialog";
                ((DialogFragment)object4).show((FragmentManager)object2, (String)object3);
                return Unit.a;
            } else {
                object4 = new vz_2();
                object8 = ((sz_2)object3).o;
                if (object8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    object8 = null;
                }
                Intrinsics.checkNotNullParameter(object8, (String)object6);
                ((vz_2)object4).c = object8;
                object8 = ((sz_2)object3).q;
                object6 = "cardDetails";
                if (object8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    object8 = null;
                }
                Intrinsics.checkNotNullParameter(object8, (String)object6);
                ((vz_2)object4).f = object2;
                ((vz_2)object4).e = object8;
                object2 = ((sz_2)object3).r;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    object8 = null;
                } else {
                    object8 = object2;
                }
                Intrinsics.checkNotNullParameter(object8, (String)object5);
                ((vz_2)object4).d = object8;
                object2 = ((Fragment)object3).requireActivity().getSupportFragmentManager();
                object3 = "BalanceGiftCardDialog";
                ((DialogFragment)object4).show((FragmentManager)object2, (String)object3);
            }
            return Unit.a;
        }
        n3 = ((DataCallback)object2).getStatus();
        if (n3 != n4) return Unit.a;
        String string9 = (object2 = ((DataCallback)object2).getError()) != null && (object2 = ((DataError)object2).getErrorMessage()) != null ? ((DataError$ErrorMessage)object2).getMessage() : null;
        if (string9 == null) {
            int n8 = R$string.something_wrong_msg;
            object2 = hv3_0.K(n8);
        } else {
            object2 = string9;
        }
        ai0_2.B((View)((sz_2)object3).Pa());
        object4 = ((sz_2)object3).Pa();
        object4.setText((CharSequence)object2);
        ai0_2.a((View)((sz_2)object3).Pa());
        object2 = ((sz_2)object3).d;
        boolean bl4 = ((sz_2)object3).c;
        v7_0.a(string9, (String)object2, bl4);
        return Unit.a;
    }
}

