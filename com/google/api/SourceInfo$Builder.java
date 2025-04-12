/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SourceInfo;
import com.google.api.SourceInfo$1;
import com.google.api.SourceInfoOrBuilder;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class SourceInfo$Builder
extends GeneratedMessageLite$Builder
implements SourceInfoOrBuilder {
    private SourceInfo$Builder() {
        SourceInfo sourceInfo = SourceInfo.access$000();
        super(sourceInfo);
    }

    public /* synthetic */ SourceInfo$Builder(SourceInfo$1 sourceInfo$1) {
        this();
    }

    public SourceInfo$Builder addAllSourceFiles(Iterable iterable) {
        this.copyOnWrite();
        SourceInfo.access$400((SourceInfo)this.instance, iterable);
        return this;
    }

    public SourceInfo$Builder addSourceFiles(int n3, Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        SourceInfo sourceInfo = (SourceInfo)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        SourceInfo.access$300(sourceInfo, n3, (Any)anyOrBuilder);
        return this;
    }

    public SourceInfo$Builder addSourceFiles(int n3, Any any) {
        this.copyOnWrite();
        SourceInfo.access$300((SourceInfo)this.instance, n3, any);
        return this;
    }

    public SourceInfo$Builder addSourceFiles(Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        SourceInfo sourceInfo = (SourceInfo)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        SourceInfo.access$200(sourceInfo, (Any)anyOrBuilder);
        return this;
    }

    public SourceInfo$Builder addSourceFiles(Any any) {
        this.copyOnWrite();
        SourceInfo.access$200((SourceInfo)this.instance, any);
        return this;
    }

    public SourceInfo$Builder clearSourceFiles() {
        this.copyOnWrite();
        SourceInfo.access$500((SourceInfo)this.instance);
        return this;
    }

    public Any getSourceFiles(int n3) {
        return ((SourceInfo)this.instance).getSourceFiles(n3);
    }

    public int getSourceFilesCount() {
        return ((SourceInfo)this.instance).getSourceFilesCount();
    }

    public List getSourceFilesList() {
        return Collections.unmodifiableList(((SourceInfo)this.instance).getSourceFilesList());
    }

    public SourceInfo$Builder removeSourceFiles(int n3) {
        this.copyOnWrite();
        SourceInfo.access$600((SourceInfo)this.instance, n3);
        return this;
    }

    public SourceInfo$Builder setSourceFiles(int n3, Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        SourceInfo sourceInfo = (SourceInfo)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        SourceInfo.access$100(sourceInfo, n3, (Any)anyOrBuilder);
        return this;
    }

    public SourceInfo$Builder setSourceFiles(int n3, Any any) {
        this.copyOnWrite();
        SourceInfo.access$100((SourceInfo)this.instance, n3, any);
        return this;
    }
}

