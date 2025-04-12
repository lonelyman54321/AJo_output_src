/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from jd3$a
 */
public final class jd3$a_0 {
    public final jd3_1 a() {
        jd3_1 jd3_12;
        block8: {
            jd3_12 = jd3_1.b;
            if (jd3_12 == null) {
                synchronized (this) {
                    Throwable throwable2;
                    block7: {
                        block6: {
                            try {
                                jd3_12 = jd3_1.b;
                                if (jd3_12 != null) break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                            jd3_1.b = jd3_12 = new Object();
                        }
                        break block8;
                    }
                    throw throwable2;
                }
            }
        }
        return jd3_12;
    }
}

