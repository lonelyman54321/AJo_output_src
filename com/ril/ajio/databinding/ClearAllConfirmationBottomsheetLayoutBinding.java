/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ClearAllConfirmationBottomsheetLayoutBinding
implements BC3 {
    public final AjioTextView cancelClearBtn;
    public final CardView cardView;
    public final AjioTextView clearAllBtn;
    public final ImageView clearFilterCancelIv;
    public final FrameLayout clearFilterCancelView;
    private final ConstraintLayout rootView;
    public final TextView textView;

    private ClearAllConfirmationBottomsheetLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, CardView cardView, AjioTextView ajioTextView2, ImageView imageView, FrameLayout frameLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.cancelClearBtn = ajioTextView;
        this.cardView = cardView;
        this.clearAllBtn = ajioTextView2;
        this.clearFilterCancelIv = imageView;
        this.clearFilterCancelView = frameLayout;
        this.textView = textView;
    }

    public static ClearAllConfirmationBottomsheetLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.cancelClearBtn;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.cardView;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (CardView)view;
            if (object3 != null) {
                n3 = R$id.clearAllBtn;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.clear_filter_cancel_iv;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (ImageView)view;
                    if (view2 != null) {
                        n3 = R$id.clear_filter_cancel_view;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (FrameLayout)view;
                        if (view3 != null) {
                            n3 = R$id.textView;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (TextView)view;
                            if (view4 != null) {
                                Object object5 = object;
                                object5 = (ConstraintLayout)((Object)object);
                                ClearAllConfirmationBottomsheetLayoutBinding clearAllConfirmationBottomsheetLayoutBinding = new ClearAllConfirmationBottomsheetLayoutBinding((ConstraintLayout)((Object)object5), (AjioTextView)object2, (CardView)((Object)object3), (AjioTextView)object4, (ImageView)view2, (FrameLayout)view3, (TextView)view4);
                                return clearAllConfirmationBottomsheetLayoutBinding;
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

    public static ClearAllConfirmationBottomsheetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ClearAllConfirmationBottomsheetLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ClearAllConfirmationBottomsheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.clear_all_confirmation_bottomsheet_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ClearAllConfirmationBottomsheetLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

