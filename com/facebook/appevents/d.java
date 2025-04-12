/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.facebook.appevents;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger$a;
import com.facebook.appevents.a;
import com.facebook.appevents.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class d {
    public final HashMap a;

    public d() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(pq2_0 var1_1) {
        synchronized (this) {
            block9: {
                var2_3 = td0.b(var1_1);
                var3_4 = null;
                if (!var2_3) ** GOTO lbl9
                ** GOTO lbl18
                {
                    catch (Throwable var1_2) {
                        break block9;
                    }
lbl9:
                    // 1 sources

                    try {
                        var4_5 = var1_1.a;
                        var4_5 = var4_5.entrySet();
                        var5_7 = "events.entries";
                        Intrinsics.checkNotNullExpressionValue(var4_5, (String)var5_7);
                        var3_4 = var4_5;
                        ** GOTO lbl18
                    }
                    catch (Throwable var4_6) {}
                    {
                        td0.a(var1_1, var4_6);
lbl18:
                        // 3 sources

                        var1_1 = var3_4.iterator();
                        while (var2_3 = var1_1.hasNext()) {
                            var4_5 = var1_1.next();
                            var4_5 = (Map.Entry)var4_5;
                            var3_4 = var4_5.getKey();
                            var3_4 = (a)var3_4;
                            if ((var3_4 = this.d((a)var3_4)) == null) continue;
                            var4_5 = var4_5.getValue();
                            var4_5 = (List)var4_5;
                            var4_5 = var4_5.iterator();
                            while (var6_8 = var4_5.hasNext()) {
                                var5_7 = var4_5.next();
                                var5_7 = (c)var5_7;
                                var3_4.a((c)var5_7);
                            }
                        }
                    }
                }
                return;
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final s03_0 b(a object) {
        synchronized (this) {
            Object object2 = "accessTokenAppIdPair";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = this.a;
            object = ((HashMap)object2).get(object);
            return (s03_0)object;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                int n3;
                try {
                    int n4;
                    Iterator iterator = this.a;
                    iterator = ((HashMap)((Object)iterator)).values();
                    iterator = iterator.iterator();
                    n3 = 0;
                    while ((n4 = iterator.hasNext()) != 0) {
                        Object object = iterator.next();
                        object = (s03_0)object;
                        n4 = ((s03_0)object).c();
                        n3 += n4;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return n3;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final s03_0 d(a a2) {
        synchronized (this) {
            Throwable throwable2;
            Object object;
            Object object2;
            block5: {
                try {
                    zq_0 zq_02;
                    object2 = this.a;
                    object2 = ((HashMap)object2).get(a2);
                    object2 = (s03_0)object2;
                    if (object2 == null && (zq_02 = Zq$a.a((Context)(object = FacebookSdk.a()))) != null) {
                        object = AppEventsLogger$a.a((Context)object);
                        object2 = new s03_0(zq_02, (String)object);
                    }
                    if (object2 != null) break block5;
                }
                catch (Throwable throwable2) {}
                return null;
            }
            object = this.a;
            ((HashMap)object).put(a2, object2);
            return object2;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Set e() {
        synchronized (this) {
            Object object = this.a;
            object = ((HashMap)object).keySet();
            String string2 = "stateMap.keys";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            return object;
        }
    }
}

