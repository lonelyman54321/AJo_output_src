/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzhac;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzgzz
extends OutputStream {
    private static final byte[] zza = new byte[0];
    private final int zzb;
    private final ArrayList zzc;
    private int zzd;
    private byte[] zze;
    private int zzf;

    public zzgzz(int n3) {
        ArrayList arrayList;
        this.zzb = n3 = 128;
        this.zzc = arrayList = new ArrayList();
        byte[] byArray = new byte[n3];
        this.zze = byArray;
    }

    private final void zzd(int n3) {
        byte[] byArray = this.zze;
        zzgzy zzgzy2 = new zzgzy(byArray);
        this.zzc.add(zzgzy2);
        int n4 = this.zzd;
        int n7 = this.zze.length;
        this.zzd = n4 += n7;
        n7 = this.zzb;
        n3 = Math.max(n3, n4 >>>= 1);
        byte[] byArray2 = new byte[Math.max(n7, n3)];
        this.zze = byArray2;
        this.zzf = 0;
    }

    public final String toString() {
        String string2 = Integer.toHexString(System.identityHashCode(this));
        Integer n3 = this.zza();
        Object[] objectArray = new Object[]{string2, n3};
        return String.format("<ByteString.Output@%s size=%d>", objectArray);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void write(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                int n4;
                int n7;
                block4: {
                    try {
                        int n8 = this.zzf;
                        byte[] byArray = this.zze;
                        n7 = byArray.length;
                        if (n8 != n7) break block4;
                        n8 = 1;
                        this.zzd(n8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                byte[] byArray = this.zze;
                n7 = this.zzf;
                this.zzf = n4 = n7 + 1;
                n3 = (byte)n3;
                {
                    byArray[n7] = n3;
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void write(byte[] byArray, int n3, int n4) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                int n7;
                int n8;
                byte[] byArray2;
                block5: {
                    int n10;
                    try {
                        byArray2 = this.zze;
                        n8 = byArray2.length;
                        n7 = this.zzf;
                        if (n4 > (n8 -= n7)) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    System.arraycopy(byArray, n3, byArray2, n7, n4);
                    this.zzf = n10 = this.zzf + n4;
                    return;
                }
                System.arraycopy(byArray, n3, byArray2, n7, n8);
                n3 += n8;
                {
                    this.zzd(n4 -= n8);
                    byArray2 = this.zze;
                    n8 = 0;
                    System.arraycopy(byArray, n3, byArray2, 0, n4);
                    this.zzf = n4;
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        synchronized (this) {
            int n3 = this.zzd;
            int n4 = this.zzf;
            return n3 += n4;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzhac zzb() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object;
                int n3;
                block6: {
                    Object object2;
                    block5: {
                        try {
                            n3 = this.zzf;
                            object2 = this.zze;
                            int n4 = ((byte[])object2).length;
                            if (n3 >= n4) break block5;
                            if (n3 > 0) {
                                object = Arrays.copyOf((byte[])object2, n3);
                                object2 = this.zzc;
                                zzgzy zzgzy2 = new zzgzy((byte[])object);
                                ((ArrayList)object2).add(zzgzy2);
                            }
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object = this.zzc;
                    object2 = new zzgzy;
                    byte[] byArray = this.zze;
                    ((zzgzy)object2)(byArray);
                    ((ArrayList)object).add(object2);
                    object = zza;
                    this.zze = (byte[])object;
                }
                n3 = this.zzd;
                int n7 = this.zzf;
                this.zzd = n3 += n7;
                n3 = 0;
                object = null;
                this.zzf = 0;
                object = this.zzc;
                return zzhac.zzu((Iterable)object);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            ArrayList arrayList = this.zzc;
            arrayList.clear();
            arrayList = null;
            this.zzd = 0;
            this.zzf = 0;
            return;
        }
    }
}

