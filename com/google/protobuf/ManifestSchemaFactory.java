/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.ExtensionSchemas;
import com.google.protobuf.GeneratedMessageInfoFactory;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.ListFieldSchema;
import com.google.protobuf.ManifestSchemaFactory$1;
import com.google.protobuf.ManifestSchemaFactory$2;
import com.google.protobuf.ManifestSchemaFactory$CompositeMessageInfoFactory;
import com.google.protobuf.MapFieldSchema;
import com.google.protobuf.MapFieldSchemas;
import com.google.protobuf.MessageInfo;
import com.google.protobuf.MessageInfoFactory;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageSchema;
import com.google.protobuf.MessageSetSchema;
import com.google.protobuf.NewInstanceSchema;
import com.google.protobuf.NewInstanceSchemas;
import com.google.protobuf.Schema;
import com.google.protobuf.SchemaFactory;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.UnknownFieldSchema;
import java.lang.reflect.Method;

final class ManifestSchemaFactory
implements SchemaFactory {
    private static final MessageInfoFactory EMPTY_FACTORY;
    private final MessageInfoFactory messageInfoFactory;

    static {
        ManifestSchemaFactory$1 manifestSchemaFactory$1 = new ManifestSchemaFactory$1();
        EMPTY_FACTORY = manifestSchemaFactory$1;
    }

    public ManifestSchemaFactory() {
        MessageInfoFactory messageInfoFactory = ManifestSchemaFactory.getDefaultMessageInfoFactory();
        this(messageInfoFactory);
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = messageInfoFactory = (MessageInfoFactory)Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }

    private static boolean allowExtensions(MessageInfo object) {
        boolean bl2;
        int[] nArray = ManifestSchemaFactory$2.$SwitchMap$com$google$protobuf$ProtoSyntax;
        int bl22 = ((Enum)(object = object.getSyntax())).ordinal();
        boolean bl3 = nArray[bl22];
        if (bl3 != (bl2 = true)) {
            return bl2;
        }
        return false;
    }

    private static MessageInfoFactory getDefaultMessageInfoFactory() {
        GeneratedMessageInfoFactory generatedMessageInfoFactory = GeneratedMessageInfoFactory.getInstance();
        MessageInfoFactory messageInfoFactory = ManifestSchemaFactory.getDescriptorMessageInfoFactory();
        MessageInfoFactory[] messageInfoFactoryArray = new MessageInfoFactory[]{generatedMessageInfoFactory, messageInfoFactory};
        ManifestSchemaFactory$CompositeMessageInfoFactory manifestSchemaFactory$CompositeMessageInfoFactory = new ManifestSchemaFactory$CompositeMessageInfoFactory(messageInfoFactoryArray);
        return manifestSchemaFactory$CompositeMessageInfoFactory;
    }

    private static MessageInfoFactory getDescriptorMessageInfoFactory() {
        String string2;
        Object object = "com.google.protobuf.DescriptorMessageInfoFactory";
        try {
            object = Class.forName((String)object);
            string2 = "getInstance";
        }
        catch (Exception exception) {
            return EMPTY_FACTORY;
        }
        object = ((Class)object).getDeclaredMethod(string2, null);
        object = ((Method)object).invoke(null, null);
        return (MessageInfoFactory)object;
    }

    private static Schema newSchema(Class object, MessageInfo messageInfo) {
        Class clazz = GeneratedMessageLite.class;
        boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
        if (bl2) {
            bl2 = ManifestSchemaFactory.allowExtensions(messageInfo);
            if (bl2) {
                NewInstanceSchema newInstanceSchema = NewInstanceSchemas.lite();
                ListFieldSchema listFieldSchema = ListFieldSchema.lite();
                UnknownFieldSchema unknownFieldSchema = SchemaUtil.unknownFieldSetLiteSchema();
                ExtensionSchema extensionSchema = ExtensionSchemas.lite();
                MapFieldSchema mapFieldSchema = MapFieldSchemas.lite();
                MessageInfo messageInfo2 = messageInfo;
                object = MessageSchema.newSchema((Class)object, messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
            } else {
                NewInstanceSchema newInstanceSchema = NewInstanceSchemas.lite();
                ListFieldSchema listFieldSchema = ListFieldSchema.lite();
                UnknownFieldSchema unknownFieldSchema = SchemaUtil.unknownFieldSetLiteSchema();
                Object var6_13 = null;
                MapFieldSchema mapFieldSchema = MapFieldSchemas.lite();
                clazz = object;
                object = MessageSchema.newSchema((Class)object, messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, null, mapFieldSchema);
            }
            return object;
        }
        bl2 = ManifestSchemaFactory.allowExtensions(messageInfo);
        if (bl2) {
            NewInstanceSchema newInstanceSchema = NewInstanceSchemas.full();
            ListFieldSchema listFieldSchema = ListFieldSchema.full();
            UnknownFieldSchema unknownFieldSchema = SchemaUtil.unknownFieldSetFullSchema();
            ExtensionSchema extensionSchema = ExtensionSchemas.full();
            MapFieldSchema mapFieldSchema = MapFieldSchemas.full();
            MessageInfo messageInfo3 = messageInfo;
            object = MessageSchema.newSchema((Class)object, messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        } else {
            NewInstanceSchema newInstanceSchema = NewInstanceSchemas.full();
            ListFieldSchema listFieldSchema = ListFieldSchema.full();
            UnknownFieldSchema unknownFieldSchema = SchemaUtil.unknownFieldSetFullSchema();
            Object var6_15 = null;
            MapFieldSchema mapFieldSchema = MapFieldSchemas.full();
            clazz = object;
            object = MessageSchema.newSchema((Class)object, messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, null, mapFieldSchema);
        }
        return object;
    }

    public Schema createSchema(Class object) {
        SchemaUtil.requireGeneratedMessage((Class)object);
        Object object2 = this.messageInfoFactory.messageInfoFor((Class)object);
        boolean bl2 = object2.isMessageSetWireFormat();
        if (bl2) {
            Class<GeneratedMessageLite> clazz = GeneratedMessageLite.class;
            boolean bl3 = clazz.isAssignableFrom((Class<?>)object);
            if (bl3) {
                object = SchemaUtil.unknownFieldSetLiteSchema();
                clazz = ExtensionSchemas.lite();
                object2 = object2.getDefaultInstance();
                return MessageSetSchema.newSchema((UnknownFieldSchema)object, (ExtensionSchema)((Object)clazz), (MessageLite)object2);
            }
            object = SchemaUtil.unknownFieldSetFullSchema();
            clazz = ExtensionSchemas.full();
            object2 = object2.getDefaultInstance();
            return MessageSetSchema.newSchema((UnknownFieldSchema)object, (ExtensionSchema)((Object)clazz), (MessageLite)object2);
        }
        return ManifestSchemaFactory.newSchema((Class)object, (MessageInfo)object2);
    }
}

