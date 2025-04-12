/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.EnumValue;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import java.util.List;

public interface EnumOrBuilder
extends MessageLiteOrBuilder {
    public String getEdition();

    public ByteString getEditionBytes();

    public EnumValue getEnumvalue(int var1);

    public int getEnumvalueCount();

    public List getEnumvalueList();

    public String getName();

    public ByteString getNameBytes();

    public Option getOptions(int var1);

    public int getOptionsCount();

    public List getOptionsList();

    public SourceContext getSourceContext();

    public Syntax getSyntax();

    public int getSyntaxValue();

    public boolean hasSourceContext();
}

