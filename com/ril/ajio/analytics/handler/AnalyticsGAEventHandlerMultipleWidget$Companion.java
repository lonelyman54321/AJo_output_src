/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.HandlerThread
 */
package com.ril.ajio.analytics.handler;

import android.os.HandlerThread;
import com.ril.ajio.analytics.handler.AnalylticsGAHolderForProduct;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsGAEventHandlerMultipleWidget$Companion {
    private AnalyticsGAEventHandlerMultipleWidget$Companion() {
    }

    public /* synthetic */ AnalyticsGAEventHandlerMultipleWidget$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final AnalyticsGAEventHandlerMultipleWidget getInstance() {
        Object object;
        Object object2;
        block7: {
            object2 = AnalyticsGAEventHandlerMultipleWidget.access$getMINSTANCE$cp();
            if (object2 != null) break block7;
            synchronized (this) {
                Throwable throwable2;
                block8: {
                    block6: {
                        object = "GA_PRODUCT_HANDLER_THREAD";
                        try {
                            object2 = new HandlerThread((String)object);
                            ((Thread)object2).start();
                            object = AnalyticsGAEventHandlerMultipleWidget.access$getMINSTANCE$cp();
                            if (object != null) break block6;
                        }
                        catch (Throwable throwable2) {}
                        object = new AnalyticsGAEventHandlerMultipleWidget((HandlerThread)object2);
                        AnalyticsGAEventHandlerMultipleWidget.access$setMINSTANCE$cp(object);
                        break block6;
                        break block8;
                    }
                    object2 = object;
                    break block7;
                }
                throw throwable2;
            }
        }
        AnalyticsGAEventHandlerMultipleWidget.access$setMINSTANCE$cp(object2);
        object2 = AnalylticsGAHolderForProduct.INSTANCE;
        object = AnalyticsGAEventHandlerMultipleWidget.access$getMINSTANCE$cp();
        ((AnalylticsGAHolderForProduct)object2).addEventHandlerToList((AnalyticsGAEventHandlerMultipleWidget)((Object)object));
        object2 = AnalyticsGAEventHandlerMultipleWidget.access$getMINSTANCE$cp();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget");
        return object2;
    }

    public final AnalyticsGAEventHandlerMultipleWidget getMultipleWidgetInstance() {
        HandlerThread handlerThread = new HandlerThread("GA_PRODUCT_HANDLER_THREAD");
        handlerThread.start();
        AnalyticsGAEventHandlerMultipleWidget analyticsGAEventHandlerMultipleWidget = new AnalyticsGAEventHandlerMultipleWidget(handlerThread);
        AnalylticsGAHolderForProduct.INSTANCE.addEventHandlerToList(analyticsGAEventHandlerMultipleWidget);
        return analyticsGAEventHandlerMultipleWidget;
    }
}

