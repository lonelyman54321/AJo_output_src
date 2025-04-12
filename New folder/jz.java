/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;

public final class jz {
    public static in1_2 a(Class clazz, String string2, String string3, int n3) {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(clazz, string2, string3, n3);
        return Reflection.property1(propertyReference1Impl);
    }

    public static void b(xL$b xL$b, long l2) {
        xL$b.a().h();
        xL$b.b(l2);
    }
}

