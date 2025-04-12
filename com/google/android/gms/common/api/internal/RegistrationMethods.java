/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods$Builder;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zacn;

public class RegistrationMethods {
    public final RegisterListenerMethod register;
    public final UnregisterListenerMethod zaa;
    public final Runnable zab;

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable2, zacn zacn2) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable2;
    }

    public static RegistrationMethods$Builder builder() {
        RegistrationMethods$Builder registrationMethods$Builder = new RegistrationMethods$Builder(null);
        return registrationMethods$Builder;
    }
}

