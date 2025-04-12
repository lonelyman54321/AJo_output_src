/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbk;
import com.google.android.gms.internal.ads.zzhbl;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzheo;
import com.google.android.gms.internal.ads.zzher;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class zzhdg {
    private static final char[] zza;

    static {
        char[] cArray = new char[80];
        zza = cArray;
        Arrays.fill(cArray, ' ');
    }

    public static String zza(zzhde zzhde2, String charSequence) {
        charSequence = nn_2.a("# ", (String)charSequence);
        zzhdg.zzd(zzhde2, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }

    public static void zzb(StringBuilder stringBuilder, int n3, String string2, Object object) {
        String string3;
        CharSequence charSequence;
        char c2;
        block12: {
            block11: {
                block10: {
                    c2 = object instanceof List;
                    if (c2 == '\u0000') break block10;
                    object = ((List)object).iterator();
                    while ((c2 = object.hasNext()) != '\u0000') {
                        Object e2 = object.next();
                        zzhdg.zzb(stringBuilder, n3, string2, e2);
                    }
                    break block11;
                }
                c2 = object instanceof Map;
                if (c2 != '\u0000') {
                    object = ((Map)object).entrySet().iterator();
                    while ((c2 = object.hasNext()) != '\u0000') {
                        Map.Entry entry = (Map.Entry)object.next();
                        zzhdg.zzb(stringBuilder, n3, string2, entry);
                    }
                }
                break block12;
            }
            return;
        }
        stringBuilder.append('\n');
        zzhdg.zzc(n3, stringBuilder);
        c2 = string2.isEmpty();
        if (c2 == '\u0000') {
            char c3;
            charSequence = new StringBuilder();
            string3 = null;
            int n4 = Character.toLowerCase(string2.charAt(0));
            ((StringBuilder)charSequence).append((char)n4);
            for (n4 = 1; n4 < (c3 = string2.length()); ++n4) {
                c3 = string2.charAt(n4);
                boolean bl2 = Character.isUpperCase(c3);
                if (bl2) {
                    String string4 = "_";
                    ((StringBuilder)charSequence).append(string4);
                }
                c3 = Character.toLowerCase(c3);
                ((StringBuilder)charSequence).append(c3);
            }
            string2 = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append(string2);
        int n7 = object instanceof String;
        c2 = '\"';
        string3 = ": \"";
        if (n7 != 0) {
            stringBuilder.append(string3);
            String string5 = zzheo.zza(zzhac.zzw((String)object));
            stringBuilder.append(string5);
            stringBuilder.append(c2);
            return;
        }
        n7 = object instanceof zzhac;
        if (n7 != 0) {
            stringBuilder.append(string3);
            String string6 = zzheo.zza((zzhac)object);
            stringBuilder.append(string6);
            stringBuilder.append(c2);
            return;
        }
        n7 = object instanceof zzhbo;
        charSequence = "}";
        string3 = "\n";
        String string7 = " {";
        if (n7 != 0) {
            n7 = n3 + 2;
            stringBuilder.append(string7);
            zzhdg.zzd((zzhbo)object, stringBuilder, n7);
            stringBuilder.append(string3);
            zzhdg.zzc(n3, stringBuilder);
            stringBuilder.append((String)charSequence);
            return;
        }
        n7 = object instanceof Map.Entry;
        if (n7 != 0) {
            n7 = n3 + 2;
            stringBuilder.append(string7);
            object = (Map.Entry)object;
            string7 = object.getKey();
            zzhdg.zzb(stringBuilder, n7, "key", string7);
            object = object.getValue();
            zzhdg.zzb(stringBuilder, n7, "value", object);
            stringBuilder.append(string3);
            zzhdg.zzc(n3, stringBuilder);
            stringBuilder.append((String)charSequence);
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(object);
    }

    private static void zzc(int n3, StringBuilder stringBuilder) {
        while (n3 > 0) {
            int n4 = 80;
            if (n3 <= n4) {
                n4 = n3;
            }
            char[] cArray = zza;
            stringBuilder.append(cArray, 0, n4);
            n3 -= n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void zzd(zzhde zzhde2, StringBuilder stringBuilder, int n3) {
        Object object;
        Object object2;
        Class<Map> clazz;
        int n4;
        Object[] objectArray;
        float f5;
        int n7;
        Object object3;
        String string2;
        String string3;
        Object object4 = zzhde2;
        StringBuilder stringBuilder2 = stringBuilder;
        int n8 = n3;
        Object object5 = new HashSet();
        Object object6 = new HashMap();
        Object object7 = new TreeMap();
        Object object8 = zzhde2.getClass().getDeclaredMethods();
        int n10 = ((Method[])object8).length;
        int n14 = 0;
        Object object9 = null;
        while (true) {
            string3 = "get";
            string2 = "has";
            object3 = "set";
            n7 = 3;
            f5 = 4.2E-45f;
            if (n14 >= n10) break;
            objectArray = object8[n14];
            n4 = Modifier.isStatic(objectArray.getModifiers());
            if (n4 == 0 && (n4 = ((String)((Object)(clazz = objectArray.getName()))).length()) >= n7) {
                object2 = objectArray.getName();
                int n15 = ((String)object2).startsWith((String)object3);
                if (n15 != 0) {
                    string3 = objectArray.getName();
                    ((HashSet)object5).add(string3);
                } else {
                    n15 = Modifier.isPublic(objectArray.getModifiers());
                    if (n15 != 0 && (n15 = ((Class<?>[])(object3 = objectArray.getParameterTypes())).length) == 0) {
                        object3 = objectArray.getName();
                        boolean bl2 = ((String)object3).startsWith(string2);
                        if (bl2) {
                            string3 = objectArray.getName();
                            ((HashMap)object6).put(string3, objectArray);
                        } else {
                            string2 = objectArray.getName();
                            boolean bl3 = string2.startsWith(string3);
                            if (bl3) {
                                string3 = objectArray.getName();
                                ((TreeMap)object7).put(string3, objectArray);
                            }
                        }
                    }
                }
            }
            ++n14;
        }
        object8 = ((TreeMap)object7).entrySet().iterator();
        while ((n10 = (int)(object8.hasNext() ? 1 : 0)) != 0) {
            block16: {
                block21: {
                    block19: {
                        block28: {
                            block27: {
                                block26: {
                                    block25: {
                                        block24: {
                                            long l2;
                                            block23: {
                                                block22: {
                                                    block20: {
                                                        block18: {
                                                            block17: {
                                                                boolean bl4;
                                                                block15: {
                                                                    object = (Map.Entry)object8.next();
                                                                    object9 = ((String)object.getKey()).substring(n7);
                                                                    n4 = (int)(((String)object9).endsWith((String)(objectArray = "List")) ? 1 : 0);
                                                                    if (n4 == 0 || (n4 = (int)(((String)object9).endsWith((String)((Object)(clazz = "OrBuilderList"))) ? 1 : 0)) != 0 || (bl4 = ((String)object9).equals(objectArray)) || (objectArray = (Method)object.getValue()) == null || (n7 = (int)((clazz = objectArray.getReturnType()).equals(object2 = List.class) ? 1 : 0)) == 0) break block15;
                                                                    n10 = ((String)object9).length() + -4;
                                                                    object = ((String)object9).substring(0, n10);
                                                                    object9 = new Object[]{};
                                                                    object9 = zzhbo.zzbQ(objectArray, object4, (Object[])object9);
                                                                    zzhdg.zzb(stringBuilder2, n8, (String)object, object9);
                                                                    break block16;
                                                                }
                                                                object2 = "Map";
                                                                bl4 = ((String)object9).endsWith((String)object2);
                                                                if (!bl4 || (n7 = (int)(((String)object9).equals(object2) ? 1 : 0)) != 0 || (object2 = (Method)object.getValue()) == null || !(bl4 = (objectArray = ((Method)object2).getReturnType()).equals(clazz = Map.class)) || (bl4 = ((AccessibleObject)object2).isAnnotationPresent((Class<? extends Annotation>)(objectArray = Deprecated.class))) || !(bl4 = Modifier.isPublic(((Method)object2).getModifiers()))) break block17;
                                                                n10 = ((String)object9).length() + -3;
                                                                object = ((String)object9).substring(0, n10);
                                                                object9 = new Object[]{};
                                                                object9 = zzhbo.zzbQ((Method)object2, object4, (Object[])object9);
                                                                zzhdg.zzb(stringBuilder2, n8, (String)object, object9);
                                                                break block16;
                                                            }
                                                            object2 = ((String)object3).concat((String)object9);
                                                            n7 = (int)(((HashSet)object5).contains(object2) ? 1 : 0);
                                                            if (n7 == 0) break block16;
                                                            object2 = "Bytes";
                                                            n7 = (int)(((String)object9).endsWith((String)object2) ? 1 : 0);
                                                            if (n7 == 0) break block18;
                                                            n7 = ((String)object9).length() + -5;
                                                            object2 = String.valueOf(((String)object9).substring(0, n7));
                                                            n7 = (int)(((TreeMap)object7).containsKey(object2 = string3.concat((String)object2)) ? 1 : 0);
                                                            if (n7 != 0) break block16;
                                                        }
                                                        object = (Method)object.getValue();
                                                        object2 = string2.concat((String)object9);
                                                        object2 = (Method)((HashMap)object6).get(object2);
                                                        if (object == null) break block16;
                                                        objectArray = new Object[]{};
                                                        object = zzhbo.zzbQ((Method)object, object4, objectArray);
                                                        if (object2 != null) break block19;
                                                        n7 = object instanceof Boolean;
                                                        if (n7 == 0) break block20;
                                                        object2 = object;
                                                        object2 = (Boolean)object;
                                                        n7 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                                                        if (n7 == 0) break block16;
                                                        break block21;
                                                    }
                                                    n7 = object instanceof Integer;
                                                    if (n7 == 0) break block22;
                                                    object2 = object;
                                                    object2 = (Integer)object;
                                                    n7 = (Integer)object2;
                                                    if (n7 == 0) break block16;
                                                    break block21;
                                                }
                                                n7 = object instanceof Float;
                                                if (n7 == 0) break block23;
                                                object2 = object;
                                                object2 = (Float)object;
                                                f5 = ((Float)object2).floatValue();
                                                n7 = Float.floatToRawIntBits(f5);
                                                if (n7 == 0) break block16;
                                                break block21;
                                            }
                                            n7 = object instanceof Double;
                                            if (n7 == 0) break block24;
                                            object2 = object;
                                            object2 = (Double)object;
                                            double d2 = (Double)object2;
                                            long l3 = Double.doubleToRawLongBits(d2);
                                            long l4 = l3 - (l2 = 0L);
                                            n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                                            if (n4 == 0) break block16;
                                            break block21;
                                        }
                                        n7 = object instanceof String;
                                        if (n7 == 0) break block25;
                                        object2 = "";
                                        n7 = (int)(object.equals(object2) ? 1 : 0);
                                        break block26;
                                    }
                                    n7 = object instanceof zzhac;
                                    if (n7 == 0) break block27;
                                    object2 = zzhac.zzb;
                                    n7 = (int)(object.equals(object2) ? 1 : 0);
                                }
                                if (n7 != 0) break block16;
                                break block21;
                            }
                            n7 = object instanceof zzhde;
                            if (n7 == 0) break block28;
                            object2 = object;
                            object2 = ((zzhde)object).zzbt();
                            if (object == object2) break block16;
                            break block21;
                        }
                        n7 = object instanceof Enum;
                        if (n7 == 0) break block21;
                        object2 = object;
                        object2 = (Enum)object;
                        n7 = ((Enum)object2).ordinal();
                        if (n7 == 0) break block16;
                        break block21;
                    }
                    objectArray = new Object[0];
                    n7 = (int)(((Boolean)(object2 = (Boolean)zzhbo.zzbQ((Method)object2, object4, objectArray))).booleanValue() ? 1 : 0);
                    if (n7 == 0) break block16;
                }
                zzhdg.zzb(stringBuilder2, n8, (String)object9, object);
            }
            n7 = 3;
            f5 = 4.2E-45f;
        }
        boolean bl5 = object4 instanceof zzhbk;
        if (bl5) {
            boolean bl6;
            object5 = object4;
            object5 = ((zzhbk)object4).zza.zzg();
            while (bl6 = object5.hasNext()) {
                object6 = (Map.Entry)object5.next();
                int n16 = ((zzhbl)object6.getKey()).zzb;
                object8 = "[";
                object = "]";
                object7 = Gj0.b(n16, (String)object8, (String)object);
                object6 = object6.getValue();
                zzhdg.zzb(stringBuilder2, n8, (String)object7, object6);
            }
        }
        if ((object4 = ((zzhbo)object4).zzt) != null) {
            ((zzher)object4).zzi(stringBuilder2, n8);
        }
    }
}

