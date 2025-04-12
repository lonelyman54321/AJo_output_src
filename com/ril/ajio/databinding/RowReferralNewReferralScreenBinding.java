/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.RowImageTextBinding;
import com.ril.ajio.databinding.RowTwoImageTextBinding;

public final class RowReferralNewReferralScreenBinding
implements BC3 {
    public final AppCompatImageView copyClipboard;
    public final TextView inviteCodeTextview;
    public final Group newReferralElementsGroup;
    public final RowImageTextBinding refereeDetails;
    public final ConstraintLayout referralBg;
    public final TextView referralCode;
    public final View referralCodeBg;
    public final TextView referralDescriptionTextview;
    public final ImageView referralImg;
    public final CardView referralImgContainer;
    public final RowTwoImageTextBinding referrerBenefitsDetails;
    public final RowImageTextBinding referrerDetails;
    private final ConstraintLayout rootView;
    public final View shareBtnBg;
    public final TextView shareEnlargedBtn;
    public final TextView tapToCopyTv;

    private RowReferralNewReferralScreenBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, Group group, RowImageTextBinding rowImageTextBinding, ConstraintLayout constraintLayout2, TextView textView2, View view, TextView textView3, ImageView imageView, CardView cardView, RowTwoImageTextBinding rowTwoImageTextBinding, RowImageTextBinding rowImageTextBinding2, View view2, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.copyClipboard = appCompatImageView;
        this.inviteCodeTextview = textView;
        this.newReferralElementsGroup = group;
        this.refereeDetails = rowImageTextBinding;
        this.referralBg = constraintLayout2;
        this.referralCode = textView2;
        this.referralCodeBg = view;
        this.referralDescriptionTextview = textView3;
        this.referralImg = imageView;
        this.referralImgContainer = cardView;
        this.referrerBenefitsDetails = rowTwoImageTextBinding;
        this.referrerDetails = rowImageTextBinding2;
        this.shareBtnBg = view2;
        this.shareEnlargedBtn = textView4;
        this.tapToCopyTv = textView5;
    }

    public static RowReferralNewReferralScreenBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.copy_clipboard;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppCompatImageView)view2;
        if (object2 != null) {
            n3 = R$id.invite_code_textview;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.new_referral_elements_group;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (Group)view2;
                if (view4 != null && (view2 = dd2_2.a(n3 = R$id.referee_details, view)) != null) {
                    RowImageTextBinding rowImageTextBinding = RowImageTextBinding.bind(view2);
                    n3 = R$id.referral_bg;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (ConstraintLayout)view2;
                    if (object3 != null) {
                        View view5;
                        n3 = R$id.referral_code;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (TextView)view2;
                        if (view6 != null && (view5 = dd2_2.a(n3 = R$id.referral_code_bg, view)) != null) {
                            n3 = R$id.referral_description_textview;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (TextView)view2;
                            if (view7 != null) {
                                n3 = R$id.referral_img;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (ImageView)view2;
                                if (view8 != null) {
                                    n3 = R$id.referral_img_container;
                                    Object object4 = view2 = dd2_2.a(n3, view);
                                    object4 = (CardView)view2;
                                    if (object4 != null && (view2 = dd2_2.a(n3 = R$id.referrer_benefits_details, view)) != null) {
                                        RowTwoImageTextBinding rowTwoImageTextBinding = RowTwoImageTextBinding.bind(view2);
                                        n3 = R$id.referrer_details;
                                        view2 = dd2_2.a(n3, view);
                                        if (view2 != null) {
                                            RowImageTextBinding rowImageTextBinding2 = RowImageTextBinding.bind(view2);
                                            n3 = R$id.share_btn_bg;
                                            View view9 = dd2_2.a(n3, view);
                                            if (view9 != null) {
                                                n3 = R$id.share_enlarged_btn;
                                                View view10 = view2 = dd2_2.a(n3, view);
                                                view10 = (TextView)view2;
                                                if (view10 != null) {
                                                    n3 = R$id.tap_to_copy_tv;
                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                    view11 = (TextView)view2;
                                                    if (view11 != null) {
                                                        Object object5 = view;
                                                        object5 = (ConstraintLayout)view;
                                                        RowReferralNewReferralScreenBinding rowReferralNewReferralScreenBinding = new RowReferralNewReferralScreenBinding((ConstraintLayout)((Object)object5), (AppCompatImageView)((Object)object2), (TextView)view3, (Group)view4, rowImageTextBinding, (ConstraintLayout)((Object)object3), (TextView)view6, view5, (TextView)view7, (ImageView)view8, (CardView)((Object)object4), rowTwoImageTextBinding, rowImageTextBinding2, view9, (TextView)view10, (TextView)view11);
                                                        return rowReferralNewReferralScreenBinding;
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

    public static RowReferralNewReferralScreenBinding inflate(LayoutInflater layoutInflater) {
        return RowReferralNewReferralScreenBinding.inflate(layoutInflater, null, false);
    }

    public static RowReferralNewReferralScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_referral_new_referral_screen;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReferralNewReferralScreenBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

