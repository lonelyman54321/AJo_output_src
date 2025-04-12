/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AX2
 */
public final class ax2_2 {
    public static final vx2_2 a;
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int n3;
        vx2_2 vx2_22;
        Object[] objectArray = new byte[]{};
        AtomicReference atomicReference = null;
        Object object = vx2_22;
        a = vx2_22 = new vx2_2((byte[])objectArray, 0, 0, false, false);
        object = Runtime.getRuntime();
        b = n3 = Integer.highestOneBit(((Runtime)object).availableProcessors() * 2 + -1);
        objectArray = new AtomicReference[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            atomicReference = new AtomicReference();
            objectArray[i3] = (byte)atomicReference;
        }
        c = (AtomicReference[])objectArray;
    }

    public static final void a(vx2_2 object) {
        Intrinsics.checkNotNullParameter(object, "segment");
        Object object2 = ((vx2_2)object).f;
        if (object2 == null && (object2 = ((vx2_2)object).g) == null) {
            int n3;
            boolean bl2 = ((vx2_2)object).d;
            if (bl2) {
                return;
            }
            long l2 = Thread.currentThread().getId();
            int n4 = b;
            long l3 = n4;
            long l4 = 1L;
            int n7 = (int)(l2 &= (l3 -= l4));
            object2 = c[n7];
            vx2_2 vx2_22 = a;
            vx2_2 vx2_23 = ((AtomicReference)object2).getAndSet(vx2_22);
            if (vx2_23 == vx2_22) {
                return;
            }
            n7 = 0;
            vx2_22 = null;
            int n8 = vx2_23 != null ? vx2_23.c : 0;
            if (n8 >= (n3 = 65536)) {
                ((AtomicReference)object2).set(vx2_23);
                return;
            }
            ((vx2_2)object).f = vx2_23;
            ((vx2_2)object).b = 0;
            ((vx2_2)object).c = n8 += 8192;
            ((AtomicReference)object2).set(object);
            return;
        }
        object2 = "Failed requirement.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static final vx2_2 b() {
        long l2 = Thread.currentThread().getId();
        int n3 = b;
        long l3 = n3;
        long l4 = 1L;
        int n4 = (int)(l2 &= (l3 -= l4));
        Object object = c[n4];
        vx2_2 vx2_22 = a;
        vx2_2 vx2_23 = ((AtomicReference)object).getAndSet(vx2_22);
        if (vx2_23 == vx2_22) {
            object = new vx2_2();
            return object;
        }
        n4 = 0;
        vx2_22 = null;
        if (vx2_23 == null) {
            ((AtomicReference)object).set(null);
            object = new vx2_2();
            return object;
        }
        vx2_2 vx2_24 = vx2_23.f;
        ((AtomicReference)object).set(vx2_24);
        vx2_23.f = null;
        vx2_23.c = 0;
        return vx2_23;
    }
}

