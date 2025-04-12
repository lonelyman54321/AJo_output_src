/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * Renamed from bx0
 */
public class bx0_0 {
    public static final bx0_0 b;
    public static final String[] c;
    public String a = "identity";

    static {
        bx0_0 bx0_02;
        b = bx0_02 = new bx0_0();
        c = new String[]{"standard", "accelerate", "decelerate", "linear"};
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bx0_0 c(String string2) {
        double d2;
        double d5;
        int n3;
        int n4;
        double[] dArray;
        int n7;
        Object object;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object2;
        block26: {
            CharSequence charSequence;
            block27: {
                block28: {
                    int n16;
                    int n17;
                    String string3;
                    int n18;
                    block25: {
                        object2 = string2;
                        n15 = 3;
                        n14 = -1;
                        n18 = 0;
                        string3 = null;
                        n10 = 2;
                        n8 = 1;
                        if (string2 == null) {
                            return null;
                        }
                        object = "cubic";
                        n17 = string2.startsWith((String)object);
                        if (n17 != 0) {
                            return new bx0$a(string2);
                        }
                        object = "spline";
                        n17 = string2.startsWith((String)object);
                        n16 = 44;
                        n7 = 40;
                        if (n17 == 0) break block25;
                        object = new bx0_0();
                        ((bx0_0)object).a = string2;
                        int n19 = string2.length() / n10;
                        dArray = new double[n19];
                        n7 = string2.indexOf(n7) + n8;
                        int n20 = string2.indexOf(n16, n7);
                        n4 = 0;
                        Object var17_20 = null;
                        while (n20 != n14) {
                            String string4 = ((String)object2).substring(n7, n20).trim();
                            n3 = n4 + 1;
                            dArray[n4] = d5 = Double.parseDouble(string4);
                            n7 = n20 + 1;
                            n20 = ((String)object2).indexOf(n16, n7);
                            n4 = n3;
                        }
                        break block26;
                    }
                    String string5 = "Schlick";
                    n8 = string2.startsWith(string5);
                    if (n8 != 0) {
                        double d7;
                        double d9;
                        tt2_1 tt2_12 = new bx0_0();
                        tt2_12.a = string2;
                        n14 = string2.indexOf(n7);
                        n18 = string2.indexOf(n16, n14);
                        n8 = 1;
                        tt2_12.d = d9 = Double.parseDouble(string2.substring(n14 += n8, n18).trim());
                        n14 = string2.indexOf(n16, n18 += n8);
                        tt2_12.e = d7 = Double.parseDouble(string2.substring(n18, n14).trim());
                        return tt2_12;
                    }
                    n8 = 1;
                    n17 = string2.hashCode();
                    switch (n17) {
                        case 1312628413: {
                            charSequence = "standard";
                            boolean bl2 = string2.equals(charSequence);
                            if (!bl2) break;
                            n15 = 5;
                            break block27;
                        }
                        case -749065269: {
                            charSequence = "overshoot";
                            boolean bl3 = string2.equals(charSequence);
                            if (!bl3) break;
                            n15 = 4;
                            break block27;
                        }
                        case -1102672091: {
                            string3 = "linear";
                            boolean bl4 = string2.equals(string3);
                            if (!bl4) {
                                break;
                            }
                            break block27;
                        }
                        case -1197605014: {
                            charSequence = "anticipate";
                            boolean bl5 = string2.equals(charSequence);
                            if (!bl5) break;
                            n15 = 2;
                            break block27;
                        }
                        case -1263948740: {
                            charSequence = "decelerate";
                            boolean bl6 = string2.equals(charSequence);
                            if (!bl6) break;
                            n15 = 1;
                            break block27;
                        }
                        case -1354466595: {
                            charSequence = "accelerate";
                            boolean bl7 = string2.equals(charSequence);
                            if (bl7) break block28;
                        }
                    }
                    n15 = -1;
                    break block27;
                }
                n15 = 0;
                charSequence = null;
            }
            switch (n15) {
                default: {
                    object2 = System.err;
                    charSequence = new StringBuilder("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                    String string6 = Arrays.toString(c);
                    ((StringBuilder)charSequence).append(string6);
                    charSequence = ((StringBuilder)charSequence).toString();
                    ((PrintStream)object2).println((String)charSequence);
                    return b;
                }
                case 5: {
                    return new bx0$a("cubic(0.4, 0.0, 0.2, 1)");
                }
                case 4: {
                    return new bx0$a("cubic(0.34, 1.56, 0.64, 1)");
                }
                case 3: {
                    return new bx0$a("cubic(1, 1, 0, 0)");
                }
                case 2: {
                    return new bx0$a("cubic(0.36, 0, 0.66, -0.56)");
                }
                case 1: {
                    return new bx0$a("cubic(0.0, 0.0, 0.2, 0.95)");
                }
                case 0: 
            }
            return new bx0$a("cubic(0.4, 0.05, 0.8, 0.7)");
        }
        n14 = ((String)object2).indexOf(41, n7);
        object2 = ((String)object2).substring(n7, n14).trim();
        n14 = n4 + 1;
        dArray[n4] = d2 = Double.parseDouble((String)object2);
        object2 = Arrays.copyOf(dArray, n14);
        n14 = ((Object)object2).length * 3 - n10;
        n15 = ((Object)object2).length - n8;
        d2 = n15;
        double d12 = 1.0;
        d2 = d12 / d2;
        int[] nArray = new int[n10];
        nArray[n8] = n8;
        nArray[0] = n14;
        double[][] dArray2 = (double[][])Array.newInstance(Double.TYPE, nArray);
        Object object3 = new double[n14];
        n3 = 0;
        while (true) {
            Object object4;
            int n21;
            if (n3 >= (n21 = ((Object)object2).length)) {
                object4 = object;
                object2 = new XP1((double[])object3, dArray2);
                Object object5 = System.out;
                object3 = new StringBuilder;
                ((StringBuilder)object3)(" 0 ");
                double d13 = ((XP1)object2).b(0.0);
                ((StringBuilder)object3).append(d13);
                object3 = ((StringBuilder)object3).toString();
                ((PrintStream)object5).println((String)object3);
                object3 = new StringBuilder(" 1 ");
                d13 = ((XP1)object2).b(d12);
                ((StringBuilder)object3).append(d13);
                object3 = ((StringBuilder)object3).toString();
                ((PrintStream)object5).println((String)object3);
                object5 = object;
                ((cc3_0)object).d = object2;
                return object;
            }
            d5 = (double)object2[n3];
            int n22 = n3 + n15;
            double[] dArray3 = dArray2[n22];
            dArray3[0] = d5;
            object4 = object;
            double d14 = (double)n3 * d2;
            object3[n22] = d14;
            if (n3 > 0) {
                double d15;
                n22 = n15 * 2 + n3;
                double[] dArray4 = dArray2[n22];
                dArray4[0] = d15 = d5 + d12;
                double d16 = d14 + d12;
                object3[n22] = d16;
                n22 = 1;
                int n24 = n3 + -1;
                dArray4 = dArray2[n24];
                dArray4[0] = d5 = d5 - d12 - d2;
                d5 = -1.0;
                d14 = d14 + d5 - d2;
                object3[n24] = d14;
            } else {
                n22 = 1;
            }
            n3 += n22;
            object = object4;
            n8 = 1;
        }
    }

    public double a(double d2) {
        return d2;
    }

    public double b(double d2) {
        return 1.0;
    }

    public final String toString() {
        return this.a;
    }
}

