/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package com.ril.ajio.home.landingpage.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.activity.NewAjioStoryActivity$a;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$h;
import com.ril.ajio.view.BaseSplitActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class NewAjioStoryActivity
extends BaseSplitActivity
implements L82 {
    public static final NewAjioStoryActivity$a Companion;
    public NewAjioStoryViewPager X;
    public final HashMap Y;
    public ArrayList Z;
    public int k0;

    static {
        NewAjioStoryActivity$a newAjioStoryActivity$a;
        Companion = newAjioStoryActivity$a = new Object();
    }

    public NewAjioStoryActivity() {
        HashMap hashMap;
        this.Y = hashMap = new HashMap();
    }

    public final void finish() {
        super.finish();
        int n3 = R$anim.cc_slide_up;
        int n4 = R$anim.cc_slide_out;
        this.overridePendingTransition(n3, n4);
    }

    public final void j0(hp1_2 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "landingItemInfo");
        Object object2 = this.getIntent();
        String string2 = "LANDING_PAGE_INFO";
        object2.putExtra(string2, (Serializable)object);
        int n3 = -1;
        this.setResult(n3, (Intent)object2);
        object = this.Y.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (NewAjioStoryView)((Object)((Map.Entry)object.next()).getValue());
            boolean bl3 = true;
            ((NewAjioStoryView)((Object)object2)).setSwipeLayoutVisibility(bl3);
        }
        this.finish();
    }

    public final void onBackPressed() {
        Object object = new Intent();
        boolean bl2 = false;
        NewAjioStoryView newAjioStoryView = null;
        this.setResult(0, (Intent)object);
        object = this.Y.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            newAjioStoryView = (NewAjioStoryView)((Object)((Map.Entry)object.next()).getValue());
            boolean bl3 = true;
            newAjioStoryView.setSwipeLayoutVisibility(bl3);
        }
        this.supportFinishAfterTransition();
    }

    public final void onCreate(Bundle object) {
        Object object2 = this.getWindow();
        Object object3 = null;
        object2.setEnterTransition(null);
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_new_ajio_story;
        this.setContentView(n3);
        object = this.getIntent();
        object2 = "getIntent(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 33;
        if (n4 >= n7) {
            object = xv1_2.a((Intent)object);
        } else {
            object2 = "SELECTED_BANNER_DETAIL_LIST";
            n4 = (object = object.getSerializableExtra((String)object2)) instanceof ArrayList;
            if (n4 != 0) {
                object3 = object;
            }
            object = object3;
            object = (ArrayList)object3;
        }
        object = (ArrayList)object;
        this.Z = object;
        this.getIntent().getStringExtra("SELECTED_BANNER_TITLE");
        this.k0 = n3 = this.getIntent().getIntExtra("SELECTED_BANNER_POSITION", 0);
        n3 = R$id.activity_ajio_story_viewpager;
        object = (NewAjioStoryViewPager)this.findViewById(n3);
        this.X = object;
        object = this.y2();
        n7 = this.k0;
        HashMap hashMap = this.Y;
        ArrayList arrayList = this.Z;
        object2 = new rd3_1(this, n7, hashMap, arrayList);
        ((NewAjioStoryViewPager)((Object)object)).setAdapter((Uk2)object2);
        object = this.y2();
        object2 = new Object();
        ((NewAjioStoryViewPager)((Object)object)).setPageTransformer(false, (NewAjioStoryViewPager$h)object2);
        object = this.y2();
        n4 = this.k0;
        ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(n4);
        object = this.y2();
        object2 = new yv1_0(this);
        ((NewAjioStoryViewPager)((Object)object)).b((NewAjioStoryViewPager$g)object2);
    }

    public final void onStop() {
        boolean bl2;
        super.onStop();
        Iterator iterator = this.Y.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (NewAjioStoryView)((Object)iterator.next().getValue());
            ((NewAjioStoryView)((Object)object)).a();
            ((NewAjioStoryView)((Object)object)).c();
            ((NewAjioStoryView)((Object)object)).b();
            object = ((NewAjioStoryView)((Object)object)).m;
            ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(0);
        }
    }

    public final NewAjioStoryViewPager y2() {
        NewAjioStoryViewPager newAjioStoryViewPager = this.X;
        if (newAjioStoryViewPager != null) {
            return newAjioStoryViewPager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        return null;
    }
}

