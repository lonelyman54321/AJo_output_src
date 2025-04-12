/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import java.io.Serializable;

class Functions$ConstantFunction
implements Function,
Serializable {
    private static final long serialVersionUID;
    private final Object value;

    public Functions$ConstantFunction(Object object) {
        this.value = object;
    }

    public Object apply(Object object) {
        return this.value;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Functions$ConstantFunction;
        if (bl2) {
            object = (Functions$ConstantFunction)object;
            Object object2 = this.value;
            object = ((Functions$ConstantFunction)object).value;
            return Objects.equal(object2, object);
        }
        return false;
    }

    public int hashCode() {
        int n3;
        Object object = this.value;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Functions.constant(");
        Object object = this.value;
        return fK.a(stringBuilder, object, ")");
    }
}

