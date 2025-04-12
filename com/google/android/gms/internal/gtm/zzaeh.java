/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzyx;

final class zzaeh {
    public static String zza(zzyx zzyx2) {
        char c2;
        int n3 = zzyx2.zzd();
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (n3 = 0; n3 < (c2 = zzyx2.zzd()); ++n3) {
            String string2;
            char c3;
            c2 = (char)zzyx2.zza(n3);
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
                                    stringBuilder.append(c2);
                                    break;
                                }
                                stringBuilder.append(c3);
                                c3 = (char)((c2 >>> 6 & 3) + 48);
                                stringBuilder.append(c3);
                                c3 = (char)((c2 >>> 3 & 7) + 48);
                                stringBuilder.append(c3);
                                c2 = (char)((c2 & 7) + 48);
                                stringBuilder.append(c2);
                                break;
                            }
                            case '\r': {
                                string2 = "\\r";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\f': {
                                string2 = "\\f";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\u000b': {
                                string2 = "\\v";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\n': {
                                string2 = "\\n";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\t': {
                                string2 = "\\t";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\b': {
                                string2 = "\\b";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\u0007': {
                                string2 = "\\a";
                                stringBuilder.append(string2);
                                break;
                            }
                        }
                        continue;
                    }
                    string2 = "\\\\";
                    stringBuilder.append(string2);
                    continue;
                }
                string2 = "\\'";
                stringBuilder.append(string2);
                continue;
            }
            string2 = "\\\"";
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }
}

