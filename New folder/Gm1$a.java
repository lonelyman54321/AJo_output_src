/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class Gm1$a {
    public final String[] a;
    public final aa2_2 b;

    public Gm1$a(String[] stringArray, aa2_2 aa2_22) {
        this.a = stringArray;
        this.b = aa2_22;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Gm1$a a(String ... stringArray) {
        IOException iOException2;
        Object object;
        block12: {
            try {
                int n3;
                int n4 = stringArray.length;
                object = new ff_2[n4];
                Object object2 = new ce_2();
                for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
                    Object object3 = stringArray[i3];
                    String[] stringArray2 = gm1_0.e;
                    int n7 = 34;
                    ((ce_2)object2).U(n7);
                    int n8 = ((String)object3).length();
                    int n10 = 0;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        String string2;
                        int n14;
                        int n15 = ((String)object3).charAt(i8);
                        if (n15 < (n14 = 128)) {
                            string2 = stringArray2[n15];
                            if (string2 == null) {
                                continue;
                            }
                        } else {
                            n14 = 8232;
                            if (n15 == n14) {
                                string2 = "\\u2028";
                            } else {
                                n14 = 8233;
                                if (n15 != n14) continue;
                                string2 = "\\u2029";
                            }
                        }
                        if (n10 < i8) {
                            ((ce_2)object2).G0(n10, i8, (String)object3);
                        }
                        ((ce_2)object2).I0(string2);
                        n10 = i8 + 1;
                    }
                    if (n10 < n8) {
                        ((ce_2)object2).G0(n10, n8, (String)object3);
                    }
                    ((ce_2)object2).U(n7);
                    ((ce_2)object2).readByte();
                    long l2 = ((ce_2)object2).b;
                    object[i3] = object3 = ((ce_2)object2).b0(l2);
                }
            }
            catch (IOException iOException2) {
                break block12;
            }
            stringArray = stringArray.clone();
            {
                object = aa2$a.b(object);
                return new Gm1$a(stringArray, (aa2_2)object);
            }
        }
        object = new AssertionError((Object)iOException2);
        throw object;
    }
}

