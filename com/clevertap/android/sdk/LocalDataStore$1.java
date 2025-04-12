/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.LocalDataStore;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class LocalDataStore$1
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ LocalDataStore c;

    public LocalDataStore$1(LocalDataStore localDataStore, Context context, String string2) {
        this.c = localDataStore;
        this.a = context;
        this.b = string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void run() {
        var1_1 = this.c.e;
        var2_3 /* !! */  = this.a;
        var1_1 = var1_1.c(var2_3 /* !! */ );
        var2_3 /* !! */  = this.c.a;
        synchronized (var2_3 /* !! */ ) {
            block49: {
                block47: {
                    var3_4 = this.b;
                    var4_5 = this.c;
                    var4_5 = var4_5.g;
                    var4_5 = var4_5.f();
                    var1_1 = var1_1.h((String)var3_4, (String)var4_5);
                    if (var1_1 != null) break block47;
                    try {
                        return;
                    }
                    catch (Throwable var1_2) {
                        break block49;
                    }
                }
                try {
                    var3_4 = var1_1.keys();
                }
                catch (Throwable v1) {
                    ** continue;
                }
lbl24:
                // 2 sources

                while (true) {
                    block48: {
                        var5_6 = var3_4.hasNext();
                        if (!var5_6) ** GOTO lbl81
                        var4_5 = var3_4.next();
                        var4_5 = (String)var4_5;
                        var6_7 = var1_1.get((String)var4_5);
                        var7_8 = var6_7 instanceof JSONObject;
                        if (var7_8) {
                            var6_7 = var1_1.getJSONObject((String)var4_5);
                            var8_9 = this.c;
                            var8_9 = var8_9.a;
                            var8_9.put(var4_5, var6_7);
                            continue;
                        }
                        var7_8 = var6_7 instanceof JSONArray;
                        if (var7_8) {
                            var6_7 = var1_1.getJSONArray((String)var4_5);
                            var8_9 = this.c;
                            var8_9 = var8_9.a;
                            var8_9.put(var4_5, var6_7);
                            continue;
                        }
                        var7_8 = var6_7 instanceof String;
                        if (var7_8) {
                            var8_9 = this.c;
                            var8_9 = var8_9.d;
                            var9_10 = var6_7;
                            var9_10 = (String)var6_7;
                            var8_9 = var8_9.a((String)var9_10, (String)var4_5);
                            if (var8_9 == null) break block48;
                            var6_7 = var8_9;
                        }
                    }
                    var8_9 = this.c;
                    var8_9 = var8_9.a;
                    var8_9.put(var4_5, var6_7);
lbl81:
                    // 1 sources

                    var1_1 = this.c;
                    var1_1 = var1_1.b;
                    var1_1 = var1_1.b();
                    var3_4 = this.c;
                    var3_4 = var3_4.b;
                    var3_4 = var3_4.a;
                    var4_5 = new StringBuilder();
                    var6_7 = "Local Data Store - Inflated local profile ";
                    var4_5.append((String)var6_7);
                    var6_7 = this.c;
                    var6_7 = var6_7.a;
                    var4_5.append(var6_7);
                    var4_5 = var4_5.toString();
                    var1_1.b((String)var3_4, (String)var4_5);
lbl107:
                    // 2 sources

                    return;
                    break;
                }
            }
            throw var1_2;
            {
                catch (JSONException v0) {}
                ** continue;
            }
        }
    }
}

