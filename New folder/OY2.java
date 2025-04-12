/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;

public final class OY2 {
    public static en1_2 a(Class clazz, String string2, String string3, int n3) {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(clazz, string2, string3, n3);
        return Reflection.mutableProperty1(mutablePropertyReference1Impl);
    }
}

