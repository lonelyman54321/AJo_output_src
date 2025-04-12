/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MessageInfo;
import com.google.protobuf.MessageInfoFactory;

class ManifestSchemaFactory$CompositeMessageInfoFactory
implements MessageInfoFactory {
    private MessageInfoFactory[] factories;

    public ManifestSchemaFactory$CompositeMessageInfoFactory(MessageInfoFactory ... messageInfoFactoryArray) {
        this.factories = messageInfoFactoryArray;
    }

    public boolean isSupported(Class clazz) {
        for (MessageInfoFactory messageInfoFactory : this.factories) {
            boolean bl2 = messageInfoFactory.isSupported(clazz);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public MessageInfo messageInfoFor(Class object) {
        for (MessageInfoFactory messageInfoFactory : this.factories) {
            boolean bl2 = messageInfoFactory.isSupported((Class)object);
            if (!bl2) continue;
            return messageInfoFactory.messageInfoFor((Class)object);
        }
        object = ((Class)object).getName();
        object = "No factory is available for message type: ".concat((String)object);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
    }
}

