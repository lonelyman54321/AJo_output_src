/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.home.landingpage.viewholder.cms;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCmsAppUpdateVH$runnable$1;
import kotlin.jvm.internal.Intrinsics;

public final class HomeCmsAppUpdateVH
extends RecyclerView$B {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final ProgressBar g;
    public final View h;
    public final View i;
    public String j;
    public final Handler k;
    public final HomeCmsAppUpdateVH$runnable$1 l;

    public HomeCmsAppUpdateVH(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object;
        int n3 = R$id.appUpdateHeaderTV;
        View view = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.b = view;
        n3 = R$id.appUpdateInfoTV;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.c = view;
        n3 = R$id.appUpdateBtn;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.d = view;
        n3 = R$id.updateLaterBtn;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.e = view;
        n3 = R$id.updateAlertIV;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (ImageView)view;
        this.f = view;
        n3 = R$id.updateProgressBar;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (ProgressBar)view;
        this.g = view;
        n3 = R$id.updateWidgetContainer;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.h = view;
        this.i = object;
        this.j = "";
        super();
        this.k = object;
        super(this);
        this.l = object;
    }

    public final void w(boolean bl2) {
        View view = this.i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        String string2 = "getLayoutParams(...)";
        Intrinsics.checkNotNullExpressionValue(layoutParams, string2);
        if (bl2) {
            int n3;
            layoutParams.height = n3 = -2;
        } else {
            boolean bl3 = false;
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }
}

