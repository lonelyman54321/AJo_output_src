/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.L;
import java.io.IOException;

public abstract class H {
    public abstract void a(Object var1, int var2, int var3);

    public abstract void b(Object var1, int var2, long var3);

    public abstract void c(Object var1, int var2, Object var3);

    public abstract void d(Object var1, int var2, DF var3);

    public abstract void e(Object var1, int var2, long var3);

    public abstract I f(Object var1);

    public abstract I g(Object var1);

    public abstract int h(Object var1);

    public abstract int i(Object var1);

    public abstract void j(Object var1);

    public abstract I k(Object var1, Object var2);

    public final boolean l(Object object, D object2) {
        int n3 = object2.getTag();
        int n4 = n3 >>> 3;
        int n7 = 1;
        if ((n3 &= 7) != 0) {
            if (n3 != n7) {
                int n8 = 2;
                if (n3 != n8) {
                    int n10;
                    n8 = 3;
                    int n14 = 4;
                    if (n3 != n8) {
                        if (n3 != n14) {
                            n8 = 5;
                            if (n3 == n8) {
                                int n15 = object2.readFixed32();
                                this.a(object, n4, n15);
                                return n7 != 0;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        return false;
                    }
                    I i3 = this.m();
                    n8 = n4 << 3 | n14;
                    while ((n14 = object2.getFieldNumber()) != (n10 = -1 >>> 1) && (n14 = (int)(this.l(i3, (D)object2) ? 1 : 0)) != 0) {
                    }
                    int n16 = object2.getTag();
                    if (n8 == n16) {
                        object2 = this.p(i3);
                        this.c(object, n4, object2);
                        return n7 != 0;
                    }
                    object = new IOException("Protocol message end-group tag did not match expected tag.");
                    throw object;
                }
                object2 = object2.readBytes();
                this.d(object, n4, (DF)object2);
                return n7 != 0;
            }
            long l2 = object2.readFixed64();
            this.b(object, n4, l2);
            return n7 != 0;
        }
        long l3 = object2.readInt64();
        this.e(object, n4, l3);
        return n7 != 0;
    }

    public abstract I m();

    public abstract void n(Object var1, Object var2);

    public abstract void o(Object var1, Object var2);

    public abstract I p(Object var1);

    public abstract void q(Object var1, L var2);

    public abstract void r(Object var1, L var2);
}

