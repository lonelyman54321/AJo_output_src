/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthProvider$1;
import com.google.api.AuthProviderOrBuilder;
import com.google.api.JwtLocation;
import com.google.api.JwtLocation$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class AuthProvider$Builder
extends GeneratedMessageLite$Builder
implements AuthProviderOrBuilder {
    private AuthProvider$Builder() {
        AuthProvider authProvider = AuthProvider.access$000();
        super(authProvider);
    }

    public /* synthetic */ AuthProvider$Builder(AuthProvider$1 authProvider$1) {
        this();
    }

    public AuthProvider$Builder addAllJwtLocations(Iterable iterable) {
        this.copyOnWrite();
        AuthProvider.access$1900((AuthProvider)this.instance, iterable);
        return this;
    }

    public AuthProvider$Builder addJwtLocations(int n3, JwtLocation$Builder jwtLocationOrBuilder) {
        this.copyOnWrite();
        AuthProvider authProvider = (AuthProvider)this.instance;
        jwtLocationOrBuilder = (JwtLocation)jwtLocationOrBuilder.build();
        AuthProvider.access$1800(authProvider, n3, (JwtLocation)jwtLocationOrBuilder);
        return this;
    }

    public AuthProvider$Builder addJwtLocations(int n3, JwtLocation jwtLocation) {
        this.copyOnWrite();
        AuthProvider.access$1800((AuthProvider)this.instance, n3, jwtLocation);
        return this;
    }

    public AuthProvider$Builder addJwtLocations(JwtLocation$Builder jwtLocationOrBuilder) {
        this.copyOnWrite();
        AuthProvider authProvider = (AuthProvider)this.instance;
        jwtLocationOrBuilder = (JwtLocation)jwtLocationOrBuilder.build();
        AuthProvider.access$1700(authProvider, (JwtLocation)jwtLocationOrBuilder);
        return this;
    }

    public AuthProvider$Builder addJwtLocations(JwtLocation jwtLocation) {
        this.copyOnWrite();
        AuthProvider.access$1700((AuthProvider)this.instance, jwtLocation);
        return this;
    }

    public AuthProvider$Builder clearAudiences() {
        this.copyOnWrite();
        AuthProvider.access$1100((AuthProvider)this.instance);
        return this;
    }

    public AuthProvider$Builder clearAuthorizationUrl() {
        this.copyOnWrite();
        AuthProvider.access$1400((AuthProvider)this.instance);
        return this;
    }

    public AuthProvider$Builder clearId() {
        this.copyOnWrite();
        AuthProvider.access$200((AuthProvider)this.instance);
        return this;
    }

    public AuthProvider$Builder clearIssuer() {
        this.copyOnWrite();
        AuthProvider.access$500((AuthProvider)this.instance);
        return this;
    }

    public AuthProvider$Builder clearJwksUri() {
        this.copyOnWrite();
        AuthProvider.access$800((AuthProvider)this.instance);
        return this;
    }

    public AuthProvider$Builder clearJwtLocations() {
        this.copyOnWrite();
        AuthProvider.access$2000((AuthProvider)this.instance);
        return this;
    }

    public String getAudiences() {
        return ((AuthProvider)this.instance).getAudiences();
    }

    public ByteString getAudiencesBytes() {
        return ((AuthProvider)this.instance).getAudiencesBytes();
    }

    public String getAuthorizationUrl() {
        return ((AuthProvider)this.instance).getAuthorizationUrl();
    }

    public ByteString getAuthorizationUrlBytes() {
        return ((AuthProvider)this.instance).getAuthorizationUrlBytes();
    }

    public String getId() {
        return ((AuthProvider)this.instance).getId();
    }

    public ByteString getIdBytes() {
        return ((AuthProvider)this.instance).getIdBytes();
    }

    public String getIssuer() {
        return ((AuthProvider)this.instance).getIssuer();
    }

    public ByteString getIssuerBytes() {
        return ((AuthProvider)this.instance).getIssuerBytes();
    }

    public String getJwksUri() {
        return ((AuthProvider)this.instance).getJwksUri();
    }

    public ByteString getJwksUriBytes() {
        return ((AuthProvider)this.instance).getJwksUriBytes();
    }

    public JwtLocation getJwtLocations(int n3) {
        return ((AuthProvider)this.instance).getJwtLocations(n3);
    }

    public int getJwtLocationsCount() {
        return ((AuthProvider)this.instance).getJwtLocationsCount();
    }

    public List getJwtLocationsList() {
        return Collections.unmodifiableList(((AuthProvider)this.instance).getJwtLocationsList());
    }

    public AuthProvider$Builder removeJwtLocations(int n3) {
        this.copyOnWrite();
        AuthProvider.access$2100((AuthProvider)this.instance, n3);
        return this;
    }

    public AuthProvider$Builder setAudiences(String string2) {
        this.copyOnWrite();
        AuthProvider.access$1000((AuthProvider)this.instance, string2);
        return this;
    }

    public AuthProvider$Builder setAudiencesBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthProvider.access$1200((AuthProvider)this.instance, byteString);
        return this;
    }

    public AuthProvider$Builder setAuthorizationUrl(String string2) {
        this.copyOnWrite();
        AuthProvider.access$1300((AuthProvider)this.instance, string2);
        return this;
    }

    public AuthProvider$Builder setAuthorizationUrlBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthProvider.access$1500((AuthProvider)this.instance, byteString);
        return this;
    }

    public AuthProvider$Builder setId(String string2) {
        this.copyOnWrite();
        AuthProvider.access$100((AuthProvider)this.instance, string2);
        return this;
    }

    public AuthProvider$Builder setIdBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthProvider.access$300((AuthProvider)this.instance, byteString);
        return this;
    }

    public AuthProvider$Builder setIssuer(String string2) {
        this.copyOnWrite();
        AuthProvider.access$400((AuthProvider)this.instance, string2);
        return this;
    }

    public AuthProvider$Builder setIssuerBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthProvider.access$600((AuthProvider)this.instance, byteString);
        return this;
    }

    public AuthProvider$Builder setJwksUri(String string2) {
        this.copyOnWrite();
        AuthProvider.access$700((AuthProvider)this.instance, string2);
        return this;
    }

    public AuthProvider$Builder setJwksUriBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthProvider.access$900((AuthProvider)this.instance, byteString);
        return this;
    }

    public AuthProvider$Builder setJwtLocations(int n3, JwtLocation$Builder jwtLocationOrBuilder) {
        this.copyOnWrite();
        AuthProvider authProvider = (AuthProvider)this.instance;
        jwtLocationOrBuilder = (JwtLocation)jwtLocationOrBuilder.build();
        AuthProvider.access$1600(authProvider, n3, (JwtLocation)jwtLocationOrBuilder);
        return this;
    }

    public AuthProvider$Builder setJwtLocations(int n3, JwtLocation jwtLocation) {
        this.copyOnWrite();
        AuthProvider.access$1600((AuthProvider)this.instance, n3, jwtLocation);
        return this;
    }
}

