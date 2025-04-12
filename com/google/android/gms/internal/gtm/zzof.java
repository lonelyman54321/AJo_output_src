/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class zzof
extends zzjo {
    public final zzqo zza(zzhx zzhx2, zzqo ... object) {
        zzqo zzqo2;
        block15: {
            block17: {
                Object object2;
                block14: {
                    int n3;
                    Object object3;
                    int n4;
                    int n7;
                    block16: {
                        double d2;
                        double d5;
                        zzqo zzqo3;
                        boolean bl2;
                        n7 = 1;
                        Preconditions.checkArgument(n7 != 0);
                        n4 = ((zzqo[])object).length;
                        object2 = null;
                        int n8 = 2;
                        if (n4 >= n8) {
                            bl2 = true;
                        } else {
                            bl2 = false;
                            zzqo2 = null;
                        }
                        Preconditions.checkArgument(bl2);
                        object2 = object[0];
                        zzqo2 = zzqs.zze;
                        if (object2 == zzqo2 || (object3 = object[n7]) == zzqo2) break block15;
                        object2 = zzjn.zzd((zzqo)object2);
                        object3 = zzjn.zzd(object[n7]);
                        n3 = 64;
                        if (n4 > n8 && (zzqo3 = object[n8]) != zzqo2 && (n8 = (int)(zzjn.zzg(zzqo3) ? 1 : 0)) != 0) {
                            n3 = 66;
                        }
                        if (n4 <= (n8 = 3) || (object = object[n8]) == zzqo2) break block16;
                        n7 = object instanceof zzqq;
                        if (n7 == 0) {
                            return zzqo2;
                        }
                        double d7 = zzjn.zza((zzqo)object);
                        n4 = (int)(Double.isInfinite(d7) ? 1 : 0);
                        if (n4 != 0 || (n4 = (int)((d5 = d7 - (d2 = 0.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1))) < 0) break block17;
                        n7 = (int)d7;
                    }
                    try {
                        object = Pattern.compile((String)object3, n3);
                    }
                    catch (PatternSyntaxException patternSyntaxException) {}
                    object = ((Pattern)object).matcher((CharSequence)object2);
                    n4 = (int)(((Matcher)object).find() ? 1 : 0);
                    object2 = null;
                    if (n4 == 0) break block14;
                    n4 = ((Matcher)object).groupCount();
                    if (n4 < n7) break block14;
                    object2 = ((Matcher)object).group(n7);
                }
                if (object2 != null) {
                    zzqo2 = new zzqz((String)object2);
                }
                return zzqo2;
            }
            return zzqs.zze;
        }
        return zzqo2;
    }
}

