/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.os.Looper
 *  android.view.View
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzbzy;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcab;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzgzz;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhgn;
import com.google.android.gms.internal.ads.zzhgo;
import com.google.android.gms.internal.ads.zzhgp;
import com.google.android.gms.internal.ads.zzhhc;
import com.google.android.gms.internal.ads.zzhhd;
import com.google.android.gms.internal.ads.zzhhe;
import com.google.android.gms.internal.ads.zzhhh;
import com.google.android.gms.internal.ads.zzhif;
import com.google.android.gms.internal.ads.zzhii;
import com.google.android.gms.internal.ads.zzhij;
import com.google.android.gms.internal.ads.zzhim;
import com.google.android.gms.internal.ads.zzhip;
import com.google.android.gms.internal.ads.zzhiq;
import com.google.android.gms.internal.ads.zzhir;
import com.google.android.gms.internal.ads.zzhis;
import com.google.android.gms.internal.ads.zzhit;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.OutputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcaa
implements zzcaf {
    public static final /* synthetic */ int zzb;
    private static final List zzc;
    boolean zza;
    private final zzhgn zzd;
    private final LinkedHashMap zze;
    private final List zzf;
    private final List zzg;
    private final Context zzh;
    private final zzcac zzi;
    private final Object zzj;
    private HashSet zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzcab zzn;

    static {
        ArrayList arrayList = new ArrayList();
        zzc = Collections.synchronizedList(arrayList);
    }

    public zzcaa(Context object, VersionInfoParcel object2, zzcac object3, String object4, zzcab object5) {
        long l2;
        long l3;
        long l4;
        long l7;
        boolean bl2;
        Object object6 = new ArrayList();
        this.zzf = object6;
        object6 = new ArrayList();
        this.zzg = object6;
        object6 = new Object();
        this.zzj = object6;
        this.zzk = object6 = new HashSet();
        this.zzl = false;
        this.zzm = false;
        Preconditions.checkNotNull(object3, "SafeBrowsing config is not present.");
        object6 = object.getApplicationContext();
        if (object6 != null) {
            object = object.getApplicationContext();
        }
        this.zzh = object;
        this.zze = object;
        this.zzn = object5;
        this.zzi = object3;
        object = ((zzcac)object3).zze.iterator();
        while (bl2 = object.hasNext()) {
            object3 = (String)object.next();
            object5 = this.zzk;
            object6 = Locale.ENGLISH;
            object3 = ((String)object3).toLowerCase((Locale)object6);
            ((HashSet)object5).add(object3);
        }
        object = this.zzk;
        object5 = Locale.ENGLISH;
        object3 = "cookie".toLowerCase((Locale)object5);
        ((HashSet)object).remove(object3);
        object = zzhjh.zzc();
        object3 = zzhim.zzi;
        ((zzhgn)object).zzj((zzhim)object3);
        ((zzhgn)object).zzk((String)object4);
        ((zzhgn)object).zzh((String)object4);
        object3 = zzhgp.zzc();
        object4 = this.zzi.zza;
        if (object4 != null) {
            ((zzhgo)object3).zza((String)object4);
        }
        object3 = (zzhgp)((zzhbi)object3).zzbn();
        ((zzhgn)object).zzg((zzhgp)object3);
        object3 = zzhit.zzc();
        object4 = Wrappers.packageManager(this.zzh);
        boolean bl3 = ((PackageManagerWrapper)object4).isCallerInstantApp();
        ((zzhis)object3).zzc(bl3);
        object2 = ((VersionInfoParcel)object2).afmaVersion;
        if (object2 != null) {
            ((zzhis)object3).zza((String)object2);
        }
        if ((l7 = (l4 = (l3 = (long)((GoogleApiAvailabilityLight)(object2 = GoogleApiAvailabilityLight.getInstance())).getApkVersion((Context)(object4 = this.zzh))) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            ((zzhis)object3).zzb(l3);
        }
        object2 = (zzhit)((zzhbi)object3).zzbn();
        ((zzhgn)object).zzf((zzhit)object2);
        this.zzd = object;
    }

    public static /* bridge */ /* synthetic */ List zzc() {
        return zzc;
    }

    public final zzcac zza() {
        return this.zzi;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ ListenableFuture zzb(Map var1_1) {
        block32: {
            block37: {
                block38: {
                    block36: {
                        block31: {
                            var2_5 = 1;
                            if (var1_1 == null) break block31;
                            try {
                                var3_6 = var1_1.keySet();
                                var3_6 = var3_6.iterator();
lbl6:
                                // 4 sources

                                while (var4_7 = var3_6.hasNext()) {
                                    var5_8 = var3_6.next();
                                    var5_8 = (String)var5_8;
                                    var6_9 = var1_1.get(var5_8);
                                    var6_9 = (String)var6_9;
                                    var7_10 = new JSONObject(var6_9);
                                    var6_9 = "matches";
                                    if ((var6_9 = var7_10.optJSONArray(var6_9)) == null) continue;
                                    var7_10 = this.zzj;
                                    synchronized (var7_10) {
                                        ** break block30
                                    }
                                }
                                break block31;
                            }
                            catch (JSONException var1_3) {
                                break block32;
                            }
lbl-1000:
                            // 1 sources

                            {
                                block33: {
                                    block35: {
                                        try {
                                            var8_11 = var6_9.length();
                                            var9_12 = this.zzj;
                                            synchronized (var9_12) {
                                                var10_13 = this.zze;
                                                var10_13 = var10_13.get(var5_8);
                                            }
                                        }
                                        catch (Throwable var1_2) {
                                            break block33;
                                        }
                                        {
                                            var10_13 = (zzhiq)var10_13;
                                            if (var10_13 != null) break block35;
                                        }
                                        var6_9 = new StringBuilder();
                                        var11_14 = "Cannot find the corresponding resource object for ";
                                        var6_9.append((String)var11_14);
                                        var6_9.append((String)var5_8);
                                        var5_8 = var6_9.toString();
                                        zzcae.zza(var5_8);
                                        ** GOTO lbl6
                                    }
                                    var4_7 = false;
                                    var5_8 = null;
                                    var9_12 = null;
                                    for (var12_15 = 0; var12_15 < var8_11; var13_16 /* !! */  = var13_16 /* !! */ .getString(var14_17), ++var12_15) {
                                        var13_16 /* !! */  = var6_9.getJSONObject(var12_15);
                                        var14_17 = "threat_type";
                                        var10_13.zza((String)var13_16 /* !! */ );
                                    }
                                    var15_18 = this.zza;
                                    if (var8_11 > 0) {
                                        var4_7 = true;
                                    }
                                    this.zza = var4_7 |= var15_18;
                                    ** GOTO lbl6
                                }
                                throw var1_2;
                            }
                        }
                        var16_22 = this.zza;
                        if (var16_22) {
                            var1_1 = this.zzj;
                            synchronized (var1_1) {
                                var3_6 = this.zzd;
                                var5_8 = zzhim.zzj;
                                var3_6.zzj((zzhim)var5_8);
                            }
                        }
                        var16_22 = this.zza;
                        var18_23 = false;
                        var3_6 = null;
                        if (!var16_22) break block36;
                        var5_8 = this.zzi;
                        var4_7 = var5_8.zzg;
                        if (var4_7) break block37;
                    }
                    if (!(var4_7 = this.zzm)) break block38;
                    var5_8 = this.zzi;
                    var4_7 = var5_8.zzf;
                    if (var4_7) break block37;
                }
                if (var16_22 != false) return zzgft.zzh(null);
                var1_1 = this.zzi;
                var16_22 = var1_1.zzd;
                if (var16_22 == false) return zzgft.zzh(null);
            }
            var1_1 = this.zzj;
            synchronized (var1_1) {
                try {
                    var5_8 = this.zze;
                    var5_8 = var5_8.values();
                    var5_8 = var5_8.iterator();
                    while (var15_18 = var5_8.hasNext()) {
                        var6_9 = var5_8.next();
                        var6_9 = (zzhiq)var6_9;
                        var7_10 = this.zzd;
                        var6_9 = var6_9.zzbn();
                        var6_9 = (zzhir)var6_9;
                        var7_10.zzc((zzhir)var6_9);
                    }
                }
                catch (Throwable var17_19) {
                    ** break block34
                }
                var5_8 = this.zzd;
                var6_9 = this.zzf;
                var5_8.zza((Iterable)var6_9);
                var5_8 = this.zzd;
                var6_9 = this.zzg;
                var5_8.zzb((Iterable)var6_9);
                var4_7 = zzcae.zzb();
                if (var4_7) {
                    var6_9 = this.zzd;
                    var6_9 = var6_9.zzm();
                    var7_10 = this.zzd;
                    var7_10 = var7_10.zzl();
                    var11_14 = new StringBuilder();
                    var9_12 = "Sending SB report\n  url: ";
                    var11_14.append((String)var9_12);
                    var11_14.append((String)var6_9);
                    var6_9 = "\n  clickUrl: ";
                    var11_14.append((String)var6_9);
                    var11_14.append((String)var7_10);
                    var6_9 = "\n  resources: \n";
                    var11_14.append((String)var6_9);
                    var6_9 = var11_14.toString();
                    var5_8 = new StringBuilder((String)var6_9);
                    var6_9 = this.zzd;
                    var6_9 = var6_9.zzn();
                    var6_9 = var6_9.iterator();
                    while (var19_24 = var6_9.hasNext()) {
                        var7_10 = var6_9.next();
                        var7_10 = (zzhir)var7_10;
                        var11_14 = "    [";
                        var5_8.append((String)var11_14);
                        var8_11 = var7_10.zzc();
                        var5_8.append(var8_11);
                        var11_14 = "] ";
                        var5_8.append((String)var11_14);
                        var7_10 = var7_10.zzg();
                        var5_8.append((String)var7_10);
                    }
                    var5_8 = var5_8.toString();
                    zzcae.zza((String)var5_8);
                }
                var5_8 = this.zzd;
                var5_8 = var5_8.zzbn();
                var5_8 = (zzhjh)var5_8;
                var5_8 = var5_8.zzaV();
                var6_9 = this.zzi;
                var6_9 = var6_9.zzb;
                var11_14 = this.zzh;
                var7_10 = new zzbq((Context)var11_14);
                var17_20 = var7_10.zzb(var2_5, (String)var6_9, null, (byte[])var5_8);
                var18_23 = zzcae.zzb();
                if (var18_23) {
                    var3_6 = new zzbzx();
                    var5_8 = zzcci.zza;
                    var17_20.addListener((Runnable)var3_6, (Executor)var5_8);
                }
                var3_6 = new zzbzy();
                var5_8 = zzcci.zzf;
                return zzgft.zzm(var17_20, (zzfxu)var3_6, var5_8);
lbl-1000:
                // 1 sources

                {
                    throw var17_19;
                }
            }
        }
        var17_21 = (Boolean)zzbgs.zzb.zze();
        var2_5 = var17_21.booleanValue();
        if (var2_5 != 0) {
            var17_21 = "Failed to get SafeBrowsing metadata";
            com.google.android.gms.ads.internal.util.client.zzm.zzf((String)var17_21, var1_3);
        }
        var1_4 = new Exception("Safebrowsing report transmission failed.");
        return zzgft.zzg(var1_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String object, Map object2, int n3) {
        Object object3 = this.zzj;
        synchronized (object3) {
            Object object4;
            zzhiq zzhiq2;
            block13: {
                Object object5;
                boolean bl2;
                block14: {
                    Throwable throwable2;
                    block12: {
                        int n4 = 3;
                        if (n3 == n4) {
                            bl2 = true;
                            try {
                                this.zzm = bl2;
                            }
                            catch (Throwable throwable2) {
                                break block12;
                            }
                        }
                        if (bl2 = ((AbstractMap)(object5 = this.zze)).containsKey(object)) {
                            if (n3 == n4 && (object2 = zzhip.zzd) != null) {
                                LinkedHashMap linkedHashMap = this.zze;
                                object = linkedHashMap.get(object);
                                object = (zzhiq)object;
                                ((zzhiq)object).zzb((zzhip)object2);
                            }
                            return;
                        }
                        zzhiq2 = zzhir.zze();
                        object4 = zzhip.zzb(n3);
                        if (object4 != null) {
                            zzhiq2.zzb((zzhip)object4);
                        }
                        object4 = this.zze;
                        n3 = ((AbstractMap)object4).size();
                        zzhiq2.zzc(n3);
                        zzhiq2.zze((String)object);
                        object4 = zzhhh.zzc();
                        object5 = this.zzk;
                        bl2 = ((HashSet)object5).isEmpty();
                        if (bl2 || object2 == null) break block13;
                        object2 = object2.entrySet();
                        object2 = object2.iterator();
                        break block14;
                    }
                    throw throwable2;
                }
                while (bl2 = object2.hasNext()) {
                    object5 = object2.next();
                    Object object6 = (object5 = (Map.Entry)object5).getKey();
                    if (object6 != null) {
                        object6 = object5.getKey();
                        object6 = (String)object6;
                    } else {
                        object6 = "";
                    }
                    Object object7 = object5.getValue();
                    if (object7 != null) {
                        object5 = object5.getValue();
                        object5 = (String)object5;
                    } else {
                        object5 = "";
                    }
                    object7 = Locale.ENGLISH;
                    HashSet hashSet = this.zzk;
                    boolean bl3 = hashSet.contains(object7 = ((String)object6).toLowerCase((Locale)object7));
                    if (!bl3) continue;
                    object7 = zzhhd.zzc();
                    object6 = zzhac.zzw((String)object6);
                    ((zzhhc)object7).zza((zzhac)object6);
                    object5 = zzhac.zzw((String)object5);
                    ((zzhhc)object7).zzb((zzhac)object5);
                    object5 = ((zzhbi)object7).zzbn();
                    object5 = (zzhhd)object5;
                    ((zzhhe)object4).zza((zzhhd)object5);
                }
            }
            object2 = ((zzhbi)object4).zzbn();
            object2 = (zzhhh)object2;
            zzhiq2.zzd((zzhhh)object2);
            object2 = this.zze;
            ((AbstractMap)object2).put(object, zzhiq2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        Object object = this.zzj;
        synchronized (object) {
            Object object2 = this.zze;
            ((LinkedHashMap)object2).keySet();
            object2 = Collections.emptyMap();
            object2 = zzgft.zzh(object2);
            Object object3 = new zzbzv(this);
            zzgge zzgge2 = zzcci.zzf;
            object2 = zzgft.zzn((ListenableFuture)object2, object3, zzgge2);
            object3 = TimeUnit.SECONDS;
            Object object4 = zzcci.zzd;
            long l2 = 10;
            object3 = zzgft.zzo((ListenableFuture)object2, l2, (TimeUnit)((Object)object3), (ScheduledExecutorService)object4);
            object4 = new zzbzz(this, (ListenableFuture)object3);
            zzgft.zzr((ListenableFuture)object2, (zzgfp)object4, zzgge2);
            object2 = zzc;
            object2.add(object3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzf(Bitmap object) {
        Object object2 = zzhac.zzt();
        Object object3 = Bitmap.CompressFormat.PNG;
        zzhif zzhif2 = null;
        object.compress((Bitmap.CompressFormat)object3, 0, (OutputStream)object2);
        object = this.zzj;
        synchronized (object) {
            object3 = this.zzd;
            zzhif2 = zzhij.zzc();
            object2 = ((zzgzz)object2).zzb();
            zzhif2.zza((zzhac)object2);
            object2 = "image/png";
            zzhif2.zzb((String)object2);
            object2 = zzhii.zzb;
            zzhif2.zzc((zzhii)object2);
            object2 = zzhif2.zzbn();
            object2 = (zzhij)object2;
            ((zzhgn)object3).zzi((zzhij)object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(View object) {
        Object object2;
        boolean bl2;
        Object object3;
        block15: {
            Bitmap bitmap;
            block17: {
                RuntimeException runtimeException4;
                String string2;
                block16: {
                    block14: {
                        String string3;
                        int n3;
                        int n4;
                        block12: {
                            block13: {
                                block11: {
                                    block10: {
                                        block9: {
                                            object3 = this.zzi;
                                            bl2 = ((zzcac)object3).zzc;
                                            if (!bl2) {
                                                return;
                                            }
                                            bl2 = this.zzl;
                                            if (bl2) return;
                                            zzu.zzp();
                                            bl2 = true;
                                            object2 = null;
                                            if (object == null) break block15;
                                            try {
                                                n4 = object.isDrawingCacheEnabled();
                                                object.setDrawingCacheEnabled(bl2);
                                                bitmap = object.getDrawingCache();
                                                if (bitmap == null) break block9;
                                                bitmap = Bitmap.createBitmap((Bitmap)bitmap);
                                                break block10;
                                            }
                                            catch (RuntimeException runtimeException2) {
                                                break block11;
                                            }
                                        }
                                        n3 = 0;
                                        bitmap = null;
                                    }
                                    try {
                                        object.setDrawingCacheEnabled(n4 != 0);
                                        break block12;
                                    }
                                    catch (RuntimeException runtimeException3) {
                                        break block13;
                                    }
                                }
                                n3 = 0;
                                bitmap = null;
                            }
                            string3 = "Fail to capture the web view";
                            com.google.android.gms.ads.internal.util.client.zzm.zzh(string3, (Throwable)((Object)string2));
                        }
                        if (bitmap != null) break block17;
                        try {
                            n4 = object.getWidth();
                            n3 = object.getHeight();
                            if (n4 == 0 || n3 == 0) break block14;
                            int n7 = object.getWidth();
                            int n8 = object.getHeight();
                            Bitmap.Config config = Bitmap.Config.RGB_565;
                            string3 = Bitmap.createBitmap((int)n7, (int)n8, (Bitmap.Config)config);
                            Canvas canvas = new Canvas((Bitmap)string3);
                            config = null;
                            object.layout(0, 0, n4, n3);
                            object.draw(canvas);
                            object2 = string3;
                            break block15;
                        }
                        catch (RuntimeException runtimeException4) {
                            break block16;
                        }
                    }
                    object = "Width or height of view is zero";
                    com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object);
                    break block15;
                }
                string2 = "Fail to capture the webview";
                com.google.android.gms.ads.internal.util.client.zzm.zzh(string2, runtimeException4);
                break block15;
            }
            object2 = bitmap;
        }
        if (object2 == null) {
            zzcae.zza("Failed to capture the webview bitmap.");
            return;
        }
        this.zzl = bl2;
        object = new zzbzw(this, (Bitmap)object2);
        object3 = Looper.getMainLooper().getThread();
        if (object3 != (object2 = Thread.currentThread())) {
            object.run();
            return;
        }
        object3 = zzcci.zza;
        object3.execute((Runnable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(String object) {
        Object object2 = this.zzj;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    if (object == null) {
                        try {
                            object = this.zzd;
                            ((zzhgn)object).zzd();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    zzhgn zzhgn2 = this.zzd;
                    zzhgn2.zze((String)object);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final boolean zzi() {
        boolean bl2 = PlatformVersion.isAtLeastKitKat();
        if (bl2) {
            zzcac zzcac2 = this.zzi;
            bl2 = zzcac2.zzc;
            if (bl2 && !(bl2 = this.zzl)) {
                return true;
            }
        }
        return false;
    }
}

