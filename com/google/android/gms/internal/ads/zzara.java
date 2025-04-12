/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class zzara {
    public final int zza;
    public final byte[] zzb;
    public final Map zzc;
    public final List zzd;
    public final boolean zze;

    /*
     * Enabled aggressive block sorting
     */
    private zzara(int n3, byte[] byArray, Map map2, List list, boolean bl2, long l2) {
        List list2;
        this.zza = n3;
        this.zzb = byArray;
        this.zzc = map2;
        if (list == null) {
            n3 = 0;
            list2 = null;
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.zzd = list2;
        this.zze = bl2;
    }

    public zzara(int n3, byte[] byArray, Map map2, boolean bl2, long l2) {
        List list = zzara.zza(map2);
        this(n3, byArray, map2, list, bl2, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public zzara(int n3, byte[] byArray, boolean bl2, long l2, List list) {
        Object object;
        Object object2;
        TreeMap<Object, Object> treeMap;
        if (list == null) {
            boolean bl3 = false;
            treeMap = null;
        } else {
            boolean bl4 = list.isEmpty();
            if (bl4) {
                treeMap = Collections.emptyMap();
            } else {
                boolean bl5;
                Object object3 = String.CASE_INSENSITIVE_ORDER;
                treeMap = new TreeMap<Object, Object>((Comparator<Object>)object3);
                object3 = list.iterator();
                while (bl5 = object3.hasNext()) {
                    object2 = (zzaqw)object3.next();
                    object = ((zzaqw)object2).zza();
                    object2 = ((zzaqw)object2).zzb();
                    treeMap.put(object, object2);
                }
            }
        }
        object = treeMap;
        treeMap = this;
        object2 = byArray;
        this(n3, byArray, (Map)object, list, bl2, l2);
    }

    public zzara(byte[] byArray, Map map2) {
        List list = zzara.zza(map2);
        this(200, byArray, map2, list, false, 0L);
    }

    private static List zza(Map object) {
        if (object == null) {
            return null;
        }
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return Collections.emptyList();
        }
        int n3 = object.size();
        ArrayList<zzaqw> arrayList = new ArrayList<zzaqw>(n3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            zzaqw zzaqw2 = new zzaqw(string2, (String)object2);
            arrayList.add(zzaqw2);
        }
        return arrayList;
    }
}

