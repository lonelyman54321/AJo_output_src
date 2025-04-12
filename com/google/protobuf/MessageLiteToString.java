/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.MessageLite;
import com.google.protobuf.TextFormatEscaper;
import com.google.protobuf.UnknownFieldSetLite;
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

final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArray = new char[80];
        INDENT_BUFFER = cArray;
        Arrays.fill(cArray, ' ');
    }

    private MessageLiteToString() {
    }

    private static void indent(int n3, StringBuilder stringBuilder) {
        while (n3 > 0) {
            char[] cArray = INDENT_BUFFER;
            int n4 = cArray.length;
            n4 = n3 > n4 ? cArray.length : n3;
            stringBuilder.append(cArray, 0, n4);
            n3 -= n4;
        }
    }

    private static boolean isDefaultValue(Object object) {
        boolean bl2 = object instanceof Boolean;
        boolean bl3 = true;
        if (bl2) {
            return (Boolean)object ^ bl3;
        }
        bl2 = object instanceof Integer;
        if (bl2) {
            int n3 = (Integer)(object = (Integer)object);
            if (n3 != 0) {
                bl3 = false;
            }
            return bl3;
        }
        bl2 = object instanceof Float;
        if (bl2) {
            float f5 = ((Float)(object = (Float)object)).floatValue();
            int n4 = Float.floatToRawIntBits(f5);
            if (n4 != 0) {
                bl3 = false;
            }
            return bl3;
        }
        bl2 = object instanceof Double;
        if (bl2) {
            long l2;
            double d2 = (Double)(object = (Double)object);
            long l3 = Double.doubleToRawLongBits(d2);
            long l4 = l3 - (l2 = 0L);
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) {
                bl3 = false;
            }
            return bl3;
        }
        bl2 = object instanceof String;
        if (bl2) {
            return object.equals("");
        }
        bl2 = object instanceof ByteString;
        if (bl2) {
            ByteString byteString = ByteString.EMPTY;
            return object.equals(byteString);
        }
        bl2 = object instanceof MessageLite;
        if (bl2) {
            Object object3 = object;
            object3 = ((MessageLite)object).getDefaultInstanceForType();
            if (object != object3) {
                bl3 = false;
            }
            return bl3;
        }
        bl2 = object instanceof Enum;
        if (bl2) {
            int n7 = ((Enum)(object = (Enum)object)).ordinal();
            if (n7 != 0) {
                bl3 = false;
            }
            return bl3;
        }
        return false;
    }

    private static String pascalCaseToSnakeCase(String string2) {
        char c2;
        boolean bl2 = string2.isEmpty();
        if (bl2) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = Character.toLowerCase(string2.charAt(0));
        stringBuilder.append((char)n3);
        for (n3 = 1; n3 < (c2 = string2.length()); ++n3) {
            c2 = string2.charAt(n3);
            boolean bl3 = Character.isUpperCase(c2);
            if (bl3) {
                String string3 = "_";
                stringBuilder.append(string3);
            }
            c2 = Character.toLowerCase(c2);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static void printField(StringBuilder stringBuilder, int n3, String string2, Object object) {
        char c2 = object instanceof List;
        if (c2 != '\u0000') {
            object = ((List)object).iterator();
            while ((c2 = object.hasNext()) != '\u0000') {
                Object e2 = object.next();
                MessageLiteToString.printField(stringBuilder, n3, string2, e2);
            }
            return;
        }
        c2 = object instanceof Map;
        if (c2 != '\u0000') {
            object = ((Map)object).entrySet().iterator();
            while ((c2 = object.hasNext()) != '\u0000') {
                Map.Entry entry = (Map.Entry)object.next();
                MessageLiteToString.printField(stringBuilder, n3, string2, entry);
            }
            return;
        }
        stringBuilder.append('\n');
        MessageLiteToString.indent(n3, stringBuilder);
        string2 = MessageLiteToString.pascalCaseToSnakeCase(string2);
        stringBuilder.append(string2);
        int n4 = object instanceof String;
        c2 = '\"';
        String string3 = ": \"";
        if (n4 != 0) {
            stringBuilder.append(string3);
            object = (String)object;
            String string4 = TextFormatEscaper.escapeText((String)object);
            stringBuilder.append(string4);
            stringBuilder.append(c2);
        } else {
            n4 = object instanceof ByteString;
            if (n4 != 0) {
                stringBuilder.append(string3);
                object = (ByteString)object;
                String string5 = TextFormatEscaper.escapeBytes((ByteString)object);
                stringBuilder.append(string5);
                stringBuilder.append(c2);
            } else {
                n4 = object instanceof GeneratedMessageLite;
                String string6 = "}";
                string3 = "\n";
                String string7 = " {";
                if (n4 != 0) {
                    stringBuilder.append(string7);
                    object = (GeneratedMessageLite)object;
                    n4 = n3 + 2;
                    MessageLiteToString.reflectivePrintWithIndent((MessageLite)object, stringBuilder, n4);
                    stringBuilder.append(string3);
                    MessageLiteToString.indent(n3, stringBuilder);
                    stringBuilder.append(string6);
                } else {
                    n4 = object instanceof Map.Entry;
                    if (n4 != 0) {
                        stringBuilder.append(string7);
                        object = (Map.Entry)object;
                        n4 = n3 + 2;
                        string7 = object.getKey();
                        String string8 = "key";
                        MessageLiteToString.printField(stringBuilder, n4, string8, string7);
                        string7 = "value";
                        object = object.getValue();
                        MessageLiteToString.printField(stringBuilder, n4, string7, object);
                        stringBuilder.append(string3);
                        MessageLiteToString.indent(n3, stringBuilder);
                        stringBuilder.append(string6);
                    } else {
                        String string9 = ": ";
                        stringBuilder.append(string9);
                        stringBuilder.append(object);
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder stringBuilder, int n3) {
        Object object;
        Object object2;
        Object[] objectArray;
        int n4;
        Object object3;
        int n7;
        Object object4;
        String string2;
        String string3;
        Object object5 = messageLite;
        StringBuilder stringBuilder2 = stringBuilder;
        int n8 = n3;
        Object object6 = new HashSet();
        Object object7 = new HashMap();
        Object object8 = new TreeMap();
        Object object9 = messageLite.getClass().getDeclaredMethods();
        int n10 = ((Method[])object9).length;
        int n14 = 0;
        Object object10 = null;
        while (true) {
            string3 = "get";
            string2 = "has";
            object4 = "set";
            n7 = 3;
            if (n14 >= n10) break;
            object3 = object9[n14];
            n4 = Modifier.isStatic(((Method)object3).getModifiers());
            if (n4 == 0 && (n4 = (objectArray = ((Method)object3).getName()).length()) >= n7) {
                object2 = ((Method)object3).getName();
                int n15 = ((String)object2).startsWith((String)object4);
                if (n15 != 0) {
                    string3 = ((Method)object3).getName();
                    ((HashSet)object6).add(string3);
                } else {
                    n15 = Modifier.isPublic(((Method)object3).getModifiers());
                    if (n15 != 0 && (n15 = ((Class<?>[])(object4 = ((Method)object3).getParameterTypes())).length) == 0) {
                        object4 = ((Method)object3).getName();
                        boolean bl2 = ((String)object4).startsWith(string2);
                        if (bl2) {
                            string3 = ((Method)object3).getName();
                            ((HashMap)object7).put(string3, object3);
                        } else {
                            string2 = ((Method)object3).getName();
                            boolean bl3 = string2.startsWith(string3);
                            if (bl3) {
                                string3 = ((Method)object3).getName();
                                ((TreeMap)object8).put(string3, object3);
                            }
                        }
                    }
                }
            }
            ++n14;
        }
        object9 = ((TreeMap)object8).entrySet().iterator();
        while ((n10 = (int)(object9.hasNext() ? 1 : 0)) != 0) {
            block22: {
                block24: {
                    int n16;
                    block23: {
                        block21: {
                            object = (Map.Entry)object9.next();
                            object10 = ((String)object.getKey()).substring(n7);
                            n4 = (int)(((String)object10).endsWith((String)(object3 = LIST_SUFFIX)) ? 1 : 0);
                            if (n4 == 0 || (n4 = (int)(((String)object10).endsWith((String)(objectArray = BUILDER_LIST_SUFFIX)) ? 1 : 0)) != 0 || (n16 = (int)(((String)object10).equals(object3) ? 1 : 0)) != 0 || (object3 = (Method)object.getValue()) == null || (n7 = (int)((objectArray = ((Method)object3).getReturnType()).equals(object2 = List.class) ? 1 : 0)) == 0) break block21;
                            n10 = ((String)object10).length() + -4;
                            object = ((String)object10).substring(0, n10);
                            object10 = new Object[]{};
                            object10 = GeneratedMessageLite.invokeOrDie(object3, object5, (Object[])object10);
                            MessageLiteToString.printField(stringBuilder2, n8, (String)object, object10);
                            break block22;
                        }
                        object2 = MAP_SUFFIX;
                        n16 = ((String)object10).endsWith((String)object2);
                        if (n16 == 0 || (n7 = (int)(((String)object10).equals(object2) ? 1 : 0)) != 0 || (object2 = (Method)object.getValue()) == null || (n16 = (int)((object3 = ((Method)object2).getReturnType()).equals(objectArray = Map.class) ? 1 : 0)) == 0 || (n16 = (int)(((AccessibleObject)object2).isAnnotationPresent((Class<? extends Annotation>)(object3 = Deprecated.class)) ? 1 : 0)) != 0 || (n16 = (int)(Modifier.isPublic(((Method)object2).getModifiers()) ? 1 : 0)) == 0) break block23;
                        n10 = ((String)object10).length();
                        n16 = 3;
                        object = ((String)object10).substring(0, n10 -= n16);
                        object10 = new Object[]{};
                        object10 = GeneratedMessageLite.invokeOrDie((Method)object2, object5, (Object[])object10);
                        MessageLiteToString.printField(stringBuilder2, n8, (String)object, object10);
                        break block22;
                    }
                    n16 = 3;
                    object2 = ((String)object4).concat((String)object10);
                    n7 = (int)(((HashSet)object6).contains(object2) ? 1 : 0);
                    if (n7 == 0) break block22;
                    object2 = BYTES_SUFFIX;
                    n7 = (int)(((String)object10).endsWith((String)object2) ? 1 : 0);
                    if (n7 == 0) break block24;
                    object2 = new StringBuilder(string3);
                    n4 = ((String)object10).length() + -5;
                    objectArray = ((String)object10).substring(0, n4);
                    ((StringBuilder)object2).append((String)objectArray);
                    object2 = ((StringBuilder)object2).toString();
                    n7 = (int)(((TreeMap)object8).containsKey(object2) ? 1 : 0);
                    if (n7 != 0) break block22;
                }
                object = (Method)object.getValue();
                object2 = string2.concat((String)object10);
                object2 = (Method)((HashMap)object7).get(object2);
                if (object != null) {
                    objectArray = new Object[]{};
                    object = GeneratedMessageLite.invokeOrDie((Method)object, object5, objectArray);
                    if (object2 == null) {
                        n7 = (int)(MessageLiteToString.isDefaultValue(object) ? 1 : 0);
                        if (n7 == 0) {
                            n7 = 1;
                        } else {
                            n7 = 0;
                            object2 = null;
                        }
                    } else {
                        objectArray = new Object[]{};
                        object2 = (Boolean)GeneratedMessageLite.invokeOrDie((Method)object2, object5, objectArray);
                        n7 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                    }
                    if (n7 != 0) {
                        MessageLiteToString.printField(stringBuilder2, n8, (String)object10, object);
                    }
                }
            }
            n7 = 3;
        }
        boolean bl4 = object5 instanceof GeneratedMessageLite$ExtendableMessage;
        if (bl4) {
            boolean bl5;
            object6 = object5;
            object6 = ((GeneratedMessageLite$ExtendableMessage)object5).extensions.iterator();
            while (bl5 = object6.hasNext()) {
                object7 = (Map.Entry)object6.next();
                object8 = new StringBuilder("[");
                object9 = (GeneratedMessageLite$ExtensionDescriptor)object7.getKey();
                int n17 = ((GeneratedMessageLite$ExtensionDescriptor)object9).getNumber();
                object = "]";
                object8 = g30.a(n17, (String)object, object8);
                object7 = object7.getValue();
                MessageLiteToString.printField(stringBuilder2, n8, (String)object8, object7);
            }
        }
        if ((object5 = ((GeneratedMessageLite)object5).unknownFields) != null) {
            ((UnknownFieldSetLite)object5).printWithIndent(stringBuilder2, n8);
        }
    }

    public static String toString(MessageLite messageLite, String charSequence) {
        charSequence = nn_2.a("# ", (String)charSequence);
        MessageLiteToString.reflectivePrintWithIndent(messageLite, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }
}

