/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;

public final class dy$b
implements nd1$a {
    public final ey_2 b;

    public dy$b() {
        ey_2 ey_22;
        this.b = ey_22;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final int a(d object) {
        int n3;
        int n4 = 4;
        int n7 = 1;
        String string2 = ((d)object).o;
        if (string2 == null) return tj2_0.a(0, 0, 0, 0);
        int n8 = ip1_0.i(string2);
        if (n8 == 0) {
            return tj2_0.a(0, 0, 0, 0);
        }
        n8 = gz3.a;
        object = ((d)object).o;
        object.getClass();
        n8 = gz3.a;
        int n10 = -1;
        int n14 = ((String)object).hashCode();
        switch (n14) {
            default: {
                break;
            }
            case -879258763: {
                String string3 = "image/png";
                n3 = (int)(((String)object).equals(string3) ? 1 : 0);
                if (n3 == 0) break;
                n10 = 6;
                break;
            }
            case -879272239: {
                String string4 = "image/bmp";
                n3 = (int)(((String)object).equals(string4) ? 1 : 0);
                if (n3 == 0) break;
                n10 = 5;
                break;
            }
            case -1487018032: {
                String string5 = "image/webp";
                n3 = (int)(((String)object).equals(string5) ? 1 : 0);
                if (n3 == 0) break;
                n10 = 4;
                break;
            }
            case -1487394660: {
                String string6 = "image/jpeg";
                n3 = (int)(((String)object).equals(string6) ? 1 : 0);
                if (n3 == 0) break;
                n10 = 3;
                break;
            }
            case -1487464690: {
                String string7 = "image/heif";
                n3 = (int)(((String)object).equals(string7) ? 1 : 0);
                if (n3 == 0) break;
                n10 = 2;
                break;
            }
            case -1487464693: {
                String string8 = "image/heic";
                n3 = (int)(((String)object).equals(string8) ? 1 : 0);
                if (n3 == 0) break;
                n10 = 1;
                break;
            }
            case -1487656890: {
                String string9 = "image/avif";
                n3 = (int)(((String)object).equals(string9) ? 1 : 0);
                if (n3 == 0) break;
                n10 = 0;
            }
        }
        int n15 = Integer.MIN_VALUE;
        block14: do {
            switch (n15 == Integer.MIN_VALUE ? n10 : n15) {
                default: {
                    return tj2_0.a(n7, 0, 0, 0);
                }
                case 1: 
                case 2: {
                    n3 = 26;
                    if (n8 < n3) return tj2_0.a(n7, 0, 0, 0);
                    n15 = 3;
                    continue block14;
                }
                case 0: {
                    n3 = 34;
                    if (n8 < n3) return tj2_0.a(n7, 0, 0, 0);
                }
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    return tj2_0.a(n4, 0, 0, 0);
                }
            }
        } while (true);
        return tj2_0.a(n7, 0, 0, 0);
    }
}

