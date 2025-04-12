/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MI3
 */
public final class mi3_0
implements LI3 {
    public final FP2 a;
    public final MI3$a b;
    public final MI3$b c;

    public mi3_0(FP2 fP2) {
        n23 n232;
        this.a = fP2;
        super(fP2);
        this.b = n232;
        super(fP2);
        this.c = n232;
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
            hP2 = HP2.c(n3, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        MI3$b mI3$b;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            mI3$b = this.c;
            bg3_02 = mI3$b.acquire();
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
                        mI3$b.release(bg3_02);
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
        mI3$b.release(bg3_02);
        throw throwable2222222;
    }

    public final void c(String string2, Set object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "id");
        String string3 = "tags";
        Intrinsics.checkNotNullParameter(object, string3);
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            string3 = (String)object.next();
            KI3 kI3 = new KI3(string3, string2);
            this.d(kI3);
        }
    }

    public final void d(KI3 kI3) {
        FP2 fP2 = this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            MI3$a mI3$a = this.b;
            mI3$a.insert(kI3);
            fP2.setTransactionSuccessful();
            return;
        }
        finally {
            fP2.endTransaction();
        }
    }
}

