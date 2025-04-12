/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContext$1;
import com.google.protobuf.SourceContextOrBuilder;

public final class SourceContext$Builder
extends GeneratedMessageLite$Builder
implements SourceContextOrBuilder {
    private SourceContext$Builder() {
        SourceContext sourceContext = SourceContext.access$000();
        super(sourceContext);
    }

    public /* synthetic */ SourceContext$Builder(SourceContext$1 sourceContext$1) {
        this();
    }

    public SourceContext$Builder clearFileName() {
        this.copyOnWrite();
        SourceContext.access$200((SourceContext)this.instance);
        return this;
    }

    public String getFileName() {
        return ((SourceContext)this.instance).getFileName();
    }

    public ByteString getFileNameBytes() {
        return ((SourceContext)this.instance).getFileNameBytes();
    }

    public SourceContext$Builder setFileName(String string2) {
        this.copyOnWrite();
        SourceContext.access$100((SourceContext)this.instance, string2);
        return this;
    }

    public SourceContext$Builder setFileNameBytes(ByteString byteString) {
        this.copyOnWrite();
        SourceContext.access$300((SourceContext)this.instance, byteString);
        return this;
    }
}

