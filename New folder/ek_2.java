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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EK
 */
public final class ek_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public TextView a;
    public TextView b;
    public ns1_2 c;

    public final void onClick(View object) {
        TextView textView = this.b;
        boolean bl2 = Intrinsics.areEqual(object, textView);
        if (bl2) {
            boolean bl3 = true;
            uy1_0.b(bl3);
            object = this.c;
            if (object != null) {
                object.w7();
            }
            this.dismissAllowingStateLoss();
        } else {
            textView = this.a;
            boolean bl4 = Intrinsics.areEqual(object, textView);
            if (bl4) {
                bl4 = false;
                object = null;
                uy1_0.b(false);
                this.dismissAllowingStateLoss();
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        dk_2 dk_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)dk_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.cancel_request_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        super.onViewCreated(view, bundle);
        int n3 = R$id.id_no_button;
        bundle = (TextView)view.findViewById(n3);
        this.a = bundle;
        n3 = R$id.id_yes_button;
        view = (TextView)view.findViewById(n3);
        this.b = view;
        view = this.a;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener)this);
        }
        if ((view = this.b) != null) {
            view.setOnClickListener((View.OnClickListener)this);
        }
    }
}

