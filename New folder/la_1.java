/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.databinding.RowAwAjioGiftSuccessBottomSheetBinding;
import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lA
 */
public final class la_1
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public RowAwAjioGiftSuccessBottomSheetBinding a;
    public String b;
    public AjioGiftCardModel c;
    public String d = "wallet screen";

    public final RowAwAjioGiftSuccessBottomSheetBinding Oa() {
        RowAwAjioGiftSuccessBottomSheetBinding rowAwAjioGiftSuccessBottomSheetBinding = this.a;
        if (rowAwAjioGiftSuccessBottomSheetBinding != null) {
            return rowAwAjioGiftSuccessBottomSheetBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void onClick(View view) {
        AppCompatImageView appCompatImageView = this.Oa().closeDialog;
        boolean bl2 = Intrinsics.areEqual(view, (Object)appCompatImageView);
        if (bl2) {
            this.dismissAllowingStateLoss();
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        ka_1 ka_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)ka_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.row_aw_ajio_gift_success_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        int n7 = 1;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object = RowAwAjioGiftSuccessBottomSheetBinding.bind((View)object);
        object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.a = object;
        int n8 = og1_1.b();
        if (n8 != 0 && (n8 = Intrinsics.areEqual(object = this.d, object2 = "payment screen")) != 0) {
            object = this.Oa().dlprLayoutContent;
            n4 = hv3_0.m(R$color.white);
            object.setBackgroundColor(n4);
            object = this.Oa().agSuccessIcon;
            n4 = R$drawable.ic_luxe_gift_card_success;
            ((AppCompatImageView)((Object)object)).setBackgroundResource(n4);
        }
        if ((object = this.c) != null) {
            double d2 = ((AjioGiftCardModel)object).getAmount();
            object3 = this.Oa().agSuccessRedeemAmount;
            n8 = ok1_1.a(d2);
            float f5 = n8;
            object = qz2_0.x(Float.valueOf(f5));
            object3.setText((CharSequence)object);
        }
        if ((object = this.c) != null) {
            long l2 = ((AjioGiftCardModel)object).getExpiryDate();
            object3 = "dd MMM, yyyy";
            object = k7.f(l2, (String)object3);
            object2 = this.Oa().agSuccessExpiresDate;
            n3 = R$string.ag_expires_on;
            Object[] objectArray = new Object[n7];
            objectArray[0] = object;
            object = hv3_0.L(n3, objectArray);
            object2.setText((CharSequence)object);
        }
        object = this.Oa().agSuccessSubTitle;
        n4 = R$string.ajio_ag_success_sub_text;
        object3 = this.b;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("walletTypeString");
            n3 = 0;
            object3 = null;
        }
        Object[] objectArray = new Object[n7];
        objectArray[0] = object3;
        object2 = hv3_0.L(n4, objectArray);
        object.setText((CharSequence)object2);
        this.Oa().closeDialog.setOnClickListener(this);
    }
}

