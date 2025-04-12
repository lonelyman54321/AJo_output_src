/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.PropertyReference1;

public class PropertyReference1Impl
extends PropertyReference1 {
    public PropertyReference1Impl(an1_2 an1_22, String string2, String string3) {
        Object object = CallableReference.NO_RECEIVER;
        Class clazz = ((ClassBasedDeclarationContainer)an1_22).getJClass();
        int n3 = an1_22 instanceof yn1_2 ^ 1;
        super(object, clazz, string2, string3, n3);
    }

    public PropertyReference1Impl(Class clazz, String string2, String string3, int n3) {
        Object object = CallableReference.NO_RECEIVER;
        super(object, clazz, string2, string3, n3);
    }

    public PropertyReference1Impl(Object object, Class clazz, String string2, String string3, int n3) {
        super(object, clazz, string2, string3, n3);
    }

    public Object get(Object object) {
        this.getGetter();
        throw null;
    }
}

