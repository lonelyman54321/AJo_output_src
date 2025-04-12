/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgov;
import com.google.android.gms.internal.ads.zzgoz;
import com.google.android.gms.internal.ads.zzgpa;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgpb {
    public static final /* synthetic */ int zza;
    private static final zzgpa zzb;
    private static final zzgpb zzc;
    private final Map zzd;

    static {
        zzgoz zzgoz2 = new zzgoz();
        zzb = zzgoz2;
        zzc = zzgpb.zze();
    }

    public zzgpb() {
        HashMap hashMap;
        this.zzd = hashMap = new HashMap();
    }

    public static zzgpb zzb() {
        return zzc;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzghi zzd(zzghx object, Integer serializable) {
        String string2 = "Cannot create a new key for parameters ";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = this.zzd;
                    Class<?> clazz = object.getClass();
                    object2 = object2.get(clazz);
                    object2 = (zzgpa)object2;
                    if (object2 != null) {
                        return object2.zza((zzghx)object, (Integer)serializable);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    object = object.toString();
                    object2 = new StringBuilder(string2);
                    ((StringBuilder)object2).append((String)object);
                    object = ": no key creator for this class was registered.";
                    ((StringBuilder)object2).append((String)object);
                    object = ((StringBuilder)object2).toString();
                    serializable = new GeneralSecurityException((String)object);
                    throw serializable;
                }
            }
            throw throwable2;
        }
    }

    private static zzgpb zze() {
        Class<zzgov> clazz;
        Object object;
        zzgpb zzgpb2 = new zzgpb();
        try {
            object = zzb;
            clazz = zzgov.class;
        }
        catch (GeneralSecurityException generalSecurityException) {
            object = new IllegalStateException("unexpected error.", generalSecurityException);
            throw object;
        }
        zzgpb2.zzc((zzgpa)object, clazz);
        return zzgpb2;
    }

    public final zzghi zza(zzghx zzghx2, Integer n3) {
        return this.zzd(zzghx2, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(zzgpa object, Class object2) {
        Object object3 = "Different key creator for parameters class ";
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2;
                    Object object4 = this.zzd;
                    object4 = object4.get(object2);
                    object4 = (zzgpa)object4;
                    if (object4 != null && !(bl2 = object4.equals(object))) {
                        object2 = object2.toString();
                        object4 = new StringBuilder((String)object3);
                        ((StringBuilder)object4).append((String)object2);
                        object2 = " already inserted";
                        ((StringBuilder)object4).append((String)object2);
                        object2 = ((StringBuilder)object4).toString();
                        object = new GeneralSecurityException((String)object2);
                        throw object;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object3 = this.zzd;
                object3.put(object2, object);
                return;
            }
            throw throwable2;
        }
    }
}

