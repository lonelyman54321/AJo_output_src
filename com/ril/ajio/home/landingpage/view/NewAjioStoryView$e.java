/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.home.landingpage.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView;
import com.ril.ajio.services.data.Home.BannerDetails;
import java.util.ArrayList;

public final class NewAjioStoryView$e
extends Uk2
implements View.OnTouchListener {
    public final /* synthetic */ NewAjioStoryView c;

    public NewAjioStoryView$e(NewAjioStoryView newAjioStoryView) {
        this.c = newAjioStoryView;
    }

    public final void a(ViewGroup viewGroup, int n3, Object object) {
        object = (View)object;
        viewGroup.removeView((View)object);
    }

    public final int c() {
        int n3;
        ArrayList arrayList = this.c.i;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final Object f(int n3, ViewGroup object) {
        int n4;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
        int n7 = R$layout.imv_new_ajio_story;
        layoutInflater = (ImageView)layoutInflater.inflate(n7, (ViewGroup)object, false);
        object.addView((View)layoutInflater);
        String string2 = ((BannerDetails)this.c.i.get(n3)).getImageUrl();
        object = new da$a();
        n7 = 1;
        ((da$a)object).k = n7;
        ((da$a)object).a = n4 = R$drawable.component_placeholder;
        ((da$a)object).b = n4;
        ((da$a)object).g = n7;
        ((da$a)object).n = string2;
        ((da$a)object).u = layoutInflater;
        ((da$a)object).h = n7;
        ((da$a)object).a();
        layoutInflater.setOnTouchListener((View.OnTouchListener)this);
        return layoutInflater;
    }

    public final boolean g(View view, Object object) {
        boolean bl2;
        if (view == object) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void m(ViewGroup viewGroup) {
    }

    public final boolean onTouch(View object, MotionEvent motionEvent) {
        boolean bl2;
        object = this.c;
        boolean bl3 = ((NewAjioStoryView)((Object)object)).r;
        if (bl3 && (bl3 = motionEvent.getAction()) == (bl2 = true)) {
            ((NewAjioStoryView)((Object)object)).r = false;
            ((NewAjioStoryView)((Object)object)).h();
            return bl2;
        }
        return ((NewAjioStoryView)((Object)object)).j.a.onTouchEvent(motionEvent);
    }
}

