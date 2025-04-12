/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;

public abstract class GeneratedMessageLite$ExtendableBuilder
extends GeneratedMessageLite$Builder
implements GeneratedMessageLite$ExtendableMessageOrBuilder {
    public GeneratedMessageLite$ExtendableBuilder(GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage) {
        super(generatedMessageLite$ExtendableMessage);
    }

    private FieldSet ensureExtensionsAreMutable() {
        FieldSet fieldSet = ((GeneratedMessageLite$ExtendableMessage)this.instance).extensions;
        boolean bl2 = fieldSet.isImmutable();
        if (bl2) {
            fieldSet = fieldSet.clone();
            GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage)this.instance;
            generatedMessageLite$ExtendableMessage.extensions = fieldSet;
        }
        return fieldSet;
    }

    private void verifyExtensionContainingType(GeneratedMessageLite$GeneratedExtension object) {
        GeneratedMessageLite generatedMessageLite;
        if ((object = ((GeneratedMessageLite$GeneratedExtension)object).getContainingTypeDefaultInstance()) == (generatedMessageLite = this.getDefaultInstanceForType())) {
            return;
        }
        object = new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        throw object;
    }

    public final GeneratedMessageLite$ExtendableBuilder addExtension(ExtensionLite object, Object object2) {
        object = GeneratedMessageLite.access$000((ExtensionLite)object);
        this.verifyExtensionContainingType((GeneratedMessageLite$GeneratedExtension)object);
        this.copyOnWrite();
        FieldSet fieldSet = this.ensureExtensionsAreMutable();
        GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor = ((GeneratedMessageLite$GeneratedExtension)object).descriptor;
        object = ((GeneratedMessageLite$GeneratedExtension)object).singularToFieldSetType(object2);
        fieldSet.addRepeatedField(generatedMessageLite$ExtensionDescriptor, object);
        return this;
    }

    public final GeneratedMessageLite$ExtendableMessage buildPartial() {
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage)this.instance;
        boolean bl2 = generatedMessageLite$ExtendableMessage.isMutable();
        if (!bl2) {
            return (GeneratedMessageLite$ExtendableMessage)this.instance;
        }
        ((GeneratedMessageLite$ExtendableMessage)this.instance).extensions.makeImmutable();
        return (GeneratedMessageLite$ExtendableMessage)super.buildPartial();
    }

    public final GeneratedMessageLite$ExtendableBuilder clearExtension(ExtensionLite object) {
        object = GeneratedMessageLite.access$000((ExtensionLite)object);
        this.verifyExtensionContainingType((GeneratedMessageLite$GeneratedExtension)object);
        this.copyOnWrite();
        FieldSet fieldSet = this.ensureExtensionsAreMutable();
        object = ((GeneratedMessageLite$GeneratedExtension)object).descriptor;
        fieldSet.clearField((FieldSet$FieldDescriptorLite)object);
        return this;
    }

    public void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        Object object = ((GeneratedMessageLite$ExtendableMessage)this.instance).extensions;
        Object object2 = FieldSet.emptySet();
        if (object != object2) {
            object2 = object = this.instance;
            object2 = (GeneratedMessageLite$ExtendableMessage)object;
            ((GeneratedMessageLite$ExtendableMessage)object2).extensions = object = ((GeneratedMessageLite$ExtendableMessage)object).extensions.clone();
        }
    }

    public final Object getExtension(ExtensionLite extensionLite) {
        return ((GeneratedMessageLite$ExtendableMessage)this.instance).getExtension(extensionLite);
    }

    public final Object getExtension(ExtensionLite extensionLite, int n3) {
        return ((GeneratedMessageLite$ExtendableMessage)this.instance).getExtension(extensionLite, n3);
    }

    public final int getExtensionCount(ExtensionLite extensionLite) {
        return ((GeneratedMessageLite$ExtendableMessage)this.instance).getExtensionCount(extensionLite);
    }

    public final boolean hasExtension(ExtensionLite extensionLite) {
        return ((GeneratedMessageLite$ExtendableMessage)this.instance).hasExtension(extensionLite);
    }

    public void internalSetExtensionSet(FieldSet fieldSet) {
        this.copyOnWrite();
        ((GeneratedMessageLite$ExtendableMessage)this.instance).extensions = fieldSet;
    }

    public final GeneratedMessageLite$ExtendableBuilder setExtension(ExtensionLite object, int n3, Object object2) {
        object = GeneratedMessageLite.access$000((ExtensionLite)object);
        this.verifyExtensionContainingType((GeneratedMessageLite$GeneratedExtension)object);
        this.copyOnWrite();
        FieldSet fieldSet = this.ensureExtensionsAreMutable();
        GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor = ((GeneratedMessageLite$GeneratedExtension)object).descriptor;
        object = ((GeneratedMessageLite$GeneratedExtension)object).singularToFieldSetType(object2);
        fieldSet.setRepeatedField(generatedMessageLite$ExtensionDescriptor, n3, object);
        return this;
    }

    public final GeneratedMessageLite$ExtendableBuilder setExtension(ExtensionLite object, Object object2) {
        object = GeneratedMessageLite.access$000((ExtensionLite)object);
        this.verifyExtensionContainingType((GeneratedMessageLite$GeneratedExtension)object);
        this.copyOnWrite();
        FieldSet fieldSet = this.ensureExtensionsAreMutable();
        GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor = ((GeneratedMessageLite$GeneratedExtension)object).descriptor;
        object = ((GeneratedMessageLite$GeneratedExtension)object).toFieldSetType(object2);
        fieldSet.setField(generatedMessageLite$ExtensionDescriptor, object);
        return this;
    }
}

