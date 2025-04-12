/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
package com.google.firebase.sessions;

import android.os.Message;
import java.util.Comparator;

public final class SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = ((Message)object).getWhen();
        object2 = ((Message)object2).getWhen();
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

