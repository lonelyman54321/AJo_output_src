/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzaj;
import com.google.android.gms.ads.internal.client.zzal;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzb;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbb;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbrb;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzea {
    final zzaz zza;
    private final zzbrb zzb;
    private final zzp zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbu zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;

    public zzea(ViewGroup viewGroup) {
        zzp zzp2 = com.google.android.gms.ads.internal.client.zzp.zza;
        this(viewGroup, null, false, zzp2, null, 0);
    }

    public zzea(ViewGroup viewGroup, int n3) {
        zzp zzp2 = com.google.android.gms.ads.internal.client.zzp.zza;
        this(viewGroup, null, false, zzp2, null, n3);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean bl2) {
        zzp zzp2 = com.google.android.gms.ads.internal.client.zzp.zza;
        this(viewGroup, attributeSet, bl2, zzp2, null, 0);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean bl2, int n3) {
        zzp zzp2 = com.google.android.gms.ads.internal.client.zzp.zza;
        this(viewGroup, attributeSet, bl2, zzp2, null, n3);
    }

    public zzea(ViewGroup viewGroup, AttributeSet object, boolean bl2, zzp object2, zzbu object3, int n3) {
        this.zzb = object3;
        this.zze = object3 = new VideoController();
        this.zza = object3 = new zzdz(this);
        this.zzm = viewGroup;
        this.zzc = object2;
        this.zzj = null;
        int n4 = 0;
        object3 = null;
        this.zzd = object2 = new AtomicBoolean(false);
        this.zzn = n3;
        if (object != null) {
            object2 = viewGroup.getContext();
            Object object4 = new zzy((Context)object2, (AttributeSet)object);
            object = ((zzy)object4).zzb(bl2);
            this.zzh = object;
            object = ((zzy)object4).zza();
            try {
                this.zzl = object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                zzf zzf2 = zzay.zzb();
                object4 = AdSize.BANNER;
                object3 = new zzq((Context)object2, (AdSize)object4);
                object2 = illegalArgumentException.getMessage();
                String string2 = illegalArgumentException.getMessage();
                zzf2.zzm(viewGroup, (zzq)object3, (String)object2, string2);
            }
            boolean bl3 = viewGroup.isInEditMode();
            if (bl3) {
                object = zzay.zzb();
                Object object5 = this.zzh[0];
                n4 = this.zzn;
                object4 = AdSize.INVALID;
                n3 = (int)(((AdSize)object5).equals(object4) ? 1 : 0);
                if (n3 != 0) {
                    object5 = zzq.zze();
                } else {
                    object4 = new zzq((Context)object2, (AdSize)object5);
                    ((zzq)object4).zzj = bl2 = zzea.zzE(n4);
                    object5 = object4;
                }
                ((zzf)object).zzn(viewGroup, (zzq)object5, "Ads by Google");
                return;
            }
        }
    }

    private static zzq zzD(Context context, AdSize[] adSizeArray, int n3) {
        boolean bl2;
        int n4 = adSizeArray.length;
        for (int i3 = 0; i3 < n4; ++i3) {
            AdSize adSize = adSizeArray[i3];
            AdSize adSize2 = AdSize.INVALID;
            boolean bl3 = adSize.equals(adSize2);
            if (!bl3) continue;
            return zzq.zze();
        }
        zzq zzq2 = new zzq(context, adSizeArray);
        zzq2.zzj = bl2 = zzea.zzE(n3);
        return zzq2;
    }

    private static boolean zzE(int n3) {
        int n4 = 1;
        if (n3 == n4) {
            return n4;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ VideoController zze(zzea zzea2) {
        return zzea2.zze;
    }

    public final boolean zzA() {
        block3: {
            zzbu zzbu2 = this.zzj;
            if (zzbu2 == null) break block3;
            try {
                return zzbu2.zzY();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, remoteException);
            }
        }
        return false;
    }

    public final boolean zzB() {
        block3: {
            zzbu zzbu2 = this.zzj;
            if (zzbu2 == null) break block3;
            try {
                return zzbu2.zzZ();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, remoteException);
            }
        }
        return false;
    }

    public final AdSize[] zzC() {
        return this.zzh;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    public final AdSize zzb() {
        Object object;
        block8: {
            object = this.zzj;
            if (object == null) break block8;
            object = object.zzg();
            if (object == null) break block8;
            int n3 = object.zze;
            int n4 = object.zzb;
            object = object.zza;
            try {
                return com.google.android.gms.ads.zzb.zzc(n3, n4, (String)object);
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, remoteException);
            }
        }
        if ((object = this.zzh) != null) {
            return object[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    public final ResponseInfo zzd() {
        zzdn zzdn2;
        block3: {
            zzdn2 = null;
            zzbu zzbu2 = this.zzj;
            if (zzbu2 == null) break block3;
            try {
                zzdn2 = zzbu2.zzk();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, remoteException);
            }
        }
        return ResponseInfo.zza(zzdn2);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    public final AppEventListener zzh() {
        return this.zzi;
    }

    public final zzdq zzi() {
        zzbu zzbu2 = this.zzj;
        if (zzbu2 != null) {
            try {
                return zzbu2.zzl();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, remoteException);
            }
        }
        return null;
    }

    public final String zzj() {
        Object object = this.zzl;
        if (object == null && (object = this.zzj) != null) {
            object = object.zzr();
            try {
                this.zzl = object;
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, remoteException);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbu zzbu2;
                try {
                    zzbu2 = this.zzj;
                    if (zzbu2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbu2.zzx();
                return;
                break block4;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final /* synthetic */ void zzl(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        this.zzm.addView((View)iObjectWrapper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(zzdx object) {
        RemoteException remoteException3;
        String string2;
        block15: {
            Object object2;
            Object object3;
            Object object4;
            block11: {
                block12: {
                    RemoteException remoteException22;
                    block14: {
                        block13: {
                            boolean bl2;
                            string2 = "#007 Could not call remote method.";
                            try {
                                object4 = this.zzj;
                                if (object4 != null) break block11;
                                object4 = this.zzh;
                                if (object4 == null || (object4 = this.zzl) == null) break block12;
                                object4 = this.zzm;
                                object4 = object4.getContext();
                                object3 = this.zzh;
                                int n3 = this.zzn;
                                zzq zzq2 = zzea.zzD((Context)object4, (AdSize[])object3, n3);
                                object3 = "search_v2";
                                object2 = zzq2.zza;
                                bl2 = ((String)object3).equals(object2);
                                if (bl2) {
                                    object3 = zzay.zza();
                                    object2 = this.zzl;
                                    zzal zzal2 = new zzal((zzaw)object3, (Context)object4, zzq2, (String)object2);
                                    object4 = zzal2.zzd((Context)object4, false);
                                    object4 = (zzbu)object4;
                                } else {
                                    zzaj zzaj2;
                                    object2 = zzay.zza();
                                    String string3 = this.zzl;
                                    zzbrb zzbrb2 = this.zzb;
                                    object3 = zzaj2;
                                    ViewGroup viewGroup = object4;
                                    zzaj2 = new zzaj((zzaw)object2, (Context)object4, zzq2, string3, zzbrb2);
                                    object4 = zzaj2.zzd((Context)object4, false);
                                    object4 = (zzbu)object4;
                                }
                                this.zzj = object4;
                                object2 = this.zza;
                                object3 = new zzg((AdListener)object2);
                                object4.zzD((zzbh)object3);
                                object4 = this.zzf;
                                if (object4 != null) {
                                    object3 = this.zzj;
                                    object2 = new zzb((zza)object4);
                                    object3.zzC((zzbe)object2);
                                }
                                if ((object4 = this.zzi) != null) {
                                    object3 = this.zzj;
                                    object2 = new zzbbb((AppEventListener)object4);
                                    object3.zzG((zzcb)object2);
                                }
                                if ((object4 = this.zzk) != null) {
                                    object4 = this.zzj;
                                    object2 = this.zzk;
                                    object3 = new zzfk((VideoOptions)object2);
                                    object4.zzU((zzfk)object3);
                                }
                                object4 = this.zzj;
                                object2 = this.zzp;
                                object3 = new zzfe((OnPaidEventListener)object2);
                                object4.zzP((zzdg)object3);
                                object4 = this.zzj;
                                bl2 = this.zzo;
                                object4.zzN(bl2);
                                object4 = this.zzj;
                                if (object4 == null) break block11;
                            }
                            catch (RemoteException remoteException3) {
                                break block15;
                            }
                            try {
                                object4 = object4.zzn();
                                if (object4 == null) break block11;
                                object3 = zzbgi.zzf;
                                object3 = ((zzbfv)object3).zze();
                                bl2 = (Boolean)(object3 = (Boolean)object3);
                                if (!bl2) break block13;
                                object3 = zzbep.zzlg;
                                object2 = zzba.zzc();
                                object3 = ((zzben)object2).zza((zzbeg)object3);
                                bl2 = (Boolean)(object3 = (Boolean)object3);
                                if (!bl2) break block13;
                                object3 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                                object2 = new zzdy(this, (IObjectWrapper)object4);
                                object3.post((Runnable)object2);
                                break block11;
                            }
                            catch (RemoteException remoteException22) {
                                break block14;
                            }
                        }
                        object3 = this.zzm;
                        object4 = ObjectWrapper.unwrap((IObjectWrapper)object4);
                        object4 = (View)object4;
                        object3.addView((View)object4);
                        break block11;
                    }
                    com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, remoteException22);
                    break block11;
                }
                object4 = "The ad size and ad unit ID must be set before loadAd is called.";
                object = new IllegalStateException((String)object4);
                throw object;
            }
            if ((object4 = this.zzj) != null) {
                object3 = this.zzc;
                object2 = this.zzm;
                object2 = object2.getContext();
                object = ((zzp)object3).zza((Context)object2, (zzdx)object);
                object4.zzab((zzl)object);
                return;
            }
            object = null;
            throw null;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, remoteException3);
    }

    public final void zzn() {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbu zzbu2;
                try {
                    zzbu2 = this.zzj;
                    if (zzbu2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbu2.zzz();
                return;
                break block4;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzo() {
        Object object = this.zzd;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).getAndSet(bl2);
        if (bl3) return;
        try {
            object = this.zzj;
            if (object == null) return;
        }
        catch (RemoteException remoteException) {}
        object.zzA();
        return;
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException);
    }

    public final void zzp() {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbu zzbu2;
                try {
                    zzbu2 = this.zzj;
                    if (zzbu2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbu2.zzB();
                return;
                break block4;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq(zza zza2) {
        RemoteException remoteException2;
        block3: {
            zzb zzb2;
            zzbu zzbu2;
            try {
                this.zzf = zza2;
                zzbu2 = this.zzj;
                if (zzbu2 == null) return;
                zzb2 = zza2 != null ? new zzb(zza2) : null;
            }
            catch (RemoteException remoteException2) {
                break block3;
            }
            zzbu2.zzC(zzb2);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize ... object) {
        AdSize[] adSizeArray = this.zzh;
        if (adSizeArray == null) {
            this.zzt((AdSize)object);
            return;
        }
        object = new IllegalStateException("The ad size can only be set once on AdView.");
        throw object;
    }

    public final void zzt(AdSize ... object) {
        block8: {
            this.zzh = object;
            object = this.zzj;
            if (object == null) break block8;
            Object object2 = this.zzm;
            object2 = object2.getContext();
            AdSize[] adSizeArray = this.zzh;
            int n3 = this.zzn;
            object2 = zzea.zzD((Context)object2, adSizeArray, n3);
            try {
                object.zzF((zzq)object2);
            }
            catch (RemoteException remoteException) {
                object2 = "#007 Could not call remote method.";
                com.google.android.gms.ads.internal.util.client.zzm.zzl((String)object2, remoteException);
            }
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String object) {
        String string2 = this.zzl;
        if (string2 == null) {
            this.zzl = object;
            return;
        }
        object = new IllegalStateException("The ad unit ID can only be set once on AdView.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzv(AppEventListener appEventListener) {
        RemoteException remoteException2;
        block3: {
            zzbbb zzbbb2;
            zzbu zzbu2;
            try {
                this.zzi = appEventListener;
                zzbu2 = this.zzj;
                if (zzbu2 == null) return;
                zzbbb2 = appEventListener != null ? new zzbbb(appEventListener) : null;
            }
            catch (RemoteException remoteException2) {
                break block3;
            }
            zzbu2.zzG(zzbbb2);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void zzw(boolean bl2) {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbu zzbu2;
                this.zzo = bl2;
                try {
                    zzbu2 = this.zzj;
                    if (zzbu2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbu2.zzN(bl2);
                return;
                break block4;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        RemoteException remoteException2;
        block6: {
            block5: {
                zzbu zzbu2;
                try {
                    this.zzp = onPaidEventListener;
                    zzbu2 = this.zzj;
                    if (zzbu2 == null) break block5;
                }
                catch (RemoteException remoteException2) {}
                zzfe zzfe2 = new zzfe(onPaidEventListener);
                zzbu2.zzP(zzfe2);
                return;
                break block6;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void zzy(VideoOptions object) {
        RemoteException remoteException2;
        block8: {
            block5: {
                zzbu zzbu2;
                block7: {
                    block6: {
                        this.zzk = object;
                        try {
                            zzbu2 = this.zzj;
                            if (zzbu2 == null) break block5;
                            if (object != null) break block6;
                            object = null;
                            break block7;
                        }
                        catch (RemoteException remoteException2) {}
                    }
                    zzfk zzfk2 = new zzfk((VideoOptions)object);
                    object = zzfk2;
                }
                zzbu2.zzU((zzfk)object);
                return;
                break block8;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final boolean zzz(zzbu zzbu2) {
        ViewParent viewParent;
        IObjectWrapper iObjectWrapper;
        ViewGroup viewGroup = null;
        try {
            iObjectWrapper = zzbu2.zzn();
        }
        catch (RemoteException remoteException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException);
            return false;
        }
        if (iObjectWrapper != null && (viewParent = ((View)ObjectWrapper.unwrap(iObjectWrapper)).getParent()) == null) {
            viewGroup = this.zzm;
            iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
            viewGroup.addView((View)iObjectWrapper);
            this.zzj = zzbu2;
            return true;
        }
        return false;
    }
}

