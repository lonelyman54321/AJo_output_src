/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.HttpBody$1;
import com.google.api.HttpBody$Builder;
import com.google.api.HttpBodyOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class HttpBody
extends GeneratedMessageLite
implements HttpBodyOrBuilder {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final HttpBody DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private String contentType_ = "";
    private ByteString data_;
    private Internal$ProtobufList extensions_;

    static {
        HttpBody httpBody;
        DEFAULT_INSTANCE = httpBody = new HttpBody();
        GeneratedMessageLite.registerDefaultInstance(HttpBody.class, httpBody);
    }

    private HttpBody() {
        Iterable iterable;
        this.data_ = iterable = ByteString.EMPTY;
        iterable = GeneratedMessageLite.emptyProtobufList();
        this.extensions_ = iterable;
    }

    public static /* synthetic */ HttpBody access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(HttpBody httpBody, String string2) {
        httpBody.setContentType(string2);
    }

    public static /* synthetic */ void access$1000(HttpBody httpBody) {
        httpBody.clearExtensions();
    }

    public static /* synthetic */ void access$1100(HttpBody httpBody, int n3) {
        httpBody.removeExtensions(n3);
    }

    public static /* synthetic */ void access$200(HttpBody httpBody) {
        httpBody.clearContentType();
    }

    public static /* synthetic */ void access$300(HttpBody httpBody, ByteString byteString) {
        httpBody.setContentTypeBytes(byteString);
    }

    public static /* synthetic */ void access$400(HttpBody httpBody, ByteString byteString) {
        httpBody.setData(byteString);
    }

    public static /* synthetic */ void access$500(HttpBody httpBody) {
        httpBody.clearData();
    }

    public static /* synthetic */ void access$600(HttpBody httpBody, int n3, Any any) {
        httpBody.setExtensions(n3, any);
    }

    public static /* synthetic */ void access$700(HttpBody httpBody, Any any) {
        httpBody.addExtensions(any);
    }

    public static /* synthetic */ void access$800(HttpBody httpBody, int n3, Any any) {
        httpBody.addExtensions(n3, any);
    }

    public static /* synthetic */ void access$900(HttpBody httpBody, Iterable iterable) {
        httpBody.addAllExtensions(iterable);
    }

    private void addAllExtensions(Iterable iterable) {
        this.ensureExtensionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.extensions_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addExtensions(int n3, Any any) {
        any.getClass();
        this.ensureExtensionsIsMutable();
        this.extensions_.add(n3, any);
    }

    private void addExtensions(Any any) {
        any.getClass();
        this.ensureExtensionsIsMutable();
        this.extensions_.add(any);
    }

    private void clearContentType() {
        String string2;
        this.contentType_ = string2 = HttpBody.getDefaultInstance().getContentType();
    }

    private void clearData() {
        ByteString byteString;
        this.data_ = byteString = HttpBody.getDefaultInstance().getData();
    }

    private void clearExtensions() {
        Internal$ProtobufList internal$ProtobufList;
        this.extensions_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureExtensionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.extensions_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.extensions_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static HttpBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static HttpBody$Builder newBuilder() {
        return (HttpBody$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpBody$Builder newBuilder(HttpBody httpBody) {
        return (HttpBody$Builder)DEFAULT_INSTANCE.createBuilder(httpBody);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream) {
        return (HttpBody)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpBody)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpBody parseFrom(ByteString byteString) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static HttpBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HttpBody parseFrom(CodedInputStream codedInputStream) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static HttpBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static HttpBody parseFrom(InputStream inputStream) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HttpBody parseFrom(byte[] byArray) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static HttpBody parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeExtensions(int n3) {
        this.ensureExtensionsIsMutable();
        this.extensions_.remove(n3);
    }

    private void setContentType(String string2) {
        string2.getClass();
        this.contentType_ = string2;
    }

    private void setContentTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.contentType_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setData(ByteString byteString) {
        byteString.getClass();
        this.data_ = byteString;
    }

    private void setExtensions(int n3, Any any) {
        any.getClass();
        this.ensureExtensionsIsMutable();
        this.extensions_.set(n3, any);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = HttpBody$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = HttpBody.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[4];
                objectArray[0] = "contentType_";
                objectArray[by2] = "data_";
                objectArray[2] = "extensions_";
                objectArray[3] = Any.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\n\u0003\u001b", objectArray);
            }
            case 2: {
                return new HttpBody$Builder(null);
            }
            case 1: 
        }
        return new HttpBody();
    }

    public String getContentType() {
        return this.contentType_;
    }

    public ByteString getContentTypeBytes() {
        return ByteString.copyFromUtf8(this.contentType_);
    }

    public ByteString getData() {
        return this.data_;
    }

    public Any getExtensions(int n3) {
        return (Any)this.extensions_.get(n3);
    }

    public int getExtensionsCount() {
        return this.extensions_.size();
    }

    public List getExtensionsList() {
        return this.extensions_;
    }

    public AnyOrBuilder getExtensionsOrBuilder(int n3) {
        return (AnyOrBuilder)this.extensions_.get(n3);
    }

    public List getExtensionsOrBuilderList() {
        return this.extensions_;
    }
}

