/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcn;
import java.util.Set;

public final class zzco {
    public static zzcm zza(Context object, String object2) {
        block4: {
            Object object3;
            int n3;
            block6: {
                int n4;
                block5: {
                    n3 = TextUtils.isEmpty((CharSequence)object2);
                    if (n3 != 0) break block4;
                    object3 = "/";
                    n3 = ((String[])(object2 = object2.split((String)object3, -1))).length;
                    if (n3 != (n4 = 1)) break block5;
                    object = String.valueOf(object.getPackageName());
                    object2 = object2[0];
                    object3 = "_preferences";
                    object = ((String)object).concat((String)object3);
                    break block6;
                }
                int n7 = 2;
                if (n3 != n7) break block4;
                object = object2[0];
                object2 = object2[n4];
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0)) == 0) {
                object3 = new zzcm((String)object, (String)object2);
                return object3;
            }
        }
        return null;
    }

    public static void zzb(Context context, Set object) {
        boolean bl2;
        zzcn zzcn2 = new zzcn(context);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = zzco.zza(context, string2);
            if (object2 == null) {
                string2 = String.valueOf(string2);
                object2 = "clearKeys: unable to process key: ";
                ((String)object2).concat(string2);
                continue;
            }
            string2 = ((zzcm)object2).zza;
            string2 = zzcn.zza(zzcn2, string2);
            object2 = ((zzcm)object2).zzb;
            string2.remove((String)object2);
        }
        zzcn2.zzb();
    }
}

