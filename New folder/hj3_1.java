/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from Hj3
 */
public final class hj3_1
extends bg2$a_0 {
    public final String a;
    public final k70_0 b;
    public final ub1_2 c;
    public final byte[] d;

    public hj3_1(String object, k70_0 object2) {
        Intrinsics.checkNotNullParameter(object, "text");
        Intrinsics.checkNotNullParameter(object2, "contentType");
        this.a = object;
        this.b = object2;
        this.c = null;
        object2 = m70_0.a((b41_0)object2);
        if (object2 == null) {
            object2 = Charsets.UTF_8;
        }
        object = be3_1.b((String)object, (Charset)object2);
        this.d = (byte[])object;
    }

    public final Long a() {
        return this.d.length;
    }

    public final k70_0 b() {
        return this.b;
    }

    public final ub1_2 d() {
        return this.c;
    }

    public final byte[] e() {
        return this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextContent[");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append("] \"");
        object = this.a;
        object = le3_2.E(30, (String)object);
        stringBuilder.append((String)object);
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }
}

