/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabq;
import com.google.android.gms.internal.gtm.zzaca;
import com.google.android.gms.internal.gtm.zzacd;
import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacg;
import com.google.android.gms.internal.gtm.zzaci;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzadk;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadn;
import com.google.android.gms.internal.gtm.zzadt;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzadw;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzael;
import com.google.android.gms.internal.gtm.zzaen;
import com.google.android.gms.internal.gtm.zzaet;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzaez;
import com.google.android.gms.internal.gtm.zzyh;
import com.google.android.gms.internal.gtm.zzyl;
import com.google.android.gms.internal.gtm.zzyz;
import com.google.android.gms.internal.gtm.zzzb;
import com.google.android.gms.internal.gtm.zzzc;
import com.google.android.gms.internal.gtm.zzzi;
import com.google.android.gms.internal.gtm.zzzj;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzacf
extends zzyh {
    private static final Map zza;
    protected zzaen zzc;
    private int zzd = -1;

    static {
        ConcurrentHashMap concurrentHashMap;
        zza = concurrentHashMap = new ConcurrentHashMap();
    }

    public zzacf() {
        zzaen zzaen2;
        this.zzc = zzaen2 = zzaen.zzc();
    }

    public static zzace zzab(zzadl zzadl2, zzadl zzadl3, zzaci object, int n3, zzaex zzaex2, boolean bl2, Class clazz) {
        zzadu zzadu2 = zzadu.zze();
        zzacd zzacd2 = new zzacd(null, n3, zzaex2, true, false);
        object = new zzace(zzadl2, zzadu2, zzadl3, zzacd2, clazz);
        return object;
    }

    public static zzace zzac(zzadl zzadl2, Object object, zzadl zzadl3, zzaci zzaci2, int n3, zzaex zzaex2, Class clazz) {
        zzacd zzacd2 = new zzacd(zzaci2, n3, zzaex2, false, false);
        zzace zzace2 = new zzace(zzadl2, object, zzadl3, zzacd2, clazz);
        return zzace2;
    }

    public static zzacf zzad(Class serializable) {
        boolean bl2;
        Object object = zza;
        Object object2 = (zzacf)object.get(serializable);
        if (object2 == null) {
            try {
                object2 = serializable.getName();
            }
            catch (ClassNotFoundException classNotFoundException) {
                object = new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                throw object;
            }
            ClassLoader classLoader = serializable.getClassLoader();
            bl2 = true;
            Class.forName((String)object2, bl2, classLoader);
            object2 = (zzacf)object.get(serializable);
        }
        if (object2 == null) {
            object2 = (zzacf)zzaet.zze(serializable);
            int n3 = 6;
            bl2 = false;
            if ((object2 = (zzacf)((zzacf)object2).zzb(n3, null, null)) != null) {
                object.put(serializable, object2);
            } else {
                serializable = new IllegalStateException();
                throw serializable;
            }
        }
        return object2;
    }

    public static zzacf zzaf(zzacf zzacf2, InputStream object, zzabq zzabq2) {
        zzacq zzacq22;
        block16: {
            zzael zzael22;
            block15: {
                IOException iOException2;
                block14: {
                    RuntimeException runtimeException2;
                    block13: {
                        int n3 = 4096;
                        Object object2 = new zzyz((InputStream)object, n3, null);
                        zzacf2 = zzacf2.zzae();
                        object = zzadt.zza();
                        Class<?> clazz = zzacf2.getClass();
                        object = ((zzadt)object).zzb(clazz);
                        object2 = zzzc.zzq((zzzb)object2);
                        object.zzh(zzacf2, (zzadw)object2, zzabq2);
                        try {
                            object.zzf(zzacf2);
                        }
                        catch (RuntimeException runtimeException2) {
                            break block13;
                        }
                        catch (IOException iOException2) {
                            break block14;
                        }
                        catch (zzael zzael22) {
                            break block15;
                        }
                        catch (zzacq zzacq22) {
                            break block16;
                        }
                        zzacf.zze(zzacf2);
                        return zzacf2;
                    }
                    object = runtimeException2.getCause();
                    boolean bl2 = object instanceof zzacq;
                    if (bl2) {
                        throw (zzacq)runtimeException2.getCause();
                    }
                    throw runtimeException2;
                }
                object = iOException2.getCause();
                boolean bl3 = object instanceof zzacq;
                if (bl3) {
                    throw (zzacq)iOException2.getCause();
                }
                object = new zzacq(iOException2);
                throw object;
            }
            throw zzael22.zza();
        }
        boolean bl4 = zzacq22.zzb();
        if (bl4) {
            object = new zzacq(zzacq22);
            throw object;
        }
        throw zzacq22;
    }

    public static zzacf zzag(zzacf zzacf2, byte[] byArray, zzabq zzabq2) {
        int n3 = byArray.length;
        zzacf2 = zzacf.zzf(zzacf2, byArray, 0, n3, zzabq2);
        zzacf.zze(zzacf2);
        return zzacf2;
    }

    public static zzack zzah() {
        return zzacg.zzf();
    }

    public static zzacn zzai() {
        return zzadu.zze();
    }

    public static zzacn zzaj(zzacn zzacn2) {
        int n3 = zzacn2.size();
        n3 += n3;
        return zzacn2.zzd(n3);
    }

    public static Object zzak(Method object, Object object2, Object ... objectArray) {
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

    public static Object zzal(zzadl zzadl2, String string2, Object[] objectArray) {
        zzadv zzadv2 = new zzadv(zzadl2, string2, objectArray);
        return zzadv2;
    }

    public static void zzao(Class clazz, zzacf zzacf2) {
        zzacf2.zzan();
        zza.put(clazz, zzacf2);
    }

    public static final boolean zzaq(zzacf zzacf2, boolean bl2) {
        int n3 = 1;
        Object object = (Byte)zzacf2.zzb(n3, null, null);
        int n4 = ((Byte)object).byteValue();
        if (n4 == n3) {
            return n3 != 0;
        }
        if (n4 == 0) {
            return false;
        }
        object = zzadt.zza();
        Class<?> clazz = zzacf2.getClass();
        object = ((zzadt)object).zzb(clazz);
        n4 = object.zzl(zzacf2);
        if (bl2) {
            zzacf zzacf3;
            if (n3 != n4) {
                bl2 = false;
                zzacf3 = null;
            } else {
                zzacf3 = zzacf2;
            }
            n3 = 2;
            zzacf2.zzb(n3, zzacf3, null);
        }
        return n4 != 0;
    }

    private final int zzc(zzadx object) {
        object = zzadt.zza();
        Class<?> clazz = this.getClass();
        return ((zzadt)object).zzb(clazz).zza(this);
    }

    private static zzacf zze(zzacf zzacf2) {
        boolean bl2;
        if (zzacf2 != null && !(bl2 = zzacf.zzaq(zzacf2, true))) {
            zzael zzael2 = new zzael(zzacf2);
            throw zzael2.zza();
        }
        return zzacf2;
    }

    private static zzacf zzf(zzacf object, byte[] object2, int n3, int n4, zzabq zzabq2) {
        zzacq zzacq22;
        block16: {
            zzael zzael22;
            block15: {
                if (n4 == 0) {
                    return object;
                }
                object = ((zzacf)object).zzae();
                Object object3 = zzadt.zza();
                Object object4 = object.getClass();
                object3 = ((zzadt)object3).zzb((Class)object4);
                zzyl zzyl2 = new zzyl(zzabq2);
                object4 = object3;
                object3.zzi(object, (byte[])object2, 0, n4, zzyl2);
                try {
                    object3.zzf(object);
                    return object;
                }
                catch (IOException iOException) {
                }
                catch (zzael zzael22) {
                    break block15;
                }
                catch (zzacq zzacq22) {
                    break block16;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    object = new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    throw object;
                }
                object2 = iOException.getCause();
                boolean bl2 = object2 instanceof zzacq;
                if (bl2) {
                    throw (zzacq)iOException.getCause();
                }
                object2 = new zzacq;
                object2(iOException);
                throw object2;
            }
            throw zzael22.zza();
        }
        boolean bl3 = zzacq22.zzb();
        if (bl3) {
            object2 = new zzacq;
            object2(zzacq22);
            throw object2;
        }
        throw zzacq22;
    }

    public final boolean equals(Object object) {
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
        object2 = zzadt.zza().zzb((Class)object2);
        object = (zzacf)object;
        return object2.zzk(this, object);
    }

    public final int hashCode() {
        int n3 = this.zzar();
        if (n3 == 0) {
            n3 = this.zzb;
            if (n3 == 0) {
                this.zzb = n3 = this.zzX();
            }
            return n3;
        }
        return this.zzX();
    }

    public final String toString() {
        String string2 = super.toString();
        return zzadn.zza(this, string2);
    }

    public final int zzQ(zzadx object) {
        int n3 = this.zzar();
        String string2 = "serialized size must be non-negative, was ";
        if (n3 != 0) {
            int n4 = object.zza(this);
            if (n4 >= 0) {
                return n4;
            }
            object = hj0_0.a(n4, string2);
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n3 = this.zzd;
        int n7 = -1 >>> 1;
        if ((n3 &= n7) == n7) {
            int n8 = object.zza(this);
            if (n8 >= 0) {
                this.zzd = n3 = this.zzd & -1 << -1 | n8;
                return n8;
            }
            object = hj0_0.a(n8, string2);
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        return n3;
    }

    public final int zzX() {
        zzadt zzadt2 = zzadt.zza();
        Class<?> clazz = this.getClass();
        return zzadt2.zzb(clazz).zzb(this);
    }

    public final int zzY() {
        IllegalStateException illegalStateException;
        String string2;
        int n3;
        block7: {
            block6: {
                int n4;
                block5: {
                    n3 = this.zzar();
                    string2 = "serialized size must be non-negative, was ";
                    n4 = 0;
                    illegalStateException = null;
                    if (n3 == 0) break block5;
                    n3 = this.zzc(null);
                    if (n3 < 0) {
                        String string3 = hj0_0.a(n3, string2);
                        illegalStateException = new IllegalStateException(string3);
                        throw illegalStateException;
                    }
                    break block6;
                }
                n3 = this.zzd;
                int n7 = -1 >>> 1;
                if ((n3 &= n7) != n7) break block6;
                n3 = this.zzc(null);
                if (n3 < 0) break block7;
                int n8 = this.zzd;
                n4 = -1 << -1;
                this.zzd = n8 = n8 & n4 | n3;
            }
            return n3;
        }
        String string4 = hj0_0.a(n3, string2);
        illegalStateException = new IllegalStateException(string4);
        throw illegalStateException;
    }

    public final zzaca zzZ() {
        return (zzaca)this.zzb(5, null, null);
    }

    public final zzaca zzaa() {
        zzaca zzaca2 = (zzaca)this.zzb(5, null, null);
        zzaca2.zzA(this);
        return zzaca2;
    }

    public final zzacf zzae() {
        return (zzacf)this.zzb(4, null, null);
    }

    public final void zzam() {
        zzadt zzadt2 = zzadt.zza();
        Class<?> clazz = this.getClass();
        zzadt2.zzb(clazz).zzf(this);
        this.zzan();
    }

    public final void zzan() {
        int n3;
        this.zzd = n3 = this.zzd & -1 >>> 1;
    }

    public final void zzap(int n3) {
        this.zzd = n3 = this.zzd & -1 << -1 | -1 >>> 1;
    }

    public final boolean zzar() {
        int n3 = this.zzd;
        int n4 = -1 << -1;
        return (n3 &= n4) != 0;
    }

    public final /* synthetic */ zzadk zzav() {
        return (zzaca)this.zzb(5, null, null);
    }

    public final /* synthetic */ zzadk zzaw() {
        zzaca zzaca2 = (zzaca)this.zzb(5, null, null);
        zzaca2.zzA(this);
        return zzaca2;
    }

    public final void zzax(zzzi object) {
        Object object2 = zzadt.zza();
        Class<?> clazz = this.getClass();
        object2 = ((zzadt)object2).zzb(clazz);
        object = zzzj.zza((zzzi)object);
        object2.zzj(this, (zzaez)object);
    }

    public final /* synthetic */ zzadl zzay() {
        return (zzacf)this.zzb(6, null, null);
    }

    public final boolean zzaz() {
        return zzacf.zzaq(this, true);
    }

    public abstract Object zzb(int var1, Object var2, Object var3);
}

