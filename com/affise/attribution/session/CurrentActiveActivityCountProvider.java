/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.session;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public interface CurrentActiveActivityCountProvider {
    public void addActivityCountListener(Function1 var1);

    public void addActivityStopListener(Function0 var1);

    public long getActivityCount();

    public void init();
}

