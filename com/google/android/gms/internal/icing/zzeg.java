/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzcy;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzfb;
import com.google.android.gms.internal.icing.zzfe;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class zzeg {
    public static String zza(zzee zzee2, String charSequence) {
        charSequence = nn_2.a("# ", (String)charSequence);
        zzeg.zzc(zzee2, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }

    public static final void zzb(StringBuilder stringBuilder, int n3, String string2, Object object) {
        char c2;
        int n4 = object instanceof List;
        if (n4 != 0) {
            object = ((List)object).iterator();
            while ((n4 = object.hasNext()) != 0) {
                Object e2 = object.next();
                zzeg.zzb(stringBuilder, n3, string2, e2);
            }
            return;
        }
        n4 = object instanceof Map;
        if (n4 != 0) {
            object = ((Map)object).entrySet().iterator();
            while ((n4 = object.hasNext()) != 0) {
                Map.Entry entry = (Map.Entry)object.next();
                zzeg.zzb(stringBuilder, n3, string2, entry);
            }
            return;
        }
        stringBuilder.append('\n');
        n4 = 0;
        Object var5_7 = null;
        char c3 = '\u0000';
        String string3 = null;
        while (true) {
            c2 = ' ';
            if (c3 >= n3) break;
            stringBuilder.append(c2);
            ++c3;
        }
        stringBuilder.append(string2);
        int n7 = object instanceof String;
        c3 = '\"';
        String string4 = ": \"";
        if (n7 != 0) {
            stringBuilder.append(string4);
            String string5 = zzfb.zza(zzcf.zzj((String)object));
            stringBuilder.append(string5);
            stringBuilder.append(c3);
            return;
        }
        n7 = object instanceof zzcf;
        if (n7 != 0) {
            stringBuilder.append(string4);
            String string6 = zzfb.zza((zzcf)object);
            stringBuilder.append(string6);
            stringBuilder.append(c3);
            return;
        }
        n7 = object instanceof zzda;
        string3 = "}";
        string4 = "\n";
        String string7 = " {";
        if (n7 != 0) {
            stringBuilder.append(string7);
            object = (zzda)object;
            n7 = n3 + 2;
            zzeg.zzc((zzee)object, stringBuilder, n7);
            stringBuilder.append(string4);
            while (n4 < n3) {
                stringBuilder.append(c2);
                ++n4;
            }
            stringBuilder.append(string3);
            return;
        }
        n7 = object instanceof Map.Entry;
        if (n7 != 0) {
            stringBuilder.append(string7);
            object = (Map.Entry)object;
            n7 = n3 + 2;
            string7 = object.getKey();
            String string8 = "key";
            zzeg.zzb(stringBuilder, n7, string8, string7);
            string7 = "value";
            object = object.getValue();
            zzeg.zzb(stringBuilder, n7, string7, object);
            stringBuilder.append(string4);
            while (n4 < n3) {
                stringBuilder.append(c2);
                ++n4;
            }
            stringBuilder.append(string3);
            return;
        }
        stringBuilder.append(": ");
        String string9 = object.toString();
        stringBuilder.append(string9);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void zzc(zzee object, StringBuilder stringBuilder, int n3) {
        int n4;
        int n7;
        Object object2;
        String string2;
        HashMap<Class<?>[], Method> hashMap = new HashMap<Class<?>[], Method>();
        HashMap<Class<?>[], Method> hashMap2 = new HashMap<Class<?>[], Method>();
        Object object3 = new TreeSet();
        Object object4 = object.getClass().getDeclaredMethods();
        int n8 = ((Method[])object4).length;
        int n10 = 0;
        Object object5 = null;
        while (true) {
            string2 = "get";
            if (n10 >= n8) break;
            Method method = object4[n10];
            object2 = method.getName();
            hashMap2.put((Class<?>[])object2, method);
            object2 = method.getParameterTypes();
            n7 = ((Class<?>[])object2).length;
            if (n7 == 0) {
                object2 = method.getName();
                hashMap.put((Class<?>[])object2, method);
                object2 = method.getName();
                boolean bl2 = ((String)object2).startsWith(string2);
                if (bl2) {
                    string2 = method.getName();
                    ((TreeSet)object3).add(string2);
                }
            }
            ++n10;
        }
        object3 = ((TreeSet)object3).iterator();
        while ((n4 = object3.hasNext()) != 0) {
            block21: {
                Object object6;
                block19: {
                    block27: {
                        block26: {
                            block25: {
                                block24: {
                                    double d2;
                                    block23: {
                                        int n14;
                                        float f5;
                                        block22: {
                                            block20: {
                                                Class<Object> clazz;
                                                int n15;
                                                String string3;
                                                object4 = (String)object3.next();
                                                n8 = (int)(((String)object4).startsWith(string2) ? 1 : 0);
                                                if (n8 != 0) {
                                                    n8 = 3;
                                                    f5 = 4.2E-45f;
                                                    object6 = ((String)object4).substring(n8);
                                                } else {
                                                    object6 = object4;
                                                }
                                                object5 = "List";
                                                n14 = ((String)object6).endsWith((String)object5);
                                                n7 = 1;
                                                if (n14 != 0 && (n14 = ((String)object6).endsWith(string3 = "OrBuilderList")) == 0 && (n10 = (int)(((String)object6).equals(object5) ? 1 : 0)) == 0) {
                                                    Class<List> clazz2;
                                                    object5 = String.valueOf(((String)object6).substring(0, n7).toLowerCase());
                                                    n14 = ((String)object6).length() + -4;
                                                    String string4 = String.valueOf(((String)object6).substring(n7, n14));
                                                    n15 = string4.length();
                                                    if (n15 != 0) {
                                                        object5 = ((String)object5).concat(string4);
                                                    } else {
                                                        String string5 = new String((String)object5);
                                                        object5 = string5;
                                                    }
                                                    Method method = (Method)hashMap.get(object4);
                                                    if (method != null && (n15 = (int)((clazz = method.getReturnType()).equals(clazz2 = List.class) ? 1 : 0)) != 0) {
                                                        object4 = zzeg.zzd((String)object5);
                                                        object6 = new Object[]{};
                                                        object6 = zzda.zzs(method, object, (Object[])object6);
                                                        zzeg.zzb(stringBuilder, n3, (String)object4, object6);
                                                        continue;
                                                    }
                                                }
                                                if ((n14 = ((String)object6).endsWith((String)(object5 = "Map"))) != 0 && (n10 = (int)(((String)object6).equals(object5) ? 1 : 0)) == 0) {
                                                    Class<Deprecated> clazz3;
                                                    Class<?> clazz4;
                                                    object5 = String.valueOf(((String)object6).substring(0, n7).toLowerCase());
                                                    n14 = ((String)object6).length() + -3;
                                                    String string6 = String.valueOf(((String)object6).substring(n7, n14));
                                                    n15 = string6.length();
                                                    if (n15 != 0) {
                                                        object5 = ((String)object5).concat(string6);
                                                    } else {
                                                        String string7 = new String((String)object5);
                                                        object5 = string7;
                                                    }
                                                    object4 = (Method)hashMap.get(object4);
                                                    if (object4 != null && (n14 = (int)((clazz4 = ((Method)object4).getReturnType()).equals(clazz = Map.class) ? 1 : 0)) != 0 && (n14 = (int)(((AccessibleObject)object4).isAnnotationPresent(clazz3 = Deprecated.class) ? 1 : 0)) == 0 && (n14 = (int)(Modifier.isPublic(((Method)object4).getModifiers()) ? 1 : 0)) != 0) {
                                                        object6 = zzeg.zzd((String)object5);
                                                        object5 = new Object[]{};
                                                        object4 = zzda.zzs((Method)object4, object, (Object[])object5);
                                                        zzeg.zzb(stringBuilder, n3, (String)object6, object4);
                                                        continue;
                                                    }
                                                }
                                                n4 = ((String)object6).length();
                                                object5 = "set";
                                                object4 = n4 != 0 ? ((String)object5).concat((String)object6) : new String((String)object5);
                                                if ((object4 = (Method)hashMap2.get(object4)) == null || (n4 = (int)(((String)object6).endsWith((String)(object4 = "Bytes")) ? 1 : 0)) != 0 && (n4 = (int)(hashMap.containsKey(object4 = (n10 = ((String)(object4 = String.valueOf(((String)object6).substring(0, n4 = ((String)object6).length() + -5)))).length()) != 0 ? string2.concat((String)object4) : new String(string2)) ? 1 : 0)) != 0) continue;
                                                object4 = String.valueOf(((String)object6).substring(0, n7).toLowerCase());
                                                object5 = String.valueOf(((String)object6).substring(n7));
                                                n14 = ((String)object5).length();
                                                object4 = n14 != 0 ? ((String)object4).concat((String)object5) : (object5 = new String((String)object4));
                                                n10 = ((String)object6).length();
                                                object5 = n10 != 0 ? string2.concat((String)object6) : new String(string2);
                                                object5 = (Method)hashMap.get(object5);
                                                n14 = ((String)object6).length();
                                                object2 = "has";
                                                object6 = n14 != 0 ? ((String)object2).concat((String)object6) : new String((String)object2);
                                                object6 = (Method)hashMap.get(object6);
                                                if (object5 == null) continue;
                                                Object[] objectArray = new Object[]{};
                                                object5 = zzda.zzs((Method)object5, object, objectArray);
                                                if (object6 != null) break block19;
                                                n8 = object5 instanceof Boolean;
                                                if (n8 == 0) break block20;
                                                object6 = object5;
                                                object6 = (Boolean)object5;
                                                n8 = (int)(((Boolean)object6).booleanValue() ? 1 : 0);
                                                if (n8 == 0) continue;
                                                break block21;
                                            }
                                            n8 = object5 instanceof Integer;
                                            if (n8 == 0) break block22;
                                            object6 = object5;
                                            object6 = (Integer)object5;
                                            n8 = (Integer)object6;
                                            if (n8 == 0) continue;
                                            break block21;
                                        }
                                        n8 = object5 instanceof Float;
                                        if (n8 == 0) break block23;
                                        object6 = object5;
                                        object6 = (Float)object5;
                                        f5 = ((Float)object6).floatValue();
                                        n14 = 0;
                                        Object var11_24 = null;
                                        float f6 = f5 - 0.0f;
                                        n8 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                                        if (n8 == 0) continue;
                                        break block21;
                                    }
                                    n8 = object5 instanceof Double;
                                    if (n8 == 0) break block24;
                                    object6 = object5;
                                    object6 = (Double)object5;
                                    double d5 = (Double)object6;
                                    double d7 = d5 - (d2 = 0.0);
                                    n8 = (int)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1));
                                    if (n8 == 0) continue;
                                    break block21;
                                }
                                n8 = object5 instanceof String;
                                if (n8 == 0) break block25;
                                object6 = "";
                                n8 = (int)(object5.equals(object6) ? 1 : 0);
                                break block26;
                            }
                            n8 = object5 instanceof zzcf;
                            if (n8 == 0) break block27;
                            object6 = zzcf.zzb;
                            n8 = (int)(object5.equals(object6) ? 1 : 0);
                        }
                        if (n8 != 0) continue;
                        break block21;
                    }
                    n8 = object5 instanceof zzee;
                    if (n8 != 0) {
                        object6 = object5;
                        object6 = ((zzee)object5).zzm();
                        if (object5 == object6) continue;
                        break block21;
                    } else {
                        n8 = object5 instanceof Enum;
                        if (n8 != 0) {
                            object6 = object5;
                            object6 = (Enum)object5;
                            n8 = ((Enum)object6).ordinal();
                            if (n8 == 0) continue;
                        }
                    }
                    break block21;
                }
                Object[] objectArray = new Object[0];
                n8 = (int)(((Boolean)(object6 = (Boolean)zzda.zzs((Method)object6, object, objectArray))).booleanValue() ? 1 : 0);
                if (n8 == 0) continue;
            }
            object4 = zzeg.zzd((String)object4);
            zzeg.zzb(stringBuilder, n3, (String)object4, object5);
        }
        boolean bl3 = object instanceof zzcy;
        if (bl3) {
            object = (zzcy)object;
            throw null;
        }
        object = ((zzda)object).zzc;
        if (object != null) {
            ((zzfe)object).zze(stringBuilder, n3);
        }
    }

    private static final String zzd(String string2) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            n3 = string2.charAt(i3);
            boolean bl2 = Character.isUpperCase((char)n3);
            if (bl2) {
                String string3 = "_";
                stringBuilder.append(string3);
            }
            n3 = Character.toLowerCase((char)n3);
            stringBuilder.append((char)n3);
        }
        return stringBuilder.toString();
    }
}

