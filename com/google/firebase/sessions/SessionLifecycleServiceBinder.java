/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 *  android.os.Messenger
 */
package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;

public interface SessionLifecycleServiceBinder {
    public void bindToService(Messenger var1, ServiceConnection var2);
}

