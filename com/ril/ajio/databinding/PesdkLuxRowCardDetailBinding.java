/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCheckBox;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;

public final class PesdkLuxRowCardDetailBinding
implements BC3 {
    public final TextInputLayout cardCvvInput;
    public final RelativeLayout cardLrLayout;
    public final EditText creditCardEtCvv;
    public final ImageView creditCardImv;
    public final AjioTextView creditCardLblWhatsThis;
    public final AjioTextView creditCardTvBank;
    public final RelativeLayout cvvLayout;
    public final PesdkLoyaltyCardInfoView layoutLoyaltyCardInfo;
    public final AjioTextView lblLr;
    public final AjioCheckBox lrCheckBox;
    public final RelativeLayout peCardDetailParent;
    public final PEProgressView peCreditcardProgressBar;
    public final AjioTextView proceedBtnTv;
    private final RelativeLayout rootView;
    public final AjioTextView starText;
    public final AjioTextView tvLrBalance;
    public final CardView viewCreditCardCard;
    public final LinearLayout viewCreditCardLayout;

    private PesdkLuxRowCardDetailBinding(RelativeLayout relativeLayout, TextInputLayout textInputLayout, RelativeLayout relativeLayout2, EditText editText, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout3, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, AjioTextView ajioTextView3, AjioCheckBox ajioCheckBox, RelativeLayout relativeLayout4, PEProgressView pEProgressView, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, CardView cardView, LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.cardCvvInput = textInputLayout;
        this.cardLrLayout = relativeLayout2;
        this.creditCardEtCvv = editText;
        this.creditCardImv = imageView;
        this.creditCardLblWhatsThis = ajioTextView;
        this.creditCardTvBank = ajioTextView2;
        this.cvvLayout = relativeLayout3;
        this.layoutLoyaltyCardInfo = pesdkLoyaltyCardInfoView;
        this.lblLr = ajioTextView3;
        this.lrCheckBox = ajioCheckBox;
        this.peCardDetailParent = relativeLayout4;
        this.peCreditcardProgressBar = pEProgressView;
        this.proceedBtnTv = ajioTextView4;
        this.starText = ajioTextView5;
        this.tvLrBalance = ajioTextView6;
        this.viewCreditCardCard = cardView;
        this.viewCreditCardLayout = linearLayout;
    }

    public static PesdkLuxRowCardDetailBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.card_cvv_input;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (TextInputLayout)view2;
        if (object2 != null) {
            n3 = R$id.card_lr_layout;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (RelativeLayout)view2;
            if (view3 != null) {
                n3 = R$id.credit_card_et_cvv;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (EditText)view2;
                if (view4 != null) {
                    n3 = R$id.credit_card_imv;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (ImageView)view2;
                    if (view5 != null) {
                        n3 = R$id.credit_card_lbl_whatsThis;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null) {
                            n3 = R$id.credit_card_tv_bank;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (AjioTextView)view2;
                            if (object4 != null) {
                                n3 = R$id.cvv_layout;
                                View view6 = view2 = dd2_2.a(n3, view);
                                view6 = (RelativeLayout)view2;
                                if (view6 != null) {
                                    n3 = R$id.layout_loyaltyCardInfo;
                                    Object object5 = view2 = dd2_2.a(n3, view);
                                    object5 = (PesdkLoyaltyCardInfoView)view2;
                                    if (object5 != null) {
                                        n3 = R$id.lbl_lr;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (AjioTextView)view2;
                                        if (object6 != null) {
                                            n3 = R$id.lr_check_box;
                                            Object object7 = view2 = dd2_2.a(n3, view);
                                            object7 = (AjioCheckBox)view2;
                                            if (object7 != null) {
                                                View view7 = view;
                                                view7 = (RelativeLayout)view;
                                                n3 = R$id.pe_creditcard_progress_bar;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (PEProgressView)view2;
                                                if (object8 != null) {
                                                    n3 = R$id.proceed_btn_tv;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (AjioTextView)view2;
                                                    if (object9 != null) {
                                                        n3 = R$id.star_text;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (AjioTextView)view2;
                                                        if (object10 != null) {
                                                            n3 = R$id.tv_lr_balance;
                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                            object11 = (AjioTextView)view2;
                                                            if (object11 != null) {
                                                                n3 = R$id.view_credit_card_card;
                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                object12 = (CardView)view2;
                                                                if (object12 != null) {
                                                                    n3 = R$id.view_credit_card_layout;
                                                                    View view8 = view2 = dd2_2.a(n3, view);
                                                                    view8 = (LinearLayout)view2;
                                                                    if (view8 != null) {
                                                                        object = new PesdkLuxRowCardDetailBinding((RelativeLayout)view7, (TextInputLayout)((Object)object2), (RelativeLayout)view3, (EditText)view4, (ImageView)view5, (AjioTextView)object3, (AjioTextView)object4, (RelativeLayout)view6, (PesdkLoyaltyCardInfoView)((Object)object5), (AjioTextView)object6, (AjioCheckBox)object7, (RelativeLayout)view7, (PEProgressView)((Object)object8), (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (CardView)((Object)object12), (LinearLayout)view8);
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
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxRowCardDetailBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowCardDetailBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowCardDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_card_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowCardDetailBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

