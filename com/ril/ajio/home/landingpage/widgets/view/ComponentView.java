/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.ril.ajio.home.landingpage.widgets.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.widgets.view.ComponentView$a;
import com.ril.ajio.services.data.Home.BannerDetails;
import com.ril.ajio.services.data.Home.NewPageDetails;

public class ComponentView
extends FrameLayout
implements r82_0,
View.OnClickListener {
    public ImageView a;
    public View b;
    public RecyclerView c;
    public Context d;
    public r82_0 e;
    public boolean f;

    public ComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ComponentView$a(this);
        this.a(context);
    }

    public ComponentView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        new ComponentView$a(this);
        this.a(context);
    }

    private void setHeroImageParams(int n3) {
        int n4;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)this.a.getLayoutParams();
        layoutParams.height = n3;
        layoutParams.width = n4 = -1;
        this.a.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        layoutParams = (RelativeLayout.LayoutParams)this.b.getLayoutParams();
        layoutParams.height = n3;
        layoutParams.width = n4;
        this.b.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    }

    public final void La(hp1_2 hp1_22) {
        r82_0 r82_02 = this.e;
        if (r82_02 != null) {
            r82_02.La(hp1_22);
        }
    }

    public final void a(Context object) {
        ImageView imageView;
        this.d = object;
        this.f = false;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.component_view;
        boolean bl2 = true;
        object = object.inflate(n3, (ViewGroup)this, bl2);
        n3 = R$id.component_view_imv_hero;
        this.a = imageView = (ImageView)object.findViewById(n3);
        n3 = R$id.component_view_layout_click;
        imageView = object.findViewById(n3);
        this.b = imageView;
        n3 = R$id.component_view_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        imageView = this.d;
        object = new LinearLayoutManager((Context)imageView, 0, false);
        this.c.setLayoutManager((RecyclerView$o)object);
        this.b.setOnClickListener((View.OnClickListener)this);
        this.c.setHasFixedSize(bl2);
    }

    public final void m(String string2) {
    }

    public final void onClick(View object) {
        Object object2 = object.getTag();
        boolean bl2 = object2 instanceof BannerDetails;
        if (bl2) {
            hp1_2 hp1_22;
            object = (BannerDetails)object.getTag();
            String string2 = ((BannerDetails)object).getPage();
            String string3 = ((BannerDetails)object).getUrlLink();
            int n3 = ((BannerDetails)object).getComponentPosition();
            String string4 = ((BannerDetails)object).getQuery();
            int n4 = ((BannerDetails)object).getBannerPosition();
            String string5 = ((BannerDetails)object).getImageUrl();
            object2 = hp1_22;
            hp1_22 = new hp1_2(string2, string3, n3, string4, null, n4, string5, null);
            this.La(hp1_22);
        }
    }

    public void setData(NewPageDetails object) {
        if (object == null) {
            return;
        }
        String string2 = ((NewPageDetails)object).getImageWidth();
        if (string2 != null && (string2 = ((NewPageDetails)object).getImageHeight()) != null) {
            string2 = ((NewPageDetails)object).getImageWidth();
            int n3 = Integer.parseInt(string2);
            mz3_0.d(n3);
            object = ((NewPageDetails)object).getImageHeight();
            int n4 = Integer.parseInt((String)object);
            try {
                mz3_0.d(n4);
            }
            catch (Exception exception) {
                yn3_0.a(exception);
            }
        }
        throw null;
    }

    public void setOnComponentClickListener(r82_0 r82_02) {
        this.e = r82_02;
    }
}

