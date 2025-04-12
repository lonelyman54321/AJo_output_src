/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.vision;

import android.content.Context;
import com.google.android.gms.internal.vision.zzdg;
import com.google.android.gms.internal.vision.zzr;

public final class zzq {
    public static boolean zza(Context object, String string2, String string3) {
        object = zzdg.zza(string3);
        string3 = "face";
        int n3 = string3.equals(string2);
        StringBuilder stringBuilder = null;
        if (!(n3 || (n3 = (string3 = "ica").equals(string2)) || (n3 = (int)((string3 = "ocr").equals(string2) ? 1 : 0)) || (n3 = (int)((string3 = "barcode").equals(string2) ? 1 : 0)))) {
            object = new StringBuilder("Unrecognized engine: ");
            ((StringBuilder)object).append(string2);
            return false;
        }
        string3 = ".so";
        n3 = ((String)object).lastIndexOf(string3);
        int n4 = ((String)object).length();
        int n7 = 3;
        if (n3 == (n4 -= n7)) {
            object = ((String)object).substring(0, n3);
        }
        if (!(n3 = ((String)object).indexOf(string3 = "lib"))) {
            object = ((String)object).substring(n7);
        }
        if (!(n3 = (int)(zzr.zza(string2, (String)object) ? 1 : 0))) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            string2 = " engine not loaded with ";
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
            object = ".";
            stringBuilder.append((String)object);
        }
        return n3;
    }
}

