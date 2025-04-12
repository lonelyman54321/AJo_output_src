/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Struct;
import java.util.List;

public interface AttributeContext$AuthOrBuilder
extends MessageLiteOrBuilder {
    public String getAccessLevels(int var1);

    public ByteString getAccessLevelsBytes(int var1);

    public int getAccessLevelsCount();

    public List getAccessLevelsList();

    public String getAudiences(int var1);

    public ByteString getAudiencesBytes(int var1);

    public int getAudiencesCount();

    public List getAudiencesList();

    public Struct getClaims();

    public String getPresenter();

    public ByteString getPresenterBytes();

    public String getPrincipal();

    public ByteString getPrincipalBytes();

    public boolean hasClaims();
}

