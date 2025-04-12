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

public final class RowReferralImageBinding
implements BC3 {
    public final Group baseReferralScreenElementsGroup;
    public final AppCompatImageView copyClipboard;
    public final ConstraintLayout referralBg;
    public final TextView referralCode;
    public final View referralCodeBg;
    public final ImageView referralImg;
    public final CardView referralImgContainer;
    private final ConstraintLayout rootView;
    public final AppCompatImageView share;
    public final TextView yourCodeTv;

    private RowReferralImageBinding(ConstraintLayout constraintLayout, Group group, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextView textView, View view, ImageView imageView, CardView cardView, AppCompatImageView appCompatImageView2, TextView textView2) {
        this.rootView = constraintLayout;
        this.baseReferralScreenElementsGroup = group;
        this.copyClipboard = appCompatImageView;
        this.referralBg = constraintLayout2;
        this.referralCode = textView;
        this.referralCodeBg = view;
        this.referralImg = imageView;
        this.referralImgContainer = cardView;
        this.share = appCompatImageView2;
        this.yourCodeTv = textView2;
    }

    public static RowReferralImageBinding bind(View object) {
        View view;
        int n3 = R$id.base_referral_screen_elements_group;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (Group)view;
        if (view2 != null) {
            n3 = R$id.copy_clipboard;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AppCompatImageView)view;
            if (object2 != null) {
                n3 = R$id.referral_bg;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (ConstraintLayout)view;
                if (object3 != null) {
                    View view3;
                    n3 = R$id.referral_code;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null && (view3 = dd2_2.a(n3 = R$id.referral_code_bg, object)) != null) {
                        n3 = R$id.referral_img;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (ImageView)view;
                        if (view5 != null) {
                            n3 = R$id.referral_img_container;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (CardView)view;
                            if (object4 != null) {
                                n3 = R$id.share;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AppCompatImageView)view;
                                if (object5 != null) {
                                    n3 = R$id.your_code_tv;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (TextView)view;
                                    if (view6 != null) {
                                        Object object6 = object;
                                        object6 = (ConstraintLayout)((Object)object);
                                        RowReferralImageBinding rowReferralImageBinding = new RowReferralImageBinding((ConstraintLayout)((Object)object6), (Group)view2, (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), (TextView)view4, view3, (ImageView)view5, (CardView)((Object)object4), (AppCompatImageView)((Object)object5), (TextView)view6);
                                        return rowReferralImageBinding;
                                    }
                                }
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

    public static RowReferralImageBinding inflate(LayoutInflater layoutInflater) {
        return RowReferralImageBinding.inflate(layoutInflater, null, false);
    }

    public static RowReferralImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_referral_image;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReferralImageBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

