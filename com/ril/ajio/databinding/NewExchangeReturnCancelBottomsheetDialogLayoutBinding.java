/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewExchangeReturnCancelBottomsheetDialogLayoutBinding
implements BC3 {
    public final AjioButton btnExchangeReturnCancelDialogNo;
    public final AjioButton btnExchangeReturnCancelDialogYes;
    public final AjioAspectRatioImageView close;
    public final LinearLayout filterFooterLayout;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;
    public final AjioTextView textMsg1;
    public final AjioTextView textMsg2;

    private NewExchangeReturnCancelBottomsheetDialogLayoutBinding(ConstraintLayout constraintLayout, AjioButton ajioButton, AjioButton ajioButton2, AjioAspectRatioImageView ajioAspectRatioImageView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.btnExchangeReturnCancelDialogNo = ajioButton;
        this.btnExchangeReturnCancelDialogYes = ajioButton2;
        this.close = ajioAspectRatioImageView;
        this.filterFooterLayout = linearLayout;
        this.parentLayout = constraintLayout2;
        this.textMsg1 = ajioTextView;
        this.textMsg2 = ajioTextView2;
    }

    public static NewExchangeReturnCancelBottomsheetDialogLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.btn_exchange_return_cancel_dialog_no;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioButton)view;
        if (object2 != null) {
            n3 = R$id.btn_exchange_return_cancel_dialog_yes;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioButton)view;
            if (object3 != null) {
                n3 = R$id.close;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioAspectRatioImageView)view;
                if (object4 != null) {
                    n3 = R$id.filter_footer_layout;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (LinearLayout)view;
                    if (view2 != null) {
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        n3 = R$id.text_msg_1;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.text_msg_2;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                object = new NewExchangeReturnCancelBottomsheetDialogLayoutBinding((ConstraintLayout)((Object)object5), (AjioButton)object2, (AjioButton)object3, (AjioAspectRatioImageView)((Object)object4), (LinearLayout)view2, (ConstraintLayout)((Object)object5), (AjioTextView)object6, (AjioTextView)object7);
                                return object;
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewExchangeReturnCancelBottomsheetDialogLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewExchangeReturnCancelBottomsheetDialogLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewExchangeReturnCancelBottomsheetDialogLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_exchange_return_cancel_bottomsheet_dialog_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewExchangeReturnCancelBottomsheetDialogLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

