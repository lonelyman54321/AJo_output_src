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
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ToolbarGamezoneOpengameBinding
implements BC3 {
    public final AjioImageView opengameImvBack;
    public final AjioImageView opengameImvClose;
    public final AjioTextView opengameToolbarTitleTv;
    private final Toolbar rootView;

    private ToolbarGamezoneOpengameBinding(Toolbar toolbar, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioTextView ajioTextView) {
        this.rootView = toolbar;
        this.opengameImvBack = ajioImageView;
        this.opengameImvClose = ajioImageView2;
        this.opengameToolbarTitleTv = ajioTextView;
    }

    public static ToolbarGamezoneOpengameBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioImageView ajioImageView;
        int n3 = R$id.opengame_imv_back;
        AjioImageView ajioImageView2 = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView2 != null && (ajioImageView = (AjioImageView)dd2_2.a(n3 = R$id.opengame_imv_close, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.opengame_toolbar_title_tv, object)) != null) {
            object = (Toolbar)object;
            ToolbarGamezoneOpengameBinding toolbarGamezoneOpengameBinding = new ToolbarGamezoneOpengameBinding((Toolbar)object, ajioImageView2, ajioImageView, ajioTextView);
            return toolbarGamezoneOpengameBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ToolbarGamezoneOpengameBinding inflate(LayoutInflater layoutInflater) {
        return ToolbarGamezoneOpengameBinding.inflate(layoutInflater, null, false);
    }

    public static ToolbarGamezoneOpengameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.toolbar_gamezone_opengame;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarGamezoneOpengameBinding.bind((View)layoutInflater);
    }

    public Toolbar getRoot() {
        return this.rootView;
    }
}

