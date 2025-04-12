/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.JwtLocation;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface AuthProviderOrBuilder
extends MessageLiteOrBuilder {
    public String getAudiences();

    public ByteString getAudiencesBytes();

    public String getAuthorizationUrl();

    public ByteString getAuthorizationUrlBytes();

    public String getId();

    public ByteString getIdBytes();

    public String getIssuer();

    public ByteString getIssuerBytes();

    public String getJwksUri();

    public ByteString getJwksUriBytes();

    public JwtLocation getJwtLocations(int var1);

    public int getJwtLocationsCount();

    public List getJwtLocationsList();
}

