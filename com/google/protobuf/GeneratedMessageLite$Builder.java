/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite$Builder;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedInputStreamReader;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Reader;
import com.google.protobuf.Schema;
import java.io.IOException;

public abstract class GeneratedMessageLite$Builder
extends AbstractMessageLite$Builder {
    private final GeneratedMessageLite defaultInstance;
    protected GeneratedMessageLite instance;

    public GeneratedMessageLite$Builder(GeneratedMessageLite object) {
        this.defaultInstance = object;
        boolean bl2 = ((GeneratedMessageLite)object).isMutable();
        if (!bl2) {
            this.instance = object = this.newMutableInstance();
            return;
        }
        object = new IllegalArgumentException("Default instance must be immutable.");
        throw object;
    }

    private static void mergeFromInstance(Object object, Object object2) {
        Protobuf.getInstance().schemaFor(object).mergeFrom(object, object2);
    }

    private GeneratedMessageLite newMutableInstance() {
        return this.defaultInstance.newMutableInstance();
    }

    public final GeneratedMessageLite build() {
        GeneratedMessageLite generatedMessageLite = this.buildPartial();
        boolean bl2 = generatedMessageLite.isInitialized();
        if (bl2) {
            return generatedMessageLite;
        }
        throw AbstractMessageLite$Builder.newUninitializedMessageException(generatedMessageLite);
    }

    public GeneratedMessageLite buildPartial() {
        GeneratedMessageLite generatedMessageLite = this.instance;
        boolean bl2 = generatedMessageLite.isMutable();
        if (!bl2) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    public final GeneratedMessageLite$Builder clear() {
        Object object = this.defaultInstance;
        boolean bl2 = ((GeneratedMessageLite)object).isMutable();
        if (!bl2) {
            this.instance = object = this.newMutableInstance();
            return this;
        }
        object = new IllegalArgumentException("Default instance must be immutable.");
        throw object;
    }

    public GeneratedMessageLite$Builder clone() {
        GeneratedMessageLite generatedMessageLite;
        GeneratedMessageLite$Builder generatedMessageLite$Builder = this.getDefaultInstanceForType().newBuilderForType();
        generatedMessageLite$Builder.instance = generatedMessageLite = this.buildPartial();
        return generatedMessageLite$Builder;
    }

    public final void copyOnWrite() {
        GeneratedMessageLite generatedMessageLite = this.instance;
        boolean bl2 = generatedMessageLite.isMutable();
        if (!bl2) {
            this.copyOnWriteInternal();
        }
    }

    public void copyOnWriteInternal() {
        GeneratedMessageLite generatedMessageLite = this.newMutableInstance();
        GeneratedMessageLite generatedMessageLite2 = this.instance;
        GeneratedMessageLite$Builder.mergeFromInstance(generatedMessageLite, generatedMessageLite2);
        this.instance = generatedMessageLite;
    }

    public GeneratedMessageLite getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    public GeneratedMessageLite$Builder internalMergeFrom(GeneratedMessageLite generatedMessageLite) {
        return this.mergeFrom(generatedMessageLite);
    }

    public final boolean isInitialized() {
        return GeneratedMessageLite.isInitialized(this.instance, false);
    }

    public GeneratedMessageLite$Builder mergeFrom(CodedInputStream object, ExtensionRegistryLite object2) {
        Object object3;
        this.copyOnWrite();
        try {
            object3 = Protobuf.getInstance();
        }
        catch (RuntimeException runtimeException) {
            object2 = runtimeException.getCause();
            boolean bl2 = object2 instanceof IOException;
            if (bl2) {
                throw (IOException)runtimeException.getCause();
            }
            throw runtimeException;
        }
        GeneratedMessageLite generatedMessageLite = this.instance;
        object3 = ((Protobuf)object3).schemaFor(generatedMessageLite);
        generatedMessageLite = this.instance;
        object = CodedInputStreamReader.forCodedInput((CodedInputStream)object);
        object3.mergeFrom(generatedMessageLite, (Reader)object, (ExtensionRegistryLite)object2);
        return this;
    }

    public GeneratedMessageLite$Builder mergeFrom(GeneratedMessageLite generatedMessageLite) {
        GeneratedMessageLite generatedMessageLite2 = this.getDefaultInstanceForType();
        boolean bl2 = generatedMessageLite2.equals(generatedMessageLite);
        if (bl2) {
            return this;
        }
        this.copyOnWrite();
        GeneratedMessageLite$Builder.mergeFromInstance(this.instance, generatedMessageLite);
        return this;
    }

    public GeneratedMessageLite$Builder mergeFrom(byte[] byArray, int n3, int n4) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return this.mergeFrom(byArray, n3, n4, extensionRegistryLite);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public GeneratedMessageLite$Builder mergeFrom(byte[] byArray, int n3, int n4, ExtensionRegistryLite extensionRegistryLite) {
        this.copyOnWrite();
        try {
            Protobuf protobuf = Protobuf.getInstance();
            GeneratedMessageLite generatedMessageLite = this.instance;
            Schema schema = protobuf.schemaFor(generatedMessageLite);
            GeneratedMessageLite generatedMessageLite2 = this.instance;
            int n7 = n3 + n4;
            ArrayDecoders$Registers arrayDecoders$Registers = new ArrayDecoders$Registers(extensionRegistryLite);
            schema.mergeFrom(generatedMessageLite2, byArray, n3, n7, arrayDecoders$Registers);
            return this;
        }
        catch (IOException iOException) {
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException22) {
            throw invalidProtocolBufferException22;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        RuntimeException runtimeException = new RuntimeException("Reading from byte array should not throw IOException.", iOException);
        throw runtimeException;
    }
}

