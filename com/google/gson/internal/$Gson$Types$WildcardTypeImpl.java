/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.$Gson$Types;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

final class $Gson$Types$WildcardTypeImpl
implements WildcardType,
Serializable {
    private static final long serialVersionUID;
    private final Type lowerBound;
    private final Type upperBound;

    public $Gson$Types$WildcardTypeImpl(Type[] object, Type[] typeArray) {
        Class<Object> clazz;
        boolean bl2 = typeArray.length;
        boolean bl3 = true;
        if (bl2 <= bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        $Gson$Preconditions.checkArgument(bl2);
        bl2 = ((Type[])object).length;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        $Gson$Preconditions.checkArgument(bl2);
        bl2 = typeArray.length;
        if (bl2 == bl3) {
            Objects.requireNonNull(typeArray[0]);
            $Gson$Types.checkNotPrimitive(typeArray[0]);
            object = object[0];
            clazz = Object.class;
            if (object != clazz) {
                bl3 = false;
            }
            $Gson$Preconditions.checkArgument(bl3);
            this.lowerBound = object = $Gson$Types.canonicalize(typeArray[0]);
            this.upperBound = clazz;
        } else {
            Objects.requireNonNull(object[0]);
            $Gson$Types.checkNotPrimitive(object[0]);
            typeArray = null;
            this.lowerBound = null;
            this.upperBound = object = $Gson$Types.canonicalize(object[0]);
        }
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof WildcardType;
        if (bl3 && (bl2 = $Gson$Types.equals(this, (Type)(object = (WildcardType)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Type[] getLowerBounds() {
        Type[] typeArray;
        Type type2 = this.lowerBound;
        if (type2 != null) {
            int n3 = 1;
            typeArray = new Type[n3];
            typeArray[0] = type2;
        } else {
            typeArray = $Gson$Types.EMPTY_TYPE_ARRAY;
        }
        return typeArray;
    }

    public Type[] getUpperBounds() {
        Type type2 = this.upperBound;
        Type[] typeArray = new Type[]{type2};
        return typeArray;
    }

    public int hashCode() {
        Type type2 = this.lowerBound;
        int n3 = type2 != null ? type2.hashCode() + 31 : 1;
        int n4 = this.upperBound.hashCode() + 31;
        return n3 ^ n4;
    }

    public String toString() {
        Object object = this.lowerBound;
        if (object != null) {
            object = new StringBuilder("? super ");
            String string2 = $Gson$Types.typeToString(this.lowerBound);
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        object = this.upperBound;
        Class<Object> clazz = Object.class;
        if (object == clazz) {
            return "?";
        }
        object = new StringBuilder("? extends ");
        clazz = $Gson$Types.typeToString(this.upperBound);
        ((StringBuilder)object).append((String)((Object)clazz));
        return ((StringBuilder)object).toString();
    }
}

