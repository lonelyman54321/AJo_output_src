/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.facebook.login;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.login.i;

public final class j$e {
    public static final j$e a;
    public static i b;

    static {
        j$e j$e;
        a = j$e = new Object();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final i a(Context var1_1) {
        synchronized (this) {
            if (var1_1 /* !! */  == null) {
                var1_1 /* !! */  = FacebookSdk.a();
                return var1_1 /* !! */ ;
                ** finally { 
            }
lbl7:
            // 3 sources

            if (var1_1 /* !! */  == null) {
                return null;
            }
            try {
                var2_3 = j$e.b;
                if (var2_3 != null) return j$e.b;
            }
            catch (Throwable var1_2) {}
            var3_4 = FacebookSdk.b();
            j$e.b = var2_3 = new i(var1_1 /* !! */ , var3_4);
            return j$e.b;
        }
    }
}

