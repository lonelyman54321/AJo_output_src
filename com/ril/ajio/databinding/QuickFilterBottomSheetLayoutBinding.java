/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class QuickFilterBottomSheetLayoutBinding
implements BC3 {
    public final TextView clearAllTv;
    public final AjioAspectRatioImageView closeStl;
    public final AjioTextView doneTv;
    public final RelativeLayout parentLayout;
    private final LinearLayoutCompat rootView;
    public final RecyclerView selectedQuickFiltersRv;
    public final RelativeLayout titleLayoutRl;
    public final TextView titleTv;

    private QuickFilterBottomSheetLayoutBinding(LinearLayoutCompat linearLayoutCompat, TextView textView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView, RelativeLayout relativeLayout, RecyclerView recyclerView, RelativeLayout relativeLayout2, TextView textView2) {
        this.rootView = linearLayoutCompat;
        this.clearAllTv = textView;
        this.closeStl = ajioAspectRatioImageView;
        this.doneTv = ajioTextView;
        this.parentLayout = relativeLayout;
        this.selectedQuickFiltersRv = recyclerView;
        this.titleLayoutRl = relativeLayout2;
        this.titleTv = textView2;
    }

    public static QuickFilterBottomSheetLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.clear_all_tv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.close_stl;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioAspectRatioImageView)view;
            if (object2 != null) {
                n3 = R$id.done_tv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.parent_layout;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (RelativeLayout)view;
                    if (view3 != null) {
                        n3 = R$id.selected_quick_filters_rv;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (RecyclerView)view;
                        if (object4 != null) {
                            n3 = R$id.title_layout_rl;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (RelativeLayout)view;
                            if (view4 != null) {
                                n3 = R$id.title_tv;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (TextView)view;
                                if (view5 != null) {
                                    Object object5 = object;
                                    object5 = (LinearLayoutCompat)((Object)object);
                                    QuickFilterBottomSheetLayoutBinding quickFilterBottomSheetLayoutBinding = new QuickFilterBottomSheetLayoutBinding((LinearLayoutCompat)((Object)object5), (TextView)view2, (AjioAspectRatioImageView)((Object)object2), (AjioTextView)object3, (RelativeLayout)view3, (RecyclerView)object4, (RelativeLayout)view4, (TextView)view5);
                                    return quickFilterBottomSheetLayoutBinding;
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

    public static QuickFilterBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return QuickFilterBottomSheetLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static QuickFilterBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.quick_filter_bottom_sheet_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return QuickFilterBottomSheetLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}

