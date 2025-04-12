/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.internal.location.zzeq;
import com.google.android.gms.internal.location.zzer;
import com.google.android.gms.internal.location.zzeu;
import com.google.android.gms.internal.location.zzev;
import com.google.android.gms.internal.location.zzew;
import com.google.android.gms.internal.location.zzey;
import com.google.android.gms.internal.location.zzez;
import com.google.android.gms.internal.location.zzfa;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzex
extends zzeu
implements List,
RandomAccess {
    private static final zzfa zza;

    static {
        zzex zzex2 = zzey.zza;
        zzev zzev2 = new zzev(zzex2, 0);
        zza = zzev2;
    }

    public static zzex zzi() {
        return zzey.zza;
    }

    public static zzex zzj(Collection object) {
        int n3 = object instanceof zzeu;
        if (n3 != 0) {
            n3 = (int)(((zzeu)(object = ((zzeu)object).zze())).zzf() ? 1 : 0);
            if (n3 != 0) {
                object = ((zzeu)object).toArray();
                n3 = ((Object)object).length;
                object = zzex.zzk((Object[])object, n3);
            }
            return object;
        }
        object = object.toArray();
        n3 = ((Object[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            if (object2 != null) {
                continue;
            }
            n3 = String.valueOf(i3).length();
            object2 = new StringBuilder(n3 += 9);
            ((StringBuilder)object2).append("at index ");
            ((StringBuilder)object2).append(i3);
            String string2 = ((StringBuilder)object2).toString();
            object = new NullPointerException(string2);
            throw object;
        }
        return zzex.zzk((Object[])object, n3);
    }

    public static zzex zzk(Object[] objectArray, int n3) {
        if (n3 == 0) {
            return zzey.zza;
        }
        zzey zzey2 = new zzey(objectArray, n3);
        return zzey2;
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
                boolean bl3 = zzeq.zza(e5, e2 = ((List)((Object)iterator)).get(n3));
                if (!bl3) return false;
                ++n3;
            }
            return bl2;
        }
        while ((n3 = (int)(iterator2.hasNext() ? 1 : 0)) != 0) {
            Object e7;
            Object e12;
            n3 = (int)(iterator.hasNext() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(zzeq.zza(e12 = iterator2.next(), e7 = iterator.next()) ? 1 : 0)) != 0) continue;
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
        return this.zzl(0);
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
        return this.zzl(0);
    }

    public final Object remove(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final Object set(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final zzez zza() {
        return this.zzl(0);
    }

    public final zzex zze() {
        return this;
    }

    public int zzg(Object[] objectArray, int n3) {
        n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object e2 = this.get(i3);
            objectArray[i3] = e2;
        }
        return n3;
    }

    public zzex zzh(int n3, int n4) {
        int n7 = this.size();
        zzer.zze(n3, n4, n7);
        n7 = this.size();
        if ((n4 -= n3) == n7) {
            return this;
        }
        if (n4 == 0) {
            return zzey.zza;
        }
        zzew zzew2 = new zzew(this, n3, n4);
        return zzew2;
    }

    public final zzfa zzl(int n3) {
        int n4 = this.size();
        String string2 = "index";
        zzer.zzd(n3, n4, string2);
        n4 = (int)(this.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return zza;
        }
        zzev zzev2 = new zzev(this, n3);
        return zzev2;
    }
}

