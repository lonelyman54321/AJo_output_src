/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision.internal;

import com.google.android.gms.flags.Flag;

public class Flags {
    private static final Flag zza;

    static {
        Boolean bl2 = Boolean.TRUE;
        zza = Flag.define(0, "vision:product_barcode_value_logging_enabled", bl2);
    }

    private Flags() {
    }
}

