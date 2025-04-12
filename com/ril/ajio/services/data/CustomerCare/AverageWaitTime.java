/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

public final class AverageWaitTime {
    private String language;
    private boolean luxury;
    private String queueName;
    private Integer waitTimeInMin;

    public final String getLanguage() {
        return this.language;
    }

    public final boolean getLuxury() {
        return this.luxury;
    }

    public final String getQueueName() {
        return this.queueName;
    }

    public final Integer getWaitTimeInMin() {
        return this.waitTimeInMin;
    }

    public final void setLanguage(String string2) {
        this.language = string2;
    }

    public final void setLuxury(boolean bl2) {
        this.luxury = bl2;
    }

    public final void setQueueName(String string2) {
        this.queueName = string2;
    }

    public final void setWaitTimeInMin(Integer n3) {
        this.waitTimeInMin = n3;
    }
}

