/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.concurrent.Callable;

/*
 * Renamed from Hb1
 */
public final class hb1_0
implements Callable {
    public final /* synthetic */ HttpTransaction a;
    public final /* synthetic */ Cb1 b;

    public hb1_0(Cb1 cb1, HttpTransaction httpTransaction) {
        this.b = cb1;
        this.a = httpTransaction;
    }

    public final Object call() {
        Object object = this.b;
        FP2 fP2 = ((Cb1)object).a;
        fP2.beginTransaction();
        try {
            object = ((Cb1)object).b;
            HttpTransaction httpTransaction = this.a;
            long l2 = ((BA0)object).insertAndReturnId(httpTransaction);
            fP2.setTransactionSuccessful();
            object = l2;
            return object;
        }
        finally {
            fP2.endTransaction();
        }
    }
}

