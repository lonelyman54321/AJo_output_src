/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;
import java.util.concurrent.ScheduledFuture;

interface DelegatingScheduledFuture$Resolver {
    public ScheduledFuture addCompleter(DelegatingScheduledFuture$Completer var1);
}

