/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzee;
import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzeu;
import com.google.android.gms.internal.auth.zzfw;
import com.google.android.gms.internal.auth.zzgw;
import com.google.android.gms.internal.auth.zzgz;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class zzfy {
    public static String zza(zzfw zzfw2, String charSequence) {
        charSequence = nn_2.a("# ", (String)charSequence);
        zzfy.zzd(zzfw2, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }

    public static final void zzb(StringBuilder stringBuilder, int n3, String string2, Object object) {
        char c2;
        int n4 = object instanceof List;
        if (n4 != 0) {
            object = ((List)object).iterator();
            while ((n4 = object.hasNext()) != 0) {
                Object e2 = object.next();
                zzfy.zzb(stringBuilder, n3, string2, e2);
            }
            return;
        }
        n4 = object instanceof Map;
        if (n4 != 0) {
            object = ((Map)object).entrySet().iterator();
            while ((n4 = object.hasNext()) != 0) {
                Map.Entry entry = (Map.Entry)object.next();
                zzfy.zzb(stringBuilder, n3, string2, entry);
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
            String string5 = zzgw.zza(zzee.zzl((String)object));
            stringBuilder.append(string5);
            stringBuilder.append(c3);
            return;
        }
        n7 = object instanceof zzee;
        if (n7 != 0) {
            stringBuilder.append(string4);
            String string6 = zzgw.zza((zzee)object);
            stringBuilder.append(string6);
            stringBuilder.append(c3);
            return;
        }
        n7 = object instanceof zzeu;
        string3 = "}";
        string4 = "\n";
        String string7 = " {";
        if (n7 != 0) {
            stringBuilder.append(string7);
            object = (zzeu)object;
            n7 = n3 + 2;
            zzfy.zzd((zzfw)object, stringBuilder, n7);
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
            zzfy.zzb(stringBuilder, n7, string8, string7);
            string7 = "value";
            object = object.getValue();
            zzfy.zzb(stringBuilder, n7, string7, object);
            stringBuilder.append(string4);
            while (n4 < n3) {
                stringBuilder.append(c2);
                ++n4;
            }
            stringBuilder.append(string3);
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(object);
    }

    private static final String zzc(String string2) {
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

    /*
     * Enabled aggressive block sorting
     */
    private static void zzd(zzfw object, StringBuilder stringBuilder, int n3) {
        int n4;
        int n7;
        String string2;
        HashMap<Class<?>[], Method> hashMap = new HashMap<Class<?>[], Method>();
        HashMap<Class<?>[], Method> hashMap2 = new HashMap<Class<?>[], Method>();
        Object object2 = new TreeSet();
        Object object3 = object.getClass().getDeclaredMethods();
        int n8 = ((Method[])object3).length;
        int n10 = 0;
        Object[] objectArray = null;
        while (true) {
            string2 = "get";
            if (n10 >= n8) break;
            Method method = object3[n10];
            Object object4 = method.getName();
            hashMap2.put((Class<?>[])object4, method);
            object4 = method.getParameterTypes();
            n7 = ((Class<?>[])object4).length;
            if (n7 == 0) {
                object4 = method.getName();
                hashMap.put((Class<?>[])object4, method);
                object4 = method.getName();
                boolean bl2 = ((String)object4).startsWith(string2);
                if (bl2) {
                    string2 = method.getName();
                    ((TreeSet)object2).add(string2);
                }
            }
            ++n10;
        }
        object2 = ((TreeSet)object2).iterator();
        while ((n4 = object2.hasNext()) != 0) {
            block18: {
                Object object5;
                block16: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    long l2;
                                    block20: {
                                        float f5;
                                        block19: {
                                            block17: {
                                                Class<Object> clazz;
                                                String string3;
                                                object3 = (String)object2.next();
                                                n8 = (int)(((String)object3).startsWith(string2) ? 1 : 0);
                                                if (n8 != 0) {
                                                    n8 = 3;
                                                    f5 = 4.2E-45f;
                                                    object5 = ((String)object3).substring(n8);
                                                } else {
                                                    object5 = object3;
                                                }
                                                objectArray = "List";
                                                int n14 = ((String)object5).endsWith((String)objectArray);
                                                n7 = 1;
                                                if (n14 != 0 && (n14 = ((String)object5).endsWith(string3 = "OrBuilderList")) == 0 && (n10 = (int)(((String)object5).equals(objectArray) ? 1 : 0)) == 0) {
                                                    Class<List> clazz2;
                                                    boolean bl3;
                                                    objectArray = String.valueOf(((String)object5).substring(0, n7).toLowerCase());
                                                    n14 = ((String)object5).length() + -4;
                                                    String string4 = String.valueOf(((String)object5).substring(n7, n14));
                                                    objectArray = objectArray.concat(string4);
                                                    Method method = (Method)hashMap.get(object3);
                                                    if (method != null && (bl3 = (clazz = method.getReturnType()).equals(clazz2 = List.class))) {
                                                        object3 = zzfy.zzc((String)objectArray);
                                                        object5 = new Object[]{};
                                                        object5 = zzeu.zze(method, object, (Object[])object5);
                                                        zzfy.zzb(stringBuilder, n3, (String)object3, object5);
                                                        continue;
                                                    }
                                                }
                                                if ((n14 = ((String)object5).endsWith((String)(objectArray = "Map"))) != 0 && (n10 = (int)(((String)object5).equals(objectArray) ? 1 : 0)) == 0) {
                                                    Class<Deprecated> clazz3;
                                                    Class<?> clazz4;
                                                    objectArray = String.valueOf(((String)object5).substring(0, n7).toLowerCase());
                                                    n14 = ((String)object5).length() + -3;
                                                    String string5 = String.valueOf(((String)object5).substring(n7, n14));
                                                    objectArray = objectArray.concat(string5);
                                                    if ((object3 = (Method)hashMap.get(object3)) != null && (n14 = (int)((clazz4 = ((Method)object3).getReturnType()).equals(clazz = Map.class) ? 1 : 0)) != 0 && (n14 = (int)(((AccessibleObject)object3).isAnnotationPresent(clazz3 = Deprecated.class) ? 1 : 0)) == 0 && (n14 = (int)(Modifier.isPublic(((Method)object3).getModifiers()) ? 1 : 0)) != 0) {
                                                        object5 = zzfy.zzc((String)objectArray);
                                                        objectArray = new Object[]{};
                                                        object3 = zzeu.zze((Method)object3, object, objectArray);
                                                        zzfy.zzb(stringBuilder, n3, (String)object5, object3);
                                                        continue;
                                                    }
                                                }
                                                object3 = "set".concat((String)object5);
                                                if ((object3 = (Method)hashMap2.get(object3)) == null) continue;
                                                object3 = "Bytes";
                                                n4 = ((String)object5).endsWith((String)object3);
                                                if (n4 != 0) {
                                                    n4 = ((String)object5).length() + -5;
                                                    object3 = String.valueOf(((String)object5).substring(0, n4));
                                                    n4 = (int)(hashMap.containsKey(object3 = string2.concat((String)object3)) ? 1 : 0);
                                                    if (n4 != 0) continue;
                                                }
                                                object3 = String.valueOf(((String)object5).substring(0, n7).toLowerCase());
                                                objectArray = String.valueOf(((String)object5).substring(n7));
                                                object3 = ((String)object3).concat((String)objectArray);
                                                objectArray = string2.concat((String)object5);
                                                objectArray = (Method)hashMap.get(objectArray);
                                                String string6 = "has";
                                                object5 = string6.concat((String)object5);
                                                object5 = (Method)hashMap.get(object5);
                                                if (objectArray == null) continue;
                                                Object[] objectArray2 = new Object[]{};
                                                objectArray = zzeu.zze((Method)objectArray, object, objectArray2);
                                                if (object5 != null) break block16;
                                                n8 = objectArray instanceof Boolean;
                                                if (n8 == 0) break block17;
                                                object5 = objectArray;
                                                object5 = (Boolean)objectArray;
                                                n8 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
                                                if (n8 == 0) continue;
                                                break block18;
                                            }
                                            n8 = objectArray instanceof Integer;
                                            if (n8 == 0) break block19;
                                            object5 = objectArray;
                                            object5 = (Integer)objectArray;
                                            n8 = (Integer)object5;
                                            if (n8 == 0) continue;
                                            break block18;
                                        }
                                        n8 = objectArray instanceof Float;
                                        if (n8 == 0) break block20;
                                        object5 = objectArray;
                                        object5 = (Float)objectArray;
                                        f5 = ((Float)object5).floatValue();
                                        n8 = Float.floatToRawIntBits(f5);
                                        if (n8 == 0) continue;
                                        break block18;
                                    }
                                    n8 = objectArray instanceof Double;
                                    if (n8 == 0) break block21;
                                    object5 = objectArray;
                                    object5 = (Double)objectArray;
                                    double d2 = (Double)object5;
                                    long l3 = Double.doubleToRawLongBits(d2);
                                    long l4 = l3 - (l2 = 0L);
                                    n8 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                                    if (n8 == 0) continue;
                                    break block18;
                                }
                                n8 = objectArray instanceof String;
                                if (n8 == 0) break block22;
                                object5 = "";
                                n8 = (int)(objectArray.equals(object5) ? 1 : 0);
                                break block23;
                            }
                            n8 = objectArray instanceof zzee;
                            if (n8 == 0) break block24;
                            object5 = zzee.zzb;
                            n8 = (int)(objectArray.equals(object5) ? 1 : 0);
                        }
                        if (n8 != 0) continue;
                        break block18;
                    }
                    n8 = objectArray instanceof zzfw;
                    if (n8 != 0) {
                        object5 = objectArray;
                        object5 = ((zzfw)objectArray).zzh();
                        if (objectArray == object5) continue;
                        break block18;
                    } else {
                        n8 = objectArray instanceof Enum;
                        if (n8 != 0) {
                            object5 = objectArray;
                            object5 = (Enum)objectArray;
                            n8 = ((Enum)object5).ordinal();
                            if (n8 == 0) continue;
                        }
                    }
                    break block18;
                }
                Object[] objectArray3 = new Object[0];
                n8 = (int)(((Boolean)(object5 = (Boolean)zzeu.zze((Method)object5, object, objectArray3))).booleanValue() ? 1 : 0);
                if (n8 == 0) continue;
            }
            object3 = zzfy.zzc((String)object3);
            zzfy.zzb(stringBuilder, n3, (String)object3, objectArray);
        }
        boolean bl4 = object instanceof zzet;
        if (bl4) {
            object = (zzet)object;
            throw null;
        }
        object = ((zzeu)object).zzc;
        if (object != null) {
            ((zzgz)object).zze(stringBuilder, n3);
        }
    }
}

