/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
package com.facebook.appevents.codeless;

import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.codeless.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class a$b
implements AdapterView.OnItemClickListener {
    public final CB0 a;
    public final WeakReference b;
    public final WeakReference c;
    public final AdapterView.OnItemClickListener d;
    public final boolean e;

    public a$b(CB0 onItemClickListener, View view, AdapterView adapterView) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "mapping");
        Intrinsics.checkNotNullParameter(view, "rootView");
        Intrinsics.checkNotNullParameter(adapterView, "hostView");
        this.a = onItemClickListener;
        this.b = onItemClickListener = new WeakReference(adapterView);
        this.c = onItemClickListener = new WeakReference(view);
        this.d = onItemClickListener = adapterView.getOnItemClickListener();
        this.e = true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n3, long l2) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        AdapterView.OnItemClickListener onItemClickListener = this.d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, n3, l2);
        }
        adapterView = (View)this.c.get();
        view = (AdapterView)this.b.get();
        if (adapterView != null && view != null) {
            CB0 cB0 = this.a;
            com.facebook.appevents.codeless.a.a(cB0, (View)adapterView, view);
        }
    }
}

