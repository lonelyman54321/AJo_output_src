/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.TypeResolver$TypeVariableKey;
import com.google.common.reflect.TypeVisitor;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

class TypeResolver$1
extends TypeVisitor {
    final /* synthetic */ Map val$mappings;
    final /* synthetic */ Type val$to;

    public TypeResolver$1(Map map2, Type type2) {
        this.val$mappings = map2;
        this.val$to = type2;
    }

    public void visitClass(Class object) {
        Object object2 = this.val$to;
        boolean bl2 = object2 instanceof WildcardType;
        if (bl2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("No type mapping from ");
        stringBuilder.append(object);
        stringBuilder.append(" to ");
        object = this.val$to;
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public void visitGenericArrayType(GenericArrayType type2) {
        Map map2;
        Type type3 = this.val$to;
        boolean bl2 = type3 instanceof WildcardType;
        if (bl2) {
            return;
        }
        if ((type3 = Types.getComponentType(type3)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            map2 = null;
        }
        Type type4 = this.val$to;
        Preconditions.checkArgument(bl2, "%s is not an array type.", (Object)type4);
        map2 = this.val$mappings;
        type2 = type2.getGenericComponentType();
        TypeResolver.access$000(map2, type2, type3);
    }

    public void visitParameterizedType(ParameterizedType object) {
        int n3;
        Type type2;
        Type[] typeArray;
        Type type3 = this.val$to;
        boolean bl2 = type3 instanceof WildcardType;
        if (bl2) {
            return;
        }
        type3 = (ParameterizedType)TypeResolver.access$100(ParameterizedType.class, type3);
        Object object2 = object.getOwnerType();
        if (object2 != null && (object2 = type3.getOwnerType()) != null) {
            object2 = this.val$mappings;
            typeArray = object.getOwnerType();
            type2 = type3.getOwnerType();
            TypeResolver.access$000((Map)object2, (Type)typeArray, type2);
        }
        object2 = object.getRawType();
        typeArray = type3.getRawType();
        bl2 = object2.equals(typeArray);
        type2 = this.val$to;
        Preconditions.checkArgument(bl2, "Inconsistent raw type: %s vs. %s", object, (Object)type2);
        object2 = object.getActualTypeArguments();
        typeArray = type3.getActualTypeArguments();
        int n4 = ((Type[])object2).length;
        int n7 = typeArray.length;
        int n8 = 0;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            type2 = null;
        }
        String string2 = "%s not compatible with %s";
        Preconditions.checkArgument(n4 != 0, string2, object, (Object)type3);
        while (n8 < (n3 = ((Type[])object2).length)) {
            object = this.val$mappings;
            type3 = object2[n8];
            type2 = typeArray[n8];
            TypeResolver.access$000((Map)object, type3, type2);
            ++n8;
        }
    }

    public void visitTypeVariable(TypeVariable type2) {
        Map map2 = this.val$mappings;
        TypeResolver$TypeVariableKey typeResolver$TypeVariableKey = new TypeResolver$TypeVariableKey((TypeVariable)type2);
        type2 = this.val$to;
        map2.put(typeResolver$TypeVariableKey, type2);
    }

    public void visitWildcardType(WildcardType object) {
        int n3;
        Map map2;
        Type[] typeArray = this.val$to;
        boolean bl2 = typeArray instanceof WildcardType;
        if (!bl2) {
            return;
        }
        typeArray = (WildcardType)typeArray;
        Object object2 = object.getUpperBounds();
        Object object3 = typeArray.getUpperBounds();
        Type[] typeArray2 = object.getLowerBounds();
        typeArray = typeArray.getLowerBounds();
        int n4 = ((Type[])object2).length;
        int n7 = ((Type[])object3).length;
        int n8 = 0;
        if (n4 == n7 && (n4 = typeArray2.length) == (n7 = typeArray.length)) {
            n4 = 1;
        } else {
            n4 = 0;
            map2 = null;
        }
        Object object4 = "Incompatible type: %s vs. %s";
        Type type2 = this.val$to;
        Preconditions.checkArgument(n4 != 0, (String)object4, object, (Object)type2);
        object = null;
        for (n3 = 0; n3 < (n4 = ((Type[])object2).length); ++n3) {
            map2 = this.val$mappings;
            object4 = object2[n3];
            type2 = object3[n3];
            TypeResolver.access$000(map2, (Type)object4, type2);
        }
        while (n8 < (n3 = typeArray2.length)) {
            object = this.val$mappings;
            object2 = typeArray2[n8];
            object3 = typeArray[n8];
            TypeResolver.access$000((Map)object, (Type)object2, (Type)object3);
            ++n8;
        }
    }
}

