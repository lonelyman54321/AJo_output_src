/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 */
package com.jio.jioads.carousel.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.carousel.data.a;
import com.jio.jioads.carousel.view.d;
import com.jio.jioads.carousel.view.e;
import com.jio.jioads.carousel.view.g;
import com.jio.jioads.carousel.view.h;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.native.renderer.t;
import com.jio.jioads.utils.l;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

public final class i {
    public final b a;
    public final c b;
    public final ViewGroup c;
    public final com.jio.jioads.carousel.data.b d;
    public final int e;
    public final t f;
    public final boolean g;
    public final ArrayList h;
    public boolean i;
    public RecyclerView j;
    public d k;

    public i(b object, c object2, ViewGroup object3, com.jio.jioads.carousel.data.b object4, int n3, t object5, boolean bl2) {
        int n4;
        boolean bl3;
        Object object6;
        Object object7;
        Object object8;
        int n7;
        Object object9;
        int n8;
        i i3 = this;
        Object object10 = object;
        Object object11 = object2;
        Intrinsics.checkNotNullParameter(object, "iJioAdView");
        Intrinsics.checkNotNullParameter(object2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(object3, "container");
        Intrinsics.checkNotNullParameter(object4, "data");
        Object object12 = "callback";
        Intrinsics.checkNotNullParameter(object5, (String)object12);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object4;
        int n10 = n3;
        this.e = n3;
        this.f = object5;
        n10 = (int)(bl2 ? 1 : 0);
        this.g = bl2;
        object10 = object4.c;
        n10 = object10.size();
        object11 = new ArrayList(n10);
        for (n8 = 0; n8 < n10; n8 += 1) {
            object11.add(null);
        }
        i3.h = object11;
        object10 = i3.a;
        object11 = object10.Y();
        n8 = 1;
        if (object11 != null) {
            object12 = new RecyclerView((Context)object11);
            object9 = new LinearLayoutManager((Context)object11);
            ((LinearLayoutManager)object9).setOrientation(0);
            ((RecyclerView)object12).setLayoutManager((RecyclerView$o)object9);
            n7 = 10;
            object12.setPadding(0, 0, n7, 0);
            ((RecyclerView)object12).setClipToPadding(false);
            object9 = new e();
            ((RecyclerView)object12).addItemDecoration((RecyclerView$n)object9);
            i3.j = object12;
            ((RecyclerView)object12).setHasFixedSize(n8 != 0);
            n10 = object10.u();
            object8 = "onItemClick(Lcom/jio/jioads/carousel/data/CarouselData$CarouselItem;)V";
            int n14 = 1;
            object7 = i.class;
            object6 = "onItemClick";
            object = object9;
            object3 = this;
            object4 = object7;
            object5 = object8;
            bl2 = false;
            object9 = new FunctionReferenceImpl(n14, this, (Class)object7, (String)object6, (String)object8, 0);
            bl3 = i3.g;
            n4 = i3.e;
            object = object12;
            object2 = object11;
            i3.k = object12 = new d((Context)object11, n10 != 0, n4, (g)object9, bl3);
            object10 = i3.j;
            if (object10 != null) {
                ((RecyclerView)object10).setAdapter((RecyclerView$f)object12);
            }
        }
        object10 = i3.a;
        object11 = object10.k0();
        object12 = JioAdView$AdState.DESTROYED;
        if (object11 != object12) {
            object12 = i3.d.c.iterator();
            n7 = 0;
            object9 = null;
            while (bl3 = object12.hasNext()) {
                object8 = object12.next();
                n4 = n7 + 1;
                if (n7 >= 0) {
                    h h3;
                    Object object13;
                    Context context;
                    object8 = (a)object8;
                    Object object14 = object10.k0();
                    if (object14 == (object7 = JioAdView$AdState.DESTROYED) || (context = object10.Y()) == null) break;
                    HashMap<String, JioAdView$AdState> hashMap = new HashMap<String, JioAdView$AdState>();
                    object14 = ((a)object8).e;
                    hashMap.put("image", (JioAdView$AdState)((Object)object14));
                    object14 = JioAds$MediaType.IMAGE;
                    object7 = ((f)i3.b).a;
                    object6 = ((o)object7).G;
                    boolean bl4 = object6 == object14 || object6 == (object13 = JioAds$MediaType.ALL);
                    int n15 = ((o)object7).l;
                    object = h3;
                    object2 = this;
                    object3 = hashMap;
                    object4 = object8;
                    n3 = n7;
                    object5 = object11;
                    h3 = new h(this, hashMap, (a)object8, n7, (Ref$IntRef)object11);
                    Integer n16 = n15;
                    object13 = "";
                    String string2 = "";
                    String string3 = "";
                    object6 = object9;
                    object9 = new l(context, hashMap, (String)object13, (JioAds$MediaType)((Object)object14), bl4, string2, string3, h3, n16);
                    ((l)object9).a();
                    n7 = n4;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
    }
}

