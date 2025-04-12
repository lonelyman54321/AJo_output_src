/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.util.AttributeSet
 *  android.util.TypedValue
 */
package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;

public class ViewUtils {
    private ViewUtils() {
    }

    public static String getXmlAttributeString(String string2, String charSequence, Context context, AttributeSet object, boolean bl2, boolean bl3, String string3) {
        int n3;
        string2 = object == null ? null : object.getAttributeValue(string2, (String)charSequence);
        if (string2 != null && (n3 = string2.startsWith((String)(charSequence = "@string/"))) != 0 && bl2) {
            n3 = 8;
            charSequence = string2.substring(n3);
            object = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                context = context.getResources();
            }
            catch (Resources.NotFoundException notFoundException) {}
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            object = ":string/";
            stringBuilder.append((String)object);
            stringBuilder.append((String)charSequence);
            charSequence = stringBuilder.toString();
            boolean bl4 = true;
            context.getValue((String)charSequence, typedValue, bl4);
            charSequence = typedValue.string;
            if (charSequence != null) {
                string2 = charSequence.toString();
            } else {
                typedValue.toString();
            }
        }
        return string2;
    }
}

