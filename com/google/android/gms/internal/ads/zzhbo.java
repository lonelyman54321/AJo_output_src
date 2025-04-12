/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzg;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzgzn;
import com.google.android.gms.internal.ads.zzgzp;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhak;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhan;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhau;
import com.google.android.gms.internal.ads.zzhav;
import com.google.android.gms.internal.ads.zzhaw;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbf;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbl;
import com.google.android.gms.internal.ads.zzhbm;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhbq;
import com.google.android.gms.internal.ads.zzhbr;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbv;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhbz;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhct;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdg;
import com.google.android.gms.internal.ads.zzhdj;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.android.gms.internal.ads.zzhdp;
import com.google.android.gms.internal.ads.zzhdq;
import com.google.android.gms.internal.ads.zzhdr;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhep;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfa;
import com.google.android.gms.internal.ads.zzhfg;
import com.google.android.gms.internal.ads.zzhfi;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzhbo
extends zzgzi {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map zzc;
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs;
    private int zzd = -1;
    protected zzher zzt;

    static {
        ConcurrentHashMap concurrentHashMap;
        zzc = concurrentHashMap = new ConcurrentHashMap();
    }

    public zzhbo() {
        zzher zzher2;
        this.zzt = zzher2 = zzher.zzc();
    }

    public static zzhbq zzbA() {
        return zzgzp.zzd();
    }

    public static zzhbq zzbB(zzhbq zzhbq2) {
        int n3 = zzhbq2.size();
        n3 = n3 == 0 ? 10 : (n3 += n3);
        return zzhbq2.zze(n3);
    }

    public static zzhbr zzbC() {
        return zzhav.zze();
    }

    public static zzhbr zzbD(zzhbr zzhbr2) {
        int n3 = zzhbr2.size();
        n3 = n3 == 0 ? 10 : (n3 += n3);
        return zzhbr2.zzg(n3);
    }

    public static zzhbv zzbE() {
        return zzhbf.zze();
    }

    public static zzhbv zzbF(zzhbv zzhbv2) {
        int n3 = zzhbv2.size();
        n3 = n3 == 0 ? 10 : (n3 += n3);
        return zzhbv2.zzg(n3);
    }

    public static zzhbw zzbG() {
        return zzhbp.zzg();
    }

    public static zzhbw zzbH(zzhbw zzhbw2) {
        int n3 = zzhbw2.size();
        n3 = n3 == 0 ? 10 : (n3 += n3);
        return zzhbw2.zzh(n3);
    }

    public static zzhbz zzbI() {
        return zzhct.zzh();
    }

    public static zzhbz zzbJ(zzhbz zzhbz2) {
        int n3 = zzhbz2.size();
        n3 = n3 == 0 ? 10 : (n3 += n3);
        return zzhbz2.zze(n3);
    }

    public static zzhca zzbK() {
        return zzhdp.zzd();
    }

    public static zzhca zzbL(zzhca zzhca2) {
        int n3 = zzhca2.size();
        n3 = n3 == 0 ? 10 : (n3 += n3);
        return zzhca2.zzf(n3);
    }

    public static Object zzbQ(Method object, Object object2, Object ... objectArray) {
        try {
            return ((Method)object).invoke(object2, objectArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException.getCause();
            boolean bl2 = object instanceof RuntimeException;
            if (!bl2) {
                bl2 = object instanceof Error;
                if (bl2) {
                    throw (Error)object;
                }
                object2 = new RuntimeException("Unexpected exception thrown by generated accessor method.", (Throwable)object);
                throw object2;
            }
            throw (RuntimeException)object;
        }
        catch (IllegalAccessException illegalAccessException) {
            object2 = new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
            throw object2;
        }
    }

    public static Object zzbR(zzhde zzhde2, String string2, Object[] objectArray) {
        zzhdq zzhdq2 = new zzhdq(zzhde2, string2, objectArray);
        return zzhdq2;
    }

    public static Method zzbS(Class object, String string2, Class ... classArray) {
        try {
            return ((Class)object).getMethod(string2, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = ((Class)object).getName();
            object = uc0_0.a("Generated message class \"", (String)object, "\" missing method \"", string2, "\".");
            RuntimeException runtimeException = new RuntimeException((String)object, noSuchMethodException);
            throw runtimeException;
        }
    }

    public static /* bridge */ /* synthetic */ zzhbm zzbd(zzhaw zzhaw2) {
        return zzhbo.zze(zzhaw2);
    }

    public static zzhbm zzbe(zzhde zzhde2, zzhde zzhde3, zzhbt zzhbt2, int n3, zzhfg zzhfg2, boolean bl2, Class clazz) {
        List list = Collections.emptyList();
        zzhbl zzhbl2 = new zzhbl(zzhbt2, n3, zzhfg2, true, bl2);
        zzhbm zzhbm2 = new zzhbm(zzhde2, list, zzhde3, zzhbl2, clazz);
        return zzhbm2;
    }

    public static zzhbm zzbf(zzhde zzhde2, Object object, zzhde zzhde3, zzhbt zzhbt2, int n3, zzhfg zzhfg2, Class clazz) {
        zzhbl zzhbl2 = new zzhbl(zzhbt2, n3, zzhfg2, false, false);
        zzhbm zzhbm2 = new zzhbm(zzhde2, object, zzhde3, zzhbl2, clazz);
        return zzhbm2;
    }

    public static /* bridge */ /* synthetic */ zzhbo zzbg(zzhbo zzhbo2, byte[] byArray, int n3, int n4, zzhay zzhay2) {
        return zzhbo.zzi(zzhbo2, byArray, n3, n4, zzhay2);
    }

    public static zzhbo zzbh(Class serializable) {
        Object object;
        Object object2 = (zzhbo)zzc.get(serializable);
        if (object2 == null) {
            try {
                object2 = serializable.getName();
            }
            catch (ClassNotFoundException classNotFoundException) {
                object2 = new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                throw object2;
            }
            object = serializable.getClassLoader();
            boolean bl2 = true;
            Class.forName((String)object2, bl2, (ClassLoader)object);
            object2 = (zzhbo)zzc.get(serializable);
        }
        if (object2 == null) {
            object2 = ((zzhbo)zzhfa.zzg(serializable)).zzbi();
            if (object2 != null) {
                object = zzc;
                object.put(serializable, object2);
            } else {
                serializable = new IllegalStateException();
                throw serializable;
            }
        }
        return object2;
    }

    public static zzhbo zzbk(zzhbo zzhbo2, InputStream inputStream) {
        zzhay zzhay2 = zzhay.zza;
        zzhbo2 = zzhbo.zzg(zzhbo2, inputStream, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbl(zzhbo zzhbo2, InputStream inputStream, zzhay zzhay2) {
        zzhbo2 = zzhbo.zzg(zzhbo2, inputStream, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbm(zzhbo zzhbo2, zzhac zzhac2) {
        zzhay zzhay2 = zzhay.zza;
        zzhbo2 = zzhbo.zzbr(zzhbo2, zzhac2, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbn(zzhbo zzhbo2, zzham zzham2) {
        zzhay zzhay2 = zzhay.zza;
        return zzhbo.zzbs(zzhbo2, zzham2, zzhay2);
    }

    public static zzhbo zzbo(zzhbo zzhbo2, InputStream object) {
        object = zzham.zzI((InputStream)object, 4096);
        zzhay zzhay2 = zzhay.zza;
        zzhbo2 = zzhbo.zzbz(zzhbo2, (zzham)object, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbp(zzhbo zzhbo2, ByteBuffer byteBuffer) {
        zzhay zzhay2 = zzhay.zza;
        return zzhbo.zzbv(zzhbo2, byteBuffer, zzhay2);
    }

    public static zzhbo zzbq(zzhbo zzhbo2, byte[] byArray) {
        int n3 = byArray.length;
        zzhay zzhay2 = zzhay.zza;
        zzhbo2 = zzhbo.zzi(zzhbo2, byArray, 0, n3, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbr(zzhbo zzhbo2, zzhac zzhac2, zzhay zzhay2) {
        zzhbo2 = zzhbo.zzh(zzhbo2, zzhac2, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbs(zzhbo zzhbo2, zzham zzham2, zzhay zzhay2) {
        zzhbo2 = zzhbo.zzbz(zzhbo2, zzham2, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbu(zzhbo zzhbo2, InputStream object, zzhay zzhay2) {
        object = zzham.zzI((InputStream)object, 4096);
        zzhbo2 = zzhbo.zzbz(zzhbo2, (zzham)object, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbv(zzhbo zzhbo2, ByteBuffer object, zzhay zzhay2) {
        boolean n3 = ((ByteBuffer)object).hasArray();
        if (n3) {
            byte[] byArray = ((ByteBuffer)object).array();
            int n4 = ((ByteBuffer)object).arrayOffset();
            int n7 = ((Buffer)object).position() + n4;
            int n8 = ((Buffer)object).remaining();
            object = zzham.zzJ(byArray, n7, n8, false);
        } else {
            boolean bl2;
            boolean bl3 = ((ByteBuffer)object).isDirect();
            if (bl3 && (bl2 = zzhfa.zzB())) {
                boolean bl4 = false;
                Object var8_14 = null;
                zzhak zzhak2 = new zzhak((ByteBuffer)object, false, null);
                object = zzhak2;
            } else {
                int n10 = ((Buffer)object).remaining();
                byte[] byArray = new byte[n10];
                ((ByteBuffer)object).duplicate().get(byArray);
                boolean bl5 = true;
                object = zzham.zzJ(byArray, 0, n10, bl5);
            }
        }
        zzhbo2 = zzhbo.zzbs(zzhbo2, (zzham)object, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzbx(zzhbo zzhbo2, byte[] byArray, zzhay zzhay2) {
        int n3 = byArray.length;
        zzhbo2 = zzhbo.zzi(zzhbo2, byArray, 0, n3, zzhay2);
        zzhbo.zzf(zzhbo2);
        return zzhbo2;
    }

    public static zzhbo zzby(zzhbo zzhbo2, zzham zzham2) {
        zzhay zzhay2 = zzhay.zza;
        return zzhbo.zzbz(zzhbo2, zzham2, zzhay2);
    }

    public static zzhbo zzbz(zzhbo zzhbo2, zzham object, zzhay object2) {
        Object object3;
        zzhcd zzhcd22;
        block16: {
            zzhep zzhep22;
            block15: {
                IOException iOException2;
                block14: {
                    zzhbo2 = zzhbo2.zzbj();
                    Object object4 = zzhdo.zza();
                    Class<?> clazz = zzhbo2.getClass();
                    object4 = ((zzhdo)object4).zzb(clazz);
                    object = zzhan.zzq((zzham)object);
                    object4.zzh(zzhbo2, (zzhdr)object, (zzhay)object2);
                    try {
                        object4.zzf(zzhbo2);
                        return zzhbo2;
                    }
                    catch (RuntimeException runtimeException) {
                    }
                    catch (IOException iOException2) {
                        break block14;
                    }
                    catch (zzhep zzhep22) {
                        break block15;
                    }
                    catch (zzhcd zzhcd22) {
                        break block16;
                    }
                    object = runtimeException.getCause();
                    boolean bl2 = object instanceof zzhcd;
                    if (bl2) {
                        throw (zzhcd)runtimeException.getCause();
                    }
                    throw runtimeException;
                }
                object2 = iOException2.getCause();
                boolean bl3 = object2 instanceof zzhcd;
                if (bl3) {
                    throw (zzhcd)iOException2.getCause();
                }
                object2 = new zzhcd(iOException2);
                ((zzhcd)object2).zzh(zzhbo2);
                throw object2;
            }
            zzhcd zzhcd3 = zzhep22.zza();
            zzhcd3.zzh(zzhbo2);
            throw zzhcd3;
        }
        boolean bl4 = zzhcd22.zzl();
        if (bl4) {
            object3 = object2 = new zzhcd(zzhcd22);
        }
        ((zzhcd)object3).zzh(zzhbo2);
        throw object3;
    }

    private int zzc(zzhdz object) {
        if (object == null) {
            object = this.getClass();
            return zzhdo.zza().zzb((Class)object).zza(this);
        }
        return object.zza(this);
    }

    public static void zzca(Class clazz, zzhbo zzhbo2) {
        zzhbo2.zzbW();
        zzc.put(clazz, zzhbo2);
    }

    public static final boolean zzcd(zzhbo zzhbo2, boolean bl2) {
        byte by2;
        Object object = zzhbn.zza;
        byte by4 = (Byte)(object = (Byte)zzhbo2.zzbO((zzhbn)((Object)object)));
        if (by4 == (by2 = 1)) {
            return by2 != 0;
        }
        if (!by4) {
            return false;
        }
        object = zzhdo.zza();
        Class<?> clazz = zzhbo2.getClass();
        object = ((zzhdo)object).zzb(clazz);
        by4 = object.zzl(zzhbo2);
        if (bl2) {
            zzhbo zzhbo3;
            if (by2 != by4) {
                bl2 = false;
                zzhbo3 = null;
            } else {
                zzhbo3 = zzhbo2;
            }
            zzhbn zzhbn2 = zzhbn.zzb;
            zzhbo2.zzbP(zzhbn2, zzhbo3);
        }
        return by4 != 0;
    }

    private static zzhbm zze(zzhaw zzhaw2) {
        return (zzhbm)zzhaw2;
    }

    private static zzhbo zzf(zzhbo zzhbo2) {
        boolean bl2;
        if (zzhbo2 != null && !(bl2 = zzhbo2.zzbw())) {
            zzhcd zzhcd2 = zzhbo2.zzaP().zza();
            zzhcd2.zzh(zzhbo2);
            throw zzhcd2;
        }
        return zzhbo2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzhbo zzg(zzhbo zzhbo2, InputStream object, zzhay zzhay2) {
        zzhcd zzhcd22222;
        block8: {
            IOException iOException2222;
            block7: {
                int n7;
                zzgzg zzgzg2;
                try {
                    int n3 = ((InputStream)object).read();
                    int n4 = -1;
                    if (n3 == n4) {
                        return null;
                    }
                    n3 = zzham.zzG(n3, (InputStream)object);
                    zzgzg2 = new zzgzg((InputStream)object, n3);
                    n7 = 4096;
                }
                catch (IOException iOException2222) {
                    break block7;
                }
                catch (zzhcd zzhcd22222) {
                    break block8;
                }
                object = zzham.zzI(zzgzg2, n7);
                zzhbo2 = zzhbo.zzbz(zzhbo2, (zzham)object, zzhay2);
                zzhay2 = null;
                try {
                    ((zzham)object).zzz(0);
                    return zzhbo2;
                }
                catch (zzhcd zzhcd3) {
                    zzhcd3.zzh(zzhbo2);
                    throw zzhcd3;
                }
            }
            object = new zzhcd(iOException2222);
            throw object;
        }
        boolean bl2 = zzhcd22222.zzl();
        if (bl2) {
            object = new zzhcd(zzhcd22222);
            throw object;
        }
        throw zzhcd22222;
    }

    private static zzhbo zzh(zzhbo zzhbo2, zzhac object, zzhay zzhay2) {
        object = ((zzhac)object).zzl();
        zzhbo2 = zzhbo.zzbz(zzhbo2, (zzham)object, zzhay2);
        zzhay2 = null;
        try {
            ((zzham)object).zzz(0);
            return zzhbo2;
        }
        catch (zzhcd zzhcd2) {
            zzhcd2.zzh(zzhbo2);
            throw zzhcd2;
        }
    }

    private static zzhbo zzi(zzhbo zzhbo2, byte[] object, int n3, int n4, zzhay zzhay2) {
        zzhcd zzhcd2;
        zzhcd zzhcd32;
        block15: {
            zzhep zzhep22;
            block14: {
                zzhbo2 = zzhbo2.zzbj();
                Object object2 = zzhdo.zza();
                Object object3 = zzhbo2.getClass();
                zzhdz zzhdz2 = ((zzhdo)object2).zzb((Class)object3);
                int n7 = n3 + n4;
                zzgzn zzgzn2 = new zzgzn(zzhay2);
                object2 = zzhdz2;
                object3 = zzhbo2;
                zzhdz2.zzi(zzhbo2, (byte[])object, n3, n7, zzgzn2);
                try {
                    zzhdz2.zzf(zzhbo2);
                    return zzhbo2;
                }
                catch (IOException iOException) {
                }
                catch (zzhep zzhep22) {
                    break block14;
                }
                catch (zzhcd zzhcd32) {
                    break block15;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    object = zzhcd.zzj();
                    ((zzhcd)object).zzh(zzhbo2);
                    throw object;
                }
                Throwable throwable = iOException.getCause();
                n3 = throwable instanceof zzhcd;
                if (n3 != 0) {
                    throw (zzhcd)iOException.getCause();
                }
                throwable = new zzhcd(iOException);
                ((zzhcd)throwable).zzh(zzhbo2);
                throw throwable;
            }
            zzhcd zzhcd4 = zzhep22.zza();
            zzhcd4.zzh(zzhbo2);
            throw zzhcd4;
        }
        n3 = (int)(zzhcd32.zzl() ? 1 : 0);
        if (n3 != 0) {
            zzhcd zzhcd5;
            zzhcd2 = zzhcd5 = new zzhcd(zzhcd32);
        }
        zzhcd2.zzh(zzhbo2);
        throw zzhcd2;
    }

    private void zzj() {
        zzher zzher2 = this.zzt;
        zzher zzher3 = zzher.zzc();
        if (zzher2 == zzher3) {
            this.zzt = zzher2 = zzher.zzf();
        }
    }

    public boolean equals(Object object) {
        Class<?> clazz;
        if (this == object) {
            return true;
        }
        Object object2 = null;
        if (object == null) {
            return false;
        }
        Class<?> clazz2 = this.getClass();
        if (clazz2 != (clazz = object.getClass())) {
            return false;
        }
        object2 = this.getClass();
        object2 = zzhdo.zza().zzb((Class)object2);
        object = (zzhbo)object;
        return object2.zzk(this, object);
    }

    public int hashCode() {
        int n3 = this.zzce();
        if (n3 != 0) {
            return this.zzaW();
        }
        n3 = this.zzcc();
        if (n3 != 0) {
            n3 = this.zzaW();
            this.zzcb(n3);
        }
        return this.zzaX();
    }

    public String toString() {
        String string2 = super.toString();
        return zzhdg.zza(this, string2);
    }

    public int zzaL() {
        return this.zzd & -1 >>> 1;
    }

    public int zzaM(zzhdz object) {
        int n3;
        int n4 = this.zzce();
        if (n4 != 0) {
            int n7 = this.zzc((zzhdz)object);
            if (n7 >= 0) {
                return n7;
            }
            object = hj0_0.a(n7, "serialized size must be non-negative, was ");
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n4 = this.zzaL();
        if (n4 != (n3 = -1 >>> 1)) {
            return this.zzaL();
        }
        int n8 = this.zzc((zzhdz)object);
        this.zzaS(n8);
        return n8;
    }

    public zzhdj zzaO() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Lite does not support the mutable API.");
        throw unsupportedOperationException;
    }

    public void zzaS(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzd & -1 << -1;
            this.zzd = n3 |= n4;
            return;
        }
        String string2 = hj0_0.a(n3, "serialized size must be non-negative, was ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public int zzaW() {
        zzhdo zzhdo2 = zzhdo.zza();
        Class<?> clazz = this.getClass();
        return zzhdo2.zzb(clazz).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    public int zzaY() {
        return this.zzaM(null);
    }

    public final zzhbi zzaZ() {
        zzhbn zzhbn2 = zzhbn.zze;
        return (zzhbi)this.zzbO(zzhbn2);
    }

    public final zzhdm zzbM() {
        zzhbn zzhbn2 = zzhbn.zzg;
        return (zzhdm)this.zzbO(zzhbn2);
    }

    public Object zzbN() {
        zzhbn zzhbn2 = zzhbn.zzc;
        return this.zzbO(zzhbn2);
    }

    public Object zzbO(zzhbn zzhbn2) {
        return this.zzde(zzhbn2, null, null);
    }

    public Object zzbP(zzhbn zzhbn2, Object object) {
        return this.zzde(zzhbn2, object, null);
    }

    public void zzbT() {
        this.zzq = 0;
    }

    public void zzbU() {
        this.zzaS(-1 >>> 1);
    }

    public void zzbV() {
        zzhdo zzhdo2 = zzhdo.zza();
        Class<?> clazz = this.getClass();
        zzhdo2.zzb(clazz).zzf(this);
        this.zzbW();
    }

    public void zzbW() {
        int n3;
        this.zzd = n3 = this.zzd & -1 >>> 1;
    }

    public void zzbX(int n3, zzhac zzhac2) {
        this.zzj();
        zzher zzher2 = this.zzt;
        zzher2.zzg();
        if (n3 != 0) {
            n3 = n3 << 3 | 2;
            zzher2.zzj(n3, zzhac2);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Zero is not a valid field number.");
        throw illegalArgumentException;
    }

    public final void zzbY(zzher zzher2) {
        this.zzt = zzher2 = zzher.zze(this.zzt, zzher2);
    }

    public void zzbZ(int n3, int n4) {
        this.zzj();
        zzher zzher2 = this.zzt;
        zzher2.zzg();
        if (n3 != 0) {
            long l2 = n4;
            Long l3 = l2;
            zzher2.zzj(n3 <<= 3, l3);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Zero is not a valid field number.");
        throw illegalArgumentException;
    }

    public final zzhbi zzba(zzhbo zzhbo2) {
        zzhbi zzhbi2 = this.zzaZ();
        zzhbi2.zzbj(zzhbo2);
        return zzhbi2;
    }

    public final zzhbi zzbb() {
        zzhbn zzhbn2 = zzhbn.zze;
        return (zzhbi)this.zzbO(zzhbn2);
    }

    public final zzhbi zzbc() {
        Object object = zzhbn.zze;
        object = (zzhbi)this.zzbO((zzhbn)((Object)object));
        ((zzhbi)object).zzbj(this);
        return object;
    }

    public final zzhbo zzbi() {
        zzhbn zzhbn2 = zzhbn.zzf;
        return (zzhbo)this.zzbO(zzhbn2);
    }

    public zzhbo zzbj() {
        zzhbn zzhbn2 = zzhbn.zzd;
        return (zzhbo)this.zzbO(zzhbn2);
    }

    public final boolean zzbw() {
        return zzhbo.zzcd(this, true);
    }

    public void zzcb(int n3) {
        this.zzq = n3;
    }

    public boolean zzcc() {
        int n3 = this.zzaX();
        return n3 == 0;
    }

    public boolean zzce() {
        int n3 = this.zzd;
        int n4 = -1 << -1;
        return (n3 &= n4) != 0;
    }

    public boolean zzcf(int n3, zzham zzham2) {
        int n4 = n3 & 7;
        int n7 = 4;
        if (n4 == n7) {
            return false;
        }
        this.zzj();
        return this.zzt.zzm(n3, zzham2);
    }

    public void zzda(zzhat object) {
        Object object2 = zzhdo.zza();
        Class<?> clazz = this.getClass();
        object2 = ((zzhdo)object2).zzb(clazz);
        object = zzhau.zza((zzhat)object);
        object2.zzj(this, (zzhfi)object);
    }

    public abstract Object zzde(zzhbn var1, Object var2, Object var3);
}

