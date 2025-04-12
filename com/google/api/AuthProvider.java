/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthProvider$1;
import com.google.api.AuthProvider$Builder;
import com.google.api.AuthProviderOrBuilder;
import com.google.api.JwtLocation;
import com.google.api.JwtLocationOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class AuthProvider
extends GeneratedMessageLite
implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile Parser PARSER;
    private String audiences_;
    private String authorizationUrl_;
    private String id_;
    private String issuer_;
    private String jwksUri_;
    private Internal$ProtobufList jwtLocations_;

    static {
        AuthProvider authProvider;
        DEFAULT_INSTANCE = authProvider = new AuthProvider();
        GeneratedMessageLite.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    private AuthProvider() {
        Object object = "";
        this.id_ = object;
        this.issuer_ = object;
        this.jwksUri_ = object;
        this.audiences_ = object;
        this.authorizationUrl_ = object;
        this.jwtLocations_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ AuthProvider access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(AuthProvider authProvider, String string2) {
        authProvider.setId(string2);
    }

    public static /* synthetic */ void access$1000(AuthProvider authProvider, String string2) {
        authProvider.setAudiences(string2);
    }

    public static /* synthetic */ void access$1100(AuthProvider authProvider) {
        authProvider.clearAudiences();
    }

    public static /* synthetic */ void access$1200(AuthProvider authProvider, ByteString byteString) {
        authProvider.setAudiencesBytes(byteString);
    }

    public static /* synthetic */ void access$1300(AuthProvider authProvider, String string2) {
        authProvider.setAuthorizationUrl(string2);
    }

    public static /* synthetic */ void access$1400(AuthProvider authProvider) {
        authProvider.clearAuthorizationUrl();
    }

    public static /* synthetic */ void access$1500(AuthProvider authProvider, ByteString byteString) {
        authProvider.setAuthorizationUrlBytes(byteString);
    }

    public static /* synthetic */ void access$1600(AuthProvider authProvider, int n3, JwtLocation jwtLocation) {
        authProvider.setJwtLocations(n3, jwtLocation);
    }

    public static /* synthetic */ void access$1700(AuthProvider authProvider, JwtLocation jwtLocation) {
        authProvider.addJwtLocations(jwtLocation);
    }

    public static /* synthetic */ void access$1800(AuthProvider authProvider, int n3, JwtLocation jwtLocation) {
        authProvider.addJwtLocations(n3, jwtLocation);
    }

    public static /* synthetic */ void access$1900(AuthProvider authProvider, Iterable iterable) {
        authProvider.addAllJwtLocations(iterable);
    }

    public static /* synthetic */ void access$200(AuthProvider authProvider) {
        authProvider.clearId();
    }

    public static /* synthetic */ void access$2000(AuthProvider authProvider) {
        authProvider.clearJwtLocations();
    }

    public static /* synthetic */ void access$2100(AuthProvider authProvider, int n3) {
        authProvider.removeJwtLocations(n3);
    }

    public static /* synthetic */ void access$300(AuthProvider authProvider, ByteString byteString) {
        authProvider.setIdBytes(byteString);
    }

    public static /* synthetic */ void access$400(AuthProvider authProvider, String string2) {
        authProvider.setIssuer(string2);
    }

    public static /* synthetic */ void access$500(AuthProvider authProvider) {
        authProvider.clearIssuer();
    }

    public static /* synthetic */ void access$600(AuthProvider authProvider, ByteString byteString) {
        authProvider.setIssuerBytes(byteString);
    }

    public static /* synthetic */ void access$700(AuthProvider authProvider, String string2) {
        authProvider.setJwksUri(string2);
    }

    public static /* synthetic */ void access$800(AuthProvider authProvider) {
        authProvider.clearJwksUri();
    }

    public static /* synthetic */ void access$900(AuthProvider authProvider, ByteString byteString) {
        authProvider.setJwksUriBytes(byteString);
    }

    private void addAllJwtLocations(Iterable iterable) {
        this.ensureJwtLocationsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.jwtLocations_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addJwtLocations(int n3, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        this.ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(n3, jwtLocation);
    }

    private void addJwtLocations(JwtLocation jwtLocation) {
        jwtLocation.getClass();
        this.ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jwtLocation);
    }

    private void clearAudiences() {
        String string2;
        this.audiences_ = string2 = AuthProvider.getDefaultInstance().getAudiences();
    }

    private void clearAuthorizationUrl() {
        String string2;
        this.authorizationUrl_ = string2 = AuthProvider.getDefaultInstance().getAuthorizationUrl();
    }

    private void clearId() {
        String string2;
        this.id_ = string2 = AuthProvider.getDefaultInstance().getId();
    }

    private void clearIssuer() {
        String string2;
        this.issuer_ = string2 = AuthProvider.getDefaultInstance().getIssuer();
    }

    private void clearJwksUri() {
        String string2;
        this.jwksUri_ = string2 = AuthProvider.getDefaultInstance().getJwksUri();
    }

    private void clearJwtLocations() {
        Internal$ProtobufList internal$ProtobufList;
        this.jwtLocations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureJwtLocationsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.jwtLocations_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.jwtLocations_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static AuthProvider$Builder newBuilder() {
        return (AuthProvider$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthProvider$Builder newBuilder(AuthProvider authProvider) {
        return (AuthProvider$Builder)DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) {
        return (AuthProvider)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthProvider)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteString byteString) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AuthProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(InputStream inputStream) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(byte[] byArray) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AuthProvider parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeJwtLocations(int n3) {
        this.ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(n3);
    }

    private void setAudiences(String string2) {
        string2.getClass();
        this.audiences_ = string2;
    }

    private void setAudiencesBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.audiences_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setAuthorizationUrl(String string2) {
        string2.getClass();
        this.authorizationUrl_ = string2;
    }

    private void setAuthorizationUrlBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.authorizationUrl_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setId(String string2) {
        string2.getClass();
        this.id_ = string2;
    }

    private void setIdBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.id_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setIssuer(String string2) {
        string2.getClass();
        this.issuer_ = string2;
    }

    private void setIssuerBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.issuer_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setJwksUri(String string2) {
        string2.getClass();
        this.jwksUri_ = string2;
    }

    private void setJwksUriBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.jwksUri_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setJwtLocations(int n3, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        this.ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(n3, jwtLocation);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = AuthProvider$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = AuthProvider.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[7];
                objectArray[0] = "id_";
                objectArray[by2] = "issuer_";
                objectArray[2] = "jwksUri_";
                objectArray[3] = "audiences_";
                objectArray[4] = "authorizationUrl_";
                objectArray[5] = "jwtLocations_";
                objectArray[6] = JwtLocation.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u001b", objectArray);
            }
            case 2: {
                return new AuthProvider$Builder(null);
            }
            case 1: 
        }
        return new AuthProvider();
    }

    public String getAudiences() {
        return this.audiences_;
    }

    public ByteString getAudiencesBytes() {
        return ByteString.copyFromUtf8(this.audiences_);
    }

    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    public ByteString getAuthorizationUrlBytes() {
        return ByteString.copyFromUtf8(this.authorizationUrl_);
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public String getIssuer() {
        return this.issuer_;
    }

    public ByteString getIssuerBytes() {
        return ByteString.copyFromUtf8(this.issuer_);
    }

    public String getJwksUri() {
        return this.jwksUri_;
    }

    public ByteString getJwksUriBytes() {
        return ByteString.copyFromUtf8(this.jwksUri_);
    }

    public JwtLocation getJwtLocations(int n3) {
        return (JwtLocation)this.jwtLocations_.get(n3);
    }

    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    public List getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public JwtLocationOrBuilder getJwtLocationsOrBuilder(int n3) {
        return (JwtLocationOrBuilder)this.jwtLocations_.get(n3);
    }

    public List getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }
}

