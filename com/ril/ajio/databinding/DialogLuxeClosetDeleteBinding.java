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
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DialogLuxeClosetDeleteBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final AjioTextView cancelBtnCloset;
    public final FrameLayout cancelContainer;
    public final AjioTextView removeBtn;
    public final AjioTextView removeHeader;
    public final AjioTextView removeSubHeader;
    private final LinearLayout rootView;
    public final Guideline wishlistGuideline;

    private DialogLuxeClosetDeleteBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView, FrameLayout frameLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, Guideline guideline) {
        this.rootView = linearLayout;
        this.cancelBtn = imageView;
        this.cancelBtnCloset = ajioTextView;
        this.cancelContainer = frameLayout;
        this.removeBtn = ajioTextView2;
        this.removeHeader = ajioTextView3;
        this.removeSubHeader = ajioTextView4;
        this.wishlistGuideline = guideline;
    }

    public static DialogLuxeClosetDeleteBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelBtnCloset;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.cancelContainer;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (FrameLayout)view;
                if (view3 != null) {
                    n3 = R$id.removeBtn;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.removeHeader;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.removeSubHeader;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                n3 = R$id.wishlistGuideline;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (Guideline)view;
                                if (view4 != null) {
                                    Object object6 = object;
                                    object6 = (LinearLayout)object;
                                    DialogLuxeClosetDeleteBinding dialogLuxeClosetDeleteBinding = new DialogLuxeClosetDeleteBinding((LinearLayout)object6, (ImageView)view2, (AjioTextView)object2, (FrameLayout)view3, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (Guideline)view4);
                                    return dialogLuxeClosetDeleteBinding;
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

    public static DialogLuxeClosetDeleteBinding inflate(LayoutInflater layoutInflater) {
        return DialogLuxeClosetDeleteBinding.inflate(layoutInflater, null, false);
    }

    public static DialogLuxeClosetDeleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_luxe_closet_delete;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogLuxeClosetDeleteBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

