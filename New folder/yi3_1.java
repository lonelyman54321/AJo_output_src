/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from yI3
 */
public final class yi3_1
implements Function0 {
    public final /* synthetic */ zi3_1 a;
    public final /* synthetic */ UUID b;
    public final /* synthetic */ b c;

    public /* synthetic */ yi3_1(zi3_1 zi3_12, UUID uUID, b b2) {
        this.a = zi3_12;
        this.b = uUID;
        this.c = b2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        Throwable throwable2;
        Object object;
        Object object2;
        block8: {
            Object object3;
            block6: {
                block9: {
                    block7: {
                        object2 = this.a;
                        object2.getClass();
                        object3 = this.b;
                        object = ((UUID)object3).toString();
                        Object object4 = qx1.a();
                        object3.toString();
                        object3 = this.c;
                        Objects.toString(object3);
                        object4.getClass();
                        object2 = ((zi3_1)object2).a;
                        ((FP2)object2).beginTransaction();
                        try {
                            object4 = ((WorkDatabase)object2).f();
                            object4 = object4.i((String)object);
                            if (object4 == null) break block6;
                            object4 = ((EI3)object4).b;
                            hI3$b hI3$b = hI3$b.RUNNING;
                            if (object4 != hI3$b) break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        object4 = new vi3_0((String)object, (b)object3);
                        object3 = ((WorkDatabase)object2).e();
                        object3.a((vi3_0)object4);
                        break block9;
                    }
                    object3 = qx1.a();
                    object3.getClass();
                }
                ((FP2)object2).setTransactionSuccessful();
                ((FP2)object2).endTransaction();
                return null;
            }
            object3 = "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.";
            {
                object = new IllegalStateException((String)object3);
                throw object;
            }
        }
        try {
            object = qx1.a();
            object.getClass();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            ((FP2)object2).endTransaction();
            throw throwable3;
        }
    }
}

