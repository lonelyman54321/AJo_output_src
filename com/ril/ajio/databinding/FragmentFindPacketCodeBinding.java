/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentFindPacketCodeBinding
implements BC3 {
    public final AppCompatImageView closeDialog;
    public final AjioTextView okayButton;
    public final ImageView packetIdIv;
    public final TextView popupDescriptionTv;
    public final TextView popupQuestionDescriptionTv;
    public final TextView popupQuestionTitleTv;
    public final TextView popupTitleTv;
    private final RelativeLayout rootView;

    private FragmentFindPacketCodeBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, AjioTextView ajioTextView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.closeDialog = appCompatImageView;
        this.okayButton = ajioTextView;
        this.packetIdIv = imageView;
        this.popupDescriptionTv = textView;
        this.popupQuestionDescriptionTv = textView2;
        this.popupQuestionTitleTv = textView3;
        this.popupTitleTv = textView4;
    }

    public static FragmentFindPacketCodeBinding bind(View object) {
        View view;
        int n3 = R$id.close_dialog;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.okay_button;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.packet_id_iv;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (ImageView)view;
                if (view2 != null) {
                    n3 = R$id.popupDescription_tv;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (TextView)view;
                    if (view3 != null) {
                        n3 = R$id.popupQuestionDescription_tv;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            n3 = R$id.popupQuestionTitle_tv;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                n3 = R$id.popupTitle_tv;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (TextView)view;
                                if (view6 != null) {
                                    Object object4 = object;
                                    object4 = (RelativeLayout)object;
                                    FragmentFindPacketCodeBinding fragmentFindPacketCodeBinding = new FragmentFindPacketCodeBinding((RelativeLayout)object4, (AppCompatImageView)((Object)object2), (AjioTextView)object3, (ImageView)view2, (TextView)view3, (TextView)view4, (TextView)view5, (TextView)view6);
                                    return fragmentFindPacketCodeBinding;
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

    public static FragmentFindPacketCodeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentFindPacketCodeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentFindPacketCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_find_packet_code;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentFindPacketCodeBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

