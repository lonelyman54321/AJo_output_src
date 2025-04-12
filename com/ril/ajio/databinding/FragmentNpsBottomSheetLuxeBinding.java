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
import com.ril.ajio.payment.view.NpsView;

public final class FragmentNpsBottomSheetLuxeBinding
implements BC3 {
    public final ImageView frIvClose;
    public final LinearLayout frLayoutContent;
    public final LinearLayout frLayoutSubmit;
    public final NpsView frNps;
    public final TextView frTvSubmit;
    public final View frvClose;
    public final LinearLayout frvLayoutPostRating;
    private final ConstraintLayout rootView;

    private FragmentNpsBottomSheetLuxeBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, NpsView npsView, TextView textView, View view, LinearLayout linearLayout3) {
        this.rootView = constraintLayout;
        this.frIvClose = imageView;
        this.frLayoutContent = linearLayout;
        this.frLayoutSubmit = linearLayout2;
        this.frNps = npsView;
        this.frTvSubmit = textView;
        this.frvClose = view;
        this.frvLayoutPostRating = linearLayout3;
    }

    public static FragmentNpsBottomSheetLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.frIvClose;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.frLayoutContent;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.frLayoutSubmit;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (LinearLayout)view;
                if (view4 != null) {
                    n3 = R$id.frNps;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (NpsView)view;
                    if (object2 != null) {
                        View view5;
                        n3 = R$id.frTvSubmit;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null && (view5 = dd2_2.a(n3 = R$id.frvClose, object)) != null) {
                            n3 = R$id.frvLayoutPostRating;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (LinearLayout)view;
                            if (view7 != null) {
                                Object object3 = object;
                                object3 = (ConstraintLayout)((Object)object);
                                FragmentNpsBottomSheetLuxeBinding fragmentNpsBottomSheetLuxeBinding = new FragmentNpsBottomSheetLuxeBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (LinearLayout)view3, (LinearLayout)view4, (NpsView)object2, (TextView)view6, view5, (LinearLayout)view7);
                                return fragmentNpsBottomSheetLuxeBinding;
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

    public static FragmentNpsBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentNpsBottomSheetLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentNpsBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_nps_bottom_sheet_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentNpsBottomSheetLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

