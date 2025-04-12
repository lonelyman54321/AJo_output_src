/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Api;
import com.google.rpc.context.AttributeContext$Api$Builder;
import com.google.rpc.context.AttributeContext$ApiOrBuilder;
import com.google.rpc.context.AttributeContext$Builder;
import com.google.rpc.context.AttributeContext$Peer;
import com.google.rpc.context.AttributeContext$Peer$Builder;
import com.google.rpc.context.AttributeContext$PeerOrBuilder;
import com.google.rpc.context.AttributeContext$Request;
import com.google.rpc.context.AttributeContext$Request$Builder;
import com.google.rpc.context.AttributeContext$RequestOrBuilder;
import com.google.rpc.context.AttributeContext$Resource;
import com.google.rpc.context.AttributeContext$Resource$Builder;
import com.google.rpc.context.AttributeContext$ResourceOrBuilder;
import com.google.rpc.context.AttributeContext$Response;
import com.google.rpc.context.AttributeContext$Response$Builder;
import com.google.rpc.context.AttributeContext$ResponseOrBuilder;
import com.google.rpc.context.AttributeContextOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AttributeContext
extends GeneratedMessageLite
implements AttributeContextOrBuilder {
    public static final int API_FIELD_NUMBER = 6;
    private static final AttributeContext DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile Parser PARSER;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private AttributeContext$Api api_;
    private AttributeContext$Peer destination_;
    private AttributeContext$Peer origin_;
    private AttributeContext$Request request_;
    private AttributeContext$Resource resource_;
    private AttributeContext$Response response_;
    private AttributeContext$Peer source_;

    static {
        AttributeContext attributeContext;
        DEFAULT_INSTANCE = attributeContext = new AttributeContext();
        GeneratedMessageLite.registerDefaultInstance(AttributeContext.class, attributeContext);
    }

    private AttributeContext() {
    }

    public static /* synthetic */ AttributeContext access$10600() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$10700(AttributeContext attributeContext, AttributeContext$Peer attributeContext$Peer) {
        attributeContext.setOrigin(attributeContext$Peer);
    }

    public static /* synthetic */ void access$10800(AttributeContext attributeContext, AttributeContext$Peer attributeContext$Peer) {
        attributeContext.mergeOrigin(attributeContext$Peer);
    }

    public static /* synthetic */ void access$10900(AttributeContext attributeContext) {
        attributeContext.clearOrigin();
    }

    public static /* synthetic */ void access$11000(AttributeContext attributeContext, AttributeContext$Peer attributeContext$Peer) {
        attributeContext.setSource(attributeContext$Peer);
    }

    public static /* synthetic */ void access$11100(AttributeContext attributeContext, AttributeContext$Peer attributeContext$Peer) {
        attributeContext.mergeSource(attributeContext$Peer);
    }

    public static /* synthetic */ void access$11200(AttributeContext attributeContext) {
        attributeContext.clearSource();
    }

    public static /* synthetic */ void access$11300(AttributeContext attributeContext, AttributeContext$Peer attributeContext$Peer) {
        attributeContext.setDestination(attributeContext$Peer);
    }

    public static /* synthetic */ void access$11400(AttributeContext attributeContext, AttributeContext$Peer attributeContext$Peer) {
        attributeContext.mergeDestination(attributeContext$Peer);
    }

    public static /* synthetic */ void access$11500(AttributeContext attributeContext) {
        attributeContext.clearDestination();
    }

    public static /* synthetic */ void access$11600(AttributeContext attributeContext, AttributeContext$Request attributeContext$Request) {
        attributeContext.setRequest(attributeContext$Request);
    }

    public static /* synthetic */ void access$11700(AttributeContext attributeContext, AttributeContext$Request attributeContext$Request) {
        attributeContext.mergeRequest(attributeContext$Request);
    }

    public static /* synthetic */ void access$11800(AttributeContext attributeContext) {
        attributeContext.clearRequest();
    }

    public static /* synthetic */ void access$11900(AttributeContext attributeContext, AttributeContext$Response attributeContext$Response) {
        attributeContext.setResponse(attributeContext$Response);
    }

    public static /* synthetic */ void access$12000(AttributeContext attributeContext, AttributeContext$Response attributeContext$Response) {
        attributeContext.mergeResponse(attributeContext$Response);
    }

    public static /* synthetic */ void access$12100(AttributeContext attributeContext) {
        attributeContext.clearResponse();
    }

    public static /* synthetic */ void access$12200(AttributeContext attributeContext, AttributeContext$Resource attributeContext$Resource) {
        attributeContext.setResource(attributeContext$Resource);
    }

    public static /* synthetic */ void access$12300(AttributeContext attributeContext, AttributeContext$Resource attributeContext$Resource) {
        attributeContext.mergeResource(attributeContext$Resource);
    }

    public static /* synthetic */ void access$12400(AttributeContext attributeContext) {
        attributeContext.clearResource();
    }

    public static /* synthetic */ void access$12500(AttributeContext attributeContext, AttributeContext$Api attributeContext$Api) {
        attributeContext.setApi(attributeContext$Api);
    }

    public static /* synthetic */ void access$12600(AttributeContext attributeContext, AttributeContext$Api attributeContext$Api) {
        attributeContext.mergeApi(attributeContext$Api);
    }

    public static /* synthetic */ void access$12700(AttributeContext attributeContext) {
        attributeContext.clearApi();
    }

    private void clearApi() {
        this.api_ = null;
    }

    private void clearDestination() {
        this.destination_ = null;
    }

    private void clearOrigin() {
        this.origin_ = null;
    }

    private void clearRequest() {
        this.request_ = null;
    }

    private void clearResource() {
        this.resource_ = null;
    }

    private void clearResponse() {
        this.response_ = null;
    }

    private void clearSource() {
        this.source_ = null;
    }

    public static AttributeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeApi(AttributeContext$Api attributeContext$Api) {
        AttributeContext$Api attributeContext$Api2;
        attributeContext$Api.getClass();
        AttributeContext$ApiOrBuilder attributeContext$ApiOrBuilder = this.api_;
        if (attributeContext$ApiOrBuilder != null && attributeContext$ApiOrBuilder != (attributeContext$Api2 = AttributeContext$Api.getDefaultInstance())) {
            attributeContext$ApiOrBuilder = AttributeContext$Api.newBuilder(this.api_);
            this.api_ = attributeContext$Api = (AttributeContext$Api)((AttributeContext$Api$Builder)((GeneratedMessageLite$Builder)((Object)attributeContext$ApiOrBuilder)).mergeFrom(attributeContext$Api)).buildPartial();
        } else {
            this.api_ = attributeContext$Api;
        }
    }

    private void mergeDestination(AttributeContext$Peer attributeContext$Peer) {
        AttributeContext$Peer attributeContext$Peer2;
        attributeContext$Peer.getClass();
        AttributeContext$PeerOrBuilder attributeContext$PeerOrBuilder = this.destination_;
        if (attributeContext$PeerOrBuilder != null && attributeContext$PeerOrBuilder != (attributeContext$Peer2 = AttributeContext$Peer.getDefaultInstance())) {
            attributeContext$PeerOrBuilder = AttributeContext$Peer.newBuilder(this.destination_);
            this.destination_ = attributeContext$Peer = (AttributeContext$Peer)((AttributeContext$Peer$Builder)((GeneratedMessageLite$Builder)((Object)attributeContext$PeerOrBuilder)).mergeFrom(attributeContext$Peer)).buildPartial();
        } else {
            this.destination_ = attributeContext$Peer;
        }
    }

    private void mergeOrigin(AttributeContext$Peer attributeContext$Peer) {
        AttributeContext$Peer attributeContext$Peer2;
        attributeContext$Peer.getClass();
        AttributeContext$PeerOrBuilder attributeContext$PeerOrBuilder = this.origin_;
        if (attributeContext$PeerOrBuilder != null && attributeContext$PeerOrBuilder != (attributeContext$Peer2 = AttributeContext$Peer.getDefaultInstance())) {
            attributeContext$PeerOrBuilder = AttributeContext$Peer.newBuilder(this.origin_);
            this.origin_ = attributeContext$Peer = (AttributeContext$Peer)((AttributeContext$Peer$Builder)((GeneratedMessageLite$Builder)((Object)attributeContext$PeerOrBuilder)).mergeFrom(attributeContext$Peer)).buildPartial();
        } else {
            this.origin_ = attributeContext$Peer;
        }
    }

    private void mergeRequest(AttributeContext$Request attributeContext$Request) {
        AttributeContext$Request attributeContext$Request2;
        attributeContext$Request.getClass();
        AttributeContext$RequestOrBuilder attributeContext$RequestOrBuilder = this.request_;
        if (attributeContext$RequestOrBuilder != null && attributeContext$RequestOrBuilder != (attributeContext$Request2 = AttributeContext$Request.getDefaultInstance())) {
            attributeContext$RequestOrBuilder = AttributeContext$Request.newBuilder(this.request_);
            this.request_ = attributeContext$Request = (AttributeContext$Request)((AttributeContext$Request$Builder)((GeneratedMessageLite$Builder)((Object)attributeContext$RequestOrBuilder)).mergeFrom(attributeContext$Request)).buildPartial();
        } else {
            this.request_ = attributeContext$Request;
        }
    }

    private void mergeResource(AttributeContext$Resource attributeContext$Resource) {
        AttributeContext$Resource attributeContext$Resource2;
        attributeContext$Resource.getClass();
        AttributeContext$ResourceOrBuilder attributeContext$ResourceOrBuilder = this.resource_;
        if (attributeContext$ResourceOrBuilder != null && attributeContext$ResourceOrBuilder != (attributeContext$Resource2 = AttributeContext$Resource.getDefaultInstance())) {
            attributeContext$ResourceOrBuilder = AttributeContext$Resource.newBuilder(this.resource_);
            this.resource_ = attributeContext$Resource = (AttributeContext$Resource)((AttributeContext$Resource$Builder)((GeneratedMessageLite$Builder)((Object)attributeContext$ResourceOrBuilder)).mergeFrom(attributeContext$Resource)).buildPartial();
        } else {
            this.resource_ = attributeContext$Resource;
        }
    }

    private void mergeResponse(AttributeContext$Response attributeContext$Response) {
        AttributeContext$Response attributeContext$Response2;
        attributeContext$Response.getClass();
        AttributeContext$ResponseOrBuilder attributeContext$ResponseOrBuilder = this.response_;
        if (attributeContext$ResponseOrBuilder != null && attributeContext$ResponseOrBuilder != (attributeContext$Response2 = AttributeContext$Response.getDefaultInstance())) {
            attributeContext$ResponseOrBuilder = AttributeContext$Response.newBuilder(this.response_);
            this.response_ = attributeContext$Response = (AttributeContext$Response)((AttributeContext$Response$Builder)((GeneratedMessageLite$Builder)((Object)attributeContext$ResponseOrBuilder)).mergeFrom(attributeContext$Response)).buildPartial();
        } else {
            this.response_ = attributeContext$Response;
        }
    }

    private void mergeSource(AttributeContext$Peer attributeContext$Peer) {
        AttributeContext$Peer attributeContext$Peer2;
        attributeContext$Peer.getClass();
        AttributeContext$PeerOrBuilder attributeContext$PeerOrBuilder = this.source_;
        if (attributeContext$PeerOrBuilder != null && attributeContext$PeerOrBuilder != (attributeContext$Peer2 = AttributeContext$Peer.getDefaultInstance())) {
            attributeContext$PeerOrBuilder = AttributeContext$Peer.newBuilder(this.source_);
            this.source_ = attributeContext$Peer = (AttributeContext$Peer)((AttributeContext$Peer$Builder)((GeneratedMessageLite$Builder)((Object)attributeContext$PeerOrBuilder)).mergeFrom(attributeContext$Peer)).buildPartial();
        } else {
            this.source_ = attributeContext$Peer;
        }
    }

    public static AttributeContext$Builder newBuilder() {
        return (AttributeContext$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext$Builder newBuilder(AttributeContext attributeContext) {
        return (AttributeContext$Builder)DEFAULT_INSTANCE.createBuilder(attributeContext);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream) {
        return (AttributeContext)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(ByteString byteString) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(InputStream inputStream) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(byte[] byArray) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AttributeContext parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setApi(AttributeContext$Api attributeContext$Api) {
        attributeContext$Api.getClass();
        this.api_ = attributeContext$Api;
    }

    private void setDestination(AttributeContext$Peer attributeContext$Peer) {
        attributeContext$Peer.getClass();
        this.destination_ = attributeContext$Peer;
    }

    private void setOrigin(AttributeContext$Peer attributeContext$Peer) {
        attributeContext$Peer.getClass();
        this.origin_ = attributeContext$Peer;
    }

    private void setRequest(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.getClass();
        this.request_ = attributeContext$Request;
    }

    private void setResource(AttributeContext$Resource attributeContext$Resource) {
        attributeContext$Resource.getClass();
        this.resource_ = attributeContext$Resource;
    }

    private void setResponse(AttributeContext$Response attributeContext$Response) {
        attributeContext$Response.getClass();
        this.response_ = attributeContext$Response;
    }

    private void setSource(AttributeContext$Peer attributeContext$Peer) {
        attributeContext$Peer.getClass();
        this.source_ = attributeContext$Peer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = AttributeContext$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = AttributeContext.class;
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
                objectArray = new Object[7];
                objectArray[0] = "source_";
                objectArray[by2] = "destination_";
                objectArray[2] = "request_";
                objectArray[3] = "response_";
                objectArray[4] = "resource_";
                objectArray[5] = "api_";
                objectArray[6] = "origin_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", objectArray);
            }
            case 2: {
                return new AttributeContext$Builder(null);
            }
            case 1: 
        }
        return new AttributeContext();
    }

    public AttributeContext$Api getApi() {
        AttributeContext$Api attributeContext$Api = this.api_;
        if (attributeContext$Api == null) {
            attributeContext$Api = AttributeContext$Api.getDefaultInstance();
        }
        return attributeContext$Api;
    }

    public AttributeContext$Peer getDestination() {
        AttributeContext$Peer attributeContext$Peer = this.destination_;
        if (attributeContext$Peer == null) {
            attributeContext$Peer = AttributeContext$Peer.getDefaultInstance();
        }
        return attributeContext$Peer;
    }

    public AttributeContext$Peer getOrigin() {
        AttributeContext$Peer attributeContext$Peer = this.origin_;
        if (attributeContext$Peer == null) {
            attributeContext$Peer = AttributeContext$Peer.getDefaultInstance();
        }
        return attributeContext$Peer;
    }

    public AttributeContext$Request getRequest() {
        AttributeContext$Request attributeContext$Request = this.request_;
        if (attributeContext$Request == null) {
            attributeContext$Request = AttributeContext$Request.getDefaultInstance();
        }
        return attributeContext$Request;
    }

    public AttributeContext$Resource getResource() {
        AttributeContext$Resource attributeContext$Resource = this.resource_;
        if (attributeContext$Resource == null) {
            attributeContext$Resource = AttributeContext$Resource.getDefaultInstance();
        }
        return attributeContext$Resource;
    }

    public AttributeContext$Response getResponse() {
        AttributeContext$Response attributeContext$Response = this.response_;
        if (attributeContext$Response == null) {
            attributeContext$Response = AttributeContext$Response.getDefaultInstance();
        }
        return attributeContext$Response;
    }

    public AttributeContext$Peer getSource() {
        AttributeContext$Peer attributeContext$Peer = this.source_;
        if (attributeContext$Peer == null) {
            attributeContext$Peer = AttributeContext$Peer.getDefaultInstance();
        }
        return attributeContext$Peer;
    }

    public boolean hasApi() {
        boolean bl2;
        AttributeContext$Api attributeContext$Api = this.api_;
        if (attributeContext$Api != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributeContext$Api = null;
        }
        return bl2;
    }

    public boolean hasDestination() {
        boolean bl2;
        AttributeContext$Peer attributeContext$Peer = this.destination_;
        if (attributeContext$Peer != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributeContext$Peer = null;
        }
        return bl2;
    }

    public boolean hasOrigin() {
        boolean bl2;
        AttributeContext$Peer attributeContext$Peer = this.origin_;
        if (attributeContext$Peer != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributeContext$Peer = null;
        }
        return bl2;
    }

    public boolean hasRequest() {
        boolean bl2;
        AttributeContext$Request attributeContext$Request = this.request_;
        if (attributeContext$Request != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributeContext$Request = null;
        }
        return bl2;
    }

    public boolean hasResource() {
        boolean bl2;
        AttributeContext$Resource attributeContext$Resource = this.resource_;
        if (attributeContext$Resource != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributeContext$Resource = null;
        }
        return bl2;
    }

    public boolean hasResponse() {
        boolean bl2;
        AttributeContext$Response attributeContext$Response = this.response_;
        if (attributeContext$Response != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributeContext$Response = null;
        }
        return bl2;
    }

    public boolean hasSource() {
        boolean bl2;
        AttributeContext$Peer attributeContext$Peer = this.source_;
        if (attributeContext$Peer != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributeContext$Peer = null;
        }
        return bl2;
    }
}

