/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from BT2
 */
public final class bt2_1
extends TagPayloadReader {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable b(int n3, Xm2 xm2) {
        if (n3 != 0) {
            int n4 = 1;
            Serializable serializable = null;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    int n7;
                    int n8 = 3;
                    if (n3 != n8) {
                        n8 = 8;
                        if (n3 != n8) {
                            n8 = 10;
                            if (n3 != n8) {
                                n7 = 11;
                                if (n3 != n7) {
                                    return null;
                                }
                                long l2 = (long)Double.longBitsToDouble(xm2.q());
                                Date date = new Date(l2);
                                xm2.J(n4);
                                return date;
                            }
                            n3 = xm2.A();
                            ArrayList<Serializable> arrayList = new ArrayList<Serializable>(n3);
                            for (n7 = 0; n7 < n3; ++n7) {
                                n8 = xm2.w();
                                Serializable serializable2 = bt2_1.b(n8, xm2);
                                if (serializable2 == null) continue;
                                arrayList.add(serializable2);
                            }
                            return arrayList;
                        }
                        return bt2_1.c(xm2);
                    }
                    HashMap<String, Serializable> hashMap = new HashMap<String, Serializable>();
                    while (true) {
                        String string2 = bt2_1.d(xm2);
                        n7 = xm2.w();
                        if (n7 == (n8 = 9)) {
                            return hashMap;
                        }
                        serializable = bt2_1.b(n7, xm2);
                        if (serializable == null) continue;
                        hashMap.put(string2, serializable);
                    }
                }
                return bt2_1.d(xm2);
            }
            n3 = xm2.w();
            if (n3 != n4) {
                n4 = 0;
                Object var9_11 = null;
            }
            return Boolean.valueOf(n4 != 0);
        }
        return Double.valueOf(Double.longBitsToDouble(xm2.q()));
    }

    public static HashMap c(Xm2 xm2) {
        int n3 = xm2.A();
        HashMap<String, Serializable> hashMap = new HashMap<String, Serializable>(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = bt2_1.d(xm2);
            int n4 = xm2.w();
            Serializable serializable = bt2_1.b(n4, xm2);
            if (serializable == null) continue;
            hashMap.put(string2, serializable);
        }
        return hashMap;
    }

    public static String d(Xm2 object) {
        int n3 = ((Xm2)object).C();
        int n4 = ((Xm2)object).b;
        ((Xm2)object).J(n3);
        object = ((Xm2)object).a;
        String string2 = new String((byte[])object, n4, n3);
        return string2;
    }

    public final boolean a(long l2, Xm2 object) {
        double d2;
        double d5;
        double d7;
        double d9;
        int n3;
        int n4 = ((Xm2)object).w();
        if (n4 != (n3 = 2)) {
            return false;
        }
        Object object2 = "onMetaData";
        Object object3 = bt2_1.d((Xm2)object);
        n4 = (int)(((String)object2).equals(object3) ? 1 : 0);
        if (n4 == 0) {
            return false;
        }
        n4 = ((Xm2)object).a();
        if (n4 == 0) {
            return false;
        }
        n4 = ((Xm2)object).w();
        if (n4 != (n3 = 8)) {
            return false;
        }
        object3 = bt2_1.c((Xm2)object);
        object2 = ((HashMap)object3).get("duration");
        int n7 = object2 instanceof Double;
        double d12 = 1000000.0;
        if (n7 != 0 && (d9 = (d7 = (d5 = ((Double)(object2 = (Double)object2)).doubleValue()) - (d2 = 0.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) > 0) {
            long l3;
            this.b = l3 = (long)(d5 *= d12);
        }
        if ((n3 = (object3 = ((HashMap)object3).get(object2 = "keyframes")) instanceof Map) != 0) {
            object3 = (Map)object3;
            object2 = object3.get("filepositions");
            object = "times";
            object3 = object3.get(object);
            n7 = object2 instanceof List;
            if (n7 != 0 && (n7 = object3 instanceof List) != 0) {
                object2 = (List)object2;
                object3 = (List)object3;
                n7 = object3.size();
                long[] lArray = new long[n7];
                this.c = lArray;
                lArray = new long[n7];
                this.d = lArray;
                lArray = null;
                for (int i3 = 0; i3 < n7; ++i3) {
                    Object object4 = object2.get(i3);
                    Object object5 = object3.get(i3);
                    boolean bl2 = object5 instanceof Double;
                    if (bl2 && (bl2 = object4 instanceof Double)) {
                        long l4;
                        long[] lArray2 = this.c;
                        double d13 = (Double)object5 * d12;
                        lArray2[i3] = l4 = (long)d13;
                        object5 = this.d;
                        object4 = (Double)object4;
                        long l7 = ((Double)object4).longValue();
                        object5[i3] = l7;
                        continue;
                    }
                    object3 = new long[0];
                    this.c = (long[])object3;
                    object3 = new long[0];
                    this.d = (long[])object3;
                    break;
                }
            }
        }
        return false;
    }
}

