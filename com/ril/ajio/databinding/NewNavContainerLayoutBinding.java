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
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class NewNavContainerLayoutBinding
implements BC3 {
    public final TabLayout newNavigationAjioTabBar;
    public final TabLayout newNavigationLuxeTabBar;
    public final ConstraintLayout newNavigationTabBarContainer;
    private final ConstraintLayout rootView;

    private NewNavContainerLayoutBinding(ConstraintLayout constraintLayout, TabLayout tabLayout, TabLayout tabLayout2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.newNavigationAjioTabBar = tabLayout;
        this.newNavigationLuxeTabBar = tabLayout2;
        this.newNavigationTabBarContainer = constraintLayout2;
    }

    public static NewNavContainerLayoutBinding bind(View object) {
        TabLayout tabLayout;
        int n3 = R$id.newNavigationAjioTabBar;
        TabLayout tabLayout2 = (TabLayout)dd2_2.a(n3, object);
        if (tabLayout2 != null && (tabLayout = (TabLayout)dd2_2.a(n3 = R$id.newNavigationLuxeTabBar, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            NewNavContainerLayoutBinding newNavContainerLayoutBinding = new NewNavContainerLayoutBinding((ConstraintLayout)((Object)object), tabLayout2, tabLayout, (ConstraintLayout)((Object)object));
            return newNavContainerLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewNavContainerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewNavContainerLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewNavContainerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_nav_container_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewNavContainerLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

