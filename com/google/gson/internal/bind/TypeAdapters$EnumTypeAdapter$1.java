/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

class TypeAdapters$EnumTypeAdapter$1
implements PrivilegedAction {
    final /* synthetic */ TypeAdapters.EnumTypeAdapter this$0;
    final /* synthetic */ Class val$classOfT;

    public TypeAdapters$EnumTypeAdapter$1(TypeAdapters.EnumTypeAdapter enumTypeAdapter, Class clazz) {
        this.this$0 = enumTypeAdapter;
        this.val$classOfT = clazz;
    }

    public Field[] run() {
        AccessibleObject[] accessibleObjectArray = this.val$classOfT.getDeclaredFields();
        int n3 = accessibleObjectArray.length;
        ArrayList<Field> arrayList = new ArrayList<Field>(n3);
        for (Field field : accessibleObjectArray) {
            boolean bl2 = field.isEnumConstant();
            if (!bl2) continue;
            arrayList.add(field);
        }
        accessibleObjectArray = new Field[]{};
        accessibleObjectArray = arrayList.toArray(accessibleObjectArray);
        AccessibleObject.setAccessible(accessibleObjectArray, true);
        return accessibleObjectArray;
    }
}

