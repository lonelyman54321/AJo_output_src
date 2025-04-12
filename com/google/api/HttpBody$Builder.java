/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.HttpBody;
import com.google.api.HttpBody$1;
import com.google.api.HttpBodyOrBuilder;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class HttpBody$Builder
extends GeneratedMessageLite$Builder
implements HttpBodyOrBuilder {
    private HttpBody$Builder() {
        HttpBody httpBody = HttpBody.access$000();
        super(httpBody);
    }

    public /* synthetic */ HttpBody$Builder(HttpBody$1 httpBody$1) {
        this();
    }

    public HttpBody$Builder addAllExtensions(Iterable iterable) {
        this.copyOnWrite();
        HttpBody.access$900((HttpBody)this.instance, iterable);
        return this;
    }

    public HttpBody$Builder addExtensions(int n3, Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        HttpBody httpBody = (HttpBody)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        HttpBody.access$800(httpBody, n3, (Any)anyOrBuilder);
        return this;
    }

    public HttpBody$Builder addExtensions(int n3, Any any) {
        this.copyOnWrite();
        HttpBody.access$800((HttpBody)this.instance, n3, any);
        return this;
    }

    public HttpBody$Builder addExtensions(Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        HttpBody httpBody = (HttpBody)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        HttpBody.access$700(httpBody, (Any)anyOrBuilder);
        return this;
    }

    public HttpBody$Builder addExtensions(Any any) {
        this.copyOnWrite();
        HttpBody.access$700((HttpBody)this.instance, any);
        return this;
    }

    public HttpBody$Builder clearContentType() {
        this.copyOnWrite();
        HttpBody.access$200((HttpBody)this.instance);
        return this;
    }

    public HttpBody$Builder clearData() {
        this.copyOnWrite();
        HttpBody.access$500((HttpBody)this.instance);
        return this;
    }

    public HttpBody$Builder clearExtensions() {
        this.copyOnWrite();
        HttpBody.access$1000((HttpBody)this.instance);
        return this;
    }

    public String getContentType() {
        return ((HttpBody)this.instance).getContentType();
    }

    public ByteString getContentTypeBytes() {
        return ((HttpBody)this.instance).getContentTypeBytes();
    }

    public ByteString getData() {
        return ((HttpBody)this.instance).getData();
    }

    public Any getExtensions(int n3) {
        return ((HttpBody)this.instance).getExtensions(n3);
    }

    public int getExtensionsCount() {
        return ((HttpBody)this.instance).getExtensionsCount();
    }

    public List getExtensionsList() {
        return Collections.unmodifiableList(((HttpBody)this.instance).getExtensionsList());
    }

    public HttpBody$Builder removeExtensions(int n3) {
        this.copyOnWrite();
        HttpBody.access$1100((HttpBody)this.instance, n3);
        return this;
    }

    public HttpBody$Builder setContentType(String string2) {
        this.copyOnWrite();
        HttpBody.access$100((HttpBody)this.instance, string2);
        return this;
    }

    public HttpBody$Builder setContentTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpBody.access$300((HttpBody)this.instance, byteString);
        return this;
    }

    public HttpBody$Builder setData(ByteString byteString) {
        this.copyOnWrite();
        HttpBody.access$400((HttpBody)this.instance, byteString);
        return this;
    }

    public HttpBody$Builder setExtensions(int n3, Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        HttpBody httpBody = (HttpBody)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        HttpBody.access$600(httpBody, n3, (Any)anyOrBuilder);
        return this;
    }

    public HttpBody$Builder setExtensions(int n3, Any any) {
        this.copyOnWrite();
        HttpBody.access$600((HttpBody)this.instance, n3, any);
        return this;
    }
}

