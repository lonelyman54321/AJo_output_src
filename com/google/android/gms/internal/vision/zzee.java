/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;
import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzeb;
import com.google.android.gms.internal.vision.zzed;
import com.google.android.gms.internal.vision.zzeg;
import com.google.android.gms.internal.vision.zzep;
import com.google.android.gms.internal.vision.zzeq;
import com.google.android.gms.internal.vision.zzez;
import com.google.android.gms.internal.vision.zzfa;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzee
extends zzeb
implements List,
RandomAccess {
    private static final zzez zza;

    static {
        zzee zzee2 = zzep.zza;
        zzed zzed2 = new zzed(zzee2, 0);
        zza = zzed2;
    }

    public static zzee zza(Object object) {
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        object = null;
        for (int i3 = 0; i3 <= 0; i3 += n3) {
            Object object2 = objectArray[0];
            zzeq.zza(object2, 0);
        }
        return zzee.zzb(objectArray, n3);
    }

    public static zzee zza(Object[] objectArray) {
        int n3 = objectArray.length;
        return zzee.zzb(objectArray, n3);
    }

    public static zzee zzb(Object[] objectArray, int n3) {
        if (n3 == 0) {
            return zzep.zza;
        }
        zzep zzep2 = new zzep(objectArray, n3);
        return zzep2;
    }

    public static zzee zzg() {
        return zzep.zza;
    }

    public final void add(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public boolean contains(Object object) {
        int n3 = this.indexOf(object);
        return n3 >= 0;
    }

    public boolean equals(Object iterator) {
        block10: {
            Object object = zzde.zza(this);
            boolean bl2 = true;
            if (iterator == object) {
                return bl2;
            }
            int n3 = iterator instanceof List;
            if (n3 != 0) {
                int n4;
                iterator = (List)((Object)iterator);
                n3 = this.size();
                if (n3 == (n4 = iterator.size())) {
                    n4 = iterator instanceof RandomAccess;
                    if (n4 != 0) {
                        for (n4 = 0; n4 < n3; ++n4) {
                            Object e2;
                            Object e5 = this.get(n4);
                            boolean bl3 = zzcz.zza(e5, e2 = ((List)((Object)iterator)).get(n4));
                            if (bl3) {
                                continue;
                            }
                            break block10;
                        }
                        return bl2;
                    }
                    n3 = this.size();
                    iterator = iterator.iterator();
                    for (n4 = 0; n4 < n3; ++n4) {
                        boolean bl4 = iterator.hasNext();
                        if (bl4) {
                            Object e7 = this.get(n4);
                            Object e12 = iterator.next();
                            bl4 = zzcz.zza(e7, e12);
                            if (bl4) {
                                continue;
                            }
                        }
                        break block10;
                    }
                    boolean bl5 = iterator.hasNext();
                    if (!bl5) {
                        return bl2;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.size();
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object e2 = this.get(i3);
            int n7 = e2.hashCode() + (n4 *= 31);
            n4 = ~(~n7);
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = -1;
        if (object == null) {
            return n3;
        }
        int n4 = this.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            Object e2 = this.get(i3);
            boolean bl2 = object.equals(e2);
            if (!bl2) continue;
            return i3;
        }
        return n3;
    }

    public /* synthetic */ Iterator iterator() {
        return this.zza();
    }

    public int lastIndexOf(Object object) {
        int n3 = -1;
        if (object == null) {
            return n3;
        }
        for (int i3 = this.size() + -1; i3 >= 0; i3 += -1) {
            Object e2 = this.get(i3);
            boolean bl2 = object.equals(e2);
            if (!bl2) continue;
            return i3;
        }
        return n3;
    }

    public /* synthetic */ ListIterator listIterator() {
        return (zzez)this.listIterator(0);
    }

    public /* synthetic */ ListIterator listIterator(int n3) {
        int n4 = this.size();
        zzde.zzb(n3, n4);
        n4 = (int)(this.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return zza;
        }
        zzed zzed2 = new zzed(this, n3);
        return zzed2;
    }

    public final Object remove(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final Object set(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public /* synthetic */ List subList(int n3, int n4) {
        return this.zza(n3, n4);
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

    public zzee zza(int n3, int n4) {
        int n7 = this.size();
        zzde.zza(n3, n4, n7);
        n7 = this.size();
        if ((n4 -= n3) == n7) {
            return this;
        }
        if (n4 == 0) {
            return zzep.zza;
        }
        zzeg zzeg2 = new zzeg(this, n3, n4);
        return zzeg2;
    }

    public final zzfa zza() {
        return (zzez)this.listIterator();
    }

    public final zzee zze() {
        return this;
    }
}

