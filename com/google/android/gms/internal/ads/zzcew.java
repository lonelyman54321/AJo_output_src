/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.net.Uri
 *  android.view.Surface
 *  android.view.TextureView$SurfaceTextureListener
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcdk;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcej;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcem;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzceo;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcet;
import com.google.android.gms.internal.ads.zzceu;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzfuv;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class zzcew
extends zzcdk
implements TextureView.SurfaceTextureListener,
zzcdu {
    private final zzcee zzc;
    private final zzcef zzd;
    private final zzced zze;
    private zzcdj zzf;
    private Surface zzg;
    private zzcdv zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl = 1;
    private zzcec zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcew(Context context, zzcef zzcef2, zzcee zzcee2, boolean bl2, boolean bl3, zzced zzced2) {
        super(context);
        this.zzc = zzcee2;
        this.zzd = zzcef2;
        this.zzn = bl2;
        this.zze = zzced2;
        this.setSurfaceTextureListener(this);
        zzcef2.zza(this);
    }

    private static String zzT(String string2, Exception object) {
        String string3 = object.getClass().getCanonicalName();
        object = ((Throwable)object).getMessage();
        return KW.a(string2, "/", string3, ":", (String)object);
    }

    private final void zzU() {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            boolean bl2 = true;
            zzcdv2.zzQ(bl2);
        }
    }

    private final void zzV() {
        boolean bl2 = this.zzo;
        if (!bl2) {
            this.zzo = true;
            Object object = zzt.zza;
            zzcev zzcev2 = new zzcev(this);
            object.post((Runnable)zzcev2);
            this.zzn();
            object = this.zzd;
            ((zzcef)object).zzb();
            bl2 = this.zzp;
            if (bl2) {
                this.zzp();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzW(boolean n3, Integer object) {
        int n4;
        Object object2;
        int n7 = 1;
        Object object3 = this.zzh;
        if (object3 != null && n3 == 0) {
            ((zzcdv)object3).zzP((Integer)object);
            return;
        }
        Surface surface = this.zzi;
        if (surface == null) return;
        surface = this.zzg;
        if (surface == null) {
            return;
        }
        if (n3 != 0) {
            n3 = (int)(this.zzad() ? 1 : 0);
            if (n3 == 0) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            ((zzcdv)object3).zzU();
            this.zzY();
        }
        if ((n3 = (int)(((String)(object2 = this.zzi)).startsWith((String)(object3 = "cache:")) ? 1 : 0)) != 0) {
            object2 = this.zzc;
            object3 = this.zzi;
            boolean bl2 = (object2 = object2.zzp((String)object3)) instanceof zzcfy;
            if (bl2) {
                this.zzh = object2 = ((zzcfy)object2).zza();
                ((zzcdv)object2).zzP((Integer)object);
                object2 = this.zzh;
                n3 = (int)(((zzcdv)object2).zzV() ? 1 : 0);
                if (n3 == 0) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                bl2 = object2 instanceof zzcfv;
                if (!bl2) {
                    object2 = String.valueOf(this.zzi);
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache miss: ".concat((String)object2));
                    return;
                }
                object2 = (zzcfv)object2;
                object3 = this.zzF();
                surface = ((zzcfv)object2).zzk();
                boolean bl3 = ((zzcfv)object2).zzl();
                if ((object2 = ((zzcfv)object2).zzi()) == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache URL is null.");
                    return;
                }
                this.zzh = object = this.zzE((Integer)object);
                object2 = Uri.parse((String)object2);
                Uri[] uriArray = new Uri[n7];
                uriArray[0] = object2;
                ((zzcdv)object).zzG(uriArray, (String)object3, (ByteBuffer)surface, bl3);
            }
        } else {
            int n8;
            this.zzh = object2 = this.zzE((Integer)object);
            object2 = this.zzF();
            n4 = this.zzj.length;
            object = new Uri[n4];
            object3 = null;
            for (int i3 = 0; i3 < (n8 = ((String[])(surface = this.zzj)).length); i3 += n7) {
                surface = Uri.parse((String)surface[i3]);
                object[i3] = surface;
            }
            zzcdv zzcdv2 = this.zzh;
            zzcdv2.zzF((Uri[])object, (String)object2);
        }
        this.zzh.zzL(this);
        object2 = this.zzg;
        this.zzZ((Surface)object2, false);
        object2 = this.zzh;
        n3 = (int)(((zzcdv)object2).zzV() ? 1 : 0);
        if (n3 == 0) return;
        object2 = this.zzh;
        this.zzl = n3 = ((zzcdv)object2).zzt();
        n4 = 3;
        if (n3 != n4) return;
        this.zzV();
    }

    private final void zzX() {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            zzcdv2.zzQ(false);
        }
    }

    private final void zzY() {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            zzcdv2 = null;
            int n3 = 1;
            this.zzZ(null, n3 != 0);
            zzcdv zzcdv3 = this.zzh;
            if (zzcdv3 != null) {
                zzcdv3.zzL(null);
                zzcdv3 = this.zzh;
                zzcdv3.zzH();
                this.zzh = null;
            }
            this.zzl = n3;
            zzcdv2 = null;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean bl2) {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            try {
                zzcdv2.zzS(surface, bl2);
                return;
            }
            catch (IOException iOException) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", iOException);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        int n3 = this.zzq;
        int n4 = this.zzr;
        this.zzab(n3, n4);
    }

    private final void zzab(int n3, int n4) {
        float f5;
        float f6;
        if (n4 > 0) {
            f6 = n3;
            f5 = n4;
            f6 /= f5;
        } else {
            n3 = 1065353216;
            f6 = 1.0f;
        }
        f5 = this.zzs;
        n4 = (int)(f5 == f6 ? 0 : (f5 > f6 ? 1 : -1));
        if (n4 != 0) {
            this.zzs = f6;
            this.requestLayout();
        }
    }

    private final boolean zzac() {
        boolean bl2;
        boolean bl3 = this.zzad();
        if (bl3 && (bl3 = this.zzl) != (bl2 = true)) {
            return bl2;
        }
        return false;
    }

    private final boolean zzad() {
        boolean bl2;
        zzcdv zzcdv2 = this.zzh;
        return zzcdv2 != null && (bl2 = zzcdv2.zzV()) && !(bl2 = this.zzk);
    }

    public final void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = this.getMeasuredWidth();
        n4 = this.getMeasuredHeight();
        float f5 = this.zzs;
        float f6 = 0.0f;
        zzcec zzcec2 = null;
        float f7 = f5 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 != false && (zzcec2 = this.zzm) == null) {
            f6 = n3;
            float f11 = n4;
            float f12 = f5 - (f11 = f6 / f11);
            Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object > 0) {
                n4 = (int)(f6 /= f5);
            }
            if ((f8 = f5 == f11 ? 0 : (f5 < f11 ? -1 : 1)) < 0) {
                float f14 = (float)n4 * f5;
                n3 = (int)f14;
            }
        }
        this.setMeasuredDimension(n3, n4);
        zzcec zzcec3 = this.zzm;
        if (zzcec3 != null) {
            zzcec3.zzc(n3, n4);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture object, int n3, int n4) {
        int n7;
        zzcec zzcec2;
        boolean bl2 = this.zzn;
        if (bl2) {
            Context context = this.getContext();
            this.zzm = zzcec2 = new zzcec(context);
            zzcec2.zzd((SurfaceTexture)object, n3, n4);
            this.zzm.start();
            zzcec2 = this.zzm.zzb();
            if (zzcec2 != null) {
                object = zzcec2;
            } else {
                zzcec2 = this.zzm;
                zzcec2.zze();
                this.zzm = null;
            }
        }
        zzcec2 = new Surface(object);
        this.zzg = zzcec2;
        object = this.zzh;
        if (object == null) {
            n7 = 0;
            object = null;
            this.zzW(false, null);
        } else {
            this.zzZ((Surface)zzcec2, true);
            object = this.zze;
            n7 = object.zza;
            if (n7 == 0) {
                this.zzU();
            }
        }
        n7 = this.zzq;
        if (n7 != 0 && (n7 = this.zzr) != 0) {
            this.zzaa();
        } else {
            this.zzab(n3, n4);
        }
        object = zzt.zza;
        zzces zzces2 = new zzces(this);
        object.post((Runnable)zzces2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture object) {
        this.zzo();
        object = this.zzm;
        zzceo zzceo2 = null;
        if (object != null) {
            object.zze();
            this.zzm = null;
        }
        object = this.zzh;
        boolean bl2 = true;
        if (object != null) {
            this.zzX();
            object = this.zzg;
            if (object != null) {
                object.release();
            }
            this.zzg = null;
            this.zzZ(null, bl2);
        }
        object = zzt.zza;
        zzceo2 = new zzceo(this);
        object.post((Runnable)zzceo2);
        return bl2;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture object, int n3, int n4) {
        object = this.zzm;
        if (object != null) {
            object.zzc(n3, n4);
        }
        object = zzt.zza;
        zzcen zzcen2 = new zzcen(this, n3, n4);
        object.post((Runnable)zzcen2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        zzcdj zzcdj2 = this.zzf;
        this.zza.zza(surfaceTexture, zzcdj2);
    }

    public final void onWindowVisibilityChanged(int n3) {
        Object object = new StringBuilder("AdExoPlayerView3 window visibility changed to ");
        object.append(n3);
        com.google.android.gms.ads.internal.util.zze.zza(object.toString());
        object = zzt.zza;
        zzcem zzcem2 = new zzcem(this, n3);
        object.post(zzcem2);
        super.onWindowVisibilityChanged(n3);
    }

    public final void zzA(int n3) {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            zzcdv2.zzN(n3);
        }
    }

    public final void zzB(int n3) {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            zzcdv2.zzR(n3);
        }
    }

    public final void zzC(String string2, String[] object, Integer n3) {
        int n4;
        int n7;
        if (string2 == null) {
            return;
        }
        if (object == null) {
            object = new String[]{string2};
            this.zzj = object;
        } else {
            n7 = ((String[])object).length;
            object = Arrays.copyOf(object, n7);
            this.zzj = object;
        }
        object = this.zzi;
        zzced zzced2 = this.zze;
        n7 = (int)(zzced2.zzl ? 1 : 0);
        boolean bl2 = false;
        if (n7 != 0 && object != null && (n4 = string2.equals(object)) == 0 && (n4 = this.zzl) == (n7 = 4)) {
            bl2 = true;
        }
        this.zzi = string2;
        this.zzW(bl2, n3);
    }

    public final void zzD(int n3, int n4) {
        this.zzq = n3;
        this.zzr = n4;
        this.zzaa();
    }

    public final zzcdv zzE(Integer n3) {
        zzced zzced2 = this.zze;
        zzcee zzcee2 = this.zzc;
        Context context = zzcee2.getContext();
        zzcgq zzcgq2 = new zzcgq(context, zzced2, zzcee2, n3);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        return zzcgq2;
    }

    public final String zzF() {
        Object object = this.zzc;
        zzt zzt2 = zzu.zzp();
        Context context = object.getContext();
        object = object.zzn().afmaVersion;
        return zzt2.zzc(context, (String)object);
    }

    public final /* synthetic */ void zzG(String string2) {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            String string3 = "ExoPlayerAdapter error";
            zzcdj2.zzb(string3, string2);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean bl2, long l2) {
        this.zzc.zzv(bl2, l2);
    }

    public final /* synthetic */ void zzK(String string2) {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            String string3 = "ExoPlayerAdapter exception";
            zzcdj2.zzc(string3, string2);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.zzi();
        }
    }

    public final /* synthetic */ void zzO(int n3, int n4) {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.zzj(n3, n4);
        }
    }

    public final /* synthetic */ void zzP() {
        zzcei zzcei2 = this.zzb;
        float f5 = zzcei2.zza();
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            try {
                zzcdv2.zzT(f5, false);
                return;
            }
            catch (IOException iOException) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", iOException);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set volume before player is initialized.");
    }

    public final /* synthetic */ void zzQ(int n3) {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.onWindowVisibilityChanged(n3);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcdj zzcdj2 = this.zzf;
        if (zzcdj2 != null) {
            zzcdj2.zze();
        }
    }

    public final int zza() {
        boolean bl2 = this.zzac();
        if (bl2) {
            return (int)this.zzh.zzy();
        }
        return 0;
    }

    public final int zzb() {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            return zzcdv2.zzr();
        }
        return -1;
    }

    public final int zzc() {
        boolean bl2 = this.zzac();
        if (bl2) {
            return (int)this.zzh.zzz();
        }
        return 0;
    }

    public final int zzd() {
        return this.zzr;
    }

    public final int zze() {
        return this.zzq;
    }

    public final long zzf() {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            return zzcdv2.zzx();
        }
        return -1;
    }

    public final long zzg() {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            return zzcdv2.zzA();
        }
        return -1;
    }

    public final long zzh() {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            return zzcdv2.zzB();
        }
        return -1;
    }

    public final void zzi(boolean bl2, long l2) {
        Object object = this.zzc;
        if (object != null) {
            object = zzcci.zze;
            zzcep zzcep2 = new zzcep(this, bl2, l2);
            object.execute(zzcep2);
        }
    }

    public final String zzj() {
        boolean bl2 = true;
        boolean bl3 = this.zzn;
        String string2 = bl2 != bl3 ? "" : " spherical";
        return "ExoPlayer/2".concat(string2);
    }

    public final void zzk(String string2, Exception exception) {
        string2 = zzcew.zzT(string2, exception);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter error: ".concat(string2));
        this.zzk = true;
        Object object = this.zze;
        boolean bl2 = object.zza;
        if (bl2) {
            this.zzX();
        }
        object = zzt.zza;
        zzcet zzcet2 = new zzcet(this, string2);
        object.post(zzcet2);
        zzu.zzo().zzv(exception, "AdExoPlayerView.onError");
    }

    public final void zzl(String string2, Exception object) {
        string2 = zzcew.zzT("onLoadException", object);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter exception: ".concat(string2));
        zzu.zzo().zzv((Throwable)object, "AdExoPlayerView.onException");
        object = zzt.zza;
        zzceq zzceq2 = new zzceq(this, string2);
        object.post(zzceq2);
    }

    public final void zzm(int n3) {
        int n4 = this.zzl;
        if (n4 != n3) {
            this.zzl = n3;
            n4 = 3;
            if (n3 != n4) {
                n4 = 4;
                if (n3 == n4) {
                    Object object = this.zze;
                    n3 = (int)(object.zza ? 1 : 0);
                    if (n3 != 0) {
                        this.zzX();
                    }
                    this.zzd.zze();
                    this.zzb.zzc();
                    object = zzt.zza;
                    zzceu zzceu2 = new zzceu(this);
                    object.post(zzceu2);
                    return;
                }
            } else {
                this.zzV();
            }
        }
    }

    public final void zzn() {
        zzfuv zzfuv2 = zzt.zza;
        zzcel zzcel2 = new zzcel(this);
        zzfuv2.post(zzcel2);
    }

    public final void zzo() {
        boolean bl2 = this.zzac();
        if (bl2) {
            Object object = this.zze;
            bl2 = object.zza;
            if (bl2) {
                this.zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            object = zzt.zza;
            zzcer zzcer2 = new zzcer(this);
            object.post(zzcer2);
        }
    }

    public final void zzp() {
        boolean bl2 = this.zzac();
        boolean bl3 = true;
        if (bl2) {
            Object object = this.zze;
            bl2 = object.zza;
            if (bl2) {
                this.zzU();
            }
            this.zzh.zzO(bl3);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            object = zzt.zza;
            zzcek zzcek2 = new zzcek(this);
            object.post(zzcek2);
            return;
        }
        this.zzp = bl3;
    }

    public final void zzq(int n3) {
        boolean bl2 = this.zzac();
        if (bl2) {
            zzcdv zzcdv2 = this.zzh;
            long l2 = n3;
            zzcdv2.zzI(l2);
        }
    }

    public final void zzr(zzcdj zzcdj2) {
        this.zzf = zzcdj2;
    }

    public final void zzs(String string2) {
        if (string2 != null) {
            this.zzC(string2, null, null);
        }
    }

    public final void zzt() {
        boolean bl2 = this.zzad();
        if (bl2) {
            zzcdv zzcdv2 = this.zzh;
            zzcdv2.zzU();
            this.zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    public final void zzu(float f5, float f6) {
        zzcec zzcec2 = this.zzm;
        if (zzcec2 != null) {
            zzcec2.zzf(f5, f6);
        }
    }

    public final void zzv() {
        zzfuv zzfuv2 = zzt.zza;
        zzcej zzcej2 = new zzcej(this);
        zzfuv2.post(zzcej2);
    }

    public final Integer zzw() {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            return zzcdv2.zzC();
        }
        return null;
    }

    public final void zzx(int n3) {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            zzcdv2.zzJ(n3);
        }
    }

    public final void zzy(int n3) {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            zzcdv2.zzK(n3);
        }
    }

    public final void zzz(int n3) {
        zzcdv zzcdv2 = this.zzh;
        if (zzcdv2 != null) {
            zzcdv2.zzM(n3);
        }
    }
}

