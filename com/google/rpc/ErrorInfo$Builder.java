/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.ErrorInfo;
import com.google.rpc.ErrorInfo$1;
import com.google.rpc.ErrorInfoOrBuilder;
import java.util.Collections;
import java.util.Map;

public final class ErrorInfo$Builder
extends GeneratedMessageLite$Builder
implements ErrorInfoOrBuilder {
    private ErrorInfo$Builder() {
        ErrorInfo errorInfo = ErrorInfo.access$000();
        super(errorInfo);
    }

    public /* synthetic */ ErrorInfo$Builder(ErrorInfo$1 errorInfo$1) {
        this();
    }

    public ErrorInfo$Builder clearDomain() {
        this.copyOnWrite();
        ErrorInfo.access$500((ErrorInfo)this.instance);
        return this;
    }

    public ErrorInfo$Builder clearMetadata() {
        this.copyOnWrite();
        ErrorInfo.access$700((ErrorInfo)this.instance).clear();
        return this;
    }

    public ErrorInfo$Builder clearReason() {
        this.copyOnWrite();
        ErrorInfo.access$200((ErrorInfo)this.instance);
        return this;
    }

    public boolean containsMetadata(String string2) {
        string2.getClass();
        return ((ErrorInfo)this.instance).getMetadataMap().containsKey(string2);
    }

    public String getDomain() {
        return ((ErrorInfo)this.instance).getDomain();
    }

    public ByteString getDomainBytes() {
        return ((ErrorInfo)this.instance).getDomainBytes();
    }

    public Map getMetadata() {
        return this.getMetadataMap();
    }

    public int getMetadataCount() {
        return ((ErrorInfo)this.instance).getMetadataMap().size();
    }

    public Map getMetadataMap() {
        return Collections.unmodifiableMap(((ErrorInfo)this.instance).getMetadataMap());
    }

    public String getMetadataOrDefault(String string2, String string3) {
        string2.getClass();
        Map map2 = ((ErrorInfo)this.instance).getMetadataMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string3 = string2 = map2.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getMetadataOrThrow(String object) {
        object.getClass();
        Map map2 = ((ErrorInfo)this.instance).getMetadataMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (String)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getReason() {
        return ((ErrorInfo)this.instance).getReason();
    }

    public ByteString getReasonBytes() {
        return ((ErrorInfo)this.instance).getReasonBytes();
    }

    public ErrorInfo$Builder putAllMetadata(Map map2) {
        this.copyOnWrite();
        ErrorInfo.access$700((ErrorInfo)this.instance).putAll(map2);
        return this;
    }

    public ErrorInfo$Builder putMetadata(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        this.copyOnWrite();
        ErrorInfo.access$700((ErrorInfo)this.instance).put(string2, string3);
        return this;
    }

    public ErrorInfo$Builder removeMetadata(String string2) {
        string2.getClass();
        this.copyOnWrite();
        ErrorInfo.access$700((ErrorInfo)this.instance).remove(string2);
        return this;
    }

    public ErrorInfo$Builder setDomain(String string2) {
        this.copyOnWrite();
        ErrorInfo.access$400((ErrorInfo)this.instance, string2);
        return this;
    }

    public ErrorInfo$Builder setDomainBytes(ByteString byteString) {
        this.copyOnWrite();
        ErrorInfo.access$600((ErrorInfo)this.instance, byteString);
        return this;
    }

    public ErrorInfo$Builder setReason(String string2) {
        this.copyOnWrite();
        ErrorInfo.access$100((ErrorInfo)this.instance, string2);
        return this;
    }

    public ErrorInfo$Builder setReasonBytes(ByteString byteString) {
        this.copyOnWrite();
        ErrorInfo.access$300((ErrorInfo)this.instance, byteString);
        return this;
    }
}

