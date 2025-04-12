/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.FunctionReference;

public class FunInterfaceConstructorReference
extends FunctionReference
implements Serializable {
    private final Class funInterface;

    public FunInterfaceConstructorReference(Class clazz) {
        super(1);
        this.funInterface = clazz;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof FunInterfaceConstructorReference;
        if (!bl2) {
            return false;
        }
        object = (FunInterfaceConstructorReference)object;
        Class clazz = this.funInterface;
        object = ((FunInterfaceConstructorReference)object).funInterface;
        return clazz.equals(object);
    }

    public bn1_2 getReflected() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Functional interface constructor does not support reflection");
        throw unsupportedOperationException;
    }

    public int hashCode() {
        return this.funInterface.hashCode();
    }

    public String toString() {
        String string2 = this.funInterface.getName();
        return "fun interface ".concat(string2);
    }
}

