/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.iid.internal;

import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal$NewTokenListener;

public interface FirebaseInstanceIdInternal {
    public void addNewTokenListener(FirebaseInstanceIdInternal$NewTokenListener var1);

    public void deleteToken(String var1, String var2);

    public String getId();

    public String getToken();

    public Task getTokenTask();
}

