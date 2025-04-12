/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import java.util.List;
import java.util.Set;

public abstract class RequestParams
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public abstract Set getAllAppIds();

    public abstract Uri getAppId();

    public abstract ChannelIdValue getChannelIdValue();

    public abstract String getDisplayHint();

    public abstract List getRegisteredKeys();

    public abstract Integer getRequestId();

    public abstract Double getTimeoutSeconds();
}

