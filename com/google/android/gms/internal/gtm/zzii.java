/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgs;
import com.google.android.gms.internal.gtm.zzgv;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhj;
import com.google.android.gms.internal.gtm.zzhk;
import com.google.android.gms.internal.gtm.zzhm;
import com.google.android.gms.internal.gtm.zzih;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class zzii
implements zzgs {
    private final String zza;
    private final Context zzb;
    private final zzih zzc;
    private final Map zzd;
    private final Map zze;
    private final Clock zzf;

    public zzii(Context object, zzih object2) {
        int n3;
        String string2;
        this.zzb = object = object.getApplicationContext();
        this.zzc = object2;
        this.zzd = object;
        super();
        this.zze = object;
        object = DefaultClock.getInstance();
        this.zzf = object;
        object = Build.VERSION.RELEASE;
        object2 = Locale.getDefault();
        CharSequence charSequence = null;
        if (object2 != null && (string2 = ((Locale)object2).getLanguage()) != null && (n3 = (string2 = ((Locale)object2).getLanguage()).length()) != 0) {
            charSequence = new StringBuilder();
            string2 = ((Locale)object2).getLanguage().toLowerCase();
            ((StringBuilder)charSequence).append(string2);
            string2 = ((Locale)object2).getCountry();
            if (string2 != null && (n3 = (string2 = ((Locale)object2).getCountry()).length()) != 0) {
                string2 = "-";
                ((StringBuilder)charSequence).append(string2);
                object2 = ((Locale)object2).getCountry().toLowerCase();
                ((StringBuilder)charSequence).append((String)object2);
            }
            charSequence = ((StringBuilder)charSequence).toString();
        }
        object2 = Build.MODEL;
        string2 = Build.ID;
        String string3 = "; ";
        object = ko_0.a(og_1.a("GoogleTagManager/5.06 (Linux; U; Android ", (String)object, string3, charSequence, string3), (String)object2, " Build/", string2, ")");
        this.zza = object;
    }

    public static final URL zzc(zzgv object) {
        object = ((zzgv)object).zze();
        try {
            URL uRL = new URL((String)object);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            zzhi.zza("Error trying to parse the GTM url.");
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(List var1_1) {
        var2_2 = this;
        var3_3 = ": ";
        var4_4 = "GET";
        var5_5 = var1_1.size();
        var6_6 = Math.min(var5_5, 40);
        var7_7 = 1;
        var8_8 = 0;
        var9_9 = 1;
        while (true) {
            block49: {
                block52: {
                    block50: {
                        block59: {
                            block45: {
                                block53: {
                                    block51: {
                                        if (var8_8 >= var6_6) {
                                            return;
                                        }
                                        var11_19 = var10_10 = var1_1.get(var8_8);
                                        var11_19 = (zzgv)var10_10;
                                        var12_20 = zzii.zzc(var11_19);
                                        if (var12_20 == null || (var5_5 = (int)(var10_10 = var2_2.zzd).containsKey(var13_21 = var12_20.toString())) == 0) break block51;
                                        var10_10 = var2_2.zzd;
                                        var13_21 = var12_20.toString();
                                        var14_22 = (Long)var10_10.get(var13_21);
                                        var10_10 = var2_2.zze;
                                        var16_23 = var12_20.toString();
                                        var17_24 = (Long)var10_10.get(var16_23) + var14_22;
                                        cfr_temp_0 = var17_24 - (var14_22 = (var10_10 = var2_2.zzf).currentTimeMillis());
                                        var5_5 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var5_5 <= 0) break block51;
                                        var10_10 = var2_2.zzc;
                                        var10_10.zzb((zzgv)var11_19);
                                        break block52;
                                    }
                                    var10_10 = var11_19.zzd();
                                    var13_21 = var11_19.zzf();
                                    var19_25 = var11_19.zzc();
                                    if (var12_20 != null) break block53;
                                    zzhi.zze("No destination: discarding hit.");
                                    var10_10 = var2_2.zzc;
                                    var10_10.zza((zzgv)var11_19);
                                    break block52;
                                }
                                var16_23 = var12_20.openConnection();
                                var16_23 = (HttpURLConnection)var16_23;
                                if (var9_9 == 0) ** GOTO lbl57
                                try {
                                    var21_27 /* !! */  = var2_2.zzb;
                                    var23_29 = "com.google.analytics.RADIO_POWERED";
                                    var22_28 = new Intent((String)var23_29);
                                    var23_29 = var21_27 /* !! */ .getPackageName();
                                    var22_28.addCategory((String)var23_29);
                                    var23_29 = zzhj.zza;
                                    var22_28.putExtra((String)var23_29, (boolean)var7_7);
                                    var21_27 /* !! */ .sendBroadcast((Intent)var22_28);
                                    ** GOTO lbl57
                                }
                                catch (Throwable var10_11) {
                                    block54: {
                                        block55: {
                                            block47: {
                                                block48: {
                                                    block42: {
                                                        block44: {
                                                            block58: {
                                                                block46: {
                                                                    block43: {
                                                                        block57: {
                                                                            block56: {
                                                                                block41: {
                                                                                    var9_9 = 1;
                                                                                    break block54;
lbl57:
                                                                                    // 2 sources

                                                                                    var23_29 = "User-Agent";
                                                                                    var21_27 /* !! */  = var2_2.zza;
                                                                                    var16_23.setRequestProperty((String)var23_29, (String)var21_27 /* !! */ );
                                                                                    if (var13_21 != null) {
                                                                                        var23_29 = var13_21.entrySet();
                                                                                        var23_29 = var23_29.iterator();
                                                                                        while ((var9_9 = var23_29.hasNext()) != 0) {
                                                                                            var21_27 /* !! */  = var23_29.next();
                                                                                            var21_27 /* !! */  = (Map.Entry)var21_27 /* !! */ ;
                                                                                            var13_21 = var21_27 /* !! */ .getKey();
                                                                                            var13_21 = (String)var13_21;
                                                                                            var21_27 /* !! */  = var21_27 /* !! */ .getValue();
                                                                                            var21_27 /* !! */  = (String)var21_27 /* !! */ ;
                                                                                            var16_23.setRequestProperty((String)var13_21, (String)var21_27 /* !! */ );
                                                                                        }
                                                                                    }
                                                                                    if (var10_10 != null) break block41;
                                                                                    var10_10 = "Hit %d retrieved from the store has null HTTP method.";
                                                                                    var14_22 = var11_19.zzb();
                                                                                    var23_29 = var14_22;
                                                                                    var21_27 /* !! */  = new Object[var7_7];
                                                                                    var13_21 = null;
                                                                                    var21_27 /* !! */ [0] = var23_29;
                                                                                    var10_10 = String.format((String)var10_10, var21_27 /* !! */ );
                                                                                    zzhi.zze((String)var10_10);
                                                                                    var10_10 = var2_2.zzc;
                                                                                    var10_10.zza((zzgv)var11_19);
                                                                                    break block42;
                                                                                    catch (Throwable var10_14) {
                                                                                        var13_21 = null;
                                                                                    }
                                                                                    break block55;
                                                                                }
                                                                                var13_21 = null;
                                                                                var20_26 = (int)var10_10.equals(var4_4);
                                                                                var21_27 /* !! */  = "PUT";
                                                                                var22_28 = "POST";
                                                                                var13_21 = "HEAD";
                                                                                if (var20_26 == 0 && (var20_26 = (int)var10_10.equals(var13_21)) == 0 && (var20_26 = (int)var10_10.equals(var22_28)) == 0 && (var20_26 = (int)var10_10.equals(var21_27 /* !! */ )) == 0) {
                                                                                    var23_29 = new StringBuilder();
                                                                                    var21_27 /* !! */  = "Unrecongnized HTTP method ";
                                                                                    var23_29.append((String)var21_27 /* !! */ );
                                                                                    var23_29.append((String)var10_10);
                                                                                    var10_10 = ". Supported methods are GET, HEAD, PUT and/or POST";
                                                                                    var23_29.append((String)var10_10);
                                                                                    var10_10 = var23_29.toString();
                                                                                    zzhi.zze((String)var10_10);
                                                                                    var10_10 = var2_2.zzc;
                                                                                    var10_10.zza((zzgv)var11_19);
                                                                                    break block42;
                                                                                }
                                                                                var20_26 = var10_10.hashCode();
                                                                                var7_7 = 2;
                                                                                switch (var20_26) {
                                                                                    default: {
                                                                                        break;
                                                                                    }
                                                                                    case 2461856: {
                                                                                        var20_26 = (int)var10_10.equals(var22_28);
                                                                                        if (var20_26 == 0) break;
                                                                                        var20_26 = 2;
                                                                                        break block56;
                                                                                    }
                                                                                    case 2213344: {
                                                                                        var20_26 = (int)var10_10.equals(var13_21);
                                                                                        if (var20_26 == 0) break;
                                                                                        var20_26 = 1;
                                                                                        break block56;
                                                                                    }
                                                                                    case 79599: {
                                                                                        var20_26 = (int)var10_10.equals(var21_27 /* !! */ );
                                                                                        if (var20_26 == 0) break;
                                                                                        var20_26 = 3;
                                                                                        break block56;
                                                                                    }
                                                                                    case 70454: {
                                                                                        var20_26 = (int)var10_10.equals(var4_4);
                                                                                        if (var20_26 == 0) break;
                                                                                        var20_26 = 0;
                                                                                        var23_29 = null;
                                                                                        break block56;
                                                                                    }
                                                                                }
                                                                                var20_26 = -1;
                                                                            }
                                                                            if (var20_26 == 0 || var20_26 == (var9_9 = 1)) ** GOTO lbl157
                                                                            if (var20_26 != var7_7 && var20_26 != (var7_7 = 3)) ** GOTO lbl175
                                                                            var16_23.setRequestMethod((String)var10_10);
                                                                            if (var19_25 != null) {
                                                                                var16_23.setDoOutput((boolean)var9_9);
                                                                                var23_29 = "UTF-8";
                                                                                var23_29 = Charset.forName((String)var23_29);
                                                                                var23_29 = var19_25.getBytes((Charset)var23_29);
                                                                                var7_7 = ((Object)var23_29).length;
                                                                                var16_23.setFixedLengthStreamingMode(var7_7);
                                                                                var21_27 /* !! */  = var16_23.getOutputStream();
                                                                                var24_30 = new BufferedOutputStream((OutputStream)var21_27 /* !! */ );
                                                                                var24_30.write((byte[])var23_29);
                                                                                var24_30.flush();
                                                                                var24_30.close();
                                                                            }
                                                                            break block57;
lbl157:
                                                                            // 1 sources

                                                                            if (var19_25 != null) {
                                                                                var23_29 = new StringBuilder();
                                                                                var24_30 = "Body of ";
                                                                                var23_29.append((String)var24_30);
                                                                                var23_29.append((String)var10_10);
                                                                                var24_30 = " hit is ignored: ";
                                                                                var23_29.append((String)var24_30);
                                                                                var23_29.append(var19_25);
                                                                                var24_30 = ".";
                                                                                var23_29.append((String)var24_30);
                                                                                var23_29 = var23_29.toString();
                                                                                zzhi.zze((String)var23_29);
                                                                            }
                                                                            var16_23.setRequestMethod((String)var10_10);
                                                                        }
                                                                        var20_26 = var16_23.getResponseCode();
                                                                        var24_30 = new StringBuilder();
                                                                        var21_27 /* !! */  = "Response code = ";
                                                                        var24_30.append((String)var21_27 /* !! */ );
                                                                        var24_30.append(var20_26);
                                                                        var24_30 = var24_30.toString();
                                                                        zzhi.zzd((String)var24_30);
                                                                        var7_7 = 200;
                                                                        if (var20_26 < var7_7 || var20_26 >= (var7_7 = 300)) break block43;
                                                                        var22_28 = var16_23.getInputStream();
                                                                        try {
                                                                            var23_29 = var12_20.toString();
                                                                            var24_30 = new StringBuilder();
                                                                            var21_27 /* !! */  = "Hit sent to ";
                                                                            var24_30.append((String)var21_27 /* !! */ );
                                                                            var24_30.append((String)var23_29);
                                                                            var23_29 = "(method = ";
                                                                            var24_30.append((String)var23_29);
                                                                            var24_30.append((String)var10_10);
                                                                            var10_10 = ")";
                                                                            var24_30.append((String)var10_10);
                                                                            var10_10 = var24_30.toString();
                                                                            zzhi.zzd((String)var10_10);
                                                                            var10_10 = var2_2.zzc;
                                                                            var10_10 = (zzhk)var10_10;
                                                                            var10_10 = var10_10.zza;
                                                                            var25_31 = var11_19.zzb();
                                                                            zzhm.zzk((zzhm)var10_10, var25_31);
                                                                            var10_10 = var2_2.zzd;
                                                                            var23_29 = var12_20.toString();
                                                                            var10_10.remove(var23_29);
                                                                            var10_10 = var2_2.zze;
                                                                            var23_29 = var12_20.toString();
                                                                            var10_10.remove(var23_29);
                                                                            break block44;
                                                                        }
                                                                        catch (Throwable var10_15) {
                                                                            var9_9 = 0;
                                                                            var21_27 /* !! */  = null;
                                                                            break block45;
                                                                        }
                                                                    }
                                                                    var10_10 = var12_20.toString();
                                                                    var24_30 = new StringBuilder();
                                                                    var21_27 /* !! */  = "Bad response received for ";
                                                                    var24_30.append((String)var21_27 /* !! */ );
                                                                    var24_30.append((String)var10_10);
                                                                    var24_30.append(var3_3);
                                                                    var24_30.append(var20_26);
                                                                    var10_10 = var24_30.toString();
                                                                    zzhi.zze((String)var10_10);
                                                                    var10_10 = new StringBuilder();
                                                                    var23_29 = var16_23.getErrorStream();
                                                                    if (var23_29 == null) break block46;
                                                                    var21_27 /* !! */  = new InputStreamReader((InputStream)var23_29);
                                                                    var24_30 = new BufferedReader((Reader)var21_27 /* !! */ );
                                                                    try {
                                                                        while ((var23_29 = var24_30.readLine()) != null) {
                                                                            var10_10.append((String)var23_29);
                                                                        }
                                                                    }
                                                                    catch (Throwable var10_16) {
                                                                        break block47;
                                                                    }
                                                                    var10_10 = var10_10.toString();
                                                                    var23_29 = new StringBuilder();
                                                                    var21_27 /* !! */  = "Error Message: ";
                                                                    var23_29.append((String)var21_27 /* !! */ );
                                                                    var23_29.append((String)var10_10);
                                                                    var10_10 = var23_29.toString();
                                                                    zzhi.zze((String)var10_10);
                                                                    break block58;
                                                                    catch (Throwable var10_17) {
                                                                        break block48;
                                                                    }
                                                                }
                                                                var7_7 = 0;
                                                                var24_30 = null;
                                                            }
                                                            if (var24_30 == null) ** GOTO lbl272
                                                            try {
                                                                var24_30.close();
lbl272:
                                                                // 2 sources

                                                                var10_10 = var2_2.zzc;
                                                                var10_10.zzb((zzgv)var11_19);
                                                                var22_28 = null;
                                                            }
                                                            catch (Throwable var10_12) {}
                                                        }
                                                        if (var22_28 != null) {
                                                            var22_28.close();
                                                        }
                                                    }
                                                    try {
                                                        var16_23.disconnect();
                                                        var20_26 = 1;
                                                        var9_9 = 0;
                                                        var21_27 /* !! */  = null;
                                                        break block49;
                                                    }
                                                    catch (IOException var10_13) {}
                                                    var9_9 = 0;
                                                    var21_27 /* !! */  = null;
                                                    break block50;
                                                }
                                                var7_7 = 0;
                                                var24_30 = null;
                                            }
                                            if (var24_30 == null) throw var10_10;
                                            var24_30.close();
                                            throw var10_10;
                                        }
                                        var9_9 = 0;
                                        var21_27 /* !! */  = null;
                                    }
                                    var22_28 = null;
                                }
                            }
                            if (var22_28 == null) break block59;
                            try {
                                var22_28.close();
                            }
                            catch (IOException var10_18) {}
                            break block50;
                        }
                        var16_23.disconnect();
                        throw var10_10;
                    }
                    var23_29 = var12_20.toString();
                    var24_30 = var10_10.getClass().getSimpleName();
                    var19_25 = "Exception sending hit to ";
                    var13_21 = new StringBuilder(var19_25);
                    var13_21.append((String)var23_29);
                    var13_21.append(var3_3);
                    var13_21.append((String)var24_30);
                    zzhi.zze(var13_21.toString());
                    zzhi.zze(var10_10.getMessage());
                    var2_2.zzc.zzb((zzgv)var11_19);
                    var10_10 = var2_2.zze;
                    var23_29 = var12_20.toString();
                    var14_22 = var2_2.zzf.currentTimeMillis();
                    var24_30 = var14_22;
                    var10_10.put(var23_29, var24_30);
                    var10_10 = var2_2.zzd;
                    var23_29 = var12_20.toString();
                    var5_5 = (int)var10_10.containsKey(var23_29);
                    if (var5_5 != 0) {
                        var10_10 = var2_2.zzd;
                        var23_29 = var12_20.toString();
                        var10_10 = (Long)var10_10.get(var23_29);
                        var25_31 = var10_10.longValue();
                        var25_31 += var25_31;
                        var14_22 = 600000L;
                        var25_31 = Math.min(var25_31, var14_22);
                    } else {
                        var25_31 = 5000L;
                    }
                    var10_10 = var2_2.zzd;
                    var11_19 = var12_20.toString();
                    var13_21 = var25_31;
                    var10_10.put(var11_19, var13_21);
                    var10_10 = var12_20.toString();
                    var12_20 = "URL resulting in exception can be retried in ";
                    var11_19 = new StringBuilder((String)var12_20);
                    var11_19.append(var25_31);
                    var23_29 = "ms. URL: ";
                    var11_19.append((String)var23_29);
                    var11_19.append((String)var10_10);
                    var10_10 = var11_19.toString();
                    zzhi.zze((String)var10_10);
                }
                var20_26 = 1;
            }
            var8_8 += var20_26;
            var7_7 = 1;
        }
    }

    public final boolean zzb() {
        boolean bl2;
        Context context = this.zzb;
        String string2 = "connectivity";
        if ((context = ((ConnectivityManager)context.getSystemService(string2)).getActiveNetworkInfo()) != null && (bl2 = context.isConnected())) {
            return true;
        }
        zzhi.zzd("...no network connectivity");
        return false;
    }
}

