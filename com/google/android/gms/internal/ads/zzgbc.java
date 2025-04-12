/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgba;
import com.google.android.gms.internal.ads.zzgbb;
import com.google.android.gms.internal.ads.zzgcm;
import com.google.android.gms.internal.ads.zzgco;
import com.google.android.gms.internal.ads.zzgdi;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzgbc
extends zzgax
implements List,
RandomAccess {
    private static final zzgdj zza;
    public static final /* synthetic */ int zzd;

    static {
        zzgbc zzgbc2 = zzgco.zza;
        zzgba zzgba2 = new zzgba(zzgbc2, 0);
        zza = zzgba2;
    }

    public static zzgaz zzi(int n3) {
        zzgaz zzgaz2 = new zzgaz(n3);
        return zzgaz2;
    }

    public static zzgbc zzj(Object[] objectArray, int n3) {
        if (n3 == 0) {
            return zzgco.zza;
        }
        zzgco zzgco2 = new zzgco(objectArray, n3);
        return zzgco2;
    }

    public static zzgbc zzk(Collection object) {
        int n3 = object instanceof zzgax;
        if (n3 != 0) {
            n3 = (int)(((zzgax)(object = ((zzgax)object).zzd())).zzf() ? 1 : 0);
            if (n3 != 0) {
                object = ((zzgax)object).toArray();
                n3 = ((Object)object).length;
                object = zzgbc.zzj((Object[])object, n3);
            }
            return object;
        }
        object = object.toArray();
        n3 = ((Object[])object).length;
        zzgcm.zzb((Object[])object, n3);
        return zzgbc.zzj((Object[])object, n3);
    }

    public static zzgbc zzl(Object[] object) {
        int n3 = ((Object[])object).length;
        if (n3 == 0) {
            object = zzgco.zza;
        } else {
            object = (Object[])object.clone();
            n3 = ((Object[])object).length;
            zzgcm.zzb(object, n3);
            object = zzgbc.zzj(object, n3);
        }
        return object;
    }

    public static zzgbc zzm() {
        return zzgco.zza;
    }

    public static zzgbc zzn(Object object) {
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        zzgcm.zzb(objectArray, n3);
        return zzgbc.zzj(objectArray, n3);
    }

    public static zzgbc zzo(Object object, Object object2) {
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        zzgcm.zzb(objectArray, n3);
        return zzgbc.zzj(objectArray, n3);
    }

    public static zzgbc zzp(Object object, Object object2, Object object3) {
        int n3 = 3;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        zzgcm.zzb(objectArray, n3);
        return zzgbc.zzj(objectArray, n3);
    }

    public static zzgbc zzq(Object object, Object object2, Object object3, Object object4, Object object5) {
        int n3 = 5;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        zzgcm.zzb(objectArray, n3);
        return zzgbc.zzj(objectArray, n3);
    }

    public static zzgbc zzr(Object object, Object objectArray, Object object2, Object object3, Object object4, Object object5) {
        int n3 = 6;
        objectArray = new Object[n3];
        objectArray[0] = "3010";
        objectArray[1] = "3008";
        objectArray[2] = "1005";
        objectArray[3] = "1009";
        objectArray[4] = "2011";
        objectArray[5] = "2007";
        zzgcm.zzb(objectArray, n3);
        return zzgbc.zzj(objectArray, n3);
    }

    public static zzgbc zzs(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        int n3 = 9;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        zzgcm.zzb(objectArray, n3);
        return zzgbc.zzj(objectArray, n3);
    }

    public static zzgbc zzt(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        int n3 = 10;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        zzgcm.zzb(objectArray, n3);
        return zzgbc.zzj(objectArray, n3);
    }

    public final void add(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final boolean contains(Object object) {
        int n3 = this.indexOf(object);
        return n3 >= 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object iterator) {
        Iterator iterator2;
        int n3;
        boolean bl2 = true;
        if (iterator == this) {
            return bl2;
        }
        int n4 = iterator instanceof List;
        if (n4 == 0) return false;
        iterator = (List)((Object)iterator);
        n4 = this.size();
        if (n4 != (n3 = iterator.size())) return false;
        n3 = iterator instanceof RandomAccess;
        if (n3 == 0) {
            iterator2 = this.iterator();
            iterator = iterator.iterator();
        } else {
            n3 = 0;
            Object var5_5 = null;
            while (n3 < n4) {
                Object e2;
                Object e5 = this.get(n3);
                boolean bl3 = zzfya.zza(e5, e2 = ((List)((Object)iterator)).get(n3));
                if (!bl3) return false;
                ++n3;
            }
            return bl2;
        }
        while ((n3 = (int)(iterator2.hasNext() ? 1 : 0)) != 0) {
            Object e7;
            Object e12;
            n3 = (int)(iterator.hasNext() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(zzfya.zza(e12 = iterator2.next(), e7 = iterator.next()) ? 1 : 0)) != 0) continue;
            return false;
        }
        boolean bl4 = iterator.hasNext();
        if (!bl4) return bl2;
        return false;
    }

    public final int hashCode() {
        int n3 = this.size();
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            n4 *= 31;
            Object e2 = this.get(i3);
            int n7 = e2.hashCode();
            n4 += n7;
        }
        return n4;
    }

    public final int indexOf(Object object) {
        int n3 = -1;
        if (object == null) {
            return n3;
        }
        int n4 = this.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            Object e2 = this.get(i3);
            boolean bl2 = object.equals(e2);
            if (!bl2) continue;
            n3 = i3;
            break;
        }
        return n3;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzu(0);
    }

    public final int lastIndexOf(Object object) {
        int n3 = -1;
        if (object == null) {
            return n3;
        }
        for (int i3 = this.size() + n3; i3 >= 0; i3 += -1) {
            Object e2 = this.get(i3);
            boolean bl2 = object.equals(e2);
            if (!bl2) continue;
            n3 = i3;
            break;
        }
        return n3;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return this.zzu(0);
    }

    public final Object remove(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final Object set(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int zza(Object[] objectArray, int n3) {
        int n4 = this.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = n3 + i3;
            Object e2 = this.get(i3);
            objectArray[n7] = e2;
        }
        return n3 + n4;
    }

    public final zzgbc zzd() {
        return this;
    }

    public final zzgdi zze() {
        return this.zzu(0);
    }

    public zzgbc zzh(int n3, int n4) {
        int n7 = this.size();
        zzfyg.zzi(n3, n4, n7);
        n7 = this.size();
        if ((n4 -= n3) == n7) {
            return this;
        }
        if (n4 == 0) {
            return zzgco.zza;
        }
        zzgbb zzgbb2 = new zzgbb(this, n3, n4);
        return zzgbb2;
    }

    public final zzgdj zzu(int n3) {
        int n4 = this.size();
        String string2 = "index";
        zzfyg.zzb(n3, n4, string2);
        n4 = (int)(this.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return zza;
        }
        zzgba zzgba2 = new zzgba(this, n3);
        return zzgba2;
    }
}

