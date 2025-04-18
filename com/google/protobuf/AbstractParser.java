/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract class AbstractParser
implements Parser {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();

    private MessageLite checkMessageInitialized(MessageLite messageLite) {
        boolean bl2;
        if (messageLite != null && !(bl2 = messageLite.isInitialized())) {
            throw this.newUninitializedMessageException(messageLite).asInvalidProtocolBufferException().setUnfinishedMessage(messageLite);
        }
        return messageLite;
    }

    private UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
        boolean bl2 = messageLite instanceof AbstractMessageLite;
        if (bl2) {
            return ((AbstractMessageLite)messageLite).newUninitializedMessageException();
        }
        UninitializedMessageException uninitializedMessageException = new UninitializedMessageException(messageLite);
        return uninitializedMessageException;
    }

    public MessageLite parseDelimitedFrom(InputStream inputStream) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public MessageLite parseDelimitedFrom(InputStream object, ExtensionRegistryLite extensionRegistryLite) {
        object = this.parsePartialDelimitedFrom((InputStream)object, extensionRegistryLite);
        return this.checkMessageInitialized((MessageLite)object);
    }

    public MessageLite parseFrom(ByteString byteString) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parseFrom(byteString, extensionRegistryLite);
    }

    public MessageLite parseFrom(ByteString object, ExtensionRegistryLite extensionRegistryLite) {
        object = this.parsePartialFrom((ByteString)object, extensionRegistryLite);
        return this.checkMessageInitialized((MessageLite)object);
    }

    public MessageLite parseFrom(CodedInputStream codedInputStream) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public MessageLite parseFrom(CodedInputStream object, ExtensionRegistryLite extensionRegistryLite) {
        object = (MessageLite)this.parsePartialFrom((CodedInputStream)object, extensionRegistryLite);
        return this.checkMessageInitialized((MessageLite)object);
    }

    public MessageLite parseFrom(InputStream inputStream) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parseFrom(inputStream, extensionRegistryLite);
    }

    public MessageLite parseFrom(InputStream object, ExtensionRegistryLite extensionRegistryLite) {
        object = this.parsePartialFrom((InputStream)object, extensionRegistryLite);
        return this.checkMessageInitialized((MessageLite)object);
    }

    public MessageLite parseFrom(ByteBuffer byteBuffer) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public MessageLite parseFrom(ByteBuffer object, ExtensionRegistryLite object2) {
        object = CodedInputStream.newInstance((ByteBuffer)object);
        object2 = (MessageLite)this.parsePartialFrom((CodedInputStream)object, (ExtensionRegistryLite)object2);
        try {
            ((CodedInputStream)object).checkLastTagWas(0);
            return this.checkMessageInitialized((MessageLite)object2);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)object2);
        }
    }

    public MessageLite parseFrom(byte[] byArray) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parseFrom(byArray, extensionRegistryLite);
    }

    public MessageLite parseFrom(byte[] byArray, int n3, int n4) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parseFrom(byArray, n3, n4, extensionRegistryLite);
    }

    public MessageLite parseFrom(byte[] object, int n3, int n4, ExtensionRegistryLite extensionRegistryLite) {
        object = this.parsePartialFrom((byte[])object, n3, n4, extensionRegistryLite);
        return this.checkMessageInitialized((MessageLite)object);
    }

    public MessageLite parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        int n3 = byArray.length;
        return this.parseFrom(byArray, 0, n3, extensionRegistryLite);
    }

    public MessageLite parsePartialDelimitedFrom(InputStream inputStream) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parsePartialDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public MessageLite parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite object) {
        int n3;
        block3: {
            try {
                n3 = inputStream.read();
                int n4 = -1;
                if (n3 != n4) break block3;
                return null;
            }
            catch (IOException iOException) {
                object = new InvalidProtocolBufferException(iOException);
                throw object;
            }
        }
        n3 = CodedInputStream.readRawVarint32(n3, inputStream);
        AbstractMessageLite$Builder$LimitedInputStream abstractMessageLite$Builder$LimitedInputStream = new AbstractMessageLite$Builder$LimitedInputStream(inputStream, n3);
        return this.parsePartialFrom(abstractMessageLite$Builder$LimitedInputStream, (ExtensionRegistryLite)object);
    }

    public MessageLite parsePartialFrom(ByteString byteString) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parsePartialFrom(byteString, extensionRegistryLite);
    }

    public MessageLite parsePartialFrom(ByteString object, ExtensionRegistryLite object2) {
        object = ((ByteString)object).newCodedInput();
        object2 = (MessageLite)this.parsePartialFrom((CodedInputStream)object, (ExtensionRegistryLite)object2);
        try {
            ((CodedInputStream)object).checkLastTagWas(0);
            return object2;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)object2);
        }
    }

    public MessageLite parsePartialFrom(CodedInputStream codedInputStream) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return (MessageLite)this.parsePartialFrom(codedInputStream, extensionRegistryLite);
    }

    public MessageLite parsePartialFrom(InputStream inputStream) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parsePartialFrom(inputStream, extensionRegistryLite);
    }

    public MessageLite parsePartialFrom(InputStream object, ExtensionRegistryLite object2) {
        object = CodedInputStream.newInstance((InputStream)object);
        object2 = (MessageLite)this.parsePartialFrom((CodedInputStream)object, (ExtensionRegistryLite)object2);
        try {
            ((CodedInputStream)object).checkLastTagWas(0);
            return object2;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)object2);
        }
    }

    public MessageLite parsePartialFrom(byte[] byArray) {
        int n3 = byArray.length;
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parsePartialFrom(byArray, 0, n3, extensionRegistryLite);
    }

    public MessageLite parsePartialFrom(byte[] byArray, int n3, int n4) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY;
        return this.parsePartialFrom(byArray, n3, n4, extensionRegistryLite);
    }

    public MessageLite parsePartialFrom(byte[] object, int n3, int n4, ExtensionRegistryLite extensionRegistryLite) {
        object = CodedInputStream.newInstance((byte[])object, n3, n4);
        MessageLite messageLite = (MessageLite)this.parsePartialFrom((CodedInputStream)object, extensionRegistryLite);
        n4 = 0;
        try {
            ((CodedInputStream)object).checkLastTagWas(0);
            return messageLite;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage(messageLite);
        }
    }

    public MessageLite parsePartialFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        int n3 = byArray.length;
        return this.parsePartialFrom(byArray, 0, n3, extensionRegistryLite);
    }
}

