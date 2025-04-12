/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 *  android.util.Pair
 */
package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzf$zza;
import com.google.android.gms.internal.measurement.zzgf$zzh;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzok;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;

final class zzy {
    private zzgf$zzf zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzx zzd;

    private zzy(zzx zzx2) {
        this.zzd = zzx2;
    }

    public /* synthetic */ zzy(zzx zzx2, zzac zzac2) {
        this(zzx2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzgf$zzf zza(String object, zzgf$zzf zzgf$zzf) {
        long l2;
        Object object2;
        int n3;
        long l3;
        boolean bl2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        String string2;
        block13: {
            block15: {
                Object object7;
                long l4;
                block14: {
                    Object object8;
                    long l7;
                    long l8;
                    long l12;
                    string2 = zzgf$zzf.zzg();
                    object6 = zzgf$zzf.zzh();
                    this.zzd.h_();
                    object5 = "_eid";
                    object3 = object4 = zzpj.zzb(zzgf$zzf, (String)object5);
                    object3 = (Long)object4;
                    if (object3 != null) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    l3 = 0L;
                    if (!bl2 || (n3 = string2.equals(object2 = "_ep")) == 0) break block13;
                    Preconditions.checkNotNull(object3);
                    this.zzd.h_();
                    string2 = (String)zzpj.zzb(zzgf$zzf, "_en");
                    bl2 = TextUtils.isEmpty((CharSequence)string2);
                    n3 = 0;
                    object2 = null;
                    if (bl2) {
                        this.zzd.zzj().zzo().zza("Extra parameter without an event name. eventId", object3);
                        return null;
                    }
                    object4 = this.zza;
                    if (object4 != null && (object4 = this.zzb) != null && !(bl2 = (l12 = (l8 = ((Long)object3).longValue()) - (l7 = ((Long)(object4 = this.zzb)).longValue())) == 0L ? 0 : (l12 < 0L ? -1 : 1))) break block14;
                    object4 = this.zzd.zzh().zza((String)object, (Long)object3);
                    if (object4 == null || (object8 = ((Pair)object4).first) == null) break block15;
                    this.zza = object8 = (zzgf$zzf)object8;
                    this.zzc = l4 = ((Long)((Pair)object4).second).longValue();
                    this.zzd.h_();
                    object4 = this.zza;
                    this.zzb = object5 = (Long)zzpj.zzb((zzgf$zzf)object4, (String)object5);
                }
                long l14 = this.zzc;
                l4 = 1L;
                this.zzc = l14 -= l4;
                n3 = (int)(l14 == l3 ? 0 : (l14 < l3 ? -1 : 1));
                if (n3 <= 0) {
                    object5 = this.zzd.zzh();
                    ((zzjf)object5).zzv();
                    object4 = ((zzjf)object5).zzj().zzq();
                    object7 = "Clearing complex main event info. appId";
                    ((zzgq)object4).zza((String)object7, object);
                    try {
                        object4 = ((zzar)object5).f_();
                        object7 = "delete from main_event_params where app_id=?";
                        object = new String[]{object};
                        object4.execSQL((String)object7, (Object[])object);
                    }
                    catch (SQLiteException sQLiteException) {
                        object5 = ((zzjf)object5).zzj().zzg();
                        object4 = "Error clearing complex main event";
                        ((zzgq)object5).zza((String)object4, (Object)sQLiteException);
                    }
                } else {
                    object5 = this.zzd;
                    object7 = ((zzok)object5).zzh();
                    l4 = this.zzc;
                    zzgf$zzf zzgf$zzf2 = this.zza;
                    ((zzar)object7).zza((String)object, (Long)object3, l4, zzgf$zzf2);
                }
                object = new ArrayList();
                object5 = this.zza.zzh().iterator();
                while (bl2 = object5.hasNext()) {
                    object4 = (zzgf$zzh)object5.next();
                    this.zzd.h_();
                    object7 = ((zzgf$zzh)object4).zzg();
                    if ((object7 = zzpj.zza(zzgf$zzf, (String)object7)) != null) continue;
                    ((ArrayList)object).add(object4);
                }
                boolean bl3 = ((ArrayList)object).isEmpty();
                if (!bl3) {
                    ((ArrayList)object).addAll(object6);
                    object6 = object;
                    return (zzgf$zzf)((zzkg)((zzgf$zzf$zza)zzgf$zzf.zzch()).zza(string2).zzd().zza((Iterable)object6).zzaj());
                }
                object = this.zzd.zzj().zzo();
                object5 = "No unique parameters in main event. eventName";
                ((zzgq)object).zza((String)object5, string2);
                return (zzgf$zzf)((zzkg)((zzgf$zzf$zza)zzgf$zzf.zzch()).zza(string2).zzd().zza((Iterable)object6).zzaj());
            }
            this.zzd.zzj().zzo().zza("Extra parameter without existing main event. eventName, eventId", string2, object3);
            return null;
        }
        if (!bl2) return (zzgf$zzf)((zzkg)((zzgf$zzf$zza)zzgf$zzf.zzch()).zza(string2).zzd().zza((Iterable)object6).zzaj());
        this.zzb = object3;
        this.zza = zzgf$zzf;
        this.zzd.h_();
        object5 = l3;
        object4 = "_epc";
        object5 = (Long)zzpj.zza(zzgf$zzf, (String)object4, object5);
        this.zzc = l2 = ((Long)object5).longValue();
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 <= 0) {
            object = this.zzd.zzj().zzo();
            object5 = "Complex event with zero extra param count. eventName";
            ((zzgq)object).zza((String)object5, string2);
            return (zzgf$zzf)((zzkg)((zzgf$zzf$zza)zzgf$zzf.zzch()).zza(string2).zzd().zza((Iterable)object6).zzaj());
        }
        object2 = this.zzd.zzh();
        object5 = Preconditions.checkNotNull(object3);
        Iterator iterator = object5;
        iterator = (Long)object5;
        long l15 = this.zzc;
        Object object9 = object;
        ((zzar)object2).zza((String)object, (Long)((Object)iterator), l15, zzgf$zzf);
        return (zzgf$zzf)((zzkg)((zzgf$zzf$zza)zzgf$zzf.zzch()).zza(string2).zzd().zza((Iterable)object6).zzaj());
    }
}

