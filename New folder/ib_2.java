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
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Ib
 */
public final class ib_2
extends BottomSheetDialogFragment {
    public static final Ib$a Companion;

    static {
        Ib$a ib$a;
        Companion = ib$a = new Object();
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        fb_0 fb_02 = new fb_0((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)fb_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.dialog_ajio_wallet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.dialog_ajio_wallet_refresh;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, bundle);
        int n3 = R$id.cancelBtn;
        bundle = object.findViewById(n3);
        int n4 = R$id.okayBtn;
        View view = object.findViewById(n4);
        int n7 = R$id.ajioWalletHeader;
        Object object2 = (TextView)object.findViewById(n7);
        int n8 = R$id.ajioWalletSubHeader;
        object = (TextView)object.findViewById(n8);
        String string2 = hv3_0.K(R$string.super_cash);
        int n10 = R$string.what_is_super_cash;
        Object[] objectArray = new Object[]{string2};
        String string3 = hv3_0.L(n10, objectArray);
        object2.setText((CharSequence)string3);
        object2 = b.n(hv3_0.K(R$string.what_is_super_cash_description), "%s", string2, false);
        object.setText((CharSequence)object2);
        object = new gb_0(this, 0);
        bundle.setOnClickListener((View.OnClickListener)object);
        object = new hb_0(this, 0);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

