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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentReturnRequestCancelBinding
implements BC3 {
    public final AjioTextView odCancelBtnOk;
    public final AjioImageView odCancelImvClose;
    public final RecyclerView recyclerView;
    private final LinearLayoutCompat rootView;
    public final AjioTextView tvTitle;

    private FragmentReturnRequestCancelBinding(LinearLayoutCompat linearLayoutCompat, AjioTextView ajioTextView, AjioImageView ajioImageView, RecyclerView recyclerView, AjioTextView ajioTextView2) {
        this.rootView = linearLayoutCompat;
        this.odCancelBtnOk = ajioTextView;
        this.odCancelImvClose = ajioImageView;
        this.recyclerView = recyclerView;
        this.tvTitle = ajioTextView2;
    }

    public static FragmentReturnRequestCancelBinding bind(View object) {
        View view;
        int n3 = R$id.od_cancel_btn_ok;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.od_cancel_imv_close;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioImageView)view;
            if (object3 != null) {
                n3 = R$id.recycler_view;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    n3 = R$id.tvTitle;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (LinearLayoutCompat)((Object)object);
                        FragmentReturnRequestCancelBinding fragmentReturnRequestCancelBinding = new FragmentReturnRequestCancelBinding((LinearLayoutCompat)((Object)object6), (AjioTextView)object2, (AjioImageView)((Object)object3), (RecyclerView)object4, (AjioTextView)object5);
                        return fragmentReturnRequestCancelBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentReturnRequestCancelBinding inflate(LayoutInflater layoutInflater) {
        return FragmentReturnRequestCancelBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentReturnRequestCancelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_return_request_cancel;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentReturnRequestCancelBinding.bind((View)layoutInflater);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}

