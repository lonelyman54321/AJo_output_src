/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;

public abstract class PropertyReference
extends CallableReference
implements gn1_2 {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object object) {
        super(object);
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object object, Class clazz, String string2, String string3, int n3) {
        int n4 = n3 & 1;
        boolean bl2 = false;
        int n7 = 1;
        boolean bl3 = n4 == n7;
        super(object, clazz, string2, string3, bl3);
        int n8 = 2;
        int n10 = n3 & 2;
        if (n10 == n8) {
            bl2 = true;
        }
        this.syntheticJavaProperty = bl2;
    }

    public xn1_2 compute() {
        boolean bl2 = this.syntheticJavaProperty;
        xn1_2 xn1_22 = bl2 ? this : super.compute();
        return xn1_22;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof PropertyReference;
        if (bl3) {
            boolean bl4;
            Object object2;
            object = (PropertyReference)object;
            Object object3 = this.getOwner();
            bl3 = object3.equals(object2 = ((CallableReference)object).getOwner());
            if (!(bl3 && (bl3 = ((String)(object3 = this.getName())).equals(object2 = ((CallableReference)object).getName())) && (bl3 = ((String)(object3 = this.getSignature())).equals(object2 = ((CallableReference)object).getSignature())) && (bl4 = Intrinsics.areEqual(object3 = this.getBoundReceiver(), object = ((CallableReference)object).getBoundReceiver())))) {
                bl2 = false;
                Object var7_7 = null;
            }
            return bl2;
        }
        bl2 = object instanceof gn1_2;
        if (bl2) {
            xn1_2 xn1_22 = this.compute();
            return object.equals(xn1_22);
        }
        return false;
    }

    public abstract /* synthetic */ gn1$a_0 getGetter();

    public gn1_2 getReflected() {
        boolean bl2 = this.syntheticJavaProperty;
        if (!bl2) {
            return (gn1_2)super.getReflected();
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        throw unsupportedOperationException;
    }

    public int hashCode() {
        int n3 = this.getOwner().hashCode() * 31;
        int n4 = (this.getName().hashCode() + n3) * 31;
        return this.getSignature().hashCode() + n4;
    }

    public boolean isConst() {
        return this.getReflected().isConst();
    }

    public boolean isLateinit() {
        return this.getReflected().isLateinit();
    }

    public String toString() {
        Object object = this.compute();
        if (object != this) {
            return object.toString();
        }
        object = new StringBuilder("property ");
        String string2 = this.getName();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" (Kotlin reflection is not available)");
        return ((StringBuilder)object).toString();
    }
}

