/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

public abstract class BrowserRequestOptions
extends RequestOptions {
    public abstract byte[] getClientDataHash();

    public abstract Uri getOrigin();
}

