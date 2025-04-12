/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.JwtLocation$1;
import com.google.api.JwtLocation$Builder;
import com.google.api.JwtLocation$InCase;
import com.google.api.JwtLocationOrBuilder;
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

public final class JwtLocation
extends GeneratedMessageLite
implements JwtLocationOrBuilder {
    private static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private int inCase_ = 0;
    private Object in_;
    private String valuePrefix_ = "";

    static {
        JwtLocation jwtLocation;
        DEFAULT_INSTANCE = jwtLocation = new JwtLocation();
        GeneratedMessageLite.registerDefaultInstance(JwtLocation.class, jwtLocation);
    }

    private JwtLocation() {
    }

    public static /* synthetic */ JwtLocation access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(JwtLocation jwtLocation) {
        jwtLocation.clearIn();
    }

    public static /* synthetic */ void access$1000(JwtLocation jwtLocation, ByteString byteString) {
        jwtLocation.setValuePrefixBytes(byteString);
    }

    public static /* synthetic */ void access$200(JwtLocation jwtLocation, String string2) {
        jwtLocation.setHeader(string2);
    }

    public static /* synthetic */ void access$300(JwtLocation jwtLocation) {
        jwtLocation.clearHeader();
    }

    public static /* synthetic */ void access$400(JwtLocation jwtLocation, ByteString byteString) {
        jwtLocation.setHeaderBytes(byteString);
    }

    public static /* synthetic */ void access$500(JwtLocation jwtLocation, String string2) {
        jwtLocation.setQuery(string2);
    }

    public static /* synthetic */ void access$600(JwtLocation jwtLocation) {
        jwtLocation.clearQuery();
    }

    public static /* synthetic */ void access$700(JwtLocation jwtLocation, ByteString byteString) {
        jwtLocation.setQueryBytes(byteString);
    }

    public static /* synthetic */ void access$800(JwtLocation jwtLocation, String string2) {
        jwtLocation.setValuePrefix(string2);
    }

    public static /* synthetic */ void access$900(JwtLocation jwtLocation) {
        jwtLocation.clearValuePrefix();
    }

    private void clearHeader() {
        int n3 = this.inCase_;
        int n4 = 1;
        if (n3 == n4) {
            this.inCase_ = 0;
            n3 = 0;
            this.in_ = null;
        }
    }

    private void clearIn() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    private void clearQuery() {
        int n3 = this.inCase_;
        int n4 = 2;
        if (n3 == n4) {
            this.inCase_ = 0;
            n3 = 0;
            this.in_ = null;
        }
    }

    private void clearValuePrefix() {
        String string2;
        this.valuePrefix_ = string2 = JwtLocation.getDefaultInstance().getValuePrefix();
    }

    public static JwtLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static JwtLocation$Builder newBuilder() {
        return (JwtLocation$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static JwtLocation$Builder newBuilder(JwtLocation jwtLocation) {
        return (JwtLocation$Builder)DEFAULT_INSTANCE.createBuilder(jwtLocation);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream) {
        return (JwtLocation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (JwtLocation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(ByteString byteString) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static JwtLocation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(CodedInputStream codedInputStream) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static JwtLocation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(InputStream inputStream) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(byte[] byArray) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static JwtLocation parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHeader(String string2) {
        string2.getClass();
        this.inCase_ = 1;
        this.in_ = string2;
    }

    private void setHeaderBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.in_ = object = ((ByteString)object).toStringUtf8();
        this.inCase_ = 1;
    }

    private void setQuery(String string2) {
        string2.getClass();
        this.inCase_ = 2;
        this.in_ = string2;
    }

    private void setQueryBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.in_ = object = ((ByteString)object).toStringUtf8();
        this.inCase_ = 2;
    }

    private void setValuePrefix(String string2) {
        string2.getClass();
        this.valuePrefix_ = string2;
    }

    private void setValuePrefixBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.valuePrefix_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = JwtLocation$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = JwtLocation.class;
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
                objectArray = new Object[3];
                objectArray[0] = "in_";
                objectArray[by2] = "inCase_";
                objectArray[2] = "valuePrefix_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u023b\u0000\u0002\u023b\u0000\u0003\u0208", objectArray);
            }
            case 2: {
                return new JwtLocation$Builder(null);
            }
            case 1: 
        }
        return new JwtLocation();
    }

    public String getHeader() {
        int n3 = this.inCase_;
        int n4 = 1;
        String string2 = n3 == n4 ? (String)this.in_ : "";
        return string2;
    }

    public ByteString getHeaderBytes() {
        int n3 = this.inCase_;
        int n4 = 1;
        String string2 = n3 == n4 ? (String)this.in_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public JwtLocation$InCase getInCase() {
        return JwtLocation$InCase.forNumber(this.inCase_);
    }

    public String getQuery() {
        int n3 = this.inCase_;
        int n4 = 2;
        String string2 = n3 == n4 ? (String)this.in_ : "";
        return string2;
    }

    public ByteString getQueryBytes() {
        int n3 = this.inCase_;
        int n4 = 2;
        String string2 = n3 == n4 ? (String)this.in_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public String getValuePrefix() {
        return this.valuePrefix_;
    }

    public ByteString getValuePrefixBytes() {
        return ByteString.copyFromUtf8(this.valuePrefix_);
    }
}

