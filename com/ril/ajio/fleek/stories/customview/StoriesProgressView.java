/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.ril.ajio.fleek.stories.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.gson.GsonBuilder;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$styleable;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar$a;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView$a;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView$b;
import com.ril.ajio.fleek.stories.customview.a;
import com.ril.ajio.kmm.shared.model.home.StoriesProgressValue;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.PostData;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class StoriesProgressView
extends LinearLayout {
    public static final StoriesProgressView$a Companion;
    public static final LinearLayout.LayoutParams h;
    public static final LinearLayout.LayoutParams i;
    public final ArrayList a;
    public StoriesProgressView$b b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    static {
        StoriesProgressView$a storiesProgressView$a;
        Companion = storiesProgressView$a = new Object();
        int n3 = -2;
        storiesProgressView$a = new LinearLayout.LayoutParams(0, n3, 1.0f);
        h = storiesProgressView$a;
        storiesProgressView$a = new LinearLayout.LayoutParams(5, n3);
        i = storiesProgressView$a;
    }

    public StoriesProgressView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 6, 0);
    }

    public StoriesProgressView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 4, 0);
    }

    public StoriesProgressView(Context context, AttributeSet attributeSet, int n3) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.a = arrayList = new ArrayList();
        this.c = n3 = -1;
        this.d = n3;
        this.g = n3;
        this.setOrientation(0);
        int[] nArray = R$styleable.StoriesProgressView;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        Intrinsics.checkNotNullExpressionValue(context, "obtainStyledAttributes(...)");
        int n4 = R$styleable.StoriesProgressView_progressCount;
        this.c = n4 = context.getInt(n4, 0);
        context.recycle();
        this.a();
    }

    public /* synthetic */ StoriesProgressView(Context context, AttributeSet attributeSet, int n3, int n4) {
        if ((n3 &= 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, 0);
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        this.removeAllViews();
        int n3 = this.c;
        int n4 = 0;
        while (n4 < n3) {
            Object object = this.getContext();
            Intrinsics.checkNotNullExpressionValue(object, "getContext(...)");
            int n7 = 6;
            PausableProgressBar pausableProgressBar = new PausableProgressBar((Context)object, null, n7, 0);
            object = h;
            pausableProgressBar.setLayoutParams((ViewGroup.LayoutParams)object);
            int n8 = this.g;
            String string2 = "p(";
            String string3 = ") c(";
            String string4 = ")";
            object = z41.a(string2, string3, string4, n8, n4);
            pausableProgressBar.setTag(object);
            arrayList.add(pausableProgressBar);
            this.addView((View)pausableProgressBar);
            int n10 = this.c;
            if (++n4 >= n10) continue;
            object = this.getContext();
            pausableProgressBar = new View(object);
            object = i;
            pausableProgressBar.setLayoutParams((ViewGroup.LayoutParams)object);
            this.addView((View)pausableProgressBar);
        }
    }

    public final void b() {
        int n3;
        Object object = this.a;
        ((ArrayList)object).clear();
        this.c = n3 = -1;
        this.d = n3;
        n3 = 0;
        this.b = null;
        boolean bl2 = false;
        PausableProgressBar pausableProgressBar = null;
        this.e = false;
        this.f = false;
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            pausableProgressBar = (PausableProgressBar)((Object)object.next());
            xn2 xn22 = pausableProgressBar.c;
            if (xn22 == null) continue;
            Intrinsics.checkNotNull((Object)xn22);
            xn22.setAnimationListener(null);
            xn22 = pausableProgressBar.c;
            Intrinsics.checkNotNull((Object)xn22);
            xn22.cancel();
            pausableProgressBar.c = null;
        }
    }

    public final void c() {
        int n3 = this.d;
        if (n3 < 0) {
            return;
        }
        ArrayList arrayList = this.a;
        xn2 xn22 = ((PausableProgressBar)((Object)arrayList.get((int)n3))).c;
        if (xn22 != null) {
            Intrinsics.checkNotNull((Object)xn22);
            boolean bl2 = xn22.b;
            if (!bl2) {
                long l2;
                xn22.a = l2 = 0L;
                xn22.b = bl2 = true;
            }
        }
    }

    public final void d() {
        int n3 = this.d;
        ArrayList arrayList = this.a;
        if (n3 < 0 && (n3 = arrayList.isEmpty() ^ 1) != 0) {
            PausableProgressBar pausableProgressBar = (PausableProgressBar)((Object)CollectionsKt.N(0, arrayList));
            if (pausableProgressBar != null) {
                pausableProgressBar.b();
            }
            return;
        }
        n3 = this.d;
        Object object = (PausableProgressBar)((Object)CollectionsKt.N(n3, arrayList));
        if (object != null && (object = object.c) != null) {
            Intrinsics.checkNotNull(object);
            ((xn2)((Object)object)).b = false;
        }
    }

    public final void e() {
        int n3 = this.e;
        if (n3 == 0 && (n3 = this.f) == 0) {
            boolean bl2;
            n3 = this.d;
            if (n3 < 0) {
                return;
            }
            ArrayList arrayList = this.a;
            PausableProgressBar pausableProgressBar = (PausableProgressBar)((Object)arrayList.get(n3));
            this.f = bl2 = true;
            pausableProgressBar.setMin();
        }
    }

    public final void f() {
        int n3 = this.e;
        if (n3 == 0 && (n3 = this.f) == 0) {
            boolean bl2;
            n3 = this.d;
            if (n3 < 0) {
                return;
            }
            ArrayList arrayList = this.a;
            PausableProgressBar pausableProgressBar = (PausableProgressBar)((Object)arrayList.get(n3));
            this.e = bl2 = true;
            pausableProgressBar.setMax();
        }
    }

    public final void g(int n3) {
        int n4;
        ArrayList arrayList = this.a;
        int n7 = arrayList.size();
        int n8 = 0;
        PausableProgressBar pausableProgressBar = null;
        for (n4 = 0; n4 < n7; ++n4) {
            PausableProgressBar pausableProgressBar2 = (PausableProgressBar)((Object)arrayList.get(n4));
            xn2 xn22 = pausableProgressBar2.c;
            if (xn22 == null) continue;
            Intrinsics.checkNotNull((Object)xn22);
            xn22.setAnimationListener(null);
            xn22 = pausableProgressBar2.c;
            Intrinsics.checkNotNull((Object)xn22);
            xn22.cancel();
            pausableProgressBar2.c = null;
        }
        while (n8 < n3) {
            n7 = arrayList.size();
            if (n7 > n8) {
                PausableProgressBar pausableProgressBar3 = (PausableProgressBar)((Object)arrayList.get(n8));
                pausableProgressBar3.setMaxWithoutCallback();
            }
            ++n8;
        }
        n7 = arrayList.size();
        for (n8 = n3; n8 < n7; ++n8) {
            n4 = arrayList.size();
            if (n4 <= n8) continue;
            pausableProgressBar = (PausableProgressBar)((Object)arrayList.get(n8));
            pausableProgressBar.setMinWithoutCallback();
        }
        n7 = arrayList.size();
        if (n7 > n3) {
            PausableProgressBar pausableProgressBar4 = (PausableProgressBar)((Object)arrayList.get(n3));
            pausableProgressBar4.b();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void h(List var1_1) {
        var2_2 = 1;
        var3_3 = h40_0.a;
        var3_3 = z40_0.Companion;
        var3_3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var3_3).a.d("fleek_stories_progress_value").toString();
        Intrinsics.checkNotNullExpressionValue(var3_3, "toString(...)");
        var4_4 = new GsonBuilder();
        var4_4 = var4_4.create();
        var5_5 = StoriesProgressValue.class;
        var3_3 = var4_4.fromJson((String)var3_3, var5_5);
        Intrinsics.checkNotNullExpressionValue(var3_3, "fromJson(...)");
        var3_3 = (StoriesProgressValue)var3_3;
        var4_4 = this.a;
        var6_6 = var4_4.size();
        for (var7_7 = 0; var7_7 < var6_6; var7_7 += var2_2) {
            block8: {
                var8_8 = (PausableProgressBar)var4_4.get(var7_7);
                var9_9 = 0;
                var10_10 = null;
                if (var1_1 != null && (var11_11 = (Media)CollectionsKt.N(0, var1_1)) != null) {
                    var11_11 = var11_11.getType();
                } else {
                    var12_12 = false;
                    var11_11 = null;
                }
                var13_13 = "IMAGE";
                var12_12 = kotlin.text.b.i((String)var11_11, var13_13, false);
                var14_14 = 10000L;
                if (var12_12) break block8;
                if (var1_1 != null && (var11_11 = (Media)CollectionsKt.N(0, var1_1)) != null) {
                    var10_10 = var11_11.getType();
                }
                if (!(var9_9 = kotlin.text.b.i((String)var10_10, (String)(var11_11 = "GIF"), false))) ** GOTO lbl-1000
            }
            if (var1_1 != null && (var10_10 = (Media)CollectionsKt.N(0, var1_1)) != null && (var10_10 = var10_10.getUrl()) != null && (var9_9 = StringsKt.F((CharSequence)var10_10, (CharSequence)(var11_11 = ".gif"), false)) == var2_2) {
                var10_10 = var3_3.getStoryGifDuration();
                if (var10_10 != null) {
                    var14_14 = var10_10.longValue();
                }
            } else if ((var10_10 = var3_3.getStoryImgDuration()) != null) {
                var14_14 = var10_10.longValue();
            }
            var8_8.setDuration(var14_14);
            var8_8 = (PausableProgressBar)var4_4.get(var7_7);
            var10_10 = new a(this, var7_7);
            var8_8.setCallback((PausableProgressBar$a)var10_10);
        }
    }

    public final void setAllStoryDuration(PostData list) {
        list = list != null ? ((PostData)((Object)list)).getPostMedia() : null;
        this.h(list);
    }

    public final void setAllStoryDuration(Subcomponent list) {
        list = list != null ? ((Subcomponent)((Object)list)).getPostMedia() : null;
        this.h(list);
    }

    public final void setStoriesCountDebug(int n3, int n4) {
        this.c = n3;
        this.g = n4;
        this.a();
    }

    public final void setStoriesListener(StoriesProgressView$b storiesProgressView$b) {
        this.b = storiesProgressView$b;
    }
}

