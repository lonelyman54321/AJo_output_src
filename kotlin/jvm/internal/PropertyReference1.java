/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.Reflection;

public abstract class PropertyReference1
extends PropertyReference
implements in1_2 {
    public PropertyReference1() {
    }

    public PropertyReference1(Object object) {
        super(object);
    }

    public PropertyReference1(Object object, Class clazz, String string2, String string3, int n3) {
        super(object, clazz, string2, string3, n3);
    }

    public xn1_2 computeReflected() {
        return Reflection.property1(this);
    }

    public abstract /* synthetic */ Object get(Object var1);

    public Object getDelegate(Object object) {
        return ((in1_2)this.getReflected()).getDelegate(object);
    }

    public In1$a getGetter() {
        ((in1_2)this.getReflected()).getGetter();
        return null;
    }

    public Object invoke(Object object) {
        return this.get(object);
    }
}

