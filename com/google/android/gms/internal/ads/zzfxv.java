/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

public final class zzfxv {
    public static final CharSequence zza(Object object) {
        Objects.requireNonNull(object);
        boolean bl2 = object instanceof CharSequence;
        object = bl2 ? (CharSequence)object : object.toString();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final StringBuilder zzb(StringBuilder stringBuilder, Iterable object, String string2) {
        object = object.iterator();
        try {
            boolean bl2 = object.hasNext();
            if (!bl2) return stringBuilder;
            Object e2 = object.next();
            CharSequence charSequence = zzfxv.zza(e2);
            stringBuilder.append(charSequence);
            while (bl2 = object.hasNext()) {
                stringBuilder.append((CharSequence)string2);
                Object e5 = object.next();
                CharSequence charSequence2 = zzfxv.zza(e5);
                stringBuilder.append(charSequence2);
            }
            return stringBuilder;
        }
        catch (IOException iOException) {}
        object = new AssertionError((Object)iOException);
        throw object;
    }
}

