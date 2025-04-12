/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import androidx.room.a;
import androidx.work.b;
import androidx.work.b$b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HI3
 */
public final class hi3_0
implements FI3 {
    public final FP2 a;
    public final HI3$i b;
    public final HI3$j c;
    public final HI3$k d;
    public final HI3$l e;
    public final HI3$m f;
    public final HI3$n g;
    public final HI3$o h;
    public final HI3$p i;
    public final HI3$q j;
    public final hi3$a_0 k;
    public final HI3$c l;
    public final HI3$d m;
    public final HI3$e n;
    public final HI3$h o;

    public hi3_0(FP2 fP2) {
        n23 n232;
        this.a = fP2;
        super(fP2);
        this.b = n232;
        super(fP2);
        this.c = n232;
        super(fP2);
        this.d = n232;
        super(fP2);
        this.e = n232;
        super(fP2);
        this.f = n232;
        super(fP2);
        this.g = n232;
        super(fP2);
        this.h = n232;
        super(fP2);
        this.i = n232;
        super(fP2);
        this.j = n232;
        super(fP2);
        this.k = n232;
        super(fP2);
        super(fP2);
        this.l = n232;
        super(fP2);
        this.m = n232;
        super(fP2);
        this.n = n232;
        super(fP2);
        super(fP2);
        super(fP2);
        this.o = n232;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int A(String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$q hI3$q;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$q = this.j;
            bg3_02 = hI3$q.acquire();
            int n3 = 1;
            bg3_02.c0(n3, string2);
            fP2.beginTransaction();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    int n4 = bg3_02.q();
                    fP2.setTransactionSuccessful();
                    {
                        fP2.endTransaction();
                        hI3$q.release(bg3_02);
                        return n4;
                    }
                }
                catch (Throwable throwable3) {}
                {
                    fP2.endTransaction();
                    throw throwable3;
                }
            }
        }
        hI3$q.release(bg3_02);
        throw throwable2222222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int B() {
        Throwable throwable2;
        FP2 fP2;
        HP2 hP2;
        block3: {
            int n3;
            block2: {
                n3 = 0;
                Object var2_2 = null;
                hP2 = HP2.c(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                fP2 = this.a;
                fP2.assertNotSuspendingTransaction();
                fP2 = Oh0.b(fP2, hP2, false);
                try {
                    boolean bl2 = fP2.moveToFirst();
                    if (!bl2) break block2;
                    n3 = fP2.getInt(0);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            fP2.close();
            hP2.release();
            return n3;
        }
        fP2.close();
        hP2.release();
        throw throwable2;
    }

    public final void C(HashMap hashMap) {
        Throwable throwable2;
        Set set;
        block15: {
            block14: {
                Object object;
                int n3;
                Object object2;
                int n4;
                block13: {
                    boolean bl2;
                    int n7;
                    set = hashMap.keySet();
                    n4 = set.isEmpty();
                    if (n4 != 0) {
                        return;
                    }
                    n4 = hashMap.size();
                    if (n4 > (n7 = 999)) {
                        set = new gi3_0(this);
                        q1_0.a(hashMap, (Function1)((Object)set));
                        return;
                    }
                    Object object3 = Ex0.a("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
                    n7 = set.size();
                    te3_0.a((StringBuilder)object3, n7);
                    object2 = ")";
                    ((StringBuilder)object3).append((String)object2);
                    object3 = ((StringBuilder)object3).toString();
                    object3 = HP2.c(n7, (String)object3);
                    set = set.iterator();
                    n7 = 1;
                    n3 = 1;
                    while (bl2 = set.hasNext()) {
                        object = (String)set.next();
                        ((HP2)object3).c0(n3, (String)object);
                        n3 += n7;
                    }
                    set = this.a;
                    n7 = 0;
                    set = Oh0.b((FP2)((Object)set), (ag3_0)object3, false);
                    object3 = "work_spec_id";
                    try {
                        n4 = yf0.a((Cursor)set, (String)object3);
                        n3 = -1;
                        if (n4 != n3) break block13;
                    }
                    catch (Throwable throwable2) {}
                    set.close();
                    return;
                }
                while (true) {
                    n3 = (int)(set.moveToNext() ? 1 : 0);
                    if (n3 == 0) break block14;
                    break;
                }
                {
                    object2 = set.getString(n4);
                    object2 = hashMap.get(object2);
                    if ((object2 = (ArrayList)object2) == null) continue;
                    object = set.getBlob(0);
                    object = androidx.work.b.a((byte[])object);
                    ((ArrayList)object2).add(object);
                    continue;
                }
                break block15;
            }
            set.close();
            return;
        }
        set.close();
        throw throwable2;
    }

    public final void D(HashMap hashMap) {
        Throwable throwable2;
        Set set;
        block14: {
            block13: {
                String string2;
                int n3;
                Object object;
                int n4;
                block12: {
                    boolean bl2;
                    int n7;
                    set = hashMap.keySet();
                    n4 = set.isEmpty();
                    if (n4 != 0) {
                        return;
                    }
                    n4 = hashMap.size();
                    if (n4 > (n7 = 999)) {
                        set = new fd3_1(this, 1);
                        q1_0.a(hashMap, (Function1)((Object)set));
                        return;
                    }
                    Object object2 = Ex0.a("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
                    n7 = set.size();
                    te3_0.a((StringBuilder)object2, n7);
                    object = ")";
                    ((StringBuilder)object2).append((String)object);
                    object2 = ((StringBuilder)object2).toString();
                    object2 = HP2.c(n7, (String)object2);
                    set = set.iterator();
                    n7 = 1;
                    n3 = 1;
                    while (bl2 = set.hasNext()) {
                        string2 = (String)set.next();
                        ((HP2)object2).c0(n3, string2);
                        n3 += n7;
                    }
                    set = this.a;
                    n7 = 0;
                    set = Oh0.b((FP2)((Object)set), (ag3_0)object2, false);
                    object2 = "work_spec_id";
                    try {
                        n4 = yf0.a((Cursor)set, (String)object2);
                        n3 = -1;
                        if (n4 != n3) break block12;
                    }
                    catch (Throwable throwable2) {}
                    set.close();
                    return;
                }
                while (true) {
                    n3 = (int)(set.moveToNext() ? 1 : 0);
                    if (n3 == 0) break block13;
                    break;
                }
                {
                    object = set.getString(n4);
                    object = hashMap.get(object);
                    if ((object = (ArrayList)object) == null) continue;
                    string2 = set.getString(0);
                    ((ArrayList)object).add(string2);
                    continue;
                }
                break block14;
            }
            set.close();
            return;
        }
        set.close();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$n hI3$n;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$n = this.g;
            bg3_02 = hI3$n.acquire();
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
                        hI3$n.release(bg3_02);
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
        hI3$n.release(bg3_02);
        throw throwable2222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int b(long l2, String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$d hI3$d;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$d = this.m;
            bg3_02 = hI3$d.acquire();
            int n3 = 1;
            bg3_02.m0(n3, l2);
            int n4 = 2;
            bg3_02.c0(n4, string2);
            fP2.beginTransaction();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    n4 = bg3_02.q();
                    fP2.setTransactionSuccessful();
                    {
                        fP2.endTransaction();
                        hI3$d.release(bg3_02);
                        return n4;
                    }
                }
                catch (Throwable throwable3) {}
                {
                    fP2.endTransaction();
                    throw throwable3;
                }
            }
        }
        hI3$d.release(bg3_02);
        throw throwable2222222;
    }

    public final ArrayList c(long l2) {
        int n3 = 1;
        ArrayList<Object> arrayList = HP2.c(n3, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        ((HP2)((Object)arrayList)).m0(n3, l2);
        Object object = this;
        Object object2 = this.a;
        ((FP2)object2).assertNotSuspendingTransaction();
        int n4 = 0;
        String string2 = null;
        Cursor cursor = Oh0.b((FP2)object2, (ag3_0)((Object)arrayList), false);
        object2 = "id";
        try {
            int n7 = yf0.b(cursor, (String)object2);
            String string3 = "state";
            int n8 = yf0.b(cursor, string3);
            String string4 = "worker_class_name";
            int n10 = yf0.b(cursor, string4);
            String string5 = "input_merger_class_name";
            int n14 = yf0.b(cursor, string5);
            String string6 = "input";
            int n15 = yf0.b(cursor, string6);
            String string7 = "output";
            int n16 = yf0.b(cursor, string7);
            String string8 = "initial_delay";
            int n17 = yf0.b(cursor, string8);
            String string9 = "interval_duration";
            int n18 = yf0.b(cursor, string9);
            String string10 = "flex_duration";
            int n19 = yf0.b(cursor, string10);
            String string11 = "run_attempt_count";
            int n20 = yf0.b(cursor, string11);
            String string12 = "backoff_policy";
            int n21 = yf0.b(cursor, string12);
            String string13 = "backoff_delay_duration";
            n3 = yf0.b(cursor, string13);
            string2 = "last_enqueue_time";
            n4 = yf0.b(cursor, string2);
            object = "minimum_retention_duration";
            int n22 = yf0.b(cursor, (String)object);
            return n22;
        }
        finally {
            HP2 hP2 = arrayList;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int d(hI3$b hI3$b, String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$l hI3$l;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$l = this.e;
            bg3_02 = hI3$l.acquire();
            long l2 = NI3.i(hI3$b);
            bg3_02.m0(1, l2);
            int n3 = 2;
            bg3_02.c0(n3, string2);
            fP2.beginTransaction();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    n3 = bg3_02.q();
                    fP2.setTransactionSuccessful();
                    {
                        fP2.endTransaction();
                        hI3$l.release(bg3_02);
                        return n3;
                    }
                }
                catch (Throwable throwable3) {}
                {
                    fP2.endTransaction();
                    throw throwable3;
                }
            }
        }
        hI3$l.release(bg3_02);
        throw throwable2222222;
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
        HI3$k hI3$k;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$k = this.d;
            bg3_02 = hI3$k.acquire();
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
                        hI3$k.release(bg3_02);
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
        hI3$k.release(bg3_02);
        throw throwable2222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(int n3, String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$c hI3$c;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$c = this.l;
            bg3_02 = hI3$c.acquire();
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
                        hI3$c.release(bg3_02);
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
        hI3$c.release(bg3_02);
        throw throwable2222222;
    }

    public final ArrayList f() {
        int n3 = 0;
        String string2 = null;
        ArrayList<Object> arrayList = HP2.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        Object object = this;
        Object object2 = this.a;
        ((FP2)object2).assertNotSuspendingTransaction();
        Cursor cursor = Oh0.b((FP2)object2, (ag3_0)((Object)arrayList), false);
        object2 = "id";
        try {
            int n4 = yf0.b(cursor, (String)object2);
            String string3 = "state";
            int n7 = yf0.b(cursor, string3);
            String string4 = "worker_class_name";
            int n8 = yf0.b(cursor, string4);
            String string5 = "input_merger_class_name";
            int n10 = yf0.b(cursor, string5);
            String string6 = "input";
            int n14 = yf0.b(cursor, string6);
            String string7 = "output";
            int n15 = yf0.b(cursor, string7);
            String string8 = "initial_delay";
            int n16 = yf0.b(cursor, string8);
            String string9 = "interval_duration";
            int n17 = yf0.b(cursor, string9);
            String string10 = "flex_duration";
            int n18 = yf0.b(cursor, string10);
            String string11 = "run_attempt_count";
            int n19 = yf0.b(cursor, string11);
            String string12 = "backoff_policy";
            int n20 = yf0.b(cursor, string12);
            String string13 = "backoff_delay_duration";
            int n21 = yf0.b(cursor, string13);
            string2 = "last_enqueue_time";
            n3 = yf0.b(cursor, string2);
            object = "minimum_retention_duration";
            int n22 = yf0.b(cursor, (String)object);
            return n22;
        }
        finally {
            HP2 hP2 = arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList g(String object) {
        Throwable throwable2;
        HP2 hP2;
        block3: {
            ArrayList<String> arrayList;
            int n3 = 1;
            hP2 = HP2.c(n3, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hI3$b h(String object) {
        Throwable throwable2;
        HP2 hP2;
        block5: {
            hI3$b hI3$b;
            block4: {
                int n3 = 1;
                hP2 = HP2.c(n3, "SELECT state FROM workspec WHERE id=?");
                hP2.c0(n3, (String)object);
                object = this.a;
                ((FP2)object).assertNotSuspendingTransaction();
                n3 = 0;
                Integer n4 = null;
                object = Oh0.b((FP2)object, hP2, false);
                try {
                    boolean bl2 = object.moveToFirst();
                    hI3$b = null;
                    if (!bl2) break block4;
                    bl2 = object.isNull(0);
                    if (bl2) {
                        n3 = 0;
                        n4 = null;
                    } else {
                        n3 = object.getInt(0);
                        n4 = n3;
                    }
                    if (n4 == null) break block4;
                    n3 = n4;
                    hI3$b = NI3.f(n3);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            object.close();
            hP2.release();
            return hI3$b;
        }
        object.close();
        hP2.release();
        throw throwable2;
    }

    public final EI3 i(String string2) {
        int n3 = 1;
        HP2 hP2 = HP2.c(n3, "SELECT * FROM workspec WHERE id=?");
        Object object = string2;
        hP2.c0(n3, string2);
        Object object2 = this;
        object = this.a;
        ((FP2)object).assertNotSuspendingTransaction();
        int n4 = 0;
        String string3 = null;
        Cursor cursor = Oh0.b((FP2)object, hP2, false);
        object = "id";
        try {
            int n7 = yf0.b(cursor, (String)object);
            String string4 = "state";
            int n8 = yf0.b(cursor, string4);
            String string5 = "worker_class_name";
            int n10 = yf0.b(cursor, string5);
            String string6 = "input_merger_class_name";
            int n14 = yf0.b(cursor, string6);
            String string7 = "input";
            int n15 = yf0.b(cursor, string7);
            String string8 = "output";
            int n16 = yf0.b(cursor, string8);
            String string9 = "initial_delay";
            int n17 = yf0.b(cursor, string9);
            String string10 = "interval_duration";
            int n18 = yf0.b(cursor, string10);
            String string11 = "flex_duration";
            int n19 = yf0.b(cursor, string11);
            String string12 = "run_attempt_count";
            int n20 = yf0.b(cursor, string12);
            String string13 = "backoff_policy";
            int n21 = yf0.b(cursor, string13);
            String string14 = "backoff_delay_duration";
            n3 = yf0.b(cursor, string14);
            string3 = "last_enqueue_time";
            n4 = yf0.b(cursor, string3);
            object2 = "minimum_retention_duration";
            int n22 = yf0.b(cursor, (String)object2);
            return n22;
        }
        finally {
            HP2 hP22 = hP2;
        }
    }

    public final void j(EI3 eI3) {
        FP2 fP2 = this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            HI3$i hI3$i = this.b;
            hI3$i.insert(eI3);
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
    public final int k(String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$m hI3$m;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$m = this.f;
            bg3_02 = hI3$m.acquire();
            int n3 = 1;
            bg3_02.c0(n3, string2);
            fP2.beginTransaction();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    int n4 = bg3_02.q();
                    fP2.setTransactionSuccessful();
                    {
                        fP2.endTransaction();
                        hI3$m.release(bg3_02);
                        return n4;
                    }
                }
                catch (Throwable throwable3) {}
                {
                    fP2.endTransaction();
                    throw throwable3;
                }
            }
        }
        hI3$m.release(bg3_02);
        throw throwable2222222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList l(String object) {
        Throwable throwable2;
        HP2 hP2;
        block3: {
            ArrayList<b> arrayList;
            int n3 = 1;
            hP2 = HP2.c(n3, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
            hP2.c0(n3, (String)object);
            object = this.a;
            ((FP2)object).assertNotSuspendingTransaction();
            n3 = 0;
            Object var4_4 = null;
            object = Oh0.b((FP2)object, hP2, false);
            try {
                int n4 = object.getCount();
                arrayList = new ArrayList<b>(n4);
                while ((n4 = (int)(object.moveToNext() ? 1 : 0)) != 0) {
                    byte[] byArray = object.getBlob(0);
                    b b2 = androidx.work.b.a(byArray);
                    arrayList.add(b2);
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
    public final int m() {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$e hI3$e;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$e = this.n;
            bg3_02 = hI3$e.acquire();
            fP2.beginTransaction();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    int n3 = bg3_02.q();
                    fP2.setTransactionSuccessful();
                    {
                        fP2.endTransaction();
                        hI3$e.release(bg3_02);
                        return n3;
                    }
                }
                catch (Throwable throwable3) {}
                {
                    fP2.endTransaction();
                    throw throwable3;
                }
            }
        }
        hI3$e.release(bg3_02);
        throw throwable2222222;
    }

    public final ArrayList n() {
        int n3 = 1;
        ArrayList<Object> arrayList = HP2.c(n3, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        int n4 = 200;
        long l2 = n4;
        ((HP2)((Object)arrayList)).m0(n3, l2);
        Object object = this;
        Object object2 = this.a;
        ((FP2)object2).assertNotSuspendingTransaction();
        int n7 = 0;
        String string2 = null;
        Cursor cursor = Oh0.b((FP2)object2, (ag3_0)((Object)arrayList), false);
        object2 = "id";
        try {
            n4 = yf0.b(cursor, (String)object2);
            String string3 = "state";
            int n8 = yf0.b(cursor, string3);
            String string4 = "worker_class_name";
            int n10 = yf0.b(cursor, string4);
            String string5 = "input_merger_class_name";
            int n14 = yf0.b(cursor, string5);
            String string6 = "input";
            int n15 = yf0.b(cursor, string6);
            String string7 = "output";
            int n16 = yf0.b(cursor, string7);
            String string8 = "initial_delay";
            int n17 = yf0.b(cursor, string8);
            String string9 = "interval_duration";
            int n18 = yf0.b(cursor, string9);
            String string10 = "flex_duration";
            int n19 = yf0.b(cursor, string10);
            String string11 = "run_attempt_count";
            int n20 = yf0.b(cursor, string11);
            String string12 = "backoff_policy";
            int n21 = yf0.b(cursor, string12);
            String string13 = "backoff_delay_duration";
            n3 = yf0.b(cursor, string13);
            string2 = "last_enqueue_time";
            n7 = yf0.b(cursor, string2);
            object = "minimum_retention_duration";
            int n22 = yf0.b(cursor, (String)object);
            return n22;
        }
        finally {
            HP2 hP2 = arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList o() {
        Throwable throwable2;
        FP2 fP2;
        HP2 hP2;
        block3: {
            ArrayList<String> arrayList;
            int n3 = 1;
            hP2 = HP2.c(n3, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
            hP2.c0(n3, "offline_ping_sender_work");
            fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            Object var4_4 = null;
            fP2 = Oh0.b(fP2, hP2, false);
            try {
                int n4 = fP2.getCount();
                arrayList = new ArrayList<String>(n4);
                while ((n4 = (int)(fP2.moveToNext() ? 1 : 0)) != 0) {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList p(String object) {
        Throwable throwable2;
        HP2 hP2;
        block3: {
            ArrayList<EI3$b> arrayList;
            int n3 = 1;
            hP2 = HP2.c(n3, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            hP2.c0(n3, (String)object);
            object = this.a;
            ((FP2)object).assertNotSuspendingTransaction();
            object = Oh0.b((FP2)object, hP2, false);
            try {
                int n4 = object.getCount();
                arrayList = new ArrayList<EI3$b>(n4);
                while ((n4 = (int)(object.moveToNext() ? 1 : 0)) != 0) {
                    String string2 = object.getString(0);
                    int n7 = object.getInt(n3);
                    hI3$b hI3$b = NI3.f(n7);
                    String string3 = "id";
                    Intrinsics.checkNotNullParameter(string2, string3);
                    string3 = "state";
                    Intrinsics.checkNotNullParameter((Object)hI3$b, string3);
                    EI3$b eI3$b = new Object();
                    eI3$b.a = string2;
                    eI3$b.b = hI3$b;
                    arrayList.add(eI3$b);
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

    public final br2_2 q() {
        Object object = HP2.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        Object object2 = new String[]{"workspec"};
        II3 iI3 = new II3(this, (HP2)object);
        FP2 fP2 = this.a;
        object = new a(fP2, (String[])object2, iI3, null);
        object2 = new br2_2((Function2)object);
        return object2;
    }

    public final ArrayList r(int n3) {
        int n4 = 1;
        ArrayList<Object> arrayList = HP2.c(n4, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        int n7 = n3;
        long l2 = n3;
        ((HP2)((Object)arrayList)).m0(n4, l2);
        Object object = this;
        Object object2 = this.a;
        ((FP2)object2).assertNotSuspendingTransaction();
        int n8 = 0;
        String string2 = null;
        Cursor cursor = Oh0.b((FP2)object2, (ag3_0)((Object)arrayList), false);
        object2 = "id";
        try {
            n7 = yf0.b(cursor, (String)object2);
            String string3 = "state";
            int n10 = yf0.b(cursor, string3);
            String string4 = "worker_class_name";
            int n14 = yf0.b(cursor, string4);
            String string5 = "input_merger_class_name";
            int n15 = yf0.b(cursor, string5);
            String string6 = "input";
            int n16 = yf0.b(cursor, string6);
            String string7 = "output";
            int n17 = yf0.b(cursor, string7);
            String string8 = "initial_delay";
            int n18 = yf0.b(cursor, string8);
            String string9 = "interval_duration";
            int n19 = yf0.b(cursor, string9);
            String string10 = "flex_duration";
            int n20 = yf0.b(cursor, string10);
            String string11 = "run_attempt_count";
            int n21 = yf0.b(cursor, string11);
            String string12 = "backoff_policy";
            int n22 = yf0.b(cursor, string12);
            String string13 = "backoff_delay_duration";
            n4 = yf0.b(cursor, string13);
            string2 = "last_enqueue_time";
            n8 = yf0.b(cursor, string2);
            object = "minimum_retention_duration";
            int n24 = yf0.b(cursor, (String)object);
            return n24;
        }
        finally {
            HP2 hP2 = arrayList;
        }
    }

    public final void s(EI3 eI3) {
        FP2 fP2 = this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            HI3$j hI3$j = this.c;
            hI3$j.handle(eI3);
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
    public final void t(long l2, String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$p hI3$p;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$p = this.i;
            bg3_02 = hI3$p.acquire();
            int n3 = 1;
            bg3_02.m0(n3, l2);
            int n4 = 2;
            bg3_02.c0(n4, string2);
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
                        hI3$p.release(bg3_02);
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
        hI3$p.release(bg3_02);
        throw throwable2222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u(String string2, b object) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$o hI3$o;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$o = this.h;
            bg3_02 = hI3$o.acquire();
            object = b$b.b((b)object);
            int n3 = 1;
            bg3_02.q0(n3, (byte[])object);
            int n4 = 2;
            bg3_02.c0(n4, string2);
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
                        hI3$o.release(bg3_02);
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
        hI3$o.release(bg3_02);
        throw throwable2222222;
    }

    public final ArrayList v() {
        int n3 = 0;
        String string2 = null;
        ArrayList<Object> arrayList = HP2.c(0, "SELECT * FROM workspec WHERE state=1");
        Object object = this;
        Object object2 = this.a;
        ((FP2)object2).assertNotSuspendingTransaction();
        Cursor cursor = Oh0.b((FP2)object2, (ag3_0)((Object)arrayList), false);
        object2 = "id";
        try {
            int n4 = yf0.b(cursor, (String)object2);
            String string3 = "state";
            int n7 = yf0.b(cursor, string3);
            String string4 = "worker_class_name";
            int n8 = yf0.b(cursor, string4);
            String string5 = "input_merger_class_name";
            int n10 = yf0.b(cursor, string5);
            String string6 = "input";
            int n14 = yf0.b(cursor, string6);
            String string7 = "output";
            int n15 = yf0.b(cursor, string7);
            String string8 = "initial_delay";
            int n16 = yf0.b(cursor, string8);
            String string9 = "interval_duration";
            int n17 = yf0.b(cursor, string9);
            String string10 = "flex_duration";
            int n18 = yf0.b(cursor, string10);
            String string11 = "run_attempt_count";
            int n19 = yf0.b(cursor, string11);
            String string12 = "backoff_policy";
            int n20 = yf0.b(cursor, string12);
            String string13 = "backoff_delay_duration";
            int n21 = yf0.b(cursor, string13);
            string2 = "last_enqueue_time";
            n3 = yf0.b(cursor, string2);
            object = "minimum_retention_duration";
            int n22 = yf0.b(cursor, (String)object);
            return n22;
        }
        finally {
            HP2 hP2 = arrayList;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void w(int n3, String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        HI3$h hI3$h;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hI3$h = this.o;
            bg3_02 = hI3$h.acquire();
            int n4 = 1;
            long l2 = n3;
            bg3_02.m0(n4, l2);
            n3 = 2;
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
                        hI3$h.release(bg3_02);
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
        hI3$h.release(bg3_02);
        throw throwable2222222;
    }

    public final ArrayList x() {
        int n3 = 0;
        String string2 = null;
        ArrayList<Object> arrayList = HP2.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        Object object = this;
        Object object2 = this.a;
        ((FP2)object2).assertNotSuspendingTransaction();
        Cursor cursor = Oh0.b((FP2)object2, (ag3_0)((Object)arrayList), false);
        object2 = "id";
        try {
            int n4 = yf0.b(cursor, (String)object2);
            String string3 = "state";
            int n7 = yf0.b(cursor, string3);
            String string4 = "worker_class_name";
            int n8 = yf0.b(cursor, string4);
            String string5 = "input_merger_class_name";
            int n10 = yf0.b(cursor, string5);
            String string6 = "input";
            int n14 = yf0.b(cursor, string6);
            String string7 = "output";
            int n15 = yf0.b(cursor, string7);
            String string8 = "initial_delay";
            int n16 = yf0.b(cursor, string8);
            String string9 = "interval_duration";
            int n17 = yf0.b(cursor, string9);
            String string10 = "flex_duration";
            int n18 = yf0.b(cursor, string10);
            String string11 = "run_attempt_count";
            int n19 = yf0.b(cursor, string11);
            String string12 = "backoff_policy";
            int n20 = yf0.b(cursor, string12);
            String string13 = "backoff_delay_duration";
            int n21 = yf0.b(cursor, string13);
            string2 = "last_enqueue_time";
            n3 = yf0.b(cursor, string2);
            object = "minimum_retention_duration";
            int n22 = yf0.b(cursor, (String)object);
            return n22;
        }
        finally {
            HP2 hP2 = arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList y() {
        Object object;
        int n3;
        Object object2;
        int n4;
        HashMap hashMap;
        Cursor cursor;
        FP2 fP2;
        HashMap hashMap2;
        HP2 hP2;
        int n7;
        hi3_0 hi3_02;
        block9: {
            hi3_02 = this;
            n7 = 1;
            hP2 = HP2.c(n7, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            hashMap2 = "adidFetcher";
            hP2.c0(n7, (String)((Object)hashMap2));
            fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            fP2.beginTransaction();
            cursor = Oh0.b(fP2, hP2, n7 != 0);
            try {
                hashMap2 = new HashMap();
                hashMap = new HashMap();
                break block9;
            }
            catch (Throwable throwable) {}
            cursor.close();
            hP2.release();
            throw throwable;
        }
        while (true) {
            n4 = cursor.moveToNext();
            boolean bl2 = false;
            ArrayList arrayList = null;
            if (n4 == 0) break;
            object2 = cursor.getString(0);
            n3 = hashMap2.containsKey(object2);
            if (n3 == 0) {
                object = new ArrayList();
                hashMap2.put(object2, object);
            }
            if (bl2 = hashMap.containsKey(object2 = cursor.getString(0))) continue;
            arrayList = new ArrayList();
            hashMap.put((ArrayList<Object>)object2, arrayList);
        }
        n4 = -1;
        cursor.moveToPosition(n4);
        hi3_02.D(hashMap2);
        hi3_02.C(hashMap);
        n3 = cursor.getCount();
        object2 = new Object(n3);
        while ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
            b60 b602;
            String string2 = cursor.getString(0);
            n3 = cursor.getInt(n7);
            hI3$b hI3$b = NI3.f(n3);
            n3 = 2;
            object = cursor.getBlob(n3);
            b b2 = androidx.work.b.a((byte[])object);
            n3 = 3;
            int n8 = cursor.getInt(n3);
            n3 = 4;
            int n10 = cursor.getInt(n3);
            n3 = 14;
            long l2 = cursor.getLong(n3);
            n3 = 15;
            long l3 = cursor.getLong(n3);
            n3 = 16;
            long l4 = cursor.getLong(n3);
            n3 = 17;
            n3 = cursor.getInt(n3);
            Au au4 = NI3.c(n3);
            n3 = 18;
            long l7 = cursor.getLong(n3);
            n3 = 19;
            long l8 = cursor.getLong(n3);
            n3 = 20;
            int n14 = cursor.getInt(n3);
            n3 = 21;
            long l12 = cursor.getLong(n3);
            n3 = 22;
            int n15 = cursor.getInt(n3);
            n3 = 5;
            n3 = cursor.getInt(n3);
            lV1 lV12 = NI3.d(n3);
            n3 = 6;
            object = cursor.getBlob(n3);
            Object object3 = NI3.j((byte[])object);
            n3 = 7;
            boolean bl3 = (n3 = cursor.getInt(n3)) != 0;
            n3 = 8;
            n3 = cursor.getInt(n3);
            boolean bl4 = n3 != 0;
            n3 = 9;
            n3 = cursor.getInt(n3);
            boolean bl5 = n3 != 0;
            n3 = 10;
            n3 = cursor.getInt(n3);
            boolean bl6 = n3 != 0;
            n3 = 11;
            long l14 = cursor.getLong(n3);
            n3 = 12;
            long l15 = cursor.getLong(n3);
            n3 = 13;
            object = cursor.getBlob(n3);
            LinkedHashSet linkedHashSet = NI3.a((byte[])object);
            Object object4 = b602;
            b602 = new b60((dv1_0)object3, lV12, bl3, bl4, bl5, bl6, l14, l15, linkedHashSet);
            object = cursor.getString(0);
            object4 = object = hashMap2.get(object);
            object4 = (ArrayList)object;
            object = cursor.getString(0);
            object3 = object = hashMap.get(object);
            object3 = (ArrayList)object;
            object = new EI3$c(string2, hI3$b, b2, l2, l3, l4, b602, n8, au4, l7, l8, n14, n10, l12, n15, (ArrayList)object4, (ArrayList)object3);
            ((ArrayList)object2).add(object);
        }
        fP2.setTransactionSuccessful();
        try {
            cursor.close();
            hP2.release();
            fP2.endTransaction();
            return object2;
        }
        catch (Throwable throwable) {}
        fP2.endTransaction();
        throw throwable;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int z(String string2) {
        Throwable throwable2222222;
        bg3_0 bg3_02;
        hi3$a_0 hi3$a_0;
        block6: {
            FP2 fP2 = this.a;
            fP2.assertNotSuspendingTransaction();
            hi3$a_0 = this.k;
            bg3_02 = hi3$a_0.acquire();
            int n3 = 1;
            bg3_02.c0(n3, string2);
            fP2.beginTransaction();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    int n4 = bg3_02.q();
                    fP2.setTransactionSuccessful();
                    {
                        fP2.endTransaction();
                        hi3$a_0.release(bg3_02);
                        return n4;
                    }
                }
                catch (Throwable throwable3) {}
                {
                    fP2.endTransaction();
                    throw throwable3;
                }
            }
        }
        hi3$a_0.release(bg3_02);
        throw throwable2222222;
    }
}

