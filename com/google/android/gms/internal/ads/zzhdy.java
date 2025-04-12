/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzq;
import com.google.android.gms.internal.ads.zzgzv;
import com.google.android.gms.internal.ads.zzgzx;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhag;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhce;
import com.google.android.gms.internal.ads.zzhds;
import com.google.android.gms.internal.ads.zzhdu;
import com.google.android.gms.internal.ads.zzhdw;
import com.google.android.gms.internal.ads.zzhdx;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

final class zzhdy
extends zzhac {
    static final int[] zza;
    private final int zzc;
    private final zzhac zzd;
    private final zzhac zze;
    private final int zzf;
    private final int zzg;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[47];
        int[] nArray3 = nArray;
        nArray2[0] = 1;
        nArray3[1] = 1;
        nArray2[2] = 2;
        nArray3[3] = 3;
        nArray2[4] = 5;
        nArray3[5] = 8;
        nArray2[6] = 13;
        nArray3[7] = 21;
        nArray2[8] = 34;
        nArray3[9] = 55;
        nArray2[10] = 89;
        nArray3[11] = 144;
        nArray2[12] = 233;
        nArray3[13] = 377;
        nArray2[14] = 610;
        nArray3[15] = 987;
        nArray2[16] = 1597;
        nArray3[17] = 2584;
        nArray2[18] = 4181;
        nArray3[19] = 6765;
        nArray2[20] = 10946;
        nArray3[21] = 17711;
        nArray2[22] = 28657;
        nArray3[23] = 46368;
        nArray2[24] = 75025;
        nArray3[25] = 121393;
        nArray2[26] = 196418;
        nArray3[27] = 317811;
        nArray2[28] = 514229;
        nArray3[29] = 832040;
        nArray2[30] = 1346269;
        nArray3[31] = 2178309;
        nArray2[32] = 3524578;
        nArray3[33] = 5702887;
        nArray2[34] = 0x8CCCC9;
        nArray3[35] = 14930352;
        nArray2[36] = 24157817;
        nArray3[37] = 39088169;
        nArray2[38] = 63245986;
        nArray3[39] = 102334155;
        nArray2[40] = 165580141;
        nArray3[41] = 267914296;
        nArray2[42] = 433494437;
        nArray3[43] = 701408733;
        nArray2[44] = 1134903170;
        nArray3[45] = 1836311903;
        nArray3[46] = -1 >>> 1;
        zza = nArray;
    }

    private zzhdy(zzhac zzhac2, zzhac zzhac3) {
        int n3;
        int n4;
        this.zzd = zzhac2;
        this.zze = zzhac3;
        this.zzf = n4 = zzhac2.zzd();
        this.zzc = n3 = zzhac3.zzd() + n4;
        int n7 = zzhac2.zzf();
        int n8 = zzhac3.zzf();
        this.zzg = n7 = Math.max(n7, n8) + 1;
    }

    public /* synthetic */ zzhdy(zzhac zzhac2, zzhac zzhac3, zzhdx zzhdx2) {
        this(zzhac2, zzhac3);
    }

    public static /* bridge */ /* synthetic */ zzhac zzC(zzhdy zzhdy2) {
        return zzhdy2.zze;
    }

    public static zzhac zzD(zzhac zzhac2, zzhac zzhac3) {
        Object object;
        int n3 = zzhac3.zzd();
        if (n3 == 0) {
            return zzhac2;
        }
        n3 = zzhac2.zzd();
        if (n3 == 0) {
            return zzhac3;
        }
        n3 = zzhac2.zzd();
        int n4 = zzhac3.zzd() + n3;
        if (n4 < (n3 = 128)) {
            return zzhdy.zzE(zzhac2, zzhac3);
        }
        int n7 = zzhac2 instanceof zzhdy;
        if (n7 != 0) {
            zzhac zzhac4 = zzhac2;
            zzhac4 = (zzhdy)zzhac2;
            zzhac zzhac5 = ((zzhdy)zzhac4).zze;
            int n8 = zzhac5.zzd();
            int n10 = zzhac3.zzd() + n8;
            if (n10 < n3) {
                zzhac2 = zzhdy.zzE(((zzhdy)zzhac4).zze, zzhac3);
                zzhac3 = ((zzhdy)zzhac4).zzd;
                zzhdy zzhdy2 = new zzhdy(zzhac3, zzhac2);
                return zzhdy2;
            }
            object = ((zzhdy)zzhac4).zzd;
            zzhac5 = ((zzhdy)zzhac4).zze;
            n3 = ((zzhac)object).zzf();
            if (n3 > (n8 = zzhac5.zzf()) && (n3 = ((zzhdy)zzhac4).zzg) > (n8 = zzhac3.zzf())) {
                zzhac2 = ((zzhdy)zzhac4).zze;
                object = new zzhdy(zzhac2, zzhac3);
                zzhac2 = ((zzhdy)zzhac4).zzd;
                zzhac3 = new zzhdy(zzhac2, (zzhac)object);
                return zzhac3;
            }
        }
        n3 = zzhac2.zzf();
        n7 = zzhac3.zzf();
        if (n4 >= (n3 = zzhdy.zzc(Math.max(n3, n7) + 1))) {
            object = new zzhdy(zzhac2, zzhac3);
            return object;
        }
        object = new zzhdu(null);
        return zzhdu.zza((zzhdu)object, zzhac2, zzhac3);
    }

    private static zzhac zzE(zzhac zzhac2, zzhac zzhac3) {
        int n3 = zzhac2.zzd();
        int n4 = zzhac3.zzd();
        byte[] byArray = new byte[n3 + n4];
        zzhac2.zzA(byArray, 0, 0, n3);
        zzhac3.zzA(byArray, 0, n3, n4);
        zzhac2 = new zzgzy(byArray);
        return zzhac2;
    }

    public static int zzc(int n3) {
        int[] nArray = zza;
        int n4 = nArray.length;
        n4 = 47;
        if (n3 >= n4) {
            return -1 >>> 1;
        }
        return nArray[n3];
    }

    public static /* bridge */ /* synthetic */ zzhac zzg(zzhdy zzhdy2) {
        return zzhdy2.zzd;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof zzhac;
        if (n3 == 0) {
            return false;
        }
        n3 = this.zzc;
        int n4 = ((zzhac)(object = (zzhac)object)).zzd();
        if (n3 != n4) {
            return false;
        }
        n3 = this.zzc;
        if (n3 == 0) {
            return bl2;
        }
        n3 = this.zzr();
        n4 = ((zzhac)object).zzr();
        if (n3 != 0 && n4 != 0 && n3 != n4) {
            return false;
        }
        zzhdw zzhdw2 = new zzhdw(this, null);
        zzgzx zzgzx2 = zzhdw2.zza();
        zzhdw zzhdw3 = new zzhdw((zzhac)object, null);
        object = zzhdw3.zza();
        n4 = 0;
        int n7 = 0;
        int n8 = 0;
        while (true) {
            int n10;
            int n14;
            int n15;
            block14: {
                block15: {
                    block13: {
                        int n16;
                        block12: {
                            n15 = zzgzx2.zzd() - n4;
                            n14 = ((zzhac)object).zzd() - n7;
                            n10 = Math.min(n15, n14);
                            n16 = n4 == 0 ? zzgzx2.zzg((zzhac)object, n7, n10) : ((zzgzx)object).zzg(zzgzx2, n4, n10);
                            if (n16 != 0) break block12;
                            bl2 = false;
                            break block13;
                        }
                        n16 = this.zzc;
                        if ((n8 += n10) < n16) break block14;
                        if (n8 != n16) break block15;
                    }
                    return bl2;
                }
                object = new IllegalStateException();
                throw object;
            }
            if (n10 == n15) {
                zzgzx2 = zzhdw2.zza();
                n4 = 0;
            } else {
                n4 += n10;
            }
            if (n10 == n14) {
                object = zzhdw3.zza();
                n7 = 0;
                continue;
            }
            n7 += n10;
        }
    }

    public final /* synthetic */ Iterator iterator() {
        zzhds zzhds2 = new zzhds(this);
        return zzhds2;
    }

    public final byte zza(int n3) {
        int n4 = this.zzc;
        zzhac.zzz(n3, n4);
        return this.zzb(n3);
    }

    public final byte zzb(int n3) {
        int n4 = this.zzf;
        if (n3 < n4) {
            return this.zzd.zzb(n3);
        }
        zzhac zzhac2 = this.zze;
        return zzhac2.zzb(n3 -= n4);
    }

    public final int zzd() {
        return this.zzc;
    }

    public final void zze(byte[] byArray, int n3, int n4, int n7) {
        int n8 = n3 + n7;
        int n10 = this.zzf;
        if (n8 <= n10) {
            this.zzd.zze(byArray, n3, n4, n7);
            return;
        }
        if (n3 >= n10) {
            zzhac zzhac2 = this.zze;
            zzhac2.zze(byArray, n3 -= n10, n4, n7);
            return;
        }
        zzhac zzhac3 = this.zzd;
        zzhac3.zze(byArray, n3, n4, n10 -= n3);
        zzhac zzhac4 = this.zze;
        zzhac4.zze(byArray, 0, n4 += n10, n7 -= n10);
    }

    public final int zzf() {
        return this.zzg;
    }

    public final boolean zzh() {
        int n3 = this.zzg;
        int n4 = this.zzc;
        return n4 >= (n3 = zzhdy.zzc(n3));
    }

    public final int zzi(int n3, int n4, int n7) {
        int n8 = n4 + n7;
        int n10 = this.zzf;
        if (n8 <= n10) {
            return this.zzd.zzi(n3, n4, n7);
        }
        if (n4 >= n10) {
            zzhac zzhac2 = this.zze;
            return zzhac2.zzi(n3, n4 -= n10, n7);
        }
        zzhac zzhac3 = this.zzd;
        n3 = zzhac3.zzi(n3, n4, n10 -= n4);
        zzhac zzhac4 = this.zze;
        return zzhac4.zzi(n3, 0, n7 -= n10);
    }

    public final int zzj(int n3, int n4, int n7) {
        int n8 = n4 + n7;
        int n10 = this.zzf;
        if (n8 <= n10) {
            return this.zzd.zzj(n3, n4, n7);
        }
        if (n4 >= n10) {
            zzhac zzhac2 = this.zze;
            return zzhac2.zzj(n3, n4 -= n10, n7);
        }
        zzhac zzhac3 = this.zzd;
        n3 = zzhac3.zzj(n3, n4, n10 -= n4);
        zzhac zzhac4 = this.zze;
        return zzhac4.zzj(n3, 0, n7 -= n10);
    }

    public final zzhac zzk(int n3, int n4) {
        int n7 = this.zzc;
        if ((n7 = zzhac.zzq(n3, n4, n7)) == 0) {
            return zzhac.zzb;
        }
        int n8 = this.zzc;
        if (n7 == n8) {
            return this;
        }
        n7 = this.zzf;
        if (n4 <= n7) {
            return this.zzd.zzk(n3, n4);
        }
        if (n3 >= n7) {
            zzhac zzhac2 = this.zze;
            return zzhac2.zzk(n3 -= n7, n4 -= n7);
        }
        zzhac zzhac3 = this.zzd;
        n8 = zzhac3.zzd();
        zzhac zzhac4 = zzhac3.zzk(n3, n8);
        zzhac3 = this.zze;
        n8 = this.zzf;
        zzhac zzhac5 = zzhac3.zzk(0, n4 -= n8);
        zzhac3 = new zzhdy(zzhac4, zzhac5);
        return zzhac3;
    }

    public final zzham zzl() {
        boolean bl2;
        ByteBuffer byteBuffer;
        int n3;
        ArrayList<ByteBuffer> arrayList = new ArrayList<ByteBuffer>();
        Object object = new zzhdw(this, null);
        while ((n3 = ((zzhdw)object).hasNext()) != 0) {
            byteBuffer = ((zzhdw)object).zza().zzn();
            arrayList.add(byteBuffer);
        }
        object = arrayList.iterator();
        n3 = 0;
        byteBuffer = null;
        int n4 = 0;
        while (bl2 = object.hasNext()) {
            ByteBuffer byteBuffer2 = (ByteBuffer)object.next();
            int n7 = byteBuffer2.remaining();
            n4 += n7;
            n7 = (int)(byteBuffer2.hasArray() ? 1 : 0);
            if (n7 != 0) {
                n3 |= 1;
                continue;
            }
            bl2 = byteBuffer2.isDirect();
            if (bl2) {
                n3 |= 2;
                continue;
            }
            n3 |= 4;
        }
        int n8 = 2;
        if (n3 == n8) {
            n3 = 1;
            object = new zzhag(arrayList, n4, n3 != 0, null);
        } else {
            object = new zzhce(arrayList);
            int n10 = 4096;
            object = zzham.zzI((InputStream)object, n10);
        }
        return object;
    }

    public final String zzm(Charset charset) {
        byte[] byArray = this.zzB();
        String string2 = new String(byArray, charset);
        return string2;
    }

    public final ByteBuffer zzn() {
        throw null;
    }

    public final void zzo(zzgzq zzgzq2) {
        this.zzd.zzo(zzgzq2);
        this.zze.zzo(zzgzq2);
    }

    public final boolean zzp() {
        zzhac zzhac2 = this.zzd;
        zzhac zzhac3 = this.zze;
        int n3 = this.zzf;
        int n4 = zzhac2.zzj(0, 0, n3);
        n3 = zzhac3.zzd();
        return (n4 = zzhac3.zzj(n4, 0, n3)) == 0;
    }

    public final zzgzv zzs() {
        zzhds zzhds2 = new zzhds(this);
        return zzhds2;
    }
}

