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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DeleteAccountSucessFragmentBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final AjioTextView tvDeleteAccount;
    public final AjioTextView tvMessage;
    public final AjioTextView tvTitle;

    private DeleteAccountSucessFragmentBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.tvDeleteAccount = ajioTextView;
        this.tvMessage = ajioTextView2;
        this.tvTitle = ajioTextView3;
    }

    public static DeleteAccountSucessFragmentBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.tv_delete_account;
        AjioTextView ajioTextView3 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView3 != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.tv_message, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_title, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            DeleteAccountSucessFragmentBinding deleteAccountSucessFragmentBinding = new DeleteAccountSucessFragmentBinding((ConstraintLayout)((Object)object), ajioTextView3, ajioTextView2, ajioTextView);
            return deleteAccountSucessFragmentBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static DeleteAccountSucessFragmentBinding inflate(LayoutInflater layoutInflater) {
        return DeleteAccountSucessFragmentBinding.inflate(layoutInflater, null, false);
    }

    public static DeleteAccountSucessFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.delete_account_sucess_fragment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DeleteAccountSucessFragmentBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

