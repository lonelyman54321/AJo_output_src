/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Strings {
    private Strings() {
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        boolean bl2;
        char c2;
        char c3;
        int n3;
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int n4 = charSequence.length();
        int n7 = charSequence2.length();
        n4 = Math.min(n4, n7);
        n7 = 0;
        for (n3 = 0; n3 < n4 && (c3 = charSequence.charAt(n3)) == (c2 = charSequence2.charAt(n3)); ++n3) {
        }
        n4 = n3 + -1;
        c3 = (char)(Strings.validSurrogatePairAt(charSequence, n4) ? 1 : 0);
        if (c3 != '\u0000' || (bl2 = Strings.validSurrogatePairAt(charSequence2, n4))) {
            n3 += -1;
        }
        return charSequence.subSequence(0, n3).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        int n3;
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int n4 = charSequence.length();
        int n7 = charSequence2.length();
        n4 = Math.min(n4, n7);
        for (n7 = 0; n7 < n4; ++n7) {
            int n8 = charSequence.length() - n7 + -1;
            n8 = charSequence.charAt(n8);
            int n10 = charSequence2.length() - n7 + -1;
            if (n8 != (n10 = (int)charSequence2.charAt(n10))) break;
        }
        n4 = charSequence.length() - n7 + -1;
        if ((n4 = (int)(Strings.validSurrogatePairAt(charSequence, n4) ? 1 : 0)) != 0 || (n3 = (int)(Strings.validSurrogatePairAt(charSequence2, n4 = charSequence2.length() - n7 + -1) ? 1 : 0)) != 0) {
            n7 += -1;
        }
        n3 = charSequence.length() - n7;
        n4 = charSequence.length();
        return charSequence.subSequence(n3, n4).toString();
    }

    public static String emptyToNull(String string2) {
        return Platform.emptyToNull(string2);
    }

    public static boolean isNullOrEmpty(String string2) {
        return Platform.stringIsNullOrEmpty(string2);
    }

    public static String lenientFormat(String object, Object ... objectArray) {
        int n3;
        String string2;
        String string3;
        int n4;
        CharSequence charSequence;
        object = String.valueOf(object);
        int n7 = 0;
        Object object2 = null;
        if (objectArray == null) {
            int n8 = 1;
            objectArray = new Object[n8];
            charSequence = "(Object[])null";
            objectArray[0] = charSequence;
        } else {
            charSequence = null;
            for (int i3 = 0; i3 < (n4 = objectArray.length); ++i3) {
                string3 = Strings.lenientToString(objectArray[i3]);
                objectArray[i3] = string3;
            }
        }
        n4 = ((String)object).length();
        int n10 = objectArray.length * 16 + n4;
        charSequence = new StringBuilder(n10);
        n4 = 0;
        string3 = null;
        while (n7 < (n10 = objectArray.length) && (n10 = ((String)object).indexOf(string2 = "%s", n4)) != (n3 = -1)) {
            ((StringBuilder)charSequence).append((CharSequence)object, n4, n10);
            n4 = n7 + 1;
            object2 = objectArray[n7];
            ((StringBuilder)charSequence).append(object2);
            n7 = n10 + 2;
            int n14 = n4;
            n4 = n7;
            n7 = n14;
        }
        n10 = ((String)object).length();
        ((StringBuilder)charSequence).append((CharSequence)object, n4, n10);
        int n15 = objectArray.length;
        if (n7 < n15) {
            object = " [";
            ((StringBuilder)charSequence).append((String)object);
            n15 = n7 + 1;
            object2 = objectArray[n7];
            ((StringBuilder)charSequence).append(object2);
            while (n15 < (n7 = objectArray.length)) {
                object2 = ", ";
                ((StringBuilder)charSequence).append((String)object2);
                n7 = n15 + '\u0001';
                object = objectArray[n15];
                ((StringBuilder)charSequence).append(object);
                n15 = n7;
            }
            n15 = 93;
            ((StringBuilder)charSequence).append((char)n15);
        }
        return ((StringBuilder)charSequence).toString();
    }

    private static String lenientToString(Object object) {
        if (object == null) {
            return "null";
        }
        try {
            return object.toString();
        }
        catch (Exception exception) {
            Object object2 = new StringBuilder();
            Object object3 = object.getClass().getName();
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append('@');
            object = Integer.toHexString(System.identityHashCode(object));
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = Logger.getLogger("com.google.common.base.Strings");
            object3 = Level.WARNING;
            CharSequence charSequence = new StringBuilder("Exception during lenientFormat for ");
            charSequence.append((String)object);
            charSequence = charSequence.toString();
            ((Logger)object2).log((Level)object3, (String)charSequence, exception);
            object = Gn.a("<", (String)object, " threw ");
            String string2 = exception.getClass().getName();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(">");
            return ((StringBuilder)object).toString();
        }
    }

    public static String nullToEmpty(String string2) {
        return Platform.nullToEmpty(string2);
    }

    public static String padEnd(String string2, int n3, char c2) {
        Preconditions.checkNotNull(string2);
        int n4 = string2.length();
        if (n4 >= n3) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append(string2);
        for (int i3 = string2.length(); i3 < n3; ++i3) {
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static String padStart(String string2, int n3, char c2) {
        Preconditions.checkNotNull(string2);
        int n4 = string2.length();
        if (n4 >= n3) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (int i3 = string2.length(); i3 < n3; ++i3) {
            stringBuilder.append(c2);
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String repeat(String object, int n3) {
        long l2;
        long l3;
        Preconditions.checkNotNull(object);
        boolean bl2 = false;
        int n4 = 1;
        if (n3 <= n4) {
            if (n3 >= 0) {
                bl2 = true;
            }
            String string2 = "invalid count: %s";
            Preconditions.checkArgument(bl2, string2, n3);
            if (n3 == 0) {
                object = "";
            }
            return object;
        }
        long l4 = n4;
        long l7 = n3;
        n3 = (int)(l4 *= l7);
        if ((l3 = (l2 = (l7 = (long)n3) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            int n7;
            char[] cArray = new char[n3];
            ((String)object).getChars(0, n4, cArray, 0);
            for (n4 = ((String)object).length(); n4 < (n7 = n3 - n4); n4 <<= 1) {
                System.arraycopy(cArray, 0, cArray, n4, n4);
            }
            System.arraycopy(cArray, 0, cArray, n4, n7);
            object = new String(cArray);
            return object;
        }
        String string3 = Wm2.a(l4, "Required array size too large: ");
        object = new ArrayIndexOutOfBoundsException(string3);
        throw object;
    }

    public static boolean validSurrogatePairAt(CharSequence charSequence, int n3) {
        boolean bl2;
        int n4;
        if (n3 < 0 || n3 > (n4 = charSequence.length() + -2) || (n4 = (int)(Character.isHighSurrogate(charSequence.charAt(n3)) ? 1 : 0)) == 0 || !(bl2 = Character.isLowSurrogate(charSequence.charAt(n3 += (n4 = 1))))) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

