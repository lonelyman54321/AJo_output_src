/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.utils;

import android.text.TextUtils;
import com.jio.jioads.instreamads.vastparser.model.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m
extends Lambda
implements Function2 {
    public static final m c;

    static {
        m m2;
        c = m2 = new Lambda(2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block16: {
            block15: {
                block17: {
                    var1_1 = (g)var1_1;
                    var2_2 = (g)var2_2;
                    var3_3 = null;
                    var4_4 = 0;
                    if (var1_1 == null) break block17;
                    try {
                        var5_5 = var1_1.c;
                        ** GOTO lbl-1000
                    }
                    catch (Exception v0) {
                        break block15;
                    }
                }
                var6_6 = false;
                var5_5 = null;
lbl-1000:
                // 2 sources

                {
                    var6_6 = TextUtils.isEmpty((CharSequence)var5_5);
                    if (!var6_6) {
                        if (var1_1 != null && (var1_1 = var1_1.c) != null) {
                            var7_7 = Integer.parseInt((String)var1_1);
                            var1_1 = var7_7;
                        } else {
                            var7_7 = 0;
                            var1_1 = null;
                        }
                        Intrinsics.checkNotNull(var1_1);
                        var7_7 = var1_1.intValue();
                        break block16;
                    } else {
                        if (var1_1 != null && (var1_1 = var1_1.b) != null) {
                            var7_7 = Integer.parseInt((String)var1_1);
                            var1_1 = var7_7;
                        } else {
                            var7_7 = 0;
                            var1_1 = null;
                        }
                        Intrinsics.checkNotNull(var1_1);
                        var7_7 = var1_1.intValue();
                    }
                    break block16;
                }
            }
            var7_7 = 0;
            var1_1 = null;
        }
        if (var2_2 == null) ** GOTO lbl42
        try {
            block18: {
                var5_5 = var2_2.c;
                break block18;
lbl42:
                // 1 sources

                var6_6 = false;
                var5_5 = null;
            }
            var6_6 = TextUtils.isEmpty((CharSequence)var5_5);
            if (!var6_6) {
                if (var2_2 != null && (var2_2 = var2_2.c) != null) {
                    var8_8 = Integer.parseInt((String)var2_2);
                    var3_3 = var8_8;
                }
                Intrinsics.checkNotNull(var3_3);
                var8_8 = var3_3;
lbl52:
                // 2 sources

                while (true) {
                    var4_4 = var8_8;
                    return var7_7 - var4_4;
                }
            }
            if (var2_2 != null && (var2_2 = var2_2.b) != null) {
                var8_8 = Integer.parseInt((String)var2_2);
                var3_3 = var8_8;
            }
            Intrinsics.checkNotNull(var3_3);
            var8_8 = var3_3;
            ** continue;
        }
        catch (Exception v1) {}
        return var7_7 - var4_4;
    }
}

