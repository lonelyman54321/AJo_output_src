/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.PropertyReference0;

public class PropertyReference0Impl
extends PropertyReference0 {
    public PropertyReference0Impl(an1_2 an1_22, String string2, String string3) {
        Object object = CallableReference.NO_RECEIVER;
        Class clazz = ((ClassBasedDeclarationContainer)an1_22).getJClass();
        int n3 = an1_22 instanceof yn1_2 ^ 1;
        super(object, clazz, string2, string3, n3);
    }

    public PropertyReference0Impl(Class clazz, String string2, String string3, int n3) {
        Object object = CallableReference.NO_RECEIVER;
        super(object, clazz, string2, string3, n3);
    }

    public PropertyReference0Impl(Object object, Class clazz, String string2, String string3, int n3) {
        super(object, clazz, string2, string3, n3);
    }

    public Object get() {
        this.getGetter();
        throw null;
    }
}

