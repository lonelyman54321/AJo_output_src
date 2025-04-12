/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.firebase.logger;

import android.util.Log;
import com.google.firebase.logger.Logger$Companion;
import com.google.firebase.logger.Logger$FakeLogger;
import com.google.firebase.logger.Logger$Level;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class Logger {
    public static final Logger$Companion Companion;
    private static final ConcurrentHashMap loggers;
    private boolean enabled;
    private Logger$Level minLevel;
    private final String tag;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(null);
        Companion = concurrentHashMap;
        loggers = concurrentHashMap = new ConcurrentHashMap();
    }

    private Logger(String string2, boolean bl2, Logger$Level logger$Level) {
        this.tag = string2;
        this.enabled = bl2;
        this.minLevel = logger$Level;
    }

    public /* synthetic */ Logger(String string2, boolean bl2, Logger$Level logger$Level, DefaultConstructorMarker defaultConstructorMarker) {
        this(string2, bl2, logger$Level);
    }

    public static final /* synthetic */ ConcurrentHashMap access$getLoggers$cp() {
        return loggers;
    }

    public static /* synthetic */ int debug$default(Logger object, String string2, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 2) != 0) {
                throwable = null;
            }
            return ((Logger)object).debug(string2, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        throw object;
    }

    public static /* synthetic */ int debug$default(Logger object, String string2, Object[] objectArray, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                throwable = null;
            }
            return ((Logger)object).debug(string2, objectArray, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        throw object;
    }

    public static /* synthetic */ int error$default(Logger object, String string2, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 2) != 0) {
                throwable = null;
            }
            return ((Logger)object).error(string2, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        throw object;
    }

    public static /* synthetic */ int error$default(Logger object, String string2, Object[] objectArray, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                throwable = null;
            }
            return ((Logger)object).error(string2, objectArray, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        throw object;
    }

    public static final Logger getLogger(String string2, boolean bl2, Logger$Level logger$Level) {
        return Companion.getLogger(string2, bl2, logger$Level);
    }

    public static /* synthetic */ int info$default(Logger object, String string2, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 2) != 0) {
                throwable = null;
            }
            return ((Logger)object).info(string2, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        throw object;
    }

    public static /* synthetic */ int info$default(Logger object, String string2, Object[] objectArray, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                throwable = null;
            }
            return ((Logger)object).info(string2, objectArray, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        throw object;
    }

    private final int logIfAble(Logger$Level logger$Level, String string2, Object[] objectArray, Throwable throwable) {
        int n3;
        int n4;
        Object object;
        int n7 = this.enabled;
        if (n7 != 0 && ((n7 = (object = this.minLevel).getPriority$com_google_firebase_firebase_common()) <= (n4 = logger$Level.getPriority$com_google_firebase_firebase_common()) || (n7 = (int)(Log.isLoggable((String)(object = this.tag), (int)(n4 = logger$Level.getPriority$com_google_firebase_firebase_common())) ? 1 : 0)) != 0)) {
            n3 = this.log(logger$Level, string2, objectArray, throwable);
        } else {
            n3 = 0;
            logger$Level = null;
        }
        return n3;
    }

    public static /* synthetic */ int logIfAble$default(Logger object, Logger$Level logger$Level, String string2, Object[] objectArray, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                objectArray = new Object[]{};
            }
            return super.logIfAble(logger$Level, string2, objectArray, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        throw object;
    }

    public static final Logger$FakeLogger setupFakeLogger(String string2, boolean bl2, Logger$Level logger$Level) {
        return Companion.setupFakeLogger(string2, bl2, logger$Level);
    }

    public static /* synthetic */ int verbose$default(Logger object, String string2, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 2) != 0) {
                throwable = null;
            }
            return ((Logger)object).verbose(string2, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        throw object;
    }

    public static /* synthetic */ int verbose$default(Logger object, String string2, Object[] objectArray, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                throwable = null;
            }
            return ((Logger)object).verbose(string2, objectArray, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        throw object;
    }

    public static /* synthetic */ int warn$default(Logger object, String string2, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 2) != 0) {
                throwable = null;
            }
            return ((Logger)object).warn(string2, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        throw object;
    }

    public static /* synthetic */ int warn$default(Logger object, String string2, Object[] objectArray, Throwable throwable, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                throwable = null;
            }
            return ((Logger)object).warn(string2, objectArray, throwable);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        throw object;
    }

    public final int debug(String string2) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        return Logger.debug$default(this, string2, null, 2, null);
    }

    public final int debug(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        Logger$Level logger$Level = Logger$Level.DEBUG;
        return Logger.logIfAble$default(this, logger$Level, string2, null, throwable, 4, null);
    }

    public final int debug(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        return Logger.debug$default(this, string2, objectArray, null, 4, null);
    }

    public final int debug(String string2, Object[] objectArray, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        Logger$Level logger$Level = Logger$Level.DEBUG;
        return this.logIfAble(logger$Level, string2, objectArray, throwable);
    }

    public final int error(String string2) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        return Logger.error$default(this, string2, null, 2, null);
    }

    public final int error(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        Logger$Level logger$Level = Logger$Level.ERROR;
        return Logger.logIfAble$default(this, logger$Level, string2, null, throwable, 4, null);
    }

    public final int error(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        return Logger.error$default(this, string2, objectArray, null, 4, null);
    }

    public final int error(String string2, Object[] objectArray, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        Logger$Level logger$Level = Logger$Level.ERROR;
        return this.logIfAble(logger$Level, string2, objectArray, throwable);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Logger$Level getMinLevel() {
        return this.minLevel;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int info(String string2) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        return Logger.info$default(this, string2, null, 2, null);
    }

    public final int info(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        Logger$Level logger$Level = Logger$Level.INFO;
        return Logger.logIfAble$default(this, logger$Level, string2, null, throwable, 4, null);
    }

    public final int info(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        return Logger.info$default(this, string2, objectArray, null, 4, null);
    }

    public final int info(String string2, Object[] objectArray, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        Logger$Level logger$Level = Logger$Level.INFO;
        return this.logIfAble(logger$Level, string2, objectArray, throwable);
    }

    public abstract int log(Logger$Level var1, String var2, Object[] var3, Throwable var4);

    public final void setEnabled(boolean bl2) {
        this.enabled = bl2;
    }

    public final void setMinLevel(Logger$Level logger$Level) {
        Intrinsics.checkNotNullParameter((Object)logger$Level, "<set-?>");
        this.minLevel = logger$Level;
    }

    public final int verbose(String string2) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        return Logger.verbose$default(this, string2, null, 2, null);
    }

    public final int verbose(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        Logger$Level logger$Level = Logger$Level.VERBOSE;
        return Logger.logIfAble$default(this, logger$Level, string2, null, throwable, 4, null);
    }

    public final int verbose(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        return Logger.verbose$default(this, string2, objectArray, null, 4, null);
    }

    public final int verbose(String string2, Object[] objectArray, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        Logger$Level logger$Level = Logger$Level.VERBOSE;
        return this.logIfAble(logger$Level, string2, objectArray, throwable);
    }

    public final int warn(String string2) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        return Logger.warn$default(this, string2, null, 2, null);
    }

    public final int warn(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        Logger$Level logger$Level = Logger$Level.WARN;
        return Logger.logIfAble$default(this, logger$Level, string2, null, throwable, 4, null);
    }

    public final int warn(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        return Logger.warn$default(this, string2, objectArray, null, 4, null);
    }

    public final int warn(String string2, Object[] objectArray, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        Logger$Level logger$Level = Logger$Level.WARN;
        return this.logIfAble(logger$Level, string2, objectArray, throwable);
    }
}

