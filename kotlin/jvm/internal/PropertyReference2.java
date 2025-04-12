/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.Reflection;

public abstract class PropertyReference2
extends PropertyReference
implements jn1_2 {
    public PropertyReference2() {
    }

    public PropertyReference2(Class clazz, String string2, String string3, int n3) {
        Object object = CallableReference.NO_RECEIVER;
        super(object, clazz, string2, string3, n3);
    }

    public xn1_2 computeReflected() {
        return Reflection.property2(this);
    }

    public abstract /* synthetic */ Object get(Object var1, Object var2);

    public Object getDelegate(Object object, Object object2) {
        return ((jn1_2)this.getReflected()).getDelegate(object, object2);
    }

    public jn1$a_0 getGetter() {
        ((jn1_2)this.getReflected()).getGetter();
        return null;
    }

    public Object invoke(Object object, Object object2) {
        return this.get(object, object2);
    }
}

