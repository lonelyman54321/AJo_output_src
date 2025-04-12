/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from iz0
 */
public final class iz0_2
extends Enum
implements uc2_2 {
    private static final /* synthetic */ iz0_2[] $VALUES;
    public static final /* enum */ iz0_2 INSTANCE;
    public static final /* enum */ iz0_2 NEVER;

    static {
        iz0_2 iz0_22;
        iz0_2 iz0_23;
        INSTANCE = iz0_23 = new iz0_2("INSTANCE", 0);
        int n3 = 1;
        NEVER = iz0_22 = new iz0_2("NEVER", n3);
        iz0_2[] iz0_2Array = new iz0_2[2];
        iz0_2Array[0] = iz0_23;
        iz0_2Array[n3] = iz0_22;
        $VALUES = iz0_2Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iz0_2() {
        void var2_-1;
        void var1_-1;
    }

    public static void complete(e62_0 e62_02) {
        iz0_2 iz0_22 = INSTANCE;
        e62_02.a(iz0_22);
        e62_02.onComplete();
    }

    public static void complete(h00_0 h00_02) {
        iz0_2 iz0_22 = INSTANCE;
        h00_02.a(iz0_22);
        h00_02.onComplete();
    }

    public static void complete(vk1_1 vk1_12) {
        iz0_2 iz0_22 = INSTANCE;
        vk1_12.a(iz0_22);
        vk1_12.onComplete();
        throw null;
    }

    public static void error(Throwable throwable, e62_0 e62_02) {
        iz0_2 iz0_22 = INSTANCE;
        e62_02.a(iz0_22);
        e62_02.onError(throwable);
    }

    public static void error(Throwable throwable, h00_0 h00_02) {
        iz0_2 iz0_22 = INSTANCE;
        h00_02.a(iz0_22);
        h00_02.onError(throwable);
    }

    public static void error(Throwable throwable, t53_0 t53_02) {
        iz0_2 iz0_22 = INSTANCE;
        t53_02.a(iz0_22);
        t53_02.onError(throwable);
    }

    public static void error(Throwable throwable, vk1_1 vk1_12) {
        iz0_2 iz0_22 = INSTANCE;
        vk1_12.a(iz0_22);
        vk1_12.onError(throwable);
        throw null;
    }

    public static iz0_2 valueOf(String string2) {
        return Enum.valueOf(iz0_2.class, string2);
    }

    public static iz0_2[] values() {
        return (iz0_2[])$VALUES.clone();
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        boolean bl2;
        iz0_2 iz0_22 = INSTANCE;
        if (this == iz0_22) {
            bl2 = true;
        } else {
            bl2 = false;
            iz0_22 = null;
        }
        return bl2;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object object) {
        object = new UnsupportedOperationException("Should not be called!");
        throw object;
    }

    public boolean offer(Object object, Object object2) {
        object = new UnsupportedOperationException("Should not be called!");
        throw object;
    }

    public Object poll() {
        return null;
    }

    public int requestFusion(int n3) {
        return n3 & 2;
    }
}

