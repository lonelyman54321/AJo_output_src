/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzes {
    public static String zza(String object, Object ... objectArray) {
        Object object2;
        int n3;
        int n4;
        Object object3;
        int n7;
        int n8;
        int n10 = 0;
        Object object4 = null;
        for (n8 = 0; n8 < (n7 = objectArray.length); ++n8) {
            Object object5 = objectArray[n8];
            if (object5 == null) {
                object5 = "null";
            } else {
                try {
                    object5 = object5.toString();
                }
                catch (Exception exception) {
                    object3 = object5.getClass().getName();
                    n7 = System.identityHashCode(object5);
                    object5 = Integer.toHexString(n7);
                    n4 = ((String)object3).length() + 1;
                    n3 = String.valueOf(object5).length();
                    CharSequence charSequence = new StringBuilder(n4 += n3);
                    object5 = BW0.b(charSequence, (String)object3, "@", (String)object5);
                    object3 = Logger.getLogger("com.google.common.base.Strings");
                    object2 = Level.WARNING;
                    charSequence = "lenientToString";
                    String string2 = "Exception during lenientFormat for ".concat((String)object5);
                    ((Logger)object3).logp((Level)object2, "com.google.common.base.Strings", (String)charSequence, string2, exception);
                    object3 = exception.getClass().getName();
                    n4 = ((String)object5).length() + 8;
                    n3 = ((String)object3).length() + n4 + 1;
                    object2 = new StringBuilder(n3);
                    String string3 = "<";
                    ((StringBuilder)object2).append(string3);
                    ((StringBuilder)object2).append((String)object5);
                    ((StringBuilder)object2).append(" threw ");
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append(">");
                    object5 = ((StringBuilder)object2).toString();
                }
            }
            objectArray[n8] = object5;
        }
        n8 = ((String)object).length();
        object3 = new StringBuilder(n8 += (n7 *= 16));
        n8 = 0;
        while (n10 < (n7 = objectArray.length) && (n4 = ((String)object).indexOf((String)(object2 = "%s"), n8)) != (n3 = -1)) {
            ((StringBuilder)object3).append((CharSequence)object, n8, n4);
            n8 = n10 + 1;
            object4 = objectArray[n10];
            ((StringBuilder)object3).append(object4);
            n10 = n4 + 2;
            int n14 = n8;
            n8 = n10;
            n10 = n14;
        }
        n4 = ((String)object).length();
        ((StringBuilder)object3).append((CharSequence)object, n8, n4);
        if (n10 < n7) {
            object = " [";
            ((StringBuilder)object3).append((String)object);
            int n15 = n10 + 1;
            object4 = objectArray[n10];
            ((StringBuilder)object3).append(object4);
            while (n15 < (n10 = objectArray.length)) {
                object4 = ", ";
                ((StringBuilder)object3).append((String)object4);
                n10 = n15 + '\u0001';
                object = objectArray[n15];
                ((StringBuilder)object3).append(object);
                n15 = n10;
            }
            n15 = 93;
            ((StringBuilder)object3).append((char)n15);
        }
        return ((StringBuilder)object3).toString();
    }
}

