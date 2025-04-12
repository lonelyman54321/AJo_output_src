/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgos;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgoj {
    private static final Logger zza;
    private static final zzgoj zzb;
    private final ConcurrentMap zzc;
    private final ConcurrentMap zzd;

    static {
        zzgoj zzgoj2;
        zza = Logger.getLogger(zzgoj.class.getName());
        zzb = zzgoj2 = new zzgoj();
    }

    public zzgoj() {
        ConcurrentHashMap concurrentHashMap;
        this.zzc = concurrentHashMap = new ConcurrentHashMap();
        this.zzd = concurrentHashMap = new ConcurrentHashMap();
    }

    public static zzgoj zzc() {
        return zzb;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzghj zzg(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = this.zzc;
                    boolean bl2 = object2.containsKey(object);
                    if (bl2) {
                        object2 = this.zzc;
                        object = object2.get(object);
                        return (zzghj)object;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    object = String.valueOf(object);
                    object2 = "No key manager found for key type ";
                    object = ((String)object2).concat((String)object);
                    GeneralSecurityException generalSecurityException = new GeneralSecurityException((String)object);
                    throw generalSecurityException;
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
    private final void zzh(zzghj object, boolean bl2, boolean bl3) {
        Object object2 = "typeUrl (";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object3;
                Object object4;
                boolean bl4;
                Object object5;
                Object object6;
                block5: {
                    object6 = object;
                    try {
                        object6 = (zzgos)object;
                        object6 = ((zzgos)object6).zza;
                        object5 = this.zzd;
                        boolean bl5 = object5.containsKey(object6);
                        if (!bl5) break block5;
                        object5 = this.zzd;
                        object5 = object5.get(object6);
                        bl5 = (Boolean)(object5 = (Boolean)object5);
                        if (!bl5) {
                            object = "New keys are already disallowed for key type ";
                            object = ((String)object).concat((String)object6);
                            object2 = new GeneralSecurityException((String)object);
                            throw object2;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object5 = this.zzc;
                object5 = object5.get(object6);
                if ((object5 = (zzghj)object5) != null && !(bl4 = (object4 = object5.getClass()).equals(object3 = object.getClass()))) {
                    object4 = "Attempted overwrite of a registered key manager for key type ";
                    object4 = ((String)object4).concat((String)object6);
                    object3 = zza;
                    Level level = Level.WARNING;
                    String string2 = "com.google.crypto.tink.internal.KeyManagerRegistry";
                    String string3 = "insertKeyManager";
                    ((Logger)object3).logp(level, string2, string3, (String)object4);
                    object5 = object5.getClass();
                    object5 = ((Class)object5).getName();
                    object = object.getClass();
                    object = ((Class)object).getName();
                    object3 = new StringBuilder((String)object2);
                    ((StringBuilder)object3).append((String)object6);
                    object2 = ") is already registered with ";
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append((String)object5);
                    object2 = ", cannot be re-registered with ";
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append((String)object);
                    object = ((StringBuilder)object3).toString();
                    object4 = new GeneralSecurityException((String)object);
                    throw object4;
                }
                object2 = this.zzc;
                object2.putIfAbsent(object6, object);
                object = this.zzd;
                object2 = Boolean.TRUE;
                object.put(object6, object2);
                return;
            }
            throw throwable2;
        }
    }

    public final zzghj zza(String object, Class object2) {
        Serializable serializable = (object = this.zzg((String)object)).zzb();
        boolean bl2 = serializable.equals(object2);
        if (bl2) {
            return object;
        }
        object2 = ((Class)object2).getName();
        String string2 = String.valueOf(object.getClass());
        object = ((Object)object.zzb()).toString();
        object2 = og_1.a("Primitive type ", (String)object2, " not supported by key manager of type ", string2, ", which only supports: ");
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        serializable = new GeneralSecurityException((String)object);
        throw serializable;
    }

    public final zzghj zzb(String string2) {
        return this.zzg(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzghj zzghj2, boolean bl2) {
        synchronized (this) {
            bl2 = true;
            this.zzf(zzghj2, (int)(bl2 ? 1 : 0), bl2);
            return;
        }
    }

    public final boolean zze(String string2) {
        return (Boolean)this.zzd.get(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(zzghj object, int n3, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    n3 = (int)(zzgoc.zza(n3) ? 1 : 0);
                    if (n3 != 0) {
                        n3 = 0;
                        Object var4_5 = null;
                        bl2 = true;
                        this.zzh((zzghj)object, false, bl2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "Cannot register key manager: FIPS compatibility insufficient";
                object = new GeneralSecurityException(string2);
                throw object;
            }
            throw throwable2;
        }
    }
}

