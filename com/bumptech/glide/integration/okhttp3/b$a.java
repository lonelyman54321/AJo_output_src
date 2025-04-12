/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.integration.okhttp3.b;

public final class b$a
implements CP1 {
    public static volatile x72_0 b;
    public final IJ$a a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b$a() {
        Object object;
        block6: {
            object = b;
            if (object == null) {
                object = b$a.class;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                x72_0 x72_02 = b;
                                if (x72_02 != null) break block4;
                                b = x72_02 = new x72_0();
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        object = b;
        this((x72_0)object);
    }

    public b$a(x72_0 x72_02) {
        this.a = x72_02;
    }

    public final BP1 c(OQ1 object) {
        x72_0 x72_02 = (x72_0)this.a;
        object = new b(x72_02);
        return object;
    }
}

