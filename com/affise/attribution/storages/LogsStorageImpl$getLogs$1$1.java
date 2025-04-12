/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.storages;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class LogsStorageImpl$getLogs$1$1
extends Lambda
implements Function1 {
    public static final LogsStorageImpl$getLogs$1$1 INSTANCE;

    static {
        LogsStorageImpl$getLogs$1$1 logsStorageImpl$getLogs$1$1;
        INSTANCE = logsStorageImpl$getLogs$1$1 = new LogsStorageImpl$getLogs$1$1();
    }

    public LogsStorageImpl$getLogs$1$1() {
        super(1);
    }

    public final Boolean invoke(File file) {
        return file.isFile();
    }
}

