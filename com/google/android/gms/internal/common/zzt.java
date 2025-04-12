/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import java.util.Objects;

public final class zzt {
    public static final CharSequence zza(Object object, String string2) {
        Objects.requireNonNull(object);
        boolean bl2 = object instanceof CharSequence;
        object = bl2 ? (CharSequence)object : object.toString();
        return object;
    }
}

