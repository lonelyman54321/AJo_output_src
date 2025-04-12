/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uh3
 */
public final class uh3_2
implements th3_1 {
    public final FP2 a;
    public final uh3$a b;
    public final uh3$b c;
    public final uh3$c d;

    public uh3_2(FP2 fP2) {
        n23 n232;
        this.a = fP2;
        super(fP2);
        this.b = n232;
        super(fP2);
        this.c = n232;
        super(fP2);
        this.d = n232;
    }

    public final void a(gI3 gI32) {
        Intrinsics.checkNotNullParameter(gI32, "id");
        String string2 = gI32.a;
        int n3 = gI32.b;
        this.g(n3, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList b() {
        Throwable throwable2;
        FP2 fP2;
        HP2 hP2;
        block3: {
            ArrayList<String> arrayList;
            Object var1_1 = null;
            hP2 = HP2.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
            fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            fP2 = Oh0.b(fP2, hP2, false);
            try {
                int n3 = fP2.getCount();
                arrayList = new ArrayList<String>(n3);
                while ((n3 = (int)(fP2.moveToNext() ? 1 : 0)) != 0) {
                    String string2 = fP2.getString(0);
                    arrayList.add(string2);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            fP2.close();
            hP2.release();
            return arrayList;
        }
        fP2.close();
        hP2.release();
        throw throwable2;
    }

    public final sh3_0 c(gI3 gI32) {
        Intrinsics.checkNotNullParameter(gI32, "id");
        String string2 = gI32.a;
        int n3 = gI32.b;
        return this.f(n3, string2);
    }

    public final void d(sh3_0 sh3_02) {
        FP2 fP2 = this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            uh3$a uh3$a = this.b;
            uh3$a.insert(sh3_02);
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
    public final void e(String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        uh3$c uh3$c;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            uh3$c = this.d;
            bg3_02 = uh3$c.acquire();
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
                        uh3$c.release(bg3_02);
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
        uh3$c.release(bg3_02);
        throw throwable2222222;
    }

    public final sh3_0 f(int n3, String string2) {
        Throwable throwable2;
        FP2 fP2;
        HP2 hP2;
        block12: {
            sh3_0 sh3_02;
            block11: {
                boolean bl2;
                block10: {
                    String string3;
                    int n4 = 2;
                    hP2 = HP2.c(n4, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                    int n7 = 1;
                    hP2.c0(n7, string2);
                    long l2 = n3;
                    hP2.m0(n4, l2);
                    fP2 = this.a;
                    fP2.assertNotSuspendingTransaction();
                    int n8 = 0;
                    fP2 = Oh0.b(fP2, hP2, false);
                    string2 = "work_spec_id";
                    try {
                        n8 = yf0.b((Cursor)fP2, string2);
                        string3 = "generation";
                    }
                    catch (Throwable throwable2) {}
                    n4 = yf0.b((Cursor)fP2, string3);
                    String string4 = "system_id";
                    n7 = yf0.b((Cursor)fP2, string4);
                    bl2 = fP2.moveToFirst();
                    if (!bl2) break block10;
                    string2 = fP2.getString(n8);
                    n4 = fP2.getInt(n4);
                    n7 = fP2.getInt(n7);
                    sh3_02 = new sh3_0(string2, n4, n7);
                    break block11;
                    break block12;
                }
                bl2 = false;
                sh3_02 = null;
            }
            fP2.close();
            hP2.release();
            return sh3_02;
        }
        fP2.close();
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
    public final void g(int n3, String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        uh3$b uh3$b;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            uh3$b = this.c;
            bg3_02 = uh3$b.acquire();
            int n4 = 1;
            bg3_02.c0(n4, string2);
            int n7 = 2;
            long l2 = n3;
            bg3_02.m0(n7, l2);
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
                        uh3$b.release(bg3_02);
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
        uh3$b.release(bg3_02);
        throw throwable2222222;
    }
}

