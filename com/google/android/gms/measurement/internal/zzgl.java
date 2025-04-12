/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzgk;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgl {
    private static final AtomicReference zza;
    private static final AtomicReference zzb;
    private static final AtomicReference zzc;
    private final zzgk zzd;

    static {
        AtomicReference atomicReference;
        zza = atomicReference = new AtomicReference();
        zzb = atomicReference = new AtomicReference();
        zzc = atomicReference = new AtomicReference();
    }

    public zzgl(zzgk zzgk2) {
        this.zzd = zzgk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String zza(String object, String[] object2, String[] object3, AtomicReference atomicReference) {
        CharSequence charSequence;
        Preconditions.checkNotNull(object2);
        Preconditions.checkNotNull(object3);
        Preconditions.checkNotNull(atomicReference);
        int n3 = ((String[])object2).length;
        int n4 = ((String[])object3).length;
        int n7 = 0;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            charSequence = null;
        }
        Preconditions.checkArgument(n3 != 0);
        while (n7 < (n3 = ((String[])object2).length)) {
            charSequence = object2[n7];
            n3 = (int)(Objects.equals(object, charSequence) ? 1 : 0);
            if (n3 != 0) {
                synchronized (atomicReference) {
                    Throwable throwable2;
                    block9: {
                        block8: {
                            try {
                                object = atomicReference.get();
                                object = object;
                                if (object != null) break block8;
                                int n8 = ((String[])object3).length;
                                object = new String[n8];
                                atomicReference.set(object);
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        if ((charSequence = object[n7]) != null) return object[n7];
                        charSequence = new StringBuilder();
                        object3 = object3[n7];
                        ((StringBuilder)charSequence).append((String)object3);
                        object3 = "(";
                        ((StringBuilder)charSequence).append((String)object3);
                        object2 = object2[n7];
                        ((StringBuilder)charSequence).append((String)object2);
                        object2 = ")";
                        ((StringBuilder)charSequence).append((String)object2);
                        object[n7] = object2 = ((StringBuilder)charSequence).toString();
                        return object[n7];
                    }
                    throw throwable2;
                }
            }
            ++n7;
        }
        return object;
    }

    private final String zza(Object[] objectArray) {
        if (objectArray == null) {
            return "[]";
        }
        StringBuilder stringBuilder = Ex0.a("[");
        for (Object object : objectArray) {
            int n3;
            int n4 = object instanceof Bundle;
            if (n4 != 0) {
                object = (Bundle)object;
                object = this.zza((Bundle)object);
            } else {
                object = String.valueOf(object);
            }
            if (object == null) continue;
            n4 = stringBuilder.length();
            if (n4 != (n3 = 1)) {
                String string2 = ", ";
                stringBuilder.append(string2);
            }
            stringBuilder.append((String)object);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final String zza(Bundle bundle) {
        boolean bl2;
        if (bundle == null) {
            return null;
        }
        Object object = this.zzd;
        boolean bl3 = object.zza();
        if (!bl3) {
            return bundle.toString();
        }
        object = Ex0.a("Bundle[{");
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object[] objectArray;
            int n3;
            Object object2 = (String)iterator.next();
            int n4 = ((StringBuilder)object).length();
            if (n4 != (n3 = 8)) {
                objectArray = ", ";
                ((StringBuilder)object).append((String)objectArray);
            }
            objectArray = this.zzb((String)object2);
            ((StringBuilder)object).append((String)objectArray);
            objectArray = "=";
            ((StringBuilder)object).append((String)objectArray);
            object2 = bundle.get((String)object2);
            n4 = object2 instanceof Bundle;
            if (n4 != 0) {
                n4 = 1;
                objectArray = new Object[n4];
                n3 = 0;
                objectArray[0] = object2;
                object2 = this.zza(objectArray);
            } else {
                n4 = object2 instanceof Object[];
                if (n4 != 0) {
                    object2 = object2;
                    object2 = this.zza((Object[])object2);
                } else {
                    n4 = object2 instanceof ArrayList;
                    if (n4 != 0) {
                        object2 = ((ArrayList)object2).toArray();
                        object2 = this.zza((Object[])object2);
                    } else {
                        object2 = String.valueOf(object2);
                    }
                }
            }
            ((StringBuilder)object).append((String)object2);
        }
        ((StringBuilder)object).append("}]");
        return ((StringBuilder)object).toString();
    }

    public final String zza(zzbl abstractSafeParcelable) {
        boolean bl2 = false;
        Object object = null;
        if (abstractSafeParcelable == null) {
            return null;
        }
        Object object2 = this.zzd;
        boolean bl3 = object2.zza();
        if (!bl3) {
            return ((zzbl)abstractSafeParcelable).toString();
        }
        object2 = new StringBuilder("origin=");
        String string2 = ((zzbl)abstractSafeParcelable).zzc;
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(",name=");
        string2 = ((zzbl)abstractSafeParcelable).zza;
        string2 = this.zza(string2);
        ((StringBuilder)object2).append(string2);
        string2 = ",params=";
        ((StringBuilder)object2).append(string2);
        abstractSafeParcelable = ((zzbl)abstractSafeParcelable).zzb;
        if (abstractSafeParcelable != null) {
            object = this.zzd;
            bl2 = object.zza();
            if (!bl2) {
                object = ((zzbg)abstractSafeParcelable).toString();
            } else {
                abstractSafeParcelable = ((zzbg)abstractSafeParcelable).zzb();
                object = this.zza((Bundle)abstractSafeParcelable);
            }
        }
        ((StringBuilder)object2).append((String)object);
        return ((StringBuilder)object2).toString();
    }

    public final String zza(String string2) {
        if (string2 == null) {
            return null;
        }
        String[] stringArray = this.zzd;
        boolean bl2 = stringArray.zza();
        if (!bl2) {
            return string2;
        }
        stringArray = zzjp.zzc;
        String[] stringArray2 = zzjp.zza;
        AtomicReference atomicReference = zza;
        return zzgl.zza(string2, stringArray, stringArray2, atomicReference);
    }

    public final String zzb(String string2) {
        if (string2 == null) {
            return null;
        }
        String[] stringArray = this.zzd;
        boolean bl2 = stringArray.zza();
        if (!bl2) {
            return string2;
        }
        stringArray = zzjo.zzb;
        String[] stringArray2 = zzjo.zza;
        AtomicReference atomicReference = zzb;
        return zzgl.zza(string2, stringArray, stringArray2, atomicReference);
    }

    public final String zzc(String string2) {
        if (string2 == null) {
            return null;
        }
        Object object = this.zzd;
        boolean bl2 = object.zza();
        if (!bl2) {
            return string2;
        }
        object = "_exp_";
        bl2 = string2.startsWith((String)object);
        if (bl2) {
            return cP.a("experiment_id(", string2, ")");
        }
        object = zzjr.zzb;
        String[] stringArray = zzjr.zza;
        AtomicReference atomicReference = zzc;
        return zzgl.zza(string2, object, stringArray, atomicReference);
    }
}

