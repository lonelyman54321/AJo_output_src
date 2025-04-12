/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 */
package com.jio.jioads.carousel.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.carousel.view.a;
import com.jio.jioads.carousel.view.b;
import com.jio.jioads.carousel.view.g;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class d
extends RecyclerView$f {
    public final Context a;
    public final boolean b;
    public final int c;
    public final g d;
    public final boolean e;
    public final ArrayList f;

    public d(Context object, boolean bl2, int n3, g g3, boolean bl3) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(g3, "onItemClick");
        this.a = object;
        this.b = bl2;
        this.c = n3;
        this.d = g3;
        this.e = bl3;
        this.f = object;
    }

    public final int getItemCount() {
        return this.f.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        String string2;
        String string3;
        recyclerView$B = (a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = (com.jio.jioads.carousel.data.a)this.f.get(n3);
        View view = ((a)recyclerView$B).a;
        int n7 = 1;
        Object object2 = new ss1_2(n7, this, object);
        view.setOnClickListener((View.OnClickListener)object2);
        view = recyclerView$B.itemView;
        object2 = new b((a)recyclerView$B, this, (com.jio.jioads.carousel.data.a)object);
        view.post((Runnable)object2);
        view = ((a)recyclerView$B).c;
        if (view != null) {
            object2 = ((com.jio.jioads.carousel.data.a)object).a;
            view.setText((CharSequence)object2);
        }
        object2 = ((a)recyclerView$B).d;
        if (object2 != null) {
            string3 = ((com.jio.jioads.carousel.data.a)object).b;
            object2.setText((CharSequence)string3);
        }
        n7 = 4;
        int n8 = 0;
        if (view != null) {
            string2 = ((com.jio.jioads.carousel.data.a)object).a;
            if (string2 != null && (n4 = string2.length()) != 0) {
                n4 = 0;
                string2 = null;
            } else {
                n4 = 4;
            }
            view.setVisibility(n4);
        }
        if (object2 != null) {
            object = ((com.jio.jioads.carousel.data.a)object).b;
            if (object != null && (n3 = ((String)object).length()) != 0) {
                n7 = 0;
                string3 = null;
            }
            object2.setVisibility(n7);
        }
        n3 = 8;
        n7 = (int)(this.e ? 1 : 0);
        if (view != null) {
            if (n7 != 0) {
                n4 = 8;
            } else {
                n4 = 0;
                string2 = null;
            }
            view.setVisibility(n4);
        }
        if (object2 != null) {
            if (n7 != 0) {
                n8 = 8;
            }
            object2.setVisibility(n8);
        }
        if ((n3 = (int)(j_0.l((Context)(object = (recyclerView$B = ((a)recyclerView$B).a).getContext())) ? 1 : 0)) != 0 && (n3 = (int)(this.b ? 1 : 0)) != 0) {
            object = new Object();
            recyclerView$B.setOnFocusChangeListener((View.OnFocusChangeListener)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.a);
        int n4 = this.c;
        layoutInflater = layoutInflater.inflate(n4, null);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        object = new a((View)layoutInflater);
        return object;
    }
}

