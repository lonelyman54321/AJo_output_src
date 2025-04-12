/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.Checkable
 */
package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.MaterialCheckable$OnCheckedChangeListener;

public interface MaterialCheckable
extends Checkable {
    public int getId();

    public void setInternalOnCheckedChangeListener(MaterialCheckable$OnCheckedChangeListener var1);
}

