/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext$Builder;
import com.google.android.datatransport.runtime.TransportContext$Builder;

public abstract class TransportContext {
    public static TransportContext$Builder builder() {
        AutoValue_TransportContext$Builder autoValue_TransportContext$Builder = new AutoValue_TransportContext$Builder();
        Priority priority = Priority.DEFAULT;
        return autoValue_TransportContext$Builder.setPriority(priority);
    }

    public abstract String getBackendName();

    public abstract byte[] getExtras();

    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        boolean bl2;
        byte[] byArray = this.getExtras();
        if (byArray != null) {
            bl2 = true;
        } else {
            bl2 = false;
            byArray = null;
        }
        return bl2;
    }

    public final String toString() {
        String string2 = this.getBackendName();
        Priority priority = this.getPriority();
        Object object = this.getExtras();
        if (object == null) {
            object = "";
        } else {
            object = this.getExtras();
            int n3 = 2;
            object = Base64.encodeToString((byte[])object, (int)n3);
        }
        StringBuilder stringBuilder = new StringBuilder("TransportContext(");
        stringBuilder.append(string2);
        string2 = ", ";
        stringBuilder.append(string2);
        stringBuilder.append((Object)priority);
        stringBuilder.append(string2);
        return h30_0.a(stringBuilder, (String)object, ")");
    }

    public TransportContext withPriority(Priority object) {
        Object object2 = TransportContext.builder();
        String string2 = this.getBackendName();
        object = ((TransportContext$Builder)object2).setBackendName(string2).setPriority((Priority)((Object)object));
        object2 = this.getExtras();
        return ((TransportContext$Builder)object).setExtras((byte[])object2).build();
    }
}

