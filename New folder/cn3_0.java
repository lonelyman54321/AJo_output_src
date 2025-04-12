/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cn3
 */
public final class cn3_0 {
    public static final ThreadLocal a;

    static {
        ThreadLocal threadLocal;
        a = threadLocal = new ThreadLocal();
    }

    public static jb0_2 a() {
        ThreadLocal threadLocal = a;
        jb0_2 jb0_22 = (jb0_2)threadLocal.get();
        if (jb0_22 == null) {
            Thread thread2 = Thread.currentThread();
            jb0_22 = new ly_2(thread2);
            threadLocal.set(jb0_22);
        }
        return jb0_22;
    }
}

