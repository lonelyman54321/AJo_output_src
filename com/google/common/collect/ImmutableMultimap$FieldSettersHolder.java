/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Serialization;
import com.google.common.collect.Serialization$FieldSetter;

class ImmutableMultimap$FieldSettersHolder {
    static final Serialization$FieldSetter MAP_FIELD_SETTER;
    static final Serialization$FieldSetter SIZE_FIELD_SETTER;

    static {
        Class<ImmutableMultimap> clazz = ImmutableMultimap.class;
        MAP_FIELD_SETTER = Serialization.getFieldSetter(clazz, "map");
        SIZE_FIELD_SETTER = Serialization.getFieldSetter(clazz, "size");
    }
}

