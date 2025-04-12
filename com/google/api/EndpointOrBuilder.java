/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface EndpointOrBuilder
extends MessageLiteOrBuilder {
    public String getAliases(int var1);

    public ByteString getAliasesBytes(int var1);

    public int getAliasesCount();

    public List getAliasesList();

    public boolean getAllowCors();

    public String getFeatures(int var1);

    public ByteString getFeaturesBytes(int var1);

    public int getFeaturesCount();

    public List getFeaturesList();

    public String getName();

    public ByteString getNameBytes();

    public String getTarget();

    public ByteString getTargetBytes();
}

