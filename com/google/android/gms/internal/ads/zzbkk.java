/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzbkk
implements zzfxu {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbkk(String string2) {
        this.zza = string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object apply(Object object) {
        String string2;
        int n3;
        String string3;
        boolean bl2;
        Object object2;
        block5: {
            object = (String)object;
            object2 = zzblo.zza;
            object2 = this.zza;
            if (object == null) {
                return object2;
            }
            Boolean bl3 = (Boolean)zzbgj.zzf.zze();
            bl2 = bl3;
            if (bl2) {
                int n4;
                String[] stringArray = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                string3 = Uri.parse((String)object2).getHost();
                n3 = 0;
                string2 = null;
                while (n3 < (n4 = 3)) {
                    String string4 = stringArray[n3];
                    n4 = (int)(string3.endsWith(string4) ? 1 : 0);
                    if (n4 == 0) {
                        ++n3;
                        continue;
                    }
                    break block5;
                }
                return object2;
            }
        }
        String string5 = (String)zzbgj.zza.zze();
        string3 = (String)zzbgj.zzb.zze();
        n3 = TextUtils.isEmpty((CharSequence)string5);
        if (n3 == 0) {
            object2 = ((String)object2).replace(string5, (CharSequence)object);
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)string3)) return object2;
        Uri uri = Uri.parse((String)object2);
        string2 = uri.getQueryParameter(string3);
        n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        if (n3 == 0) return object2;
        return uri.buildUpon().appendQueryParameter(string3, (String)object).toString();
    }
}

