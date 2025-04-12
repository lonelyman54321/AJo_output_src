/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory
implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    public TypeAdapter create(Gson gson, TypeToken object) {
        Type type2 = ((TypeToken)object).getType();
        Class<Collection> clazz = Collection.class;
        Object object2 = ((TypeToken)object).getRawType();
        boolean bl2 = clazz.isAssignableFrom((Class<?>)object2);
        if (!bl2) {
            return null;
        }
        type2 = $Gson$Types.getCollectionElementType(type2, (Class)object2);
        object2 = TypeToken.get(type2);
        object2 = gson.getAdapter((TypeToken)object2);
        object = this.constructorConstructor.get((TypeToken)object);
        clazz = new CollectionTypeAdapterFactory$Adapter(gson, type2, (TypeAdapter)object2, (ObjectConstructor)object);
        return clazz;
    }
}

