/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzjs;
import com.google.android.gms.internal.vision.zzju;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzjx;
import com.google.android.gms.internal.vision.zzkw;
import com.google.android.gms.internal.vision.zzlz;
import com.google.android.gms.internal.vision.zzma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class zzjw
extends zzju {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzjw() {
        super(null);
    }

    public /* synthetic */ zzjw(zzjx zzjx2) {
        this();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static List zza(Object object, long l2, int n3) {
        void var4_12;
        List list = zzjw.zzc(object, l2);
        boolean bl2 = list.isEmpty();
        if (bl2) {
            void var4_7;
            bl2 = list instanceof zzjv;
            if (bl2) {
                zzjs zzjs2 = new zzjs(n3);
            } else {
                bl2 = list instanceof zzkw;
                if (bl2 && (bl2 = list instanceof zzjl)) {
                    zzjl zzjl2;
                    zzjl zzjl3 = zzjl2 = ((zzjl)list).zza(n3);
                } else {
                    ArrayList arrayList = new ArrayList(n3);
                }
            }
            zzma.zza(object, l2, var4_7);
            return (List)var4_12;
        }
        Object object2 = zza;
        Class<?> clazz = list.getClass();
        bl2 = ((Class)object2).isAssignableFrom(clazz);
        if (bl2) {
            int n4 = list.size() + n3;
            object2 = new Object(n4);
            ((ArrayList)object2).addAll(list);
            zzma.zza(object, l2, object2);
        } else {
            bl2 = list instanceof zzlz;
            if (!bl2) {
                bl2 = list instanceof zzkw;
                if (!bl2) return (List)var4_12;
                bl2 = list instanceof zzjl;
                if (!bl2) return (List)var4_12;
                object2 = list;
                object2 = (zzjl)list;
                boolean bl3 = object2.zza();
                if (bl3) return (List)var4_12;
                int n7 = list.size() + n3;
                zzjl zzjl4 = object2.zza(n7);
                zzma.zza(object, l2, zzjl4);
                return (List)var4_12;
            }
            int n8 = list.size() + n3;
            object2 = new Object(n8);
            zzlz zzlz2 = (zzlz)list;
            ((zzjs)object2).addAll((Collection)zzlz2);
            zzma.zza(object, l2, object2);
        }
        List list2 = object2;
        return (List)var4_12;
    }

    private static List zzc(Object object, long l2) {
        return (List)zzma.zzf(object, l2);
    }

    public final List zza(Object object, long l2) {
        return zzjw.zza(object, l2, 10);
    }

    public final void zza(Object object, Object object2, long l2) {
        object2 = zzjw.zzc(object2, l2);
        int n3 = object2.size();
        List list = zzjw.zza(object, l2, n3);
        int n4 = list.size();
        int n7 = object2.size();
        if (n4 > 0 && n7 > 0) {
            list.addAll(object2);
        }
        if (n4 > 0) {
            object2 = list;
        }
        zzma.zza(object, l2, object2);
    }

    public final void zzb(Object object, long l2) {
        zzjl zzjl2 = (zzjl)zzma.zzf(object, l2);
        boolean bl2 = zzjl2 instanceof zzjv;
        if (bl2) {
            zzjl2 = ((zzjv)((Object)zzjl2)).zze();
        } else {
            Class clazz = zza;
            Class<?> clazz2 = zzjl2.getClass();
            bl2 = clazz.isAssignableFrom(clazz2);
            if (bl2) {
                return;
            }
            bl2 = zzjl2 instanceof zzkw;
            if (bl2 && (bl2 = zzjl2 instanceof zzjl)) {
                boolean bl3 = (zzjl2 = (zzjl)zzjl2).zza();
                if (bl3) {
                    zzjl2.zzb();
                }
                return;
            }
            zzjl2 = Collections.unmodifiableList(zzjl2);
        }
        zzma.zza(object, l2, zzjl2);
    }
}

