/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMask$1;
import com.google.protobuf.FieldMaskOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class FieldMask$Builder
extends GeneratedMessageLite$Builder
implements FieldMaskOrBuilder {
    private FieldMask$Builder() {
        FieldMask fieldMask = FieldMask.access$000();
        super(fieldMask);
    }

    public /* synthetic */ FieldMask$Builder(FieldMask$1 fieldMask$1) {
        this();
    }

    public FieldMask$Builder addAllPaths(Iterable iterable) {
        this.copyOnWrite();
        FieldMask.access$300((FieldMask)this.instance, iterable);
        return this;
    }

    public FieldMask$Builder addPaths(String string2) {
        this.copyOnWrite();
        FieldMask.access$200((FieldMask)this.instance, string2);
        return this;
    }

    public FieldMask$Builder addPathsBytes(ByteString byteString) {
        this.copyOnWrite();
        FieldMask.access$500((FieldMask)this.instance, byteString);
        return this;
    }

    public FieldMask$Builder clearPaths() {
        this.copyOnWrite();
        FieldMask.access$400((FieldMask)this.instance);
        return this;
    }

    public String getPaths(int n3) {
        return ((FieldMask)this.instance).getPaths(n3);
    }

    public ByteString getPathsBytes(int n3) {
        return ((FieldMask)this.instance).getPathsBytes(n3);
    }

    public int getPathsCount() {
        return ((FieldMask)this.instance).getPathsCount();
    }

    public List getPathsList() {
        return Collections.unmodifiableList(((FieldMask)this.instance).getPathsList());
    }

    public FieldMask$Builder setPaths(int n3, String string2) {
        this.copyOnWrite();
        FieldMask.access$100((FieldMask)this.instance, n3, string2);
        return this;
    }
}

