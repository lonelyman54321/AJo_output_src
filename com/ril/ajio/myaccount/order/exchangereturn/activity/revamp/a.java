/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity.revamp;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a$a;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends f51_0
implements View.OnClickListener {
    public static final a$a Companion;
    public sk_1 f;
    public Tx0 g;
    public AjioButton h;
    public AjioButton i;

    static {
        a$a a$a;
        Companion = a$a = new Object();
    }

    public final void onAttach(Context object) {
        boolean bl2;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        object = this.getParentFragment();
        if (object != null && (bl2 = (object = this.getParentFragment()) instanceof Tx0)) {
            object = this.getParentFragment();
            string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.dialogs.EditResetConfirmationDialogListener";
            Intrinsics.checkNotNull(object, string2);
            object = (Tx0)object;
            this.g = object;
        } else {
            object = this.getActivity();
            bl2 = object instanceof sk_1;
            if (bl2) {
                object = this.getActivity();
                string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.dialogs.CancelConfirmationDialogListener";
                Intrinsics.checkNotNull(object, string2);
                object = (sk_1)object;
                this.f = object;
            }
        }
    }

    public final void onClick(View view) {
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        mk_1 mk_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)mk_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_exchange_return_cancel_bottomsheet_dialog_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        this.f = null;
    }

    /*
     * WARNING - void declaration
     */
    public final void onViewCreated(View object, Bundle object2) {
        void var6_8;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getArguments();
        boolean bl3 = false;
        String string2 = null;
        if (object2 != null) {
            object3 = "IS_DELETE";
            boolean bl2 = object2.getBoolean(object3);
        } else {
            boolean bl2 = false;
            object2 = null;
        }
        object3 = this.getArguments();
        if (object3 != null) {
            string2 = "IS_END_RETURN";
            bl3 = object3.getBoolean(string2);
        }
        int n3 = R$id.parent_layout;
        object3 = object.findViewById(n3);
        String string3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object3, string3);
        object3 = (ConstraintLayout)((Object)object3);
        Object object4 = Looper.getMainLooper();
        Object object5 = new Handler(object4);
        object4 = new nk_1((boolean)var6_8, (ConstraintLayout)((Object)object3));
        long l2 = 100;
        object5.postDelayed((Runnable)object4, l2);
        n3 = R$id.text_msg_1;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, string3);
        object3 = (AjioTextView)object3;
        int n4 = R$id.btn_exchange_return_cancel_dialog_no;
        object5 = (AjioButton)object.findViewById(n4);
        this.h = object5;
        n4 = R$id.btn_exchange_return_cancel_dialog_yes;
        object5 = (AjioButton)object.findViewById(n4);
        this.i = object5;
        object5 = this.h;
        if (object5 != null) {
            object4 = new ok_1(this, 0);
            object5.setOnClickListener((View.OnClickListener)object4);
        }
        if ((object5 = this.f) == null) {
            if (var6_8 != false) {
                n4 = R$string.are_you_sure_delete_item;
                object5 = hv3_0.K(n4);
                object3.setText((CharSequence)object5);
            } else {
                object5 = this.i;
                if (object5 != null) {
                    int n7 = R$string.yes_reset;
                    object4 = hv3_0.K(n7);
                    object5.setText((CharSequence)object4);
                }
                n4 = R$string.are_you_sure_reset_request;
                object5 = hv3_0.K(n4);
                object3.setText((CharSequence)object5);
            }
        }
        if ((object3 = this.i) != null) {
            object5 = new pk_2(this, bl3, (boolean)var6_8);
            object3.setOnClickListener((View.OnClickListener)object5);
        }
        int n8 = R$id.close;
        object = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        object = (AjioAspectRatioImageView)((Object)object);
        object2 = new qk_2(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

