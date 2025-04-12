/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzaf;
import com.google.android.gms.internal.gtm.zzah;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzrg;
import com.google.android.gms.internal.gtm.zzrk;
import com.google.android.gms.internal.gtm.zzrm;
import com.google.android.gms.internal.gtm.zzz;
import com.google.android.gms.tagmanager.Container$FunctionCallMacroCallback;
import com.google.android.gms.tagmanager.Container$FunctionCallTagCallback;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.zzdg;
import com.google.android.gms.tagmanager.zzdn;
import com.google.android.gms.tagmanager.zzep;
import com.google.android.gms.tagmanager.zzfp;
import com.google.android.gms.tagmanager.zzs;
import com.google.android.gms.tagmanager.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Container {
    private final Context zza;
    private final String zzb;
    private final DataLayer zzc;
    private zzep zzd;
    private Map zze;
    private Map zzf;
    private volatile long zzg;
    private volatile String zzh;

    public Container(Context object, DataLayer dataLayer, String object2, long l2, zzah object32) {
        Object object4 = new HashMap();
        this.zze = object4;
        object4 = new HashMap();
        this.zzf = object4;
        this.zzh = object4 = "";
        this.zza = object;
        this.zzc = dataLayer;
        this.zzb = object2;
        this.zzg = l2;
        object = ((zzah)object32).zzc();
        object.getClass();
        try {
            object = zzrm.zzb((zzz)object);
            this.zzg((zzrg)object);
        }
        catch (zzrk zzrk2) {
            ((zzacf)object).toString();
            ((Object)zzrk2).toString();
        }
        int n3 = ((zzah)object32).zza();
        if (n3 != 0) {
            object = ((zzah)object32).zzi();
            dataLayer = null;
            object2 = new zzaf[]{};
            object = object.toArray((T[])object2);
            object2 = this.zzf();
            if (object2 == null) {
                return;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (Object object32 : object) {
                arrayList.add(object32);
            }
            ((zzep)object2).zze(arrayList);
        }
    }

    public Container(Context context, DataLayer dataLayer, String string2, long l2, zzrg zzrg2) {
        HashMap hashMap;
        this.zze = hashMap = new HashMap();
        this.zzf = hashMap = new HashMap();
        this.zzh = "";
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = string2;
        this.zzg = 0L;
        this.zzg(zzrg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzep zzf() {
        synchronized (this) {
            return this.zzd;
        }
    }

    private final void zzg(zzrg object) {
        Object object2;
        Object object3 = ((zzrg)object).zzb();
        this.zzh = object3;
        zzdg zzdg2 = new zzdg();
        Object object4 = object2 = Preconditions.checkNotNull(this.zza);
        object4 = (Context)object2;
        Object[] objectArray = object2 = Preconditions.checkNotNull(this.zzc);
        objectArray = (DataLayer)object2;
        int n3 = 0;
        zzs zzs2 = new zzs(this, null);
        zzt zzt2 = new zzt(this, null);
        object2 = object3;
        object3 = new zzep((Context)object4, (zzrg)object, (DataLayer)objectArray, zzs2, zzt2, zzdg2);
        this.zzh((zzep)object3);
        object = "_gtm.loadEventEnabled";
        boolean bl2 = this.getBoolean((String)object);
        if (bl2) {
            object = this.zzc;
            object3 = Preconditions.checkNotNull(this.zzb);
            n3 = 2;
            object2 = new Object[n3];
            object2[0] = object4 = "gtm.id";
            int n4 = 1;
            object2[n4] = object3;
            object3 = DataLayer.mapOf(object2);
            object2 = "gtm.load";
            ((DataLayer)object).pushEvent((String)object2, (Map)object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzh(zzep zzep2) {
        synchronized (this) {
            this.zzd = zzep2;
            return;
        }
    }

    public boolean getBoolean(String object) {
        zzep zzep2 = this.zzf();
        if (zzep2 == null) {
            zzfp.zze().getClass();
            return false;
        }
        try {
            object = zzep2.zza((String)object);
        }
        catch (Exception exception) {
            exception.getMessage();
            zzfp.zze().getClass();
            return false;
        }
        object = ((zzdn)object).zza();
        object = (zzap)object;
        object = zzfp.zzk((zzap)object);
        object = zzfp.zzf(object);
        return (Boolean)object;
    }

    public String getContainerId() {
        return this.zzb;
    }

    public double getDouble(String object) {
        zzep zzep2 = this.zzf();
        if (zzep2 == null) {
            return zzfp.zzg();
        }
        try {
            object = zzep2.zza((String)object);
        }
        catch (Exception exception) {
            exception.getMessage();
            return zzfp.zzg();
        }
        object = ((zzdn)object).zza();
        object = (zzap)object;
        object = zzfp.zzk((zzap)object);
        object = zzfp.zzh(object);
        return (Double)object;
    }

    public long getLastRefreshTime() {
        return this.zzg;
    }

    public long getLong(String object) {
        zzep zzep2 = this.zzf();
        long l2 = 0L;
        if (zzep2 == null) {
            zzfp.zzi().getClass();
            return l2;
        }
        try {
            object = zzep2.zza((String)object);
        }
        catch (Exception exception) {
            exception.getMessage();
            zzfp.zzi().getClass();
            return l2;
        }
        object = ((zzdn)object).zza();
        object = (zzap)object;
        object = zzfp.zzk((zzap)object);
        object = zzfp.zzj(object);
        return (Long)object;
    }

    public String getString(String object) {
        zzep zzep2 = this.zzf();
        if (zzep2 == null) {
            return zzfp.zzl();
        }
        try {
            object = zzep2.zza((String)object);
        }
        catch (Exception exception) {
            exception.getMessage();
            return zzfp.zzl();
        }
        object = ((zzdn)object).zza();
        object = (zzap)object;
        object = zzfp.zzk((zzap)object);
        return zzfp.zzm(object);
    }

    public boolean isDefault() {
        long l2;
        long l3 = this.getLastRefreshTime();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object == false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerFunctionCallMacroCallback(String object, Container$FunctionCallMacroCallback container$FunctionCallMacroCallback) {
        if (container$FunctionCallMacroCallback != null) {
            Map map2 = this.zze;
            synchronized (map2) {
                Map map3 = this.zze;
                map3.put(object, container$FunctionCallMacroCallback);
                return;
            }
        }
        object = new NullPointerException("Macro handler must be non-null");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerFunctionCallTagCallback(String object, Container$FunctionCallTagCallback container$FunctionCallTagCallback) {
        if (container$FunctionCallTagCallback != null) {
            Map map2 = this.zzf;
            synchronized (map2) {
                Map map3 = this.zzf;
                map3.put(object, container$FunctionCallTagCallback);
                return;
            }
        }
        object = new NullPointerException("Tag callback must be non-null");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterFunctionCallMacroCallback(String string2) {
        Map map2 = this.zze;
        synchronized (map2) {
            Map map3 = this.zze;
            map3.remove(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterFunctionCallTagCallback(String string2) {
        Map map2 = this.zzf;
        synchronized (map2) {
            Map map3 = this.zzf;
            map3.remove(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Container$FunctionCallMacroCallback zza(String object) {
        Map map2 = this.zze;
        synchronized (map2) {
            Map map3 = this.zze;
            object = map3.get(object);
            return (Container$FunctionCallMacroCallback)object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Container$FunctionCallTagCallback zzb(String object) {
        Map map2 = this.zzf;
        synchronized (map2) {
            Map map3 = this.zzf;
            object = map3.get(object);
            return (Container$FunctionCallTagCallback)object;
        }
    }

    public final String zzc() {
        return this.zzh;
    }

    public final void zzd(String string2) {
        zzep zzep2 = this.zzf();
        if (zzep2 == null) {
            return;
        }
        zzep2.zzc(string2);
    }

    public final void zze() {
        this.zzd = null;
    }
}

