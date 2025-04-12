/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.TextureView$SurfaceTextureListener
 */
package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzfh;
import com.google.android.gms.internal.ads.zziq;
import com.google.android.gms.internal.ads.zziu;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzko;
import com.google.android.gms.internal.ads.zzkp;
import com.google.android.gms.internal.ads.zzkq;
import com.google.android.gms.internal.ads.zzkr;
import com.google.android.gms.internal.ads.zzkw;
import com.google.android.gms.internal.ads.zzmx;
import com.google.android.gms.internal.ads.zzqo;
import com.google.android.gms.internal.ads.zzqp;
import com.google.android.gms.internal.ads.zzun;
import com.google.android.gms.internal.ads.zzxu;

final class zzks
implements SurfaceHolder.Callback,
TextureView.SurfaceTextureListener,
zzaci,
zzqo,
zzxu,
zzun,
zziu,
zziq {
    public static final /* synthetic */ int zzb;
    final /* synthetic */ zzkw zza;

    public /* synthetic */ zzks(zzkw zzkw2, zzkr zzkr2) {
        this.zza = zzkw2;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n3, int n4) {
        zzkw.zzP(this.zza, surfaceTexture);
        zzkw.zzN(this.zza, n3, n4);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzkw.zzQ(this.zza, null);
        zzkw.zzN(this.zza, 0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n3, int n4) {
        zzkw.zzN(this.zza, n3, n4);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int n3, int n4, int n7) {
        zzkw.zzN(this.zza, n4, n7);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzkw.zzN(this.zza, 0, 0);
    }

    public final void zza(Exception exception) {
        zzkw.zzF(this.zza).zzv(exception);
    }

    public final void zzb(String string2, long l2, long l3) {
        zzkw.zzF(this.zza).zzw(string2, l2, l3);
    }

    public final void zzc(String string2) {
        zzkw.zzF(this.zza).zzx(string2);
    }

    public final void zzd(zzix zzix2) {
        zzkw.zzF(this.zza).zzy(zzix2);
        zzkw.zzI(this.zza, null);
        zzkw.zzH(this.zza, null);
    }

    public final void zze(zzix zzix2) {
        zzkw.zzH(this.zza, zzix2);
        zzkw.zzF(this.zza).zzz(zzix2);
    }

    public final void zzf(zzan zzan2, zziy zziy2) {
        zzkw.zzI(this.zza, zzan2);
        zzkw.zzF(this.zza).zzA(zzan2, zziy2);
    }

    public final void zzg(long l2) {
        zzkw.zzF(this.zza).zzB(l2);
    }

    public final void zzh(Exception exception) {
        zzkw.zzF(this.zza).zzC(exception);
    }

    public final void zzi(zzqp zzqp2) {
        zzkw.zzF(this.zza).zzD(zzqp2);
    }

    public final void zzj(zzqp zzqp2) {
        zzkw.zzF(this.zza).zzE(zzqp2);
    }

    public final void zzk(int n3, long l2, long l3) {
        zzkw.zzF(this.zza).zzF(n3, l2, l3);
    }

    public final void zzl(int n3, long l2) {
        zzkw.zzF(this.zza).zzG(n3, l2);
    }

    public final void zzm(Object object, long l2) {
        zzmx zzmx2 = zzkw.zzF(this.zza);
        zzmx2.zzH(object, l2);
        Object object2 = this.zza;
        Object object3 = zzkw.zzG((zzkw)object2);
        if (object3 == object) {
            object = zzkw.zzD((zzkw)object2);
            object2 = new zzkq();
            int n3 = 26;
            ((zzfh)object).zzd(n3, (zzfe)object2);
            ((zzfh)object).zzc();
        }
    }

    public final void zzn(boolean bl2) {
        Object object = this.zza;
        boolean bl3 = zzkw.zzV((zzkw)object);
        if (bl3 == bl2) {
            return;
        }
        zzkw.zzJ((zzkw)object, bl2);
        object = zzkw.zzD(this.zza);
        zzko zzko2 = new zzko(bl2);
        ((zzfh)object).zzd(23, zzko2);
        ((zzfh)object).zzc();
    }

    public final void zzo(Exception exception) {
        zzkw.zzF(this.zza).zzI(exception);
    }

    public final void zzp(String string2, long l2, long l3) {
        zzkw.zzF(this.zza).zzJ(string2, l2, l3);
    }

    public final void zzq(String string2) {
        zzkw.zzF(this.zza).zzK(string2);
    }

    public final void zzr(zzix zzix2) {
        zzkw.zzF(this.zza).zzL(zzix2);
        zzkw.zzL(this.zza, null);
        zzkw.zzK(this.zza, null);
    }

    public final void zzs(zzix zzix2) {
        zzkw.zzK(this.zza, zzix2);
        zzkw.zzF(this.zza).zzM(zzix2);
    }

    public final void zzt(long l2, int n3) {
        zzkw.zzF(this.zza).zzN(l2, n3);
    }

    public final void zzu(zzan zzan2, zziy zziy2) {
        zzkw.zzL(this.zza, zzan2);
        zzkw.zzF(this.zza).zzO(zzan2, zziy2);
    }

    public final void zzv(zzdv zzdv2) {
        zzkw.zzM(this.zza, zzdv2);
        zzfh zzfh2 = zzkw.zzD(this.zza);
        zzkp zzkp2 = new zzkp(zzdv2);
        zzfh2.zzd(25, zzkp2);
        zzfh2.zzc();
    }
}

