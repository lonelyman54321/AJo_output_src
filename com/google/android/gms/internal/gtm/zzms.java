/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzms
extends zzjo {
    /*
     * Unable to fully structure code
     */
    public static String zzb(String var0, String var1_1) {
        var2_2 = Charset.forName("UTF-8");
        var3_3 = new StringBuilder();
        var4_4 = 0;
        var5_5 = null;
        block0: while (var4_4 < (var6_6 = var0.length())) {
            block9: {
                block10: {
                    var6_6 = var0.charAt(var4_4);
                    if (var6_6 != (var7_7 = 37)) {
                        var3_3.append((char)var6_6);
                        ++var4_4;
                        continue;
                    }
                    var6_6 = zzms.zzc((String)var0, var4_4);
                    var7_7 = var4_4 + 3;
                    var8_8 = var6_6 & 128;
                    var9_9 = -1;
                    if (var8_8 == 0) {
                        var8_8 = var1_1.indexOf(var6_6);
                        if (var8_8 == var9_9) {
                            var4_4 = (char)var6_6;
                            var3_3.append((char)var4_4);
                        } else {
                            var5_5 = var0.substring(var4_4, var7_7);
                            var3_3.append(var5_5);
                        }
lbl26:
                        // 4 sources

                        while (true) {
                            var4_4 = var7_7;
                            continue block0;
                            break;
                        }
                    }
                    var8_8 = 0;
                    var10_10 = null;
                    while (true) {
                        var11_11 = var6_6 << var8_8;
                        var12_12 = 128;
                        if ((var11_11 &= var12_12) == 0) break;
                        ++var8_8;
                    }
                    var11_11 = 2;
                    if (var8_8 < var11_11 || var8_8 > (var11_11 = 4)) break block9;
                    var13_13 = new byte[var8_8];
                    var13_13[0] = var6_6;
                    var6_6 = 1;
                    for (var14_14 = 1; var14_14 < var8_8; ++var14_14) {
                        var15_15 = zzms.zzc((String)var0, var7_7);
                        var7_7 += 3;
                        var16_16 = var15_15 & 192;
                        if (var16_16 == var12_12) {
                            var13_13[var14_14] = var15_15;
                            continue;
                        }
                        var0 = new UnsupportedEncodingException();
                        throw var0;
                    }
                    var10_10 = ByteBuffer.wrap(var13_13);
                    var11_11 = (var10_10 = var2_2.decode((ByteBuffer)var10_10)).length();
                    if (var11_11 != var6_6) break block10;
                    var6_6 = var10_10.charAt(0);
                    if ((var6_6 = var1_1.indexOf(var6_6)) == var9_9) break block10;
                    var5_5 = var0.substring(var4_4, var7_7);
                    var3_3.append(var5_5);
                    ** GOTO lbl26
                }
                var3_3.append((CharSequence)var10_10);
                ** continue;
            }
            var0 = new UnsupportedEncodingException();
            throw var0;
        }
        return var3_3.toString();
    }

    private static byte zzc(String object, int n3) {
        int n4;
        int n7 = n3 + 3;
        int n8 = ((String)object).length();
        if (n7 <= n8 && (n8 = (int)((String)object).charAt(n3)) == (n4 = 37)) {
            object = ((String)object).substring(++n3, n7);
            n3 = 0;
            n7 = ((String)object).charAt(0);
            if (n7 != (n8 = 43) && (n3 = (int)((String)object).charAt(0)) != (n7 = 45)) {
                n3 = 16;
                try {
                    return (byte)Integer.parseInt((String)object, n3);
                }
                catch (NumberFormatException numberFormatException) {
                    object = new UnsupportedEncodingException();
                    throw object;
                }
            }
            object = new UnsupportedEncodingException();
            throw object;
        }
        object = new UnsupportedEncodingException();
        throw object;
    }

    public final zzqo zza(zzhx object, zzqo ... object2) {
        Preconditions.checkArgument(true);
        int n3 = ((zzqo[])object2).length;
        if (n3 > 0) {
            n3 = 0;
            object = (zzqo)Preconditions.checkNotNull(object2[0]);
        } else {
            object = zzqs.zze;
        }
        object = zzjn.zzd((zzqo)object);
        String string2 = "#;/?:@&=+$,";
        try {
            object = zzms.zzb((String)object, string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return zzqs.zze;
        }
        object2 = new zzqz((String)object);
        return object2;
    }
}

