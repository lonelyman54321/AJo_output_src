/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzda;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzdg {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String zza(Object object) {
        if (object == null) {
            return "null";
        }
        try {
            return object.toString();
        }
        catch (Exception exception) {
            Object object2 = object.getClass().getName();
            int n3 = System.identityHashCode(object);
            object = Integer.toHexString(n3);
            int n4 = lE2.a(((String)object2).length() + 1, (String)object);
            CharSequence charSequence = new StringBuilder(n4);
            ((StringBuilder)charSequence).append((String)object2);
            char c2 = '@';
            ((StringBuilder)charSequence).append(c2);
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            object2 = Logger.getLogger("com.google.common.base.Strings");
            Serializable serializable = Level.WARNING;
            charSequence = String.valueOf(object);
            int n7 = ((String)charSequence).length();
            String string2 = "Exception during lenientFormat for ";
            charSequence = n7 != 0 ? string2.concat((String)charSequence) : new String(string2);
            CharSequence charSequence2 = charSequence;
            ((Logger)object2).logp((Level)serializable, "com.google.common.base.Strings", "lenientToString", (String)charSequence, exception);
            object2 = exception.getClass().getName();
            n4 = lE2.a(9, (String)object);
            int n8 = ((String)object2).length() + n4;
            serializable = new StringBuilder(n8);
            ((StringBuilder)serializable).append("<");
            ((StringBuilder)serializable).append((String)object);
            ((StringBuilder)serializable).append(" threw ");
            ((StringBuilder)serializable).append((String)object2);
            ((StringBuilder)serializable).append(">");
            return ((StringBuilder)serializable).toString();
        }
    }

    public static String zza(String string2) {
        return zzda.zza(string2);
    }

    public static String zza(String object, Object ... objectArray) {
        int n3;
        String string2;
        String string3;
        int n4;
        object = String.valueOf(object);
        int n7 = 0;
        Object object2 = null;
        StringBuilder stringBuilder = null;
        for (int i3 = 0; i3 < (n4 = objectArray.length); ++i3) {
            string3 = zzdg.zza(objectArray[i3]);
            objectArray[i3] = string3;
        }
        n4 = ((String)object).length();
        int n8 = objectArray.length * 16 + n4;
        stringBuilder = new StringBuilder(n8);
        n4 = 0;
        string3 = null;
        while (n7 < (n8 = objectArray.length) && (n8 = ((String)object).indexOf(string2 = "%s", n4)) != (n3 = -1)) {
            stringBuilder.append((CharSequence)object, n4, n8);
            n4 = n7 + 1;
            object2 = objectArray[n7];
            stringBuilder.append(object2);
            n7 = n8 + 2;
            int n10 = n4;
            n4 = n7;
            n7 = n10;
        }
        n8 = ((String)object).length();
        stringBuilder.append((CharSequence)object, n4, n8);
        int n14 = objectArray.length;
        if (n7 < n14) {
            object = " [";
            stringBuilder.append((String)object);
            n14 = n7 + 1;
            object2 = objectArray[n7];
            stringBuilder.append(object2);
            while (n14 < (n7 = objectArray.length)) {
                object2 = ", ";
                stringBuilder.append((String)object2);
                n7 = n14 + '\u0001';
                object = objectArray[n14];
                stringBuilder.append(object);
                n14 = n7;
            }
            n14 = 93;
            stringBuilder.append((char)n14);
        }
        return stringBuilder.toString();
    }
}

