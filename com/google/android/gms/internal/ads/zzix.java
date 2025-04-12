/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzix {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        Object object = this;
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        int n8 = this.zzd;
        int n10 = this.zze;
        int n14 = this.zzf;
        int n15 = this.zzg;
        int n16 = this.zzh;
        int n17 = this.zzi;
        int n18 = this.zzj;
        long l2 = this.zzk;
        int n19 = this.zzl;
        object = fQ2.a("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=", n3, n4);
        m10.a((StringBuilder)object, n7, "\n skippedInputBuffers=", n8, "\n renderedOutputBuffers=");
        m10.a((StringBuilder)object, n10, "\n skippedOutputBuffers=", n14, "\n droppedBuffers=");
        m10.a((StringBuilder)object, n15, "\n droppedInputBuffers=", n16, "\n maxConsecutiveDroppedBuffers=");
        m10.a((StringBuilder)object, n17, "\n droppedToKeyframeEvents=", n18, "\n totalVideoFrameProcessingOffsetUs=");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append("\n videoFrameProcessingOffsetCount=");
        ((StringBuilder)object).append(n19);
        ((StringBuilder)object).append("\n}");
        return ((StringBuilder)object).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }
}

