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
import com.google.type.Expr$1;
import com.google.type.Expr$Builder;
import com.google.type.ExprOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Expr
extends GeneratedMessageLite
implements ExprOrBuilder {
    private static final Expr DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile Parser PARSER;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String description_;
    private String expression_;
    private String location_;
    private String title_;

    static {
        Expr expr;
        DEFAULT_INSTANCE = expr = new Expr();
        GeneratedMessageLite.registerDefaultInstance(Expr.class, expr);
    }

    private Expr() {
        String string2;
        this.expression_ = string2 = "";
        this.title_ = string2;
        this.description_ = string2;
        this.location_ = string2;
    }

    public static /* synthetic */ Expr access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Expr expr, String string2) {
        expr.setExpression(string2);
    }

    public static /* synthetic */ void access$1000(Expr expr, String string2) {
        expr.setLocation(string2);
    }

    public static /* synthetic */ void access$1100(Expr expr) {
        expr.clearLocation();
    }

    public static /* synthetic */ void access$1200(Expr expr, ByteString byteString) {
        expr.setLocationBytes(byteString);
    }

    public static /* synthetic */ void access$200(Expr expr) {
        expr.clearExpression();
    }

    public static /* synthetic */ void access$300(Expr expr, ByteString byteString) {
        expr.setExpressionBytes(byteString);
    }

    public static /* synthetic */ void access$400(Expr expr, String string2) {
        expr.setTitle(string2);
    }

    public static /* synthetic */ void access$500(Expr expr) {
        expr.clearTitle();
    }

    public static /* synthetic */ void access$600(Expr expr, ByteString byteString) {
        expr.setTitleBytes(byteString);
    }

    public static /* synthetic */ void access$700(Expr expr, String string2) {
        expr.setDescription(string2);
    }

    public static /* synthetic */ void access$800(Expr expr) {
        expr.clearDescription();
    }

    public static /* synthetic */ void access$900(Expr expr, ByteString byteString) {
        expr.setDescriptionBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = Expr.getDefaultInstance().getDescription();
    }

    private void clearExpression() {
        String string2;
        this.expression_ = string2 = Expr.getDefaultInstance().getExpression();
    }

    private void clearLocation() {
        String string2;
        this.location_ = string2 = Expr.getDefaultInstance().getLocation();
    }

    private void clearTitle() {
        String string2;
        this.title_ = string2 = Expr.getDefaultInstance().getTitle();
    }

    public static Expr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Expr$Builder newBuilder() {
        return (Expr$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Expr$Builder newBuilder(Expr expr) {
        return (Expr$Builder)DEFAULT_INSTANCE.createBuilder(expr);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream) {
        return (Expr)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Expr)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Expr parseFrom(ByteString byteString) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Expr parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Expr parseFrom(CodedInputStream codedInputStream) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Expr parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Expr parseFrom(InputStream inputStream) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Expr parseFrom(byte[] byArray) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Expr parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Expr)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string2) {
        string2.getClass();
        this.description_ = string2;
    }

    private void setDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.description_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setExpression(String string2) {
        string2.getClass();
        this.expression_ = string2;
    }

    private void setExpressionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.expression_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setLocation(String string2) {
        string2.getClass();
        this.location_ = string2;
    }

    private void setLocationBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.location_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setTitle(String string2) {
        string2.getClass();
        this.title_ = string2;
    }

    private void setTitleBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.title_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Expr$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Expr.class;
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
                objectArray = new Object[4];
                objectArray[0] = "expression_";
                objectArray[by2] = "title_";
                objectArray[2] = "description_";
                objectArray[3] = "location_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", objectArray);
            }
            case 2: {
                return new Expr$Builder(null);
            }
            case 1: 
        }
        return new Expr();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getExpression() {
        return this.expression_;
    }

    public ByteString getExpressionBytes() {
        return ByteString.copyFromUtf8(this.expression_);
    }

    public String getLocation() {
        return this.location_;
    }

    public ByteString getLocationBytes() {
        return ByteString.copyFromUtf8(this.location_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }
}

