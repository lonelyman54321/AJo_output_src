/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.jio.jioads.carousel.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends RecyclerView$B {
    public final View a;
    public final ViewGroup b;
    public final TextView c;
    public final TextView d;

    public a(View view) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = view;
        this.b = viewGroup = (ViewGroup)view.findViewWithTag((Object)"JioNativeCarousalImage");
        viewGroup = (TextView)view.findViewWithTag((Object)"JioNativeCarousalTitle");
        this.c = viewGroup;
        view = (TextView)view.findViewWithTag((Object)"JioNativeCarousalDescription");
        this.d = view;
    }
}

