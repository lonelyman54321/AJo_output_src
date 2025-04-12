/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

import com.facebook.appevents.a$a;
import com.facebook.appevents.c$b;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.Intrinsics;

public final class e$a
extends ObjectInputStream {
    public final ObjectStreamClass readClassDescriptor() {
        String string2;
        ObjectStreamClass objectStreamClass = super.readClassDescriptor();
        String string3 = objectStreamClass.getName();
        boolean bl2 = Intrinsics.areEqual(string3, string2 = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1");
        if (bl2) {
            objectStreamClass = ObjectStreamClass.lookup(a$a.class);
        } else {
            string3 = objectStreamClass.getName();
            bl2 = Intrinsics.areEqual(string3, string2 = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2");
            if (bl2) {
                objectStreamClass = ObjectStreamClass.lookup(c$b.class);
            }
        }
        Intrinsics.checkNotNullExpressionValue(objectStreamClass, "resultClassDescriptor");
        return objectStreamClass;
    }
}

