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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxePlpHeaderRowViewBinding
implements BC3 {
    public final AjioEllipsisTextView luxePlpHeaderRowBrandDescTv;
    public final AjioTextView luxePlpHeaderRowDescReadMoreTv;
    public final AjioTextView luxePlpHeaderRowSubtitleTv;
    public final AjioTextView luxePlpHeaderRowTitleTv;
    private final LinearLayout rootView;

    private LuxePlpHeaderRowViewBinding(LinearLayout linearLayout, AjioEllipsisTextView ajioEllipsisTextView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.luxePlpHeaderRowBrandDescTv = ajioEllipsisTextView;
        this.luxePlpHeaderRowDescReadMoreTv = ajioTextView;
        this.luxePlpHeaderRowSubtitleTv = ajioTextView2;
        this.luxePlpHeaderRowTitleTv = ajioTextView3;
    }

    public static LuxePlpHeaderRowViewBinding bind(View object) {
        View view;
        int n3 = R$id.luxe_plp_header_row_brand_desc_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioEllipsisTextView)view;
        if (object2 != null) {
            n3 = R$id.luxe_plp_header_row_desc_read_more_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.luxe_plp_header_row_subtitle_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.luxe_plp_header_row_title_tv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (LinearLayout)object;
                        LuxePlpHeaderRowViewBinding luxePlpHeaderRowViewBinding = new LuxePlpHeaderRowViewBinding((LinearLayout)object6, (AjioEllipsisTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5);
                        return luxePlpHeaderRowViewBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePlpHeaderRowViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpHeaderRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpHeaderRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_header_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpHeaderRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

