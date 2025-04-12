/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision;

public class Frame$Metadata {
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf = -1;

    public Frame$Metadata() {
    }

    public Frame$Metadata(Frame$Metadata frame$Metadata) {
        int n3;
        long l2;
        int n4;
        this.zza = n4 = frame$Metadata.getWidth();
        this.zzb = n4 = frame$Metadata.getHeight();
        this.zzc = n4 = frame$Metadata.getId();
        this.zzd = l2 = frame$Metadata.getTimestampMillis();
        this.zze = n4 = frame$Metadata.getRotation();
        this.zzf = n3 = frame$Metadata.getFormat();
    }

    public static /* synthetic */ int zza(Frame$Metadata frame$Metadata, int n3) {
        frame$Metadata.zza = n3;
        return n3;
    }

    public static /* synthetic */ long zza(Frame$Metadata frame$Metadata, long l2) {
        frame$Metadata.zzd = l2;
        return l2;
    }

    public static /* synthetic */ int zzb(Frame$Metadata frame$Metadata, int n3) {
        frame$Metadata.zzb = n3;
        return n3;
    }

    public static /* synthetic */ int zzc(Frame$Metadata frame$Metadata, int n3) {
        frame$Metadata.zzf = n3;
        return n3;
    }

    public static /* synthetic */ int zzd(Frame$Metadata frame$Metadata, int n3) {
        frame$Metadata.zzc = n3;
        return n3;
    }

    public static /* synthetic */ int zze(Frame$Metadata frame$Metadata, int n3) {
        frame$Metadata.zze = n3;
        return n3;
    }

    public int getFormat() {
        return this.zzf;
    }

    public int getHeight() {
        return this.zzb;
    }

    public int getId() {
        return this.zzc;
    }

    public int getRotation() {
        return this.zze;
    }

    public long getTimestampMillis() {
        return this.zzd;
    }

    public int getWidth() {
        return this.zza;
    }

    public final void zza() {
        int n3 = this.zze % 2;
        if (n3 != 0) {
            int n4;
            n3 = this.zza;
            this.zza = n4 = this.zzb;
            this.zzb = n3;
        }
        this.zze = 0;
    }
}

