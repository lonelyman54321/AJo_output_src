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

public final class ToolbarGamezoneGamelistBinding
implements BC3 {
    public final AjioImageView gamezoneImvClose;
    public final AjioImageView gamezoneImvLogo;
    public final AjioImageView gamezoneImvReward;
    private final Toolbar rootView;
    public final Toolbar toolbarGamezoneGamelist;
    public final AjioTextView toolbarTitle;

    private ToolbarGamezoneGamelistBinding(Toolbar toolbar, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioImageView ajioImageView3, Toolbar toolbar2, AjioTextView ajioTextView) {
        this.rootView = toolbar;
        this.gamezoneImvClose = ajioImageView;
        this.gamezoneImvLogo = ajioImageView2;
        this.gamezoneImvReward = ajioImageView3;
        this.toolbarGamezoneGamelist = toolbar2;
        this.toolbarTitle = ajioTextView;
    }

    public static ToolbarGamezoneGamelistBinding bind(View object) {
        View view;
        int n3 = R$id.gamezone_imv_close;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioImageView)view;
        if (object2 != null) {
            n3 = R$id.gamezone_imv_logo;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioImageView)view;
            if (object3 != null) {
                n3 = R$id.gamezone_imv_reward;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioImageView)view;
                if (object4 != null) {
                    Object object5 = object;
                    object5 = (Toolbar)object;
                    n3 = R$id.toolbar_title;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        object = new ToolbarGamezoneGamelistBinding((Toolbar)object5, (AjioImageView)((Object)object2), (AjioImageView)((Object)object3), (AjioImageView)((Object)object4), (Toolbar)object5, (AjioTextView)object6);
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

    public static ToolbarGamezoneGamelistBinding inflate(LayoutInflater layoutInflater) {
        return ToolbarGamezoneGamelistBinding.inflate(layoutInflater, null, false);
    }

    public static ToolbarGamezoneGamelistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.toolbar_gamezone_gamelist;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarGamezoneGamelistBinding.bind((View)layoutInflater);
    }

    public Toolbar getRoot() {
        return this.rootView;
    }
}

