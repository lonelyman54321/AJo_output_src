/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.measurement.internal.zza;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zze;
import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzly;
import com.google.android.gms.measurement.internal.zzma;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zzmc;
import com.google.android.gms.measurement.internal.zzmd;
import com.google.android.gms.measurement.internal.zzmf;
import com.google.android.gms.measurement.internal.zznx;
import com.google.android.gms.measurement.internal.zzod;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class zzlz
extends zzf {
    protected zzlw zza;
    private volatile zzlw zzb;
    private volatile zzlw zzc;
    private final Map zzd;
    private zzeb zze;
    private volatile boolean zzf;
    private volatile zzlw zzg;
    private zzlw zzh;
    private boolean zzi;
    private final Object zzj;

    public zzlz(zzic concurrentHashMap) {
        super((zzic)((Object)concurrentHashMap));
        concurrentHashMap = new ConcurrentHashMap();
        this.zzj = concurrentHashMap;
        this.zzd = concurrentHashMap = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ zzlw zza(zzlz zzlz2) {
        return zzlz2.zzh;
    }

    private final String zza(String object, String object2) {
        if (object == null) {
            return object2;
        }
        object2 = "\\.";
        int n3 = ((String[])(object = ((String)object).split((String)object2))).length;
        if (n3 > 0) {
            n3 = ((String[])object).length + -1;
            object = object[n3];
        } else {
            object = "";
        }
        n3 = ((String)object).length();
        zzai zzai2 = this.zze();
        int n4 = zzai2.zza(null, false);
        if (n3 > n4) {
            object2 = this.zze();
            n3 = ((zzai)object2).zza(null, false);
            object = ((String)object).substring(0, n3);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zza(zzlw zzlw2, zzlw zzlw3, long l2, boolean bl2, Bundle bundle) {
        int n3;
        String string2;
        Object object;
        String string3;
        boolean bl3;
        long l3;
        long l4;
        long l7;
        long l8;
        zzlz zzlz2 = this;
        zzlw zzlw4 = zzlw2;
        Object object2 = zzlw3;
        long l12 = l2;
        Bundle bundle2 = bundle;
        this.zzv();
        boolean bl4 = false;
        boolean bl5 = true;
        if (zzlw3 != null && (l8 = (l7 = (l4 = zzlw3.zzc) - (l3 = zzlw2.zzc)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false && (bl3 = Objects.equals(string3 = zzlw3.zzb, object = zzlw2.zzb)) && (bl3 = Objects.equals(string2 = zzlw3.zza, object = zzlw2.zza))) {
            bl3 = false;
            Object var20_21 = null;
        } else {
            bl3 = true;
        }
        if (bl2 && (object = zzlz2.zza) != null) {
            bl4 = true;
        }
        if (bl3) {
            long l14;
            long l15;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            Bundle bundle4 = bundle3;
            zzpn.zza(zzlw4, bundle3, bl5);
            if (object2 != null) {
                String string4;
                String string5 = ((zzlw)object2).zza;
                if (string5 != null) {
                    String string6 = "_pn";
                    bundle4.putString(string6, string5);
                }
                if ((string4 = ((zzlw)object2).zzb) != null) {
                    String string7 = "_pc";
                    bundle4.putString(string7, string4);
                }
                String string8 = "_pi";
                l4 = ((zzlw)object2).zzc;
                bundle4.putLong(string8, l4);
            }
            l4 = 0L;
            if (bl4 && (n3 = (l15 = (l3 = ((zzod)(object2 = this.zzr().zzb)).zza(l12)) - l4) == 0L ? 0 : (l15 < 0L ? -1 : 1)) > 0) {
                object2 = this.zzs();
                ((zzpn)object2).zza(bundle4, l3);
            }
            if ((n3 = ((zzai)(object2 = this.zze())).zzx()) == 0) {
                object2 = "_mst";
                l3 = 1L;
                bundle4.putLong((String)object2, l3);
            }
            object2 = (n3 = zzlw4.zze) != 0 ? "app" : "auto";
            Object object3 = object2;
            object2 = this.zzb();
            long l16 = object2.currentTimeMillis();
            n3 = (int)(zzlw4.zze ? 1 : 0);
            long l17 = l16;
            long l18 = n3 != 0 && (n3 = (int)((l14 = (l16 = zzlw4.zzf) - l4) == 0L ? 0 : (l14 < 0L ? -1 : 1))) != 0 ? l16 : l17;
            object = this.zzm();
            String string9 = "_vs";
            ((zzju)object).zza((String)object3, string9, l18, bundle4);
        }
        if (bl4) {
            object2 = zzlz2.zza;
            this.zza((zzlw)object2, bl5, l12);
        }
        zzlz2.zza = zzlw4;
        n3 = zzlw4.zze;
        if (n3 != 0) {
            zzlz2.zzh = zzlw4;
        }
        this.zzq().zza(zzlw4);
    }

    private final void zza(zzlw zzlw2, boolean bl2, long l2) {
        boolean bl3;
        zza zza2 = this.zzc();
        Clock clock = this.zzb();
        long l3 = clock.elapsedRealtime();
        zza2.zza(l3);
        zza2 = null;
        if (zzlw2 != null && (bl3 = zzlw2.zzd)) {
            bl3 = true;
        } else {
            bl3 = false;
            clock = null;
        }
        zznx zznx2 = this.zzr();
        bl2 = zznx2.zza(bl3, bl2, l2);
        if (bl2 && zzlw2 != null) {
            zzlw2.zzd = false;
        }
    }

    public static /* synthetic */ void zza(zzlz zzlz2, Bundle bundle, zzlw zzlw2, zzlw zzlw3, long l2) {
        if (bundle != null) {
            bundle.remove("screen_name");
            String string2 = "screen_class";
            bundle.remove(string2);
        }
        Bundle bundle2 = zzlz2.zzs().zza(null, "screen_view", bundle, null, false);
        zzlz2.zza(zzlw2, zzlw3, l2, true, bundle2);
    }

    public static /* bridge */ /* synthetic */ void zza(zzlz zzlz2, zzlw zzlw2) {
        zzlz2.zzh = null;
    }

    public static /* bridge */ /* synthetic */ void zza(zzlz zzlz2, zzlw zzlw2, zzlw zzlw3, long l2, boolean bl2, Bundle bundle) {
        zzlz2.zza(zzlw2, zzlw3, l2, bl2, null);
    }

    public static /* bridge */ /* synthetic */ void zza(zzlz zzlz2, zzlw zzlw2, boolean bl2, long l2) {
        zzlz2.zza(zzlw2, false, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zza(String string2, zzlw zzlw2, boolean bl2) {
        Object object;
        Object object2;
        zzlz zzlz2 = this;
        Object object3 = string2;
        Object object4 = zzlw2;
        Object object5 = this.zzb;
        object5 = object5 == null ? this.zzc : this.zzb;
        zzlw zzlw3 = object5;
        object5 = ((zzlw)object4).zzb;
        if (object5 == null) {
            if (object3 != null) {
                object5 = "Activity";
                object3 = zzlz2.zza((String)object3, (String)object5);
            } else {
                object3 = null;
            }
            Object object6 = object3;
            object2 = ((zzlw)object4).zza;
            long l2 = ((zzlw)object4).zzc;
            boolean bl3 = ((zzlw)object4).zze;
            long l3 = ((zzlw)object4).zzf;
            object = object3;
            object5 = object3 = new zzlw((String)object2, (String)object6, l2, bl3, l3);
        } else {
            object5 = object4;
        }
        zzlz2.zzc = object3 = zzlz2.zzb;
        zzlz2.zzb = object5;
        long l4 = this.zzb().elapsedRealtime();
        object = this.zzl();
        object3 = object2;
        object4 = this;
        object2 = new zzmb(this, (zzlw)object5, zzlw3, l4, bl2);
        ((zzhv)object).zzb((Runnable)object2);
    }

    private final zzlw zzd(zzeb object) {
        Preconditions.checkNotNull(object);
        Object object2 = this.zzd;
        int n3 = ((zzeb)object).zza;
        Object object3 = n3;
        object2 = (zzlw)object2.get(object3);
        if (object2 == null) {
            object2 = ((zzeb)object).zzb;
            object2 = this.zza((String)object2, "Activity");
            zzpn zzpn2 = this.zzs();
            long l2 = zzpn2.zzo();
            object3 = new zzlw(null, (String)object2, l2);
            object2 = this.zzd;
            int n4 = ((zzeb)object).zza;
            object = n4;
            object2.put(object, object3);
            object2 = object3;
        }
        if ((object = this.zzg) != null) {
            return this.zzg;
        }
        return object2;
    }

    public final zzlw zza(boolean bl2) {
        this.zzw();
        this.zzv();
        if (!bl2) {
            return this.zza;
        }
        zzlw zzlw2 = this.zza;
        if (zzlw2 != null) {
            return zzlw2;
        }
        return this.zzh;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza(Bundle bundle, long l2) {
        Object object;
        Object object2;
        Object object3;
        zzlz zzlz2 = this;
        Object object6 = bundle;
        Object object7 = this.zzj;
        // MONITORENTER : object7
        boolean bl2 = this.zzi;
        if (!bl2) {
            object6 = this.zzj();
            object6 = ((zzgo)object6).zzw();
            String string2 = "Cannot log screen view event when the app is in the background.";
            ((zzgq)object6).zza(string2);
            // MONITOREXIT : object7
            return;
        }
        bl2 = false;
        Object object5 = null;
        int n3 = 0;
        Object object4 = null;
        if (bundle != null) {
            zzai zzai2;
            zzai zzai3;
            int n4;
            int n7;
            object3 = "screen_name";
            if ((object3 = bundle.getString((String)object3)) != null && ((n7 = ((String)object3).length()) <= 0 || (n7 = ((String)object3).length()) > (n4 = (zzai3 = this.zze()).zza(null, false)))) {
                object6 = this.zzj();
                object6 = ((zzgo)object6).zzw();
                object5 = "Invalid screen name length for screen view. Length";
                n3 = ((String)object3).length();
                object4 = n3;
                ((zzgq)object6).zza((String)object5, object4);
                // MONITOREXIT : object7
                return;
            }
            object2 = "screen_class";
            if ((object2 = object6.getString((String)object2)) != null && ((n4 = ((String)object2).length()) <= 0 || (n4 = ((String)object2).length()) > (n3 = (zzai2 = this.zze()).zza(null, false)))) {
                object6 = this.zzj();
                object6 = ((zzgo)object6).zzw();
                object5 = "Invalid screen class length for screen view. Length";
                n3 = ((String)object2).length();
                object4 = n3;
                ((zzgq)object6).zza((String)object5, object4);
                // MONITOREXIT : object7
                return;
            }
            object = object3;
            object4 = object2;
        } else {
            object = null;
        }
        if (object4 == null) {
            object4 = zzlz2.zze;
            if (object4 != null) {
                object4 = ((zzeb)object4).zzb;
                object3 = "Activity";
                object4 = zzlz2.zza((String)object4, (String)object3);
            } else {
                object4 = "Activity";
            }
        }
        zzeb zzeb2 = object4;
        object4 = zzlz2.zzb;
        boolean bl3 = zzlz2.zzf;
        if (bl3 && object4 != null) {
            zzlz2.zzf = false;
            object5 = ((zzlw)object4).zzb;
            bl2 = Objects.equals(object5, zzeb2);
            object4 = ((zzlw)object4).zza;
            n3 = (int)(Objects.equals(object4, object) ? 1 : 0);
            if (bl2 && n3 != 0) {
                object6 = this.zzj();
                object6 = ((zzgo)object6).zzw();
                object5 = "Ignoring call to log screen view event with duplicate parameters.";
                ((zzgq)object6).zza((String)object5);
                // MONITOREXIT : object7
                return;
            }
        }
        // MONITOREXIT : object7
        object7 = this.zzj().zzq();
        object5 = "Logging screen view with name, class";
        object4 = object == null ? "null" : object;
        object3 = zzeb2 == null ? "null" : zzeb2;
        ((zzgq)object7).zza((String)object5, object4, object3);
        object7 = zzlz2.zzb;
        object7 = object7 == null ? zzlz2.zzc : zzlz2.zzb;
        object2 = object7;
        long l3 = this.zzs().zzo();
        Object object8 = object3;
        zzlz2.zzb = object3 = new zzlw((String)object, (String)((Object)zzeb2), l3, true, l2);
        zzlz2.zzc = object2;
        zzlz2.zzg = object3;
        long l4 = this.zzb().elapsedRealtime();
        object8 = this.zzl();
        object7 = object;
        object5 = this;
        object4 = bundle;
        object = new zzly(this, bundle, (zzlw)object3, (zzlw)object2, l4);
        ((zzhv)object8).zzb((Runnable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza(zzeb object) {
        Object object2 = this.zzj;
        // MONITORENTER : object2
        zzeb zzeb2 = this.zze;
        boolean bl2 = Objects.equals(zzeb2, object);
        if (bl2) {
            bl2 = false;
            zzeb2 = null;
            this.zze = null;
        }
        object2 = this.zze();
        boolean bl3 = ((zzai)object2).zzx();
        if (!bl3) {
            return;
        }
        object2 = this.zzd;
        object = ((zzeb)object).zza;
        object2.remove(object);
    }

    public final void zza(zzeb object, Bundle object2) {
        Object object3 = this.zze();
        boolean bl2 = ((zzai)object3).zzx();
        if (!bl2) {
            return;
        }
        if (object2 == null) {
            return;
        }
        object3 = "com.google.app_measurement.screen_service";
        if ((object2 = object2.getBundle((String)object3)) == null) {
            return;
        }
        String string2 = object2.getString("name");
        String string3 = object2.getString("referrer_name");
        long l2 = object2.getLong("id");
        object3 = new zzlw(string2, string3, l2);
        object2 = this.zzd;
        object = ((zzeb)object).zza;
        object2.put(object, object3);
    }

    public final void zza(zzeb object, String object2, String object3) {
        int n3;
        zzai zzai2;
        int n4;
        Object object4 = this.zze();
        boolean n42 = ((zzai)object4).zzx();
        if (!n42) {
            this.zzj().zzw().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        object4 = this.zzb;
        if (object4 == null) {
            this.zzj().zzw().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Object object5 = this.zzd;
        int n7 = ((zzeb)object).zza;
        Integer n8 = n7;
        if ((object5 = object5.get(n8)) == null) {
            this.zzj().zzw().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (object3 == null) {
            object3 = ((zzeb)object).zzb;
            object5 = "Activity";
            object3 = this.zza((String)object3, (String)object5);
        }
        object5 = ((zzlw)object4).zzb;
        boolean bl2 = Objects.equals(object5, object3);
        object4 = ((zzlw)object4).zza;
        boolean bl3 = Objects.equals(object4, object2);
        if (bl2 && bl3) {
            this.zzj().zzw().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        boolean bl4 = false;
        object4 = null;
        bl2 = false;
        object5 = null;
        if (object2 != null && ((n7 = ((String)object2).length()) <= 0 || (n7 = ((String)object2).length()) > (n4 = (zzai2 = this.zze()).zza(null, false)))) {
            object = this.zzj().zzw();
            object2 = ((String)object2).length();
            ((zzgq)object).zza("Invalid screen name length in setCurrentScreen. Length", object2);
            return;
        }
        if (object3 != null && ((n7 = ((String)object3).length()) <= 0 || (n7 = ((String)object3).length()) > (n3 = (zzai2 = this.zze()).zza(null, false)))) {
            object = this.zzj().zzw();
            object2 = ((String)object3).length();
            ((zzgq)object).zza("Invalid class name length in setCurrentScreen. Length", object2);
            return;
        }
        object4 = this.zzj().zzq();
        object5 = object2 == null ? "null" : object2;
        ((zzgq)object4).zza("Setting current screen to name, class", object5, object3);
        long l2 = this.zzs().zzo();
        object4 = new zzlw((String)object2, (String)object3, l2);
        object2 = this.zzd;
        object3 = ((zzeb)object).zza;
        object2.put(object3, object4);
        object = ((zzeb)object).zzb;
        this.zza((String)object, (zzlw)object4, true);
    }

    public final boolean zzab() {
        return false;
    }

    public final zzlw zzac() {
        return this.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzeb object) {
        Object object2 = this.zzj;
        synchronized (object2) {
            boolean bl2 = false;
            this.zzi = false;
            this.zzf = bl2 = true;
        }
        object2 = this.zzb();
        long l2 = object2.elapsedRealtime();
        Object object3 = this.zze();
        boolean bl3 = ((zzai)object3).zzx();
        zzmc zzmc2 = null;
        if (!bl3) {
            this.zzb = null;
            object = this.zzl();
            object3 = new zzmd(this, l2);
            ((zzhv)object).zzb((Runnable)object3);
            return;
        }
        object = this.zzd((zzeb)object);
        this.zzc = object3 = this.zzb;
        this.zzb = null;
        object3 = this.zzl();
        zzmc2 = new zzmc(this, (zzlw)object, l2);
        ((zzhv)object3).zzb(zzmc2);
    }

    public final void zzb(zzeb object, Bundle bundle) {
        Object object2 = this.zze();
        boolean bl2 = ((zzai)object2).zzx();
        if (!bl2) {
            return;
        }
        if (bundle == null) {
            return;
        }
        object2 = this.zzd;
        int n3 = ((zzeb)object).zza;
        object = n3;
        if ((object = (zzlw)object2.get(object)) == null) {
            return;
        }
        object2 = new Bundle();
        long l2 = ((zzlw)object).zzc;
        object2.putLong("id", l2);
        String string2 = ((zzlw)object).zza;
        object2.putString("name", string2);
        object = ((zzlw)object).zzb;
        object2.putString("referrer_name", (String)object);
        bundle.putBundle("com.google.app_measurement.screen_service", (Bundle)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzc(zzeb object) {
        boolean bl3;
        Runnable runnable2;
        zzhv zzhv2;
        Object object2;
        block11: {
            object2 = this.zzj;
            // MONITORENTER : object2
            boolean bl2 = true;
            this.zzi = bl2;
            Object object3 = this.zze;
            bl2 = Objects.equals(object, object3);
            zzhv2 = null;
            if (bl2) break block11;
            object3 = this.zzj;
            // MONITORENTER : object3
            this.zze = object;
            this.zzf = false;
            object3 = this.zze();
            bl2 = ((zzai)object3).zzx();
            if (bl2) {
                bl2 = false;
                object3 = null;
                this.zzg = null;
                object3 = this.zzl();
                runnable2 = new zzmf(this);
                ((zzhv)object3).zzb(runnable2);
            }
        }
        if (!(bl3 = ((zzai)(object2 = this.zze())).zzx())) {
            this.zzb = object = this.zzg;
            object = this.zzl();
            object2 = new zzma(this);
            ((zzhv)object).zzb((Runnable)object2);
            return;
        }
        object2 = this.zzd((zzeb)object);
        object = ((zzeb)object).zzb;
        this.zza((String)object, (zzlw)object2, false);
        object = this.zzc();
        long l2 = ((zza)object).zzb().elapsedRealtime();
        zzhv2 = ((zza)object).zzl();
        runnable2 = new zze((zza)object, l2);
        zzhv2.zzb(runnable2);
    }
}

