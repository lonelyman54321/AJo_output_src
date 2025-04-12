/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/*
 * Renamed from Vq2
 */
public class vq2_0
extends tq2_0
implements KMutableIterator {
    public final Uq2 d;
    public Object e;
    public boolean f;
    public int g;

    public vq2_0(Uq2 uq2, is3_0[] is3_0Array) {
        int n3;
        hs3_0 hs3_02 = uq2.c;
        super(hs3_02, is3_0Array);
        this.d = uq2;
        this.g = n3 = uq2.e;
    }

    public final void d(int n3, hs3_0 objectArray, Object object, int n4) {
        int n7 = n4 * 5;
        int n8 = 30;
        Object object2 = this.a;
        if (n7 > n8) {
            Object object3 = object2[n4];
            objectArray = objectArray.d;
            n7 = objectArray.length;
            n8 = 0;
            ((is3_0)object3).a(objectArray, n7, 0);
            while (true) {
                int n10;
                object3 = object2[n4];
                objectArray = ((is3_0)object3).a;
                n3 = ((is3_0)object3).c;
                object3 = objectArray[n3];
                if ((n3 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0)) != 0) break;
                object3 = object2[n4];
                ((is3_0)object3).c = n10 = ((is3_0)object3).c + 2;
            }
            this.b = n4;
            return;
        }
        n7 = ls3_0.d(n3, n7);
        n8 = 1;
        boolean bl2 = objectArray.h(n7 = n8 << n7);
        if (bl2) {
            n3 = objectArray.f(n7);
            object = object2[n4];
            Object[] objectArray2 = objectArray.d;
            int n14 = Integer.bitCount(objectArray.a) * 2;
            ((is3_0)object).a(objectArray2, n14, n3);
            this.b = n4;
            return;
        }
        n7 = objectArray.t(n7);
        hs3_0 hs3_02 = objectArray.s(n7);
        object2 = object2[n4];
        Object[] objectArray3 = objectArray.d;
        int n15 = Integer.bitCount(objectArray.a) * 2;
        ((is3_0)object2).a(objectArray3, n15, n7);
        this.d(n3, hs3_02, object, n4 += n8);
    }

    public final Object next() {
        Object object = this.d;
        int n3 = object.e;
        int n4 = this.g;
        if (n3 == n4) {
            n3 = (int)(this.c ? 1 : 0);
            if (n3 != 0) {
                object = this.a;
                n4 = this.b;
                object = object[n4];
                Object[] objectArray = object.a;
                n3 = object.c;
                this.e = object = objectArray[n3];
                this.f = true;
                return super.next();
            }
            object = new NoSuchElementException();
            throw object;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void remove() {
        int n3 = this.f;
        if (n3 == 0) {
            IllegalStateException illegalStateException = new IllegalStateException();
            throw illegalStateException;
        }
        n3 = this.c;
        Uq2 uq2 = this.d;
        if (n3 != 0) {
            if (n3 == 0) {
                NoSuchElementException noSuchElementException = new NoSuchElementException();
                throw noSuchElementException;
            }
            Object object = this.a;
            int n4 = this.b;
            object = object[n4];
            Object[] objectArray = ((is3_0)object).a;
            n3 = ((is3_0)object).c;
            object = objectArray[n3];
            Object object2 = this.e;
            Object object3 = TypeIntrinsics.asMutableMap(uq2);
            object3.remove(object2);
            if (object != null) {
                n4 = object.hashCode();
            } else {
                n4 = 0;
                Object var5_10 = null;
            }
            object3 = uq2.c;
            this.d(n4, (hs3_0)object3, object, 0);
        } else {
            Object object = this.e;
            Map map2 = TypeIntrinsics.asMutableMap(uq2);
            map2.remove(object);
        }
        this.e = null;
        this.f = false;
        this.g = n3 = uq2.e;
    }
}

