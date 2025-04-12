/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlm;

public final class zzmv
extends RuntimeException {
    public zzmv(zzlm zzlm2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}

