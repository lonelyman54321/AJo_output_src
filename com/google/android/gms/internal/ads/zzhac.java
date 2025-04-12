/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzq;
import com.google.android.gms.internal.ads.zzgzr;
import com.google.android.gms.internal.ads.zzgzs;
import com.google.android.gms.internal.ads.zzgzv;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzgzz;
import com.google.android.gms.internal.ads.zzhab;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhdy;
import com.google.android.gms.internal.ads.zzheo;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzhac
implements Iterable,
Serializable {
    private static final Comparator zza;
    public static final zzhac zzb;
    private static final zzhab zzd;
    private int zzc = 0;

    static {
        byte[] byArray = zzhcb.zzd;
        Object object = new zzgzy(byArray);
        zzb = object;
        zzd = object = new zzhab(null);
        zza = object = new zzgzs();
    }

    private static zzhac zzc(Iterator object, int n3) {
        block2: {
            zzhac zzhac2;
            int n4;
            block5: {
                block4: {
                    block3: {
                        if (n3 <= 0) break block2;
                        n4 = 1;
                        if (n3 != n4) break block3;
                        object = (zzhac)object.next();
                        break block4;
                    }
                    n4 = n3 >>> 1;
                    zzhac2 = zzhac.zzc((Iterator)object, n4);
                    object = zzhac.zzc((Iterator)object, n3 -= n4);
                    n3 = zzhac2.zzd();
                    n4 = (-1 >>> 1) - n3;
                    if (n4 < (n3 = ((zzhac)object).zzd())) break block5;
                    object = zzhdy.zzD(zzhac2, (zzhac)object);
                }
                return object;
            }
            n4 = zzhac2.zzd();
            int n7 = ((zzhac)object).zzd();
            object = D70.b(n4, n7, "ByteString would be too long: ", "+");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        String string2 = Gj0.b(n3, "length (", ") must be >= 1");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static int zzq(int n3, int n4, int n7) {
        int n8 = n3 | n4;
        int n10 = n4 - n3;
        n8 |= n10;
        int n14 = n7 - n4;
        if ((n8 |= n14) < 0) {
            if (n3 >= 0) {
                if (n4 < n3) {
                    String string2 = D70.b(n3, n4, "Beginning index larger than ending index: ", ", ");
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
                    throw indexOutOfBoundsException;
                }
                String string3 = D70.b(n4, n7, "End index: ", " >= ");
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
                throw indexOutOfBoundsException;
            }
            String string4 = Gj0.b(n3, "Beginning index: ", " < 0");
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string4);
            throw indexOutOfBoundsException;
        }
        return n10;
    }

    public static zzgzz zzt() {
        zzgzz zzgzz2 = new zzgzz(128);
        return zzgzz2;
    }

    public static zzhac zzu(Iterable iterable) {
        int n3;
        boolean bl2 = iterable instanceof Collection;
        if (!bl2) {
            boolean bl3;
            Iterator iterator = iterable.iterator();
            n3 = 0;
            while (bl3 = iterator.hasNext()) {
                iterator.next();
                ++n3;
            }
        } else {
            n3 = ((Collection)iterable).size();
        }
        if (n3 == 0) {
            return zzb;
        }
        return zzhac.zzc(iterable.iterator(), n3);
    }

    public static zzhac zzv(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zzhac.zzq(n3, n7, n8);
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, n3, byArray2, 0, n4);
        zzgzy zzgzy2 = new zzgzy(byArray2);
        return zzgzy2;
    }

    public static zzhac zzw(String object) {
        Charset charset = zzhcb.zzb;
        object = ((String)object).getBytes(charset);
        zzgzy zzgzy2 = new zzgzy((byte[])object);
        return zzgzy2;
    }

    public static void zzz(int n3, int n4) {
        int n7 = n3 + 1;
        if ((n7 = n4 - n7 | n3) < 0) {
            if (n3 < 0) {
                String string2 = hj0_0.a(n3, "Index < 0: ");
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string2);
                throw arrayIndexOutOfBoundsException;
            }
            String string3 = D70.b(n3, n4, "Index > length: ", ", ");
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string3);
            throw arrayIndexOutOfBoundsException;
        }
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n3 = this.zzc;
        if (n3 == 0) {
            int n4 = this.zzd();
            n3 = this.zzi(n4, 0, n4);
            if (n3 == 0) {
                n3 = 1;
            }
            this.zzc = n3;
        }
        return n3;
    }

    public final String toString() {
        String string2;
        int n3;
        Object object = Locale.ROOT;
        int n4 = System.identityHashCode(this);
        object = Integer.toHexString(n4);
        int n7 = this.zzd();
        int n8 = this.zzd();
        if (n8 <= (n3 = 50)) {
            string2 = zzheo.zza(this);
        } else {
            n8 = 0;
            n3 = 47;
            string2 = zzheo.zza(this.zzk(0, n3));
            String string3 = "...";
            string2 = string2.concat(string3);
        }
        return h30_0.a(oe3_0.a(n7, "<ByteString@", (String)object, " size=", " contents=\""), string2, "\">");
    }

    public final void zzA(byte[] byArray, int n3, int n4, int n7) {
        n3 = this.zzd();
        zzhac.zzq(0, n7, n3);
        n3 = n4 + n7;
        int n8 = byArray.length;
        zzhac.zzq(n4, n3, n8);
        if (n7 > 0) {
            this.zze(byArray, 0, n4, n7);
        }
    }

    public final byte[] zzB() {
        int n3 = this.zzd();
        if (n3 == 0) {
            return zzhcb.zzd;
        }
        byte[] byArray = new byte[n3];
        this.zze(byArray, 0, 0, n3);
        return byArray;
    }

    public abstract byte zza(int var1);

    public abstract byte zzb(int var1);

    public abstract int zzd();

    public abstract void zze(byte[] var1, int var2, int var3, int var4);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int var1, int var2, int var3);

    public abstract int zzj(int var1, int var2, int var3);

    public abstract zzhac zzk(int var1, int var2);

    public abstract zzham zzl();

    public abstract String zzm(Charset var1);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgzq var1);

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    public zzgzv zzs() {
        zzgzr zzgzr2 = new zzgzr(this);
        return zzgzr2;
    }

    public final String zzx(Charset object) {
        int n3 = this.zzd();
        object = n3 == 0 ? "" : this.zzm((Charset)object);
        return object;
    }

    public final String zzy() {
        Charset charset = zzhcb.zzb;
        return this.zzx(charset);
    }
}

