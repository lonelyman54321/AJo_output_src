/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Option;
import java.util.List;

public interface EnumValueOrBuilder
extends MessageLiteOrBuilder {
    public String getName();

    public ByteString getNameBytes();

    public int getNumber();

    public Option getOptions(int var1);

    public int getOptionsCount();

    public List getOptionsList();
}

