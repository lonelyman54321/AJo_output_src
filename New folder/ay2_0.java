/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;

/*
 * Renamed from ay2
 */
public final class ay2_0
implements Yx2 {
    public final Object a;
    public final Object b;

    public ay2_0(Wh0 wh0, Th0 th0) {
        this.a = wh0;
        this.b = th0;
    }

    public ay2_0(WorkDatabase workDatabase) {
        zx2_0 zx2_02;
        this.a = workDatabase;
        super(workDatabase);
        this.b = zx2_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Long a(String object) {
        Throwable throwable2;
        HP2 hP2;
        block3: {
            Long l2;
            block2: {
                int n3 = 1;
                hP2 = HP2.c(n3, "SELECT long_value FROM Preference where `key`=?");
                hP2.c0(n3, (String)object);
                object = (FP2)this.a;
                ((FP2)object).assertNotSuspendingTransaction();
                n3 = 0;
                Object var4_4 = null;
                object = Oh0.b((FP2)object, hP2, false);
                try {
                    boolean bl2 = object.moveToFirst();
                    l2 = null;
                    if (!bl2 || (bl2 = object.isNull(0))) break block2;
                    long l3 = object.getLong(0);
                    l2 = l3;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            object.close();
            hP2.release();
            return l2;
        }
        object.close();
        hP2.release();
        throw throwable2;
    }

    public void b(Wx2 wx2) {
        FP2 fP2 = (FP2)this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            Object object = this.b;
            object = (zx2_0)object;
            ((BA0)object).insert(wx2);
            fP2.setTransactionSuccessful();
            return;
        }
        finally {
            fP2.endTransaction();
        }
    }
}

