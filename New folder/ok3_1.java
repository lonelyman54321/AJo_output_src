/*
 * Decompiled with CFR 0.152.
 */
import sun.misc.Unsafe;

/*
 * Renamed from OK3
 */
public final class ok3_1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object object, long l2, Object object2, Object object3) {
        Object object4;
        do {
            boolean bl2;
            if (!(bl2 = unsafe.compareAndSwapObject(object, l2, object2, object3))) continue;
            return true;
        } while ((object4 = unsafe.getObject(object, l2)) == object2);
        return false;
    }
}

