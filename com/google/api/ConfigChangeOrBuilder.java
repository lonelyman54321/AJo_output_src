/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Advice;
import com.google.api.ChangeType;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ConfigChangeOrBuilder
extends MessageLiteOrBuilder {
    public Advice getAdvices(int var1);

    public int getAdvicesCount();

    public List getAdvicesList();

    public ChangeType getChangeType();

    public int getChangeTypeValue();

    public String getElement();

    public ByteString getElementBytes();

    public String getNewValue();

    public ByteString getNewValueBytes();

    public String getOldValue();

    public ByteString getOldValueBytes();
}

