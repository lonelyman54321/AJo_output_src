/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.logger;

import com.google.firebase.logger.Logger;
import com.google.firebase.logger.Logger$FakeLogger;
import com.google.firebase.logger.Logger$Level;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Logger$Companion {
    private Logger$Companion() {
    }

    public /* synthetic */ Logger$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Logger getLogger$default(Logger$Companion logger$Companion, String string2, boolean bl2, Logger$Level logger$Level, int n3, Object object) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n3 &= 4) != 0) {
            logger$Level = Logger$Level.INFO;
        }
        return logger$Companion.getLogger(string2, bl2, logger$Level);
    }

    public static /* synthetic */ Logger$FakeLogger setupFakeLogger$default(Logger$Companion logger$Companion, String string2, boolean bl2, Logger$Level logger$Level, int n3, Object object) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n3 &= 4) != 0) {
            logger$Level = Logger$Level.DEBUG;
        }
        return logger$Companion.setupFakeLogger(string2, bl2, logger$Level);
    }

    public final Logger getLogger(String string2, boolean bl2, Logger$Level logger$Level) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter((Object)logger$Level, "minLevel");
        ConcurrentHashMap concurrentHashMap = Logger.access$getLoggers$cp();
        Object object = concurrentHashMap.get(string2);
        if (object == null && (string2 = concurrentHashMap.putIfAbsent(string2, object = new Object(string2, bl2, logger$Level))) != null) {
            object = string2;
        }
        Intrinsics.checkNotNullExpressionValue(object, "loggers.getOrPut(tag) { \u2026tag, enabled, minLevel) }");
        return (Logger)object;
    }

    public final Logger$FakeLogger setupFakeLogger(String string2, boolean bl2, Logger$Level logger$Level) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter((Object)logger$Level, "minLevel");
        Logger$FakeLogger logger$FakeLogger = new Logger$FakeLogger(string2, bl2, logger$Level);
        Logger.access$getLoggers$cp().put(string2, logger$FakeLogger);
        return logger$FakeLogger;
    }
}

