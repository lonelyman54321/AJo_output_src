/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.ListValue;
import com.google.protobuf.ListValue$1;
import com.google.protobuf.ListValueOrBuilder;
import com.google.protobuf.Value;
import com.google.protobuf.Value$Builder;
import java.util.Collections;
import java.util.List;

public final class ListValue$Builder
extends GeneratedMessageLite$Builder
implements ListValueOrBuilder {
    private ListValue$Builder() {
        ListValue listValue = ListValue.access$000();
        super(listValue);
    }

    public /* synthetic */ ListValue$Builder(ListValue$1 listValue$1) {
        this();
    }

    public ListValue$Builder addAllValues(Iterable iterable) {
        this.copyOnWrite();
        ListValue.access$400((ListValue)this.instance, iterable);
        return this;
    }

    public ListValue$Builder addValues(int n3, Value$Builder valueOrBuilder) {
        this.copyOnWrite();
        ListValue listValue = (ListValue)this.instance;
        valueOrBuilder = (Value)valueOrBuilder.build();
        ListValue.access$300(listValue, n3, (Value)valueOrBuilder);
        return this;
    }

    public ListValue$Builder addValues(int n3, Value value) {
        this.copyOnWrite();
        ListValue.access$300((ListValue)this.instance, n3, value);
        return this;
    }

    public ListValue$Builder addValues(Value$Builder valueOrBuilder) {
        this.copyOnWrite();
        ListValue listValue = (ListValue)this.instance;
        valueOrBuilder = (Value)valueOrBuilder.build();
        ListValue.access$200(listValue, (Value)valueOrBuilder);
        return this;
    }

    public ListValue$Builder addValues(Value value) {
        this.copyOnWrite();
        ListValue.access$200((ListValue)this.instance, value);
        return this;
    }

    public ListValue$Builder clearValues() {
        this.copyOnWrite();
        ListValue.access$500((ListValue)this.instance);
        return this;
    }

    public Value getValues(int n3) {
        return ((ListValue)this.instance).getValues(n3);
    }

    public int getValuesCount() {
        return ((ListValue)this.instance).getValuesCount();
    }

    public List getValuesList() {
        return Collections.unmodifiableList(((ListValue)this.instance).getValuesList());
    }

    public ListValue$Builder removeValues(int n3) {
        this.copyOnWrite();
        ListValue.access$600((ListValue)this.instance, n3);
        return this;
    }

    public ListValue$Builder setValues(int n3, Value$Builder valueOrBuilder) {
        this.copyOnWrite();
        ListValue listValue = (ListValue)this.instance;
        valueOrBuilder = (Value)valueOrBuilder.build();
        ListValue.access$100(listValue, n3, (Value)valueOrBuilder);
        return this;
    }

    public ListValue$Builder setValues(int n3, Value value) {
        this.copyOnWrite();
        ListValue.access$100((ListValue)this.instance, n3, value);
        return this;
    }
}

