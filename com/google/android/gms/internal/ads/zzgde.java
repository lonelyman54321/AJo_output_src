/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgck;
import com.google.android.gms.internal.ads.zzgcy;
import com.google.android.gms.internal.ads.zzgcz;
import com.google.android.gms.internal.ads.zzgda;
import com.google.android.gms.internal.ads.zzgdd;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public final class zzgde {
    public static int zza(Set object) {
        int n3;
        object = object.iterator();
        int n4 = 0;
        while ((n3 = object.hasNext()) != 0) {
            Object e2 = object.next();
            if (e2 != null) {
                n3 = e2.hashCode();
            } else {
                n3 = 0;
                e2 = null;
            }
            n4 += n3;
        }
        return n4;
    }

    public static zzgdd zzb(Set set, Set set2) {
        zzfyg.zzc(set, "set1");
        zzfyg.zzc(set2, "set2");
        zzgcy zzgcy2 = new zzgcy(set, set2);
        return zzgcy2;
    }

    public static Set zzc(Set collection, zzfyh zzfyh2) {
        boolean bl2 = collection instanceof SortedSet;
        if (bl2) {
            zzgda zzgda2;
            bl2 = (collection = (SortedSet)collection) instanceof zzgcz;
            if (bl2) {
                collection = (zzgcz)collection;
                zzfyh2 = zzfyk.zza(((zzgaa)collection).zzb, zzfyh2);
                collection = (SortedSet)((zzgaa)collection).zza;
                zzgda2 = new zzgda((SortedSet)collection, zzfyh2);
            } else {
                collection.getClass();
                zzgda2 = new zzgda((SortedSet)collection, zzfyh2);
            }
            return zzgda2;
        }
        bl2 = collection instanceof zzgcz;
        if (bl2) {
            collection = (zzgcz)collection;
            zzfyh2 = zzfyk.zza(((zzgaa)collection).zzb, zzfyh2);
            collection = ((zzgaa)collection).zza;
            zzgcz zzgcz2 = new zzgcz((Set)collection, zzfyh2);
            return zzgcz2;
        }
        collection.getClass();
        zzgcz zzgcz3 = new zzgcz((Set)collection, zzfyh2);
        return zzgcz3;
    }

    public static boolean zzd(Set set, Object object) {
        block7: {
            boolean bl2 = true;
            if (set == object) {
                return bl2;
            }
            int n3 = object instanceof Set;
            if (n3 != 0) {
                object = (Set)object;
                n3 = set.size();
                int n4 = object.size();
                if (n3 != n4) break block7;
                try {
                    boolean bl3 = set.containsAll((Collection<?>)object);
                    if (bl3) {
                        return bl2;
                    }
                }
                catch (ClassCastException | NullPointerException runtimeException) {}
            }
        }
        return false;
    }

    public static boolean zze(Set object, Collection object2) {
        int n3;
        object2.getClass();
        int n4 = object2 instanceof zzgck;
        if (n4) {
            object2 = ((zzgck)object2).zza();
        }
        if ((n4 = object2 instanceof Set) && (n4 = object2.size()) > (n3 = object.size())) {
            object = object.iterator();
            object2.getClass();
            n4 = 0;
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Object e2 = object.next();
                n3 = (int)(((Collection)object2).contains(e2) ? 1 : 0);
                if (n3 == 0) continue;
                object.remove();
                n4 = 1;
            }
            return n4;
        }
        object2 = object2.iterator();
        return zzgde.zzf((Set)object, (Iterator)object2);
    }

    public static boolean zzf(Set set, Iterator iterator) {
        boolean bl2;
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            bl2 = set.remove(e2);
            bl3 |= bl2;
        }
        return bl3;
    }
}

