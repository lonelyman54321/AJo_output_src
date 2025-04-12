/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.RemoteMessage$Builder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class MessagingKt {
    public static final FirebaseMessaging getMessaging(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebaseMessaging.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance()");
        return object;
    }

    public static final RemoteMessage remoteMessage(String object, Function1 function1) {
        Intrinsics.checkNotNullParameter(object, "to");
        Intrinsics.checkNotNullParameter(function1, "init");
        RemoteMessage$Builder remoteMessage$Builder = new RemoteMessage$Builder((String)object);
        function1.invoke(remoteMessage$Builder);
        object = remoteMessage$Builder.build();
        Intrinsics.checkNotNullExpressionValue(object, "builder.build()");
        return object;
    }
}

