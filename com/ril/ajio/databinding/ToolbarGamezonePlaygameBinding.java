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

public final class ToolbarGamezonePlaygameBinding
implements BC3 {
    public final AjioImageView playgameImvBack;
    public final AjioTextView playgameToolbarTitleTv;
    private final Toolbar rootView;

    private ToolbarGamezonePlaygameBinding(Toolbar toolbar, AjioImageView ajioImageView, AjioTextView ajioTextView) {
        this.rootView = toolbar;
        this.playgameImvBack = ajioImageView;
        this.playgameToolbarTitleTv = ajioTextView;
    }

    public static ToolbarGamezonePlaygameBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.playgame_imv_back;
        AjioImageView ajioImageView = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.playgame_toolbar_title_tv, object)) != null) {
            object = (Toolbar)object;
            ToolbarGamezonePlaygameBinding toolbarGamezonePlaygameBinding = new ToolbarGamezonePlaygameBinding((Toolbar)object, ajioImageView, ajioTextView);
            return toolbarGamezonePlaygameBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ToolbarGamezonePlaygameBinding inflate(LayoutInflater layoutInflater) {
        return ToolbarGamezonePlaygameBinding.inflate(layoutInflater, null, false);
    }

    public static ToolbarGamezonePlaygameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.toolbar_gamezone_playgame;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarGamezonePlaygameBinding.bind((View)layoutInflater);
    }

    public Toolbar getRoot() {
        return this.rootView;
    }
}

