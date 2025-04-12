/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzeu;

final class zzet {
    /*
     * Enabled aggressive block sorting
     */
    public static String zzc(zzbb serializable) {
        zzeu zzeu2 = new zzeu((zzbb)serializable);
        int n3 = zzeu2.size();
        serializable = new StringBuilder(n3);
        n3 = 0;
        while (true) {
            block15: {
                String string2;
                block16: {
                    block12: {
                        block13: {
                            block14: {
                                int n4;
                                int n7;
                                if (n3 >= (n7 = zzeu2.size())) {
                                    return ((StringBuilder)serializable).toString();
                                }
                                n7 = zzeu2.zzj(n3);
                                if (n7 == (n4 = 34)) break block12;
                                n4 = 39;
                                if (n7 == n4) break block13;
                                n4 = 92;
                                if (n7 == n4) break block14;
                                switch (n7) {
                                    default: {
                                        int n8 = 32;
                                        if (n7 < n8 || n7 > (n8 = 126)) {
                                            ((StringBuilder)serializable).append((char)n4);
                                            n4 = (char)((n7 >>> 6 & 3) + 48);
                                            ((StringBuilder)serializable).append((char)n4);
                                            n4 = (char)((n7 >>> 3 & 7) + 48);
                                            ((StringBuilder)serializable).append((char)n4);
                                            n7 = (n7 & 7) + 48;
                                        }
                                        n7 = (char)n7;
                                        ((StringBuilder)serializable).append((char)n7);
                                        break block15;
                                    }
                                    case 13: {
                                        string2 = "\\r";
                                        break;
                                    }
                                    case 12: {
                                        string2 = "\\f";
                                        break;
                                    }
                                    case 11: {
                                        string2 = "\\v";
                                        break;
                                    }
                                    case 10: {
                                        string2 = "\\n";
                                        break;
                                    }
                                    case 9: {
                                        string2 = "\\t";
                                        break;
                                    }
                                    case 8: {
                                        string2 = "\\b";
                                        break;
                                    }
                                    case 7: {
                                        string2 = "\\a";
                                        break;
                                    }
                                }
                                break block16;
                            }
                            string2 = "\\\\";
                            break block16;
                        }
                        string2 = "\\'";
                        break block16;
                    }
                    string2 = "\\\"";
                }
                ((StringBuilder)serializable).append(string2);
            }
            ++n3;
        }
    }
}

