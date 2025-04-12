/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhcl;
import com.google.android.gms.internal.ads.zzhcm;
import com.google.android.gms.internal.ads.zzhcn;
import com.google.android.gms.internal.ads.zzhcs;
import com.google.android.gms.internal.ads.zzhdn;
import com.google.android.gms.internal.ads.zzhev;
import com.google.android.gms.internal.ads.zzhfa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class zzhco
extends zzhcs {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhco() {
        throw null;
    }

    public /* synthetic */ zzhco(zzhcn zzhcn2) {
        super(null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static List zzf(Object object, long l2, int n3) {
        Object object2;
        void var4_11;
        boolean bl2;
        List list;
        block11: {
            block10: {
                block9: {
                    list = (List)zzhfa.zzh(object, l2);
                    bl2 = list.isEmpty();
                    if (bl2) {
                        void var4_7;
                        bl2 = list instanceof zzhcm;
                        if (bl2) {
                            zzhcl zzhcl2 = new zzhcl(n3);
                        } else {
                            bl2 = list instanceof zzhdn;
                            if (bl2 && (bl2 = list instanceof zzhca)) {
                                zzhca zzhca2;
                                zzhca zzhca3 = zzhca2 = ((zzhca)list).zzf(n3);
                            } else {
                                ArrayList arrayList = new ArrayList(n3);
                            }
                        }
                        zzhfa.zzv(object, l2, var4_7);
                        return (List)var4_11;
                    }
                    object2 = zza;
                    Class<?> clazz = list.getClass();
                    bl2 = ((Class)object2).isAssignableFrom(clazz);
                    if (!bl2) break block9;
                    int n4 = list.size() + n3;
                    object2 = new Object(n4);
                    ((ArrayList)object2).addAll(list);
                    zzhfa.zzv(object, l2, object2);
                    break block10;
                }
                bl2 = list instanceof zzhev;
                if (!bl2) break block11;
                int n7 = list.size() + n3;
                object2 = new Object(n7);
                zzhev zzhev2 = (zzhev)list;
                n3 = ((zzhcl)object2).size();
                ((zzhcl)object2).addAll(n3, (Collection)zzhev2);
                zzhfa.zzv(object, l2, object2);
            }
            List list2 = object2;
            return (List)var4_11;
        }
        bl2 = list instanceof zzhdn;
        if (!bl2) return (List)var4_11;
        bl2 = list instanceof zzhca;
        if (!bl2) return (List)var4_11;
        object2 = list;
        object2 = (zzhca)list;
        boolean bl3 = object2.zzc();
        if (bl3) {
            return (List)var4_11;
        }
        int n8 = list.size() + n3;
        zzhca zzhca4 = object2.zzf(n8);
        zzhfa.zzv(object, l2, zzhca4);
        return zzhca4;
    }

    public final List zza(Object object, long l2) {
        return zzhco.zzf(object, l2, 10);
    }

    public final void zzb(Object object, long l2) {
        zzhca zzhca2;
        block5: {
            block7: {
                block6: {
                    boolean bl2;
                    block4: {
                        zzhca2 = (zzhca)zzhfa.zzh(object, l2);
                        bl2 = zzhca2 instanceof zzhcm;
                        if (!bl2) break block4;
                        zzhca2 = ((zzhcm)((Object)zzhca2)).zzd();
                        break block5;
                    }
                    Class clazz = zza;
                    Class<?> clazz2 = zzhca2.getClass();
                    bl2 = clazz.isAssignableFrom(clazz2);
                    if (bl2) break block6;
                    bl2 = zzhca2 instanceof zzhdn;
                    if (!bl2 || !(bl2 = zzhca2 instanceof zzhca)) break block7;
                    boolean bl3 = (zzhca2 = (zzhca)zzhca2).zzc();
                    if (bl3) {
                        zzhca2.zzb();
                    }
                }
                return;
            }
            zzhca2 = Collections.unmodifiableList(zzhca2);
        }
        zzhfa.zzv(object, l2, zzhca2);
    }

    public final void zzc(Object object, Object object2, long l2) {
        object2 = (List)zzhfa.zzh(object2, l2);
        int n3 = object2.size();
        List list = zzhco.zzf(object, l2, n3);
        int n4 = list.size();
        int n7 = object2.size();
        if (n4 > 0 && n7 > 0) {
            list.addAll(object2);
        }
        if (n4 > 0) {
            object2 = list;
        }
        zzhfa.zzv(object, l2, object2);
    }
}

