/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzib;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzhf
implements zzkk {
    protected int zza = 0;

    public static void zza(Iterable object, List object2) {
        int n3;
        zzjf.zza(object);
        int n4 = object instanceof zzjv;
        String string2 = " is null.";
        String string3 = "Element at index ";
        int n7 = 37;
        if (n4 != 0) {
            boolean bl2;
            object = ((zzjv)object).zzd();
            List list = object2;
            list = (zzjv)object2;
            int n8 = object2.size();
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object object3 = object.next();
                if (object3 == null) {
                    int n10 = list.size() - n8;
                    object = oe2_0.a(n7, n10, string3, string2);
                    for (int i3 = list.size() + -1; i3 >= n8; i3 += -1) {
                        list.remove(i3);
                    }
                    object2 = new NullPointerException((String)object);
                    throw object2;
                }
                boolean bl3 = object3 instanceof zzht;
                if (bl3) {
                    object3 = (zzht)object3;
                    list.zza((zzht)object3);
                    continue;
                }
                object3 = (String)object3;
                list.add(object3);
            }
            return;
        }
        n4 = object instanceof zzkw;
        if (n4 != 0) {
            object = (Collection)object;
            object2.addAll(object);
            return;
        }
        n4 = object2 instanceof ArrayList;
        if (n4 != 0 && (n4 = object instanceof Collection) != 0) {
            List list = object2;
            list = (ArrayList)object2;
            n3 = object2.size();
            Object object4 = object;
            object4 = (Collection)object;
            int n14 = object4.size() + n3;
            ((ArrayList)list).ensureCapacity(n14);
        }
        n4 = object2.size();
        object = ((Iterable)object).iterator();
        while ((n3 = object.hasNext()) != 0) {
            Object t3 = object.next();
            if (t3 == null) {
                int n15 = object2.size() - n4;
                object = oe2_0.a(n7, n15, string3, string2);
                for (int i8 = object2.size() + -1; i8 >= n4; i8 += -1) {
                    ((List)object2).remove(i8);
                }
                object2 = new NullPointerException((String)object);
                throw object2;
            }
            object2.add(t3);
        }
    }

    public void zzb(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final zzht zzg() {
        Object object;
        int n3;
        try {
            n3 = this.zzm();
        }
        catch (IOException iOException) {
            String string2 = this.getClass().getName();
            int n4 = string2.length() + 62;
            int n7 = "ByteString".length() + n4;
            StringBuilder stringBuilder = new StringBuilder(n7);
            stringBuilder.append("Serializing ");
            stringBuilder.append(string2);
            stringBuilder.append(" to a ByteString threw an IOException (should never happen).");
            string2 = stringBuilder.toString();
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        zzib zzib2 = zzht.zzc(n3);
        object = zzib2.zzb();
        this.zza((zzii)object);
        return zzib2.zza();
    }

    public final byte[] zzh() {
        Object object;
        int n3;
        try {
            n3 = this.zzm();
        }
        catch (IOException iOException) {
            String string2 = this.getClass().getName();
            int n4 = string2.length() + 62;
            int n7 = "byte array".length() + n4;
            StringBuilder stringBuilder = new StringBuilder(n7);
            stringBuilder.append("Serializing ");
            stringBuilder.append(string2);
            stringBuilder.append(" to a byte array threw an IOException (should never happen).");
            string2 = stringBuilder.toString();
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        byte[] byArray = new byte[n3];
        object = zzii.zza(byArray);
        this.zza((zzii)object);
        ((zzii)object).zzb();
        return byArray;
    }

    public int zzi() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

