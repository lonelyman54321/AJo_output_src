/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import okio.a;

/*
 * Renamed from Eq
 */
public final class eq_2
implements a93_0 {
    public final /* synthetic */ AsyncTimeout a;
    public final /* synthetic */ a93_0 b;

    public eq_2(z83_0 z83_02, bi1_2 bi1_22) {
        this.a = z83_02;
        this.b = bi1_22;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a0(ce_2 ce_22, long l2) {
        Throwable throwable2222222;
        Intrinsics.checkNotNullParameter(ce_22, "sink");
        a93_0 a93_02 = this.b;
        AsyncTimeout asyncTimeout = this.a;
        asyncTimeout.h();
        long l3 = a93_02.a0(ce_22, l2);
        boolean bl2 = asyncTimeout.i();
        if (bl2) throw asyncTimeout.j(null);
        return l3;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            {
                IOException iOException;
                boolean bl3 = asyncTimeout.i();
                if (!bl3) {
                    throw iOException;
                }
                iOException = asyncTimeout.j(iOException);
                throw iOException;
            }
        }
        asyncTimeout.i();
        throw throwable2222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        Throwable throwable2222222;
        Object object = this.b;
        AsyncTimeout asyncTimeout = this.a;
        asyncTimeout.h();
        object.close();
        object = Unit.a;
        boolean bl2 = asyncTimeout.i();
        if (bl2) throw asyncTimeout.j(null);
        return;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            {
                IOException iOException;
                boolean bl3 = asyncTimeout.i();
                if (!bl3) {
                    throw iOException;
                }
                iOException = asyncTimeout.j(iOException);
                throw iOException;
            }
        }
        asyncTimeout.i();
        throw throwable2222222;
    }

    public final a timeout() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.source(");
        a93_0 a93_02 = this.b;
        stringBuilder.append(a93_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

