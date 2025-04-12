/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Option;
import com.google.protobuf.Syntax;
import java.util.List;

public interface MethodOrBuilder
extends MessageLiteOrBuilder {
    public String getName();

    public ByteString getNameBytes();

    public Option getOptions(int var1);

    public int getOptionsCount();

    public List getOptionsList();

    public boolean getRequestStreaming();

    public String getRequestTypeUrl();

    public ByteString getRequestTypeUrlBytes();

    public boolean getResponseStreaming();

    public String getResponseTypeUrl();

    public ByteString getResponseTypeUrlBytes();

    public Syntax getSyntax();

    public int getSyntaxValue();
}

