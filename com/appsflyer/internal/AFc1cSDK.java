/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFc1cSDK {
    public final String[] getCurrencyIso4217Code;

    public AFc1cSDK(String ... object) {
        int n3;
        if (object != null && (n3 = ((Object)object).length) != 0) {
            Pattern pattern = Pattern.compile("[\\w]{1,45}");
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (Object object2 : object) {
                Object object3;
                boolean bl2;
                if (object2 != null && (bl2 = ((Matcher)(object3 = pattern.matcher((CharSequence)object2))).matches())) {
                    object3 = Locale.getDefault();
                    object2 = ((String)object2).toLowerCase((Locale)object3);
                    arrayList.add(object2);
                    continue;
                }
                object2 = String.valueOf(object2);
                object3 = "Invalid partner name: ";
                object2 = ((String)object3).concat((String)object2);
                AFLogger.afWarnLog((String)object2);
            }
            String string2 = "all";
            n3 = (int)(arrayList.contains(string2) ? 1 : 0);
            if (n3 != 0) {
                String[] stringArray = new String[]{string2};
                this.getCurrencyIso4217Code = stringArray;
                return;
            }
            boolean bl3 = arrayList.isEmpty();
            if (!bl3) {
                String[] stringArray2 = new String[]{};
                stringArray2 = arrayList.toArray(stringArray2);
                this.getCurrencyIso4217Code = stringArray2;
                return;
            }
            this.getCurrencyIso4217Code = null;
            return;
        }
        this.getCurrencyIso4217Code = null;
    }
}

