/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xI3
 */
public final class xi3_1
implements wi3_0 {
    public final FP2 a;
    public final xI3$a b;
    public final xI3$b c;
    public final xI3$c d;

    public xi3_1(FP2 fP2) {
        n23 n232;
        this.a = fP2;
        super(fP2);
        this.b = n232;
        super(fP2);
        this.c = n232;
        super(fP2);
        this.d = n232;
    }

    public final void a(vi3_0 vi3_02) {
        FP2 fP2 = this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            xI3$a xI3$a = this.b;
            xI3$a.insert(vi3_02);
            fP2.setTransactionSuccessful();
            return;
        }
        finally {
            fP2.endTransaction();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void delete(String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        xI3$b xI3$b;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            xI3$b = this.c;
            bg3_02 = xI3$b.acquire();
            int n3 = 1;
            bg3_02.c0(n3, string2);
            fP2.beginTransaction();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    bg3_02.q();
                    fP2.setTransactionSuccessful();
                    {
                        fP2.endTransaction();
                        xI3$b.release(bg3_02);
                        return;
                    }
                }
                catch (Throwable throwable3) {}
                {
                    fP2.endTransaction();
                    throw throwable3;
                }
            }
        }
        xI3$b.release(bg3_02);
        throw throwable2222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void deleteAll() {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        xI3$c xI3$c;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            xI3$c = this.d;
            bg3_02 = xI3$c.acquire();
            fP2.beginTransaction();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    bg3_02.q();
                    fP2.setTransactionSuccessful();
                    {
                        fP2.endTransaction();
                        xI3$c.release(bg3_02);
                        return;
                    }
                }
                catch (Throwable throwable3) {}
                {
                    fP2.endTransaction();
                    throw throwable3;
                }
            }
        }
        xI3$c.release(bg3_02);
        throw throwable2222222;
    }
}

