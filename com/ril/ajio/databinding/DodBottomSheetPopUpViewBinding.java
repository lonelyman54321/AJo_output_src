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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DodBottomSheetPopUpViewBinding
implements BC3 {
    public final LinearLayout dodBottomSheetPopUpEndsInLayout;
    public final AjioTextView dodBottomSheetPopUpEndsInTv;
    public final AjioTextView dodBottomSheetPopUpMsgTv;
    public final AjioTextView dodBottomSheetPopUpOkTv;
    public final AjioTextView mainTitle;
    private final LinearLayout rootView;

    private DodBottomSheetPopUpViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = linearLayout;
        this.dodBottomSheetPopUpEndsInLayout = linearLayout2;
        this.dodBottomSheetPopUpEndsInTv = ajioTextView;
        this.dodBottomSheetPopUpMsgTv = ajioTextView2;
        this.dodBottomSheetPopUpOkTv = ajioTextView3;
        this.mainTitle = ajioTextView4;
    }

    public static DodBottomSheetPopUpViewBinding bind(View object) {
        View view;
        int n3 = R$id.dod_bottom_sheet_pop_up_ends_in_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.dod_bottom_sheet_pop_up_ends_in_tv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.dod_bottom_sheet_pop_up_msg_tv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.dod_bottom_sheet_pop_up_ok_tv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.main_title;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            Object object6 = object;
                            object6 = (LinearLayout)object;
                            DodBottomSheetPopUpViewBinding dodBottomSheetPopUpViewBinding = new DodBottomSheetPopUpViewBinding((LinearLayout)object6, (LinearLayout)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5);
                            return dodBottomSheetPopUpViewBinding;
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

    public static DodBottomSheetPopUpViewBinding inflate(LayoutInflater layoutInflater) {
        return DodBottomSheetPopUpViewBinding.inflate(layoutInflater, null, false);
    }

    public static DodBottomSheetPopUpViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dod_bottom_sheet_pop_up_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DodBottomSheetPopUpViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

