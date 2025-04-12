/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.AutoValue_EventInternal$1;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;
import java.util.Map;

final class AutoValue_EventInternal
extends EventInternal {
    private final Map autoMetadata;
    private final Integer code;
    private final EncodedPayload encodedPayload;
    private final long eventMillis;
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final Integer productId;
    private final String pseudonymousId;
    private final String transportName;
    private final long uptimeMillis;

    private AutoValue_EventInternal(String string2, Integer n3, EncodedPayload encodedPayload, long l2, long l3, Map map2, Integer n4, String string3, byte[] byArray, byte[] byArray2) {
        this.transportName = string2;
        this.code = n3;
        this.encodedPayload = encodedPayload;
        this.eventMillis = l2;
        this.uptimeMillis = l3;
        this.autoMetadata = map2;
        this.productId = n4;
        this.pseudonymousId = string3;
        this.experimentIdsClear = byArray;
        this.experimentIdsEncrypted = byArray2;
    }

    public /* synthetic */ AutoValue_EventInternal(String string2, Integer n3, EncodedPayload encodedPayload, long l2, long l3, Map map2, Integer n4, String string3, byte[] byArray, byte[] byArray2, AutoValue_EventInternal$1 autoValue_EventInternal$1) {
        this(string2, n3, encodedPayload, l2, l3, map2, n4, string3, byArray, byArray2);
    }

    public boolean equals(Object object) {
        block6: {
            boolean bl2;
            block8: {
                block7: {
                    boolean bl3;
                    Object object2;
                    long l2;
                    long l3;
                    long l4;
                    long l7;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl4 = object instanceof EventInternal;
                    if (!bl4) break block6;
                    Object object3 = this.transportName;
                    Object object4 = ((EventInternal)(object = (EventInternal)object)).getTransportName();
                    bl4 = ((String)object3).equals(object4);
                    if (!bl4 || !((object3 = this.code) == null ? (object3 = ((EventInternal)object).getCode()) == null : (bl4 = ((Integer)object3).equals(object4 = ((EventInternal)object).getCode())))) break block7;
                    object3 = this.encodedPayload;
                    object4 = ((EventInternal)object).getEncodedPayload();
                    bl4 = ((EncodedPayload)object3).equals(object4);
                    if (!bl4 || (bl4 = (l7 = (l4 = this.eventMillis) - (l3 = ((EventInternal)object).getEventMillis())) == 0L ? 0 : (l7 < 0L ? -1 : 1)) || (bl4 = (l2 = (l4 = this.uptimeMillis) - (l3 = ((EventInternal)object).getUptimeMillis())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) || !(bl4 = (object3 = this.autoMetadata).equals(object4 = ((EventInternal)object).getAutoMetadata())) || !((object3 = this.productId) == null ? (object3 = ((EventInternal)object).getProductId()) == null : (bl4 = ((Integer)object3).equals(object4 = ((EventInternal)object).getProductId()))) || !((object3 = this.pseudonymousId) == null ? (object3 = ((EventInternal)object).getPseudonymousId()) == null : (bl4 = ((String)object3).equals(object4 = ((EventInternal)object).getPseudonymousId())))) break block7;
                    object3 = this.experimentIdsClear;
                    boolean bl5 = object instanceof AutoValue_EventInternal;
                    if (bl5) {
                        object2 = object;
                        object2 = ((AutoValue_EventInternal)object).experimentIdsClear;
                    } else {
                        object2 = ((EventInternal)object).getExperimentIdsClear();
                    }
                    bl4 = Arrays.equals((byte[])object3, (byte[])object2);
                    if (bl4 && (bl3 = Arrays.equals((byte[])(object3 = (Object)this.experimentIdsEncrypted), (byte[])(object = bl5 ? (Object)((AutoValue_EventInternal)object).experimentIdsEncrypted : (Object)((EventInternal)object).getExperimentIdsEncrypted())))) break block8;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public Map getAutoMetadata() {
        return this.autoMetadata;
    }

    public Integer getCode() {
        return this.code;
    }

    public EncodedPayload getEncodedPayload() {
        return this.encodedPayload;
    }

    public long getEventMillis() {
        return this.eventMillis;
    }

    public byte[] getExperimentIdsClear() {
        return this.experimentIdsClear;
    }

    public byte[] getExperimentIdsEncrypted() {
        return this.experimentIdsEncrypted;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public String getPseudonymousId() {
        return this.pseudonymousId;
    }

    public String getTransportName() {
        return this.transportName;
    }

    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        int n3;
        String string2 = this.transportName;
        int n4 = string2.hashCode();
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        Object object = this.code;
        int n8 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Integer)object).hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        n3 = this.encodedPayload.hashCode();
        n4 = (n4 ^ n3) * n7;
        long l2 = this.eventMillis;
        n3 = 32;
        long l3 = l2 >>> n3;
        int n10 = (int)(l2 ^ l3);
        n4 = (n4 ^ n10) * n7;
        l2 = this.uptimeMillis;
        l3 = l2 >>> n3;
        n3 = (int)(l2 ^= l3);
        n4 = (n4 ^ n3) * n7;
        n3 = this.autoMetadata.hashCode();
        n4 = (n4 ^ n3) * n7;
        object = this.productId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Integer)object).hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        object = this.pseudonymousId;
        if (object != null) {
            n8 = ((String)object).hashCode();
        }
        n4 = (n4 ^ n8) * n7;
        n3 = Arrays.hashCode(this.experimentIdsClear);
        n4 = (n4 ^ n3) * n7;
        n7 = Arrays.hashCode(this.experimentIdsEncrypted);
        return n4 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("EventInternal{transportName=");
        Object object = this.transportName;
        stringBuilder.append((String)object);
        stringBuilder.append(", code=");
        object = this.code;
        stringBuilder.append(object);
        stringBuilder.append(", encodedPayload=");
        object = this.encodedPayload;
        stringBuilder.append(object);
        stringBuilder.append(", eventMillis=");
        long l2 = this.eventMillis;
        stringBuilder.append(l2);
        stringBuilder.append(", uptimeMillis=");
        l2 = this.uptimeMillis;
        stringBuilder.append(l2);
        stringBuilder.append(", autoMetadata=");
        object = this.autoMetadata;
        stringBuilder.append(object);
        stringBuilder.append(", productId=");
        object = this.productId;
        stringBuilder.append(object);
        stringBuilder.append(", pseudonymousId=");
        object = this.pseudonymousId;
        stringBuilder.append((String)object);
        stringBuilder.append(", experimentIdsClear=");
        object = Arrays.toString(this.experimentIdsClear);
        stringBuilder.append((String)object);
        stringBuilder.append(", experimentIdsEncrypted=");
        object = Arrays.toString(this.experimentIdsEncrypted);
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

