/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  org.json.JSONObject
 */
package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import com.facebook.FacebookSdk;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.facebook.appevents.suggestedevents.ViewObserver$a;
import java.io.File;
import java.lang.ref.Reference;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class a {
    public static final a a;
    public static final AtomicBoolean b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a = linkedHashSet;
        linkedHashSet = new LinkedHashSet(false);
        b = linkedHashSet;
        c = linkedHashSet = new LinkedHashSet();
        d = linkedHashSet = new LinkedHashSet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a() {
        Class<a> clazz = a.class;
        synchronized (clazz) {
            Object object = a.class;
            boolean bl2 = td0.b(object);
            if (bl2) {
                return;
            }
            try {
                object = FacebookSdk.d();
                eg3_2 eg3_22 = new Object();
                object.execute(eg3_22);
                return;
            }
            catch (Throwable throwable) {
                Class<a> clazz2 = a.class;
                td0.a(clazz2, throwable);
                return;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static final void d(Activity var0) {
        block9: {
            block12: {
                block10: {
                    block11: {
                        var1_2 = a.class;
                        var2_3 = td0.b(var1_2);
                        if (var2_3) {
                            return;
                        }
                        var3_4 = "activity";
                        Intrinsics.checkNotNullParameter(var0, (String)var3_4);
                        var3_4 = com.facebook.appevents.suggestedevents.a.b;
                        var2_3 = var3_4.get();
                        if (!var2_3) break block10;
                        var3_4 = ij0_1.a;
                        var3_4 = ij0_1.class;
                        var4_5 = td0.b(var3_4);
                        var5_6 = false;
                        if (!var4_5) {
                            try {
                                var5_6 = ij0_1.f;
                            }
                            catch (Throwable var6_7) {
                                td0.a(var3_4, var6_7);
                            }
                        }
                        if (!var5_6 || (var2_3 = (var3_4 = com.facebook.appevents.suggestedevents.a.c).isEmpty()) && (var2_3 = (var3_4 = com.facebook.appevents.suggestedevents.a.d).isEmpty())) break block10;
                        break block11;
                        catch (Throwable var0_1) {
                            break block9;
                        }
                    }
                    var3_4 = ViewObserver.d;
                    ViewObserver$a.a(var0);
                    break block12;
                }
                var3_4 = ViewObserver.d;
                ViewObserver$a.b(var0);
            }
lbl34:
            // 2 sources

            return;
        }
        td0.a(var1_2, var0_1);
        return;
        {
            catch (Exception v0) {
                ** continue;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            Object object = FacebookSdk.b();
            object = dl0_2.k((String)object, false);
            if (object == null) {
                return;
            }
            object = ((al0_2)object).n;
            if (object == null) {
                return;
            }
            this.c((String)object);
            object = c;
            bl2 = object.isEmpty() ^ true;
            if (!bl2) {
                object = d;
                bl2 = object.isEmpty() ^ true;
                if (!bl2) return;
            }
            object = HP1$a.MTML_APP_EVENT_PREDICTION;
            object = hp1_1.d((HP1$a)((Object)object));
            if (object == null) {
                return;
            }
            ij0_1.d((File)object);
            object = v3.m;
            if (object != null) {
                object = ((Reference)object).get();
                object = (Activity)object;
            } else {
                bl2 = false;
                object = null;
            }
            if (object == null) return;
            com.facebook.appevents.suggestedevents.a.d((Activity)object);
            return;
        }
        catch (Throwable throwable) {}
        catch (Exception exception) {}
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(String string2) {
        Throwable throwable2222;
        int n3;
        String string3;
        boolean bl2;
        Object object;
        Object object2;
        String string4;
        block6: {
            string4 = "eligible_for_prediction_events";
            object2 = "production_events";
            boolean bl3 = td0.b(this);
            if (bl3) {
                return;
            }
            try {
                object = new JSONObject(string2);
                bl2 = object.has((String)object2);
                string3 = "jsonArray.getString(i)";
                n3 = 0;
                if (!bl2) break block6;
                string2 = object.getJSONArray((String)object2);
                int n4 = string2.length();
                for (int i3 = 0; i3 < n4; ++i3) {
                    LinkedHashSet linkedHashSet = c;
                    String string5 = string2.getString(i3);
                    Intrinsics.checkNotNullExpressionValue(string5, string3);
                    linkedHashSet.add(string5);
                }
            }
            catch (Throwable throwable2222) {
            }
        }
        if (!(bl2 = object.has(string4))) return;
        string2 = object.getJSONArray(string4);
        int n7 = string2.length();
        while (n3 < n7) {
            object2 = d;
            object = string2.getString(n3);
            Intrinsics.checkNotNullExpressionValue(object, string3);
            object2.add(object);
            ++n3;
        }
        return;
        catch (Exception exception) {
            return;
        }
        td0.a(this, throwable2222);
    }
}

