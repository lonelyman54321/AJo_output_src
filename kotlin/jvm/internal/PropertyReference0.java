/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.Reflection;

public abstract class PropertyReference0
extends PropertyReference
implements hn1_2 {
    public PropertyReference0() {
    }

    public PropertyReference0(Object object) {
        super(object);
    }

    public PropertyReference0(Object object, Class clazz, String string2, String string3, int n3) {
        super(object, clazz, string2, string3, n3);
    }

    public xn1_2 computeReflected() {
        return Reflection.property0(this);
    }

    public abstract /* synthetic */ Object get();

    public Object getDelegate() {
        return ((hn1_2)this.getReflected()).getDelegate();
    }

    public Hn1$a getGetter() {
        ((hn1_2)this.getReflected()).getGetter();
        return null;
    }

    public Object invoke() {
        return this.get();
    }
}

