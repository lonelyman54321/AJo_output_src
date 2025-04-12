/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.OAuthRequirements$1;
import com.google.api.OAuthRequirements$Builder;
import com.google.api.OAuthRequirementsOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OAuthRequirements
extends GeneratedMessageLite
implements OAuthRequirementsOrBuilder {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    private static final OAuthRequirements DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    private String canonicalScopes_ = "";

    static {
        OAuthRequirements oAuthRequirements;
        DEFAULT_INSTANCE = oAuthRequirements = new OAuthRequirements();
        GeneratedMessageLite.registerDefaultInstance(OAuthRequirements.class, oAuthRequirements);
    }

    private OAuthRequirements() {
    }

    public static /* synthetic */ OAuthRequirements access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(OAuthRequirements oAuthRequirements, String string2) {
        oAuthRequirements.setCanonicalScopes(string2);
    }

    public static /* synthetic */ void access$200(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.clearCanonicalScopes();
    }

    public static /* synthetic */ void access$300(OAuthRequirements oAuthRequirements, ByteString byteString) {
        oAuthRequirements.setCanonicalScopesBytes(byteString);
    }

    private void clearCanonicalScopes() {
        String string2;
        this.canonicalScopes_ = string2 = OAuthRequirements.getDefaultInstance().getCanonicalScopes();
    }

    public static OAuthRequirements getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static OAuthRequirements$Builder newBuilder() {
        return (OAuthRequirements$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static OAuthRequirements$Builder newBuilder(OAuthRequirements oAuthRequirements) {
        return (OAuthRequirements$Builder)DEFAULT_INSTANCE.createBuilder(oAuthRequirements);
    }

    public static OAuthRequirements parseDelimitedFrom(InputStream inputStream) {
        return (OAuthRequirements)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OAuthRequirements parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OAuthRequirements)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OAuthRequirements parseFrom(ByteString byteString) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static OAuthRequirements parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OAuthRequirements parseFrom(CodedInputStream codedInputStream) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static OAuthRequirements parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static OAuthRequirements parseFrom(InputStream inputStream) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static OAuthRequirements parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OAuthRequirements parseFrom(ByteBuffer byteBuffer) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static OAuthRequirements parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OAuthRequirements parseFrom(byte[] byArray) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static OAuthRequirements parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (OAuthRequirements)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCanonicalScopes(String string2) {
        string2.getClass();
        this.canonicalScopes_ = string2;
    }

    private void setCanonicalScopesBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.canonicalScopes_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = OAuthRequirements$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = object.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = OAuthRequirements.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                object = new Object[by2];
                object[0] = "canonicalScopes_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 2: {
                return new OAuthRequirements$Builder(null);
            }
            case 1: 
        }
        return new OAuthRequirements();
    }

    public String getCanonicalScopes() {
        return this.canonicalScopes_;
    }

    public ByteString getCanonicalScopesBytes() {
        return ByteString.copyFromUtf8(this.canonicalScopes_);
    }
}

