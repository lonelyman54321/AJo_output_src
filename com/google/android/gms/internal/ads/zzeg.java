/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.text.Layout$Alignment
 */
package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import com.google.android.gms.internal.ads.zzef;
import com.google.android.gms.internal.ads.zzei;

public final class zzeg {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzeg() {
        int n3;
        float f5;
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = f5 = -3.4028235E38f;
        this.zzf = n3 = -1 << -1;
        this.zzg = n3;
        this.zzh = f5;
        this.zzi = n3;
        this.zzj = n3;
        this.zzk = f5;
        this.zzl = f5;
        this.zzm = f5;
        this.zzn = n3;
    }

    public /* synthetic */ zzeg(zzei zzei2, zzef object) {
        float f5;
        int n3;
        float f6;
        this.zza = object = zzei2.zzc;
        object = zzei2.zzf;
        this.zzb = object;
        object = zzei2.zzd;
        this.zzc = object;
        object = zzei2.zze;
        this.zzd = object;
        this.zze = f6 = zzei2.zzg;
        this.zzf = n3 = zzei2.zzh;
        this.zzg = n3 = zzei2.zzi;
        this.zzh = f6 = zzei2.zzj;
        this.zzi = n3 = zzei2.zzk;
        this.zzj = n3 = zzei2.zzn;
        this.zzk = f6 = zzei2.zzo;
        this.zzl = f6 = zzei2.zzl;
        this.zzm = f6 = zzei2.zzm;
        this.zzn = n3 = zzei2.zzp;
        this.zzo = f5 = zzei2.zzq;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final zzeg zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzeg zzd(float f5) {
        this.zzm = f5;
        return this;
    }

    public final zzeg zze(float f5, int n3) {
        this.zze = f5;
        this.zzf = n3;
        return this;
    }

    public final zzeg zzf(int n3) {
        this.zzg = n3;
        return this;
    }

    public final zzeg zzg(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzeg zzh(float f5) {
        this.zzh = f5;
        return this;
    }

    public final zzeg zzi(int n3) {
        this.zzi = n3;
        return this;
    }

    public final zzeg zzj(float f5) {
        this.zzo = f5;
        return this;
    }

    public final zzeg zzk(float f5) {
        this.zzl = f5;
        return this;
    }

    public final zzeg zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzeg zzm(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzeg zzn(float f5, int n3) {
        this.zzk = f5;
        this.zzj = n3;
        return this;
    }

    public final zzeg zzo(int n3) {
        this.zzn = n3;
        return this;
    }

    public final zzei zzp() {
        CharSequence charSequence = this.zza;
        Layout.Alignment alignment = this.zzc;
        Layout.Alignment alignment2 = this.zzd;
        Bitmap bitmap = this.zzb;
        float f5 = this.zze;
        int n3 = this.zzf;
        int n4 = this.zzg;
        float f6 = this.zzh;
        int n7 = this.zzi;
        int n8 = this.zzj;
        float f7 = this.zzk;
        float f8 = this.zzl;
        float f11 = this.zzm;
        int n10 = this.zzn;
        float f12 = this.zzo;
        zzei zzei2 = new zzei(charSequence, alignment, alignment2, bitmap, f5, n3, n4, f6, n7, n8, f7, f8, f11, false, -16777216, n10, f12, null);
        return zzei2;
    }

    public final CharSequence zzq() {
        return this.zza;
    }
}

