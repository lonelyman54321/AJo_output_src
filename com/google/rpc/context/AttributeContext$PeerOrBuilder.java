/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface AttributeContext$PeerOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsLabels(String var1);

    public String getIp();

    public ByteString getIpBytes();

    public Map getLabels();

    public int getLabelsCount();

    public Map getLabelsMap();

    public String getLabelsOrDefault(String var1, String var2);

    public String getLabelsOrThrow(String var1);

    public long getPort();

    public String getPrincipal();

    public ByteString getPrincipalBytes();

    public String getRegionCode();

    public ByteString getRegionCodeBytes();
}

