/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacd;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzaeh;
import com.google.android.gms.internal.gtm.zzaen;
import com.google.android.gms.internal.gtm.zzyv;
import com.google.android.gms.internal.gtm.zzyx;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class zzadn {
    private static final char[] zza;

    static {
        char[] cArray = new char[80];
        zza = cArray;
        Arrays.fill(cArray, ' ');
    }

    public static String zza(zzadl zzadl2, String charSequence) {
        charSequence = nn_2.a("# ", (String)charSequence);
        zzadn.zzd(zzadl2, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }

    public static void zzb(StringBuilder stringBuilder, int n3, String object, Object object2) {
        String string2;
        CharSequence charSequence;
        block12: {
            block11: {
                block10: {
                    boolean bl2;
                    boolean c2 = object2 instanceof List;
                    if (!c2) break block10;
                    object2 = ((List)object2).iterator();
                    while (bl2 = object2.hasNext()) {
                        Object e2 = object2.next();
                        zzadn.zzb(stringBuilder, n3, (String)object, e2);
                    }
                    break block11;
                }
                boolean bl3 = object2 instanceof Map;
                if (bl3) {
                    boolean bl4;
                    object2 = ((Map)object2).entrySet().iterator();
                    while (bl4 = object2.hasNext()) {
                        Map.Entry entry = (Map.Entry)object2.next();
                        zzadn.zzb(stringBuilder, n3, (String)object, entry);
                    }
                }
                break block12;
            }
            return;
        }
        stringBuilder.append('\n');
        zzadn.zzc(n3, stringBuilder);
        boolean bl5 = ((String)object).isEmpty();
        if (!bl5) {
            char c2;
            charSequence = new StringBuilder();
            string2 = null;
            int n4 = Character.toLowerCase(((String)object).charAt(0));
            ((StringBuilder)charSequence).append((char)n4);
            for (n4 = 1; n4 < (c2 = ((String)object).length()); ++n4) {
                c2 = ((String)object).charAt(n4);
                boolean bl6 = Character.isUpperCase(c2);
                if (bl6) {
                    String string3 = "_";
                    ((StringBuilder)charSequence).append(string3);
                }
                c2 = Character.toLowerCase(c2);
                ((StringBuilder)charSequence).append(c2);
            }
            object = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)object);
        int n7 = object2 instanceof String;
        char c3 = '\"';
        string2 = ": \"";
        if (n7 != 0) {
            stringBuilder.append(string2);
            object2 = (String)object2;
            object = zzaco.zza;
            object = ((String)object2).getBytes((Charset)object);
            Object object3 = new zzyv((byte[])object);
            object3 = zzaeh.zza((zzyx)object3);
            stringBuilder.append((String)object3);
            stringBuilder.append(c3);
            return;
        }
        n7 = object2 instanceof zzyx;
        if (n7 != 0) {
            stringBuilder.append(string2);
            String string4 = zzaeh.zza((zzyx)object2);
            stringBuilder.append(string4);
            stringBuilder.append(c3);
            return;
        }
        n7 = object2 instanceof zzacf;
        charSequence = "}";
        string2 = "\n";
        String string5 = " {";
        if (n7 != 0) {
            n7 = n3 + 2;
            stringBuilder.append(string5);
            zzadn.zzd((zzacf)object2, stringBuilder, n7);
            stringBuilder.append(string2);
            zzadn.zzc(n3, stringBuilder);
            stringBuilder.append((String)charSequence);
            return;
        }
        n7 = object2 instanceof Map.Entry;
        if (n7 != 0) {
            n7 = n3 + 2;
            stringBuilder.append(string5);
            object2 = (Map.Entry)object2;
            string5 = object2.getKey();
            zzadn.zzb(stringBuilder, n7, "key", string5);
            object2 = object2.getValue();
            zzadn.zzb(stringBuilder, n7, "value", object2);
            stringBuilder.append(string2);
            zzadn.zzc(n3, stringBuilder);
            stringBuilder.append((String)charSequence);
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(object2);
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
    private static void zzd(zzadl zzadl2, StringBuilder stringBuilder, int n3) {
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
        Object object4 = zzadl2;
        StringBuilder stringBuilder2 = stringBuilder;
        int n8 = n3;
        Object object5 = new HashSet();
        Object object6 = new HashMap();
        Object object7 = new TreeMap();
        Object object8 = zzadl2.getClass().getDeclaredMethods();
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
                                                                    object9 = zzacf.zzak(objectArray, object4, (Object[])object9);
                                                                    zzadn.zzb(stringBuilder2, n8, (String)object, object9);
                                                                    break block16;
                                                                }
                                                                object2 = "Map";
                                                                bl4 = ((String)object9).endsWith((String)object2);
                                                                if (!bl4 || (n7 = (int)(((String)object9).equals(object2) ? 1 : 0)) != 0 || (object2 = (Method)object.getValue()) == null || !(bl4 = (objectArray = ((Method)object2).getReturnType()).equals(clazz = Map.class)) || (bl4 = ((AccessibleObject)object2).isAnnotationPresent((Class<? extends Annotation>)(objectArray = Deprecated.class))) || !(bl4 = Modifier.isPublic(((Method)object2).getModifiers()))) break block17;
                                                                n10 = ((String)object9).length() + -3;
                                                                object = ((String)object9).substring(0, n10);
                                                                object9 = new Object[]{};
                                                                object9 = zzacf.zzak((Method)object2, object4, (Object[])object9);
                                                                zzadn.zzb(stringBuilder2, n8, (String)object, object9);
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
                                                        object = zzacf.zzak((Method)object, object4, objectArray);
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
                                    n7 = object instanceof zzyx;
                                    if (n7 == 0) break block27;
                                    object2 = zzyx.zzb;
                                    n7 = (int)(object.equals(object2) ? 1 : 0);
                                }
                                if (n7 != 0) break block16;
                                break block21;
                            }
                            n7 = object instanceof zzadl;
                            if (n7 == 0) break block28;
                            object2 = object;
                            object2 = ((zzadl)object).zzay();
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
                    n7 = (int)(((Boolean)(object2 = (Boolean)zzacf.zzak((Method)object2, object4, objectArray))).booleanValue() ? 1 : 0);
                    if (n7 == 0) break block16;
                }
                zzadn.zzb(stringBuilder2, n8, (String)object9, object);
            }
            n7 = 3;
            f5 = 4.2E-45f;
        }
        boolean bl5 = object4 instanceof zzacc;
        if (bl5) {
            boolean bl6;
            object5 = object4;
            object5 = ((zzacc)object4).zza.zzg();
            while (bl6 = object5.hasNext()) {
                object6 = (Map.Entry)object5.next();
                int n16 = ((zzacd)object6.getKey()).zzb;
                object8 = "[";
                object = "]";
                object7 = Gj0.b(n16, (String)object8, (String)object);
                object6 = object6.getValue();
                zzadn.zzb(stringBuilder2, n8, (String)object7, object6);
            }
        }
        if ((object4 = ((zzacf)object4).zzc) != null) {
            ((zzaen)object4).zzi(stringBuilder2, n8);
        }
    }
}

