/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.LocalDataStore;
import java.util.HashMap;
import org.json.JSONObject;

class LocalDataStore$2
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ LocalDataStore b;

    public LocalDataStore$2(LocalDataStore localDataStore, String string2) {
        this.b = localDataStore;
        this.a = string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var1_1 = this.b.a;
        synchronized (var1_1) {
            block8: {
                block7: {
                    block9: {
                        block6: {
                            try {
                                var3_4 = this.b;
                                var3_4 = var3_4.a;
                                var2_2 = new HashMap(var3_4);
                                var3_4 = q50_0.e;
                                var3_4 = var3_4.iterator();
                                var4_5 = true;
lbl10:
                                // 5 sources

                                while (var5_6 = var3_4.hasNext()) {
                                    var6_7 = var3_4.next();
                                    var7_8 /* !! */  = var2_2.get(var6_7 = (String)var6_7);
                                    if (var7_8 /* !! */  == null) continue;
                                    break block6;
                                }
                                break block7;
                            }
                            catch (Throwable var2_3) {
                                break block8;
                            }
                        }
                        var7_8 /* !! */  = var2_2.get(var6_7);
                        var8_9 = var7_8 /* !! */  instanceof String;
                        if (!var8_9) ** GOTO lbl10
                        var9_10 = this.b;
                        var9_10 = var9_10.d;
                        var7_8 /* !! */  = (String)var7_8 /* !! */ ;
                        if ((var7_8 /* !! */  = var9_10.b((String)var7_8 /* !! */ , (String)var6_7)) != null) break block9;
                        var4_5 = false;
                        var10_11 = null;
                        ** GOTO lbl10
                    }
                    var2_2.put(var6_7, var7_8 /* !! */ );
                    ** GOTO lbl10
                }
                var3_4 = new JSONObject(var2_2);
                if (!var4_5) {
                    var2_2 = this.b;
                    var10_11 = var2_2.c;
                    var6_7 = var2_2.b;
                    var2_2 = var2_2.d;
                    var11_12 = 2;
                    os_2.e((Context)var10_11, var6_7, var11_12, (ae0_1)var2_2);
                }
                var2_2 = this.b;
                var10_11 = var2_2.e;
                var2_2 = var2_2.c;
                var2_2 = var10_11.c((Context)var2_2);
                var10_11 = this.a;
                var6_7 = this.b;
                var6_7 = var6_7.g;
                var6_7 = var6_7.f();
                var12_13 = var2_2.m((String)var10_11, (String)var6_7, var3_4);
                var10_11 = this.b;
                var10_11 = var10_11.b;
                var10_11 = var10_11.b();
                var6_7 = this.b;
                var6_7 = var6_7.b;
                var6_7 = var6_7.a;
                var7_8 /* !! */  = new StringBuilder();
                var9_10 = "Persist Local Profile complete with status ";
                var7_8 /* !! */ .append((String)var9_10);
                var7_8 /* !! */ .append(var12_13);
                var2_2 = " for id ";
                var7_8 /* !! */ .append((String)var2_2);
                var2_2 = this.a;
                var7_8 /* !! */ .append((String)var2_2);
                var2_2 = var7_8 /* !! */ .toString();
                var10_11.b((String)var6_7, (String)var2_2);
                return;
            }
            throw var2_3;
        }
    }
}

