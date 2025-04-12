/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcv;
import com.google.android.gms.internal.consent_sdk.zzcw;
import com.google.android.gms.internal.consent_sdk.zzda;
import com.google.android.gms.internal.consent_sdk.zzdb;
import com.google.android.gms.internal.consent_sdk.zzdc;
import com.google.android.gms.internal.consent_sdk.zzdg;
import com.google.android.gms.internal.consent_sdk.zzdj;
import com.google.android.gms.internal.consent_sdk.zzdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzdd
extends zzda
implements List,
RandomAccess {
    private static final zzdk zza;
    public static final /* synthetic */ int zzd;

    static {
        zzdd zzdd2 = zzdg.zza;
        zzdb zzdb2 = new zzdb(zzdd2, 0);
        zza = zzdb2;
    }

    public static zzdd zzg(Object[] objectArray, int n3) {
        if (n3 == 0) {
            return zzdg.zza;
        }
        zzdg zzdg2 = new zzdg(objectArray, n3);
        return zzdg2;
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
                boolean bl3 = zzcv.zza(e5, e2 = ((List)((Object)iterator)).get(n3));
                if (!bl3) return false;
                ++n3;
            }
            return bl2;
        }
        while ((n3 = (int)(iterator2.hasNext() ? 1 : 0)) != 0) {
            Object e7;
            Object e12;
            n3 = (int)(iterator.hasNext() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(zzcv.zza(e12 = iterator2.next(), e7 = iterator.next()) ? 1 : 0)) != 0) continue;
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
        return this.zzh(0);
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
        return this.zzh(0);
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
        n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object e2 = this.get(i3);
            objectArray[i3] = e2;
        }
        return n3;
    }

    public final zzdj zzd() {
        return this.zzh(0);
    }

    public zzdd zzf(int n3, int n4) {
        int n7 = this.size();
        zzcw.zzc(n3, n4, n7);
        n7 = this.size();
        if ((n4 -= n3) == n7) {
            return this;
        }
        if (n4 == 0) {
            return zzdg.zza;
        }
        zzdc zzdc2 = new zzdc(this, n3, n4);
        return zzdc2;
    }

    public final zzdk zzh(int n3) {
        int n4 = this.size();
        String string2 = "index";
        zzcw.zzb(n3, n4, string2);
        n4 = (int)(this.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return zza;
        }
        zzdb zzdb2 = new zzdb(this, n3);
        return zzdb2;
    }
}

