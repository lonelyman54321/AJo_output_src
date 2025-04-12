/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.MutablePropertyReference;
import kotlin.jvm.internal.Reflection;

public abstract class MutablePropertyReference1
extends MutablePropertyReference
implements en1_2 {
    public MutablePropertyReference1() {
    }

    public MutablePropertyReference1(Object object) {
        super(object);
    }

    public MutablePropertyReference1(Object object, Class clazz, String string2, String string3, int n3) {
        super(object, clazz, string2, string3, n3);
    }

    public xn1_2 computeReflected() {
        return Reflection.mutableProperty1(this);
    }

    public abstract /* synthetic */ Object get(Object var1);

    public Object getDelegate(Object object) {
        return ((en1_2)this.getReflected()).getDelegate(object);
    }

    public In1$a getGetter() {
        ((en1_2)this.getReflected()).getGetter();
        return null;
    }

    public en1$a_0 getSetter() {
        ((en1_2)this.getReflected()).getSetter();
        return null;
    }

    public Object invoke(Object object) {
        return this.get(object);
    }

    public abstract /* synthetic */ void set(Object var1, Object var2);
}

