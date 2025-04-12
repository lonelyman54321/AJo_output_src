/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.context.AttributeContext$Api;
import com.google.rpc.context.AttributeContext$Peer;
import com.google.rpc.context.AttributeContext$Request;
import com.google.rpc.context.AttributeContext$Resource;
import com.google.rpc.context.AttributeContext$Response;

public interface AttributeContextOrBuilder
extends MessageLiteOrBuilder {
    public AttributeContext.Api getApi();

    public AttributeContext.Peer getDestination();

    public AttributeContext.Peer getOrigin();

    public AttributeContext.Request getRequest();

    public AttributeContext.Resource getResource();

    public AttributeContext.Response getResponse();

    public AttributeContext.Peer getSource();

    public boolean hasApi();

    public boolean hasDestination();

    public boolean hasOrigin();

    public boolean hasRequest();

    public boolean hasResource();

    public boolean hasResponse();

    public boolean hasSource();
}

