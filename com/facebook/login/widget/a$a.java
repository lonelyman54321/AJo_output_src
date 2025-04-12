/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.facebook.login.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.login.R$id;
import com.facebook.login.R$layout;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
extends FrameLayout {
    public final ImageView a;
    public final ImageView b;
    public final View c;
    public final ImageView d;

    public a$a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        context = LayoutInflater.from((Context)context);
        int n3 = R$layout.com_facebook_tooltip_bubble;
        context.inflate(n3, (ViewGroup)this);
        int n4 = R$id.com_facebook_tooltip_bubble_view_top_pointer;
        context = this.findViewById(n4);
        String string2 = "null cannot be cast to non-null type android.widget.ImageView";
        Intrinsics.checkNotNull(context, string2);
        context = (ImageView)context;
        this.a = context;
        n4 = R$id.com_facebook_tooltip_bubble_view_bottom_pointer;
        context = this.findViewById(n4);
        Intrinsics.checkNotNull(context, string2);
        context = (ImageView)context;
        this.b = context;
        n4 = R$id.com_facebook_body_frame;
        context = this.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(context, "findViewById(R.id.com_facebook_body_frame)");
        this.c = context;
        n4 = R$id.com_facebook_button_xout;
        context = this.findViewById(n4);
        Intrinsics.checkNotNull(context, string2);
        context = (ImageView)context;
        this.d = context;
    }
}

