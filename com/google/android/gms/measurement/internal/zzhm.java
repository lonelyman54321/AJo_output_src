/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzgc$zza;
import com.google.android.gms.internal.measurement.zzgc$zza$zzb;
import com.google.android.gms.internal.measurement.zzgc$zza$zzc;
import com.google.android.gms.internal.measurement.zzgc$zza$zzd;
import com.google.android.gms.internal.measurement.zzgc$zza$zze;
import com.google.android.gms.internal.measurement.zzgc$zza$zzf;
import com.google.android.gms.internal.measurement.zzgc$zzb;
import com.google.android.gms.internal.measurement.zzgc$zzc$zza;
import com.google.android.gms.internal.measurement.zzgc$zzd;
import com.google.android.gms.internal.measurement.zzgc$zzd$zza;
import com.google.android.gms.internal.measurement.zzgc$zzh;
import com.google.android.gms.internal.measurement.zzgr$zza;
import com.google.android.gms.internal.measurement.zzgr$zzb;
import com.google.android.gms.internal.measurement.zzgr$zzc;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzat;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zzho;
import com.google.android.gms.measurement.internal.zzhq;
import com.google.android.gms.measurement.internal.zzhr;
import com.google.android.gms.measurement.internal.zzhs;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjj$zza;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public final class zzhm
extends zzot
implements zzak {
    final WC1 zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;
    private final Map zzf;
    private final Map zzh;
    private final zzv zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    public zzhm(zzou object) {
        super((zzou)object);
        this.zzb = object = new Jp();
        this.zzc = object = new Jp();
        this.zzd = object = new Jp();
        this.zze = object = new Jp();
        this.zzf = object = new Jp();
        this.zzj = object = new Jp();
        this.zzk = object = new Jp();
        this.zzl = object = new Jp();
        this.zzh = object = new Jp();
        this.zza = object = new zzhs(this, 20);
        this.zzi = object = new zzhr(this);
    }

    public static /* synthetic */ zzal zza(zzhm object) {
        object = ((zzhm)object).zzi;
        zzr zzr2 = new zzr((zzv)object);
        return zzr2;
    }

    public static /* synthetic */ zzb zza(zzhm zzhm2, String string2) {
        zzhm2.zzam();
        Preconditions.checkNotEmpty(string2);
        boolean bl2 = zzhm2.zzk(string2);
        if (!bl2) {
            return null;
        }
        Object object = zzhm2.zzf;
        bl2 = object.containsKey(string2);
        if (bl2 && (object = zzhm2.zzf.get(string2)) != null) {
            object = (zzgc$zzd)zzhm2.zzf.get(string2);
            zzhm2.zza(string2, (zzgc$zzd)object);
        } else {
            zzhm2.zzu(string2);
        }
        return (zzb)zzhm2.zza.snapshot().get(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzgc$zzd zza(String object, byte[] object2) {
        zzkp zzkp22;
        String string2;
        block8: {
            RuntimeException runtimeException2;
            block7: {
                Long l2;
                String string3;
                String string4;
                Object object3;
                block6: {
                    boolean bl2;
                    block5: {
                        string2 = "Unable to merge remote config. appId";
                        if (object2 == null) {
                            return zzgc$zzd.zzg();
                        }
                        try {
                            object3 = zzgc$zzd.zze();
                            object2 = zzpj.zza((zzlp)object3, (byte[])object2);
                            object2 = (zzgc$zzd$zza)object2;
                            object2 = ((zzkg$zza)object2).zzaj();
                            object2 = (zzkg)object2;
                            object2 = (zzgc$zzd)object2;
                            object3 = this.zzj();
                            object3 = ((zzgo)object3).zzq();
                            string4 = "Parsed config. version, gmp_app_id";
                            bl2 = ((zzgc$zzd)object2).zzr();
                            string3 = null;
                            if (!bl2) break block5;
                            long l3 = ((zzgc$zzd)object2).zzc();
                            l2 = l3;
                            break block6;
                        }
                        catch (RuntimeException runtimeException2) {
                            break block7;
                        }
                        catch (zzkp zzkp22) {
                            break block8;
                        }
                    }
                    bl2 = false;
                    l2 = null;
                }
                boolean bl3 = ((zzgc$zzd)object2).zzp();
                if (bl3) {
                    string3 = ((zzgc$zzd)object2).zzi();
                }
                ((zzgq)object3).zza(string4, l2, string3);
                return object2;
            }
            zzgq zzgq2 = this.zzj().zzr();
            object = zzgo.zza((String)object);
            zzgq2.zza(string2, object, runtimeException2);
            return zzgc$zzd.zzg();
        }
        zzgq zzgq3 = this.zzj().zzr();
        object = zzgo.zza((String)object);
        zzgq3.zza(string2, object, zzkp22);
        return zzgc$zzd.zzg();
    }

    private static zzjj$zza zza(zzgc$zza$zze zzgc$zza$zze) {
        int[] nArray = zzht.zzb;
        int n3 = zzgc$zza$zze.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        return null;
                    }
                    return zzjj$zza.zzd;
                }
                return zzjj$zza.zzc;
            }
            return zzjj$zza.zzb;
        }
        return zzjj$zza.zza;
    }

    private static Map zza(zzgc$zzd object) {
        Jp jp = new Jp();
        if (object != null) {
            boolean bl2;
            object = ((zzgc$zzd)object).zzn().iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = (zzgc$zzh)object.next();
                String string2 = ((zzgc$zzh)object2).zzb();
                object2 = ((zzgc$zzh)object2).zzc();
                jp.put(string2, object2);
            }
        }
        return jp;
    }

    private final void zza(String string2, zzgc$zzd$zza zzgc$zzd$zza) {
        HashSet<String> hashSet = new HashSet<String>();
        Jp jp = new Jp();
        Jp jp2 = new Jp();
        Jp jp4 = new Jp();
        if (zzgc$zzd$zza != null) {
            Object object;
            int n3;
            Iterator iterator = zzgc$zzd$zza.zze().iterator();
            while ((n3 = iterator.hasNext()) != 0) {
                object = ((zzgc$zzb)iterator.next()).zzb();
                hashSet.add((String)object);
            }
            iterator = null;
            for (int i3 = 0; i3 < (n3 = zzgc$zzd$zza.zza()); ++i3) {
                int n4;
                object = (zzgc$zzc$zza)zzgc$zzd$zza.zza(i3).zzch();
                Object object2 = ((zzgc$zzc$zza)object).zzb();
                int n7 = ((String)object2).isEmpty();
                if (n7 != 0) {
                    object = this.zzj().zzr();
                    object2 = "EventConfig contained null event name";
                    ((zzgq)object).zza((String)object2);
                    continue;
                }
                object2 = ((zzgc$zzc$zza)object).zzb();
                Object object3 = zzjp.zzb(((zzgc$zzc$zza)object).zzb());
                boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
                if (!bl2) {
                    object = ((zzgc$zzc$zza)object).zza((String)object3);
                    zzgc$zzd$zza.zza(i3, (zzgc$zzc$zza)object);
                }
                if ((n4 = ((zzgc$zzc$zza)object).zze()) != 0 && (n4 = ((zzgc$zzc$zza)object).zzc()) != 0) {
                    object3 = Boolean.TRUE;
                    jp.put(object2, object3);
                }
                if ((n7 = ((zzgc$zzc$zza)object).zzf()) != 0 && (n7 = ((zzgc$zzc$zza)object).zzd()) != 0) {
                    object2 = ((zzgc$zzc$zza)object).zzb();
                    object3 = Boolean.TRUE;
                    jp2.put(object2, object3);
                }
                if ((n7 = ((zzgc$zzc$zza)object).zzg()) == 0) continue;
                n7 = ((zzgc$zzc$zza)object).zza();
                if (n7 >= (n4 = 2) && (n7 = ((zzgc$zzc$zza)object).zza()) <= (n4 = (int)((char)-1))) {
                    object2 = ((zzgc$zzc$zza)object).zzb();
                    n3 = ((zzgc$zzc$zza)object).zza();
                    object = n3;
                    jp4.put(object2, object);
                    continue;
                }
                object2 = this.zzj().zzr();
                object3 = ((zzgc$zzc$zza)object).zzb();
                n3 = ((zzgc$zzc$zza)object).zza();
                object = n3;
                String string3 = "Invalid sampling rate. Event name, sample rate";
                ((zzgq)object2).zza(string3, object3, object);
            }
        }
        this.zzc.put(string2, hashSet);
        this.zzd.put(string2, jp);
        this.zze.put(string2, jp2);
        this.zzh.put(string2, jp4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void zza(String string2, zzgc$zzd iterator) {
        int n3 = ((zzgc$zzd)((Object)iterator)).zza();
        if (n3 == 0) {
            this.zza.remove(string2);
            return;
        }
        Object object = this.zzj().zzq();
        int n4 = ((zzgc$zzd)((Object)iterator)).zza();
        Object object2 = n4;
        Object object3 = "EES programs found";
        ((zzgq)object).zza((String)object3, object2);
        iterator = ((zzgc$zzd)((Object)iterator)).zzm();
        n3 = 0;
        object = null;
        iterator = (zzgr$zzc)iterator.get(0);
        object = new zzb();
        object2 = "internal.remoteConfig";
        object3 = new zzho(this, string2);
        ((zzb)object).zza((String)object2, (Callable)object3);
        object2 = "internal.appMetadata";
        object3 = new zzhn(this, string2);
        ((zzb)object).zza((String)object2, (Callable)object3);
        object2 = "internal.logger";
        object3 = new zzhq(this);
        ((zzb)object).zza((String)object2, (Callable)object3);
        ((zzb)object).zza((zzgr$zzc)((Object)iterator));
        object2 = this.zza;
        ((WC1)object2).put(string2, object);
        object = this.zzj();
        object = ((zzgo)object).zzq();
        object2 = "EES program loaded for appId, activities";
        object3 = ((zzgr$zzc)((Object)iterator)).zza();
        int n7 = ((zzgr$zza)object3).zza();
        object3 = n7;
        ((zzgq)object).zza((String)object2, string2, object3);
        iterator = ((zzgr$zzc)((Object)iterator)).zza();
        iterator = ((zzgr$zza)((Object)iterator)).zzd();
        try {
            iterator = iterator.iterator();
        }
        catch (zzc zzc2) {
            this.zzj().zzg().zza("Failed to load EES program. appId", string2);
            return;
        }
        while (true) {
            n3 = (int)(iterator.hasNext() ? 1 : 0);
            if (n3 == 0) return;
            break;
        }
        {
            object = iterator.next();
            object = (zzgr$zzb)object;
            object2 = this.zzj();
            object2 = ((zzgo)object2).zzq();
            object3 = "EES program activity";
            object = ((zzgr$zzb)object).zzb();
            ((zzgq)object2).zza((String)object3, object);
            continue;
        }
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzhm zzhm2) {
        return zzhm2.zzb;
    }

    private final void zzu(String string2) {
        this.zzam();
        this.zzv();
        Preconditions.checkNotEmpty(string2);
        Object object = this.zzf.get(string2);
        if (object == null) {
            object = this.zzh().zze(string2);
            if (object == null) {
                this.zzb.put(string2, null);
                this.zzd.put(string2, null);
                this.zzc.put(string2, null);
                this.zze.put(string2, null);
                this.zzf.put(string2, null);
                this.zzj.put(string2, null);
                this.zzk.put(string2, null);
                this.zzl.put(string2, null);
                this.zzh.put(string2, null);
                return;
            }
            Object object2 = ((zzat)object).zza;
            object2 = (zzgc$zzd$zza)this.zza(string2, (byte[])object2).zzch();
            this.zza(string2, (zzgc$zzd$zza)object2);
            Object object3 = this.zzb;
            Object object4 = zzhm.zza((zzgc$zzd)((zzkg)((zzkg$zza)object2).zzaj()));
            object3.put(string2, object4);
            object3 = this.zzf;
            object4 = (zzgc$zzd)((zzkg)((zzkg$zza)object2).zzaj());
            object3.put(string2, object4);
            object3 = (zzgc$zzd)((zzkg)((zzkg$zza)object2).zzaj());
            this.zza(string2, (zzgc$zzd)object3);
            object3 = this.zzj;
            object2 = ((zzgc$zzd$zza)object2).zzc();
            object3.put(string2, object2);
            object2 = this.zzk;
            object3 = ((zzat)object).zzb;
            object2.put(string2, object3);
            object2 = this.zzl;
            object = ((zzat)object).zzc;
            object2.put(string2, object);
        }
    }

    public final long zza(String object) {
        String string2 = this.zza((String)object, "measurement.account.time_zone_offset_minutes");
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            try {
                return Long.parseLong(string2);
            }
            catch (NumberFormatException numberFormatException) {
                zzgq zzgq2 = this.zzj().zzr();
                String string3 = "Unable to parse timezone offset. appId";
                object = zzgo.zza((String)object);
                zzgq2.zza(string3, object, numberFormatException);
            }
        }
        return 0L;
    }

    public final zzjm zza(String object, zzjj$zza enum_) {
        boolean bl2;
        this.zzv();
        this.zzu((String)object);
        object = this.zzb((String)object);
        if (object == null) {
            return zzjm.zza;
        }
        object = ((zzgc$zza)object).zzf().iterator();
        while (bl2 = object.hasNext()) {
            zzgc$zza$zzb zzgc$zza$zzb = (zzgc$zza$zzb)object.next();
            zzjj$zza zzjj$zza = zzhm.zza(zzgc$zza$zzb.zzc());
            if (zzjj$zza != enum_) continue;
            object = zzht.zzc;
            enum_ = zzgc$zza$zzb.zzb();
            int n3 = enum_.ordinal();
            Object object2 = object[n3];
            if (object2 != (n3 = 1)) {
                n3 = 2;
                if (object2 != n3) {
                    return zzjm.zza;
                }
                return zzjm.zzd;
            }
            return zzjm.zzc;
        }
        return zzjm.zza;
    }

    public final String zza(String object, String string2) {
        this.zzv();
        this.zzu((String)object);
        Map map2 = this.zzb;
        object = (Map)map2.get(object);
        if (object != null) {
            return (String)object.get(string2);
        }
        return null;
    }

    public final boolean zza(String string2, byte[] object, String object2, String object3) {
        zzgc$zzd$zza zzgc$zzd$zza;
        block14: {
            this.zzam();
            this.zzv();
            Preconditions.checkNotEmpty(string2);
            zzgc$zzd$zza = (zzgc$zzd$zza)this.zza(string2, (byte[])object).zzch();
            if (zzgc$zzd$zza == null) {
                return false;
            }
            this.zza(string2, zzgc$zzd$zza);
            Object object4 = (zzgc$zzd)((zzkg)zzgc$zzd$zza.zzaj());
            this.zza(string2, (zzgc$zzd)object4);
            object4 = this.zzf;
            Object object5 = (zzgc$zzd)((zzkg)zzgc$zzd$zza.zzaj());
            object4.put(string2, object5);
            object4 = this.zzj;
            object5 = zzgc$zzd$zza.zzc();
            object4.put(string2, object5);
            this.zzk.put(string2, object2);
            this.zzl.put(string2, object3);
            object4 = this.zzb;
            object5 = zzhm.zza((zzgc$zzd)((zzkg)zzgc$zzd$zza.zzaj()));
            object4.put(string2, object5);
            object4 = this.zzh();
            String[] stringArray = zzgc$zzd$zza.zzd();
            object5 = new ArrayList(stringArray);
            ((zzar)object4).zza(string2, (List)object5);
            zzgc$zzd$zza.zzb();
            object4 = zzgc$zzd$zza.zzaj();
            object4 = (zzkg)object4;
            object4 = (zzgc$zzd)object4;
            try {
                object = ((zzio)object4).zzce();
            }
            catch (RuntimeException runtimeException) {
                object5 = this.zzj().zzr();
                stringArray = "Unable to serialize reduced-size config. Storing full config instead. appId";
                Object object6 = zzgo.zza(string2);
                ((zzgq)object5).zza((String)stringArray, object6, runtimeException);
            }
            object4 = this.zzh();
            Preconditions.checkNotEmpty(string2);
            ((zzjf)object4).zzv();
            ((zzot)object4).zzam();
            object5 = new ContentValues();
            stringArray = "remote_config";
            object5.put((String)stringArray, (byte[])object);
            object5.put("config_last_modified_time", (String)object2);
            object = "e_tag";
            object5.put((String)object, (String)object3);
            object = ((zzar)object4).f_();
            object2 = "apps";
            object3 = "app_id = ?";
            stringArray = new String[]{string2};
            int n3 = object.update((String)object2, (ContentValues)object5, (String)object3, stringArray);
            long l2 = n3;
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 != false) break block14;
            object = ((zzjf)object4).zzj();
            object = ((zzgo)object).zzg();
            object2 = "Failed to update remote config (got 0). appId";
            object3 = zzgo.zza(string2);
            try {
                ((zzgq)object).zza((String)object2, object3);
            }
            catch (SQLiteException sQLiteException) {
                object2 = ((zzjf)object4).zzj().zzg();
                object3 = "Error storing remote config. appId";
                object4 = zzgo.zza(string2);
                ((zzgq)object2).zza((String)object3, object4, (Object)sQLiteException);
            }
        }
        object = this.zzf;
        object2 = (zzgc$zzd)((zzkg)zzgc$zzd$zza.zzaj());
        object.put(string2, object2);
        return true;
    }

    public final int zzb(String object, String string2) {
        this.zzv();
        this.zzu((String)object);
        Map map2 = this.zzh;
        object = (Map)map2.get(object);
        int n3 = 1;
        if (object != null) {
            if ((object = (Integer)object.get(string2)) == null) {
                return n3;
            }
            return (Integer)object;
        }
        return n3;
    }

    public final zzgc$zza zzb(String object) {
        boolean bl2;
        this.zzv();
        this.zzu((String)object);
        object = this.zzc((String)object);
        if (object != null && (bl2 = ((zzgc$zzd)object).zzo())) {
            return ((zzgc$zzd)object).zzd();
        }
        return null;
    }

    public final zzjj$zza zzb(String iterator, zzjj$zza zzjj$zza) {
        boolean bl2;
        this.zzv();
        this.zzu((String)((Object)iterator));
        iterator = this.zzb((String)((Object)iterator));
        if (iterator == null) {
            return null;
        }
        iterator = ((zzgc$zza)((Object)iterator)).zze().iterator();
        while (bl2 = iterator.hasNext()) {
            zzgc$zza$zzc zzgc$zza$zzc = (zzgc$zza$zzc)iterator.next();
            zzjj$zza zzjj$zza2 = zzhm.zza(zzgc$zza$zzc.zzc());
            if (zzjj$zza != zzjj$zza2) continue;
            return zzhm.zza(zzgc$zza$zzc.zzb());
        }
        return null;
    }

    public final zzgc$zzd zzc(String string2) {
        this.zzam();
        this.zzv();
        Preconditions.checkNotEmpty(string2);
        this.zzu(string2);
        return (zzgc$zzd)this.zzf.get(string2);
    }

    public final boolean zzc() {
        return false;
    }

    public final boolean zzc(String object, zzjj$zza enum_) {
        boolean bl2;
        this.zzv();
        this.zzu((String)object);
        object = this.zzb((String)object);
        if (object == null) {
            return false;
        }
        object = ((zzgc$zza)object).zzd().iterator();
        while (bl2 = object.hasNext()) {
            zzgc$zza$zzb zzgc$zza$zzb = (zzgc$zza$zzb)object.next();
            zzjj$zza zzjj$zza = zzhm.zza(zzgc$zza$zzb.zzc());
            if (enum_ != zzjj$zza) continue;
            object = zzgc$zza$zzb.zzb();
            if (object != (enum_ = zzgc$zza$zzd.zzb)) break;
            return true;
        }
        return false;
    }

    public final boolean zzc(String object, String string2) {
        this.zzv();
        this.zzu((String)object);
        String string3 = "ecommerce_purchase";
        boolean bl2 = string3.equals(string2);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        string3 = "purchase";
        bl2 = string3.equals(string2);
        if (!bl2 && !(bl2 = (string3 = "refund").equals(string2))) {
            object = (Map)this.zze.get(object);
            bl2 = false;
            string3 = null;
            if (object != null) {
                if ((object = (Boolean)object.get(string2)) == null) {
                    return false;
                }
                return (Boolean)object;
            }
            return false;
        }
        return bl3;
    }

    public final String zzd(String string2) {
        this.zzv();
        return (String)this.zzl.get(string2);
    }

    public final boolean zzd(String object, String string2) {
        this.zzv();
        this.zzu((String)object);
        boolean bl2 = this.zzl((String)object);
        boolean bl3 = true;
        if (bl2 && (bl2 = zzpn.zzf(string2))) {
            return bl3;
        }
        bl2 = this.zzn((String)object);
        if (bl2 && (bl2 = zzpn.zzg(string2))) {
            return bl3;
        }
        object = (Map)this.zzd.get(object);
        bl2 = false;
        if (object != null) {
            if ((object = (Boolean)object.get(string2)) == null) {
                return false;
            }
            return (Boolean)object;
        }
        return false;
    }

    public final String zze(String string2) {
        this.zzv();
        return (String)this.zzk.get(string2);
    }

    public final String zzf(String string2) {
        this.zzv();
        this.zzu(string2);
        return (String)this.zzj.get(string2);
    }

    public final Set zzg(String string2) {
        this.zzv();
        this.zzu(string2);
        return (Set)this.zzc.get(string2);
    }

    public final SortedSet zzh(String iterator) {
        boolean bl2;
        this.zzv();
        this.zzu((String)((Object)iterator));
        TreeSet<String> treeSet = new TreeSet<String>();
        iterator = this.zzb((String)((Object)iterator));
        if (iterator == null) {
            return treeSet;
        }
        iterator = ((zzgc$zza)((Object)iterator)).zzc().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = ((zzgc$zza$zzf)iterator.next()).zzb();
            treeSet.add(string2);
        }
        return treeSet;
    }

    public final void zzi(String string2) {
        this.zzv();
        this.zzk.put(string2, null);
    }

    public final void zzj(String string2) {
        this.zzv();
        this.zzf.remove(string2);
    }

    public final boolean zzk(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return false;
        }
        Map map2 = this.zzf;
        if ((object = (zzgc$zzd)map2.get(object)) == null) {
            return false;
        }
        int n3 = ((zzgc$zzd)object).zza();
        return n3 != 0;
    }

    public final boolean zzl(String string2) {
        string2 = this.zza(string2, "measurement.upload.blacklist_internal");
        return "1".equals(string2);
    }

    public final boolean zzm(String object) {
        boolean bl2;
        this.zzv();
        this.zzu((String)object);
        object = this.zzb((String)object);
        boolean bl3 = true;
        if (object == null) {
            return bl3;
        }
        boolean bl4 = ((zzgc$zza)object).zzh();
        if (bl4 && !(bl2 = ((zzgc$zza)object).zzg())) {
            return false;
        }
        return bl3;
    }

    public final boolean zzn(String string2) {
        string2 = this.zza(string2, "measurement.upload.blacklist_public");
        return "1".equals(string2);
    }

    public final boolean zzo(String object) {
        boolean bl2;
        this.zzv();
        this.zzu((String)object);
        Object object2 = this.zzc.get(object);
        return object2 != null && (bl2 = (object = (Set)this.zzc.get(object)).contains(object2 = "app_instance_id"));
    }

    public final boolean zzp(String object) {
        boolean bl2;
        String string2;
        boolean bl3;
        this.zzv();
        this.zzu((String)object);
        Object object2 = this.zzc.get(object);
        return object2 != null && ((bl3 = (object2 = (Set)this.zzc.get(object)).contains(string2 = "device_model")) || (bl2 = (object = (Set)this.zzc.get(object)).contains(object2 = "device_info")));
    }

    public final boolean zzq(String object) {
        boolean bl2;
        this.zzv();
        this.zzu((String)object);
        Object object2 = this.zzc.get(object);
        return object2 != null && (bl2 = (object = (Set)this.zzc.get(object)).contains(object2 = "enhanced_user_id"));
    }

    public final boolean zzr(String object) {
        boolean bl2;
        this.zzv();
        this.zzu((String)object);
        Object object2 = this.zzc.get(object);
        return object2 != null && (bl2 = (object = (Set)this.zzc.get(object)).contains(object2 = "google_signals"));
    }

    public final boolean zzs(String object) {
        boolean bl2;
        String string2;
        boolean bl3;
        this.zzv();
        this.zzu((String)object);
        Object object2 = this.zzc.get(object);
        return object2 != null && ((bl3 = (object2 = (Set)this.zzc.get(object)).contains(string2 = "os_version")) || (bl2 = (object = (Set)this.zzc.get(object)).contains(object2 = "device_info")));
    }

    public final boolean zzt(String object) {
        boolean bl2;
        this.zzv();
        this.zzu((String)object);
        Object object2 = this.zzc.get(object);
        return object2 != null && (bl2 = (object = (Set)this.zzc.get(object)).contains(object2 = "user_id"));
    }
}

