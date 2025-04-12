/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzap;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzmg;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zzmi;
import com.google.android.gms.measurement.internal.zzmj;
import com.google.android.gms.measurement.internal.zzmk;
import com.google.android.gms.measurement.internal.zzml;
import com.google.android.gms.measurement.internal.zzmm;
import com.google.android.gms.measurement.internal.zzmn;
import com.google.android.gms.measurement.internal.zzmo;
import com.google.android.gms.measurement.internal.zzmp;
import com.google.android.gms.measurement.internal.zzmq;
import com.google.android.gms.measurement.internal.zzmr;
import com.google.android.gms.measurement.internal.zzms;
import com.google.android.gms.measurement.internal.zzmt;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzmv;
import com.google.android.gms.measurement.internal.zzmw;
import com.google.android.gms.measurement.internal.zzmx;
import com.google.android.gms.measurement.internal.zzmy;
import com.google.android.gms.measurement.internal.zzmz;
import com.google.android.gms.measurement.internal.zzna;
import com.google.android.gms.measurement.internal.zznb;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zznd;
import com.google.android.gms.measurement.internal.zzne;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zzng;
import com.google.android.gms.measurement.internal.zznh;
import com.google.android.gms.measurement.internal.zznj;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzop;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpm;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class zzme
extends zzf {
    private final zznj zza;
    private zzfz zzb;
    private volatile Boolean zzc;
    private final zzbb zzd;
    private final zzoh zze;
    private final List zzf;
    private final zzbb zzg;

    public zzme(zzic zzic2) {
        super(zzic2);
        Object object = new ArrayList();
        this.zzf = object;
        Clock clock = zzic2.zzb();
        this.zze = object = new zzoh(clock);
        this.zza = object = new zznj(this);
        this.zzd = object = new zzmk(this, zzic2);
        this.zzg = object = new zzmx(this, zzic2);
    }

    public static /* bridge */ /* synthetic */ zzfz zza(zzme zzme2) {
        return zzme2.zzb;
    }

    public static /* synthetic */ void zza(zzme zzme2, ComponentName componentName) {
        zzme2.zzv();
        Object object = zzme2.zzb;
        if (object != null) {
            zzme2.zzb = null;
            object = zzme2.zzj().zzq();
            String string2 = "Disconnected from device MeasurementService";
            ((zzgq)object).zza(string2, componentName);
            zzme2.zzv();
            zzme2.zzag();
        }
    }

    public static /* bridge */ /* synthetic */ void zza(zzme zzme2, zzfz zzfz2) {
        zzme2.zzb = null;
    }

    public static /* synthetic */ void zza(zzme object, zzp zzp2, zzae object2) {
        zzfz zzfz2 = ((zzme)object).zzb;
        if (zzfz2 == null) {
            ((zzme)object).zzj().zzg().zza("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            zzfz2.zza(zzp2, (zzae)object2);
            ((zzme)object).zzar();
            return;
        }
        catch (RemoteException remoteException) {
            object = ((zzme)object).zzj().zzg();
            object2 = ((zzae)object2).zza;
            ((zzgq)object).zza("[sgtm] Failed to update batch upload status, rowId, exception", object2, (Object)remoteException);
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zza(zzme object, AtomicReference atomicReference, zzp object2, Bundle object3) {
        synchronized (atomicReference) {
            Throwable throwable2;
            block6: {
                block8: {
                    RemoteException remoteException2;
                    block7: {
                        zzfz zzfz2;
                        block9: {
                            zzfz2 = ((zzme)object).zzb;
                            if (zzfz2 == null) {
                                object2 = ((zzme)object).zzj();
                                object2 = ((zzgo)object2).zzg();
                                object3 = "Failed to request trigger URIs; not connected to service";
                                ((zzgq)object2).zza((String)object3);
                                return;
                            }
                            break block9;
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            catch (RemoteException remoteException2) {
                                break block7;
                            }
                        }
                        Preconditions.checkNotNull(object2);
                        zzmp zzmp2 = new zzmp((zzme)object, atomicReference);
                        zzfz2.zza((zzp)object2, (Bundle)object3, zzmp2);
                        super.zzar();
                        break block8;
                    }
                    object = ((zzme)object).zzj();
                    object = ((zzgo)object).zzg();
                    object3 = "Failed to request trigger URIs; remote exception";
                    ((zzgq)object).zza((String)object3, (Object)remoteException2);
                    atomicReference.notifyAll();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zza(zzme object, AtomicReference atomicReference, zzp object2, zzop object3) {
        synchronized (atomicReference) {
            Throwable throwable2;
            block6: {
                block8: {
                    RemoteException remoteException2;
                    block7: {
                        zzfz zzfz2;
                        block9: {
                            zzfz2 = ((zzme)object).zzb;
                            if (zzfz2 == null) {
                                object2 = ((zzme)object).zzj();
                                object2 = ((zzgo)object2).zzg();
                                object3 = "[sgtm] Failed to get upload batches; not connected to service";
                                ((zzgq)object2).zza((String)object3);
                                return;
                            }
                            break block9;
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            catch (RemoteException remoteException2) {
                                break block7;
                            }
                        }
                        Preconditions.checkNotNull(object2);
                        zzmr zzmr2 = new zzmr((zzme)object, atomicReference);
                        zzfz2.zza((zzp)object2, (zzop)object3, zzmr2);
                        super.zzar();
                        break block8;
                    }
                    object = ((zzme)object).zzj();
                    object = ((zzgo)object).zzg();
                    object3 = "[sgtm] Failed to get upload batches; remote exception";
                    ((zzgq)object).zza((String)object3, (Object)remoteException2);
                    atomicReference.notifyAll();
                }
                return;
            }
            throw throwable2;
        }
    }

    private final void zza(Runnable runnable2) {
        long l2;
        this.zzv();
        int n3 = this.zzal();
        if (n3 != 0) {
            runnable2.run();
            return;
        }
        List list = this.zzf;
        n3 = list.size();
        long l3 = n3;
        long l4 = l3 - (l2 = 1000L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            this.zzj().zzg().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable2);
        this.zzg.zza(60000L);
        this.zzag();
    }

    private final void zzaq() {
        this.zzv();
        Object object = this.zzj().zzq();
        int n3 = this.zzf.size();
        Object object2 = n3;
        Object object3 = "Processing queued up service tasks";
        ((zzgq)object).zza((String)object3, object2);
        object = this.zzf.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Runnable)object.next();
            try {
                object2.run();
            }
            catch (RuntimeException runtimeException) {
                object3 = this.zzj().zzg();
                String string2 = "Task exception while flushing queue";
                ((zzgq)object3).zza(string2, runtimeException);
            }
        }
        this.zzf.clear();
        this.zzg.zza();
    }

    private final void zzar() {
        this.zzv();
        this.zze.zzb();
        zzbb zzbb2 = this.zzd;
        long l2 = (Long)zzbn.zzat.zza(null);
        zzbb2.zza(l2);
    }

    public static /* bridge */ /* synthetic */ zznj zzb(zzme zzme2) {
        return zzme2.zza;
    }

    private final zzp zzc(boolean bl2) {
        String string2;
        zzgg zzgg2 = this.zzg();
        if (bl2) {
            string2 = this.zzj().zzy();
        } else {
            bl2 = false;
            string2 = null;
        }
        return zzgg2.zza(string2);
    }

    public static /* synthetic */ void zzc(zzme zzme2) {
        zzfz zzfz2 = zzme2.zzb;
        if (zzfz2 == null) {
            zzme2.zzj().zzg().zza("Failed to send storage consent settings to service");
            return;
        }
        zzp zzp2 = null;
        try {
            zzp2 = zzme2.zzc(false);
        }
        catch (RemoteException remoteException) {
            zzme2.zzj().zzg().zza("Failed to send storage consent settings to the service", (Object)remoteException);
            return;
        }
        Preconditions.checkNotNull(zzp2);
        zzfz2.zzi(zzp2);
        zzme2.zzar();
    }

    public static /* synthetic */ void zzd(zzme zzme2) {
        zzfz zzfz2 = zzme2.zzb;
        if (zzfz2 == null) {
            zzme2.zzj().zzg().zza("Failed to send Dma consent settings to service");
            return;
        }
        zzp zzp2 = null;
        try {
            zzp2 = zzme2.zzc(false);
        }
        catch (RemoteException remoteException) {
            zzme2.zzj().zzg().zza("Failed to send Dma consent settings to the service", (Object)remoteException);
            return;
        }
        Preconditions.checkNotNull(zzp2);
        zzfz2.zzg(zzp2);
        zzme2.zzar();
    }

    public static /* synthetic */ void zze(zzme zzme2) {
        zzme2.zzaq();
    }

    public static /* synthetic */ void zzf(zzme zzme2) {
        zzme2.zzv();
        boolean bl2 = zzme2.zzal();
        if (bl2) {
            zzgq zzgq2 = zzme2.zzj().zzq();
            String string2 = "Inactivity, disconnecting from the service";
            zzgq2.zza(string2);
            zzme2.zzah();
        }
    }

    public static /* synthetic */ void zzg(zzme zzme2) {
        zzme2.zzar();
    }

    public final void zza(Bundle bundle) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zzmy zzmy2 = new zzmy(this, zzp2, bundle);
        this.zza(zzmy2);
    }

    public final void zza(zzdq zzdq2) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zzmv zzmv2 = new zzmv(this, zzp2, zzdq2);
        this.zza(zzmv2);
    }

    public final void zza(zzdq zzdq2, zzbl object, String object2) {
        this.zzv();
        this.zzw();
        Object object3 = this.zzs();
        int n3 = 12451000;
        int n4 = ((zzpn)object3).zza(n3);
        if (n4 != 0) {
            this.zzj().zzr().zza("Not bundling data. Service unavailable or out of date");
            object = this.zzs();
            object2 = new byte[0];
            ((zzpn)object).zza(zzdq2, (byte[])object2);
            return;
        }
        object3 = new zznb(this, (zzbl)object, (String)object2, zzdq2);
        this.zza((Runnable)object3);
    }

    public final void zza(zzdq zzdq2, String string2, String string3) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zznh zznh2 = new zznh(this, string2, string3, zzp2, zzdq2);
        this.zza(zznh2);
    }

    public final void zza(zzdq zzdq2, String string2, String string3, boolean bl2) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zzmn zzmn2 = new zzmn(this, string2, string3, zzp2, bl2, zzdq2);
        this.zza(zzmn2);
    }

    public final void zza(zzae zzae2) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(true);
        Preconditions.checkNotNull(zzp2);
        zzmj zzmj2 = new zzmj(this, zzp2, zzae2);
        this.zza(zzmj2);
    }

    public final void zza(zzag zzag2) {
        Preconditions.checkNotNull(zzag2);
        this.zzv();
        this.zzw();
        boolean bl2 = this.zzh().zza(zzag2);
        zzag zzag3 = new zzag(zzag2);
        zzp zzp2 = this.zzc(true);
        zznf zznf2 = new zznf(this, true, zzp2, bl2, zzag3, zzag2);
        this.zza(zznf2);
    }

    public final void zza(zzbl zzbl2, String string2) {
        Preconditions.checkNotNull(zzbl2);
        this.zzv();
        this.zzw();
        boolean bl2 = this.zzh().zza(zzbl2);
        zzp zzp2 = this.zzc(true);
        zznc zznc2 = new zznc(this, true, zzp2, bl2, zzbl2, string2);
        this.zza(zznc2);
    }

    public final void zza(zzfz zzfz2) {
        this.zzv();
        Preconditions.checkNotNull(zzfz2);
        this.zzb = zzfz2;
        this.zzar();
        this.zzaq();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(zzfz var1_1, AbstractSafeParcelable var2_2, zzp var3_3) {
        var4_4 = this;
        var5_5 = var1_1;
        var6_6 = var2_2;
        var7_7 = var3_3;
        this.zzv();
        this.zzw();
        var8_8 = 100;
        var9_9 = 100;
        for (var10_10 = 0; var10_10 < (var11_11 = 1001) && var9_9 == var8_8; ++var10_10) {
            var12_12 = new ArrayList<AbstractSafeParcelable>();
            var13_13 = this.zzh().zza(var8_8);
            if (var13_13 != null) {
                var12_12.addAll((Collection<AbstractSafeParcelable>)var13_13);
                var14_19 = var9_9 = var13_13.size();
            } else {
                var14_19 = 0;
            }
            if (var6_6 != null && var14_19 < var8_8) {
                var12_12.add(var6_6);
            }
            var13_13 = this.zze();
            var15_20 = zzbn.zzco;
            var16_21 = var13_13.zza(var15_20);
            var17_22 = var12_12.size();
            var9_9 = 0;
            var13_13 = null;
            while (var9_9 < var17_22) {
                block44: {
                    var18_23 /* !! */  = var12_12.get(var9_9);
                    var19_24 = var9_9 + 1;
                    var9_9 = (var18_23 /* !! */  = (AbstractSafeParcelable)var18_23 /* !! */ ) instanceof zzbl;
                    if (var9_9 != 0) {
                        block43: {
                            block42: {
                                var20_25 = 0L;
                                if (var16_21) {
                                    var13_13 = var4_4.zzu;
                                    var13_13 = var13_13.zzb();
                                    var22_26 = var13_13.currentTimeMillis();
                                    try {
                                        var13_13 = var4_4.zzu;
                                    }
                                    catch (RemoteException var13_14) {
                                        var24_27 = var20_25;
lbl44:
                                        // 2 sources

                                        while (true) {
                                            var26_28 = var22_26;
                                            break block43;
                                            break;
                                        }
                                    }
                                    var13_13 = var13_13.zzb();
                                    var24_27 = var13_13.elapsedRealtime();
                                    break block42;
                                    catch (RemoteException var13_15) {
                                        var24_27 = var20_25;
                                        var26_28 = var20_25;
                                        break block43;
                                    }
                                }
                                var22_26 = var20_25;
                                var24_27 = var20_25;
                            }
                            try {
                                var18_23 /* !! */  = (zzbl)var18_23 /* !! */ ;
                            }
                            catch (RemoteException var13_16) {
                                ** continue;
                            }
                            var5_5.zza((zzbl)var18_23 /* !! */ , var7_7);
                            if (!var16_21) break block44;
                            var13_13 = this.zzj();
                            var13_13 = var13_13.zzq();
                            var18_23 /* !! */  = "Logging telemetry for logEvent from database";
                            var13_13.zza((String)var18_23 /* !! */ );
                            var13_13 = var4_4.zzu;
                            var28_29 = zzgm.zza((zzic)var13_13);
                            var13_13 = var4_4.zzu;
                            var13_13 = var13_13.zzb();
                            var29_30 = var13_13.currentTimeMillis();
                            var13_13 = var4_4.zzu;
                            var13_13 = var13_13.zzb();
                            var31_31 = var13_13.elapsedRealtime();
                            var33_32 = var31_31 - var24_27;
                            var9_9 = (int)var33_32;
                            var35_33 = 36301;
                            var28_29.zza(var35_33, 0, var22_26, var29_30, var9_9);
                        }
                        var36_34 = this.zzj().zzg();
                        var37_35 = "Failed to send event to the service";
                        var36_34.zza(var37_35, var13_13);
                        if (var16_21 && (var9_9 = (int)(var26_28 == var20_25 ? 0 : (var26_28 < var20_25 ? -1 : 1))) != 0) {
                            var38_36 = zzgm.zza(var4_4.zzu);
                            var39_37 = var4_4.zzu.zzb().currentTimeMillis();
                            var13_13 = var4_4.zzu.zzb();
                            var33_32 = var13_13.elapsedRealtime() - var24_27;
                            var9_9 = (int)var33_32;
                            var41_38 = 36301;
                            var42_39 = 13;
                            var38_36.zza(var41_38, var42_39, var26_28, var39_37, var9_9);
                        }
                    } else {
                        var9_9 = var18_23 /* !! */  instanceof zzpm;
                        if (var9_9 != 0) {
                            var18_23 /* !! */  = (zzpm)var18_23 /* !! */ ;
                            try {
                                var5_5.zza((zzpm)var18_23 /* !! */ , var7_7);
                            }
                            catch (RemoteException var13_17) {
                                var36_34 = this.zzj().zzg();
                                var37_35 = "Failed to send user property to the service";
                                var36_34.zza(var37_35, (Object)var13_17);
                            }
                        } else {
                            var9_9 = var18_23 /* !! */  instanceof zzag;
                            if (var9_9 != 0) {
                                var18_23 /* !! */  = (zzag)var18_23 /* !! */ ;
                                try {
                                    var5_5.zza((zzag)var18_23 /* !! */ , var7_7);
                                }
                                catch (RemoteException var13_18) {
                                    var36_34 = this.zzj().zzg();
                                    var37_35 = "Failed to send conditional user property to the service";
                                    var36_34.zza(var37_35, (Object)var13_18);
                                }
                            } else {
                                var13_13 = this.zzj().zzg();
                                var36_34 = "Discarding data. Unrecognized parcel type.";
                                var13_13.zza((String)var36_34);
                            }
                        }
                    }
                }
                var9_9 = var19_24;
                var8_8 = 100;
            }
            var9_9 = var14_19;
            var8_8 = 100;
        }
    }

    public final void zza(zzlw zzlw2) {
        this.zzv();
        this.zzw();
        zzmz zzmz2 = new zzmz(this, zzlw2);
        this.zza(zzmz2);
    }

    public final void zza(zzpm zzpm2) {
        this.zzv();
        this.zzw();
        boolean bl2 = this.zzh().zza(zzpm2);
        zzp zzp2 = this.zzc(true);
        zzmq zzmq2 = new zzmq(this, zzp2, bl2, zzpm2);
        this.zza(zzmq2);
    }

    public final void zza(AtomicReference atomicReference) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zzms zzms2 = new zzms(this, atomicReference, zzp2);
        this.zza(zzms2);
    }

    public final void zza(AtomicReference atomicReference, Bundle bundle) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        Object object = this.zze();
        zzfx zzfx2 = zzbn.zzdd;
        boolean bl2 = ((zzai)object).zza(zzfx2);
        if (bl2) {
            object = new zzmi(this, atomicReference, zzp2, bundle);
            this.zza((Runnable)object);
            return;
        }
        object = new zzmo(this, atomicReference, zzp2, bundle);
        this.zza((Runnable)object);
    }

    public final void zza(AtomicReference atomicReference, zzop zzop2) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zzml zzml2 = new zzml(this, atomicReference, zzp2, zzop2);
        this.zza(zzml2);
    }

    public final void zza(AtomicReference atomicReference, String string2, String string3, String string4) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zzne zzne2 = new zzne(this, atomicReference, string2, string3, string4, zzp2);
        this.zza(zzne2);
    }

    public final void zza(AtomicReference atomicReference, String string2, String string3, String string4, boolean bl2) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zzng zzng2 = new zzng(this, atomicReference, string2, string3, string4, zzp2, bl2);
        this.zza(zzng2);
    }

    public final void zza(AtomicReference atomicReference, boolean bl2) {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        zzmm zzmm2 = new zzmm(this, atomicReference, zzp2, bl2);
        this.zza(zzmm2);
    }

    public final void zza(boolean bl2) {
        this.zzv();
        this.zzw();
        bl2 = this.zzan();
        if (bl2) {
            bl2 = false;
            zzp zzp2 = this.zzc(false);
            zznd zznd2 = new zznd(this, zzp2);
            this.zza(zznd2);
        }
    }

    public final boolean zzab() {
        return false;
    }

    public final zzap zzac() {
        this.zzv();
        this.zzw();
        Object object = this.zzb;
        if (object == null) {
            this.zzag();
            this.zzj().zzc().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzp zzp2 = this.zzc(false);
        Preconditions.checkNotNull(zzp2);
        try {
            object = object.zza(zzp2);
        }
        catch (RemoteException remoteException) {
            this.zzj().zzg().zza("Failed to get consents; remote exception", (Object)remoteException);
            return null;
        }
        this.zzar();
        return object;
    }

    public final Boolean zzad() {
        return this.zzc;
    }

    public final void zzae() {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(true);
        zzmw zzmw2 = new zzmw(this, zzp2);
        this.zza(zzmw2);
    }

    public final void zzaf() {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(true);
        this.zzh().zzad();
        zzmu zzmu2 = new zzmu(this, zzp2);
        this.zza(zzmu2);
    }

    public final void zzag() {
        this.zzv();
        this.zzw();
        boolean bl2 = this.zzal();
        if (bl2) {
            return;
        }
        bl2 = this.zzap();
        if (bl2) {
            this.zza.zza();
            return;
        }
        Object object = this.zze();
        bl2 = ((zzai)object).zzz();
        if (!bl2) {
            int n3;
            String string2;
            object = this.zza().getPackageManager();
            Object object2 = new Intent();
            Context context = this.zza();
            if ((object = object.queryIntentServices(object2 = object2.setClassName(context, string2 = "com.google.android.gms.measurement.AppMeasurementService"), n3 = 65536)) != null && !(bl2 = object.isEmpty())) {
                object = new Intent("com.google.android.gms.measurement.START");
                context = this.zza();
                object2 = new ComponentName(context, string2);
                object.setComponent((ComponentName)object2);
                this.zza.zza((Intent)object);
                return;
            }
            object = this.zzj().zzg();
            object2 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest";
            ((zzgq)object).zza((String)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzah() {
        this.zzv();
        this.zzw();
        Object object = this.zza;
        ((zznj)object).zzb();
        try {
            object = ConnectionTracker.getInstance();
            Context context = this.zza();
            zznj zznj2 = this.zza;
            ((ConnectionTracker)object).unbindService(context, zznj2);
        }
        catch (IllegalArgumentException | IllegalStateException runtimeException) {}
        this.zzb = null;
    }

    public final void zzai() {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(false);
        this.zzh().zzac();
        zzmt zzmt2 = new zzmt(this, zzp2);
        this.zza(zzmt2);
    }

    public final void zzaj() {
        this.zzv();
        this.zzw();
        zzmg zzmg2 = new zzmg(this);
        this.zza(zzmg2);
    }

    public final void zzak() {
        this.zzv();
        this.zzw();
        zzp zzp2 = this.zzc(true);
        zzna zzna2 = new zzna(this, zzp2);
        this.zza(zzna2);
    }

    public final boolean zzal() {
        this.zzv();
        this.zzw();
        zzfz zzfz2 = this.zzb;
        return zzfz2 != null;
    }

    public final boolean zzam() {
        int n3;
        this.zzv();
        this.zzw();
        int n4 = this.zzap();
        boolean bl2 = true;
        if (n4 == 0) {
            return bl2;
        }
        zzpn zzpn2 = this.zzs();
        n4 = zzpn2.zzg();
        if (n4 >= (n3 = 200900)) {
            return bl2;
        }
        return false;
    }

    public final boolean zzan() {
        Integer n3;
        int n4;
        this.zzv();
        this.zzw();
        int n7 = this.zzap();
        boolean bl2 = true;
        if (n7 == 0) {
            return bl2;
        }
        zzpn zzpn2 = this.zzs();
        n7 = zzpn2.zzg();
        if (n7 >= (n4 = (n3 = (Integer)zzbn.zzcd.zza(null)).intValue())) {
            return bl2;
        }
        return false;
    }

    public final boolean zzao() {
        int n3;
        this.zzv();
        this.zzw();
        int n4 = this.zzap();
        boolean bl2 = true;
        if (n4 == 0) {
            return bl2;
        }
        zzpn zzpn2 = this.zzs();
        n4 = zzpn2.zzg();
        if (n4 >= (n3 = 241200)) {
            return bl2;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzap() {
        block4: {
            int n3;
            Object object;
            block5: {
                int n4;
                int n7;
                Object object2;
                int n8;
                block16: {
                    block6: {
                        block7: {
                            Object object3;
                            block14: {
                                block15: {
                                    block8: {
                                        int n10;
                                        String string2;
                                        block9: {
                                            block13: {
                                                block10: {
                                                    block11: {
                                                        block12: {
                                                            this.zzv();
                                                            this.zzw();
                                                            object = this.zzc;
                                                            if (object != null) break block4;
                                                            this.zzv();
                                                            this.zzw();
                                                            object = this.zzk().zzq();
                                                            n3 = 1;
                                                            if (object != null && (n8 = ((Boolean)object).booleanValue()) != 0) break block5;
                                                            object2 = this.zzg();
                                                            n8 = ((zzgg)object2).zzac();
                                                            n7 = 0;
                                                            if (n8 == n3) break block6;
                                                            object2 = this.zzj().zzq();
                                                            string2 = "Checking service availability";
                                                            ((zzgq)object2).zza(string2);
                                                            object2 = this.zzs();
                                                            n10 = 12451000;
                                                            n8 = ((zzpn)object2).zza(n10);
                                                            if (n8 == 0) break block7;
                                                            if (n8 == n3) break block8;
                                                            n10 = 2;
                                                            if (n8 == n10) break block9;
                                                            n4 = 3;
                                                            if (n8 == n4) break block10;
                                                            n4 = 9;
                                                            if (n8 == n4) break block11;
                                                            n4 = 18;
                                                            if (n8 == n4) break block12;
                                                            object = this.zzj().zzr();
                                                            object3 = n8;
                                                            object2 = "Unexpected service status";
                                                            ((zzgq)object).zza((String)object2, object3);
                                                            break block13;
                                                        }
                                                        object = this.zzj().zzr();
                                                        object2 = "Service updating";
                                                        ((zzgq)object).zza((String)object2);
                                                        break block6;
                                                    }
                                                    object = this.zzj().zzr();
                                                    object3 = "Service invalid";
                                                    ((zzgq)object).zza((String)object3);
                                                    break block13;
                                                }
                                                object = this.zzj().zzr();
                                                object3 = "Service disabled";
                                                ((zzgq)object).zza((String)object3);
                                            }
                                            n4 = 0;
                                            object = null;
                                            break block14;
                                        }
                                        object2 = this.zzj().zzc();
                                        string2 = "Service container out of date";
                                        ((zzgq)object2).zza(string2);
                                        object2 = this.zzs();
                                        n8 = ((zzpn)object2).zzg();
                                        n10 = 17443;
                                        if (n8 < n10) break block15;
                                        if (object != null) {
                                            n3 = 0;
                                            Object var9_10 = null;
                                        }
                                        n4 = 0;
                                        object = null;
                                        break block16;
                                    }
                                    object = this.zzj().zzq();
                                    object2 = "Service missing";
                                    ((zzgq)object).zza((String)object2);
                                }
                                n4 = 1;
                            }
                            n3 = 0;
                            object3 = null;
                            break block16;
                        }
                        object = this.zzj().zzq();
                        object2 = "Service available";
                        ((zzgq)object).zza((String)object2);
                    }
                    n4 = 1;
                }
                if (n3 == 0 && (n8 = (int)(((zzai)(object2 = this.zze())).zzz() ? 1 : 0)) != 0) {
                    object = this.zzj().zzg();
                    object2 = "No way to upload. Consider using the full version of Analytics";
                    ((zzgq)object).zza((String)object2);
                } else {
                    n7 = n4;
                }
                if (n7 != 0) {
                    object = this.zzk();
                    ((zzha)object).zza(n3 != 0);
                }
            }
            object = n3 != 0;
            this.zzc = object;
        }
        return this.zzc;
    }

    public final void zzb(boolean bl2) {
        this.zzv();
        this.zzw();
        zzmh zzmh2 = new zzmh(this);
        this.zza(zzmh2);
    }
}

