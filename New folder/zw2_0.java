/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zw2
 */
public class zw2_0
implements yw2 {
    public final Object[] a;
    public int b;

    public zw2_0(int n3) {
        if (n3 > 0) {
            Object[] objectArray = new Object[n3];
            this.a = objectArray;
            return;
        }
        String string2 = "The max pool size must be > 0".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public boolean a(Object object) {
        int n3;
        Object[] objectArray;
        int n4;
        int n7;
        String string2;
        block4: {
            string2 = "instance";
            Intrinsics.checkNotNullParameter(object, string2);
            n7 = this.b;
            n4 = 0;
            while (true) {
                objectArray = this.a;
                n3 = 1;
                if (n4 >= n7) break;
                Object object2 = objectArray[n4];
                if (object2 == object) {
                    n7 = 1;
                    break block4;
                }
                ++n4;
            }
            n7 = 0;
            string2 = null;
        }
        if ((n7 ^= n3) != 0) {
            n7 = this.b;
            n4 = objectArray.length;
            if (n7 < n4) {
                objectArray[n7] = object;
                this.b = n7 += n3;
                return n3 != 0;
            }
            return false;
        }
        string2 = "Already in the pool!".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public Object b() {
        int n3 = this.b;
        if (n3 > 0) {
            Object[] objectArray = this.a;
            Object object = objectArray[n3 += -1];
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            objectArray[n3] = null;
            this.b = n3 = this.b + -1;
            return object;
        }
        return null;
    }
}

