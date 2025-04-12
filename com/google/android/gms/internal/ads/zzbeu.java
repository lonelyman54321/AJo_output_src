/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Environment
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzftv;
import com.google.android.gms.internal.ads.zzftw;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbeu {
    final BlockingQueue zza;
    final LinkedHashMap zzb;
    final Map zzc;
    String zzd;
    Context zze;
    String zzf;
    private final HashSet zzg;
    private AtomicBoolean zzh;
    private File zzi;

    public zzbeu() {
        Serializable serializable;
        this.zza = serializable = new Serializable(100);
        this.zzb = serializable;
        super();
        this.zzc = serializable;
        List<String> list = Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged");
        super(list);
        this.zzg = serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzc(zzbeu zzbeu2) {
        while (true) {
            Object object;
            try {
                object = zzbeu2.zza;
                object = object.take();
            }
            catch (InterruptedException interruptedException) {
                zzm.zzk("CsiReporter:reporter interrupted", interruptedException);
                return;
            }
            zzbfd zzbfd2 = ((zzbfe)(object = (zzbfe)object)).zza();
            Object object2 = zzbfd2.zzb();
            boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (bl2) continue;
            object2 = zzbeu2.zzb;
            object = ((zzbfe)object).zzb();
            object = zzbeu2.zzb((Map)object2, (Map)object);
            zzbeu2.zzg((Map)object, zzbfd2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzg(Map object, zzbfd object2) {
        void var1_8;
        Object object3;
        String string2;
        block19: {
            block20: {
                Object object4;
                block22: {
                    block21: {
                        boolean bl2;
                        int n3;
                        boolean bl3;
                        string2 = "CsiReporter: Cannot close file: sdk_csi_data.txt.";
                        object3 = Uri.parse((String)this.zzd).buildUpon();
                        object = object.entrySet().iterator();
                        while (bl3 = object.hasNext()) {
                            object4 = (Map.Entry)object.next();
                            String string3 = (String)object4.getKey();
                            object4 = (String)object4.getValue();
                            object3.appendQueryParameter(string3, (String)object4);
                        }
                        object = object3.build().toString();
                        if (object2 != null) {
                            object3 = new StringBuilder((String)object);
                            object = ((zzbfd)object2).zzb();
                            n3 = TextUtils.isEmpty((CharSequence)object);
                            if (n3 == 0) {
                                ((StringBuilder)object3).append("&it=");
                                object = ((zzbfd)object2).zzb();
                                ((StringBuilder)object3).append((String)object);
                            }
                            if ((n3 = TextUtils.isEmpty((CharSequence)(object = ((zzbfd)object2).zza()))) == 0) {
                                ((StringBuilder)object3).append("&blat=");
                                object = ((zzbfd)object2).zza();
                                ((StringBuilder)object3).append((String)object);
                            }
                            object = ((StringBuilder)object3).toString();
                        }
                        if (!(bl2 = ((AtomicBoolean)(object2 = this.zzh)).get())) {
                            zzu.zzp();
                            object2 = this.zze;
                            string2 = this.zzf;
                            zzt.zzL((Context)object2, string2, (String)object);
                            return;
                        }
                        object2 = this.zzi;
                        if (object2 == null) {
                            zzm.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                            return;
                        }
                        object3 = null;
                        try {
                            boolean bl4 = true;
                            object4 = new FileOutputStream((File)object2, bl4);
                        }
                        catch (Throwable throwable) {
                            break block19;
                        }
                        catch (IOException iOException) {
                            // empty catch block
                            break block20;
                        }
                        try {
                            object = ((String)object).getBytes();
                            ((FileOutputStream)object4).write((byte[])object);
                            n3 = 10;
                            ((FileOutputStream)object4).write(n3);
                        }
                        catch (Throwable throwable) {
                            break block21;
                        }
                        catch (IOException iOException) {
                            break block22;
                        }
                        try {
                            ((FileOutputStream)object4).close();
                            return;
                        }
                        catch (IOException iOException) {
                            zzm.zzk(string2, iOException);
                            return;
                        }
                    }
                    object3 = object4;
                    break block19;
                }
                object3 = object4;
            }
            object2 = "CsiReporter: Cannot write to file: sdk_csi_data.txt.";
            {
                zzm.zzk((String)object2, (Throwable)object);
                if (object3 == null) return;
            }
            try {
                ((FileOutputStream)object3).close();
                return;
            }
            catch (IOException iOException) {
                zzm.zzk(string2, iOException);
            }
            return;
        }
        if (object3 == null) throw var1_8;
        try {
            ((FileOutputStream)object3).close();
            throw var1_8;
        }
        catch (IOException iOException) {
            zzm.zzk(string2, iOException);
        }
        throw var1_8;
    }

    public final zzbfa zza(String object) {
        Map map2 = this.zzc;
        if ((object = (zzbfa)map2.get(object)) != null) {
            return object;
        }
        return zzbfa.zza;
    }

    public final Map zzb(Map object, Map object2) {
        boolean bl2;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>((Map<String, Object>)object);
        object = object2.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            String string3 = (String)linkedHashMap.get(string2);
            zzbfa zzbfa2 = this.zza(string2);
            object2 = zzbfa2.zza(string3, (String)object2);
            linkedHashMap.put(string2, object2);
        }
        return linkedHashMap;
    }

    public final void zzd(Context object, String object2, String object3, Map object4) {
        this.zze = object;
        this.zzf = object2;
        this.zzd = object3;
        object = new AtomicBoolean(false);
        this.zzh = object;
        object2 = (Boolean)zzbgf.zzc.zze();
        boolean bl2 = (Boolean)object2;
        ((AtomicBoolean)object).set(bl2);
        object = this.zzh;
        boolean bl3 = ((AtomicBoolean)object).get();
        if (bl3 && (object = Environment.getExternalStorageDirectory()) != null) {
            object3 = zzftu.zza();
            String string2 = "sdk_csi_data.txt";
            object = zzftv.zza((zzftw)object3, (File)object, string2);
            this.zzi = object2 = new File((String)object);
        }
        object = object4.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            object3 = this.zzb;
            object4 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            ((AbstractMap)object3).put(object4, object2);
        }
        object = zzcci.zza;
        object2 = new zzbet(this);
        object.execute((Runnable)object2);
        object = this.zzc;
        object2 = zzbfa.zzb;
        object.put("action", object2);
        this.zzc.put("ad_format", object2);
        object = this.zzc;
        object3 = zzbfa.zzc;
        object.put("e", object3);
    }

    public final void zze(String object) {
        Cloneable cloneable = this.zzg;
        boolean bl2 = ((HashSet)cloneable).contains(object);
        if (bl2) {
            return;
        }
        cloneable = new LinkedHashMap();
        String string2 = this.zzf;
        ((AbstractMap)((Object)cloneable)).put("sdkVersion", string2);
        ((AbstractMap)((Object)cloneable)).put("ue", object);
        object = this.zzb;
        object = this.zzb((Map)object, (Map)((Object)cloneable));
        this.zzg((Map)object, null);
    }

    public final boolean zzf(zzbfe zzbfe2) {
        return this.zza.offer(zzbfe2);
    }
}

