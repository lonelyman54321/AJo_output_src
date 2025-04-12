/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class II3
implements Callable {
    public final /* synthetic */ HP2 a;
    public final /* synthetic */ hi3_0 b;

    public II3(hi3_0 hi3_02, HP2 hP2) {
        this.b = hi3_02;
        this.a = hP2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Throwable throwable2;
        FP2 fP2;
        block5: {
            Object object;
            block4: {
                block3: {
                    fP2 = this.b.a;
                    object = this.a;
                    boolean bl2 = false;
                    fP2 = Oh0.b(fP2, (ag3_0)object, false);
                    try {
                        int n3 = fP2.moveToFirst();
                        if (n3 == 0) break block3;
                        n3 = fP2.getInt(0);
                        if (n3 != 0) {
                            bl2 = true;
                        }
                        object = bl2;
                        break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = Boolean.FALSE;
            }
            fP2.close();
            return object;
        }
        fP2.close();
        throw throwable2;
    }

    public final void finalize() {
        this.a.release();
    }
}

