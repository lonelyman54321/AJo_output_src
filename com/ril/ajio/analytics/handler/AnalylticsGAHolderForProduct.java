/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
package com.ril.ajio.analytics.handler;

import android.os.Message;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class AnalylticsGAHolderForProduct {
    public static final int $stable;
    public static final AnalylticsGAHolderForProduct INSTANCE;
    private static final ArrayList analyticsGAEventHandlerList;

    static {
        ArrayList arrayList = new ArrayList();
        INSTANCE = arrayList;
        analyticsGAEventHandlerList = arrayList = new ArrayList();
        $stable = 8;
    }

    private AnalylticsGAHolderForProduct() {
    }

    public final void addEventHandlerToList(AnalyticsGAEventHandlerMultipleWidget analyticsGAEventHandlerMultipleWidget) {
        ArrayList arrayList = analyticsGAEventHandlerList;
        boolean bl2 = arrayList.contains((Object)analyticsGAEventHandlerMultipleWidget);
        if (!bl2) {
            arrayList.add(analyticsGAEventHandlerMultipleWidget);
        }
    }

    public final void clearAllRemainingEvents() {
        Object object = analyticsGAEventHandlerList;
        boolean bl2 = object.isEmpty() ^ true;
        if (bl2) {
            object = ((ArrayList)object).iterator();
            Object object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, object2);
            while (bl2 = object.hasNext()) {
                int n3;
                object2 = (AnalyticsGAEventHandlerMultipleWidget)((Object)object.next());
                Message message = new Message();
                message.what = n3 = 1006;
                if (object2 == null) continue;
                object2.sendMessage(message);
            }
            object = analyticsGAEventHandlerList;
            ((ArrayList)object).clear();
        }
    }

    public final ArrayList getAnalyticsGAEventHandlerList() {
        return analyticsGAEventHandlerList;
    }
}

