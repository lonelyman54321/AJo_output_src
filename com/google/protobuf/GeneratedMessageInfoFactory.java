/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageInfo;
import com.google.protobuf.MessageInfoFactory;

class GeneratedMessageInfoFactory
implements MessageInfoFactory {
    private static final GeneratedMessageInfoFactory instance;

    static {
        GeneratedMessageInfoFactory generatedMessageInfoFactory;
        instance = generatedMessageInfoFactory = new GeneratedMessageInfoFactory();
    }

    private GeneratedMessageInfoFactory() {
    }

    public static GeneratedMessageInfoFactory getInstance() {
        return instance;
    }

    public boolean isSupported(Class clazz) {
        return GeneratedMessageLite.class.isAssignableFrom(clazz);
    }

    public MessageInfo messageInfoFor(Class object) {
        Class<GeneratedMessageLite> clazz = GeneratedMessageLite.class;
        boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
        if (bl2) {
            try {
                clazz = ((Class)object).asSubclass(clazz);
            }
            catch (Exception exception) {
                object = ((Class)object).getName();
                object = "Unable to get message info for ".concat((String)object);
                RuntimeException runtimeException = new RuntimeException((String)object, exception);
                throw runtimeException;
            }
            clazz = GeneratedMessageLite.getDefaultInstance(clazz);
            clazz = ((GeneratedMessageLite)((Object)clazz)).buildMessageInfo();
            return (MessageInfo)((Object)clazz);
        }
        object = ((Class)object).getName();
        object = "Unsupported message type: ".concat((String)object);
        clazz = new IllegalArgumentException((String)object);
        throw clazz;
    }
}

