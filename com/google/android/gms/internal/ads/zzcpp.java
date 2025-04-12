/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.webkit.CookieManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcot;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyt;
import java.util.Map;

public final class zzcpp
implements zzcot {
    private final CookieManager zza;

    public zzcpp(Context context) {
        context = zzu.zzq().zza(context);
        this.zza = context;
    }

    public final void zza(Map object) {
        Object object2;
        block9: {
            block7: {
                block8: {
                    object2 = this.zza;
                    if (object2 == null) break block7;
                    object2 = (String)object.get("clear");
                    if (object2 == null) break block8;
                    object = zzbep.zzaO;
                    object = (String)zzba.zzc().zza((zzbeg)object);
                    object2 = this.zza.getCookie((String)object);
                    if (object2 != null) {
                        int n3;
                        object2 = zzfyt.zzc(zzfxr.zzc(';')).zzf((CharSequence)object2);
                        Object var3_3 = null;
                        for (int i3 = 0; i3 < (n3 = object2.size()); ++i3) {
                            CookieManager cookieManager = this.zza;
                            Object object3 = (String)object2.get(i3);
                            Object object4 = zzfyt.zzc(zzfxr.zzc('='));
                            object3 = ((zzfyt)object4).zzd((CharSequence)object3).iterator();
                            object3.getClass();
                            boolean bl2 = object3.hasNext();
                            if (bl2) {
                                object3 = (String)object3.next();
                                object4 = zzbep.zzay;
                                zzben zzben2 = zzba.zzc();
                                object4 = (String)zzben2.zza((zzbeg)object4);
                                object3 = String.valueOf(object3);
                                object4 = String.valueOf(object4);
                                object3 = ((String)object3).concat((String)object4);
                                cookieManager.setCookie((String)object, (String)object3);
                                continue;
                            }
                            object2 = Gj0.b(0, "position (0) must be less than the number of elements that remained (", ")");
                            object = new IndexOutOfBoundsException((String)object2);
                            throw object;
                        }
                    }
                    break block7;
                }
                object2 = "cookie";
                boolean bl3 = TextUtils.isEmpty((CharSequence)(object = (String)object.get(object2)));
                if (!bl3) break block9;
            }
            return;
        }
        object2 = this.zza;
        Object object5 = zzbep.zzaO;
        object5 = (String)zzba.zzc().zza((zzbeg)object5);
        object2.setCookie((String)object5, (String)object);
    }
}

