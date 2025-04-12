/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.MutablePropertyReference;
import kotlin.jvm.internal.Reflection;

public abstract class MutablePropertyReference0
extends MutablePropertyReference
implements dn1_2 {
    public MutablePropertyReference0() {
    }

    public MutablePropertyReference0(Object object) {
        super(object);
    }

    public MutablePropertyReference0(Object object, Class clazz, String string2, String string3, int n3) {
        super(object, clazz, string2, string3, n3);
    }

    public xn1_2 computeReflected() {
        return Reflection.mutableProperty0(this);
    }

    public abstract /* synthetic */ Object get();

    public Object getDelegate() {
        return ((dn1_2)this.getReflected()).getDelegate();
    }

    public Hn1$a getGetter() {
        ((dn1_2)this.getReflected()).getGetter();
        return null;
    }

    public dn1$a_0 getSetter() {
        ((dn1_2)this.getReflected()).getSetter();
        return null;
    }

    public Object invoke() {
        return this.get();
    }

    public abstract /* synthetic */ void set(Object var1);
}

