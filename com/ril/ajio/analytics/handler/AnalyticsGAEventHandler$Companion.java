/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.HandlerThread
 */
package com.ril.ajio.analytics.handler;

import android.os.HandlerThread;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AnalyticsGAEventHandler$Companion {
    private AnalyticsGAEventHandler$Companion() {
    }

    public /* synthetic */ AnalyticsGAEventHandler$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final AnalyticsGAEventHandler getInstance() {
        Object object;
        block7: {
            object = AnalyticsGAEventHandler.access$getMINSTANCE$cp();
            if (object != null) break block7;
            synchronized (this) {
                Throwable throwable2;
                block8: {
                    Object object2;
                    block6: {
                        object2 = "GA_PRODUCT_HANDLER_THREAD";
                        try {
                            object = new HandlerThread(object2);
                            ((Thread)object).start();
                            object2 = AnalyticsGAEventHandler.access$getMINSTANCE$cp();
                            if (object2 != null) break block6;
                        }
                        catch (Throwable throwable2) {}
                        object2 = new AnalyticsGAEventHandler((HandlerThread)object);
                        AnalyticsGAEventHandler.access$setMINSTANCE$cp((AnalyticsGAEventHandler)((Object)object2));
                        break block6;
                        break block8;
                    }
                    object = object2;
                    break block7;
                }
                throw throwable2;
            }
        }
        return object;
    }
}

