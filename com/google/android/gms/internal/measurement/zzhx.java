/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.measurement.zzhf;
import com.google.android.gms.internal.measurement.zzhi;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzht$zza;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhy;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzia;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzie;
import com.google.android.gms.internal.measurement.zzif;
import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzhx {
    private static final Object zza;
    private static volatile zzie zzb;
    private static volatile boolean zzc = false;
    private static zzii zzd;
    private static final AtomicInteger zze;
    private final zzif zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile Object zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        Object object;
        zza = object = new Object();
        new AtomicReference();
        zzhy zzhy2 = new zzhy();
        zzd = object = new zzii(zzhy2);
        zze = object = new AtomicInteger();
    }

    private zzhx(zzif object, String string2, Object object2, boolean bl2) {
        Uri uri;
        int n3;
        this.zzi = n3 = -1;
        String string3 = ((zzif)object).zza;
        if (string3 == null && (uri = ((zzif)object).zzb) == null) {
            object = new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw object;
        }
        if (string3 != null && (string3 = ((zzif)object).zzb) != null) {
            object = new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
            throw object;
        }
        this.zzf = object;
        this.zzg = string2;
        this.zzh = object2;
        this.zzk = bl2;
        this.zzl = false;
    }

    public /* synthetic */ zzhx(zzif zzif2, String string2, Object object, boolean bl2, zzih zzih2) {
        this(zzif2, string2, object, true);
    }

    public static /* synthetic */ zzhx zza(zzif zzif2, String string2, Boolean bl2, boolean bl3) {
        zzia zzia2 = new zzia(zzif2, string2, bl2, true);
        return zzia2;
    }

    public static /* synthetic */ zzhx zza(zzif zzif2, String string2, Double d2, boolean bl2) {
        zzid zzid2 = new zzid(zzif2, string2, d2, true);
        return zzid2;
    }

    public static /* synthetic */ zzhx zza(zzif zzif2, String string2, Long l2, boolean bl2) {
        zzib zzib2 = new zzib(zzif2, string2, l2, true);
        return zzib2;
    }

    public static /* synthetic */ zzhx zza(zzif zzif2, String string2, String string3, boolean bl2) {
        zzic zzic2 = new zzic(zzif2, string2, string3, true);
        return zzic2;
    }

    public static /* synthetic */ Optional zza(Context context) {
        return zzht$zza.zza(context);
    }

    private final Object zza(zzie object) {
        Context context;
        boolean bl2;
        Object object2 = this.zzf;
        boolean bl3 = ((zzif)object2).zze;
        if (!bl3 && ((object2 = ((zzif)object2).zzh) == null || (bl2 = ((Boolean)(object2 = (Boolean)object2.apply(context = ((zzie)object).zza()))).booleanValue()))) {
            object = zzhq.zza(((zzie)object).zza());
            object2 = this.zzf;
            bl3 = ((zzif)object2).zze;
            if (bl3) {
                bl2 = false;
                object2 = null;
            } else {
                object2 = ((zzif)object2).zzc;
                object2 = this.zza((String)object2);
            }
            object = object.zza((String)object2);
            if (object != null) {
                return this.zza(object);
            }
        }
        return null;
    }

    private final String zza(String string2) {
        boolean bl2;
        if (string2 != null && (bl2 = string2.isEmpty())) {
            return this.zzg;
        }
        String string3 = this.zzg;
        return Ft2.a(string2, string3);
    }

    private final Object zzb(zzie object) {
        Object object2 = this.zzf.zzb;
        if (object2 != null) {
            Object object3;
            object2 = ((zzie)object).zza();
            boolean bl2 = zzhv.zza((Context)object2, object3 = this.zzf.zzb);
            if (bl2) {
                object2 = this.zzf;
                bl2 = object2.zzg;
                if (bl2) {
                    object2 = ((zzie)object).zza().getContentResolver();
                    object = ((zzie)object).zza();
                    object3 = this.zzf.zzb.getLastPathSegment();
                    object = zzhu.zza(zzhu.zza((Context)object, (String)object3));
                    object3 = new zzhw();
                    object = zzhi.zza((ContentResolver)object2, (Uri)object, (Runnable)object3);
                } else {
                    object = ((zzie)object).zza().getContentResolver();
                    object2 = this.zzf.zzb;
                    object3 = new zzhw();
                    object = zzhi.zza((ContentResolver)object, object2, (Runnable)object3);
                }
            } else {
                object = null;
            }
        } else {
            object = ((zzie)object).zza();
            object2 = this.zzf.zza;
            zzhw zzhw2 = new zzhw();
            object = zzig.zza((Context)object, (String)object2, zzhw2);
        }
        if (object != null && (object = object.zza((String)(object2 = this.zzb()))) != null) {
            return this.zza(object);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void zzb(Context object) {
        block10: {
            Throwable throwable2;
            block13: {
                block11: {
                    Object object2;
                    Object object3;
                    block12: {
                        Object object4 = zzb;
                        if (object4 != null) return;
                        if (object == null) {
                            return;
                        }
                        object4 = zza;
                        // MONITORENTER : object4
                        object3 = zzb;
                        if (object3 != null) break block10;
                        // MONITORENTER : object4
                        try {
                            object3 = zzb;
                            object2 = object.getApplicationContext();
                            if (object2 != null) {
                                object = object2;
                            }
                            if (object3 != null && (object2 = ((zzie)object3).zza()) == object) break block11;
                            if (object3 == null) break block12;
                            zzhi.zzb();
                            zzig.zza();
                            zzhq.zza();
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                    }
                    object3 = new zzhz((Context)object);
                    object3 = Suppliers.memoize((Supplier)object3);
                    object2 = new zzhf((Context)object, (Supplier)object3);
                    zzb = object2;
                    object = zze;
                    ((AtomicInteger)object).incrementAndGet();
                }
                // MONITOREXIT : object4
                return;
            }
            throw throwable2;
        }
        // MONITOREXIT : object4
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    private final Object zze() {
        return this.zzh;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza() {
        int n3;
        Object object;
        Object object2;
        int n4 = this.zzk;
        if (n4 == 0) {
            object2 = zzd;
            object = this.zzg;
            n4 = (int)(((zzii)object2).zza((String)object) ? 1 : 0);
            object = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.";
            Preconditions.checkState(n4 != 0, object);
        }
        if ((n3 = this.zzi) >= (n4 = ((AtomicInteger)(object2 = zze)).get())) return this.zzj;
        synchronized (this) {
            Throwable throwable2;
            block9: {
                String string2;
                Object object3;
                boolean bl2;
                Object object4;
                Object object5;
                block8: {
                    try {
                        n3 = this.zzi;
                        if (n3 >= n4) return this.zzj;
                        object = zzb;
                        object5 = Optional.absent();
                        object4 = null;
                        if (object == null) break block8;
                        object5 = ((zzie)object).zzb();
                        object5 = object5.get();
                        bl2 = ((Optional)(object5 = (Optional)object5)).isPresent();
                        if (!bl2) break block8;
                        object4 = ((Optional)object5).get();
                        object4 = (zzhr)object4;
                        object3 = this.zzf;
                        string2 = ((zzif)object3).zzb;
                        String string3 = ((zzif)object3).zza;
                        object3 = ((zzif)object3).zzd;
                        String string4 = this.zzg;
                        object4 = object4.zza((Uri)string2, string3, (String)object3, string4);
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                if (object != null) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object3 = null;
                }
                string2 = "Must call PhenotypeFlagInitializer.maybeInit() first";
                Preconditions.checkState(bl2, string2);
                object3 = this.zzf;
                bl2 = ((zzif)object3).zzf;
                if (!(bl2 ? (object3 = this.zza((zzie)object)) != null || (object3 = this.zzb((zzie)object)) != null : (object3 = this.zzb((zzie)object)) != null || (object3 = this.zza((zzie)object)) != null)) {
                    object3 = this.zze();
                }
                if ((n3 = (int)(((Optional)object5).isPresent() ? 1 : 0)) != 0) {
                    object3 = object4 == null ? this.zze() : this.zza(object4);
                }
                this.zzj = object3;
                this.zzi = n4;
                return this.zzj;
            }
            throw throwable2;
        }
    }

    public abstract Object zza(Object var1);

    public final String zzb() {
        String string2 = this.zzf.zzd;
        return this.zza(string2);
    }
}

