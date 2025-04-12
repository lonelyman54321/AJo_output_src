/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AutoCompleteTextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentDeleteAccountBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    private final CardView rootView;
    public final AjioTextView tvCancel;
    public final AjioTextView tvDeleteAccount;
    public final AjioTextView tvMessage;
    public final AutoCompleteTextView tvReason;
    public final AjioTextView tvReasonTitle;
    public final AjioTextView tvTitle;

    private FragmentDeleteAccountBinding(CardView cardView, AjioLoaderView ajioLoaderView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AutoCompleteTextView autoCompleteTextView, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = cardView;
        this.ajioLoaderView = ajioLoaderView;
        this.tvCancel = ajioTextView;
        this.tvDeleteAccount = ajioTextView2;
        this.tvMessage = ajioTextView3;
        this.tvReason = autoCompleteTextView;
        this.tvReasonTitle = ajioTextView4;
        this.tvTitle = ajioTextView5;
    }

    public static FragmentDeleteAccountBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioLoaderView)view;
        if (object2 != null) {
            n3 = R$id.tv_cancel;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.tv_delete_account;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.tv_message;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.tv_Reason;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (AutoCompleteTextView)view;
                        if (view2 != null) {
                            n3 = R$id.tv_reason_title;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.tv_title;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    Object object8 = object;
                                    object8 = (CardView)((Object)object);
                                    FragmentDeleteAccountBinding fragmentDeleteAccountBinding = new FragmentDeleteAccountBinding((CardView)((Object)object8), (AjioLoaderView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AutoCompleteTextView)view2, (AjioTextView)object6, (AjioTextView)object7);
                                    return fragmentDeleteAccountBinding;
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

    public static FragmentDeleteAccountBinding inflate(LayoutInflater layoutInflater) {
        return FragmentDeleteAccountBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentDeleteAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_delete_account;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentDeleteAccountBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

