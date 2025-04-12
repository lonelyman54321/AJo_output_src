/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzarq;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class zzasb {
    public static long zza(String string2) {
        int n3 = 1;
        Object object = "EEE, dd MMM yyyy HH:mm:ss zzz";
        try {
            object = zzasb.zzd((String)object);
        }
        catch (ParseException parseException) {
            String string3 = "0";
            boolean bl2 = string3.equals(string2);
            String string4 = "Unable to parse dateStr: %s, falling back to 0";
            if (!bl2 && !(bl2 = (string3 = "-1").equals(string2))) {
                Object[] objectArray = new Object[n3];
                objectArray[0] = string2;
                zzarq.zzc(parseException, string4, objectArray);
            } else {
                Object[] objectArray = new Object[n3];
                objectArray[0] = string2;
                zzarq.zzd(string4, objectArray);
            }
            return 0L;
        }
        object = ((DateFormat)object).parse(string2);
        return ((Date)object).getTime();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzaqn zzb(zzara var0) {
        block21: {
            block20: {
                var1_1 = var0;
                var2_2 = System.currentTimeMillis();
                var4_3 = var0.zzc;
                if (var4_3 == null) ** GOTO lbl42
                var5_4 /* !! */  = (String[])var4_3.get("Date");
                var6_5 = var5_4 /* !! */  != null ? zzasb.zza((String)var5_4 /* !! */ ) : 0L;
                var5_4 /* !! */  = (String)var4_3.get("Cache-Control");
                if (var5_4 /* !! */  != null) {
                    var5_4 /* !! */  = var5_4 /* !! */ .split(",", 0);
                    var9_7 = false;
                    var10_8 = 0L;
                    var12_9 = 0L;
                    block5: for (var8_6 = 0; var8_6 < (var14_10 = var5_4 /* !! */ .length); ++var8_6) {
                        var15_11 = var5_4 /* !! */ [var8_6].trim();
                        var17_13 = var15_11.equals(var16_12 = "no-cache");
                        if (var17_13 == 0 && (var17_13 = var15_11.equals(var16_12 = "no-store")) == 0) {
                            var16_12 = "max-age=";
                            var17_13 = var15_11.startsWith((String)var16_12);
                            if (var17_13 != 0) {
                                var17_13 = 8;
                                var16_12 = var15_11.substring(var17_13);
                                var12_9 = Long.parseLong((String)var16_12);
                            } else {
                                var16_12 = "stale-while-revalidate=";
                                var17_13 = (int)var15_11.startsWith((String)var16_12);
                                if (var17_13 != 0) {
                                    var17_13 = 23;
                                    var16_12 = var15_11.substring(var17_13);
                                    var10_8 = Long.parseLong((String)var16_12);
                                } else {
                                    var16_12 = "must-revalidate";
                                    var17_13 = (int)var15_11.equals(var16_12);
                                    if (var17_13 != 0 || (var17_13 = (int)var15_11.equals(var16_12 = "proxy-revalidate")) != 0) {
                                        var9_7 = true;
                                    }
                                }
                            }
lbl39:
                            // 6 sources

                            continue block5;
                        } else {
                            ** GOTO lbl42
                        }
                    }
                }
                break block20;
lbl42:
                // 3 sources

                return null;
                var8_6 = 1;
                break block21;
            }
            var9_7 = false;
            var10_8 = 0L;
            var12_9 = 0L;
        }
        var5_4 /* !! */  = (String)var4_3.get("Expires");
        var18_14 = var5_4 /* !! */  != null ? zzasb.zza((String)var5_4 /* !! */ ) : 0L;
        var20_15 = (String)var4_3.get("Last-Modified");
        var23_17 = var20_15 != null ? (var21_16 = zzasb.zza(var20_15)) : 0L;
        var20_15 = (String)var4_3.get("ETag");
        if (var8_6 != 0) {
            var18_14 = 1000L;
            var2_2 += (var12_9 *= var18_14);
            if (var9_7) {
                var10_8 = var2_2;
            } else {
                Long.signum(var10_8);
                var10_8 = var10_8 * var18_14 + var2_2;
            }
            var25_18 = var10_8;
        } else {
            var25_18 = 0L;
            cfr_temp_0 = var6_5 - var25_18;
            var27_19 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var27_19 /* !! */  > 0 && (var27_19 /* !! */  = var18_14 == var6_5 ? 0 : (var18_14 < var6_5 ? -1 : 1)) >= 0) {
                var25_18 = var2_2 += (var18_14 -= var6_5);
            } else {
                var2_2 = var25_18;
            }
        }
        var5_4 /* !! */  = new zzaqn();
        var16_12 = var1_1.zzb;
        var5_4 /* !! */ .zza = (byte[])var16_12;
        var5_4 /* !! */ .zzb = var20_15;
        var5_4 /* !! */ .zzf = var2_2;
        var5_4 /* !! */ .zze = var25_18;
        var5_4 /* !! */ .zzc = var6_5;
        var2_2 = var23_17;
        var5_4 /* !! */ .zzd = var23_17;
        var5_4 /* !! */ .zzg = var4_3;
        var5_4 /* !! */ .zzh = var1_1 = var1_1.zzd;
        return var5_4 /* !! */ ;
        catch (Exception v0) {
            ** continue;
        }
    }

    public static String zzc(long l2) {
        SimpleDateFormat simpleDateFormat = zzasb.zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'");
        Date date = new Date(l2);
        return simpleDateFormat.format(date);
    }

    private static SimpleDateFormat zzd(String object) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, locale);
        object = TimeZone.getTimeZone("GMT");
        simpleDateFormat.setTimeZone((TimeZone)object);
        return simpleDateFormat;
    }
}

