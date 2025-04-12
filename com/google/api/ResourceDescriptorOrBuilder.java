/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ResourceDescriptor$History;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ResourceDescriptorOrBuilder
extends MessageLiteOrBuilder {
    public ResourceDescriptor$History getHistory();

    public int getHistoryValue();

    public String getNameField();

    public ByteString getNameFieldBytes();

    public String getPattern(int var1);

    public ByteString getPatternBytes(int var1);

    public int getPatternCount();

    public List getPatternList();

    public String getPlural();

    public ByteString getPluralBytes();

    public String getSingular();

    public ByteString getSingularBytes();

    public String getType();

    public ByteString getTypeBytes();
}

