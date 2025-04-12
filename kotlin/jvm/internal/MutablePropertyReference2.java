/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.MutablePropertyReference;
import kotlin.jvm.internal.Reflection;

public abstract class MutablePropertyReference2
extends MutablePropertyReference
implements fn1_2 {
    public MutablePropertyReference2() {
    }

    public MutablePropertyReference2(Class clazz, String string2, String string3, int n3) {
        Object object = CallableReference.NO_RECEIVER;
        super(object, clazz, string2, string3, n3);
    }

    public xn1_2 computeReflected() {
        return Reflection.mutableProperty2(this);
    }

    public abstract /* synthetic */ Object get(Object var1, Object var2);

    public Object getDelegate(Object object, Object object2) {
        return ((fn1_2)this.getReflected()).getDelegate(object, object2);
    }

    public jn1$a_0 getGetter() {
        ((fn1_2)this.getReflected()).getGetter();
        return null;
    }

    public Fn1$a getSetter() {
        ((fn1_2)this.getReflected()).getSetter();
        return null;
    }

    public Object invoke(Object object, Object object2) {
        return this.get(object, object2);
    }

    public abstract /* synthetic */ void set(Object var1, Object var2, Object var3);
}

