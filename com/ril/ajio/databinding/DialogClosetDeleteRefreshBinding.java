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
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogClosetDeleteRefreshBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final TextView cancelBtnCloset;
    public final FrameLayout cancelContainer;
    public final TextView removeBtn;
    public final TextView removeHeader;
    public final TextView removeSubHeader;
    private final LinearLayout rootView;
    public final Guideline wishlistGuideline;

    private DialogClosetDeleteRefreshBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, Guideline guideline) {
        this.rootView = linearLayout;
        this.cancelBtn = imageView;
        this.cancelBtnCloset = textView;
        this.cancelContainer = frameLayout;
        this.removeBtn = textView2;
        this.removeHeader = textView3;
        this.removeSubHeader = textView4;
        this.wishlistGuideline = guideline;
    }

    public static DialogClosetDeleteRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelBtnCloset;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.cancelContainer;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (FrameLayout)view;
                if (view4 != null) {
                    n3 = R$id.removeBtn;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.removeHeader;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.removeSubHeader;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.wishlistGuideline;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (Guideline)view;
                                if (view8 != null) {
                                    Object object2 = object;
                                    object2 = (LinearLayout)object;
                                    DialogClosetDeleteRefreshBinding dialogClosetDeleteRefreshBinding = new DialogClosetDeleteRefreshBinding((LinearLayout)object2, (ImageView)view2, (TextView)view3, (FrameLayout)view4, (TextView)view5, (TextView)view6, (TextView)view7, (Guideline)view8);
                                    return dialogClosetDeleteRefreshBinding;
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

    public static DialogClosetDeleteRefreshBinding inflate(LayoutInflater layoutInflater) {
        return DialogClosetDeleteRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static DialogClosetDeleteRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_closet_delete_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogClosetDeleteRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

