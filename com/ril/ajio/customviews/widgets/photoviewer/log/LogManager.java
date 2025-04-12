/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets.photoviewer.log;

import com.ril.ajio.customviews.widgets.photoviewer.log.Logger;
import com.ril.ajio.customviews.widgets.photoviewer.log.LoggerDefault;

public final class LogManager {
    private static Logger logger;

    static {
        LoggerDefault loggerDefault = new LoggerDefault();
        logger = loggerDefault;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        LogManager.logger = logger;
    }
}

