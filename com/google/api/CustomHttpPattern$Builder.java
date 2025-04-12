/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.CustomHttpPattern;
import com.google.api.CustomHttpPattern$1;
import com.google.api.CustomHttpPatternOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class CustomHttpPattern$Builder
extends GeneratedMessageLite$Builder
implements CustomHttpPatternOrBuilder {
    private CustomHttpPattern$Builder() {
        CustomHttpPattern customHttpPattern = CustomHttpPattern.access$000();
        super(customHttpPattern);
    }

    public /* synthetic */ CustomHttpPattern$Builder(CustomHttpPattern$1 customHttpPattern$1) {
        this();
    }

    public CustomHttpPattern$Builder clearKind() {
        this.copyOnWrite();
        CustomHttpPattern.access$200((CustomHttpPattern)this.instance);
        return this;
    }

    public CustomHttpPattern$Builder clearPath() {
        this.copyOnWrite();
        CustomHttpPattern.access$500((CustomHttpPattern)this.instance);
        return this;
    }

    public String getKind() {
        return ((CustomHttpPattern)this.instance).getKind();
    }

    public ByteString getKindBytes() {
        return ((CustomHttpPattern)this.instance).getKindBytes();
    }

    public String getPath() {
        return ((CustomHttpPattern)this.instance).getPath();
    }

    public ByteString getPathBytes() {
        return ((CustomHttpPattern)this.instance).getPathBytes();
    }

    public CustomHttpPattern$Builder setKind(String string2) {
        this.copyOnWrite();
        CustomHttpPattern.access$100((CustomHttpPattern)this.instance, string2);
        return this;
    }

    public CustomHttpPattern$Builder setKindBytes(ByteString byteString) {
        this.copyOnWrite();
        CustomHttpPattern.access$300((CustomHttpPattern)this.instance, byteString);
        return this;
    }

    public CustomHttpPattern$Builder setPath(String string2) {
        this.copyOnWrite();
        CustomHttpPattern.access$400((CustomHttpPattern)this.instance, string2);
        return this;
    }

    public CustomHttpPattern$Builder setPathBytes(ByteString byteString) {
        this.copyOnWrite();
        CustomHttpPattern.access$600((CustomHttpPattern)this.instance, byteString);
        return this;
    }
}

