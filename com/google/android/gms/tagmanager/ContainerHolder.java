/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.ContainerHolder$ContainerAvailableListener;

public interface ContainerHolder
extends Result,
Releasable {
    public Container getContainer();

    public void refresh();

    public void setContainerAvailableListener(ContainerHolder$ContainerAvailableListener var1);
}

