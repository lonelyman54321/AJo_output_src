/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.core.provider.CallbackWrapper$1;
import androidx.core.provider.CallbackWrapper$2;
import androidx.core.provider.a;
import androidx.core.provider.c;
import androidx.core.provider.d;
import androidx.core.provider.e;
import androidx.core.provider.f;
import androidx.core.provider.g;
import androidx.core.provider.g$a;
import androidx.core.provider.h$c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class h {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Typeface a(Context var0, List var1_4, int var2_5, boolean var3_6, int var4_7, Handler var5_8, ft3$a var6_9) {
        block20: {
            var7_10 = null;
            var8_11 = 1;
            var10_13 = new ZJ2(var5_8);
            var9_12 = new a((ft3$a)var6_9, var10_13);
            var5_8 = null;
            if (var3_6 == 0) ** GOTO lbl66
            var3_6 = var1_4.size();
            if (var3_6 > var8_11) {
                var0 /* !! */  = new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                throw var0 /* !! */ ;
            }
            var1_4 = (gV0)var1_4.get(0);
            var11_14 /* !! */  = g.a;
            var11_14 /* !! */  = new Object[var8_11];
            var11_14 /* !! */ [0] = var1_4;
            var12_16 = new ArrayList(var8_11);
            var11_14 /* !! */  = var11_14 /* !! */ [0];
            Objects.requireNonNull(var11_14 /* !! */ );
            var12_16.add(var11_14 /* !! */ );
            var11_14 /* !! */  = Collections.unmodifiableList(var12_16);
            var11_14 /* !! */  = g.a(var2_5, (List)var11_14 /* !! */ );
            var12_16 = (Typeface)g.a.get(var11_14 /* !! */ );
            if (var12_16 != null) {
                var0 /* !! */  = new CallbackWrapper$1((h$c)var6_9, var12_16);
                var10_13.execute((Runnable)var0 /* !! */ );
                return var12_16;
            }
            var13_17 = -1;
            if (var4_7 == var13_17) {
                var14_18 /* !! */  = new Object[var8_11];
                var14_18 /* !! */ [0] = var1_4;
                var1_4 = new ArrayList(var8_11);
                var14_18 /* !! */  = var14_18 /* !! */ [0];
                Objects.requireNonNull(var14_18 /* !! */ );
                var1_4.add(var14_18 /* !! */ );
                var1_4 = Collections.unmodifiableList(var1_4);
                var0 /* !! */  = g.b(var2_5, var0 /* !! */ , (String)var11_14 /* !! */ , (List)var1_4);
                var9_12.a((g$a)var0 /* !! */ );
                return var0 /* !! */ .a;
            }
            var6_9 = new c((String)var11_14 /* !! */ , var0 /* !! */ , (gV0)var1_4, var2_5);
            var0 /* !! */  = g.b;
            var0 /* !! */  = var0 /* !! */ .submit(var6_9);
            {
                catch (InterruptedException v0) {}
            }
            var15_20 = var4_7;
            var11_14 /* !! */  = TimeUnit.MILLISECONDS;
            var0 /* !! */  = var0 /* !! */ .get(var15_20, (TimeUnit)var11_14 /* !! */ );
            var0 /* !! */  = (g$a)var0 /* !! */ ;
            var9_12.a((g$a)var0 /* !! */ );
            return var0 /* !! */ .a;
            catch (InterruptedException var0_1) {
                throw var0_1;
            }
            catch (ExecutionException var0_2) {
                ** GOTO lbl64
            }
            catch (TimeoutException v1) {
                var1_4 = "timeout";
                var0 /* !! */  = new InterruptedException((String)var1_4);
                throw var0 /* !! */ ;
lbl64:
                // 1 sources

                var1_4 = new RuntimeException(var0_2);
                throw var1_4;
lbl66:
                // 1 sources

                var11_15 = g.a(var2_5, (List)var1_4);
                var14_19 /* !! */  = (Typeface)g.a.get(var11_15);
                if (var14_19 /* !! */  != null) {
                    var0 /* !! */  = new CallbackWrapper$1((h$c)var6_9, var14_19 /* !! */ );
                    var10_13.execute((Runnable)var0 /* !! */ );
                    return var14_19 /* !! */ ;
                }
                var14_19 /* !! */  = new d(var9_12);
                var6_9 = g.c;
                synchronized (var6_9) {
                    try {}
                    catch (Throwable var0_3) {}
                    ** break block19
                    throw var0_3;
                }
            }
            break block20;
lbl-1000:
            // 1 sources

            {
                var7_10 = g.d;
                var17_21 = var7_10.get(var11_15);
                var17_21 = var17_21;
                if (var17_21 != null) {
                    var17_21.add(var14_19 /* !! */ );
                    return var5_8;
                }
                var17_21 = new ArrayList<Typeface>();
                var17_21.add(var14_19 /* !! */ );
                var7_10.put(var11_15, var17_21);
            }
            var14_19 /* !! */  = new e(var2_5, var0 /* !! */ , (String)var11_15, (List)var1_4);
            var0 /* !! */  = g.b;
            var1_4 = new f((String)var11_15);
            var18_22 = Looper.myLooper();
            if (var18_22 == null) {
                var11_15 = Looper.getMainLooper();
                var18_22 = new Handler((Looper)var11_15);
            } else {
                var18_22 = new Handler();
            }
            var11_15 = new Object();
            var11_15.a = var14_19 /* !! */ ;
            var11_15.b = var1_4;
            var11_15.c = var18_22;
            var0 /* !! */ .execute((Runnable)var11_15);
            return var5_8;
        }
        var1_4 = var9_12.a;
        var2_5 = -3;
        var0 /* !! */  = new CallbackWrapper$2((h$c)var1_4, var2_5);
        var1_4 = var9_12.b;
        var1_4.execute((Runnable)var0 /* !! */ );
        return var5_8;
    }
}

