/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.media.AudioManager
 *  android.net.Uri
 *  android.os.Handler
 *  android.provider.Settings$System
 */
package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzfpm;

public final class zzfpa
extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzfoy zzc;
    private float zzd;
    private final zzfpm zze;

    public zzfpa(Handler handler, Context context, zzfoy zzfoy2, zzfpm zzfpm2) {
        super(handler);
        this.zza = context;
        handler = (AudioManager)context.getSystemService("audio");
        this.zzb = handler;
        this.zzc = zzfoy2;
        this.zze = zzfpm2;
    }

    private final float zzc() {
        AudioManager audioManager = this.zzb;
        int n3 = 3;
        int n4 = audioManager.getStreamVolume(n3);
        int n7 = audioManager.getStreamMaxVolume(n3);
        n3 = 0;
        float f5 = 0.0f;
        if (n7 > 0 && n4 > 0) {
            f5 = n4;
            float f6 = n7;
            f5 /= f6;
            n7 = 1065353216;
            f6 = 1.0f;
            float f7 = f5 - f6;
            n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
            if (n4 > 0) {
                n3 = 1065353216;
                f5 = 1.0f;
            }
        }
        return f5;
    }

    private final void zzd() {
        zzfpm zzfpm2 = this.zze;
        float f5 = this.zzd;
        zzfpm2.zze(f5);
    }

    public final void onChange(boolean bl2) {
        super.onChange(bl2);
        float f5 = this.zzc();
        float f6 = this.zzd;
        float f7 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (f7 != false) {
            this.zzd = f5;
            this.zzd();
        }
    }

    public final void zza() {
        float f5;
        this.zzd = f5 = this.zzc();
        this.zzd();
        ContentResolver contentResolver = this.zza.getContentResolver();
        Uri uri = Settings.System.CONTENT_URI;
        contentResolver.registerContentObserver(uri, true, (ContentObserver)this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver((ContentObserver)this);
    }
}

