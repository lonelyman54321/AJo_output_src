/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.predefined;

import com.affise.attribution.events.NativeEvent;
import com.affise.attribution.events.predefined.GDPREvent$Companion;
import com.affise.attribution.utils.TimestampKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GDPREvent
extends NativeEvent {
    public static final GDPREvent$Companion Companion;
    public static final String EVENT_NAME = "GDPR";
    private final String userData;

    static {
        GDPREvent$Companion gDPREvent$Companion;
        Companion = gDPREvent$Companion = new GDPREvent$Companion(null);
    }

    public GDPREvent() {
        this(null, 1, null);
    }

    public GDPREvent(String string2) {
        long l2 = TimestampKt.timestamp();
        super(string2, l2);
        this.userData = string2;
    }

    public /* synthetic */ GDPREvent(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public String getName() {
        return EVENT_NAME;
    }
}

