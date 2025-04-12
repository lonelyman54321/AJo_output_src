/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from nr1
 */
public final class nr1_0 {
    public static String a(DF dF) {
        char c2;
        int n3 = dF.size();
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (n3 = 0; n3 < (c2 = dF.size()); ++n3) {
            String string2;
            char c3;
            c2 = (char)dF.a(n3);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int b(jq1_0 jq1_02, pg2_0 pg2_02) {
        long l2;
        pg2_0 pg2_03 = pg2_0.Vertical;
        if (pg2_02 == pg2_03) {
            l2 = jq1_02.n();
            long l3 = 0xFFFFFFFFL;
            l2 &= l3;
            return (int)l2;
        }
        l2 = jq1_02.n();
        int n3 = 32;
        l2 >>= n3;
        return (int)l2;
    }
}

