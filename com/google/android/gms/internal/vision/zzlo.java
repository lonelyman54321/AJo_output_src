/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzlg;
import com.google.android.gms.internal.vision.zzlh;
import com.google.android.gms.internal.vision.zzlp;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class zzlo
extends AbstractSet {
    private final /* synthetic */ zzlh zza;

    private zzlo(zzlh zzlh2) {
        this.zza = zzlh2;
    }

    public /* synthetic */ zzlo(zzlh zzlh2, zzlg zzlg2) {
        this(zzlh2);
    }

    public /* synthetic */ boolean add(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (!bl2) {
            zzlh zzlh2 = this.zza;
            Comparable comparable = (Comparable)object.getKey();
            object = object.getValue();
            zzlh2.zza(comparable, object);
            return true;
        }
        return false;
    }

    public void clear() {
        this.zza.clear();
    }

    public boolean contains(Object object) {
        boolean bl2;
        object = (Map.Entry)object;
        Object object2 = this.zza;
        Object k2 = object.getKey();
        return (object2 = ((zzlh)object2).get(k2)) == (object = object.getValue()) || object2 != null && (bl2 = object2.equals(object));
        {
        }
    }

    public Iterator iterator() {
        zzlh zzlh2 = this.zza;
        zzlp zzlp2 = new zzlp(zzlh2, null);
        return zzlp2;
    }

    public boolean remove(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (bl2) {
            zzlh zzlh2 = this.zza;
            object = object.getKey();
            zzlh2.remove(object);
            return true;
        }
        return false;
    }

    public int size() {
        return this.zza.size();
    }
}

