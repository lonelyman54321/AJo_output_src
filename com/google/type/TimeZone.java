/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.type.TimeZone$1;
import com.google.type.TimeZone$Builder;
import com.google.type.TimeZoneOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TimeZone
extends GeneratedMessageLite
implements TimeZoneOrBuilder {
    private static final TimeZone DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String id_;
    private String version_;

    static {
        TimeZone timeZone;
        DEFAULT_INSTANCE = timeZone = new TimeZone();
        GeneratedMessageLite.registerDefaultInstance(TimeZone.class, timeZone);
    }

    private TimeZone() {
        String string2;
        this.id_ = string2 = "";
        this.version_ = string2;
    }

    public static /* synthetic */ TimeZone access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(TimeZone timeZone, String string2) {
        timeZone.setId(string2);
    }

    public static /* synthetic */ void access$200(TimeZone timeZone) {
        timeZone.clearId();
    }

    public static /* synthetic */ void access$300(TimeZone timeZone, ByteString byteString) {
        timeZone.setIdBytes(byteString);
    }

    public static /* synthetic */ void access$400(TimeZone timeZone, String string2) {
        timeZone.setVersion(string2);
    }

    public static /* synthetic */ void access$500(TimeZone timeZone) {
        timeZone.clearVersion();
    }

    public static /* synthetic */ void access$600(TimeZone timeZone, ByteString byteString) {
        timeZone.setVersionBytes(byteString);
    }

    private void clearId() {
        String string2;
        this.id_ = string2 = TimeZone.getDefaultInstance().getId();
    }

    private void clearVersion() {
        String string2;
        this.version_ = string2 = TimeZone.getDefaultInstance().getVersion();
    }

    public static TimeZone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static TimeZone$Builder newBuilder() {
        return (TimeZone$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static TimeZone$Builder newBuilder(TimeZone timeZone) {
        return (TimeZone$Builder)DEFAULT_INSTANCE.createBuilder(timeZone);
    }

    public static TimeZone parseDelimitedFrom(InputStream inputStream) {
        return (TimeZone)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeZone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeZone)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimeZone parseFrom(ByteString byteString) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static TimeZone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TimeZone parseFrom(CodedInputStream codedInputStream) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static TimeZone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TimeZone parseFrom(InputStream inputStream) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static TimeZone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimeZone parseFrom(ByteBuffer byteBuffer) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static TimeZone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TimeZone parseFrom(byte[] byArray) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static TimeZone parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setId(String string2) {
        string2.getClass();
        this.id_ = string2;
    }

    private void setIdBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.id_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setVersion(String string2) {
        string2.getClass();
        this.version_ = string2;
    }

    private void setVersionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.version_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = TimeZone$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = TimeZone.class;
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
                object = new Object[2];
                object[0] = "id_";
                object[by2] = "version_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new TimeZone$Builder(null);
            }
            case 1: 
        }
        return new TimeZone();
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }
}

