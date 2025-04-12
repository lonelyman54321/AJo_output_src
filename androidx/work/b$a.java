/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.b;
import androidx.work.b$b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class b$a {
    public final LinkedHashMap a;

    public b$a() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    public final b a() {
        LinkedHashMap linkedHashMap = this.a;
        b b2 = new b(linkedHashMap);
        b$b.b(b2);
        return b2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void b(Object object, String string2) {
        void var1_11;
        String string3;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(string3, "key");
        LinkedHashMap linkedHashMap = this.a;
        if (object == null) {
            Object var1_2 = null;
        } else {
            yn1_2 yn1_22;
            yn1_2 yn1_23 = Reflection.getOrCreateKotlinClass(object.getClass());
            boolean bl2 = Intrinsics.areEqual(yn1_23, yn1_22 = Reflection.getOrCreateKotlinClass(Boolean.TYPE));
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_24 = Reflection.getOrCreateKotlinClass(Byte.TYPE);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_24);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_25 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_25);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_26 = Reflection.getOrCreateKotlinClass(Long.TYPE);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_26);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_27 = Reflection.getOrCreateKotlinClass(Float.TYPE);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_27);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_28 = Reflection.getOrCreateKotlinClass(Double.TYPE);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_28);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_29 = Reflection.getOrCreateKotlinClass(String.class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_29);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_210 = Reflection.getOrCreateKotlinClass(Boolean[].class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_210);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_211 = Reflection.getOrCreateKotlinClass(Byte[].class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_211);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_212 = Reflection.getOrCreateKotlinClass(Integer[].class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_212);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_213 = Reflection.getOrCreateKotlinClass(Long[].class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_213);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_214 = Reflection.getOrCreateKotlinClass(Float[].class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_214);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_215 = Reflection.getOrCreateKotlinClass(Double[].class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_215);
            }
            if (bl2) {
                bl2 = true;
            } else {
                yn1_2 yn1_216 = Reflection.getOrCreateKotlinClass(String[].class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_216);
            }
            if (!bl2) {
                void var6_46;
                int n4;
                yn1_2 yn1_217 = Reflection.getOrCreateKotlinClass(boolean[].class);
                bl2 = Intrinsics.areEqual(yn1_23, yn1_217);
                if (bl2) {
                    boolean[] blArray = (boolean[])object;
                    int n7 = xi0.a;
                    n7 = blArray.length;
                    Boolean[] booleanArray = new Boolean[n7];
                    for (n4 = 0; n4 < n7; n4 += n3) {
                        Boolean bl3;
                        boolean bl4 = blArray[n4];
                        booleanArray[n4] = bl3 = Boolean.valueOf(bl4);
                    }
                } else {
                    yn1_2 yn1_218 = Reflection.getOrCreateKotlinClass(byte[].class);
                    bl2 = Intrinsics.areEqual(yn1_23, yn1_218);
                    if (bl2) {
                        byte[] byArray = (byte[])object;
                        int n8 = xi0.a;
                        n8 = byArray.length;
                        Byte[] byteArray = new Byte[n8];
                        while (n4 < n8) {
                            Byte by2;
                            byte by4 = byArray[n4];
                            byteArray[n4] = by2 = Byte.valueOf(by4);
                            n4 += n3;
                        }
                    } else {
                        yn1_2 yn1_219 = Reflection.getOrCreateKotlinClass(int[].class);
                        bl2 = Intrinsics.areEqual(yn1_23, yn1_219);
                        if (bl2) {
                            int[] nArray = (int[])object;
                            int n10 = xi0.a;
                            n10 = nArray.length;
                            Integer[] integerArray = new Integer[n10];
                            while (n4 < n10) {
                                Integer n14;
                                int n15 = nArray[n4];
                                integerArray[n4] = n14 = Integer.valueOf(n15);
                                n4 += n3;
                            }
                        } else {
                            yn1_2 yn1_220 = Reflection.getOrCreateKotlinClass(long[].class);
                            bl2 = Intrinsics.areEqual(yn1_23, yn1_220);
                            if (bl2) {
                                long[] lArray = (long[])object;
                                int n16 = xi0.a;
                                n16 = lArray.length;
                                Long[] longArray = new Long[n16];
                                while (n4 < n16) {
                                    Long l2;
                                    long l3 = lArray[n4];
                                    longArray[n4] = l2 = Long.valueOf(l3);
                                    n4 += n3;
                                }
                            } else {
                                yn1_2 yn1_221 = Reflection.getOrCreateKotlinClass(float[].class);
                                bl2 = Intrinsics.areEqual(yn1_23, yn1_221);
                                if (bl2) {
                                    float[] fArray = (float[])object;
                                    int n17 = xi0.a;
                                    n17 = fArray.length;
                                    Float[] floatArray = new Float[n17];
                                    while (n4 < n17) {
                                        Float f5;
                                        float f6 = fArray[n4];
                                        floatArray[n4] = f5 = Float.valueOf(f6);
                                        n4 += n3;
                                    }
                                } else {
                                    yn1_2 yn1_222 = Reflection.getOrCreateKotlinClass(double[].class);
                                    bl2 = Intrinsics.areEqual(yn1_23, yn1_222);
                                    if (!bl2) {
                                        StringBuilder stringBuilder = new StringBuilder("Key ");
                                        stringBuilder.append(string3);
                                        stringBuilder.append(" has invalid type ");
                                        stringBuilder.append(yn1_23);
                                        string3 = stringBuilder.toString();
                                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                                        throw illegalArgumentException;
                                    }
                                    double[] dArray = (double[])object;
                                    int n18 = xi0.a;
                                    n18 = dArray.length;
                                    Double[] doubleArray = new Double[n18];
                                    while (n4 < n18) {
                                        Double d2;
                                        double d5 = dArray[n4];
                                        doubleArray[n4] = d2 = Double.valueOf(d5);
                                        n4 += n3;
                                    }
                                }
                            }
                        }
                    }
                }
                void var1_5 = var6_46;
            }
        }
        linkedHashMap.put(string3, var1_11);
    }

    public final void c(Map object) {
        boolean bl2;
        Object object2 = "values";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = object2.getValue();
            this.b(object2, string2);
        }
    }
}

