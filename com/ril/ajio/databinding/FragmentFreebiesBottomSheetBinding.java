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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentFreebiesBottomSheetBinding
implements BC3 {
    public final AppCompatImageView closeDialog;
    public final RecyclerView freebiesRecyclerView;
    public final LinearLayout parentLayout;
    public final LinearLayout parentSummaryLayout;
    private final LinearLayout rootView;
    public final AjioTextView topTitle;

    private FragmentFreebiesBottomSheetBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, RecyclerView recyclerView, LinearLayout linearLayout2, LinearLayout linearLayout3, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.closeDialog = appCompatImageView;
        this.freebiesRecyclerView = recyclerView;
        this.parentLayout = linearLayout2;
        this.parentSummaryLayout = linearLayout3;
        this.topTitle = ajioTextView;
    }

    public static FragmentFreebiesBottomSheetBinding bind(View object) {
        View view;
        int n3 = R$id.close_dialog;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.freebiesRecyclerView;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (RecyclerView)view;
            if (object3 != null) {
                Object object4 = object;
                object4 = (LinearLayout)object;
                n3 = R$id.parent_summary_layout;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.top_title;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        object = new FragmentFreebiesBottomSheetBinding((LinearLayout)object4, (AppCompatImageView)((Object)object2), (RecyclerView)object3, (LinearLayout)object4, (LinearLayout)view2, (AjioTextView)object5);
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

    public static FragmentFreebiesBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return FragmentFreebiesBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentFreebiesBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_freebies_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentFreebiesBottomSheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

