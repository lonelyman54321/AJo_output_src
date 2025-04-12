/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from uI3
 */
public final class ui3_0
implements tI3 {
    public final FP2 a;
    public final ui3$a_0 b;

    public ui3_0(FP2 fP2) {
        ui3$a_0 a_02;
        this.a = fP2;
        super(fP2);
        this.b = a_02;
    }

    public final void a(si3_0 si3_02) {
        FP2 fP2 = this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            ui3$a_0 ui3$a_0 = this.b;
            ui3$a_0.insert(si3_02);
            fP2.setTransactionSuccessful();
            return;
        }
        finally {
            fP2.endTransaction();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList b(String object) {
        Throwable throwable2;
        HP2 hP2;
        block3: {
            ArrayList<String> arrayList;
            int n3 = 1;
            hP2 = HP2.c(n3, "SELECT name FROM workname WHERE work_spec_id=?");
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
}

