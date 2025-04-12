/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgdx;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzfu {
    private static final char[] zza;
    private static final char[] zzb;
    private static final zzgbh zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    static {
        Object object = new char[]{'\r', '\n'};
        zza = object;
        object = new char[]{'\n'};
        zzb = object;
        object = zzfxs.zza;
        Charset charset = zzfxs.zzc;
        Charset charset2 = zzfxs.zzf;
        Charset charset3 = zzfxs.zzd;
        Charset charset4 = zzfxs.zze;
        zzc = zzgbh.zzr(object, charset, charset2, charset3, charset4);
    }

    public zzfu() {
        byte[] byArray = zzgd.zzf;
        this.zzd = byArray;
    }

    public zzfu(int n3) {
        byte[] byArray = new byte[n3];
        this.zzd = byArray;
        this.zzf = n3;
    }

    public zzfu(byte[] byArray) {
        int n3;
        this.zzd = byArray;
        this.zzf = n3 = byArray.length;
    }

    public zzfu(byte[] byArray, int n3) {
        this.zzd = byArray;
        this.zzf = n3;
    }

    private final char zzN(Charset charset, char[] cArray) {
        int n3 = this.zzO(charset);
        if (n3 != 0) {
            int n4 = n3 >> 16;
            for (char c2 : cArray) {
                char c3 = (char)n4;
                if (c2 != c3) continue;
                int n7 = this.zze;
                n3 = (char)n3;
                this.zze = n7 += n3;
                return c3;
            }
        }
        return '\u0000';
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final int zzO(Charset object) {
        void var8_22;
        int n3;
        int n4;
        int n7;
        boolean bl2;
        int n8;
        void var8_29;
        int n10;
        int n14;
        int n15;
        boolean bl3;
        Charset charset = zzfxs.zzc;
        boolean bl4 = ((Charset)object).equals(charset);
        int n16 = 1;
        if ((bl4 || (bl3 = ((Charset)object).equals(charset = zzfxs.zza))) && (n15 = (n14 = this.zzf) - (n10 = this.zze)) > 0) {
            object = this.zzd;
            long l2 = object[n10] & 0xFF;
            byte by2 = (byte)zzgdx.zza(l2);
            return (zzgdx.zza((long)var8_29) << 16) + n8;
        }
        charset = zzfxs.zzf;
        boolean bl5 = ((Charset)object).equals(charset);
        n10 = 2;
        if ((bl5 || (bl2 = ((Charset)object).equals(charset = zzfxs.zzd))) && (n7 = (n4 = this.zzf) - (n3 = this.zze)) >= n10) {
            object = this.zzd;
            Object object2 = object[n3];
            Object object3 = object[n3 += n16];
            char c2 = zzgdx.zzb((byte)object2, (byte)object3);
        } else {
            charset = zzfxs.zze;
            boolean bl6 = ((Charset)object).equals(charset);
            if (!bl6) return 0;
            int n17 = this.zzf;
            int n18 = this.zze;
            int n19 = n17 - n18;
            if (n19 < n10) return 0;
            object = this.zzd;
            int n20 = n18 + 1;
            Object object4 = object[n20];
            Object object5 = object[n18];
            char c3 = zzgdx.zzb((byte)object4, (byte)object5);
        }
        byte by4 = (byte)var8_22;
        n8 = 2;
        return (zzgdx.zza((long)var8_29) << 16) + n8;
    }

    public final String zzA(int n3, Charset charset) {
        byte[] byArray = this.zzd;
        int n4 = this.zze;
        String string2 = new String(byArray, n4, n3, charset);
        this.zze = n4 += n3;
        return string2;
    }

    public final Charset zzB() {
        int n3;
        int n4;
        byte[] byArray;
        int n7;
        int n8 = this.zzf;
        int n10 = this.zze;
        int n14 = 3;
        if ((n8 -= n10) >= n14 && (n7 = (byArray = this.zzd)[n10]) == (n4 = -17)) {
            n7 = n10 + 1;
            n4 = -69;
            if ((n7 = byArray[n7]) == n4) {
                n7 = n10 + 2;
                n3 = byArray[n7];
                if (n3 == (n7 = -65)) {
                    this.zze = n10 += n14;
                    return zzfxs.zzc;
                }
            }
        }
        if (n8 >= (n14 = 2)) {
            byte[] byArray2 = this.zzd;
            n3 = byArray2[n10];
            n7 = -1;
            n4 = -2;
            if (n3 == n4) {
                n3 = n10 + 1;
                n8 = byArray2[n3];
                if (n8 == n7) {
                    this.zze = n10 += n14;
                    return zzfxs.zzd;
                }
            } else if (n3 == n7 && (n8 = byArray2[n3 = n10 + 1]) == n4) {
                this.zze = n10 += n14;
                return zzfxs.zze;
            }
        }
        return null;
    }

    public final short zzC() {
        int n3;
        byte[] byArray = this.zzd;
        int n4 = this.zze;
        this.zze = n3 = n4 + 1;
        int n7 = byArray[n4] & 0xFF;
        this.zze = n4 += 2;
        return (short)((byArray[n3] & 0xFF) << 8 | n7);
    }

    public final short zzD() {
        int n3;
        byte[] byArray = this.zzd;
        int n4 = this.zze;
        this.zze = n3 = n4 + 1;
        int n7 = byArray[n4] & 0xFF;
        this.zze = n4 += 2;
        int n8 = byArray[n3] & 0xFF;
        n4 = n7 << 8;
        return (short)(n8 | n4);
    }

    public final void zzE(int n3) {
        byte[] byArray = this.zzd;
        int n4 = byArray.length;
        if (n3 > n4) {
            byte[] byArray2 = Arrays.copyOf(byArray, n3);
            this.zzd = byArray2;
        }
    }

    public final void zzF(zzft zzft2, int n3) {
        byte[] byArray = zzft2.zza;
        this.zzG(byArray, 0, n3);
        zzft2.zzk(0);
    }

    public final void zzG(byte[] byArray, int n3, int n4) {
        int n7;
        byte[] byArray2 = this.zzd;
        int n8 = this.zze;
        System.arraycopy(byArray2, n8, byArray, n3, n4);
        this.zze = n7 = this.zze + n4;
    }

    public final void zzH(int n3) {
        byte[] byArray = this.zzd;
        int n4 = byArray.length;
        if (n4 < n3) {
            byArray = new byte[n3];
        }
        this.zzI(byArray, n3);
    }

    public final void zzI(byte[] byArray, int n3) {
        this.zzd = byArray;
        this.zzf = n3;
        this.zze = 0;
    }

    public final void zzJ(int n3) {
        byte[] byArray;
        int n4;
        boolean bl2 = false;
        if (n3 >= 0 && n3 <= (n4 = (byArray = this.zzd).length)) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        this.zzf = n3;
    }

    public final void zzK(int n3) {
        int n4;
        boolean bl2 = false;
        if (n3 >= 0 && n3 <= (n4 = this.zzf)) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        this.zze = n3;
    }

    public final void zzL(int n3) {
        int n4 = this.zze + n3;
        this.zzK(n4);
    }

    public final byte[] zzM() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        boolean bl2 = zzc.contains(charset);
        String string2 = String.valueOf(charset);
        string2 = "Unsupported charset: ".concat(string2);
        zzeq.zze(bl2, string2);
        return (char)(this.zzO(charset) >> 16);
    }

    public final int zzb() {
        int n3 = this.zzf;
        int n4 = this.zze;
        return n3 - n4;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        byte[] byArray = this.zzd;
        int n3 = this.zze;
        return byArray[n3] & 0xFF;
    }

    public final int zzg() {
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.zzd;
        int n8 = this.zze;
        this.zze = n7 = n8 + 1;
        int n10 = byArray[n8] & 0xFF;
        this.zze = n4 = n8 + 2;
        n7 = byArray[n7] & 0xFF;
        this.zze = n3 = n8 + 3;
        n4 = byArray[n4] & 0xFF;
        this.zze = n8 += 4;
        int n14 = byArray[n3] & 0xFF;
        n8 = n10 << 24;
        n8 |= (n7 <<= 16);
        n7 = n4 << 8;
        return n14 | (n8 |= n7);
    }

    public final int zzh() {
        int n3;
        int n4;
        byte[] byArray = this.zzd;
        int n7 = this.zze;
        this.zze = n4 = n7 + 1;
        int n8 = byArray[n7] & 0xFF;
        this.zze = n3 = n7 + 2;
        n4 = byArray[n4] & 0xFF;
        this.zze = n7 += 3;
        int n10 = byArray[n3] & 0xFF;
        n7 = n8 << 24 >> 8;
        return n10 | (n7 |= (n4 <<= 8));
    }

    public final int zzi() {
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.zzd;
        int n8 = this.zze;
        this.zze = n7 = n8 + 1;
        int n10 = byArray[n8] & 0xFF;
        this.zze = n4 = n8 + 2;
        n7 = byArray[n7] & 0xFF;
        this.zze = n3 = n8 + 3;
        n4 = byArray[n4] & 0xFF;
        this.zze = n8 += 4;
        int n14 = byArray[n3] & 0xFF;
        n8 = n7 << 8 | n10;
        n7 = n4 << 16;
        return n14 << 24 | (n8 |= n7);
    }

    public final int zzj() {
        int n3 = this.zzi();
        if (n3 >= 0) {
            return n3;
        }
        String string2 = hj0_0.a(n3, "Top bit not zero: ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int zzk() {
        int n3;
        byte[] byArray = this.zzd;
        int n4 = this.zze;
        this.zze = n3 = n4 + 1;
        int n7 = byArray[n4] & 0xFF;
        this.zze = n4 += 2;
        return (byArray[n3] & 0xFF) << 8 | n7;
    }

    public final int zzl() {
        int n3 = this.zzm() << 21;
        int n4 = this.zzm() << 14;
        int n7 = this.zzm() << 7;
        n3 = n3 | n4 | n7;
        n4 = this.zzm();
        return n3 | n4;
    }

    public final int zzm() {
        int n3;
        byte[] byArray = this.zzd;
        int n4 = this.zze;
        this.zze = n3 = n4 + 1;
        return byArray[n4] & 0xFF;
    }

    public final int zzn() {
        int n3;
        int n4;
        byte[] byArray = this.zzd;
        int n7 = this.zze;
        this.zze = n4 = n7 + 1;
        int n8 = byArray[n7] & 0xFF;
        this.zze = n3 = n7 + 2;
        int n10 = byArray[n4] & 0xFF;
        this.zze = n7 += 4;
        n7 = n8 << 8;
        return n10 | n7;
    }

    public final int zzo() {
        int n3;
        int n4;
        byte[] byArray = this.zzd;
        int n7 = this.zze;
        this.zze = n4 = n7 + 1;
        int n8 = byArray[n7] & 0xFF;
        this.zze = n3 = n7 + 2;
        n4 = byArray[n4] & 0xFF;
        this.zze = n7 += 3;
        int n10 = byArray[n3] & 0xFF;
        n7 = n8 << 16;
        return n10 | (n7 |= (n4 <<= 8));
    }

    public final int zzp() {
        int n3 = this.zzg();
        if (n3 >= 0) {
            return n3;
        }
        String string2 = hj0_0.a(n3, "Top bit not zero: ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int zzq() {
        int n3;
        byte[] byArray = this.zzd;
        int n4 = this.zze;
        this.zze = n3 = n4 + 1;
        int n7 = byArray[n4] & 0xFF;
        this.zze = n4 += 2;
        int n8 = byArray[n3] & 0xFF;
        n4 = n7 << 8;
        return n8 | n4;
    }

    public final long zzr() {
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.zzd;
        int n8 = this.zze;
        this.zze = n7 = n8 + 1;
        long l2 = byArray[n8];
        this.zze = n4 = n8 + 2;
        long l3 = byArray[n7];
        this.zze = n7 = n8 + 3;
        long l4 = byArray[n4];
        this.zze = n4 = n8 + 4;
        long l7 = byArray[n7];
        this.zze = n7 = n8 + 5;
        long l8 = byArray[n4];
        this.zze = n4 = n8 + 6;
        n7 = byArray[n7];
        long l12 = l2;
        long l14 = n7;
        this.zze = n3 = n8 + 7;
        n4 = byArray[n4];
        long l15 = l14;
        l14 = n4;
        n4 = 8;
        this.zze = n8 += n4;
        long l16 = byArray[n3];
        long l17 = 255L;
        l3 &= l17;
        l4 &= l17;
        l7 &= l17;
        l8 &= l17;
        l15 &= l17;
        l14 &= l17;
        l16 &= l17;
        l12 = l2 & l17;
        long l18 = l3 << n4 | l12;
        l3 = l4 << 16;
        l18 |= l3;
        l3 = l7 << 24;
        l18 |= l3;
        l3 = l8 << 32;
        l18 |= l3;
        l3 = l15 << 40;
        l14 = l14 << 48 | (l18 |= l3);
        return l16 << 56 | l14;
    }

    public final long zzs() {
        int n3;
        int n4;
        byte[] byArray = this.zzd;
        int n7 = this.zze;
        this.zze = n4 = n7 + 1;
        long l2 = byArray[n7];
        this.zze = n3 = n7 + 2;
        long l3 = byArray[n4];
        this.zze = n4 = n7 + 3;
        long l4 = byArray[n3];
        this.zze = n7 += 4;
        long l7 = byArray[n4];
        long l8 = 255L;
        long l12 = l3 & l8;
        long l14 = l4 & l8;
        long l15 = l2 & l8;
        long l16 = l12 << 8;
        l15 |= l16;
        l16 = l14 << 16;
        return (l7 &= l8) << 24 | (l15 |= l16);
    }

    public final long zzt() {
        int n3;
        int n4;
        byte[] byArray = this.zzd;
        int n7 = this.zze;
        this.zze = n4 = n7 + 1;
        long l2 = byArray[n7];
        this.zze = n3 = n7 + 2;
        long l3 = byArray[n4];
        this.zze = n4 = n7 + 3;
        long l4 = byArray[n3];
        this.zze = n3 = n7 + 4;
        long l7 = byArray[n4];
        this.zze = n4 = n7 + 5;
        long l8 = byArray[n3];
        this.zze = n3 = n7 + 6;
        n4 = byArray[n4];
        long l12 = l8;
        l8 = n4;
        this.zze = n4 = n7 + 7;
        n3 = byArray[n3];
        long l14 = l8;
        l8 = n3;
        n3 = 8;
        this.zze = n7 += n3;
        long l15 = byArray[n4];
        long l16 = 255L;
        long l17 = l2 & l16;
        l3 &= l16;
        l4 &= l16;
        l7 &= l16;
        l12 &= l16;
        l14 &= l16;
        l8 &= l16;
        l17 <<= 56;
        l17 |= (l3 <<= 48);
        l3 = l4 << 40;
        l17 |= l3;
        l3 = l7 << 32;
        l17 |= l3;
        l3 = l12 << 24;
        l17 |= l3;
        l3 = l14 << 16;
        l17 |= l3;
        long l18 = l8 << n3;
        return l15 & l16 | (l17 |= l18);
    }

    public final long zzu() {
        int n3;
        int n4;
        byte[] byArray = this.zzd;
        int n7 = this.zze;
        this.zze = n4 = n7 + 1;
        long l2 = byArray[n7];
        this.zze = n3 = n7 + 2;
        long l3 = byArray[n4];
        this.zze = n4 = n7 + 3;
        long l4 = byArray[n3];
        this.zze = n7 += 4;
        long l7 = byArray[n4];
        long l8 = 255L;
        long l12 = l2 & l8;
        long l14 = l3 & l8;
        l3 = l4 & l8;
        l12 <<= 24;
        l12 |= (l14 <<= 16);
        l14 = l3 << 8;
        return l7 & l8 | (l12 |= l14);
    }

    public final long zzv() {
        long l2;
        long l3 = this.zzt();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return l3;
        }
        String string2 = Wm2.a(l3, "Top bit not zero: ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final long zzw() {
        int n3;
        int n4;
        int n7;
        int n8;
        Object object = this.zzd;
        int n10 = this.zze;
        byte by2 = object[n10];
        long l2 = by2;
        int n14 = 7;
        int n15 = 7;
        while (true) {
            n8 = 0;
            n7 = 6;
            n4 = 1;
            if (n15 < 0) break;
            n3 = n4 << n15;
            long l3 = (long)n3 & l2;
            long l4 = 0L;
            long l7 = l3 - l4;
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 == false) {
                if (n15 < n7) {
                    long l8 = n3 += -1;
                    l2 &= l8;
                    n8 = 7 - n15;
                    break;
                }
                if (n15 != n14) break;
                n8 = 1;
                break;
            }
            n15 += -1;
        }
        if (n8 != 0) {
            while (n4 < n8) {
                Object object3 = this.zzd;
                n15 = this.zze + n4;
                n14 = object3[n15];
                n3 = 128;
                if ((n15 = n14 & 0xC0) == n3) {
                    l2 <<= n7;
                    long l12 = n14 &= 0x3F;
                    l2 |= l12;
                    ++n4;
                    continue;
                }
                object3 = new NumberFormatException;
                object = Wm2.a(l2, "Invalid UTF-8 sequence continuation byte: ");
                object3((String)object);
                throw object3;
            }
            this.zze = n14 = this.zze + n8;
            return l2;
        }
        object = Wm2.a(l2, "Invalid UTF-8 sequence first byte: ");
        NumberFormatException numberFormatException = new NumberFormatException((String)object);
        throw numberFormatException;
    }

    public final String zzx(char c2) {
        c2 = (char)this.zzf;
        int n3 = this.zze;
        if ((c2 = (char)(c2 - n3)) != '\u0000') {
            Object object;
            while (n3 < (c2 = (char)this.zzf) && (c2 = (object = this.zzd)[n3]) != '\u0000') {
                ++n3;
            }
            object = this.zzd;
            int n4 = this.zze;
            int n7 = n3 - n4;
            object = zzgd.zzB(object, n4, n7);
            this.zze = n3;
            n4 = this.zzf;
            if (n3 < n4) {
                this.zze = ++n3;
            }
            return object;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public final String zzy(Charset object) {
        int n3;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        block8: {
            boolean bl2;
            object5 = zzc;
            boolean n32 = ((zzgax)object5).contains(object);
            object4 = String.valueOf(object);
            Object object6 = "Unsupported charset: ";
            object4 = ((String)object6).concat((String)object4);
            zzeq.zze(n32, object4);
            int n4 = this.zzf;
            object3 = this.zze;
            int n7 = n4 - object3;
            if (n7 == 0) {
                return null;
            }
            object5 = zzfxs.zza;
            object3 = ((Charset)object).equals(object5);
            if (object3 == 0) {
                this.zzB();
            }
            object4 = zzfxs.zzc;
            object3 = ((Charset)object).equals(object4);
            int n8 = 1;
            if (object3 == 0 && !(bl2 = ((Charset)object).equals(object5))) {
                boolean bl3;
                boolean bl4;
                object5 = zzfxs.zzf;
                boolean bl5 = ((Charset)object).equals(object5);
                n8 = 2;
                if (!(bl5 || (bl4 = ((Charset)object).equals(object5 = zzfxs.zze)) || (bl3 = ((Charset)object).equals(object5 = zzfxs.zzd)))) {
                    object = String.valueOf(object);
                    object = ((String)object6).concat((String)object);
                    object5 = new IllegalArgumentException((String)object);
                    throw object5;
                }
            }
            int n10 = this.zze;
            while (true) {
                void var3_11;
                object3 = this.zzf;
                object2 = n8 + -1;
                if (var3_11 >= (object2 = object3 - object2)) break;
                object4 = zzfxs.zzc;
                object3 = ((Charset)object).equals(object4);
                if ((object3 != 0 || (object3 = (Object)((Charset)object).equals(object4 = zzfxs.zza)) != 0) && (object3 = (Object)zzgd.zzM((int)(object4 = (Object)this.zzd)[var3_11])) != 0 || ((object3 = (Object)((Charset)object).equals(object4 = zzfxs.zzf)) != 0 || (object3 = (Object)((Charset)object).equals(object4 = zzfxs.zzd)) != 0) && (object2 = (Object)(object4 = (Object)this.zzd)[var3_11]) == 0 && (object3 = (Object)zzgd.zzM((int)object4[object2 = var3_11 + true])) != 0) break block8;
                object4 = zzfxs.zze;
                object3 = ((Charset)object).equals(object4);
                if (object3 != 0) {
                    object3 = var3_11 + true;
                    object6 = this.zzd;
                    if ((object3 = (Object)object6[object3]) == 0 && (object3 = (Object)zzgd.zzM((int)object6[var3_11])) != 0) break block8;
                }
                var3_11 += n8;
            }
            n3 = object3;
        }
        object3 = this.zze;
        int n14 = n3 - object3;
        object5 = this.zzA(n14, (Charset)object);
        object3 = this.zze;
        object2 = this.zzf;
        if (object3 != object2 && (object3 = (Object)this.zzN((Charset)object, (char[])(object4 = (Object)zza))) == (object2 = 13)) {
            object4 = zzb;
            this.zzN((Charset)object, (char[])object4);
        }
        return object5;
    }

    public final String zzz(int n3) {
        byte[] byArray;
        if (n3 == 0) {
            return "";
        }
        int n4 = this.zze;
        int n7 = n4 + n3 + -1;
        int n8 = this.zzf;
        n7 = n7 < n8 && (n7 = (byArray = this.zzd)[n7]) == 0 ? n3 + -1 : n3;
        String string2 = zzgd.zzB(this.zzd, n4, n7);
        this.zze = n7 = this.zze + n3;
        return string2;
    }
}

