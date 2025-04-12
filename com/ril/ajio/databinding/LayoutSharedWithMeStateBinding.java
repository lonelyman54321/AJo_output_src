/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutSharedWithMeStateBinding
implements BC3 {
    public final ImageView fswmdIvState;
    public final LinearLayout fswmdLayoutState;
    public final ConstraintLayout fswmdLayoutStateDesc;
    public final AjioTextView fswmdTvContinueShopping;
    public final TextView fswmdTvRestoreItems;
    public final TextView fswmdTvState;
    public final TextView fswmdTvStateDesc;
    private final LinearLayout rootView;

    private LayoutSharedWithMeStateBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, ConstraintLayout constraintLayout, AjioTextView ajioTextView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.fswmdIvState = imageView;
        this.fswmdLayoutState = linearLayout2;
        this.fswmdLayoutStateDesc = constraintLayout;
        this.fswmdTvContinueShopping = ajioTextView;
        this.fswmdTvRestoreItems = textView;
        this.fswmdTvState = textView2;
        this.fswmdTvStateDesc = textView3;
    }

    public static LayoutSharedWithMeStateBinding bind(View object) {
        View view;
        int n3 = R$id.fswmdIvState;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            View view3 = object;
            view3 = (LinearLayout)object;
            n3 = R$id.fswmdLayoutStateDesc;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (ConstraintLayout)view;
            if (object2 != null) {
                n3 = R$id.fswmdTvContinueShopping;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.fswmdTvRestoreItems;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.fswmdTvState;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            n3 = R$id.fswmdTvStateDesc;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (TextView)view;
                            if (view6 != null) {
                                object = new LayoutSharedWithMeStateBinding((LinearLayout)view3, (ImageView)view2, (LinearLayout)view3, (ConstraintLayout)((Object)object2), (AjioTextView)object3, (TextView)view4, (TextView)view5, (TextView)view6);
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

    public static LayoutSharedWithMeStateBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSharedWithMeStateBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSharedWithMeStateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_shared_with_me_state;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSharedWithMeStateBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

