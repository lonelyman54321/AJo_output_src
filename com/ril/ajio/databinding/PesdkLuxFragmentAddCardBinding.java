/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCheckBox;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.customviews.widgets.PesdkAddCardLoyaltyView;

public final class PesdkLuxFragmentAddCardBinding
implements BC3 {
    public final PesdkAddCardLoyaltyView addCardLoyaltyOfferLayout;
    public final LinearLayout addCardSaveLayout;
    public final AppCompatEditText cardCvvEt;
    public final TextInputLayout cardCvvInput;
    public final ImageView cardIcons;
    public final RelativeLayout cardLrLayout;
    public final AppCompatEditText cardNameEt;
    public final TextInputLayout cardNameInput;
    public final AppCompatEditText cardNumberEt;
    public final ImageView cardNumberImg;
    public final TextInputLayout cardNumberInput;
    public final AjioTextView cvvDetail;
    public final AjioCheckBox enrollCheckBox;
    public final AppCompatEditText expiryMonthEt;
    public final TextInputLayout expiryMonthInput;
    public final AppCompatEditText expiryYearEt;
    public final TextInputLayout expiryYearInput;
    public final LinearLayout fragmentPaymentListLayoutButton;
    public final FrameLayout laySecurePay;
    public final AjioTextView lblLr;
    public final AjioCheckBox lrCheckBox;
    public final PEProgressView paymentProgressBar;
    public final LinearLayout pesdkLayoutCoordinator;
    public final AjioTextView proceedBtnTv;
    private final FrameLayout rootView;
    public final AjioTextView tvLrBalance;
    public final TextView txtCardNameError;
    public final TextView txtCvvError;
    public final TextView txtExpiryMonthError;
    public final TextView txtExpiryYearError;
    public final TextView txtInvalidCardError;

    private PesdkLuxFragmentAddCardBinding(FrameLayout frameLayout, PesdkAddCardLoyaltyView pesdkAddCardLoyaltyView, LinearLayout linearLayout, AppCompatEditText appCompatEditText, TextInputLayout textInputLayout, ImageView imageView, RelativeLayout relativeLayout, AppCompatEditText appCompatEditText2, TextInputLayout textInputLayout2, AppCompatEditText appCompatEditText3, ImageView imageView2, TextInputLayout textInputLayout3, AjioTextView ajioTextView, AjioCheckBox ajioCheckBox, AppCompatEditText appCompatEditText4, TextInputLayout textInputLayout4, AppCompatEditText appCompatEditText5, TextInputLayout textInputLayout5, LinearLayout linearLayout2, FrameLayout frameLayout2, AjioTextView ajioTextView2, AjioCheckBox ajioCheckBox2, PEProgressView pEProgressView, LinearLayout linearLayout3, AjioTextView ajioTextView3, AjioTextView ajioTextView4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = frameLayout;
        this.addCardLoyaltyOfferLayout = pesdkAddCardLoyaltyView;
        this.addCardSaveLayout = linearLayout;
        this.cardCvvEt = appCompatEditText;
        this.cardCvvInput = textInputLayout;
        this.cardIcons = imageView;
        this.cardLrLayout = relativeLayout;
        this.cardNameEt = appCompatEditText2;
        this.cardNameInput = textInputLayout2;
        this.cardNumberEt = appCompatEditText3;
        this.cardNumberImg = imageView2;
        this.cardNumberInput = textInputLayout3;
        this.cvvDetail = ajioTextView;
        this.enrollCheckBox = ajioCheckBox;
        this.expiryMonthEt = appCompatEditText4;
        this.expiryMonthInput = textInputLayout4;
        this.expiryYearEt = appCompatEditText5;
        this.expiryYearInput = textInputLayout5;
        this.fragmentPaymentListLayoutButton = linearLayout2;
        this.laySecurePay = frameLayout2;
        this.lblLr = ajioTextView2;
        this.lrCheckBox = ajioCheckBox2;
        this.paymentProgressBar = pEProgressView;
        this.pesdkLayoutCoordinator = linearLayout3;
        this.proceedBtnTv = ajioTextView3;
        this.tvLrBalance = ajioTextView4;
        this.txtCardNameError = textView;
        this.txtCvvError = textView2;
        this.txtExpiryMonthError = textView3;
        this.txtExpiryYearError = textView4;
        this.txtInvalidCardError = textView5;
    }

    public static PesdkLuxFragmentAddCardBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.add_card_loyalty_offer_layout;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (PesdkAddCardLoyaltyView)view2;
        if (object2 != null) {
            n3 = R$id.add_card_save_layout;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (LinearLayout)view2;
            if (view3 != null) {
                n3 = R$id.card_cvv_et;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AppCompatEditText)view2;
                if (object3 != null) {
                    n3 = R$id.card_cvv_input;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (TextInputLayout)view2;
                    if (object4 != null) {
                        n3 = R$id.card_icons;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (ImageView)view2;
                        if (view4 != null) {
                            n3 = R$id.card_lr_layout;
                            View view5 = view2 = dd2_2.a(n3, view);
                            view5 = (RelativeLayout)view2;
                            if (view5 != null) {
                                n3 = R$id.card_name_et;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AppCompatEditText)view2;
                                if (object5 != null) {
                                    n3 = R$id.card_name_input;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (TextInputLayout)view2;
                                    if (object6 != null) {
                                        n3 = R$id.card_number_et;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (AppCompatEditText)view2;
                                        if (object7 != null) {
                                            n3 = R$id.card_number_img;
                                            View view6 = view2 = dd2_2.a(n3, view);
                                            view6 = (ImageView)view2;
                                            if (view6 != null) {
                                                n3 = R$id.card_number_input;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (TextInputLayout)view2;
                                                if (object8 != null) {
                                                    n3 = R$id.cvv_detail;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (AjioTextView)view2;
                                                    if (object9 != null) {
                                                        n3 = R$id.enroll_check_box;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (AjioCheckBox)view2;
                                                        if (object10 != null) {
                                                            n3 = R$id.expiry_month_et;
                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                            object11 = (AppCompatEditText)view2;
                                                            if (object11 != null) {
                                                                n3 = R$id.expiry_month_input;
                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                object12 = (TextInputLayout)view2;
                                                                if (object12 != null) {
                                                                    n3 = R$id.expiry_year_et;
                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                    object13 = (AppCompatEditText)view2;
                                                                    if (object13 != null) {
                                                                        n3 = R$id.expiry_year_input;
                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                        object14 = (TextInputLayout)view2;
                                                                        if (object14 != null) {
                                                                            n3 = R$id.fragment_payment_list_layout_button;
                                                                            View view7 = view2 = dd2_2.a(n3, view);
                                                                            view7 = (LinearLayout)view2;
                                                                            if (view7 != null) {
                                                                                n3 = R$id.lay_secure_pay;
                                                                                View view8 = view2 = dd2_2.a(n3, view);
                                                                                view8 = (FrameLayout)view2;
                                                                                if (view8 != null) {
                                                                                    n3 = R$id.lbl_lr;
                                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                                    object15 = (AjioTextView)view2;
                                                                                    if (object15 != null) {
                                                                                        n3 = R$id.lr_check_box;
                                                                                        Object object16 = view2 = dd2_2.a(n3, view);
                                                                                        object16 = (AjioCheckBox)view2;
                                                                                        if (object16 != null) {
                                                                                            n3 = R$id.payment_progress_bar;
                                                                                            Object object17 = view2 = dd2_2.a(n3, view);
                                                                                            object17 = (PEProgressView)view2;
                                                                                            if (object17 != null) {
                                                                                                n3 = R$id.pesdk_layout_coordinator;
                                                                                                View view9 = view2 = dd2_2.a(n3, view);
                                                                                                view9 = (LinearLayout)view2;
                                                                                                if (view9 != null) {
                                                                                                    n3 = R$id.proceed_btn_tv;
                                                                                                    Object object18 = view2 = dd2_2.a(n3, view);
                                                                                                    object18 = (AjioTextView)view2;
                                                                                                    if (object18 != null) {
                                                                                                        n3 = R$id.tv_lr_balance;
                                                                                                        Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                        object19 = (AjioTextView)view2;
                                                                                                        if (object19 != null) {
                                                                                                            n3 = R$id.txt_card_name_error;
                                                                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                                                                            view10 = (TextView)view2;
                                                                                                            if (view10 != null) {
                                                                                                                n3 = R$id.txt_cvv_error;
                                                                                                                View view11 = view2 = dd2_2.a(n3, view);
                                                                                                                view11 = (TextView)view2;
                                                                                                                if (view11 != null) {
                                                                                                                    n3 = R$id.txt_expiry_month_error;
                                                                                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                                                                                    view12 = (TextView)view2;
                                                                                                                    if (view12 != null) {
                                                                                                                        n3 = R$id.txt_expiry_year_error;
                                                                                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                                                                                        view13 = (TextView)view2;
                                                                                                                        if (view13 != null) {
                                                                                                                            n3 = R$id.txt_invalid_card_error;
                                                                                                                            View view14 = view2 = dd2_2.a(n3, view);
                                                                                                                            view14 = (TextView)view2;
                                                                                                                            if (view14 != null) {
                                                                                                                                View view15 = view;
                                                                                                                                view15 = (FrameLayout)view;
                                                                                                                                PesdkLuxFragmentAddCardBinding pesdkLuxFragmentAddCardBinding = new PesdkLuxFragmentAddCardBinding((FrameLayout)view15, (PesdkAddCardLoyaltyView)((Object)object2), (LinearLayout)view3, (AppCompatEditText)object3, (TextInputLayout)((Object)object4), (ImageView)view4, (RelativeLayout)view5, (AppCompatEditText)object5, (TextInputLayout)((Object)object6), (AppCompatEditText)object7, (ImageView)view6, (TextInputLayout)((Object)object8), (AjioTextView)object9, (AjioCheckBox)object10, (AppCompatEditText)object11, (TextInputLayout)((Object)object12), (AppCompatEditText)object13, (TextInputLayout)((Object)object14), (LinearLayout)view7, (FrameLayout)view8, (AjioTextView)object15, (AjioCheckBox)object16, (PEProgressView)((Object)object17), (LinearLayout)view9, (AjioTextView)object18, (AjioTextView)object19, (TextView)view10, (TextView)view11, (TextView)view12, (TextView)view13, (TextView)view14);
                                                                                                                                return pesdkLuxFragmentAddCardBinding;
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

    public static PesdkLuxFragmentAddCardBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxFragmentAddCardBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxFragmentAddCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_fragment_add_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxFragmentAddCardBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

