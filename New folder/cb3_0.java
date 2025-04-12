/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.google.common.base.Ascii;

/*
 * Renamed from cb3
 */
public final class cb3_0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public cb3_0(int n3, int n4, int n7, int n8, int n10) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
        this.e = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static cb3_0 a(String object) {
        cb3_0 cb3_02;
        int n3;
        Object object2;
        int n4;
        int n7 = 1;
        ct3.a(((String)object).startsWith("Format:"));
        object = ((String)object).substring(7);
        String string2 = ",";
        object = TextUtils.split((String)object, (String)string2);
        int n8 = -1;
        int n10 = -1;
        int n14 = -1;
        int n15 = -1;
        int n16 = -1;
        block12: for (int i3 = 0; i3 < (n4 = ((Object)object).length); i3 += n7) {
            block13: {
                block14: {
                    object2 = Ascii.toLowerCase(((String)object[i3]).trim());
                    object2.getClass();
                    n3 = ((String)object2).hashCode();
                    switch (n3) {
                        case 109780401: {
                            String string3 = "style";
                            n4 = (int)(((String)object2).equals(string3) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 3;
                            break block13;
                        }
                        case 109757538: {
                            String string3 = "start";
                            n4 = (int)(((String)object2).equals(string3) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 2;
                            break block13;
                        }
                        case 3556653: {
                            String string3 = "text";
                            n4 = (int)(((String)object2).equals(string3) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 1;
                            break block13;
                        }
                        case 100571: {
                            String string3 = "end";
                            n4 = (int)(((String)object2).equals(string3) ? 1 : 0);
                            if (n4 != 0) break block14;
                        }
                    }
                    n4 = -1;
                    break block13;
                }
                n4 = 0;
                object2 = null;
            }
            switch (n4) {
                default: {
                    continue block12;
                }
                case 3: {
                    n15 = i3;
                    continue block12;
                }
                case 2: {
                    n10 = i3;
                    continue block12;
                }
                case 1: {
                    n16 = i3;
                    continue block12;
                }
                case 0: {
                    n14 = i3;
                }
            }
        }
        if (n10 == n8) return null;
        if (n14 == n8) return null;
        if (n16 == n8) return null;
        n3 = ((Object)object).length;
        object2 = cb3_02;
        return new cb3_0(n10, n14, n15, n16, n3);
    }
}

