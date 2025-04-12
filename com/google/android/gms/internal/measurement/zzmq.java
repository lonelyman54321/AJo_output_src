/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzmt;

final class zzmq {
    public static String zza(zziy serializable) {
        char c2;
        zzmt zzmt2 = new zzmt((zziy)serializable);
        int n3 = zzmt2.zza();
        serializable = new StringBuilder(n3);
        for (n3 = 0; n3 < (c2 = zzmt2.zza()); ++n3) {
            String string2;
            char c3;
            c2 = (char)zzmt2.zza(n3);
            if (c2 != (c3 = '\"')) {
                c3 = '\'';
                if (c2 != c3) {
                    c3 = '\\';
                    if (c2 != c3) {
                        switch (c2) {
                            default: {
                                char c5 = ' ';
                                if (c2 >= c5 && c2 <= (c5 = '~')) {
                                    c2 = c2;
                                    ((StringBuilder)serializable).append(c2);
                                    break;
                                }
                                ((StringBuilder)serializable).append(c3);
                                c3 = (char)((c2 >>> 6 & 3) + 48);
                                ((StringBuilder)serializable).append(c3);
                                c3 = (char)((c2 >>> 3 & 7) + 48);
                                ((StringBuilder)serializable).append(c3);
                                c2 = (char)((c2 & 7) + 48);
                                ((StringBuilder)serializable).append(c2);
                                break;
                            }
                            case '\r': {
                                string2 = "\\r";
                                ((StringBuilder)serializable).append(string2);
                                break;
                            }
                            case '\f': {
                                string2 = "\\f";
                                ((StringBuilder)serializable).append(string2);
                                break;
                            }
                            case '\u000b': {
                                string2 = "\\v";
                                ((StringBuilder)serializable).append(string2);
                                break;
                            }
                            case '\n': {
                                string2 = "\\n";
                                ((StringBuilder)serializable).append(string2);
                                break;
                            }
                            case '\t': {
                                string2 = "\\t";
                                ((StringBuilder)serializable).append(string2);
                                break;
                            }
                            case '\b': {
                                string2 = "\\b";
                                ((StringBuilder)serializable).append(string2);
                                break;
                            }
                            case '\u0007': {
                                string2 = "\\a";
                                ((StringBuilder)serializable).append(string2);
                                break;
                            }
                        }
                        continue;
                    }
                    string2 = "\\\\";
                    ((StringBuilder)serializable).append(string2);
                    continue;
                }
                string2 = "\\'";
                ((StringBuilder)serializable).append(string2);
                continue;
            }
            string2 = "\\\"";
            ((StringBuilder)serializable).append(string2);
        }
        return ((StringBuilder)serializable).toString();
    }
}

