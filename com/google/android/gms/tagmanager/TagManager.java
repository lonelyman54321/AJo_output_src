/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.zzag;
import com.google.android.gms.tagmanager.zzak;
import com.google.android.gms.tagmanager.zzaq;
import com.google.android.gms.tagmanager.zzas;
import com.google.android.gms.tagmanager.zzaz;
import com.google.android.gms.tagmanager.zzd;
import com.google.android.gms.tagmanager.zzdc;
import com.google.android.gms.tagmanager.zzdv;
import com.google.android.gms.tagmanager.zzet;
import com.google.android.gms.tagmanager.zzfa;
import com.google.android.gms.tagmanager.zzfg;
import com.google.android.gms.tagmanager.zzfh;
import com.google.android.gms.tagmanager.zzfi;
import com.google.android.gms.tagmanager.zzfj;
import com.google.android.gms.tagmanager.zzg;
import com.google.android.gms.tagmanager.zzx;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager {
    private static TagManager zza;
    private final Context zzb;
    private final DataLayer zzc;
    private final zzet zzd;
    private final ConcurrentMap zze;
    private final zzak zzf;

    public TagManager(Context context, zzfj object, DataLayer dataLayer, zzet zzet2) {
        this.zzb = context = context.getApplicationContext();
        this.zzd = zzet2;
        object = new ConcurrentHashMap();
        this.zze = object;
        this.zzc = dataLayer;
        object = new zzfg(this);
        dataLayer.zzg((zzaq)object);
        object = new zzg(context);
        dataLayer.zzg((zzaq)object);
        this.zzf = object = new zzak();
        Preconditions.checkNotNull(context);
        object = new zzfi(this);
        context.registerComponentCallbacks((ComponentCallbacks)object);
        Preconditions.checkNotNull(context);
        com.google.android.gms.tagmanager.zzd.zzb(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static TagManager getInstance(Context object) {
        Class<TagManager> clazz = TagManager.class;
        synchronized (clazz) {
            try {
                TagManager tagManager;
                Object object2 = zza;
                if (object2 != null) return zza;
                if (object == null) {
                    object = null;
                    throw null;
                }
                object2 = new zzfh();
                Object object3 = new zzaz((Context)object);
                DataLayer dataLayer = new DataLayer((zzas)object3);
                object3 = zzfa.zzg();
                zza = tagManager = new TagManager((Context)object, (zzfj)object2, dataLayer, (zzet)object3);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ void zzb(TagManager object, String string2) {
        boolean bl2;
        Object object2 = ((TagManager)object).zze;
        Preconditions.checkNotNull(object2);
        object = ((TagManager)object).zze.values().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zzx)object.next();
            ((zzx)object2).zzd(string2);
        }
    }

    public void dispatch() {
        this.zzd.zza();
    }

    public DataLayer getDataLayer() {
        return this.zzc;
    }

    public PendingResult loadContainerDefaultOnly(String string2, int n3) {
        Context context = this.zzb;
        zzak zzak2 = this.zzf;
        zzag zzag2 = new zzag(context, this, null, string2, n3, zzak2);
        zzag2.zzl();
        return zzag2;
    }

    public PendingResult loadContainerDefaultOnly(String string2, int n3, Handler object) {
        Looper looper = object.getLooper();
        Context context = this.zzb;
        zzak zzak2 = this.zzf;
        object = new zzag(context, this, looper, string2, n3, zzak2);
        ((zzag)object).zzl();
        return object;
    }

    public PendingResult loadContainerPreferFresh(String string2, int n3) {
        Context context = this.zzb;
        zzak zzak2 = this.zzf;
        zzag zzag2 = new zzag(context, this, null, string2, n3, zzak2);
        zzag2.zzm();
        return zzag2;
    }

    public PendingResult loadContainerPreferFresh(String string2, int n3, Handler object) {
        Looper looper = object.getLooper();
        Context context = this.zzb;
        zzak zzak2 = this.zzf;
        object = new zzag(context, this, looper, string2, n3, zzak2);
        ((zzag)object).zzm();
        return object;
    }

    public PendingResult loadContainerPreferNonDefault(String string2, int n3) {
        Context context = this.zzb;
        zzak zzak2 = this.zzf;
        zzag zzag2 = new zzag(context, this, null, string2, n3, zzak2);
        zzag2.zzn();
        return zzag2;
    }

    public PendingResult loadContainerPreferNonDefault(String string2, int n3, Handler object) {
        Looper looper = object.getLooper();
        Context context = this.zzb;
        zzak zzak2 = this.zzf;
        object = new zzag(context, this, looper, string2, n3, zzak2);
        ((zzag)object).zzn();
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public void setVerboseLoggingEnabled(boolean bl2) {
        void var1_4;
        boolean bl3 = true;
        if (bl3 != bl2) {
            int n3 = 5;
        } else {
            int n4 = 2;
        }
        zzdc.zza = var1_4;
        zzdc.zzb.zzc((int)var1_4);
    }

    public final int zza(zzx zzx2) {
        ConcurrentMap concurrentMap = this.zze;
        String string2 = zzx2.zza();
        concurrentMap.put(string2, zzx2);
        return this.zze.size();
    }

    public final boolean zzc(zzx object) {
        ConcurrentMap concurrentMap = this.zze;
        object = ((zzx)object).zza();
        return (object = concurrentMap.remove(object)) != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd(Uri object) {
        synchronized (this) {
            int n3;
            block8: {
                Throwable throwable2;
                Iterator iterator;
                int n4;
                Object object2;
                block9: {
                    block7: {
                        try {
                            object2 = zzdv.zza();
                            boolean bl2 = ((zzdv)object2).zzd((Uri)object);
                            if (!bl2) {
                                return false;
                            }
                            object = ((zzdv)object2).zzc();
                            n3 = ((zzdv)object2).zze();
                            int n7 = n3 + -1;
                            if (n3 == 0) {
                                throw null;
                            }
                            n3 = 1;
                            if (n7 == 0) break block7;
                            if (n7 != n3 && n7 != (n4 = 2)) break block8;
                            iterator = this.zze;
                            iterator = iterator.keySet();
                            iterator = iterator.iterator();
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    object2 = this.zze;
                    object = object2.get(object);
                    if ((object = (zzx)object) == null) break block8;
                    ((zzx)object).zze(null);
                    ((zzx)object).refresh();
                    break block8;
                }
                throw throwable2;
                while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    Object object3 = iterator.next();
                    object3 = (String)object3;
                    Object object4 = this.zze;
                    object4 = object4.get(object3);
                    object4 = (zzx)object4;
                    n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                    if (n4 != 0) {
                        object3 = ((zzdv)object2).zzb();
                        ((zzx)object4).zze((String)object3);
                        ((zzx)object4).refresh();
                        continue;
                    }
                    object3 = ((zzx)object4).zzb();
                    if (object3 == null) continue;
                    ((zzx)object4).zze(null);
                    ((zzx)object4).refresh();
                }
            }
            return n3 != 0;
        }
    }
}

