/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghx;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgph {
    private static final zzgph zza;
    private final Map zzb;

    static {
        zzgph zzgph2;
        zza = zzgph2 = new zzgph();
    }

    public zzgph() {
        HashMap hashMap;
        this.zzb = hashMap = new HashMap();
    }

    public static zzgph zzb() {
        return zza;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzghx zza(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                String string2;
                try {
                    object = this.zzb;
                    string2 = "AES128_GCM";
                    boolean bl2 = object.containsKey(string2);
                    if (bl2) {
                        object = this.zzb;
                        object = object.get(string2);
                        return (zzghx)object;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    string2 = "Name AES128_GCM does not exist";
                    object = new GeneralSecurityException(string2);
                    throw object;
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
    public final void zzc(String string2, zzghx object) {
        Object object2 = "Parameters object with name ";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    Object object3;
                    block5: {
                        try {
                            object3 = this.zzb;
                            boolean bl2 = object3.containsKey(string2);
                            if (!bl2) break block4;
                            object3 = this.zzb;
                            object3 = object3.get(string2);
                            bl2 = (object3 = (zzghx)object3).equals(object);
                            if (!bl2) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        return;
                    }
                    object3 = this.zzb;
                    object3 = object3.get(string2);
                    object3 = String.valueOf(object3);
                    object = String.valueOf(object);
                    StringBuilder stringBuilder = new StringBuilder((String)object2);
                    stringBuilder.append(string2);
                    string2 = " already exists (";
                    stringBuilder.append(string2);
                    stringBuilder.append((String)object3);
                    string2 = "), cannot insert ";
                    stringBuilder.append(string2);
                    stringBuilder.append((String)object);
                    string2 = stringBuilder.toString();
                    GeneralSecurityException generalSecurityException = new GeneralSecurityException(string2);
                    throw generalSecurityException;
                }
                object2 = this.zzb;
                object2.put(string2, object);
                return;
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
    public final void zzd(Map iterator) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    iterator = iterator.entrySet();
                    iterator = iterator.iterator();
                    while (bl2 = iterator.hasNext()) {
                        Object object = iterator.next();
                        object = (Map.Entry)object;
                        Object object2 = object.getKey();
                        object2 = (String)object2;
                        object = object.getValue();
                        object = (zzghx)object;
                        this.zzc((String)object2, (zzghx)object);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

