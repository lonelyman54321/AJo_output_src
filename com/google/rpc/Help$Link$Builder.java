/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.Help$1;
import com.google.rpc.Help$Link;
import com.google.rpc.Help$LinkOrBuilder;

public final class Help$Link$Builder
extends GeneratedMessageLite$Builder
implements Help$LinkOrBuilder {
    private Help$Link$Builder() {
        Help$Link help$Link = Help$Link.access$000();
        super(help$Link);
    }

    public /* synthetic */ Help$Link$Builder(Help$1 help$1) {
        this();
    }

    public Help$Link$Builder clearDescription() {
        this.copyOnWrite();
        Help$Link.access$200((Help$Link)this.instance);
        return this;
    }

    public Help$Link$Builder clearUrl() {
        this.copyOnWrite();
        Help$Link.access$500((Help$Link)this.instance);
        return this;
    }

    public String getDescription() {
        return ((Help$Link)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((Help$Link)this.instance).getDescriptionBytes();
    }

    public String getUrl() {
        return ((Help$Link)this.instance).getUrl();
    }

    public ByteString getUrlBytes() {
        return ((Help$Link)this.instance).getUrlBytes();
    }

    public Help$Link$Builder setDescription(String string2) {
        this.copyOnWrite();
        Help$Link.access$100((Help$Link)this.instance, string2);
        return this;
    }

    public Help$Link$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        Help$Link.access$300((Help$Link)this.instance, byteString);
        return this;
    }

    public Help$Link$Builder setUrl(String string2) {
        this.copyOnWrite();
        Help$Link.access$400((Help$Link)this.instance, string2);
        return this;
    }

    public Help$Link$Builder setUrlBytes(ByteString byteString) {
        this.copyOnWrite();
        Help$Link.access$600((Help$Link)this.instance, byteString);
        return this;
    }
}

