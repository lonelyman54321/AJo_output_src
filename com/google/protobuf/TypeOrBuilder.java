/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.Field;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import java.util.List;

public interface TypeOrBuilder
extends MessageLiteOrBuilder {
    public String getEdition();

    public ByteString getEditionBytes();

    public Field getFields(int var1);

    public int getFieldsCount();

    public List getFieldsList();

    public String getName();

    public ByteString getNameBytes();

    public String getOneofs(int var1);

    public ByteString getOneofsBytes(int var1);

    public int getOneofsCount();

    public List getOneofsList();

    public Option getOptions(int var1);

    public int getOptionsCount();

    public List getOptionsList();

    public SourceContext getSourceContext();

    public Syntax getSyntax();

    public int getSyntaxValue();

    public boolean hasSourceContext();
}

