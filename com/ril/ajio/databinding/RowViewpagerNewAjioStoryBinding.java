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
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView;

public final class RowViewpagerNewAjioStoryBinding
implements BC3 {
    public final NewAjioStoryView newAjioStoryView;
    private final NewAjioStoryView rootView;

    private RowViewpagerNewAjioStoryBinding(NewAjioStoryView newAjioStoryView, NewAjioStoryView newAjioStoryView2) {
        this.rootView = newAjioStoryView;
        this.newAjioStoryView = newAjioStoryView2;
    }

    public static RowViewpagerNewAjioStoryBinding bind(View object) {
        if (object != null) {
            object = (NewAjioStoryView)((Object)object);
            RowViewpagerNewAjioStoryBinding rowViewpagerNewAjioStoryBinding = new RowViewpagerNewAjioStoryBinding((NewAjioStoryView)((Object)object), (NewAjioStoryView)((Object)object));
            return rowViewpagerNewAjioStoryBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowViewpagerNewAjioStoryBinding inflate(LayoutInflater layoutInflater) {
        return RowViewpagerNewAjioStoryBinding.inflate(layoutInflater, null, false);
    }

    public static RowViewpagerNewAjioStoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_viewpager_new_ajio_story;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowViewpagerNewAjioStoryBinding.bind((View)layoutInflater);
    }

    public NewAjioStoryView getRoot() {
        return this.rootView;
    }
}

