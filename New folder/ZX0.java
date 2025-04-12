/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.ril.ajio.AJIOApplication;
import kotlin.jvm.internal.Intrinsics;

public final class ZX0 {
    public static ZX0 b;
    public final Tracker a;

    public ZX0(AJIOApplication object) {
        object = GoogleAnalytics.getInstance((Context)object);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(...)");
        this.a = object = ((GoogleAnalytics)object).newTracker("UA-68002030-4");
        ((Tracker)object).enableAdvertisingIdCollection(true);
    }
}

