/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzgcx;
import com.google.android.gms.internal.ads.zzgcy;
import java.util.List;
import java.util.RandomAccess;

public final class zzgbi {
    public static Object zza(Iterable iterable, Object object) {
        zzgcx zzgcx2 = new zzgcx((zzgcy)(iterable = (zzgcy)iterable));
        boolean bl2 = zzgcx2.hasNext();
        if (bl2) {
            return zzgcx2.next();
        }
        return object;
    }

    public static boolean zzb(Iterable object, zzfyh zzfyh2) {
        boolean bl2;
        boolean bl3 = object instanceof RandomAccess;
        if (bl3 && (bl3 = object instanceof List)) {
            object = (List)object;
            zzfyh2.getClass();
            return zzgbi.zzd((List)object, zzfyh2);
        }
        object = object.iterator();
        zzfyh2.getClass();
        bl3 = false;
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = zzfyh2.zza(e2);
            if (!bl2) continue;
            object.remove();
            bl3 = true;
        }
        return bl3;
    }

    private static void zzc(List list, zzfyh zzfyh2, int n3, int n4) {
        int n7 = list.size();
        while ((n7 += -1) > n4) {
            Object e2 = list.get(n7);
            boolean bl2 = zzfyh2.zza(e2);
            if (!bl2) continue;
            list.remove(n7);
        }
        while ((n4 += -1) >= n3) {
            list.remove(n4);
        }
    }

    private static boolean zzd(List list, zzfyh zzfyh2) {
        boolean bl2;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n7 = list.size();
            bl2 = true;
            if (n3 >= n7) break;
            Object e2 = list.get(n3);
            boolean bl3 = zzfyh2.zza(e2);
            if (!bl3) {
                if (n3 > n4) {
                    try {
                        list.set(n4, e2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        zzgbi.zzc(list, zzfyh2, n4, n3);
                        return bl2;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        zzgbi.zzc(list, zzfyh2, n4, n3);
                        return bl2;
                    }
                }
                ++n4;
            }
            ++n3;
        }
        int n8 = list.size();
        list = list.subList(n4, n8);
        list.clear();
        if (n3 != n4) {
            return bl2;
        }
        return false;
    }
}

