/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.home.landingpage.widgets.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.services.data.Home.NewPageDetails;
import java.util.ArrayList;

public class ComponentOrderRecyclerView
extends FrameLayout
implements r82_0 {
    public RecyclerView a;
    public View b;
    public r82_0 c;

    public ComponentOrderRecyclerView(Context context) {
        super(context);
        this.a(context);
    }

    public ComponentOrderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a(context);
    }

    public ComponentOrderRecyclerView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.a(context);
    }

    public final void La(hp1_2 hp1_22) {
        r82_0 r82_02 = this.c;
        if (r82_02 != null) {
            r82_02.La(hp1_22);
        }
    }

    public final void a(Context context) {
        View view;
        Object object = LayoutInflater.from((Context)context);
        int n3 = R$layout.component_order_recycler_view;
        boolean bl2 = true;
        object = object.inflate(n3, (ViewGroup)this, bl2);
        n3 = R$id.component_order_layout;
        this.b = view = object.findViewById(n3);
        n3 = R$id.component_order_recycler_view;
        object = (RecyclerView)object.findViewById(n3);
        this.a = object;
        object = new WrapperLinearLayoutManager(context, 0);
        this.a.setLayoutManager((RecyclerView$o)object);
        this.a.setHasFixedSize(bl2);
    }

    public final void m(String string2) {
        r82_0 r82_02 = this.c;
        if (r82_02 != null) {
            r82_02.m(string2);
        }
    }

    public void setData(NewPageDetails serializable) {
        int n3;
        int n4 = 8;
        if (serializable == null) {
            this.a.setAdapter(null);
            this.b.setVisibility(n4);
            return;
        }
        Object object = serializable.getOrderList();
        if (object != null && (n3 = ((ArrayList)(object = serializable.getOrderList())).size()) != 0) {
            this.b.setVisibility(0);
            String string2 = serializable.getTypeCode();
            String string3 = serializable.getTitle();
            this.a.setVisibility(0);
            serializable = serializable.getOrderList();
            object = new ha2_0((ArrayList)serializable, this, string3, string2);
            this.a.setAdapter((RecyclerView$f)object);
            return;
        }
        this.b.setVisibility(n4);
    }

    public void setOnComponentClickListener(r82_0 r82_02) {
        this.c = r82_02;
    }
}

