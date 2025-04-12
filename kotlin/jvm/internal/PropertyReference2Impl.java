/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.PropertyReference2;

public class PropertyReference2Impl
extends PropertyReference2 {
    public PropertyReference2Impl(an1_2 an1_22, String string2, String string3) {
        Object object = an1_22;
        object = ((ClassBasedDeclarationContainer)an1_22).getJClass();
        int n3 = an1_22 instanceof yn1_2 ^ 1;
        super((Class)object, string2, string3, n3);
    }

    public PropertyReference2Impl(Class clazz, String string2, String string3, int n3) {
        super(clazz, string2, string3, n3);
    }

    public Object get(Object object, Object object2) {
        this.getGetter();
        throw null;
    }
}

