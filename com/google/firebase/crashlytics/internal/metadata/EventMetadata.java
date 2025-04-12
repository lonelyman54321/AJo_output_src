/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EventMetadata {
    private final Map additionalCustomKeys;
    private final String sessionId;
    private final long timestamp;

    public EventMetadata(String string2, long l2) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        this(string2, l2, null, 4, null);
    }

    public EventMetadata(String string2, long l2, Map map2) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        Intrinsics.checkNotNullParameter(map2, "additionalCustomKeys");
        this.sessionId = string2;
        this.timestamp = l2;
        this.additionalCustomKeys = map2;
    }

    public /* synthetic */ EventMetadata(String string2, long l2, Map map2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 4) != 0) {
            map2 = fh1_2.f();
        }
        this(string2, l2, map2);
    }

    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, String string2, long l2, Map map2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = eventMetadata.sessionId;
        }
        if ((n4 = n3 & 2) != 0) {
            l2 = eventMetadata.timestamp;
        }
        if ((n3 &= 4) != 0) {
            map2 = eventMetadata.additionalCustomKeys;
        }
        return eventMetadata.copy(string2, l2, map2);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final Map component3() {
        return this.additionalCustomKeys;
    }

    public final EventMetadata copy(String string2, long l2, Map map2) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        Intrinsics.checkNotNullParameter(map2, "additionalCustomKeys");
        EventMetadata eventMetadata = new EventMetadata(string2, l2, map2);
        return eventMetadata;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof EventMetadata;
        if (!object2) {
            return false;
        }
        object = (EventMetadata)object;
        Object object3 = this.sessionId;
        String string2 = ((EventMetadata)object).sessionId;
        object2 = Intrinsics.areEqual(object3, string2);
        if (!object2) {
            return false;
        }
        long l2 = this.timestamp;
        long l3 = ((EventMetadata)object).timestamp;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object3 = this.additionalCustomKeys;
        object = ((EventMetadata)object).additionalCustomKeys;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final Map getAdditionalCustomKeys() {
        return this.additionalCustomKeys;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int n3 = this.sessionId.hashCode() * 31;
        long l2 = this.timestamp;
        long l3 = l2 >>> 32;
        int n4 = (int)(l2 ^ l3);
        n3 = (n3 + n4) * 31;
        return ((Object)this.additionalCustomKeys).hashCode() + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("EventMetadata(sessionId=");
        Object object = this.sessionId;
        stringBuilder.append((String)object);
        stringBuilder.append(", timestamp=");
        long l2 = this.timestamp;
        stringBuilder.append(l2);
        stringBuilder.append(", additionalCustomKeys=");
        object = this.additionalCustomKeys;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

