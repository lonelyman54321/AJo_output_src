/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xz0
 */
public final class xz0_2
extends Enum
implements gc2_2 {
    private static final /* synthetic */ xz0_2[] $VALUES;
    public static final /* enum */ xz0_2 INSTANCE;

    static {
        xz0_2 xz0_22;
        INSTANCE = xz0_22 = new xz0_2("INSTANCE", 0);
        xz0_2[] xz0_2Array = new xz0_2[]{xz0_22};
        $VALUES = xz0_2Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xz0_2() {
        void var2_-1;
        void var1_-1;
    }

    public static void complete(df3_2 df3_22) {
        xz0_2 xz0_22 = INSTANCE;
        df3_22.a(xz0_22);
        df3_22.onComplete();
    }

    public static void error(Throwable throwable, df3_2 df3_22) {
        xz0_2 xz0_22 = INSTANCE;
        df3_22.a(xz0_22);
        df3_22.onError(throwable);
    }

    public static xz0_2 valueOf(String string2) {
        return Enum.valueOf(xz0_2.class, string2);
    }

    public static xz0_2[] values() {
        return (xz0_2[])$VALUES.clone();
    }

    public void cancel() {
    }

    public void clear() {
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

    public void request(long l2) {
        gf3_2.validate(l2);
    }

    public int requestFusion(int n3) {
        return n3 & 2;
    }

    public String toString() {
        return "EmptySubscription";
    }
}

