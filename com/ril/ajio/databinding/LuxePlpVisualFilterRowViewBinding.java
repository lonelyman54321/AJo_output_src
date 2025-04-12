/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxePlpVisualFilterRowViewBinding
implements BC3 {
    public final AjioTextView plpVisualFilterClearFilterTv;
    public final AjioTextView plpVisualFilterMoreFilterTv;
    public final RecyclerView plpVisualFilterRv;
    public final AjioTextView plpVisualHeadingTv;
    private final ConstraintLayout rootView;

    private LuxePlpVisualFilterRowViewBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RecyclerView recyclerView, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.plpVisualFilterClearFilterTv = ajioTextView;
        this.plpVisualFilterMoreFilterTv = ajioTextView2;
        this.plpVisualFilterRv = recyclerView;
        this.plpVisualHeadingTv = ajioTextView3;
    }

    public static LuxePlpVisualFilterRowViewBinding bind(View object) {
        View view;
        int n3 = R$id.plp_visual_filter_clear_filter_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.plp_visual_filter_more_filter_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.plp_visual_filter_rv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    n3 = R$id.plp_visual_heading_tv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (ConstraintLayout)((Object)object);
                        LuxePlpVisualFilterRowViewBinding luxePlpVisualFilterRowViewBinding = new LuxePlpVisualFilterRowViewBinding((ConstraintLayout)((Object)object6), (AjioTextView)object2, (AjioTextView)object3, (RecyclerView)object4, (AjioTextView)object5);
                        return luxePlpVisualFilterRowViewBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePlpVisualFilterRowViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpVisualFilterRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpVisualFilterRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_visual_filter_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpVisualFilterRowViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

