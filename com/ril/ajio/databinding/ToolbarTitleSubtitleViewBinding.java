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
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.CircularImageView;

public final class ToolbarTitleSubtitleViewBinding
implements BC3 {
    public final CircularImageView imgBrandLogo;
    public final LinearLayout linearLayout;
    public final ConstraintLayout mainToolbarLayout;
    private final ConstraintLayout rootView;
    public final AjioTextView toolbarSubtitleTv;
    public final AjioTextView toolbarTitleTv;

    private ToolbarTitleSubtitleViewBinding(ConstraintLayout constraintLayout, CircularImageView circularImageView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.imgBrandLogo = circularImageView;
        this.linearLayout = linearLayout;
        this.mainToolbarLayout = constraintLayout2;
        this.toolbarSubtitleTv = ajioTextView;
        this.toolbarTitleTv = ajioTextView2;
    }

    public static ToolbarTitleSubtitleViewBinding bind(View object) {
        View view;
        int n3 = R$id.imgBrandLogo;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (CircularImageView)view;
        if (object2 != null) {
            n3 = R$id.linearLayout;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                Object object3 = object;
                object3 = (ConstraintLayout)((Object)object);
                n3 = R$id.toolbar_subtitle_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.toolbar_title_tv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        object = new ToolbarTitleSubtitleViewBinding((ConstraintLayout)((Object)object3), (CircularImageView)((Object)object2), (LinearLayout)view2, (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ToolbarTitleSubtitleViewBinding inflate(LayoutInflater layoutInflater) {
        return ToolbarTitleSubtitleViewBinding.inflate(layoutInflater, null, false);
    }

    public static ToolbarTitleSubtitleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.toolbar_title_subtitle_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarTitleSubtitleViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

