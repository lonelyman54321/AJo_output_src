/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.i;
import androidx.navigation.j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class j$a
implements Iterator,
KMutableIterator {
    public int a = -1;
    public boolean b;
    public final /* synthetic */ j c;

    public j$a(j j3) {
        this.c = j3;
    }

    public final boolean hasNext() {
        int n3 = this.a;
        int n4 = 1;
        ca3 ca32 = this.c.k;
        int n7 = ca32.j();
        if ((n3 += n4) >= n7) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final Object next() {
        int n3 = (int)(this.hasNext() ? 1 : 0);
        if (n3 != 0) {
            int n4;
            n3 = 1;
            this.b = n3;
            ca3 ca32 = this.c.k;
            this.a = n4 = this.a + n3;
            return (i)ca32.k(n4);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        boolean bl2 = this.b;
        if (bl2) {
            ca3 ca32 = this.c.k;
            int n3 = this.a;
            i i3 = (i)ca32.k(n3);
            boolean bl3 = false;
            i3.b = null;
            Object[] objectArray = ca32.c;
            n3 = this.a;
            Object object = objectArray[n3];
            Object object2 = da3_0.a;
            if (object != object2) {
                objectArray[n3] = object2;
                ca32.a = bl3 = true;
            }
            this.a = n3 += -1;
            this.b = false;
            return;
        }
        String string2 = "You must call next() before you can remove an element".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

