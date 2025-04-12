/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableMap$Entry;

/*
 * Renamed from ER1
 */
public final class er1_1
extends SG1
implements KMutableMap$Entry {
    public final xq2_0 c;
    public Object d;

    public er1_1(xq2_0 xq2_02, Object object, Object object2) {
        super(object, object2);
        this.c = xq2_02;
        this.d = object2;
    }

    public final Object getValue() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object setValue(Object object) {
        int n3;
        Object object2 = this.d;
        this.d = object;
        vq2_0 vq2_02 = this.c.a;
        Uq2 uq2 = vq2_02.d;
        Object object3 = this.a;
        int n4 = uq2.containsKey(object3);
        if (n4 == 0) {
            return object2;
        }
        n4 = vq2_02.c;
        if (n4 != 0) {
            int n7;
            if (n4 == 0) {
                object = new NoSuchElementException();
                throw object;
            }
            Object object4 = vq2_02.a;
            int n8 = vq2_02.b;
            object4 = object4[n8];
            Object[] objectArray = ((is3_0)object4).a;
            n4 = ((is3_0)object4).c;
            object4 = objectArray[n4];
            uq2.put(object3, object);
            n3 = 0;
            object = null;
            if (object4 != null) {
                n7 = object4.hashCode();
            } else {
                n7 = 0;
                object3 = null;
            }
            hs3_0 hs3_02 = uq2.c;
            vq2_02.d(n7, hs3_02, object4, 0);
        } else {
            uq2.put(object3, object);
        }
        vq2_02.g = n3 = uq2.e;
        return object2;
    }
}

