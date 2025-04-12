/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.AdapterView
 *  android.widget.ListView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.appevents.codeless;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.codeless.CodelessMatcher$ViewMatcher$a;
import com.facebook.appevents.codeless.CodelessMatcher$b;
import com.facebook.appevents.codeless.a;
import com.facebook.appevents.codeless.a$a;
import com.facebook.appevents.codeless.a$b;
import com.facebook.appevents.codeless.c;
import com.facebook.appevents.codeless.c$a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class CodelessMatcher$ViewMatcher
implements ViewTreeObserver.OnGlobalLayoutListener,
ViewTreeObserver.OnScrollChangedListener,
Runnable {
    public final WeakReference a;
    public ArrayList b;
    public final HashSet c;
    public final String d;

    public CodelessMatcher$ViewMatcher(View view, Handler handler, HashSet hashSet, String string2) {
        WeakReference<View> weakReference;
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(hashSet, "listenerSet");
        Intrinsics.checkNotNullParameter(string2, "activityName");
        this.a = weakReference = new WeakReference<View>(view);
        this.c = hashSet;
        this.d = string2;
        handler.postDelayed((Runnable)this, 200L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(CodelessMatcher$b var1_1, View var2_2, CB0 var3_4) {
        var4_5 = var1_1.a();
        if (var4_5 == null) {
            return;
        }
        var5_6 /* !! */  = xc3_0.f(var4_5);
        var6_7 = var5_6 /* !! */  instanceof a$a;
        if (!var6_7) ** GOTO lbl-1000
        var7_8 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener";
        Intrinsics.checkNotNull(var5_6 /* !! */ , (String)var7_8);
        var5_6 /* !! */  = (a$a)var5_6 /* !! */ ;
        var8_9 = var5_6 /* !! */ .e;
        if (var8_9) {
            var8_9 = true;
        } else lbl-1000:
        // 2 sources

        {
            var8_9 = false;
            var5_6 /* !! */  = null;
        }
        var7_8 = this.c;
        var1_1 = var1_1.b;
        var9_10 = var7_8.contains(var1_1);
        if (!var9_10 && !var8_9) {
            var5_6 /* !! */  = com.facebook.appevents.codeless.a.a;
            var5_6 /* !! */  = a.class;
            var9_10 = td0.b(var5_6 /* !! */ );
            var10_11 = null;
            if (!var9_10) {
                var11_12 = "mapping";
                Intrinsics.checkNotNullParameter(var3_4, (String)var11_12);
                var11_12 = "rootView";
                Intrinsics.checkNotNullParameter(var2_2, (String)var11_12);
                var11_12 = "hostView";
                Intrinsics.checkNotNullParameter(var4_5, (String)var11_12);
                try {
                    var10_11 = var11_12 = new a$a(var3_4, var2_2, var4_5);
                }
                catch (Throwable var2_3) {
                    td0.a(var5_6 /* !! */ , var2_3);
                }
            }
            var4_5.setOnClickListener(var10_11);
            var7_8.add(var1_1);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(CodelessMatcher$b var1_1, View var2_2, CB0 var3_4) {
        var4_5 = (AdapterView)var1_1.a();
        if (var4_5 == null) {
            return;
        }
        var5_6 /* !! */  = var4_5.getOnItemClickListener();
        var6_7 = var5_6 /* !! */  instanceof a$b;
        if (!var6_7) ** GOTO lbl-1000
        var7_8 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener";
        Intrinsics.checkNotNull(var5_6 /* !! */ , (String)var7_8);
        var5_6 /* !! */  = (a$b)var5_6 /* !! */ ;
        var8_9 = var5_6 /* !! */ .e;
        if (var8_9) {
            var8_9 = true;
        } else lbl-1000:
        // 2 sources

        {
            var8_9 = false;
            var5_6 /* !! */  = null;
        }
        var7_8 = this.c;
        var1_1 = var1_1.b;
        var9_10 = var7_8.contains(var1_1);
        if (!var9_10 && !var8_9) {
            var5_6 /* !! */  = com.facebook.appevents.codeless.a.a;
            var5_6 /* !! */  = a.class;
            var9_10 = td0.b(var5_6 /* !! */ );
            var10_11 = null;
            if (!var9_10) {
                var11_12 = "mapping";
                Intrinsics.checkNotNullParameter(var3_4, (String)var11_12);
                var11_12 = "rootView";
                Intrinsics.checkNotNullParameter(var2_2, (String)var11_12);
                var11_12 = "hostView";
                Intrinsics.checkNotNullParameter(var4_5, (String)var11_12);
                try {
                    var10_11 = var11_12 = new a$b(var3_4, var2_2, var4_5);
                }
                catch (Throwable var2_3) {
                    td0.a(var5_6 /* !! */ , var2_3);
                }
            }
            var4_5.setOnItemClickListener(var10_11);
            var7_8.add(var1_1);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c(CodelessMatcher$b var1_1, View var2_2, CB0 var3_4) {
        var4_5 = var1_1.a();
        if (var4_5 == null) {
            return;
        }
        var5_6 /* !! */  = xc3_0.g(var4_5);
        var6_7 = var5_6 /* !! */  instanceof c$a;
        if (!var6_7) ** GOTO lbl-1000
        var7_8 = "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener";
        Intrinsics.checkNotNull(var5_6 /* !! */ , (String)var7_8);
        var5_6 /* !! */  = (c$a)var5_6 /* !! */ ;
        var8_9 = var5_6 /* !! */ .e;
        if (var8_9 != 0) {
            var8_9 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var8_9 = 0;
            var5_6 /* !! */  = null;
        }
        var7_8 = this.c;
        var1_1 = var1_1.b;
        var9_10 = var7_8.contains(var1_1);
        if (!var9_10 && var8_9 == 0) {
            var8_9 = com.facebook.appevents.codeless.c.a;
            var5_6 /* !! */  = c.class;
            var9_10 = td0.b(var5_6 /* !! */ );
            var10_11 = null;
            if (!var9_10) {
                var11_12 = "mapping";
                Intrinsics.checkNotNullParameter(var3_4, (String)var11_12);
                var11_12 = "rootView";
                Intrinsics.checkNotNullParameter(var2_2, (String)var11_12);
                var11_12 = "hostView";
                Intrinsics.checkNotNullParameter(var4_5, (String)var11_12);
                try {
                    var10_11 = var11_12 = new c$a(var3_4, var2_2, var4_5);
                }
                catch (Throwable var2_3) {
                    td0.a(var5_6 /* !! */ , var2_3);
                }
            }
            var4_5.setOnTouchListener(var10_11);
            var7_8.add(var1_1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        WeakReference weakReference;
        Object t3;
        ArrayList arrayList = this.b;
        if (arrayList != null && (t3 = (weakReference = this.a).get()) != null) {
            int n3 = arrayList.size();
            block4: for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2;
                int n4;
                CB0 cB0 = (CB0)arrayList.get(i3);
                View view = (View)weakReference.get();
                if (cB0 == null || view == null) continue;
                Object object = this.d;
                Object object2 = cB0.d;
                if (object2 != null && (n4 = ((String)object2).length()) != 0 && !(bl2 = Intrinsics.areEqual(object2, object))) continue;
                object2 = Collections.unmodifiableList(cB0.b);
                String string2 = "unmodifiableList(path)";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                n4 = object2.size();
                int n7 = 25;
                if (n4 > n7) continue;
                n4 = -1;
                object = CodelessMatcher$ViewMatcher$a.a(view, (List)object2, 0, n4, (String)object).iterator();
                while (true) {
                    block9: {
                        Object object3;
                        if (!(bl2 = object.hasNext())) continue block4;
                        object2 = (CodelessMatcher$b)object.next();
                        string2 = ((CodelessMatcher$b)object2).a();
                        if (string2 == null) continue;
                        Object object4 = xc3_0.a((View)string2);
                        if (object4 != null && (n7 = (int)(((xc3_0)(object3 = xc3_0.a)).m((View)string2, (View)object4) ? 1 : 0)) != 0) {
                            this.c((CodelessMatcher$b)object2, view, cB0);
                            continue;
                        }
                        object4 = string2.getClass();
                        object4 = ((Class)object4).getName();
                        object3 = "view.javaClass.name";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                        object3 = "com.facebook.react";
                        n7 = (int)(kotlin.text.b.s((String)object4, (String)object3, false) ? 1 : 0);
                        if (n7 == 0) break block9;
                    }
                    n7 = string2 instanceof AdapterView;
                    if (n7 == 0) {
                        this.a((CodelessMatcher$b)object2, view, cB0);
                        continue;
                    }
                    n4 = string2 instanceof ListView;
                    if (n4 == 0) continue;
                    try {
                        this.b((CodelessMatcher$b)object2, view, cB0);
                    }
                    catch (Exception exception) {
                        td0.b(CodelessMatcher.class);
                        object2 = lz3_0.a;
                        object2 = FacebookSdk.a;
                    }
                }
            }
        }
    }

    public final void onGlobalLayout() {
        this.d();
    }

    public final void onScrollChanged() {
        this.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable3;
        block16: {
            block15: {
                block13: {
                    boolean bl2 = td0.b(this);
                    if (bl2) {
                        return;
                    }
                    bl2 = td0.b(this);
                    if (!bl2) break block13;
                    return;
                }
                try {
                    Object object = FacebookSdk.b();
                    object = dl0_2.b((String)object);
                    if (object == null) return;
                    boolean bl3 = ((al0_2)object).j;
                    if (!bl3) {
                        return;
                    }
                    object = ((al0_2)object).k;
                    ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>();
                    if (object != null) {
                        try {
                            int n3 = object.length();
                            for (int i3 = 0; i3 < n3; ++i3) {
                                Object object2 = object.getJSONObject(i3);
                                String string2 = "array.getJSONObject(i)";
                                Intrinsics.checkNotNullExpressionValue(object2, string2);
                                object2 = CB0$b.a(object2);
                                arrayList.add((JSONObject)object2);
                            }
                        }
                        catch (IllegalArgumentException | JSONException throwable2) {}
                    }
                    this.b = arrayList;
                    object = this.a;
                    object = ((Reference)object).get();
                    if ((object = (View)object) == null) {
                        return;
                    }
                    bl3 = (object = object.getViewTreeObserver()).isAlive();
                    if (!bl3) break block15;
                    object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                    object.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
                }
                catch (Throwable throwable3) {
                    break block16;
                }
            }
            this.d();
            return;
        }
        try {
            td0.a(this, throwable3);
            return;
        }
        catch (Throwable throwable4) {
            td0.a(this, throwable4);
            return;
        }
    }
}

