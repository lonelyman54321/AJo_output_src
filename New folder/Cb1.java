/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 */
import android.os.CancellationSignal;
import androidx.room.c;
import androidx.room.e;
import androidx.room.f;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class Cb1
implements ab1_0 {
    public final FP2 a;
    public final Db1 b;
    public final eb1_0 c;
    public final Fb1 d;
    public final Gb1 e;

    public Cb1(ChuckerDatabase chuckerDatabase) {
        n23 n232;
        this.a = chuckerDatabase;
        super(chuckerDatabase);
        this.b = n232;
        super(chuckerDatabase);
        this.c = n232;
        super(chuckerDatabase);
        this.d = n232;
        super(chuckerDatabase);
        this.e = n232;
    }

    public final e a(long l2) {
        int n3 = 1;
        HP2 hP2 = HP2.c(n3, "SELECT * FROM transactions WHERE id = ?");
        hP2.m0(n3, l2);
        c c2 = this.a.getInvalidationTracker();
        String[] stringArray = new String[]{"transactions"};
        Bb1 bb1 = new Bb1(this, hP2);
        return c2.b(stringArray, bb1);
    }

    public final Object b(long l2, f80_0 f80_02) {
        Cb1$c cb1$c = new Cb1$c(this, l2);
        return Q90.a((ChuckerDatabase)this.a, cb1$c, f80_02);
    }

    public final Object c(f80_0 f80_02) {
        cb1$b_0 cb1$b_0 = new cb1$b_0(this);
        return Q90.a((ChuckerDatabase)this.a, cb1$b_0, f80_02);
    }

    public final int d(HttpTransaction httpTransaction) {
        FP2 fP2 = this.a;
        fP2.assertNotSuspendingTransaction();
        fP2.beginTransaction();
        try {
            eb1_0 eb1_02 = this.c;
            int n3 = eb1_02.handle(httpTransaction);
            fP2.setTransactionSuccessful();
            return n3;
        }
        finally {
            fP2.endTransaction();
        }
    }

    public final Object e(HttpTransaction httpTransaction, Lb1$a lb1$a) {
        hb1_0 hb1_02 = new hb1_0(this, httpTransaction);
        return Q90.a((ChuckerDatabase)this.a, hb1_02, lb1$a);
    }

    public final e f() {
        HP2 hP2 = HP2.c(0, "SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error FROM transactions ORDER BY requestDate DESC");
        c c2 = this.a.getInvalidationTracker();
        String[] stringArray = new String[]{"transactions"};
        Ib1 ib1 = new Ib1(this, hP2);
        return c2.b(stringArray, ib1);
    }

    public final Object g(f80_0 object) {
        Object object2 = HP2.c(0, "SELECT * FROM transactions");
        Object object3 = new CancellationSignal();
        Object object4 = new Cb1$a(this, (HP2)object2);
        object2 = this.a;
        boolean bl2 = ((FP2)object2).isOpenInternal();
        if (bl2 && (bl2 = ((FP2)object2).inTransaction())) {
            object = ((Cb1$a)object4).call();
        } else {
            Object object5 = object.getContext();
            Object object6 = f.a;
            if ((object5 = (f)object5.get((CoroutineContext$a)object6)) != null) {
                object5.getClass();
            }
            object2 = R90.a((FP2)object2);
            object6 = zj1_2.b((f80_0)object);
            int n3 = 1;
            object5 = new CancellableContinuationImpl(n3, (f80_0)object6);
            ((CancellableContinuationImpl)object5).r();
            object6 = e01_0.a;
            p90_0 p90_02 = new p90_0((Cb1$a)object4, (CancellableContinuationImpl)object5, null);
            int n4 = 2;
            object2 = Ae3.d((i90_0)object6, (CoroutineContext)object2, null, p90_02, n4);
            object4 = new o90_0((CancellationSignal)object3, (mb3_2)object2);
            ((CancellableContinuationImpl)object5).x((Function1)object4);
            object2 = ((CancellableContinuationImpl)object5).q();
            object3 = j90_0.COROUTINE_SUSPENDED;
            if (object2 == object3) {
                object3 = "frame";
                Intrinsics.checkNotNullParameter(object, (String)object3);
            }
            object = object2;
        }
        return object;
    }

    public final e h(String object, String stringArray) {
        int n3 = 2;
        HP2 hP2 = HP2.c(n3, "SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error FROM transactions WHERE responseCode LIKE ? AND path LIKE ? ORDER BY requestDate DESC");
        int n4 = 1;
        if (object == null) {
            hP2.w0(n4);
        } else {
            hP2.c0(n4, (String)object);
        }
        if (stringArray == null) {
            hP2.w0(n3);
        } else {
            hP2.c0(n3, (String)stringArray);
        }
        object = this.a.getInvalidationTracker();
        stringArray = new String[]{"transactions"};
        Jb1 jb1 = new Jb1(this, hP2);
        return ((c)object).b(stringArray, jb1);
    }
}

