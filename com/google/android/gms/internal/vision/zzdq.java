/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

final class zzdq {
    public static void zza(Object object, Object object2) {
        if (object != null) {
            if (object2 != null) {
                return;
            }
            object = String.valueOf(object);
            int n3 = ((String)object).length() + 26;
            StringBuilder stringBuilder = new StringBuilder(n3);
            stringBuilder.append("null value in entry: ");
            stringBuilder.append((String)object);
            stringBuilder.append("=null");
            object = stringBuilder.toString();
            object2 = new NullPointerException((String)object);
            throw object2;
        }
        object2 = String.valueOf(object2);
        int n4 = ((String)object2).length() + 24;
        StringBuilder stringBuilder = new StringBuilder(n4);
        stringBuilder.append("null key in entry: null=");
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString();
        object = new NullPointerException((String)object2);
        throw object;
    }
}

