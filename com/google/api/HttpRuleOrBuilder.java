/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.CustomHttpPattern;
import com.google.api.HttpRule;
import com.google.api.HttpRule$PatternCase;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface HttpRuleOrBuilder
extends MessageLiteOrBuilder {
    public HttpRule getAdditionalBindings(int var1);

    public int getAdditionalBindingsCount();

    public List getAdditionalBindingsList();

    public String getBody();

    public ByteString getBodyBytes();

    public CustomHttpPattern getCustom();

    public String getDelete();

    public ByteString getDeleteBytes();

    public String getGet();

    public ByteString getGetBytes();

    public String getPatch();

    public ByteString getPatchBytes();

    public HttpRule$PatternCase getPatternCase();

    public String getPost();

    public ByteString getPostBytes();

    public String getPut();

    public ByteString getPutBytes();

    public String getResponseBody();

    public ByteString getResponseBodyBytes();

    public String getSelector();

    public ByteString getSelectorBytes();

    public boolean hasCustom();
}

