/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzaa;
import com.google.android.gms.internal.common.zzt;
import java.io.IOException;
import java.util.Iterator;

final class zzy
implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzaa zzb;

    public zzy(zzaa zzaa2, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzaa2;
    }

    public final Iterator iterator() {
        zzaa zzaa2 = this.zzb;
        CharSequence charSequence = this.zza;
        return zzaa.zze(zzaa2, charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        IOException iOException2;
        Object object;
        block4: {
            block3: {
                String string2 = ", ";
                object = new StringBuilder();
                char c2 = '[';
                ((StringBuilder)object).append(c2);
                Iterator iterator = this.iterator();
                try {
                    boolean bl2 = iterator.hasNext();
                    if (!bl2) break block3;
                    Object t3 = iterator.next();
                    CharSequence charSequence = zzt.zza(t3, string2);
                    ((StringBuilder)object).append(charSequence);
                    while (bl2 = iterator.hasNext()) {
                        ((StringBuilder)object).append((CharSequence)string2);
                        Object t4 = iterator.next();
                        CharSequence charSequence2 = zzt.zza(t4, string2);
                        ((StringBuilder)object).append(charSequence2);
                    }
                }
                catch (IOException iOException2) {
                    break block4;
                }
            }
            ((StringBuilder)object).append(']');
            return ((StringBuilder)object).toString();
        }
        object = new AssertionError((Object)iOException2);
        throw object;
    }
}

