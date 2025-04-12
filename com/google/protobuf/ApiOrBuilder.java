/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import java.util.List;

public interface ApiOrBuilder
extends MessageLiteOrBuilder {
    public Method getMethods(int var1);

    public int getMethodsCount();

    public List getMethodsList();

    public Mixin getMixins(int var1);

    public int getMixinsCount();

    public List getMixinsList();

    public String getName();

    public ByteString getNameBytes();

    public Option getOptions(int var1);

    public int getOptionsCount();

    public List getOptionsList();

    public SourceContext getSourceContext();

    public Syntax getSyntax();

    public int getSyntaxValue();

    public String getVersion();

    public ByteString getVersionBytes();

    public boolean hasSourceContext();
}

