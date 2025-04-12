/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import okhttp3.internal.concurrent.b;
import okio.AsyncTimeout;

public final class S91$c
extends AsyncTimeout {
    public final /* synthetic */ S91 m;

    public S91$c(S91 s91) {
        this.m = s91;
    }

    public final IOException j(IOException iOException) {
        String string2 = "timeout";
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(string2);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void k() {
        Object object = this.m;
        Object object2 = ta0_2.CANCEL;
        ((S91)object).e((ta0_2)((Object)object2));
        object = this.m.b;
        synchronized (object) {
            block8: {
                long l2;
                long l3;
                block7: {
                    l3 = ((g91_0)object).p;
                    l2 = ((g91_0)object).o;
                    long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (l4 >= 0) break block7;
                    break block8;
                }
                l3 = 1L;
                l2 += l3;
                ((g91_0)object).o = l2;
                l3 = System.nanoTime();
                int n3 = 1000000000;
                l2 = n3;
                l3 += l2;
                ((g91_0)object).q = l3;
                object2 = Unit.a;
                object2 = ((g91_0)object).i;
                CharSequence charSequence = new StringBuilder();
                Object object3 = ((g91_0)object).d;
                String string2 = " ping";
                charSequence = h30_0.a(charSequence, (String)object3, string2);
                object3 = new p91_0((String)charSequence, (g91_0)object);
                long l7 = 0L;
                ((b)object2).c((ri3_1)object3, l7);
            }
            return;
            finally {
            }
        }
    }

    public final void l() {
        boolean bl2 = this.i();
        if (!bl2) {
            return;
        }
        throw this.j(null);
    }
}

