/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.a_0;
import androidx.datastore.preferences.protobuf.e$a;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class p {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        Object var0 = null;
        Object object = new byte[]{};
        b = object;
        ByteBuffer.wrap(object);
        e$a e$a = new e$a((byte[])object, 0, 0, false);
        try {
            e$a.f(0);
            return;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            object = new IllegalArgumentException;
            object(invalidProtocolBufferException);
            throw object;
        }
    }

    public static void a(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static int b(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public static n c(Object object, Object object2) {
        object = ((wo1_1)object).toBuilder();
        object2 = (wo1_1)object2;
        Class<?> clazz = ((n$a)object).a.getClass();
        boolean bl2 = clazz.isInstance(object2);
        if (bl2) {
            object2 = (n)((a_0)object2);
            ((n$a)object).g();
            n$a.i(((n$a)object).b, (n)object2);
            return ((n$a)object).f();
        }
        object = new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        throw object;
    }
}

