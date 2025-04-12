/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

import java.util.HashMap;
import java.util.Iterator;

public class MapUtils {
    /*
     * Enabled aggressive block sorting
     */
    public static void writeStringMapToJson(StringBuilder stringBuilder, HashMap hashMap) {
        stringBuilder.append("{");
        Iterator iterator = hashMap.keySet().iterator();
        boolean bl2 = true;
        while (true) {
            String string2;
            boolean bl3;
            if (!(bl3 = iterator.hasNext())) {
                stringBuilder.append("}");
                return;
            }
            String string3 = (String)iterator.next();
            if (!bl2) {
                string2 = ",";
                stringBuilder.append(string2);
            }
            string2 = (String)hashMap.get(string3);
            String string4 = "\"";
            stringBuilder.append(string4);
            stringBuilder.append(string3);
            stringBuilder.append("\":");
            bl3 = false;
            string3 = null;
            if (string2 == null) {
                string2 = "null";
                stringBuilder.append(string2);
            } else {
                stringBuilder.append(string4);
                stringBuilder.append(string2);
                stringBuilder.append(string4);
            }
            bl2 = false;
            string2 = null;
        }
    }
}

