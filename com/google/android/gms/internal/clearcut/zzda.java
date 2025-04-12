/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcw;
import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzcy;
import com.google.android.gms.internal.clearcut.zzcz;
import com.google.android.gms.internal.clearcut.zzfa;
import com.google.android.gms.internal.clearcut.zzfd;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class zzda
extends zzcy {
    private static final Class zzlv = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzda() {
        super(null);
    }

    public /* synthetic */ zzda(zzcz zzcz2) {
        this();
    }

    private static List zzb(Object object, long l2) {
        return (List)zzfd.zzo(object, l2);
    }

    public final void zza(Object object, long l2) {
        List list = (List)zzfd.zzo(object, l2);
        boolean bl2 = list instanceof zzcx;
        if (bl2) {
            list = ((zzcx)list).zzbu();
        } else {
            Class clazz = zzlv;
            Class<?> clazz2 = list.getClass();
            bl2 = clazz.isAssignableFrom(clazz2);
            if (bl2) {
                return;
            }
            list = Collections.unmodifiableList(list);
        }
        zzfd.zza(object, l2, list);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void zza(Object object, Object list, long l2) {
        int n3;
        AbstractList abstractList;
        int n4;
        block6: {
            void var9_10;
            block8: {
                block7: {
                    block5: {
                        list = zzda.zzb(list, l2);
                        n4 = list.size();
                        abstractList = zzda.zzb(object, l2);
                        n3 = abstractList.isEmpty();
                        if (n3 == 0) break block5;
                        boolean bl2 = abstractList instanceof zzcx;
                        abstractList = bl2 ? new AbstractList(n4) : new AbstractList(n4);
                        zzfd.zza(object, l2, abstractList);
                        break block6;
                    }
                    Class clazz = zzlv;
                    Class<?> clazz2 = abstractList.getClass();
                    n3 = clazz.isAssignableFrom(clazz2);
                    if (n3 == 0) break block7;
                    int n7 = abstractList.size() + n4;
                    ArrayList arrayList = new ArrayList(n7);
                    arrayList.addAll(abstractList);
                    break block8;
                }
                n3 = abstractList instanceof zzfa;
                if (n3 == 0) break block6;
                int n8 = ((List)abstractList).size() + n4;
                zzcw zzcw2 = new zzcw(n8);
                abstractList = (zzfa)abstractList;
                zzcw2.addAll((Collection)abstractList);
            }
            zzfd.zza(object, l2, var9_10);
            abstractList = var9_10;
        }
        n4 = abstractList.size();
        n3 = list.size();
        if (n4 > 0 && n3 > 0) {
            abstractList.addAll(list);
        }
        if (n4 > 0) {
            list = abstractList;
        }
        zzfd.zza(object, l2, list);
    }
}

