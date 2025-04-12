/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets.managers;

import com.ril.ajio.customviews.widgets.managers.FontsManager;

public class MainWidgetManager {
    private static volatile MainWidgetManager instance;
    private FontsManager fontsManagerInstance;

    private MainWidgetManager() {
        FontsManager fontsManager;
        this.fontsManagerInstance = fontsManager = new FontsManager();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MainWidgetManager getInstance() {
        Object object = instance;
        if (object != null) return instance;
        object = MainWidgetManager.class;
        synchronized (object) {
            try {
                MainWidgetManager mainWidgetManager = instance;
                if (mainWidgetManager != null) return instance;
                instance = mainWidgetManager = new MainWidgetManager();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public FontsManager getFontsManager() {
        return this.fontsManagerInstance;
    }
}

