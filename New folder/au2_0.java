/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.g;
import androidx.media3.exoplayer.source.s;
import java.util.Collection;
import java.util.HashMap;

/*
 * Renamed from Au2
 */
public final class au2_0
extends H0 {
    public final int f;
    public final int g;
    public final int[] h;
    public final int[] i;
    public final g[] j;
    public final Object[] k;
    public final HashMap l;

    public au2_0(Collection object, s s7) {
        int n3;
        int n4 = object.size();
        g[] gArray = new g[n4];
        Object[] objectArray = object.iterator();
        int n7 = 0;
        int n8 = 0;
        Object object2 = null;
        while ((n3 = objectArray.hasNext()) != 0) {
            Object object3 = (sN1)objectArray.next();
            int n10 = n8 + 1;
            gArray[n8] = object3 = object3.a();
            n8 = n10;
        }
        int n14 = object.size();
        objectArray = new Object[n14];
        object = object.iterator();
        while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (sN1)object.next();
            n3 = n7 + 1;
            objectArray[n7] = object2 = object2.getUid();
            n7 = n3;
        }
        this(gArray, objectArray, s7);
    }

    public au2_0(g[] gArray, Object[] objectArray, s hashMap) {
        super(false, (s)((Object)hashMap));
        int n3 = gArray.length;
        this.j = gArray;
        int[] nArray = new int[n3];
        this.h = nArray;
        hashMap = (HashMap)new int[n3];
        this.i = (int[])hashMap;
        this.k = objectArray;
        this.l = hashMap = new HashMap();
        n3 = gArray.length;
        int n4 = 0;
        nArray = null;
        int n7 = 0;
        int n8 = 0;
        Integer n10 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = gArray[i3];
            this.j[n8] = object;
            this.i[n8] = n4;
            this.h[n8] = n7;
            int n14 = ((g)object).p();
            n4 += n14;
            n14 = this.j[n8].i();
            n7 += n14;
            object = this.l;
            Object object2 = objectArray[n8];
            int n15 = n8 + 1;
            n10 = n8;
            ((HashMap)object).put(object2, n10);
            n8 = n15;
        }
        this.f = n4;
        this.g = n7;
    }

    public final int i() {
        return this.g;
    }

    public final int p() {
        return this.f;
    }

    public final int r(Object object) {
        HashMap hashMap = this.l;
        int n3 = (object = (Integer)hashMap.get(object)) == null ? -1 : (Integer)object;
        return n3;
    }

    public final int s(int n3) {
        return gz3.c(this.h, ++n3, false, false);
    }

    public final int t(int n3) {
        return gz3.c(this.i, ++n3, false, false);
    }

    public final Object u(int n3) {
        return this.k[n3];
    }

    public final int v(int n3) {
        return this.h[n3];
    }

    public final int w(int n3) {
        return this.i[n3];
    }

    public final g z(int n3) {
        return this.j[n3];
    }
}

