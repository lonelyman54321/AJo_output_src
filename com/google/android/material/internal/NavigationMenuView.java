/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;

public class NavigationMenuView
extends RecyclerView
implements i {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3);
        super(context, 1, false);
        this.setLayoutManager((RecyclerView$o)object);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void initialize(d d2) {
    }
}

