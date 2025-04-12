/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfz;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzga {
    public static String zza(zzfz zzfz2) {
        IllegalAccessException illegalAccessException2;
        String string2;
        block9: {
            string2 = "Error printing proto: ";
            if (zzfz2 == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            try {
                zzga.zza(null, zzfz2, stringBuffer2, stringBuffer);
                return stringBuffer.toString();
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException2) {
                break block9;
            }
            String string3 = String.valueOf(invocationTargetException.getMessage());
            int n3 = string3.length();
            if (n3 != 0) {
                return string2.concat(string3);
            }
            string3 = new String(string2);
            return string3;
        }
        String string4 = String.valueOf(illegalAccessException2.getMessage());
        int n4 = string4.length();
        if (n4 != 0) {
            return string2.concat(string4);
        }
        string4 = new String(string2);
        return string4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zza(String string2, Object object, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        StringBuffer stringBuffer3;
        Object object2;
        block26: {
            int n3;
            int n4;
            int n7;
            int n8;
            int n10;
            block25: {
                StringBuilder stringBuilder;
                CharSequence charSequence;
                block23: {
                    Object object3;
                    int n14;
                    Object object4;
                    int n15;
                    Object object5;
                    int n16;
                    Field[] fieldArray;
                    Object object6;
                    int n17;
                    int n18;
                    block21: {
                        block24: {
                            block22: {
                                int n19;
                                block20: {
                                    object2 = object;
                                    charSequence = stringBuffer;
                                    stringBuffer3 = stringBuffer2;
                                    n10 = 8;
                                    n18 = 0;
                                    n8 = 1;
                                    if (object == null) return;
                                    boolean bl2 = object instanceof zzfz;
                                    if (!bl2) break block20;
                                    n17 = stringBuffer.length();
                                    if (string2 != null) {
                                        stringBuffer2.append(stringBuffer);
                                        object6 = zzga.zzl(string2);
                                        stringBuffer2.append((String)object6);
                                        stringBuffer2.append(" <\n");
                                        object6 = "  ";
                                        stringBuffer.append((String)object6);
                                    }
                                    object6 = object.getClass();
                                    fieldArray = ((Class)object6).getFields();
                                    n16 = fieldArray.length;
                                    object5 = null;
                                    break block21;
                                }
                                String string3 = zzga.zzl(string2);
                                stringBuffer2.append(stringBuffer);
                                stringBuffer2.append(string3);
                                charSequence = ": ";
                                stringBuffer2.append((String)charSequence);
                                n7 = object instanceof String;
                                n10 = 32;
                                n4 = 34;
                                if (n7 == 0) break block22;
                                object2 = (String)object;
                                charSequence = "http";
                                n7 = ((String)object2).startsWith((String)charSequence);
                                if (n7 == 0 && (n7 = ((String)object2).length()) > (n19 = 200)) {
                                    object2 = String.valueOf(((String)object2).substring(0, n19));
                                    charSequence = "[...]";
                                    object2 = ((String)object2).concat((String)charSequence);
                                }
                                n7 = ((String)object2).length();
                                stringBuilder = new StringBuilder(n7);
                                Object var12_17 = null;
                                break block23;
                            }
                            n7 = object instanceof byte[];
                            if (n7 == 0) break block24;
                            object2 = (byte[])object;
                            stringBuffer2.append((char)n4);
                            charSequence = null;
                            break block25;
                        }
                        stringBuffer2.append(object);
                        break block26;
                    }
                    for (n15 = 0; n15 < n16; n15 += n8) {
                        object4 = fieldArray[n15];
                        n14 = ((Field)object4).getModifiers();
                        Object object7 = "cachedSize";
                        String string4 = ((Field)object4).getName();
                        int n20 = ((String)object7).equals(string4);
                        if (n20 != 0 || (n20 = n14 & 1) != n8 || (n14 &= n10) == n10 || (n20 = (int)(string4.startsWith((String)(object3 = "_")) ? 1 : 0)) != 0 || (n14 = (int)(string4.endsWith((String)object3) ? 1 : 0)) != 0) continue;
                        object3 = ((Field)object4).getType();
                        object4 = ((Field)object4).get(object2);
                        n20 = (int)(((Class)object3).isArray() ? 1 : 0);
                        if (n20 != 0 && (object3 = ((Class)object3).getComponentType()) != (object7 = Byte.TYPE)) {
                            if (object4 == null) {
                                n14 = 0;
                                object3 = null;
                            } else {
                                n14 = Array.getLength(object4);
                            }
                            object7 = null;
                            for (n20 = 0; n20 < n14; n20 += n8) {
                                Object object8 = Array.get(object4, n20);
                                zzga.zza(string4, object8, (StringBuffer)charSequence, stringBuffer3);
                            }
                            continue;
                        }
                        zzga.zza(string4, object4, (StringBuffer)charSequence, stringBuffer3);
                    }
                    Method[] methodArray = ((Class)object6).getMethods();
                    int n21 = methodArray.length;
                    while (n18 < n21) {
                        String string5 = methodArray[n18].getName();
                        n15 = (int)(string5.startsWith((String)(object5 = "set")) ? 1 : 0);
                        if (n15 != 0) {
                            n15 = 3;
                            string5 = string5.substring(n15);
                            object5 = "has";
                            try {
                                object4 = String.valueOf(string5);
                                n14 = ((String)object4).length();
                                object5 = n14 != 0 ? ((String)object5).concat((String)object4) : (object4 = new String((String)object5));
                                object4 = null;
                                object5 = (Boolean)((Class)object6).getMethod((String)object5, null).invoke(object2, null);
                            }
                            catch (NoSuchMethodException noSuchMethodException) {}
                            n15 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
                            if (n15 != 0) {
                                object5 = "get";
                                object3 = String.valueOf(string5);
                                int n22 = ((String)object3).length();
                                object5 = n22 != 0 ? ((String)object5).concat((String)object3) : (object3 = new String((String)object5));
                                object5 = ((Class)object6).getMethod((String)object5, null).invoke(object2, null);
                                zzga.zza(string5, object5, (StringBuffer)charSequence, stringBuffer3);
                            }
                        }
                        n18 += n8;
                    }
                    if (string2 != null) {
                        ((StringBuffer)charSequence).setLength(n17);
                        stringBuffer3.append((StringBuffer)charSequence);
                        object2 = ">\n";
                        stringBuffer3.append((String)object2);
                    }
                    return;
                }
                for (int i3 = 0; i3 < n7; i3 += n8) {
                    int n24;
                    int n25 = ((String)object2).charAt(i3);
                    if (n25 >= n10 && n25 <= (n24 = 126) && n25 != n4 && n25 != (n24 = 39)) {
                        stringBuilder.append((char)n25);
                        continue;
                    }
                    Object object9 = n25;
                    Object[] objectArray = new Object[n8];
                    objectArray[0] = object9;
                    object9 = String.format("\\u%04x", objectArray);
                    stringBuilder.append((String)object9);
                }
                object2 = stringBuilder.toString();
                charSequence = "\"";
                stringBuffer3.append((String)charSequence);
                stringBuffer3.append((String)object2);
                stringBuffer3.append((String)charSequence);
                break block26;
            }
            for (n7 = 0; n7 < (n3 = ((Object)object2).length); n7 += n8) {
                n3 = object2[n7] & 0xFF;
                int n26 = 92;
                if (n3 != n26 && n3 != n4) {
                    if (n3 < n10 || n3 >= (n26 = 127)) {
                        Object object10 = n3;
                        Object[] objectArray = new Object[n8];
                        objectArray[0] = object10;
                        object10 = String.format("\\%03o", objectArray);
                        stringBuffer3.append((String)object10);
                        continue;
                    }
                } else {
                    stringBuffer3.append((char)n26);
                }
                n3 = (char)n3;
                stringBuffer3.append((char)n3);
            }
            stringBuffer3.append((char)n4);
        }
        object2 = "\n";
        stringBuffer3.append((String)object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String zzl(String string2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = 0;
        while (true) {
            int n4;
            block6: {
                block5: {
                    if (n3 >= (n4 = string2.length())) {
                        return stringBuffer.toString();
                    }
                    n4 = string2.charAt(n3);
                    if (n3 == 0) break block5;
                    char c2 = Character.isUpperCase((char)n4);
                    if (c2 == '\u0000') break block6;
                    c2 = '_';
                    stringBuffer.append(c2);
                }
                n4 = Character.toLowerCase((char)n4);
            }
            stringBuffer.append((char)n4);
            ++n3;
        }
    }
}

