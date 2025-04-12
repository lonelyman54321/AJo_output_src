/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$1;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.Value;
import java.util.Collections;
import java.util.Map;

public final class Struct$Builder
extends GeneratedMessageLite$Builder
implements StructOrBuilder {
    private Struct$Builder() {
        Struct struct = Struct.access$000();
        super(struct);
    }

    public /* synthetic */ Struct$Builder(Struct$1 struct$1) {
        this();
    }

    public Struct$Builder clearFields() {
        this.copyOnWrite();
        Struct.access$100((Struct)this.instance).clear();
        return this;
    }

    public boolean containsFields(String string2) {
        string2.getClass();
        return ((Struct)this.instance).getFieldsMap().containsKey(string2);
    }

    public Map getFields() {
        return this.getFieldsMap();
    }

    public int getFieldsCount() {
        return ((Struct)this.instance).getFieldsMap().size();
    }

    public Map getFieldsMap() {
        return Collections.unmodifiableMap(((Struct)this.instance).getFieldsMap());
    }

    public Value getFieldsOrDefault(String string2, Value object) {
        string2.getClass();
        Map map2 = ((Struct)this.instance).getFieldsMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string2 = map2.get(string2);
            object = string2;
            object = (Value)((Object)string2);
        }
        return object;
    }

    public Value getFieldsOrThrow(String object) {
        object.getClass();
        Map map2 = ((Struct)this.instance).getFieldsMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (Value)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public Struct$Builder putAllFields(Map map2) {
        this.copyOnWrite();
        Struct.access$100((Struct)this.instance).putAll(map2);
        return this;
    }

    public Struct$Builder putFields(String string2, Value value) {
        string2.getClass();
        value.getClass();
        this.copyOnWrite();
        Struct.access$100((Struct)this.instance).put(string2, value);
        return this;
    }

    public Struct$Builder removeFields(String string2) {
        string2.getClass();
        this.copyOnWrite();
        Struct.access$100((Struct)this.instance).remove(string2);
        return this;
    }
}

