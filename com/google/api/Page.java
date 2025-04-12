/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Page$1;
import com.google.api.Page$Builder;
import com.google.api.PageOrBuilder;
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

public final class Page
extends GeneratedMessageLite
implements PageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Page DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String content_;
    private String name_;
    private Internal$ProtobufList subpages_;

    static {
        Page page;
        DEFAULT_INSTANCE = page = new Page();
        GeneratedMessageLite.registerDefaultInstance(Page.class, page);
    }

    private Page() {
        Object object = "";
        this.name_ = object;
        this.content_ = object;
        this.subpages_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Page access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Page page, String string2) {
        page.setName(string2);
    }

    public static /* synthetic */ void access$1000(Page page, Iterable iterable) {
        page.addAllSubpages(iterable);
    }

    public static /* synthetic */ void access$1100(Page page) {
        page.clearSubpages();
    }

    public static /* synthetic */ void access$1200(Page page, int n3) {
        page.removeSubpages(n3);
    }

    public static /* synthetic */ void access$200(Page page) {
        page.clearName();
    }

    public static /* synthetic */ void access$300(Page page, ByteString byteString) {
        page.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Page page, String string2) {
        page.setContent(string2);
    }

    public static /* synthetic */ void access$500(Page page) {
        page.clearContent();
    }

    public static /* synthetic */ void access$600(Page page, ByteString byteString) {
        page.setContentBytes(byteString);
    }

    public static /* synthetic */ void access$700(Page page, int n3, Page page2) {
        page.setSubpages(n3, page2);
    }

    public static /* synthetic */ void access$800(Page page, Page page2) {
        page.addSubpages(page2);
    }

    public static /* synthetic */ void access$900(Page page, int n3, Page page2) {
        page.addSubpages(n3, page2);
    }

    private void addAllSubpages(Iterable iterable) {
        this.ensureSubpagesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.subpages_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addSubpages(int n3, Page page) {
        page.getClass();
        this.ensureSubpagesIsMutable();
        this.subpages_.add(n3, page);
    }

    private void addSubpages(Page page) {
        page.getClass();
        this.ensureSubpagesIsMutable();
        this.subpages_.add(page);
    }

    private void clearContent() {
        String string2;
        this.content_ = string2 = Page.getDefaultInstance().getContent();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Page.getDefaultInstance().getName();
    }

    private void clearSubpages() {
        Internal$ProtobufList internal$ProtobufList;
        this.subpages_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSubpagesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.subpages_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.subpages_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Page$Builder newBuilder() {
        return (Page$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Page$Builder newBuilder(Page page) {
        return (Page$Builder)DEFAULT_INSTANCE.createBuilder(page);
    }

    public static Page parseDelimitedFrom(InputStream inputStream) {
        return (Page)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Page)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Page parseFrom(ByteString byteString) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Page parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Page parseFrom(CodedInputStream codedInputStream) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Page parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Page parseFrom(InputStream inputStream) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Page parseFrom(ByteBuffer byteBuffer) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Page parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Page parseFrom(byte[] byArray) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Page parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeSubpages(int n3) {
        this.ensureSubpagesIsMutable();
        this.subpages_.remove(n3);
    }

    private void setContent(String string2) {
        string2.getClass();
        this.content_ = string2;
    }

    private void setContentBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.content_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setSubpages(int n3, Page page) {
        page.getClass();
        this.ensureSubpagesIsMutable();
        this.subpages_.set(n3, page);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Page$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Page.class;
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
                objectArray[0] = "name_";
                objectArray[by2] = "content_";
                objectArray[2] = "subpages_";
                objectArray[3] = Page.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b", objectArray);
            }
            case 2: {
                return new Page$Builder(null);
            }
            case 1: 
        }
        return new Page();
    }

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Page getSubpages(int n3) {
        return (Page)this.subpages_.get(n3);
    }

    public int getSubpagesCount() {
        return this.subpages_.size();
    }

    public List getSubpagesList() {
        return this.subpages_;
    }

    public PageOrBuilder getSubpagesOrBuilder(int n3) {
        return (PageOrBuilder)this.subpages_.get(n3);
    }

    public List getSubpagesOrBuilderList() {
        return this.subpages_;
    }
}

