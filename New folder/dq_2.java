/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import okio.a;

/*
 * Renamed from Dq
 */
public final class dq_2
implements y63_0 {
    public final /* synthetic */ AsyncTimeout a;
    public final /* synthetic */ y63_0 b;

    public dq_2(z83_0 z83_02, lg2_1 lg2_12) {
        this.a = z83_02;
        this.b = lg2_12;
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        Throwable throwable2222222;
        Object object = this.b;
        AsyncTimeout asyncTimeout = this.a;
        asyncTimeout.h();
        object.flush();
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s0(ce_2 ce_22, long l2) {
        Throwable throwable2222222;
        AsyncTimeout asyncTimeout;
        block8: {
            long l3;
            long l4;
            long l7;
            String string2 = "source";
            Intrinsics.checkNotNullParameter(ce_22, string2);
            long l8 = ce_22.b;
            long l12 = 0L;
            l_0.b(l8, l12, l2);
            while ((l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                long l14;
                long l15;
                Object object = ce_22.a;
                Intrinsics.checkNotNull(object);
                while ((l15 = (l14 = l3 - (l12 = 65536L)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) < 0) {
                    int n3 = ((vx2_2)object).c;
                    int n4 = ((vx2_2)object).b;
                    l12 = n3 - n4;
                    long l16 = (l3 += l12) - l2;
                    if ((n3 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1))) >= 0) {
                        l3 = l2;
                        break;
                    }
                    object = ((vx2_2)object).f;
                    Intrinsics.checkNotNull(object);
                }
                object = this.b;
                asyncTimeout = this.a;
                asyncTimeout.h();
                object.s0(ce_22, l3);
                object = Unit.a;
                {
                    catch (Throwable throwable2222222) {
                        break block8;
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        boolean bl2 = asyncTimeout.i();
                        if (!bl2) {
                            throw iOException;
                        }
                        iOException = asyncTimeout.j(iOException);
                        throw iOException;
                    }
                }
                l7 = (long)asyncTimeout.i();
                if (l7 != false) throw asyncTimeout.j(null);
                l2 -= l3;
            }
            return;
        }
        asyncTimeout.i();
        throw throwable2222222;
    }

    public final a timeout() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.sink(");
        y63_0 y63_02 = this.b;
        stringBuilder.append(y63_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

