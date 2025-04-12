/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public class FunctionReference
extends CallableReference
implements FunctionBase,
bn1_2 {
    private final int arity;
    private final int flags;

    public FunctionReference(int n3) {
        Object object = CallableReference.NO_RECEIVER;
        this(n3, object, null, null, null, 0);
    }

    public FunctionReference(int n3, Object object) {
        this(n3, object, null, null, null, 0);
    }

    public FunctionReference(int n3, Object object, Class clazz, String string2, String string3, int n4) {
        boolean bl2;
        int n7 = n4 & 1;
        int n8 = 1;
        if (n7 == n8) {
            bl2 = true;
        } else {
            n7 = 0;
            bl2 = false;
        }
        super(object, clazz, string2, string3, bl2);
        this.arity = n3;
        this.flags = n3 = n4 >> 1;
    }

    public xn1_2 computeReflected() {
        return Reflection.function(this);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean n3 = object instanceof FunctionReference;
        if (n3) {
            boolean bl3;
            boolean bl4;
            int n4;
            int n7;
            int n8;
            boolean bl5;
            Object object2;
            object = (FunctionReference)object;
            Object object3 = this.getName();
            boolean bl6 = ((String)object3).equals(object2 = ((CallableReference)object).getName());
            if (!(bl6 && (bl5 = ((String)(object3 = this.getSignature())).equals(object2 = ((CallableReference)object).getSignature())) && (n8 = this.flags) == (n7 = ((FunctionReference)object).flags) && (n4 = this.arity) == (n7 = ((FunctionReference)object).arity) && (bl4 = Intrinsics.areEqual(object3 = this.getBoundReceiver(), object2 = ((CallableReference)object).getBoundReceiver())) && (bl3 = Intrinsics.areEqual(object3 = this.getOwner(), object = ((CallableReference)object).getOwner())))) {
                bl2 = false;
                Object var8_13 = null;
            }
            return bl2;
        }
        bl2 = object instanceof bn1_2;
        if (bl2) {
            xn1_2 xn1_22 = this.compute();
            return object.equals(xn1_22);
        }
        return false;
    }

    public int getArity() {
        return this.arity;
    }

    public bn1_2 getReflected() {
        return (bn1_2)super.getReflected();
    }

    public int hashCode() {
        int n3;
        an1_2 an1_22 = this.getOwner();
        if (an1_22 == null) {
            n3 = 0;
            an1_22 = null;
        } else {
            an1_22 = this.getOwner();
            n3 = an1_22.hashCode() * 31;
        }
        int n4 = (this.getName().hashCode() + n3) * 31;
        return this.getSignature().hashCode() + n4;
    }

    public boolean isExternal() {
        return this.getReflected().isExternal();
    }

    public boolean isInfix() {
        return this.getReflected().isInfix();
    }

    public boolean isInline() {
        return this.getReflected().isInline();
    }

    public boolean isOperator() {
        return this.getReflected().isOperator();
    }

    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }

    public String toString() {
        Object object = this.compute();
        if (object != this) {
            return object.toString();
        }
        object = "<init>";
        String string2 = this.getName();
        boolean bl2 = ((String)object).equals(string2);
        if (bl2) {
            object = "constructor (Kotlin reflection is not available)";
        } else {
            object = new StringBuilder("function ");
            string2 = this.getName();
            ((StringBuilder)object).append(string2);
            string2 = " (Kotlin reflection is not available)";
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
        }
        return object;
    }
}

