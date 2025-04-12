/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import okio.a;
import okio.a$a;

/*
 * Renamed from E91
 */
public final class e91_0
implements ac0_2 {
    public final x72_0 a;
    public final je2_2 b;
    public final se_1 c;
    public final re_2 d;
    public int e;
    public final r41_0 f;
    public m41_0 g;

    public e91_0(x72_0 object, je2_2 je2_22, se_1 se_12, re_2 re_22) {
        Intrinsics.checkNotNullParameter(je2_22, "connection");
        Intrinsics.checkNotNullParameter(se_12, "source");
        Intrinsics.checkNotNullParameter(re_22, "sink");
        this.a = object;
        this.b = je2_22;
        this.c = se_12;
        this.d = re_22;
        this.f = object = new r41_0(se_12);
    }

    public static final void i(e91_0 object, rv0_2 rv0_22) {
        object.getClass();
        object = rv0_22.e;
        a$a a$a = okio.a.d;
        Intrinsics.checkNotNullParameter(a$a, "delegate");
        rv0_22.e = a$a;
        ((a)object).a();
        ((a)object).b();
    }

    public final a93_0 a(cl2_2 object) {
        String string2;
        int n3;
        Object object2;
        block7: {
            block3: {
                Object object3;
                int n4;
                int n7;
                block6: {
                    long l2;
                    block4: {
                        block5: {
                            block2: {
                                object2 = "response";
                                Intrinsics.checkNotNullParameter(object, (String)object2);
                                n3 = ia1_1.a((cl2_2)object);
                                if (n3 != 0) break block2;
                                long l3 = 0L;
                                object = this.j(l3);
                                break block3;
                            }
                            object2 = cl2_2.c((cl2_2)object, "Transfer-Encoding");
                            n3 = "chunked".equalsIgnoreCase((String)object2);
                            string2 = "state: ";
                            n7 = 5;
                            n4 = 4;
                            if (n3 == 0) break block4;
                            object = ((cl2_2)object).a.a;
                            n3 = this.e;
                            if (n3 != n4) break block5;
                            this.e = n7;
                            object = object2 = new E91$c(this, (ob1_1)object);
                            break block3;
                        }
                        object = new StringBuilder(string2);
                        n3 = this.e;
                        ((StringBuilder)object).append(n3);
                        object = ((StringBuilder)object).toString();
                        object = object.toString();
                        object2 = new IllegalStateException((String)object);
                        throw object2;
                    }
                    long l4 = ez3.k((cl2_2)object);
                    long l7 = l4 - (l2 = (long)-1);
                    object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object3 == false) break block6;
                    object = this.j(l4);
                    break block3;
                }
                object3 = this.e;
                if (object3 != n4) break block7;
                this.e = n7;
                this.b.l();
                object = new E91$a(this);
            }
            return object;
        }
        object = new StringBuilder(string2);
        n3 = this.e;
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final void b() {
        this.d.flush();
    }

    public final long c(cl2_2 cl2_22) {
        String string2;
        String string3 = "response";
        Intrinsics.checkNotNullParameter(cl2_22, string3);
        boolean bl2 = ia1_1.a(cl2_22);
        long l2 = !bl2 ? 0L : ((bl2 = (string2 = "chunked").equalsIgnoreCase(string3 = cl2_2.c(cl2_22, "Transfer-Encoding"))) ? (long)-1 : ez3.k(cl2_22));
        return l2;
    }

    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            ez3.d(socket);
        }
    }

    public final je2_2 d() {
        return this.b;
    }

    public final y63_0 e(kj2_2 object, long l2) {
        block7: {
            Object object2;
            block8: {
                block6: {
                    int n3;
                    int n4;
                    int n7;
                    block4: {
                        block5: {
                            boolean bl2;
                            Intrinsics.checkNotNullParameter(object, "request");
                            object2 = ((kj2_2)object).d;
                            if (object2 != null && (bl2 = ((pj2_2)object2).isDuplex())) {
                                object = new ProtocolException("Duplex connections are not supported for HTTP/1");
                                throw object;
                            }
                            object = ((kj2_2)object).b("Transfer-Encoding");
                            n7 = "chunked".equalsIgnoreCase((String)object);
                            object2 = "state: ";
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block4;
                            n7 = this.e;
                            if (n7 != n3) break block5;
                            this.e = n4;
                            object = new E91$b(this);
                            break block6;
                        }
                        object = new StringBuilder((String)object2);
                        int n8 = this.e;
                        ((StringBuilder)object).append(n8);
                        object = ((StringBuilder)object).toString();
                        object = object.toString();
                        IllegalStateException illegalStateException = new IllegalStateException((String)object);
                        throw illegalStateException;
                    }
                    long l3 = -1;
                    long l4 = l2 - l3;
                    n7 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                    if (n7 == 0) break block7;
                    n7 = this.e;
                    if (n7 != n3) break block8;
                    this.e = n4;
                    object = new E91$e(this);
                }
                return object;
            }
            object = new StringBuilder((String)object2);
            int n10 = this.e;
            ((StringBuilder)object).append(n10);
            object = ((StringBuilder)object).toString();
            object = object.toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        object = new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        throw object;
    }

    public final void f(kj2_2 object) {
        Object object2;
        CharSequence charSequence = "request";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        Object object3 = this.b.b.b.type();
        Intrinsics.checkNotNullExpressionValue(object3, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        Intrinsics.checkNotNullParameter(object3, "proxyType");
        charSequence = new StringBuilder();
        Object object4 = ((kj2_2)object).b;
        ((StringBuilder)charSequence).append((String)object4);
        char c2 = ' ';
        ((StringBuilder)charSequence).append(c2);
        object4 = ((kj2_2)object).a;
        boolean bl2 = ((ob1_1)object4).j;
        if (!bl2 && object3 == (object2 = Proxy.Type.HTTP)) {
            ((StringBuilder)charSequence).append(object4);
        } else {
            Intrinsics.checkNotNullParameter(object4, "url");
            object3 = ((ob1_1)object4).b();
            object4 = ((ob1_1)object4).d();
            if (object4 != null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object3);
                char c3 = '?';
                ((StringBuilder)object2).append(c3);
                ((StringBuilder)object2).append((String)object4);
                object3 = ((StringBuilder)object2).toString();
            }
            ((StringBuilder)charSequence).append((String)object3);
        }
        ((StringBuilder)charSequence).append(" HTTP/1.1");
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        object = ((kj2_2)object).c;
        this.k((m41_0)object, (String)charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final cl2$a_0 g(boolean n3) {
        int n4;
        Object object;
        cl2$a_0 cl2$a_0;
        Object object2 = this.f;
        int n7 = this.e;
        int n8 = 1;
        int n10 = 3;
        if (n7 != n8 && n7 != (n8 = 2) && n7 != n10) {
            CharSequence charSequence = new StringBuilder("state: ");
            int n14 = this.e;
            ((StringBuilder)charSequence).append(n14);
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence = ((Object)charSequence).toString();
            object2 = new IllegalStateException((String)charSequence);
            throw object2;
        }
        Object object3 = ((r41_0)object2).a;
        long l2 = ((r41_0)object2).b;
        object3 = object3.x(l2);
        l2 = ((r41_0)object2).b;
        n8 = ((String)object3).length();
        long l3 = n8;
        l2 -= l3;
        ((r41_0)object2).b = l2;
        object3 = zc3$a.a((String)object3);
        n8 = ((zc3_1)object3).b;
        try {
            cl2$a_0 = new cl2$a_0();
            object = ((zc3_1)object3).a;
            cl2$a_0.d((ib2_2)((Object)object));
            cl2$a_0.c = n8;
            object3 = ((zc3_1)object3).c;
            object = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            cl2$a_0.d = object3;
            object3 = new m41$a_0();
            while (true) {
                object = ((r41_0)object2).a;
                l3 = ((r41_0)object2).b;
                object = object.x(l3);
                l3 = ((r41_0)object2).b;
                n4 = ((String)object).length();
                break;
            }
        }
        catch (EOFException eOFException) {}
        {
            long l4 = n4;
            l3 -= l4;
            ((r41_0)object2).b = l3;
            int n15 = ((String)object).length();
            if (n15 == 0) {
                object2 = ((m41$a_0)object3).e();
                cl2$a_0.c((m41_0)object2);
                int n16 = 100;
                if (n3 != 0 && n8 == n16) {
                    return null;
                }
                if (n8 == n16) {
                    this.e = n10;
                    return cl2$a_0;
                }
                n3 = 102;
                if (n3 <= n8 && n8 < (n3 = 200)) {
                    this.e = n10;
                    return cl2$a_0;
                }
                this.e = n3 = 4;
                return cl2$a_0;
            }
            ((m41$a_0)object3).b((String)object);
            continue;
        }
        object2 = this.b.b.a.i.i();
        object2 = kp1_0.c("unexpected end of stream on ", (String)object2);
        object3 = new IOException((String)object2, eOFException);
        throw object3;
    }

    public final void h() {
        this.d.flush();
    }

    public final E91$d j(long l2) {
        int n3 = this.e;
        int n4 = 4;
        if (n3 == n4) {
            this.e = 5;
            E91$d e91$d = new E91$d(this, l2);
            return e91$d;
        }
        CharSequence charSequence = new StringBuilder("state: ");
        int n7 = this.e;
        ((StringBuilder)charSequence).append(n7);
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public final void k(m41_0 object, String object2) {
        Intrinsics.checkNotNullParameter(object, "headers");
        Object object3 = "requestLine";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n3 = this.e;
        if (n3 == 0) {
            object3 = this.d;
            object2 = object3.D((String)object2);
            String string2 = "\r\n";
            object2.D(string2);
            int n4 = ((m41_0)object).size();
            for (int i3 = 0; i3 < n4; ++i3) {
                Object object4 = ((m41_0)object).c(i3);
                object4 = object3.D((String)object4).D(": ");
                String string3 = ((m41_0)object).g(i3);
                object4 = object4.D(string3);
                object4.D(string2);
            }
            object3.D(string2);
            this.e = 1;
            return;
        }
        object = new StringBuilder("state: ");
        int n7 = this.e;
        ((StringBuilder)object).append(n7);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

