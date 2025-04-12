/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  android.util.Log
 */
package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.vision.zzaq;
import com.google.android.gms.internal.vision.zzau;
import com.google.android.gms.internal.vision.zzav;
import com.google.android.gms.internal.vision.zzbd;
import com.google.android.gms.internal.vision.zzbe;
import com.google.android.gms.internal.vision.zzbg;
import com.google.android.gms.internal.vision.zzbh;
import com.google.android.gms.internal.vision.zzbj;
import com.google.android.gms.internal.vision.zzbk;
import com.google.android.gms.internal.vision.zzbl;
import com.google.android.gms.internal.vision.zzbm;
import com.google.android.gms.internal.vision.zzbn;
import com.google.android.gms.internal.vision.zzbo;
import com.google.android.gms.internal.vision.zzbp;
import com.google.android.gms.internal.vision.zzbq;
import com.google.android.gms.internal.vision.zzbr;
import com.google.android.gms.internal.vision.zzbs;
import com.google.android.gms.internal.vision.zzbv;
import com.google.android.gms.internal.vision.zzcy;
import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzdf;
import com.google.android.gms.internal.vision.zzdi;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class zzbi {
    private static final Object zza;
    private static volatile zzbr zzb;
    private static volatile boolean zzc = false;
    private static final AtomicReference zzd;
    private static zzbs zze;
    private static final AtomicInteger zzi;
    private final zzbo zzf;
    private final String zzg;
    private final Object zzh;
    private volatile int zzj;
    private volatile Object zzk;
    private final boolean zzl;

    static {
        Object object;
        zza = object = new Object();
        object = new AtomicReference();
        zzd = object;
        zzbv zzbv2 = zzbk.zza;
        zze = object = new zzbs(zzbv2);
        zzi = object = new AtomicInteger();
    }

    private zzbi(zzbo object, String string2, Object object2, boolean bl2) {
        Uri uri;
        int n3;
        this.zzj = n3 = -1;
        String string3 = ((zzbo)object).zza;
        if (string3 == null && (uri = ((zzbo)object).zzb) == null) {
            object = new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw object;
        }
        if (string3 != null && (string3 = ((zzbo)object).zzb) != null) {
            object = new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
            throw object;
        }
        this.zzf = object;
        this.zzg = string2;
        this.zzh = object2;
        this.zzl = bl2;
    }

    public /* synthetic */ zzbi(zzbo zzbo2, String string2, Object object, boolean bl2, zzbn zzbn2) {
        this(zzbo2, string2, object, bl2);
    }

    public static /* synthetic */ zzbi zza(zzbo zzbo2, String string2, Object object, zzbp zzbp2, boolean bl2) {
        return zzbi.zzb(zzbo2, string2, object, zzbp2, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Object zza(zzbr object) {
        int n3;
        Object object2;
        block8: {
            Object object3;
            block7: {
                object2 = this.zzf;
                n3 = ((zzbo)object2).zzg;
                if (n3 != 0) break block7;
                object2 = zzbd.zza(((zzbr)object).zza());
                object3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype";
                if ((object2 = (String)((zzbd)object2).zza((String)object3)) != null && (n3 = ((Matcher)(object2 = ((Pattern)(object3 = zzaq.zzb)).matcher((CharSequence)object2))).matches()) != 0) break block8;
            }
            if ((object2 = this.zzf.zzb) != null) {
                object2 = ((zzbr)object).zza();
                n3 = zzbg.zza((Context)object2, (Uri)(object3 = this.zzf.zzb));
                if (n3 == 0) return null;
                object2 = this.zzf;
                n3 = ((zzbo)object2).zzh;
                if (n3 != 0) {
                    object2 = ((zzbr)object).zza().getContentResolver();
                    object3 = this.zzf.zzb.getLastPathSegment();
                    object = ((zzbr)object).zza().getPackageName();
                    int n4 = lE2.a(lE2.a(1, (String)object3), (String)object);
                    StringBuilder stringBuilder = new StringBuilder(n4);
                    stringBuilder.append((String)object3);
                    object3 = "#";
                    stringBuilder.append((String)object3);
                    stringBuilder.append((String)object);
                    object = zzbj.zza(stringBuilder.toString());
                    object = zzau.zza((ContentResolver)object2, (Uri)object);
                } else {
                    object = ((zzbr)object).zza().getContentResolver();
                    object2 = this.zzf.zzb;
                    object = zzau.zza((ContentResolver)object, (Uri)object2);
                }
            } else {
                object = ((zzbr)object).zza();
                object2 = this.zzf.zza;
                object = zzbq.zza((Context)object, (String)object2);
            }
            if (object == null) return null;
            object2 = this.zzb();
            if ((object = object.zza((String)object2)) == null) return null;
            return this.zza(object);
        }
        object = "PhenotypeFlag";
        n3 = 3;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        if (!bl2) return null;
        object = String.valueOf(this.zzb());
        n3 = ((String)object).length();
        if (n3 == 0) return null;
        object2 = "Bypass reading Phenotype values for flag: ";
        ((String)object2).concat((String)object);
        return null;
    }

    private final String zza(String string2) {
        boolean bl2;
        if (string2 != null && (bl2 = string2.isEmpty())) {
            return this.zzg;
        }
        string2 = String.valueOf(string2);
        String string3 = String.valueOf(this.zzg);
        int n3 = string3.length();
        if (n3 != 0) {
            return string2.concat(string3);
        }
        string3 = new String(string2);
        return string3;
    }

    public static void zza() {
        zzi.incrementAndGet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zza(Context object) {
        Object object2 = zza;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Object object3 = zzb;
                        Object object4 = object.getApplicationContext();
                        if (object4 != null) {
                            object = object4;
                        }
                        if (object3 != null && (object3 = ((zzbr)object3).zza()) == object) break block5;
                        zzau.zzb();
                        zzbq.zza();
                        zzbd.zza();
                        object3 = new zzbl((Context)object);
                        object3 = zzdi.zza((zzdf)object3);
                        object4 = new zzav((Context)object, (zzdf)object3);
                        zzb = object4;
                        object = zzi;
                        ((AtomicInteger)object).incrementAndGet();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private static zzbi zzb(zzbo zzbo2, String string2, Object object, zzbp zzbp2, boolean bl2) {
        zzbm zzbm2 = new zzbm(zzbo2, string2, object, true, zzbp2);
        return zzbm2;
    }

    private final Object zzb(zzbr object) {
        Context context;
        boolean bl2;
        Object object2 = this.zzf;
        boolean bl3 = ((zzbo)object2).zze;
        if (!bl3 && ((object2 = ((zzbo)object2).zzi) == null || (bl2 = ((Boolean)(object2 = (Boolean)object2.zza(context = ((zzbr)object).zza()))).booleanValue()))) {
            object = zzbd.zza(((zzbr)object).zza());
            object2 = this.zzf;
            bl3 = ((zzbo)object2).zze;
            if (bl3) {
                bl2 = false;
                object2 = null;
            } else {
                object2 = ((zzbo)object2).zzc;
                object2 = this.zza((String)object2);
            }
            object = object.zza((String)object2);
            if (object != null) {
                return this.zza(object);
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzb(Context context) {
        Object object = zzb;
        if (object != null) {
            return;
        }
        object = zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        zzbr zzbr2 = zzb;
                        if (zzbr2 != null) break block4;
                        zzbi.zza(context);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static final /* synthetic */ zzcy zzc(Context context) {
        new zzbh();
        return zzbh.zza(context);
    }

    public static final /* synthetic */ boolean zzd() {
        return true;
    }

    public abstract Object zza(Object var1);

    public final String zzb() {
        String string2 = this.zzf.zzd;
        return this.zza(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzc() {
        int n3;
        Object object;
        Object object2;
        int n4 = this.zzl;
        if (n4 == 0) {
            object2 = zze;
            object = this.zzg;
            n4 = (int)(((zzbs)object2).zza((String)object) ? 1 : 0);
            object = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.";
            zzde.zzb(n4 != 0, object);
        }
        if ((n3 = this.zzj) >= (n4 = ((AtomicInteger)(object2 = zzi)).get())) return this.zzk;
        synchronized (this) {
            Throwable throwable2;
            block9: {
                String string2;
                Object object3;
                block8: {
                    block7: {
                        try {
                            boolean bl2;
                            n3 = this.zzj;
                            if (n3 >= n4) return this.zzk;
                            object = zzb;
                            if (object != null) {
                                bl2 = true;
                            } else {
                                bl2 = false;
                                object3 = null;
                            }
                            string2 = "Must call PhenotypeFlag.init() first";
                            zzde.zzb(bl2, string2);
                            object3 = this.zzf;
                            bl2 = ((zzbo)object3).zzf;
                            if (!(bl2 ? (object3 = this.zzb((zzbr)object)) != null || (object3 = this.zza((zzbr)object)) != null : (object3 = this.zza((zzbr)object)) != null || (object3 = this.zzb((zzbr)object)) != null)) break block7;
                            break block8;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    object3 = this.zzh;
                }
                object = ((zzbr)object).zzb();
                object = object.zza();
                boolean bl3 = ((zzcy)(object = (zzcy)object)).zza();
                if (bl3) {
                    object = ((zzcy)object).zzb();
                    object = (zzbe)object;
                    object3 = this.zzf;
                    string2 = ((zzbo)object3).zzb;
                    String string3 = ((zzbo)object3).zza;
                    object3 = ((zzbo)object3).zzd;
                    String string4 = this.zzg;
                    object3 = (object = ((zzbe)object).zza((Uri)string2, string3, (String)object3, string4)) == null ? this.zzh : this.zza(object);
                }
                this.zzk = object3;
                this.zzj = n4;
                return this.zzk;
            }
            throw throwable2;
        }
    }
}

