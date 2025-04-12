/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
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
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.databinding.RowAwAjioGiftBalanceBottomSheetBinding;
import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel;
import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel$Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tz
 */
public final class tz_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tz_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2;
        block22: {
            block19: {
                Object object3;
                Object object4;
                Object object5;
                int n3;
                int n4;
                block20: {
                    Object object6;
                    String string2;
                    String string3;
                    Object object7;
                    Object object8;
                    block21: {
                        n4 = 1;
                        n3 = 0;
                        object8 = null;
                        object5 = this.b;
                        object7 = "this$0";
                        int n7 = this.a;
                        switch (n7) {
                            default: {
                                Object object9 = object;
                                object9 = (DataCallback)object;
                                object5 = (bz1_2)object5;
                                Intrinsics.checkNotNullParameter(object5, (String)object7);
                                n4 = ((DataCallback)object9).getStatus();
                                ((bz1_2)object5).b1 = n4 == 0 ? false : false;
                                return Unit.a;
                            }
                            case 1: {
                                Object object10 = object;
                                object10 = (Throwable)object;
                                object5 = (oa1_1)object5;
                                Intrinsics.checkNotNullParameter(object5, (String)object7);
                                zr1_1 zr1_12 = ((oa1_1)object5).j;
                                object8 = ApiErrorRepo.INSTANCE;
                                Intrinsics.checkNotNull(object10);
                                object5 = object10;
                                object10 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object8, (Throwable)object10, "UserProfile", false, null, null, 28, null);
                                zr1_12.k(object10);
                                return Unit.a;
                            }
                            case 0: 
                        }
                        object4 = object;
                        object4 = (DataCallback)object;
                        object5 = (vz_2)object5;
                        Intrinsics.checkNotNullParameter(object5, (String)object7);
                        object7 = cp_1.Companion;
                        int n8 = nn_2.b((cp$a)object7, (DataCallback)object4);
                        if (n8 == 0) break block19;
                        object7 = ((vz_2)object5).a;
                        object3 = null;
                        string3 = "binding";
                        if (object7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n8 = 0;
                            object7 = null;
                        }
                        object7 = ((RowAwAjioGiftBalanceBottomSheetBinding)object7).agAddToWallet;
                        int n10 = R$string.ag_add_wallet_dialog_button_text;
                        String string4 = ((vz_2)object5).d;
                        string2 = "walletTypeString";
                        if (string4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            string4 = null;
                        }
                        object6 = new Object[n4];
                        object6[0] = string4;
                        object8 = hv3_0.L(n10, object6);
                        object7.setText((CharSequence)object8);
                        object8 = ((vz_2)object5).a;
                        if (object8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n3 = 0;
                            object8 = null;
                        }
                        object8 = ((RowAwAjioGiftBalanceBottomSheetBinding)object8).agGiftCardProgressBar;
                        object7 = "agGiftCardProgressBar";
                        Intrinsics.checkNotNullExpressionValue(object8, (String)object7);
                        ai0_2.i((View)object8);
                        object8 = ((vz_2)object5).a;
                        if (object8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n3 = 0;
                            object8 = null;
                        }
                        object8 = ((RowAwAjioGiftBalanceBottomSheetBinding)object8).agAddToWallet;
                        object8.setClickable(n4 != 0);
                        n3 = ((DataCallback)object4).getStatus();
                        if (n3 != 0) break block20;
                        object8 = (AjioGiftCardModel)((DataCallback)object4).getData();
                        if (object8 == null) break block19;
                        object7 = ((AjioGiftCardModel)object8).getStatus();
                        if (object7 == null || (n8 = ((AjioGiftCardModel$Status)object7).getStatusCode()) != n4) break block21;
                        object2 = ((AjioGiftCardModel)object8).getStatus();
                        if (object2 != null) {
                            object2 = ((AjioGiftCardModel$Status)object2).getMessageDescription();
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        n4 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                        if (n4 != 0) break block21;
                        object2 = ((AjioGiftCardModel)object8).getStatus();
                        if (object2 == null || (object2 = ((AjioGiftCardModel$Status)object2).getMessageDescription()) == null) {
                            object2 = "";
                        }
                        ((vz_2)object5).Oa((String)object2);
                        object2 = ((AjioGiftCardModel)object8).getStatus();
                        if (object2 != null) {
                            object3 = ((AjioGiftCardModel$Status)object2).getMessageDescription();
                        }
                        v7_0.b((String)object3);
                        object2 = Unit.a;
                        break block22;
                    }
                    ((BottomSheetDialogFragment)object5).dismissAllowingStateLoss();
                    object2 = new Bundle();
                    double d2 = ((AjioGiftCardModel)object8).getAmount();
                    object2.putDouble("gift_card_value", d2);
                    long l2 = ((AjioGiftCardModel)object8).getExpiryDate();
                    string3 = "dd MMM, yyyy";
                    object7 = k7.f(l2, string3);
                    object2.putString("expiry", (String)object7);
                    object7 = AnalyticsManager.Companion;
                    String string5 = bv_0.a((AnalyticsManager$Companion)object7);
                    String string6 = cv_0.a((AnalyticsManager$Companion)object7);
                    object4 = ((AnalyticsManager$Companion)object7).getInstance();
                    object6 = ((AnalyticsManager)object4).getNewCustomEventsRevamp();
                    object7 = ((AnalyticsManager$Companion)object7).getInstance().getNewCustomEventsRevamp();
                    String string7 = ((NewCustomEventsRevamp)object7).getEC_WALLET_CHECK_BALANCE_TYPE();
                    String string8 = "gift card submit";
                    String string9 = "success";
                    String string10 = "add_to_wallet";
                    String string11 = "wallet screen";
                    String string12 = "wallet screen";
                    int n14 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string7, string8, string9, string10, string11, string12, string5, (Bundle)object2, string6, false, null, n14, null);
                    object2 = ((vz_2)object5).c;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ajioGiftCardListener");
                        n4 = 0;
                        object2 = null;
                    }
                    object2.H9((AjioGiftCardModel)object8);
                    object2 = new la_1();
                    ((la_1)object2).c = object8;
                    object7 = "wallet screen";
                    Intrinsics.checkNotNullParameter(object7, "calledFrom");
                    ((la_1)object2).d = object7;
                    object8 = ((vz_2)object5).d;
                    if (object8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object8;
                    }
                    Intrinsics.checkNotNullParameter(object3, string2);
                    ((la_1)object2).b = object3;
                    object8 = ((Fragment)object5).requireActivity().getSupportFragmentManager();
                    object5 = "SuccessGiftCardDialog";
                    ((DialogFragment)object2).show((FragmentManager)object8, (String)object5);
                    break block19;
                }
                n3 = ((DataCallback)object4).getStatus();
                if (n3 == n4) {
                    object2 = ((DataCallback)object4).getError();
                    if (object2 != null && (object2 = ((DataError)object2).getErrorMessage()) != null) {
                        object3 = ((DataError$ErrorMessage)object2).getMessage();
                    }
                    if (object3 == null) {
                        n4 = R$string.something_wrong_msg;
                        object2 = hv3_0.K(n4);
                    } else {
                        object2 = object3;
                    }
                    ((vz_2)object5).Oa((String)object2);
                    v7_0.b((String)object3);
                }
            }
            object2 = Unit.a;
        }
        return object2;
    }
}

