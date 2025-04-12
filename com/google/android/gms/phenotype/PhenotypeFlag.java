/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.net.Uri
 *  android.os.Binder
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.os.UserManager
 */
package com.google.android.gms.phenotype;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import com.google.android.gms.internal.phenotype.zzf;
import com.google.android.gms.internal.phenotype.zzh;
import com.google.android.gms.phenotype.PhenotypeFlag$Factory;
import com.google.android.gms.phenotype.PhenotypeFlag$zza;
import com.google.android.gms.phenotype.zza;
import com.google.android.gms.phenotype.zzo;
import com.google.android.gms.phenotype.zzp;
import com.google.android.gms.phenotype.zzq;
import com.google.android.gms.phenotype.zzr;
import com.google.android.gms.phenotype.zzs;

public abstract class PhenotypeFlag {
    private static final Object zzak;
    private static Context zzal;
    private static boolean zzam = false;
    private static Boolean zzan;
    private final PhenotypeFlag$Factory zzao;
    final String zzap;
    private final String zzaq;
    private final Object zzar;
    private Object zzas;

    static {
        Object object;
        zzak = object = new Object();
    }

    private PhenotypeFlag(PhenotypeFlag$Factory object, String string2, Object object2) {
        int n3 = 0;
        this.zzas = null;
        String string3 = PhenotypeFlag$Factory.zza((PhenotypeFlag$Factory)object);
        if (string3 == null && (string3 = PhenotypeFlag$Factory.zzb((PhenotypeFlag$Factory)object)) == null) {
            object = new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw object;
        }
        string3 = PhenotypeFlag$Factory.zza((PhenotypeFlag$Factory)object);
        if (string3 != null && (string3 = PhenotypeFlag$Factory.zzb((PhenotypeFlag$Factory)object)) != null) {
            object = new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
            throw object;
        }
        this.zzao = object;
        string3 = String.valueOf(PhenotypeFlag$Factory.zzc((PhenotypeFlag$Factory)object));
        String string4 = String.valueOf(string2);
        int n4 = string4.length();
        string3 = n4 != 0 ? string3.concat(string4) : (string4 = new String(string3));
        this.zzaq = string3;
        object = String.valueOf(PhenotypeFlag$Factory.zzd((PhenotypeFlag$Factory)object));
        string2 = String.valueOf(string2);
        n3 = string2.length();
        if (n3 != 0) {
            object = ((String)object).concat(string2);
        } else {
            string2 = new String((String)object);
            object = string2;
        }
        this.zzap = object;
        this.zzar = object2;
    }

    public /* synthetic */ PhenotypeFlag(PhenotypeFlag$Factory phenotypeFlag$Factory, String string2, Object object, zzr zzr2) {
        this(phenotypeFlag$Factory, string2, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void maybeInit(Context context) {
        zzh.maybeInit(context);
        Object object = zzal;
        if (object != null) return;
        zzh.init(context);
        object = zzak;
        synchronized (object) {
            try {
                Context context2;
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 24;
                if ((n3 < n4 || (n3 = (int)(mI3.a(context) ? 1 : 0)) == 0) && (context2 = context.getApplicationContext()) != null) {
                    context = context2;
                }
                if ((context2 = zzal) != context) {
                    n3 = 0;
                    context2 = null;
                    zzan = null;
                }
                zzal = context;
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl17 : MonitorExitStatement: MONITOREXIT : var1_2 /* !! */ 
                context = null;
                zzam = false;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static PhenotypeFlag zza(PhenotypeFlag$Factory phenotypeFlag$Factory, String string2, String string3) {
        zzs zzs2 = new zzs(phenotypeFlag$Factory, string2, string3);
        return zzs2;
    }

    private static Object zza(PhenotypeFlag$zza object) {
        long l2;
        try {
            object = object.zzh();
        }
        catch (SecurityException securityException) {
            l2 = Binder.clearCallingIdentity();
            object = object.zzh();
            return object;
        }
        return object;
        {
            finally {
                Binder.restoreCallingIdentity((long)l2);
            }
        }
    }

    public static boolean zza(String string2, boolean bl2) {
        bl2 = PhenotypeFlag.zzf();
        if (bl2) {
            zzq zzq2 = new zzq(string2, false);
            return (Boolean)PhenotypeFlag.zza(zzq2);
        }
        return false;
    }

    public static /* synthetic */ PhenotypeFlag zzb(PhenotypeFlag$Factory phenotypeFlag$Factory, String string2, String string3) {
        return PhenotypeFlag.zza(phenotypeFlag$Factory, string2, string3);
    }

    public static final /* synthetic */ Boolean zzb(String string2, boolean bl2) {
        return zzf.zza(zzal.getContentResolver(), string2, bl2);
    }

    private final Object zzd() {
        Object object = "gms:phenotype:phenotype_flag:debug_bypass_phenotype";
        int n3 = 0;
        Object object2 = null;
        int n4 = PhenotypeFlag.zza((String)object, false);
        if (n4 == 0) {
            object = PhenotypeFlag$Factory.zzb(this.zzao);
            if (object != null) {
                object = zzal.getContentResolver();
                object2 = PhenotypeFlag$Factory.zzb(this.zzao);
                object = zza.zza((ContentResolver)object, (Uri)object2);
                object2 = new zzo(this, (zza)object);
                if ((object = (String)PhenotypeFlag.zza((PhenotypeFlag$zza)object2)) != null) {
                    return this.zza((String)object);
                }
            } else {
                object = PhenotypeFlag$Factory.zza(this.zzao);
                if (object != null) {
                    n4 = Build.VERSION.SDK_INT;
                    int n7 = 24;
                    if (n4 >= n7 && (n4 = (int)(mI3.a((Context)(object = zzal)) ? 1 : 0)) == 0 && (n4 = (int)(dk3_1.a((UserManager)(object = (UserManager)ck3_1.a(zzal))) ? 1 : 0)) == 0) {
                        return null;
                    }
                    object = zzal;
                    String string2 = PhenotypeFlag$Factory.zza(this.zzao);
                    n3 = (int)((object = object.getSharedPreferences(string2, 0)).contains((String)(object2 = this.zzap)) ? 1 : 0);
                    if (n3 != 0) {
                        return this.zza((SharedPreferences)object);
                    }
                }
            }
        } else {
            object = String.valueOf(this.zzap);
            n3 = ((String)object).length();
            if (n3 != 0) {
                object2 = "Bypass reading Phenotype values for flag: ";
                ((String)object2).concat((String)object);
            }
        }
        return null;
    }

    private final Object zze() {
        Object object = this.zzao;
        boolean bl2 = PhenotypeFlag$Factory.zzf((PhenotypeFlag$Factory)object);
        if (!bl2 && (bl2 = PhenotypeFlag.zzf())) {
            object = new zzp(this);
            if ((object = (String)PhenotypeFlag.zza((PhenotypeFlag$zza)object)) != null) {
                return this.zza((String)object);
            }
        }
        return null;
    }

    private static boolean zzf() {
        Boolean bl2 = zzan;
        if (bl2 == null) {
            bl2 = zzal;
            boolean bl3 = false;
            if (bl2 != null) {
                String string2;
                int n3;
                int n4 = Binder.getCallingPid();
                if (n4 == (n3 = Process.myPid())) {
                    string2 = bl2.getPackageName();
                } else {
                    n4 = 0;
                    string2 = null;
                }
                n3 = Binder.getCallingPid();
                int n7 = Binder.getCallingUid();
                String string3 = "com.google.android.providers.gsf.permission.READ_GSERVICES";
                int n8 = jq1_1.a((Context)bl2, string3, n3, n7, string2);
                if (n8 == 0) {
                    bl3 = true;
                }
                zzan = bl2 = Boolean.valueOf(bl3);
            } else {
                return false;
            }
        }
        return zzan;
    }

    public Object get() {
        Object object = zzal;
        if (object != null) {
            object = this.zzao;
            boolean bl2 = PhenotypeFlag$Factory.zze((PhenotypeFlag$Factory)object);
            if (bl2) {
                object = this.zze();
                if (object != null) {
                    return object;
                }
                object = this.zzd();
                if (object != null) {
                    return object;
                }
            } else {
                object = this.zzd();
                if (object != null) {
                    return object;
                }
                object = this.zze();
                if (object != null) {
                    return object;
                }
            }
            return this.zzar;
        }
        object = new IllegalStateException("Must call PhenotypeFlag.init() first");
        throw object;
    }

    public abstract Object zza(SharedPreferences var1);

    public abstract Object zza(String var1);

    public final /* synthetic */ String zzg() {
        ContentResolver contentResolver = zzal.getContentResolver();
        String string2 = this.zzaq;
        return zzf.zza(contentResolver, string2, null);
    }
}

