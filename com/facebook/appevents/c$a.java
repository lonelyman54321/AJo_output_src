/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

import com.facebook.FacebookException;
import com.facebook.appevents.c;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

public final class c$a {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(String string2) {
        int n3 = 2;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(string2, "identifier");
        Object object = "^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$";
        int n7 = string2.length();
        int n8 = 40;
        if (n7 != 0 && (n7 = string2.length()) <= n8) {
            Serializable serializable = c.g;
            synchronized (serializable) {
                Object[] objectArray;
                block9: {
                    n7 = (int)(((HashSet)serializable).contains(string2) ? 1 : 0);
                    Unit unit = Unit.a;
                    if (n7 != 0) return;
                    objectArray = new Regex((String)object);
                    boolean bl2 = objectArray.c(string2);
                    if (!bl2) break block9;
                    synchronized (serializable) {
                        ((HashSet)serializable).add(string2);
                        return;
                    }
                }
                object = StringCompanionObject.INSTANCE;
                objectArray = new Object[n4];
                objectArray[0] = string2;
                string2 = xh2_0.a(objectArray, n4, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "format(format, *args)");
                serializable = new FacebookException(string2);
                throw serializable;
                finally {
                }
            }
        }
        Object object2 = StringCompanionObject.INSTANCE;
        object2 = Locale.ROOT;
        Integer n10 = n8;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        objectArray[n4] = n10;
        string2 = IV0.a(objectArray, n3, (Locale)object2, "Identifier '%s' must be less than %d characters", "format(locale, format, *args)");
        object = new FacebookException(string2);
        throw object;
    }
}

