/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcd;
import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzcm;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzdo;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzbs
implements zzee {
    protected int zza = 0;

    public static void zzk(Iterable object, List object2) {
        block11: {
            block10: {
                int n3;
                String string2;
                String string3;
                int n4;
                block9: {
                    boolean bl2;
                    zzdh.zza(object);
                    n4 = object instanceof zzdo;
                    string3 = " is null.";
                    string2 = "Element at index ";
                    n3 = 37;
                    if (n4 == 0) break block9;
                    object = ((zzdo)object).zzh();
                    List list = object2;
                    list = (zzdo)object2;
                    int n7 = object2.size();
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        Object object3 = object.next();
                        if (object3 == null) {
                            int n8 = list.size();
                            object3 = new StringBuilder(n3);
                            ((StringBuilder)object3).append(string2);
                            ((StringBuilder)object3).append(n8 -= n7);
                            ((StringBuilder)object3).append(string3);
                            object = ((StringBuilder)object3).toString();
                            int n10 = list.size();
                            while ((n10 += -1) >= n7) {
                                list.remove(n10);
                            }
                            object2 = new NullPointerException((String)object);
                            throw object2;
                        }
                        boolean bl3 = object3 instanceof zzcf;
                        if (bl3) {
                            object3 = (zzcf)object3;
                            list.zzf((zzcf)object3);
                            continue;
                        }
                        object3 = (String)object3;
                        list.add(object3);
                    }
                    break block10;
                }
                n4 = object instanceof zzel;
                if (n4 == 0) {
                    int n14;
                    n4 = object2 instanceof ArrayList;
                    if (n4 != 0 && (n4 = object instanceof Collection) != 0) {
                        List list = object2;
                        list = (ArrayList)object2;
                        n14 = object2.size();
                        int n15 = ((Collection)object).size() + n14;
                        ((ArrayList)list).ensureCapacity(n15);
                    }
                    n4 = object2.size();
                    object = ((Iterable)object).iterator();
                    while ((n14 = object.hasNext()) != 0) {
                        Object object4 = object.next();
                        if (object4 == null) {
                            int n16 = object2.size();
                            object4 = new StringBuilder(n3);
                            ((StringBuilder)object4).append(string2);
                            ((StringBuilder)object4).append(n16 -= n4);
                            ((StringBuilder)object4).append(string3);
                            object = ((StringBuilder)object4).toString();
                            int n17 = object2.size();
                            while ((n17 += -1) >= n4) {
                                ((List)object2).remove(n17);
                            }
                            object2 = new NullPointerException((String)object);
                            throw object2;
                        }
                        object2.add(object4);
                    }
                }
                break block11;
            }
            return;
        }
        object2.addAll((Collection)object);
    }

    public final zzcf zzg() {
        Object object;
        int n3;
        try {
            n3 = this.zzo();
        }
        catch (IOException iOException) {
            String string2 = this.getClass().getName();
            int n4 = string2.length();
            StringBuilder stringBuilder = new StringBuilder(n4 += 72);
            string2 = BW0.b(stringBuilder, "Serializing ", string2, " to a ByteString threw an IOException (should never happen).");
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        object = zzcf.zzb;
        byte[] byArray = new byte[n3];
        object = zzcm.zzt(byArray);
        this.zzn((zzcm)object);
        ((zzcm)object).zzC();
        object = new zzcd(byArray);
        return object;
    }

    public final byte[] zzh() {
        Object object;
        int n3;
        try {
            n3 = this.zzo();
        }
        catch (IOException iOException) {
            String string2 = this.getClass().getName();
            int n4 = string2.length();
            StringBuilder stringBuilder = new StringBuilder(n4 += 72);
            string2 = BW0.b(stringBuilder, "Serializing ", string2, " to a byte array threw an IOException (should never happen).");
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        byte[] byArray = new byte[n3];
        object = zzcm.zzt(byArray);
        this.zzn((zzcm)object);
        ((zzcm)object).zzC();
        return byArray;
    }

    public int zzi() {
        throw null;
    }

    public void zzj(int n3) {
        throw null;
    }
}

