/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public class AdaptedFunctionReference
implements FunctionBase,
Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int n3, Class clazz, String string2, String string3, int n4) {
        Object object = CallableReference.NO_RECEIVER;
        this(n3, object, clazz, string2, string3, n4);
    }

    public AdaptedFunctionReference(int n3, Object object, Class clazz, String string2, String string3, int n4) {
        this.receiver = object;
        this.owner = clazz;
        this.name = string2;
        this.signature = string3;
        int n7 = n4 & 1;
        int n8 = 1;
        if (n7 == n8) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        this.isTopLevel = n7;
        this.arity = n3;
        this.flags = n3 = n4 >> 1;
    }

    public boolean equals(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n3 = object instanceof AdaptedFunctionReference;
        if (n3 == 0) {
            return false;
        }
        object = (AdaptedFunctionReference)object;
        n3 = this.isTopLevel;
        int n4 = ((AdaptedFunctionReference)object).isTopLevel;
        if (n3 != n4 || (n3 = this.arity) != (n4 = ((AdaptedFunctionReference)object).arity) || (n3 = this.flags) != (n4 = ((AdaptedFunctionReference)object).flags) || (n3 = (int)(Intrinsics.areEqual(object3 = this.receiver, object2 = ((AdaptedFunctionReference)object).receiver) ? 1 : 0)) == 0 || (n3 = (int)(Intrinsics.areEqual(object3 = this.owner, object2 = ((AdaptedFunctionReference)object).owner) ? 1 : 0)) == 0 || (n3 = (int)(((String)(object3 = this.name)).equals(object2 = ((AdaptedFunctionReference)object).name) ? 1 : 0)) == 0 || !(bl2 = ((String)(object3 = this.signature)).equals(object = ((AdaptedFunctionReference)object).signature))) {
            bl3 = false;
        }
        return bl3;
    }

    public int getArity() {
        return this.arity;
    }

    public an1_2 getOwner() {
        boolean bl2;
        Object object = this.owner;
        object = object == null ? null : ((bl2 = this.isTopLevel) ? Reflection.getOrCreateKotlinPackage((Class)object) : Reflection.getOrCreateKotlinClass((Class)object));
        return object;
    }

    public int hashCode() {
        int n3;
        Object object = this.receiver;
        int n4 = 0;
        String string2 = null;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        int n7 = 31;
        n3 *= 31;
        Class clazz = this.owner;
        if (clazz != null) {
            n4 = clazz.hashCode();
        }
        n3 = (n3 + n4) * 31;
        string2 = this.name;
        n3 = zy_2.b(n3, n7, string2);
        string2 = this.signature;
        n3 = zy_2.b(n3, n7, string2);
        n4 = (int)(this.isTopLevel ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = this.arity;
        n3 = (n3 + n4) * 31;
        n4 = this.flags;
        return n3 + n4;
    }

    public String toString() {
        return Reflection.renderLambdaToString(this);
    }
}

