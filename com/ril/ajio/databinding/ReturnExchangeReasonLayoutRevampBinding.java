/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.Spinner
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.RowExchangeEddBinding;

public final class ReturnExchangeReasonLayoutRevampBinding
implements BC3 {
    public final Spinner cancelReasonsDropDown;
    public final RelativeLayout cancelReasonsSpinnerLayout;
    public final Spinner cancelSubreasonsDropDown;
    public final RelativeLayout cancelSubreasonsSpinnerLayout;
    public final TextInputEditText edt;
    public final TextInputEditText edtSubReason;
    public final ConstraintLayout exchangeReasonCL;
    public final AjioTextView exchangeReturnCommentsBtn;
    public final AjioTextView exchangeReturnCommentsLabel;
    public final ImageView imgCaution;
    public final ImageView ivCancelReasonsDropDown;
    public final ImageView ivCancelSubreasonsDropDown;
    public final RowExchangeEddBinding layoutErrorExchange;
    public final ConstraintLayout layoutReturnUserMsg;
    public final LinearLayout llCommentBox;
    public final AjioEditText returnItemCommentsBox;
    public final AjioTextView returnUserActionMsg;
    public final AjioTextView returnUserMsg;
    private final ConstraintLayout rootView;
    public final TextInputLayout til;
    public final TextInputLayout tilSubReason;
    public final AjioTextView tvCommentText;
    public final AjioTextView tvTotalChars;

    private ReturnExchangeReasonLayoutRevampBinding(ConstraintLayout constraintLayout, Spinner spinner, RelativeLayout relativeLayout, Spinner spinner2, RelativeLayout relativeLayout2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, ImageView imageView, ImageView imageView2, ImageView imageView3, RowExchangeEddBinding rowExchangeEddBinding, ConstraintLayout constraintLayout3, LinearLayout linearLayout, AjioEditText ajioEditText, AjioTextView ajioTextView3, AjioTextView ajioTextView4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = constraintLayout;
        this.cancelReasonsDropDown = spinner;
        this.cancelReasonsSpinnerLayout = relativeLayout;
        this.cancelSubreasonsDropDown = spinner2;
        this.cancelSubreasonsSpinnerLayout = relativeLayout2;
        this.edt = textInputEditText;
        this.edtSubReason = textInputEditText2;
        this.exchangeReasonCL = constraintLayout2;
        this.exchangeReturnCommentsBtn = ajioTextView;
        this.exchangeReturnCommentsLabel = ajioTextView2;
        this.imgCaution = imageView;
        this.ivCancelReasonsDropDown = imageView2;
        this.ivCancelSubreasonsDropDown = imageView3;
        this.layoutErrorExchange = rowExchangeEddBinding;
        this.layoutReturnUserMsg = constraintLayout3;
        this.llCommentBox = linearLayout;
        this.returnItemCommentsBox = ajioEditText;
        this.returnUserActionMsg = ajioTextView3;
        this.returnUserMsg = ajioTextView4;
        this.til = textInputLayout;
        this.tilSubReason = textInputLayout2;
        this.tvCommentText = ajioTextView5;
        this.tvTotalChars = ajioTextView6;
    }

    public static ReturnExchangeReasonLayoutRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cancelReasonsDropDown;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Spinner)view2;
        if (view3 != null) {
            n3 = R$id.cancel_reasons_spinner_layout;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (RelativeLayout)view2;
            if (view4 != null) {
                n3 = R$id.cancel_subreasons_drop_down;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (Spinner)view2;
                if (view5 != null) {
                    n3 = R$id.cancel_subreasons_spinner_layout;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (RelativeLayout)view2;
                    if (view6 != null) {
                        n3 = R$id.edt;
                        Object object2 = view2 = dd2_2.a(n3, view);
                        object2 = (TextInputEditText)view2;
                        if (object2 != null) {
                            n3 = R$id.edtSubReason;
                            Object object3 = view2 = dd2_2.a(n3, view);
                            object3 = (TextInputEditText)view2;
                            if (object3 != null) {
                                Object object4 = view;
                                object4 = (ConstraintLayout)view;
                                n3 = R$id.exchange_return_comments_btn;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AjioTextView)view2;
                                if (object5 != null) {
                                    n3 = R$id.exchange_return_comments_label;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (AjioTextView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.imgCaution;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (ImageView)view2;
                                        if (view7 != null) {
                                            n3 = R$id.iv_cancel_reasons_drop_down;
                                            View view8 = view2 = dd2_2.a(n3, view);
                                            view8 = (ImageView)view2;
                                            if (view8 != null) {
                                                n3 = R$id.iv_cancel_subreasons_drop_down;
                                                View view9 = view2 = dd2_2.a(n3, view);
                                                view9 = (ImageView)view2;
                                                if (view9 != null && (view2 = dd2_2.a(n3 = R$id.layoutErrorExchange, view)) != null) {
                                                    RowExchangeEddBinding rowExchangeEddBinding = RowExchangeEddBinding.bind(view2);
                                                    n3 = R$id.layout_return_user_msg;
                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                    object7 = (ConstraintLayout)view2;
                                                    if (object7 != null) {
                                                        n3 = R$id.llCommentBox;
                                                        View view10 = view2 = dd2_2.a(n3, view);
                                                        view10 = (LinearLayout)view2;
                                                        if (view10 != null) {
                                                            n3 = R$id.return_item_comments_box;
                                                            Object object8 = view2 = dd2_2.a(n3, view);
                                                            object8 = (AjioEditText)view2;
                                                            if (object8 != null) {
                                                                n3 = R$id.return_user_action_msg;
                                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                                object9 = (AjioTextView)view2;
                                                                if (object9 != null) {
                                                                    n3 = R$id.return_user_msg;
                                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                                    object10 = (AjioTextView)view2;
                                                                    if (object10 != null) {
                                                                        n3 = R$id.til;
                                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                                        object11 = (TextInputLayout)view2;
                                                                        if (object11 != null) {
                                                                            n3 = R$id.tilSubReason;
                                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                                            object12 = (TextInputLayout)view2;
                                                                            if (object12 != null) {
                                                                                n3 = R$id.tv_comment_text;
                                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                                object13 = (AjioTextView)view2;
                                                                                if (object13 != null) {
                                                                                    n3 = R$id.tvTotalChars;
                                                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                                                    object14 = (AjioTextView)view2;
                                                                                    if (object14 != null) {
                                                                                        object = new ReturnExchangeReasonLayoutRevampBinding((ConstraintLayout)((Object)object4), (Spinner)view3, (RelativeLayout)view4, (Spinner)view5, (RelativeLayout)view6, (TextInputEditText)object2, (TextInputEditText)object3, (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (ImageView)view7, (ImageView)view8, (ImageView)view9, rowExchangeEddBinding, (ConstraintLayout)((Object)object7), (LinearLayout)view10, (AjioEditText)object8, (AjioTextView)object9, (AjioTextView)object10, (TextInputLayout)((Object)object11), (TextInputLayout)((Object)object12), (AjioTextView)object13, (AjioTextView)object14);
                                                                                        return object;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReturnExchangeReasonLayoutRevampBinding inflate(LayoutInflater layoutInflater) {
        return ReturnExchangeReasonLayoutRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnExchangeReasonLayoutRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_exchange_reason_layout_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnExchangeReasonLayoutRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

