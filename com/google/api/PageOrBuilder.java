/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Page;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface PageOrBuilder
extends MessageLiteOrBuilder {
    public String getContent();

    public ByteString getContentBytes();

    public String getName();

    public ByteString getNameBytes();

    public Page getSubpages(int var1);

    public int getSubpagesCount();

    public List getSubpagesList();
}

