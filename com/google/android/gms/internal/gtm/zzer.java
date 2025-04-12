/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzeq;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzff;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

final class zzer
extends zzbr {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfb zzc;

    public zzer(zzbu object) {
        super((zzbu)object);
        Object object2 = zzbs.zza;
        String string2 = Build.VERSION.RELEASE;
        String string3 = zzff.zzd(Locale.getDefault());
        String string4 = Build.MODEL;
        String string5 = Build.ID;
        String string6 = "; ";
        object2 = og_1.a("GoogleAnalytics/", (String)object2, " (Linux; U; Android ", string2, string6);
        X50.a((StringBuilder)object2, string3, string6, string4, " Build/");
        object2 = h30_0.a((StringBuilder)object2, string5, ")");
        this.zzb = object2;
        object = ((zzbu)object).zzr();
        this.zzc = object2 = new zzfb((Clock)object);
    }

    public static /* bridge */ /* synthetic */ byte[] zzf() {
        return zza;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int zzg(URL object, byte[] object2, int n3) {
        void var2_9;
        Object object3;
        String string2;
        block17: {
            int n4;
            block21: {
                Object object4;
                String string3;
                block18: {
                    block20: {
                        Object object5;
                        block19: {
                            boolean bl2;
                            string2 = "Error closing http post connection output stream";
                            Preconditions.checkNotNull(object);
                            Preconditions.checkNotNull(object2);
                            int n7 = ((byte[])object2).length;
                            object3 = n7;
                            object5 = "POST bytes, url";
                            this.zzG((String)object5, object3, object);
                            boolean bl3 = zzbq.zzU();
                            if (bl3) {
                                object3 = new String((byte[])object2);
                                object5 = "Post payload\n";
                                this.zzO((String)object5, object3);
                            }
                            bl3 = false;
                            object3 = null;
                            try {
                                object = this.zzb((URL)object);
                                bl2 = true;
                            }
                            catch (Throwable throwable) {
                                object = null;
                                break block17;
                            }
                            catch (IOException iOException) {
                                object = null;
                                break block18;
                            }
                            try {
                                ((URLConnection)object).setDoOutput(bl2);
                                ((HttpURLConnection)object).setFixedLengthStreamingMode(n7);
                                ((URLConnection)object).connect();
                                object3 = ((URLConnection)object).getOutputStream();
                                ((OutputStream)object3).write((byte[])object2);
                                this.zzk((HttpURLConnection)object);
                                n4 = ((HttpURLConnection)object).getResponseCode();
                                n7 = 200;
                                if (n4 != n7) break block19;
                                object2 = this.zzs();
                                ((zzbp)object2).zzi();
                                n4 = 200;
                            }
                            catch (Throwable throwable) {
                                break block17;
                            }
                            catch (IOException iOException) {
                                break block20;
                            }
                        }
                        string3 = "POST status";
                        object5 = n4;
                        this.zzF(string3, object5);
                        break block21;
                    }
                    object4 = object3;
                    object3 = object;
                    object = object4;
                }
                string3 = "Network POST connection error";
                try {
                    Object var2_7;
                    this.zzR(string3, var2_7);
                    n4 = 0;
                    var2_7 = null;
                    object4 = object3;
                    object3 = object;
                    object = object4;
                }
                catch (Throwable throwable) {
                    object4 = object3;
                    object3 = object;
                    object = object4;
                    break block17;
                }
            }
            if (object3 != null) {
                try {
                    ((OutputStream)object3).close();
                }
                catch (IOException iOException) {
                    this.zzJ(string2, iOException);
                }
            }
            if (object != null) {
                ((HttpURLConnection)object).disconnect();
            }
            return n4;
        }
        if (object3 != null) {
            try {
                ((OutputStream)object3).close();
            }
            catch (IOException iOException) {
                this.zzJ(string2, iOException);
            }
        }
        if (object != null) {
            ((HttpURLConnection)object).disconnect();
        }
        throw var2_9;
    }

    private final URL zzh() {
        this.zzw();
        String string2 = zzcs.zzi();
        this.zzw();
        Object object = (String)zzeh.zzn.zzb();
        string2 = string2.concat((String)object);
        try {
            object = new URL(string2);
            return object;
        }
        catch (MalformedURLException malformedURLException) {
            this.zzJ("Error trying to parse the hardcoded host url", malformedURLException);
            return null;
        }
    }

    private final URL zzi(zzek object) {
        Object object2;
        boolean bl2 = ((zzek)object).zzh();
        if (bl2) {
            this.zzw();
            object = zzcs.zzi();
            this.zzw();
            object2 = zzcs.zzj();
            object = ((String)object).concat((String)object2);
        } else {
            this.zzw();
            object = zzcs.zzk();
            this.zzw();
            object2 = zzcs.zzj();
            object = ((String)object).concat((String)object2);
        }
        try {
            object2 = new URL((String)object);
            return object2;
        }
        catch (MalformedURLException malformedURLException) {
            this.zzJ("Error trying to parse the hardcoded host url", malformedURLException);
            return null;
        }
    }

    private final URL zzj(zzek object, String object2) {
        boolean bl2 = ((zzek)object).zzh();
        String string2 = "?";
        if (bl2) {
            this.zzw();
            object = zzcs.zzi();
            this.zzw();
            String string3 = zzcs.zzj();
            object = y02.a((String)object, string3, string2, (String)object2);
        } else {
            this.zzw();
            object = zzcs.zzk();
            this.zzw();
            String string4 = zzcs.zzj();
            object = y02.a((String)object, string4, string2, (String)object2);
        }
        try {
            object2 = new URL((String)object);
            return object2;
        }
        catch (MalformedURLException malformedURLException) {
            this.zzJ("Error trying to parse the hardcoded host url", malformedURLException);
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzk(HttpURLConnection object) {
        void var4_9;
        String string2;
        block9: {
            int n3;
            string2 = "Error closing http connection input stream";
            try {
                object = ((URLConnection)object).getInputStream();
                n3 = 1024;
            }
            catch (Throwable throwable) {
                object = null;
                break block9;
            }
            try {
                int n4;
                byte[] byArray = new byte[n3];
                while ((n4 = ((InputStream)object).read(byArray)) > 0) {
                }
            }
            catch (Throwable throwable) {
                break block9;
            }
            try {
                ((InputStream)object).close();
                return;
            }
            catch (IOException iOException) {
                this.zzJ(string2, iOException);
                return;
            }
        }
        if (object == null) throw var4_9;
        try {
            ((InputStream)object).close();
            throw var4_9;
        }
        catch (IOException iOException) {
            this.zzJ(string2, iOException);
        }
        throw var4_9;
    }

    private static final void zzl(StringBuilder stringBuilder, String string2, String string3) {
        int n3 = stringBuilder.length();
        if (n3 != 0) {
            n3 = 38;
            stringBuilder.append((char)n3);
        }
        String string4 = "UTF-8";
        string2 = URLEncoder.encode(string2, string4);
        stringBuilder.append(string2);
        stringBuilder.append('=');
        string2 = URLEncoder.encode(string3, string4);
        stringBuilder.append(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zza(zzek object, boolean object2) {
        UnsupportedEncodingException unsupportedEncodingException2;
        block8: {
            String string2;
            String string3;
            String string4;
            Object object3;
            Preconditions.checkNotNull(object);
            StringBuilder stringBuilder = new StringBuilder();
            try {
                object3 = ((zzek)object).zzg();
                object3 = object3.entrySet();
                object3 = object3.iterator();
                while (true) {
                    boolean bl2 = object3.hasNext();
                    string4 = "z";
                    string3 = "qt";
                    string2 = "ht";
                    if (bl2) {
                        boolean bl3;
                        boolean bl4;
                        Object object4 = object3.next();
                        object4 = (Map.Entry)object4;
                        Object object5 = object4.getKey();
                        boolean bl5 = string2.equals(object5 = (String)object5);
                        if (bl5 || (bl4 = string3.equals(object5)) || (bl4 = (string3 = "AppUID").equals(object5)) || (bl3 = string4.equals(object5)) || (bl3 = (string4 = "_gmsv").equals(object5))) continue;
                        object4 = object4.getValue();
                        object4 = (String)object4;
                        zzer.zzl(stringBuilder, object5, object4);
                        continue;
                    }
                    break;
                }
            }
            catch (UnsupportedEncodingException unsupportedEncodingException2) {
                break block8;
            }
            long l2 = ((zzek)object).zzd();
            object3 = String.valueOf(l2);
            zzer.zzl(stringBuilder, string2, (String)object3);
            object3 = this.zzC();
            l2 = object3.currentTimeMillis();
            long l3 = ((zzek)object).zzd();
            object3 = String.valueOf(l2 -= l3);
            zzer.zzl(stringBuilder, string3, (String)object3);
            this.zzw();
            if (object2) {
                long l4;
                l2 = ((zzek)object).zzc();
                long l7 = l2 - (l4 = 0L);
                object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2) {
                    object = String.valueOf(l2);
                } else {
                    long l8 = ((zzek)object).zzb();
                    object = String.valueOf(l8);
                }
                zzer.zzl(stringBuilder, string4, (String)object);
            }
            return stringBuilder.toString();
        }
        this.zzJ("Failed to encode name or value", unsupportedEncodingException2);
        return null;
    }

    public final HttpURLConnection zzb(URL object) {
        boolean bl2 = (object = ((URL)object).openConnection()) instanceof HttpURLConnection;
        if (bl2) {
            object = (HttpURLConnection)object;
            ((URLConnection)object).setDefaultUseCaches(false);
            this.zzw();
            int n3 = (Integer)zzeh.zzw.zzb();
            ((URLConnection)object).setConnectTimeout(n3);
            this.zzw();
            n3 = (Integer)zzeh.zzx.zzb();
            ((URLConnection)object).setReadTimeout(n3);
            ((HttpURLConnection)object).setInstanceFollowRedirects(false);
            String string2 = this.zzb;
            ((URLConnection)object).setRequestProperty("User-Agent", string2);
            ((URLConnection)object).setDoInput(true);
            return object;
        }
        object = new IOException("Failed to obtain http connection");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zzc(List var1_1) {
        block67: {
            block55: {
                block68: {
                    block59: {
                        block69: {
                            block54: {
                                block53: {
                                    var2_2 = this;
                                    var3_3 = "Error closing http compressed post connection output stream";
                                    zzr.zzh();
                                    this.zzV();
                                    Preconditions.checkNotNull(var1_1);
                                    var4_4 = this.zzw().zza();
                                    var5_22 = var4_4.isEmpty();
                                    var6_23 = 1;
                                    if (var5_22 != 0) ** GOTO lbl-1000
                                    var4_4 = this.zzc;
                                    this.zzw();
                                    var7_24 = (Integer)zzeh.zzv.zzb();
                                    var8_25 = var7_24.intValue();
                                    var9_26 = var8_25;
                                    var11_27 = 1000L;
                                    var5_22 = (int)var4_4.zzc(var9_26 *= var11_27);
                                    if (var5_22 == 0) lbl-1000:
                                    // 2 sources

                                    {
                                        var5_22 = 0;
                                        var4_4 = null;
                                        while (true) {
                                            var8_25 = 0;
                                            var7_24 = null;
                                            break;
                                        }
                                    } else {
                                        this.zzw();
                                        var4_4 = (String)zzeh.zzp.zzb();
                                        var7_24 = "BATCH_BY_SESSION";
                                        var8_25 = var7_24.equalsIgnoreCase((String)var4_4);
                                        if (var8_25 != 0) {
                                            while (true) {
                                                var5_22 = 1;
                                                break;
                                            }
                                        } else {
                                            if ((var8_25 = (var7_24 = "BATCH_BY_TIME").equalsIgnoreCase((String)var4_4)) != 0 || (var8_25 = (var7_24 = "BATCH_BY_BRUTE_FORCE").equalsIgnoreCase((String)var4_4)) != 0 || (var8_25 = (var7_24 = "BATCH_BY_COUNT").equalsIgnoreCase((String)var4_4)) != 0 || (var5_22 = (int)(var7_24 = "BATCH_BY_SIZE").equalsIgnoreCase((String)var4_4)) != 0) ** continue;
                                            var5_22 = 0;
                                            var4_4 = null;
                                        }
                                        this.zzw();
                                        var7_24 = (String)zzeh.zzq.zzb();
                                        var13_28 = "GZIP";
                                        var8_25 = var13_28.equalsIgnoreCase((String)var7_24);
                                        if (var6_23 != var8_25) ** continue;
                                        var8_25 = 1;
                                    }
                                    var14_29 = 200;
                                    if (var5_22 == 0) break block68;
                                    var5_22 = var1_1.isEmpty() ^ var6_23;
                                    Preconditions.checkArgument((boolean)var5_22);
                                    var4_4 = (boolean)var8_25;
                                    var15_30 = var1_1.size();
                                    var16_32 = var15_30;
                                    var2_2.zzP("Uploading batched hits. compression, count", var4_4, var16_32);
                                    var16_32 = new zzeq(var2_2);
                                    var17_34 /* !! */  = new ArrayList<Long>();
                                    var4_4 = var1_1.iterator();
                                    var18_36 = 0;
                                    var19_37 = null;
                                    while ((var20_38 = var4_4.hasNext()) && (var22_40 = var16_32.zzb((zzek)(var21_39 = (zzek)var4_4.next()))) != 0) {
                                        var23_41 = var21_39.zzb();
                                        var25_42 = var23_41;
                                        var17_34 /* !! */ .add(var25_42);
                                        if (var18_36 > 0) continue;
                                        var18_36 = var21_39.zza();
                                    }
                                    var5_22 = var16_32.zza();
                                    if (var5_22 == 0) {
                                        return var17_34 /* !! */ ;
                                    }
                                    var4_4 = this.zzh();
                                    if (var4_4 == null) {
                                        var4_4 = "Failed to build batching endpoint url";
                                        var2_2.zzI((String)var4_4);
                                        return Collections.emptyList();
                                    }
                                    if (var8_25 == 0) break block69;
                                    var7_24 = var16_32.zzc();
                                    Preconditions.checkNotNull(var4_4);
                                    Preconditions.checkNotNull(var7_24);
                                    try {
                                        var19_37 = new ByteArrayOutputStream();
                                        var21_39 = new GZIPOutputStream((OutputStream)var19_37);
                                        var21_39.write((byte[])var7_24);
                                        var21_39.close();
                                        var19_37.close();
                                        var19_37 = var19_37.toByteArray();
                                        var21_39 = "POST compressed size, ratio %, url";
                                        var22_40 = ((Object)var19_37).length;
                                        var26_43 = var22_40;
                                        var27_44 = var22_40;
                                        var29_45 = ((Object)var7_24).length;
                                    }
                                    catch (Throwable var4_5) {
                                        break block53;
                                    }
                                    catch (IOException var4_6) {
                                        break block54;
                                    }
                                    var30_47 = 100;
                                    var27_44 *= var30_47;
                                    var32_48 = var29_45;
                                    var34_49 = var27_44 /= var32_48;
                                    var2_2.zzH((String)var21_39, var26_43, var34_49, var4_4);
                                    if (var22_40 > var29_45) {
                                        var34_49 = "Compressed payload is larger then uncompressed. compressed, uncompressed";
                                        var35_51 = var29_45;
                                        var2_2.zzS((String)var34_49, var26_43, var35_51);
                                    }
                                    if ((var6_23 = (int)zzbq.zzU()) != 0) {
                                        var34_49 = "Post payload";
                                        var35_51 = new String((byte[])var7_24);
                                        var7_24 = new StringBuilder();
                                        var36_53 = "\n";
                                        var7_24.append((String)var36_53);
                                        var7_24.append((String)var35_51);
                                        var35_51 = var7_24.toString();
                                        var2_2.zzO((String)var34_49, var35_51);
                                    }
                                    var34_49 = var2_2.zzb((URL)var4_4);
                                    var5_22 = 1;
                                    var34_49.setDoOutput((boolean)var5_22);
                                    var4_4 = "Content-Encoding";
                                    var35_51 = "gzip";
                                    var34_49.addRequestProperty((String)var4_4, (String)var35_51);
                                    var34_49.setFixedLengthStreamingMode(var22_40);
                                    var34_49.connect();
                                    var35_51 = var34_49.getOutputStream();
                                    break block55;
                                }
                                var34_49 = var4_5;
                                var29_45 = 0;
                                var36_53 = null;
                                var38_57 = null;
                                ** GOTO lbl163
                            }
                            var6_23 = 0;
                            var34_49 = null;
lbl137:
                            // 2 sources

                            while (true) {
                                block58: {
                                    block56: {
                                        block57: {
                                            var29_45 = 0;
                                            var36_53 = null;
                                            var35_51 = "Network compressed POST connection error";
                                            try {
                                                var2_2.zzR((String)var35_51, var4_4);
                                                if (var36_53 == null) break block56;
                                                break block57;
                                            }
                                            catch (Throwable var4_13) {
                                                var38_57 = var34_49;
                                            }
lbl147:
                                            // 2 sources

                                            while (true) {
                                                var34_49 = var4_11;
                                                break block58;
                                                break;
                                            }
                                        }
                                        try {
                                            var36_53.close();
                                        }
                                        catch (IOException var4_12) {
                                            var35_51 = var4_12;
                                            var2_2.zzJ((String)var3_3, var4_12);
                                        }
                                    }
                                    if (var34_49 != null) {
                                        var34_49.disconnect();
                                    }
                                    var37_55 = 0;
                                    var35_51 = null;
                                    break block59;
                                }
                                if (var36_53 != null) {
                                    try {
                                        var36_53.close();
                                    }
                                    catch (IOException var4_14) {
                                        var35_51 = var4_14;
                                        var2_2.zzJ((String)var3_3, var4_14);
                                    }
                                }
                                if (var38_57 == null) throw var34_49;
                                var38_57.disconnect();
                                throw var34_49;
                            }
                        }
                        var3_3 = var16_32.zzc();
                        var37_55 = var2_2.zzg((URL)var4_4, (byte[])var3_3, var18_36);
                    }
lbl178:
                    // 2 sources

                    while (true) {
                        if (var37_55 == var14_29) {
                            var5_22 = var16_32.zza();
                            var4_4 = var5_22;
                            var3_3 = "Batched upload completed. Hits batched";
                            var2_2.zzO((String)var3_3, var4_4);
                            return var17_34 /* !! */ ;
                        }
                        var4_4 = var37_55;
                        var2_2.zzO("Network error uploading hits. status code", var4_4);
                        var3_3 = this.zzw().zza();
                        var5_22 = (int)var3_3.contains(var4_4);
                        if (var5_22 == 0) return Collections.emptyList();
                        var2_2.zzQ("Server instructed the client to stop batching");
                        var4_4 = var2_2.zzc;
                        var4_4.zzb();
                        return Collections.emptyList();
                    }
                }
                var5_22 = var1_1.size();
                var3_3 = new ArrayList(var5_22);
                var4_4 = var1_1.iterator();
                do {
                    block63: {
                        block72: {
                            block61: {
                                block62: {
                                    block66: {
                                        block65: {
                                            block64: {
                                                block60: {
                                                    block71: {
                                                        block70: {
                                                            if ((var6_23 = var4_4.hasNext()) == 0) return var3_3;
                                                            var34_50 = (zzek)var4_4.next();
                                                            Preconditions.checkNotNull(var34_50);
                                                            var37_56 = var34_50.zzh();
                                                            var8_25 = 1;
                                                            var35_52 = var2_2.zza((zzek)var34_50, var37_56 ^= var8_25);
                                                            if (var35_52 != null) break block70;
                                                            var35_52 = this.zzz();
                                                            var36_54 = "Error formatting hit for upload";
                                                            var35_52.zzb((zzek)var34_50, (String)var36_54);
                                                            break block71;
                                                        }
                                                        this.zzw();
                                                        var36_54 = (Integer)zzeh.zzo.zzb();
                                                        var29_46 = var36_54.intValue();
                                                        var15_31 = var35_52.length();
                                                        if (var15_31 <= var29_46) {
                                                            if ((var35_52 = var2_2.zzj((zzek)var34_50, (String)var35_52)) == null) {
                                                                var4_4 = "Failed to build collect GET endpoint url";
                                                                var2_2.zzI((String)var4_4);
                                                                return var3_3;
                                                            }
                                                            Preconditions.checkNotNull(var35_52);
                                                            var36_54 = "GET request";
                                                            var2_2.zzF((String)var36_54, var35_52);
                                                            try {
                                                                var35_52 = var2_2.zzb((URL)var35_52);
                                                                break block60;
                                                            }
                                                            catch (Throwable var4_17) {
                                                                var29_46 = 0;
                                                                var36_54 = null;
                                                                break block61;
                                                            }
                                                            catch (IOException var4_18) {
                                                                var29_46 = 0;
                                                                var36_54 = null;
                                                                break block62;
                                                            }
                                                        }
                                                        break block72;
                                                    }
lbl239:
                                                    // 2 sources

                                                    while (true) {
                                                        var37_56 = false;
                                                        var35_52 = null;
                                                        break block63;
                                                        break;
                                                    }
                                                }
                                                try {
                                                    var35_52.connect();
                                                    var2_2.zzk((HttpURLConnection)var35_52);
                                                    var29_46 = var35_52.getResponseCode();
                                                    if (var29_46 != var14_29) break block64;
                                                    var36_54 = this.zzs();
                                                    var36_54.zzi();
                                                    var29_46 = 200;
                                                }
                                                catch (Throwable var4_15) {
                                                    break block65;
                                                }
                                                catch (IOException var4_16) {
                                                    break block66;
                                                }
                                            }
                                            var16_33 = "GET status";
                                            var17_35 = var29_46;
                                            var2_2.zzF((String)var16_33, var17_35);
                                            var35_52.disconnect();
                                            if (var29_46 != var14_29) return var3_3;
                                            ** continue;
                                        }
                                        var36_54 = var35_52;
                                        break block61;
                                    }
                                    var36_54 = var35_52;
                                }
                                var34_50 = "Network GET connection error";
                                try {
                                    var2_2.zzR((String)var34_50, var4_19);
                                    if (var36_54 == null) return var3_3;
                                    var36_54.disconnect();
                                    return var3_3;
                                }
                                catch (Throwable var4_20) {
                                    // empty catch block
                                }
                            }
                            if (var36_54 == null) throw var4_21;
                            var36_54.disconnect();
                            throw var4_21;
                        }
                        var37_56 = false;
                        var35_52 = null;
                        var36_54 = var2_2.zza((zzek)var34_50, false);
                        if (var36_54 == null) {
                            var36_54 = this.zzz();
                            var16_33 = "Error formatting hit for POST upload";
                            var36_54.zzb((zzek)var34_50, (String)var16_33);
                        } else {
                            var36_54 = var36_54.getBytes();
                            var15_31 = ((Object)var36_54).length;
                            this.zzw();
                            var17_35 = (Integer)zzeh.zzs.zzb();
                            var39_58 = var17_35;
                            if (var15_31 > var39_58) {
                                var36_54 = this.zzz();
                                var16_33 = "Hit payload exceeds size limit";
                                var36_54.zzb((zzek)var34_50, (String)var16_33);
                            } else {
                                var16_33 = var2_2.zzi((zzek)var34_50);
                                if (var16_33 == null) {
                                    var4_4 = "Failed to build collect POST endpoint url";
                                    var2_2.zzI((String)var4_4);
                                    return var3_3;
                                }
                                var39_58 = var34_50.zza();
                                var29_46 = var2_2.zzg((URL)var16_33, (byte[])var36_54, var39_58);
                                if (var29_46 != var14_29) return var3_3;
                            }
                        }
                    }
                    var11_27 = var34_50.zzb();
                    var34_50 = var11_27;
                    var3_3.add(var34_50);
                    var6_23 = var3_3.size();
                    this.zzw();
                } while (var6_23 < (var29_46 = zzcs.zzh()));
                return var3_3;
            }
            try {}
            catch (IOException var4_10) {}
            finally {
                ** GOTO lbl329
            }
            {
                catch (Throwable var4_7) {
                    break block67;
                }
                catch (IOException var4_8) {
                    ** continue;
                }
lbl329:
                // 1 sources

                var35_51.write((byte[])var19_37);
                var35_51.close();
                var2_2.zzk((HttpURLConnection)var34_49);
                var5_22 = var34_49.getResponseCode();
                if (var5_22 == var14_29) {
                    var4_4 = this.zzs();
                    var4_4.zzi();
                    var5_22 = 200;
                }
                var35_51 = "POST status";
                var7_24 = var5_22;
                var2_2.zzF((String)var35_51, var7_24);
                var34_49.disconnect();
                var37_55 = var5_22;
                ** continue;
            }
        }
        var38_57 = var34_49;
        var29_45 = 0;
        var36_53 = null;
        ** while (true)
    }

    public final void zzd() {
        String string2 = this.zzb;
        this.zzO("Network initialized. User agent", string2);
    }

    public final boolean zze() {
        boolean bl2;
        zzr.zzh();
        this.zzV();
        Context context = this.zzo();
        String string2 = "connectivity";
        context = (ConnectivityManager)context.getSystemService(string2);
        try {
            context = context.getActiveNetworkInfo();
        }
        catch (SecurityException securityException) {
            bl2 = false;
            context = null;
        }
        if (context != null && (bl2 = context.isConnected())) {
            return true;
        }
        this.zzN("No network connectivity");
        return false;
    }
}

