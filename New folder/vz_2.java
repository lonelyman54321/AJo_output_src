/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.databinding.RowAwAjioGiftBalanceBottomSheetBinding;
import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Vz
 */
public final class vz_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public RowAwAjioGiftBalanceBottomSheetBinding a;
    public x7 b;
    public k0 c;
    public String d;
    public HashMap e;
    public AjioGiftCardModel f;

    public final void Oa(String string2) {
        RowAwAjioGiftBalanceBottomSheetBinding rowAwAjioGiftBalanceBottomSheetBinding = this.a;
        RowAwAjioGiftBalanceBottomSheetBinding rowAwAjioGiftBalanceBottomSheetBinding2 = null;
        String string3 = "binding";
        if (rowAwAjioGiftBalanceBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            rowAwAjioGiftBalanceBottomSheetBinding = null;
        }
        rowAwAjioGiftBalanceBottomSheetBinding = rowAwAjioGiftBalanceBottomSheetBinding.agErrorMessage;
        String string4 = "agErrorMessage";
        Intrinsics.checkNotNullExpressionValue(rowAwAjioGiftBalanceBottomSheetBinding, string4);
        ai0_2.B((View)rowAwAjioGiftBalanceBottomSheetBinding);
        rowAwAjioGiftBalanceBottomSheetBinding = this.a;
        if (rowAwAjioGiftBalanceBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
        } else {
            rowAwAjioGiftBalanceBottomSheetBinding2 = rowAwAjioGiftBalanceBottomSheetBinding;
        }
        rowAwAjioGiftBalanceBottomSheetBinding2.agErrorMessage.setText((CharSequence)string2);
    }

    public final void onClick(View object) {
        int n3;
        boolean bl2 = true;
        Object object2 = null;
        Object object3 = this.a;
        Object object4 = "binding";
        Object object5 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object3 = null;
        }
        if ((n3 = Intrinsics.areEqual(object, object3 = object3.closeDialog)) != 0) {
            this.dismissAllowingStateLoss();
        } else {
            int n4;
            object3 = this.a;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object3 = null;
            }
            if ((n4 = Intrinsics.areEqual(object, object3 = object3.agAddToWallet)) != 0) {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n4 = vV1.e((Context)object);
                if (n4 != 0) {
                    object = this.a;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n4 = 0;
                        object = null;
                    }
                    object = ((RowAwAjioGiftBalanceBottomSheetBinding)object).agGiftCardProgressBar;
                    object3 = "agGiftCardProgressBar";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    ai0_2.B((View)object);
                    object = this.a;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n4 = 0;
                        object = null;
                    }
                    object = ((RowAwAjioGiftBalanceBottomSheetBinding)object).agErrorMessage;
                    object3 = "agErrorMessage";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    ai0_2.k((View)object);
                    object = this.a;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n4 = 0;
                        object = null;
                    }
                    object = ((RowAwAjioGiftBalanceBottomSheetBinding)object).agAddToWallet;
                    object3 = "";
                    object.setText((CharSequence)object3);
                    object = this.a;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n4 = 0;
                        object = null;
                    }
                    ((RowAwAjioGiftBalanceBottomSheetBinding)object).agAddToWallet.setClickable(false);
                    object = this.b;
                    object3 = "ajioGiftCardVM";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n4 = 0;
                        object = null;
                    }
                    object4 = this.e;
                    object.getClass();
                    aW aW2 = md3_0.c((jD3)object);
                    w7_0 w7_02 = new w7_0((x7)object, bl2, (HashMap)object4, null);
                    n4 = 3;
                    Ae3.d(aW2, null, null, w7_02, n4);
                    object = this.b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object5 = object;
                    }
                    object = ((x7)object5).c;
                    mu1_1 mu1_12 = this.getViewLifecycleOwner();
                    object3 = new tz_1(this, 0);
                    object2 = new vz$a_0((tz_1)object3);
                    ((LiveData)object).e(mu1_12, (F62)object2);
                } else {
                    n4 = R$string.pesdk_internet_alert_msg;
                    object = hv3_0.K(n4);
                    object3 = StringCompanionObject.INSTANCE;
                    n3 = R$string.acc_error_message;
                    object3 = hv3_0.K(n3);
                    object4 = new Object[bl2];
                    object4[0] = object;
                    String string2 = xh2_0.a(object4, (int)(bl2 ? 1 : 0), (String)object3, "format(...)");
                    object2 = hv3_0.a;
                    object2.getClass();
                    hv3_0.l0((String)object, string2);
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        uz_2 uz_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)uz_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.row_aw_ajio_gift_balance_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object2 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(object4, "factory");
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        Object object5 = x7.class;
        Object[] objectArray = "modelClass";
        object2 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object2, object5, (String)objectArray);
        object3 = ef0_0.a(object5, (String)objectArray, (String)objectArray, "<this>");
        object4 = object3.getQualifiedName();
        if (object4 != null) {
            float f5;
            int n4;
            object5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object4 = ((String)object5).concat((String)object4);
            this.b = object2 = (x7)((pD3)object2).a((yn1_2)object3, (String)object4);
            object = RowAwAjioGiftBalanceBottomSheetBinding.bind((View)object);
            this.a = object;
            object2 = "binding";
            object3 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object = null;
            }
            ((RowAwAjioGiftBalanceBottomSheetBinding)object).closeDialog.setOnClickListener(this);
            object = this.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object = null;
            }
            ((RowAwAjioGiftBalanceBottomSheetBinding)object).agAddToWallet.setOnClickListener((View.OnClickListener)this);
            object = this.f;
            if (object != null) {
                double d2 = ((AjioGiftCardModel)object).getAmount();
                object = this.a;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    object = null;
                }
                object = ((RowAwAjioGiftBalanceBottomSheetBinding)object).agGiftCardBalance;
                n4 = ok1_1.a(d2);
                f5 = n4;
                object4 = qz2_0.x(Float.valueOf(f5));
                object.setText((CharSequence)object4);
            }
            if ((object = this.f) != null) {
                long l2 = ((AjioGiftCardModel)object).getCardExpiryDate();
                object = k7.f(l2, "dd MMM, yyyy");
                object4 = this.a;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n4 = 0;
                    object4 = null;
                    f5 = 0.0f;
                }
                object4 = ((RowAwAjioGiftBalanceBottomSheetBinding)object4).agGiftCardExpireDate;
                int n7 = R$string.ag_valid_till;
                objectArray = new Object[n3];
                objectArray[0] = object;
                object = hv3_0.L(n7, objectArray);
                object4.setText((CharSequence)object);
            }
            if ((object = this.a) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object = null;
            }
            object = ((RowAwAjioGiftBalanceBottomSheetBinding)object).agAddToWallet;
            int n8 = R$string.ag_add_wallet_dialog_button_text;
            object4 = this.d;
            if (object4 == null) {
                object4 = "walletTypeString";
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object3 = object4;
            }
            Object[] objectArray2 = new Object[n3];
            objectArray2[0] = object3;
            object2 = hv3_0.L(n8, objectArray2);
            object.setText((CharSequence)object2);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

