/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.ProductData;

final class AutoValue_Event
extends Event {
    private final Integer code;
    private final EventContext eventContext;
    private final Object payload;
    private final Priority priority;
    private final ProductData productData;

    public AutoValue_Event(Integer serializable, Object object, Priority priority, ProductData productData, EventContext eventContext) {
        this.code = serializable;
        if (object != null) {
            this.payload = object;
            if (priority != null) {
                this.priority = priority;
                this.productData = productData;
                this.eventContext = eventContext;
                return;
            }
            super("Null priority");
            throw serializable;
        }
        super("Null payload");
        throw serializable;
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    Object object2;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl4 = object instanceof Event;
                    if (!bl4) break block4;
                    object = (Event)object;
                    Object object3 = this.code;
                    if (!(object3 == null ? (object3 = ((Event)object).getCode()) == null : (bl4 = ((Integer)object3).equals(object2 = ((Event)object).getCode())))) break block5;
                    object3 = this.payload;
                    object2 = ((Event)object).getPayload();
                    bl4 = object3.equals(object2);
                    if (bl4 && (bl4 = (object3 = this.priority).equals(object2 = ((Event)object).getPriority())) && ((object3 = this.productData) == null ? (object3 = ((Event)object).getProductData()) == null : (bl4 = object3.equals(object2 = ((Event)object).getProductData()))) && ((object3 = this.eventContext) == null ? (object = ((Event)object).getEventContext()) == null : (bl3 = object3.equals(object = ((Event)object).getEventContext())))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public Integer getCode() {
        return this.code;
    }

    public EventContext getEventContext() {
        return this.eventContext;
    }

    public Object getPayload() {
        return this.payload;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public ProductData getProductData() {
        return this.productData;
    }

    public int hashCode() {
        int n3;
        Integer n4 = this.code;
        int n7 = 0;
        if (n4 == null) {
            n3 = 0;
            n4 = null;
        } else {
            n3 = n4.hashCode();
        }
        int n8 = 1000003;
        n3 = (n3 ^ n8) * n8;
        int n10 = this.payload.hashCode();
        n3 = (n3 ^ n10) * n8;
        n10 = ((Object)((Object)this.priority)).hashCode();
        n3 = (n3 ^ n10) * n8;
        ProductData productData = this.productData;
        if (productData == null) {
            n10 = 0;
            productData = null;
        } else {
            n10 = productData.hashCode();
        }
        n3 = (n3 ^ n10) * n8;
        EventContext eventContext = this.eventContext;
        if (eventContext != null) {
            n7 = eventContext.hashCode();
        }
        return n3 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Event{code=");
        Object object = this.code;
        stringBuilder.append(object);
        stringBuilder.append(", payload=");
        object = this.payload;
        stringBuilder.append(object);
        stringBuilder.append(", priority=");
        object = this.priority;
        stringBuilder.append(object);
        stringBuilder.append(", productData=");
        object = this.productData;
        stringBuilder.append(object);
        stringBuilder.append(", eventContext=");
        object = this.eventContext;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

