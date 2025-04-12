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

public final class jZ1 {
    public static jZ1 b;
    public final Tracker a;

    public jZ1(AJIOApplication object) {
        object = GoogleAnalytics.getInstance((Context)object);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(...)");
        this.a = object = ((GoogleAnalytics)object).newTracker("UA-68002030-16");
        ((Tracker)object).enableAdvertisingIdCollection(true);
    }
}

