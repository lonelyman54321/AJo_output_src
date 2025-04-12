/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class bp0
implements ap0 {
    public final FP2 a;
    public final bp0$a b;

    public bp0(FP2 fP2) {
        bp0$a a2;
        this.a = fP2;
        super(fP2);
        this.b = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList a(String object) {
        Throwable throwable2;
        HP2 hP2;
        block3: {
            ArrayList<String> arrayList;
            int n3 = 1;
            hP2 = HP2.c(n3, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
            hP2.c0(n3, (String)object);
            object = this.a;
            ((FP2)object).assertNotSuspendingTransaction();
            n3 = 0;
            Object var4_4 = null;
            object = Oh0.b((FP2)object, hP2, false);
            try {
                int n4 = object.getCount();
                arrayList = new ArrayList<String>(n4);
                while ((n4 = (int)(object.moveToNext() ? 1 : 0)) != 0) {
                    String string2 = object.getString(0);
                    arrayList.add(string2);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object.close();
            hP2.release();
            return arrayList;
        }
        object.close();
        hP2.release();
        throw throwable2;
    }

    public final boolean b(String object) {
        Throwable throwable2;
        HP2 hP2;
        block5: {
            int n3;
            block4: {
                int n4;
                int n7 = 1;
                hP2 = HP2.c(n7, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                hP2.c0(n7, (String)object);
                object = this.a;
                ((FP2)object).assertNotSuspendingTransaction();
                n3 = 0;
                object = Oh0.b((FP2)object, hP2, false);
                try {
                    n4 = object.moveToFirst();
                    if (n4 == 0) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                n4 = object.getInt(0);
                if (n4 == 0) {
                    n7 = 0;
                    Object var6_6 = null;
                }
                n3 = n7;
            }
            object.close();
            hP2.release();
            return n3 != 0;
        }
        object.close();
        hP2.release();
        throw throwable2;
    }

    public final void c(Yo0 yo0) {
        FP2 fP2 = this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            bp0$a bp0$a = this.b;
            bp0$a.insert(yo0);
            fP2.setTransactionSuccessful();
            return;
        }
        finally {
            fP2.endTransaction();
        }
    }

    public final boolean d(String object) {
        Throwable throwable2;
        HP2 hP2;
        block5: {
            int n3;
            block4: {
                int n4;
                int n7 = 1;
                hP2 = HP2.c(n7, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                hP2.c0(n7, (String)object);
                object = this.a;
                ((FP2)object).assertNotSuspendingTransaction();
                n3 = 0;
                object = Oh0.b((FP2)object, hP2, false);
                try {
                    n4 = object.moveToFirst();
                    if (n4 == 0) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                n4 = object.getInt(0);
                if (n4 == 0) {
                    n7 = 0;
                    Object var6_6 = null;
                }
                n3 = n7;
            }
            object.close();
            hP2.release();
            return n3 != 0;
        }
        object.close();
        hP2.release();
        throw throwable2;
    }
}

