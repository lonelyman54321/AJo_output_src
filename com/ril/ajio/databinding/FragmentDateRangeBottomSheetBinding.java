/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RadioGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentDateRangeBottomSheetBinding
implements BC3 {
    public final View fdrbsClose;
    public final ImageView fdrbsIvClose;
    public final LinearLayout fdrbsLayoutContent;
    public final RadioGroup fdrbsRGOption;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;

    private FragmentDateRangeBottomSheetBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, LinearLayout linearLayout, RadioGroup radioGroup, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.fdrbsClose = view;
        this.fdrbsIvClose = imageView;
        this.fdrbsLayoutContent = linearLayout;
        this.fdrbsRGOption = radioGroup;
        this.parentLayout = constraintLayout2;
    }

    public static FragmentDateRangeBottomSheetBinding bind(View object) {
        int n3 = R$id.fdrbsClose;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            View view2;
            n3 = R$id.fdrbsIvClose;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.fdrbsLayoutContent;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (LinearLayout)view2;
                if (view4 != null) {
                    n3 = R$id.fdrbsRGOption;
                    View view5 = view2 = dd2_2.a(n3, object);
                    view5 = (RadioGroup)view2;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        view2 = object;
                        object = new FragmentDateRangeBottomSheetBinding((ConstraintLayout)((Object)object2), view, (ImageView)view3, (LinearLayout)view4, (RadioGroup)view5, (ConstraintLayout)((Object)object2));
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

    public static FragmentDateRangeBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return FragmentDateRangeBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentDateRangeBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_date_range_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentDateRangeBottomSheetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

