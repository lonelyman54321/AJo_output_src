/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$ListAdapter$Converter;
import java.util.AbstractList;
import java.util.List;

public class Internal$ListAdapter
extends AbstractList {
    private final Internal$ListAdapter$Converter converter;
    private final List fromList;

    public Internal$ListAdapter(List list, Internal$ListAdapter$Converter internal$ListAdapter$Converter) {
        this.fromList = list;
        this.converter = internal$ListAdapter$Converter;
    }

    public Object get(int n3) {
        Internal$ListAdapter$Converter internal$ListAdapter$Converter = this.converter;
        Object e2 = this.fromList.get(n3);
        return internal$ListAdapter$Converter.convert(e2);
    }

    public int size() {
        return this.fromList.size();
    }
}

