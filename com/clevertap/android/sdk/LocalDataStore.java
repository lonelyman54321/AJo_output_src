/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore$1;
import com.clevertap.android.sdk.LocalDataStore$2;
import com.clevertap.android.sdk.LocalDataStore$3;
import com.clevertap.android.sdk.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class LocalDataStore {
    public static long j;
    public final HashMap a;
    public final CleverTapInstanceConfig b;
    public final Context c;
    public final ae0_1 d;
    public final Nh0 e;
    public final ExecutorService f;
    public final mp0_0 g;
    public final Set h;
    public final HashMap i;

    public LocalDataStore(Context object, CleverTapInstanceConfig cleverTapInstanceConfig, ae0_1 ae0_12, mp0_0 mp0_02, Nh0 nh0) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap = Collections.synchronizedSet(hashMap);
        this.h = hashMap;
        this.i = hashMap = new HashMap();
        this.c = object;
        this.b = cleverTapInstanceConfig;
        object = Executors.newFixedThreadPool(1);
        this.f = object;
        this.d = ae0_12;
        this.g = mp0_02;
        this.e = nh0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Object object, String string2) {
        block6: {
            if (object == null) {
                return;
            }
            try {
                HashMap hashMap = this.a;
                synchronized (hashMap) {
                    HashMap hashMap2 = this.a;
                    hashMap2.put(string2, object);
                }
            }
            catch (Throwable throwable) {
                break block6;
            }
            return;
        }
        object = this.b.b();
        string2 = this.b.a;
        object.getClass();
        com.clevertap.android.sdk.b.m();
    }

    public final int b(int n3, String string2) {
        Object object = this.b;
        int n4 = ((CleverTapInstanceConfig)object).p;
        Context context = this.c;
        if (n4 != 0) {
            int n7 = -1000;
            object = this.j(string2);
            n4 = gc3_0.b(context, n7, (String)object);
            if (n4 == n7) {
                object = gc3_0.e(context);
                n4 = object.getInt(string2, n3);
            }
            return n4;
        }
        string2 = this.j(string2);
        return gc3_0.b(context, n3, string2);
    }

    public final String c(String string2) {
        HashMap hashMap = this.i;
        Object object = new aw1(string2);
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        String string3 = "defaultValue";
        Intrinsics.checkNotNullParameter(object, string3);
        object = hashMap.get(string2);
        if (object == null) {
            object = yz3_0.g(string2);
            hashMap.put(string2, object);
        }
        return (String)object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object d(String var1_1) {
        if (var1_1 == null) {
            return null;
        }
        var2_3 = this.a;
        synchronized (var2_3) {
            var3_4 = this.a;
            var3_4 = var3_4.get(var1_1);
            var4_5 = var3_4 instanceof String;
            if (var4_5 == '\u0000') ** GOTO lbl24
            var3_4 = (String)var3_4;
            var5_6 = "plainText";
            Intrinsics.checkNotNullParameter(var3_4, var5_6);
            var4_5 = '[';
            var4_5 = (char)StringsKt.d0((CharSequence)var3_4, var4_5);
            if (var4_5 != '\u0000' && (var6_7 = StringsKt.I((CharSequence)var3_4, var4_5 = ']'))) {
                var1_1 = this.b;
                var1_1 = var1_1.b();
                var3_4 = this.b;
                var3_4 = var3_4.a;
                var5_6 = "Failed to retrieve local profile property because it wasn't decrypted";
                var1_1.b((String)var3_4, var5_6);
                return null;
            }
lbl24:
            // 3 sources

            var3_4 = this.a;
            var1_1 = var3_4.get(var1_1);
            return var1_1;
            {
                catch (Throwable var1_2) {}
            }
            catch (Throwable v0) {
                var1_1 = this.b;
                var1_1 = var1_1.b();
                var3_4 = this.b;
                var3_4 = var3_4.a;
                var1_1.getClass();
                com.clevertap.android.sdk.b.m();
                return null;
            }
            throw var1_2;
        }
    }

    public final void e(Context context) {
        String string2 = this.b.a;
        LocalDataStore$1 localDataStore$1 = new LocalDataStore$1(this, context, string2);
        this.h("LocalDataStore#inflateLocalProfileAsync", localDataStore$1);
    }

    public final boolean f(String object) {
        String string2 = this.g.f();
        String string3 = this.c((String)object);
        Object object2 = this.e;
        Context context = this.c;
        object2 = ((Nh0)object2).c(context).p();
        long l2 = ((ax3_0)object2).c(string2, (String)object, string3);
        object = this.b.b();
        ((b)object).a();
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            l4 = 1;
        } else {
            l4 = 0;
            object = null;
        }
        return (boolean)l4;
    }

    public final boolean g(String string2) {
        String string3 = this.g.f();
        string2 = this.c(string2);
        Nh0 nh0 = this.e;
        Context context = this.c;
        boolean bl2 = nh0.c(context).p().b(string3, string2);
        this.b.b().a();
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(String object, Runnable runnable2) {
        try {
            Object object2 = Thread.currentThread();
            long l2 = ((Thread)object2).getId();
            long l3 = j;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) {
                runnable2.run();
                return;
            }
            object2 = this.f;
            LocalDataStore$3 localDataStore$3 = new LocalDataStore$3(this, (String)object, runnable2);
            object2.submit(localDataStore$3);
            return;
        }
        catch (Throwable throwable) {
            object = this.b.b();
            object.getClass();
            com.clevertap.android.sdk.b.m();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(JSONObject object) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.b;
        try {
            String string2;
            int n3 = cleverTapInstanceConfig.s;
            String string3 = null;
            String string4 = "dsync";
            if (n3 == 0) {
                object.put(string4, false);
                return;
            }
            Object object2 = "type";
            object2 = object.getString((String)object2);
            String string5 = "event";
            int n4 = string5.equals(object2);
            boolean bl2 = true;
            if (n4 != 0) {
                string5 = "evtName";
                string2 = "App Launched";
                n4 = string2.equals(string5 = object.getString(string5));
                if (n4 != 0) {
                    object2 = cleverTapInstanceConfig.b();
                    string3 = cleverTapInstanceConfig.a;
                    string5 = "Local cache needs to be updated (triggered by App Launched)";
                    ((b)object2).b(string3, string5);
                    object.put(string4, bl2);
                    return;
                }
            }
            if ((n3 = (string5 = "profile").equals(object2)) != 0) {
                object.put(string4, bl2);
                object = cleverTapInstanceConfig.b();
                object2 = cleverTapInstanceConfig.a;
                string3 = "Local cache needs to be updated (profile event)";
                ((b)object).b((String)object2, string3);
                return;
            }
            long l2 = System.currentTimeMillis();
            long l3 = 1000L;
            n3 = (int)(l2 /= l3);
            string5 = "local_cache_expires_in";
            int n7 = 1200;
            n4 = this.b(n7, string5);
            string2 = "local_cache_last_update";
            n7 = this.b(n3, string2) + n4;
            if (n7 < n3) {
                object.put(string4, bl2);
                object = cleverTapInstanceConfig.b();
                object2 = cleverTapInstanceConfig.a;
                string3 = "Local cache needs to be updated";
                ((b)object).b((String)object2, string3);
                return;
            }
            object.put(string4, false);
            object = cleverTapInstanceConfig.b();
            object2 = cleverTapInstanceConfig.a;
            string3 = "Local cache doesn't need to be updated";
            ((b)object).b((String)object2, string3);
            return;
        }
        catch (Throwable throwable) {
            object = cleverTapInstanceConfig.b();
            object.getClass();
            com.clevertap.android.sdk.b.m();
        }
    }

    public final String j(String charSequence) {
        charSequence = nn_2.a((String)charSequence, ":");
        String string2 = this.b.a;
        ((StringBuilder)charSequence).append(string2);
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(HashMap object) {
        boolean bl2;
        boolean bl3 = ((HashMap)object).isEmpty();
        if (bl3) {
            return;
        }
        long l2 = System.nanoTime();
        Object object2 = ((HashMap)object).keySet();
        Object object3 = new HashSet();
        Object object4 = new bw1(this);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Intrinsics.checkNotNullParameter(object3, "destination");
        Object object5 = "transform";
        Intrinsics.checkNotNullParameter(object4, (String)object5);
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            object5 = object2.next();
            object5 = ((bw1)object4).invoke(object5);
            ((HashSet)object3).add(object5);
        }
        object2 = this.g.f();
        object4 = this.e;
        object5 = this.c;
        ((Nh0)object4).c((Context)object5).p().g((String)object2, (HashSet)object3);
        object2 = this.b.b();
        ((b)object2).a();
        long l3 = System.nanoTime();
        object4 = this.b.b();
        object5 = this.b.a;
        String string2 = "UserEventLog: persistUserEventLog execution time = ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        Object object6 = jl0_0.b(stringBuilder, l3 -= l2, " nano seconds");
        ((b)object4).b((String)object5, (String)object6);
        object = ((HashMap)object).entrySet().iterator();
        while (true) {
            if (!(bl3 = object.hasNext())) {
                object = this.b.a;
                object6 = new LocalDataStore$2(this, (String)object);
                this.h("LocalDataStore#persistLocalProfileAsync", (Runnable)object6);
                return;
            }
            object6 = (Map.Entry)object.next();
            String string3 = (String)object6.getKey();
            if ((object6 = object6.getValue()) == null) {
                object2 = this.a;
                synchronized (object2) {
                    try {
                        object3 = this.a;
                        ((HashMap)object3).remove(string3);
                    }
                    catch (Throwable throwable) {
                        object3 = this.b;
                        object3 = ((CleverTapInstanceConfig)object3).b();
                        object4 = this.b;
                        object4 = ((CleverTapInstanceConfig)object4).a;
                        object3.getClass();
                        com.clevertap.android.sdk.b.m();
                    }
                }
            }
            this.a(object6, string3);
        }
    }

    public final boolean l(String string2) {
        String string3 = this.g.f();
        string2 = this.c(string2);
        Nh0 nh0 = this.e;
        Context context = this.c;
        boolean bl2 = nh0.c(context).p().f(string3, string2);
        this.b.b().a();
        return bl2;
    }
}

