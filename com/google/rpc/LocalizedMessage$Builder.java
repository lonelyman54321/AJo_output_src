/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.LocalizedMessage;
import com.google.rpc.LocalizedMessage$1;
import com.google.rpc.LocalizedMessageOrBuilder;

public final class LocalizedMessage$Builder
extends GeneratedMessageLite$Builder
implements LocalizedMessageOrBuilder {
    private LocalizedMessage$Builder() {
        LocalizedMessage localizedMessage = LocalizedMessage.access$000();
        super(localizedMessage);
    }

    public /* synthetic */ LocalizedMessage$Builder(LocalizedMessage$1 localizedMessage$1) {
        this();
    }

    public LocalizedMessage$Builder clearLocale() {
        this.copyOnWrite();
        LocalizedMessage.access$200((LocalizedMessage)this.instance);
        return this;
    }

    public LocalizedMessage$Builder clearMessage() {
        this.copyOnWrite();
        LocalizedMessage.access$500((LocalizedMessage)this.instance);
        return this;
    }

    public String getLocale() {
        return ((LocalizedMessage)this.instance).getLocale();
    }

    public ByteString getLocaleBytes() {
        return ((LocalizedMessage)this.instance).getLocaleBytes();
    }

    public String getMessage() {
        return ((LocalizedMessage)this.instance).getMessage();
    }

    public ByteString getMessageBytes() {
        return ((LocalizedMessage)this.instance).getMessageBytes();
    }

    public LocalizedMessage$Builder setLocale(String string2) {
        this.copyOnWrite();
        LocalizedMessage.access$100((LocalizedMessage)this.instance, string2);
        return this;
    }

    public LocalizedMessage$Builder setLocaleBytes(ByteString byteString) {
        this.copyOnWrite();
        LocalizedMessage.access$300((LocalizedMessage)this.instance, byteString);
        return this;
    }

    public LocalizedMessage$Builder setMessage(String string2) {
        this.copyOnWrite();
        LocalizedMessage.access$400((LocalizedMessage)this.instance, string2);
        return this;
    }

    public LocalizedMessage$Builder setMessageBytes(ByteString byteString) {
        this.copyOnWrite();
        LocalizedMessage.access$600((LocalizedMessage)this.instance, byteString);
        return this;
    }
}

