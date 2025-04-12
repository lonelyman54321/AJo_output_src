/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState;
import java.util.Map;

class ServiceManager$ServiceManagerState$1
implements Function {
    public ServiceManager$ServiceManagerState$1(ServiceManager$ServiceManagerState serviceManager$ServiceManagerState) {
    }

    public Long apply(Map.Entry entry) {
        return (Long)entry.getValue();
    }
}

