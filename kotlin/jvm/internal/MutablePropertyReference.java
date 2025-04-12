/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.PropertyReference;

public abstract class MutablePropertyReference
extends PropertyReference {
    public MutablePropertyReference() {
    }

    public MutablePropertyReference(Object object) {
        super(object);
    }

    public MutablePropertyReference(Object object, Class clazz, String string2, String string3, int n3) {
        super(object, clazz, string2, string3, n3);
    }

    public abstract /* synthetic */ gn1$a_0 getGetter();

    public abstract /* synthetic */ cn1_2 getSetter();
}

