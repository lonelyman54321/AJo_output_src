/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import com.google.rpc.Help$1;
import com.google.rpc.Help$Builder;
import com.google.rpc.Help$Link;
import com.google.rpc.Help$LinkOrBuilder;
import com.google.rpc.HelpOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Help
extends GeneratedMessageLite
implements HelpOrBuilder {
    private static final Help DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private Internal$ProtobufList links_;

    static {
        Help help;
        DEFAULT_INSTANCE = help = new Help();
        GeneratedMessageLite.registerDefaultInstance(Help.class, help);
    }

    private Help() {
        Internal$ProtobufList internal$ProtobufList;
        this.links_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ void access$1000(Help help, Help$Link help$Link) {
        help.addLinks(help$Link);
    }

    public static /* synthetic */ void access$1100(Help help, int n3, Help$Link help$Link) {
        help.addLinks(n3, help$Link);
    }

    public static /* synthetic */ void access$1200(Help help, Iterable iterable) {
        help.addAllLinks(iterable);
    }

    public static /* synthetic */ void access$1300(Help help) {
        help.clearLinks();
    }

    public static /* synthetic */ void access$1400(Help help, int n3) {
        help.removeLinks(n3);
    }

    public static /* synthetic */ Help access$800() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$900(Help help, int n3, Help$Link help$Link) {
        help.setLinks(n3, help$Link);
    }

    private void addAllLinks(Iterable iterable) {
        this.ensureLinksIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.links_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addLinks(int n3, Help$Link help$Link) {
        help$Link.getClass();
        this.ensureLinksIsMutable();
        this.links_.add(n3, help$Link);
    }

    private void addLinks(Help$Link help$Link) {
        help$Link.getClass();
        this.ensureLinksIsMutable();
        this.links_.add(help$Link);
    }

    private void clearLinks() {
        Internal$ProtobufList internal$ProtobufList;
        this.links_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLinksIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.links_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.links_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Help getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Help$Builder newBuilder() {
        return (Help$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Help$Builder newBuilder(Help help) {
        return (Help$Builder)DEFAULT_INSTANCE.createBuilder(help);
    }

    public static Help parseDelimitedFrom(InputStream inputStream) {
        return (Help)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Help)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Help parseFrom(ByteString byteString) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Help parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Help parseFrom(CodedInputStream codedInputStream) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Help parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Help parseFrom(InputStream inputStream) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Help parseFrom(ByteBuffer byteBuffer) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Help parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Help parseFrom(byte[] byArray) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Help parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLinks(int n3) {
        this.ensureLinksIsMutable();
        this.links_.remove(n3);
    }

    private void setLinks(int n3, Help$Link help$Link) {
        help$Link.getClass();
        this.ensureLinksIsMutable();
        this.links_.set(n3, help$Link);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Help$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Help.class;
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
                object[0] = "links_";
                object[by2] = Help$Link.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new Help$Builder(null);
            }
            case 1: 
        }
        return new Help();
    }

    public Help$Link getLinks(int n3) {
        return (Help$Link)this.links_.get(n3);
    }

    public int getLinksCount() {
        return this.links_.size();
    }

    public List getLinksList() {
        return this.links_;
    }

    public Help$LinkOrBuilder getLinksOrBuilder(int n3) {
        return (Help$LinkOrBuilder)this.links_.get(n3);
    }

    public List getLinksOrBuilderList() {
        return this.links_;
    }
}

