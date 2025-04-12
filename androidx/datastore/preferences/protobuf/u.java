/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.l_0;
import androidx.datastore.preferences.protobuf.u$a;

public final class u {
    public final u$a a;
    public final Object b;
    public final Object c;

    public u(wH3 wH32, wH3 wH33, ry2_2 ry2_22) {
        u$a u$a;
        this.a = u$a = new u$a(wH32, wH33, ry2_22);
    }

    public static int a(u$a u$a, Object object, Object object2) {
        int n3 = l_0.b(u$a.a, 1, object);
        return l_0.b(u$a.c, 2, object2) + n3;
    }

    public static void b(CodedOutputStream codedOutputStream, u$a object, Object object2, Object object3) {
        wH3 wH32 = object.a;
        l_0.l(codedOutputStream, wH32, 1, object2);
        object = object.c;
        l_0.l(codedOutputStream, (wH3)((Object)object), 2, object3);
    }
}

