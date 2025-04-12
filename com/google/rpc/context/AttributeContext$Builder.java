/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.context.AttributeContext;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Api;
import com.google.rpc.context.AttributeContext$Api$Builder;
import com.google.rpc.context.AttributeContext$Peer;
import com.google.rpc.context.AttributeContext$Peer$Builder;
import com.google.rpc.context.AttributeContext$Request;
import com.google.rpc.context.AttributeContext$Request$Builder;
import com.google.rpc.context.AttributeContext$Resource;
import com.google.rpc.context.AttributeContext$Resource$Builder;
import com.google.rpc.context.AttributeContext$Response;
import com.google.rpc.context.AttributeContext$Response$Builder;
import com.google.rpc.context.AttributeContextOrBuilder;

public final class AttributeContext$Builder
extends GeneratedMessageLite$Builder
implements AttributeContextOrBuilder {
    private AttributeContext$Builder() {
        AttributeContext attributeContext = AttributeContext.access$10600();
        super(attributeContext);
    }

    public /* synthetic */ AttributeContext$Builder(AttributeContext$1 attributeContext$1) {
        this();
    }

    public AttributeContext$Builder clearApi() {
        this.copyOnWrite();
        AttributeContext.access$12700((AttributeContext)this.instance);
        return this;
    }

    public AttributeContext$Builder clearDestination() {
        this.copyOnWrite();
        AttributeContext.access$11500((AttributeContext)this.instance);
        return this;
    }

    public AttributeContext$Builder clearOrigin() {
        this.copyOnWrite();
        AttributeContext.access$10900((AttributeContext)this.instance);
        return this;
    }

    public AttributeContext$Builder clearRequest() {
        this.copyOnWrite();
        AttributeContext.access$11800((AttributeContext)this.instance);
        return this;
    }

    public AttributeContext$Builder clearResource() {
        this.copyOnWrite();
        AttributeContext.access$12400((AttributeContext)this.instance);
        return this;
    }

    public AttributeContext$Builder clearResponse() {
        this.copyOnWrite();
        AttributeContext.access$12100((AttributeContext)this.instance);
        return this;
    }

    public AttributeContext$Builder clearSource() {
        this.copyOnWrite();
        AttributeContext.access$11200((AttributeContext)this.instance);
        return this;
    }

    public AttributeContext$Api getApi() {
        return ((AttributeContext)this.instance).getApi();
    }

    public AttributeContext$Peer getDestination() {
        return ((AttributeContext)this.instance).getDestination();
    }

    public AttributeContext$Peer getOrigin() {
        return ((AttributeContext)this.instance).getOrigin();
    }

    public AttributeContext$Request getRequest() {
        return ((AttributeContext)this.instance).getRequest();
    }

    public AttributeContext$Resource getResource() {
        return ((AttributeContext)this.instance).getResource();
    }

    public AttributeContext$Response getResponse() {
        return ((AttributeContext)this.instance).getResponse();
    }

    public AttributeContext$Peer getSource() {
        return ((AttributeContext)this.instance).getSource();
    }

    public boolean hasApi() {
        return ((AttributeContext)this.instance).hasApi();
    }

    public boolean hasDestination() {
        return ((AttributeContext)this.instance).hasDestination();
    }

    public boolean hasOrigin() {
        return ((AttributeContext)this.instance).hasOrigin();
    }

    public boolean hasRequest() {
        return ((AttributeContext)this.instance).hasRequest();
    }

    public boolean hasResource() {
        return ((AttributeContext)this.instance).hasResource();
    }

    public boolean hasResponse() {
        return ((AttributeContext)this.instance).hasResponse();
    }

    public boolean hasSource() {
        return ((AttributeContext)this.instance).hasSource();
    }

    public AttributeContext$Builder mergeApi(AttributeContext$Api attributeContext$Api) {
        this.copyOnWrite();
        AttributeContext.access$12600((AttributeContext)this.instance, attributeContext$Api);
        return this;
    }

    public AttributeContext$Builder mergeDestination(AttributeContext$Peer attributeContext$Peer) {
        this.copyOnWrite();
        AttributeContext.access$11400((AttributeContext)this.instance, attributeContext$Peer);
        return this;
    }

    public AttributeContext$Builder mergeOrigin(AttributeContext$Peer attributeContext$Peer) {
        this.copyOnWrite();
        AttributeContext.access$10800((AttributeContext)this.instance, attributeContext$Peer);
        return this;
    }

    public AttributeContext$Builder mergeRequest(AttributeContext$Request attributeContext$Request) {
        this.copyOnWrite();
        AttributeContext.access$11700((AttributeContext)this.instance, attributeContext$Request);
        return this;
    }

    public AttributeContext$Builder mergeResource(AttributeContext$Resource attributeContext$Resource) {
        this.copyOnWrite();
        AttributeContext.access$12300((AttributeContext)this.instance, attributeContext$Resource);
        return this;
    }

    public AttributeContext$Builder mergeResponse(AttributeContext$Response attributeContext$Response) {
        this.copyOnWrite();
        AttributeContext.access$12000((AttributeContext)this.instance, attributeContext$Response);
        return this;
    }

    public AttributeContext$Builder mergeSource(AttributeContext$Peer attributeContext$Peer) {
        this.copyOnWrite();
        AttributeContext.access$11100((AttributeContext)this.instance, attributeContext$Peer);
        return this;
    }

    public AttributeContext$Builder setApi(AttributeContext$Api$Builder attributeContext$ApiOrBuilder) {
        this.copyOnWrite();
        AttributeContext attributeContext = (AttributeContext)this.instance;
        attributeContext$ApiOrBuilder = (AttributeContext$Api)attributeContext$ApiOrBuilder.build();
        AttributeContext.access$12500(attributeContext, (AttributeContext$Api)attributeContext$ApiOrBuilder);
        return this;
    }

    public AttributeContext$Builder setApi(AttributeContext$Api attributeContext$Api) {
        this.copyOnWrite();
        AttributeContext.access$12500((AttributeContext)this.instance, attributeContext$Api);
        return this;
    }

    public AttributeContext$Builder setDestination(AttributeContext$Peer$Builder attributeContext$PeerOrBuilder) {
        this.copyOnWrite();
        AttributeContext attributeContext = (AttributeContext)this.instance;
        attributeContext$PeerOrBuilder = (AttributeContext$Peer)attributeContext$PeerOrBuilder.build();
        AttributeContext.access$11300(attributeContext, (AttributeContext$Peer)attributeContext$PeerOrBuilder);
        return this;
    }

    public AttributeContext$Builder setDestination(AttributeContext$Peer attributeContext$Peer) {
        this.copyOnWrite();
        AttributeContext.access$11300((AttributeContext)this.instance, attributeContext$Peer);
        return this;
    }

    public AttributeContext$Builder setOrigin(AttributeContext$Peer$Builder attributeContext$PeerOrBuilder) {
        this.copyOnWrite();
        AttributeContext attributeContext = (AttributeContext)this.instance;
        attributeContext$PeerOrBuilder = (AttributeContext$Peer)attributeContext$PeerOrBuilder.build();
        AttributeContext.access$10700(attributeContext, (AttributeContext$Peer)attributeContext$PeerOrBuilder);
        return this;
    }

    public AttributeContext$Builder setOrigin(AttributeContext$Peer attributeContext$Peer) {
        this.copyOnWrite();
        AttributeContext.access$10700((AttributeContext)this.instance, attributeContext$Peer);
        return this;
    }

    public AttributeContext$Builder setRequest(AttributeContext$Request$Builder attributeContext$RequestOrBuilder) {
        this.copyOnWrite();
        AttributeContext attributeContext = (AttributeContext)this.instance;
        attributeContext$RequestOrBuilder = (AttributeContext$Request)attributeContext$RequestOrBuilder.build();
        AttributeContext.access$11600(attributeContext, (AttributeContext$Request)attributeContext$RequestOrBuilder);
        return this;
    }

    public AttributeContext$Builder setRequest(AttributeContext$Request attributeContext$Request) {
        this.copyOnWrite();
        AttributeContext.access$11600((AttributeContext)this.instance, attributeContext$Request);
        return this;
    }

    public AttributeContext$Builder setResource(AttributeContext$Resource$Builder attributeContext$ResourceOrBuilder) {
        this.copyOnWrite();
        AttributeContext attributeContext = (AttributeContext)this.instance;
        attributeContext$ResourceOrBuilder = (AttributeContext$Resource)attributeContext$ResourceOrBuilder.build();
        AttributeContext.access$12200(attributeContext, (AttributeContext$Resource)attributeContext$ResourceOrBuilder);
        return this;
    }

    public AttributeContext$Builder setResource(AttributeContext$Resource attributeContext$Resource) {
        this.copyOnWrite();
        AttributeContext.access$12200((AttributeContext)this.instance, attributeContext$Resource);
        return this;
    }

    public AttributeContext$Builder setResponse(AttributeContext$Response$Builder attributeContext$ResponseOrBuilder) {
        this.copyOnWrite();
        AttributeContext attributeContext = (AttributeContext)this.instance;
        attributeContext$ResponseOrBuilder = (AttributeContext$Response)attributeContext$ResponseOrBuilder.build();
        AttributeContext.access$11900(attributeContext, (AttributeContext$Response)attributeContext$ResponseOrBuilder);
        return this;
    }

    public AttributeContext$Builder setResponse(AttributeContext$Response attributeContext$Response) {
        this.copyOnWrite();
        AttributeContext.access$11900((AttributeContext)this.instance, attributeContext$Response);
        return this;
    }

    public AttributeContext$Builder setSource(AttributeContext$Peer$Builder attributeContext$PeerOrBuilder) {
        this.copyOnWrite();
        AttributeContext attributeContext = (AttributeContext)this.instance;
        attributeContext$PeerOrBuilder = (AttributeContext$Peer)attributeContext$PeerOrBuilder.build();
        AttributeContext.access$11000(attributeContext, (AttributeContext$Peer)attributeContext$PeerOrBuilder);
        return this;
    }

    public AttributeContext$Builder setSource(AttributeContext$Peer attributeContext$Peer) {
        this.copyOnWrite();
        AttributeContext.access$11000((AttributeContext)this.instance, attributeContext$Peer);
        return this;
    }
}

