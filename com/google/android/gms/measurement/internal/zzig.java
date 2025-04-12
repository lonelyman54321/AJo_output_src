/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteException
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzap;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzga;
import com.google.android.gms.measurement.internal.zzgf;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzif;
import com.google.android.gms.measurement.internal.zzih;
import com.google.android.gms.measurement.internal.zzii;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zzio;
import com.google.android.gms.measurement.internal.zzip;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zzis;
import com.google.android.gms.measurement.internal.zzit;
import com.google.android.gms.measurement.internal.zziu;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zziw;
import com.google.android.gms.measurement.internal.zzix;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zziz;
import com.google.android.gms.measurement.internal.zzja;
import com.google.android.gms.measurement.internal.zzjb;
import com.google.android.gms.measurement.internal.zzjc;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjg;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzop;
import com.google.android.gms.measurement.internal.zzor;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpm;
import com.google.android.gms.measurement.internal.zzpn;
import com.google.android.gms.measurement.internal.zzpo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzig
extends zzfy {
    private final zzou zza;
    private Boolean zzb;
    private String zzc;

    public zzig(zzou zzou2) {
        this(zzou2, null);
    }

    private zzig(zzou zzou2, String string2) {
        Preconditions.checkNotNull(zzou2);
        this.zza = zzou2;
        this.zzc = null;
    }

    public static /* bridge */ /* synthetic */ zzou zza(zzig zzig2) {
        return zzig2.zza;
    }

    public static /* synthetic */ void zza(zzig object, Bundle bundle, String objectArray, zzp object2) {
        zzjf zzjf2 = ((zzig)object).zza.zze();
        Object object3 = zzbn.zzcx;
        boolean bl2 = ((zzai)zzjf2).zza((zzfx)object3);
        object3 = ((zzig)object).zza.zze();
        zzfx zzfx2 = zzbn.zzcz;
        boolean bl3 = ((zzai)object3).zza(zzfx2);
        boolean bl4 = bundle.isEmpty();
        if (bl4 && bl2) {
            object = ((zzig)object).zza.zzf();
            ((zzjf)object).zzv();
            ((zzot)object).zzam();
            try {
                bundle = ((zzar)object).f_();
                object2 = "delete from default_event_params where app_id=?";
            }
            catch (SQLiteException sQLiteException) {
                ((zzjf)object).zzj().zzg().zza("Error clearing default event params", (Object)sQLiteException);
                return;
            }
            objectArray = new String[]{objectArray};
            bundle.execSQL((String)object2, objectArray);
            return;
        }
        ((zzig)object).zza.zzf().zza((String)objectArray, bundle);
        zzjf2 = ((zzig)object).zza.zzf();
        long l2 = ((zzp)object2).zzae;
        bl2 = ((zzar)zzjf2).zza((String)objectArray, l2);
        if (bl2) {
            bl2 = false;
            zzjf2 = null;
            if (bl3) {
                object = ((zzig)object).zza.zzf();
                object2 = ((zzp)object2).zzae;
                ((zzar)object).zza((String)objectArray, (Long)object2, null, bundle);
                return;
            }
            object = ((zzig)object).zza.zzf();
            ((zzar)object).zza((String)objectArray, null, null, bundle);
        }
    }

    public static /* synthetic */ void zza(zzig zzig2, zzp zzp2) {
        zzig2.zza.zzs();
        zzig2.zza.zzg(zzp2);
    }

    public static /* synthetic */ void zza(zzig zzig2, zzp object, Bundle bundle, zzga zzga2, String string2) {
        zzig2.zza.zzs();
        zzou zzou2 = zzig2.zza;
        object = zzou2.zza((zzp)object, bundle);
        try {
            zzga2.zza((List)object);
            return;
        }
        catch (RemoteException remoteException) {
            zzig2.zza.zzj().zzg().zza("Failed to return trigger URIs for app", string2, (Object)remoteException);
            return;
        }
    }

    public static /* synthetic */ void zza(zzig object, zzp object2, zzae zzae2) {
        ((zzig)object).zza.zzs();
        object = ((zzig)object).zza;
        object2 = (String)Preconditions.checkNotNull(((zzp)object2).zza);
        ((zzou)object).zza((String)object2, zzae2);
    }

    public static /* synthetic */ void zza(zzig zzig2, String string2, zzop abstractSafeParcelable, zzgf zzgf2) {
        zzig2.zza.zzs();
        zzou zzou2 = zzig2.zza;
        abstractSafeParcelable = zzou2.zza(string2, (zzop)abstractSafeParcelable);
        try {
            zzgf2.zza((zzor)abstractSafeParcelable);
            return;
        }
        catch (RemoteException remoteException) {
            zzig2.zza.zzj().zzg().zza("[sgtm] Failed to return upload batches for app", string2, (Object)remoteException);
            return;
        }
    }

    private final void zza(Runnable runnable2) {
        Preconditions.checkNotNull(runnable2);
        zzhv zzhv2 = this.zza.zzl();
        boolean bl2 = zzhv2.zzm();
        if (bl2) {
            runnable2.run();
            return;
        }
        this.zza.zzl().zzc(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zza(String object, boolean bl2) {
        SecurityException securityException2;
        Object object2;
        block12: {
            block14: {
                CharSequence charSequence;
                Object object3;
                int n3;
                block13: {
                    block9: {
                        block11: {
                            block10: {
                                object2 = "Unknown calling package name '";
                                n3 = TextUtils.isEmpty((CharSequence)object);
                                if (n3 != 0) {
                                    object = this.zza.zzj().zzg();
                                    String string2 = "Measurement Service called without app package";
                                    ((zzgq)object).zza(string2);
                                    object = new SecurityException(string2);
                                    throw object;
                                }
                                if (!bl2) break block13;
                                try {
                                    object3 = this.zzb;
                                    if (object3 != null) break block9;
                                    object3 = "com.google.android.gms";
                                    charSequence = this.zzc;
                                    bl2 = ((String)object3).equals(charSequence);
                                    if (bl2) break block10;
                                    object3 = this.zza;
                                    bl2 = UidVerifier.isGooglePlayServicesUid((Context)(object3 = ((zzou)object3).zza()), n3 = Binder.getCallingUid());
                                    if (bl2) break block10;
                                    object3 = this.zza;
                                    object3 = ((zzou)object3).zza();
                                    bl2 = ((GoogleSignatureVerifier)(object3 = GoogleSignatureVerifier.getInstance((Context)object3))).isUidGoogleSigned(n3 = Binder.getCallingUid());
                                    if (bl2) break block10;
                                    bl2 = false;
                                    object3 = null;
                                    break block11;
                                }
                                catch (SecurityException securityException2) {
                                    break block12;
                                }
                            }
                            bl2 = true;
                        }
                        this.zzb = object3 = Boolean.valueOf(bl2);
                    }
                    if (bl2 = ((Boolean)(object3 = this.zzb)).booleanValue()) break block14;
                }
                if ((object3 = this.zzc) == null) {
                    object3 = this.zza;
                    bl2 = GooglePlayServicesUtilLight.uidHasPackageName((Context)(object3 = ((zzou)object3).zza()), n3 = Binder.getCallingUid(), (String)object);
                    if (bl2) {
                        this.zzc = object;
                    }
                }
                if (!(bl2 = ((String)object).equals(object3 = this.zzc))) {
                    charSequence = new StringBuilder((String)object2);
                    ((StringBuilder)charSequence).append((String)object);
                    object2 = "'.";
                    ((StringBuilder)charSequence).append((String)object2);
                    object2 = ((StringBuilder)charSequence).toString();
                    object3 = new SecurityException((String)object2);
                    throw object3;
                }
            }
            return;
        }
        object2 = this.zza.zzj().zzg();
        object = zzgo.zza((String)object);
        ((zzgq)object2).zza("Measurement Service called with invalid calling package. appId", object);
        throw securityException2;
    }

    public static /* synthetic */ void zzb(zzig zzig2, zzp zzp2) {
        zzig2.zza.zzs();
        zzig2.zza.zzf(zzp2);
    }

    private final void zzb(zzp object, boolean bl2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotEmpty(((zzp)object).zza);
        Object object2 = ((zzp)object).zza;
        this.zza((String)object2, false);
        object2 = this.zza.zzq();
        String string2 = ((zzp)object).zzb;
        object = ((zzp)object).zzp;
        ((zzpn)object2).zza(string2, (String)object);
    }

    private final void zzb(Runnable runnable2) {
        Preconditions.checkNotNull(runnable2);
        zzhv zzhv2 = this.zza.zzl();
        boolean bl2 = zzhv2.zzm();
        if (bl2) {
            runnable2.run();
            return;
        }
        this.zza.zzl().zzb(runnable2);
    }

    private final void zzd(zzbl zzbl2, zzp zzp2) {
        this.zza.zzs();
        this.zza.zza(zzbl2, zzp2);
    }

    /*
     * WARNING - void declaration
     */
    public final zzap zza(zzp object) {
        void var2_6;
        this.zzb((zzp)object, false);
        Preconditions.checkNotEmpty(((zzp)object).zza);
        Object object2 = this.zza.zzl();
        Object object3 = new zzja(this, (zzp)object);
        object2 = ((zzhv)object2).zzb((Callable)object3);
        object3 = TimeUnit.MILLISECONDS;
        long l2 = 10000L;
        object2 = object2.get(l2, (TimeUnit)((Object)object3));
        try {
            return (zzap)object2;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (TimeoutException timeoutException) {
            // empty catch block
        }
        object3 = this.zza.zzj().zzg();
        object = zzgo.zza(((zzp)object).zza);
        ((zzgq)object3).zza("Failed to get consent. appId", object, var2_6);
        object = new zzap(null);
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public final List zza(zzp object, Bundle object2) {
        void var2_9;
        this.zzb((zzp)object, false);
        Preconditions.checkNotNull(((zzp)object).zza);
        Object object3 = this.zza.zze();
        Object object4 = zzbn.zzdc;
        boolean bl2 = ((zzai)object3).zza((zzfx)object4);
        object4 = "Failed to get trigger URIs. appId";
        if (bl2) {
            void var2_6;
            object3 = this.zza.zzl();
            zzjd zzjd2 = new zzjd(this, (zzp)object, (Bundle)object2);
            object2 = ((zzhv)object3).zzb(zzjd2);
            object3 = TimeUnit.MILLISECONDS;
            long l2 = 10000L;
            object2 = object2.get(l2, (TimeUnit)((Object)object3));
            try {
                return (List)object2;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {
            }
            catch (TimeoutException timeoutException) {
                // empty catch block
            }
            object3 = this.zza.zzj().zzg();
            object = zzgo.zza(((zzp)object).zza);
            ((zzgq)object3).zza((String)object4, object, var2_6);
            return Collections.emptyList();
        }
        object3 = this.zza.zzl();
        zzjg zzjg2 = new zzjg(this, (zzp)object, (Bundle)object2);
        object2 = ((zzhv)object3).zza(zzjg2);
        object2 = object2.get();
        try {
            return (List)object2;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        object3 = this.zza.zzj().zzg();
        object = zzgo.zza(((zzp)object).zza);
        ((zzgq)object3).zza((String)object4, object, var2_9);
        return Collections.emptyList();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zza(zzp object, boolean bl2) {
        int n3;
        Object object2;
        ArrayList<Object> arrayList;
        Iterator iterator;
        block5: {
            void var9_11;
            this.zzb((zzp)object, false);
            iterator = ((zzp)object).zza;
            Preconditions.checkNotNull(iterator);
            arrayList = this.zza.zzl();
            object2 = new zzio(this, (String)((Object)iterator));
            iterator = ((zzhv)((Object)arrayList)).zza((Callable)object2);
            try {
                iterator = iterator.get();
                iterator = (List)((Object)iterator);
                n3 = iterator.size();
                arrayList = new ArrayList<Object>(n3);
                iterator = iterator.iterator();
                break block5;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {}
            iterator = this.zza.zzj().zzg();
            object = zzgo.zza(((zzp)object).zza);
            ((zzgq)((Object)iterator)).zza("Failed to get user properties. appId", object, var9_11);
            return null;
        }
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object3;
            boolean bl3;
            object2 = iterator.next();
            object2 = (zzpo)object2;
            if (!bl2 && (bl3 = zzpn.zzf((String)(object3 = ((zzpo)object2).zzc)))) continue;
            object3 = new zzpm((zzpo)object2);
            arrayList.add(object3);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public final List zza(String object, String string2, zzp object2) {
        void var1_4;
        this.zzb((zzp)object2, false);
        object2 = ((zzp)object2).zza;
        Preconditions.checkNotNull(object2);
        zzhv zzhv2 = this.zza.zzl();
        zziw zziw2 = new zziw(this, (String)object2, (String)object, string2);
        object = zzhv2.zza(zziw2);
        object = object.get();
        try {
            return (List)object;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.zza.zzj().zzg().zza("Failed to get conditional user properties", var1_4);
        return Collections.emptyList();
    }

    /*
     * WARNING - void declaration
     */
    public final List zza(String object, String string2, String string3) {
        void var1_4;
        boolean bl2 = true;
        this.zza((String)object, bl2);
        zzhv zzhv2 = this.zza.zzl();
        zziv zziv2 = new zziv(this, (String)object, string2, string3);
        object = zzhv2.zza(zziv2);
        object = object.get();
        try {
            return (List)object;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.zza.zzj().zzg().zza("Failed to get conditional user properties as", var1_4);
        return Collections.emptyList();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zza(String object, String iterator, String arrayList, boolean bl2) {
        Object object2;
        Object object3;
        int n3;
        block5: {
            void var2_5;
            n3 = 1;
            this.zza((String)object, n3 != 0);
            object3 = this.zza.zzl();
            object2 = new zzit(this, (String)object, (String)((Object)iterator), (String)((Object)arrayList));
            iterator = ((zzhv)object3).zza((Callable)object2);
            try {
                iterator = iterator.get();
                iterator = (List)((Object)iterator);
                n3 = iterator.size();
                arrayList = new ArrayList<Object>(n3);
                iterator = iterator.iterator();
                break block5;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {}
            arrayList = this.zza.zzj().zzg();
            object = zzgo.zza((String)object);
            ((zzgq)((Object)arrayList)).zza("Failed to get user properties as. appId", object, var2_5);
            return Collections.emptyList();
        }
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            boolean bl3;
            object3 = iterator.next();
            object3 = (zzpo)object3;
            if (!bl2 && (bl3 = zzpn.zzf((String)(object2 = ((zzpo)object3).zzc)))) continue;
            object2 = new zzpm((zzpo)object3);
            arrayList.add(object2);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zza(String iterator, String arrayList, boolean bl2, zzp zzp2) {
        Object object;
        Object object2;
        int n3;
        block5: {
            void var1_4;
            n3 = 0;
            this.zzb(zzp2, false);
            object2 = zzp2.zza;
            Preconditions.checkNotNull(object2);
            object = this.zza.zzl();
            zziu zziu2 = new zziu(this, (String)object2, (String)((Object)iterator), (String)((Object)arrayList));
            iterator = ((zzhv)object).zza(zziu2);
            try {
                iterator = iterator.get();
                iterator = (List)((Object)iterator);
                n3 = iterator.size();
                arrayList = new ArrayList<Object>(n3);
                iterator = iterator.iterator();
                break block5;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {}
            arrayList = this.zza.zzj().zzg();
            Object object3 = zzgo.zza(zzp2.zza);
            ((zzgq)((Object)arrayList)).zza("Failed to query user properties. appId", object3, var1_4);
            return Collections.emptyList();
        }
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            boolean bl3;
            object2 = iterator.next();
            object2 = (zzpo)object2;
            if (!bl2 && (bl3 = zzpn.zzf((String)(object = ((zzpo)object2).zzc)))) continue;
            object = new zzpm((zzpo)object2);
            arrayList.add(object);
        }
        return arrayList;
    }

    public final void zza(long l2, String string2, String string3, String string4) {
        zzip zzip2 = new zzip(this, string3, string4, string2, l2);
        this.zzb(zzip2);
    }

    public final void zza(Bundle bundle, zzp zzp2) {
        this.zzb(zzp2, false);
        String string2 = zzp2.zza;
        Preconditions.checkNotNull(string2);
        zzim zzim2 = new zzim(this, bundle, string2, zzp2);
        this.zzb(zzim2);
    }

    public final void zza(zzag object) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(((zzag)object).zzc);
        Preconditions.checkNotEmpty(((zzag)object).zza);
        Object object2 = ((zzag)object).zza;
        this.zza((String)object2, true);
        object2 = new zzag((zzag)object);
        object = new zzir(this, (zzag)object2);
        this.zzb((Runnable)object);
    }

    public final void zza(zzag object, zzp zzp2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(((zzag)object).zzc);
        this.zzb(zzp2, false);
        zzag zzag2 = new zzag((zzag)object);
        zzag2.zza = object = zzp2.zza;
        object = new zzis(this, zzag2, zzp2);
        this.zzb((Runnable)object);
    }

    public final void zza(zzbl zzbl2, zzp zzp2) {
        Preconditions.checkNotNull(zzbl2);
        this.zzb(zzp2, false);
        zziz zziz2 = new zziz(this, zzbl2, zzp2);
        this.zzb(zziz2);
    }

    public final void zza(zzbl zzbl2, String string2, String object) {
        Preconditions.checkNotNull(zzbl2);
        Preconditions.checkNotEmpty(string2);
        this.zza(string2, true);
        object = new zzjc(this, zzbl2, string2);
        this.zzb((Runnable)object);
    }

    public final void zza(zzp zzp2, Bundle bundle, zzga zzga2) {
        Object object;
        this.zzb(zzp2, false);
        Object object2 = object = Preconditions.checkNotNull(zzp2.zza);
        object2 = (String)object;
        object = this.zza.zzl();
        zzii zzii2 = new zzii(this, zzp2, bundle, zzga2, (String)object2);
        ((zzhv)object).zzb(zzii2);
    }

    public final void zza(zzp zzp2, zzae zzae2) {
        zzfx zzfx2;
        Object object = this.zza.zze();
        boolean bl2 = ((zzai)object).zza(zzfx2 = zzbn.zzcj);
        if (!bl2) {
            return;
        }
        this.zzb(zzp2, false);
        object = new zzif(this, zzp2, zzae2);
        this.zzb((Runnable)object);
    }

    public final void zza(zzp object, zzop zzop2, zzgf zzgf2) {
        Object object2;
        zzjf zzjf2 = this.zza.zze();
        boolean bl2 = ((zzai)zzjf2).zza((zzfx)(object2 = zzbn.zzcj));
        if (!bl2) {
            return;
        }
        this.zzb((zzp)object, false);
        object = (String)Preconditions.checkNotNull(((zzp)object).zza);
        zzjf2 = this.zza.zzl();
        object2 = new zzik(this, (String)object, zzop2, zzgf2);
        ((zzhv)zzjf2).zzb((Runnable)object2);
    }

    public final void zza(zzpm zzpm2, zzp zzp2) {
        Preconditions.checkNotNull(zzpm2);
        this.zzb(zzp2, false);
        zzje zzje2 = new zzje(this, zzpm2, zzp2);
        this.zzb(zzje2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zza(zzbl object, String object2) {
        void var4_7;
        Object object3;
        Object object4;
        block5: {
            Object object5;
            Object object6;
            long l2;
            long l3;
            Object object7;
            block4: {
                Preconditions.checkNotEmpty((String)object2);
                Preconditions.checkNotNull(object);
                boolean bl2 = true;
                this.zza((String)object2, bl2);
                object7 = this.zza.zzj().zzc();
                object4 = this.zza.zzg();
                object3 = ((zzbl)object).zza;
                object4 = ((zzgl)object4).zza((String)object3);
                object3 = "Log and bundle. event";
                ((zzgq)object7).zza((String)object3, object4);
                object7 = this.zza.zzb();
                l3 = object7.nanoTime();
                l2 = 1000000L;
                l3 /= l2;
                object6 = this.zza.zzl();
                object5 = new zzjb(this, (zzbl)object, (String)object2);
                object6 = ((zzhv)object6).zzb((Callable)object5);
                try {
                    object6 = object6.get();
                    object6 = (byte[])object6;
                    if (object6 != null) break block4;
                    object6 = this.zza;
                    object6 = ((zzou)object6).zzj();
                    object6 = ((zzgo)object6).zzg();
                    object5 = "Log and bundle returned null. appId";
                    Object object8 = zzgo.zza((String)object2);
                    ((zzgq)object6).zza((String)object5, object8);
                    object6 = null;
                    object6 = new byte[0];
                }
                catch (ExecutionException executionException) {
                    break block5;
                }
                catch (InterruptedException interruptedException) {
                    break block5;
                }
            }
            object5 = this.zza;
            object5 = ((zzou)object5).zzb();
            long l4 = object5.nanoTime();
            l4 /= l2;
            object3 = this.zza;
            object3 = ((zzou)object3).zzj();
            object3 = ((zzgo)object3).zzc();
            String string2 = "Log and bundle processed. event, size, time_ms";
            Object object9 = this.zza;
            object9 = ((zzou)object9).zzg();
            Object object10 = ((zzbl)object).zza;
            object9 = ((zzgl)object9).zza((String)object10);
            int n3 = ((Object)object6).length;
            object10 = n3;
            object7 = l4 -= l3;
            ((zzgq)object3).zza(string2, object9, object10, object7);
            return object6;
        }
        object4 = this.zza.zzj().zzg();
        object2 = zzgo.zza((String)object2);
        object3 = this.zza.zzg();
        object = ((zzbl)object).zza;
        object = ((zzgl)object3).zza((String)object);
        ((zzgq)object4).zza("Failed to log and bundle. appId, event, error", object2, object, var4_7);
        return null;
    }

    public final zzbl zzb(zzbl zzbl2, zzp object) {
        boolean bl2;
        String string2 = "_cmp";
        object = zzbl2.zza;
        int n3 = string2.equals(object);
        if (n3 != 0 && (object = zzbl2.zzb) != null && (n3 = ((zzbg)object).zza()) != 0 && ((bl2 = (string2 = "referrer broadcast").equals(object = zzbl2.zzb.zzd("_cis"))) || (n3 = (int)((string2 = "referrer API").equals(object) ? 1 : 0)) != 0)) {
            object = this.zza.zzj().zzp();
            String string3 = zzbl2.toString();
            ((zzgq)object).zza("Event has been filtered ", string3);
            zzbg zzbg2 = zzbl2.zzb;
            String string4 = zzbl2.zzc;
            long l2 = zzbl2.zzd;
            object = new zzbl("_cmpx", zzbg2, string4, l2);
            return object;
        }
        return zzbl2;
    }

    public final String zzb(zzp zzp2) {
        this.zzb(zzp2, false);
        return this.zza.zzb(zzp2);
    }

    public final void zzc(zzbl object, zzp zzp2) {
        boolean bl2;
        Object object2;
        boolean bl3;
        Object object3;
        Object object4;
        block22: {
            object4 = this.zza.zzi();
            bl3 = ((zzhm)object4).zzk((String)(object3 = zzp2.zza));
            if (!bl3) {
                this.zzd((zzbl)object, zzp2);
                return;
            }
            object4 = this.zza.zzj().zzq();
            object2 = zzp2.zza;
            ((zzgq)object4).zza("EES config found for", object2);
            object4 = this.zza.zzi();
            object3 = zzp2.zza;
            boolean bl4 = TextUtils.isEmpty((CharSequence)object3);
            if (bl4) {
                bl3 = false;
                object4 = null;
            } else {
                object4 = (zzb)((zzhm)object4).zza.get(object3);
            }
            if (object4 == null) {
                object4 = this.zza.zzj().zzq();
                object2 = zzp2.zza;
                ((zzgq)object4).zza("EES not loaded for", object2);
                this.zzd((zzbl)object, zzp2);
                return;
            }
            object3 = this.zza;
            object3 = ((zzou)object3).zzp();
            object2 = ((zzbl)object).zzb;
            object2 = ((zzbg)object2).zzb();
            boolean bl5 = true;
            object3 = ((zzpj)object3).zza((Bundle)object2, bl5);
            object2 = ((zzbl)object).zza;
            object2 = zzjp.zza((String)object2);
            if (object2 != null) break block22;
            object2 = ((zzbl)object).zza;
        }
        long l2 = ((zzbl)object).zzd;
        Object object5 = new zzad((String)object2, l2, (Map)object3);
        try {
            bl2 = ((zzb)object4).zza((zzad)object5);
        }
        catch (zzc zzc2) {
            object3 = this.zza.zzj().zzg();
            object2 = zzp2.zzb;
            object5 = ((zzbl)object).zza;
            String string2 = "EES error. appId, eventName";
            ((zzgq)object3).zza(string2, object2, object5);
            bl2 = false;
            object3 = null;
        }
        if (!bl2) {
            object4 = this.zza.zzj().zzq();
            object3 = ((zzbl)object).zza;
            ((zzgq)object4).zza("EES was not applied to event", object3);
            this.zzd((zzbl)object, zzp2);
            return;
        }
        bl2 = ((zzb)object4).zzc();
        if (bl2) {
            object3 = this.zza.zzj().zzq();
            object2 = "EES edited event";
            object = ((zzbl)object).zza;
            ((zzgq)object3).zza((String)object2, object);
            object = this.zza.zzp();
            object3 = ((zzb)object4).zza().zzb();
            object = ((zzpj)object).zza((zzad)object3);
            this.zzd((zzbl)object, zzp2);
        } else {
            this.zzd((zzbl)object, zzp2);
        }
        boolean bl6 = ((zzb)object4).zzb();
        if (bl6) {
            object = ((zzb)object4).zza().zzc().iterator();
            while (bl3 = object.hasNext()) {
                object4 = (zzad)object.next();
                object3 = this.zza.zzj().zzq();
                object2 = ((zzad)object4).zzb();
                object5 = "EES logging created event";
                ((zzgq)object3).zza((String)object5, object2);
                object3 = this.zza.zzp();
                object4 = ((zzpj)object3).zza((zzad)object4);
                this.zzd((zzbl)object4, zzp2);
            }
        }
    }

    public final void zzc(zzp zzp2) {
        this.zzb(zzp2, false);
        zziq zziq2 = new zziq(this, zzp2);
        this.zzb(zziq2);
    }

    public final void zzd(zzp zzp2) {
        this.zzb(zzp2, false);
        zzin zzin2 = new zzin(this, zzp2);
        this.zzb(zzin2);
    }

    public final void zze(zzp zzp2) {
        Preconditions.checkNotEmpty(zzp2.zza);
        Object object = zzp2.zza;
        this.zza((String)object, false);
        object = new zzix(this, zzp2);
        this.zzb((Runnable)object);
    }

    public final void zzf(zzp zzp2) {
        Preconditions.checkNotEmpty(zzp2.zza);
        Preconditions.checkNotNull(zzp2.zzt);
        zziy zziy2 = new zziy(this, zzp2);
        this.zza(zziy2);
    }

    public final void zzg(zzp zzp2) {
        Preconditions.checkNotEmpty(zzp2.zza);
        Preconditions.checkNotNull(zzp2.zzt);
        zzij zzij2 = new zzij(this, zzp2);
        this.zza(zzij2);
    }

    public final void zzh(zzp zzp2) {
        this.zzb(zzp2, false);
        zzil zzil2 = new zzil(this, zzp2);
        this.zzb(zzil2);
    }

    public final void zzi(zzp zzp2) {
        Preconditions.checkNotEmpty(zzp2.zza);
        Preconditions.checkNotNull(zzp2.zzt);
        zzih zzih2 = new zzih(this, zzp2);
        this.zza(zzih2);
    }
}

