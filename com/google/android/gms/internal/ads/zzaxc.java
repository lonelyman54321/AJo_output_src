/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzatg;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayw;
import java.util.ArrayList;
import java.util.List;

public final class zzaxc
extends zzaxb {
    public zzaxc(Context context, String string2, boolean bl2) {
        super(context, string2, bl2);
    }

    public static zzaxc zzt(String string2, Context context, boolean bl2) {
        zzaxb.zzr(context, false);
        zzaxc zzaxc2 = new zzaxc(context, string2, false);
        return zzaxc2;
    }

    public static zzaxc zzu(String string2, Context context, boolean bl2, int n3) {
        zzaxb.zzr(context, bl2);
        zzaxc zzaxc2 = new zzaxc(context, string2, bl2);
        return zzaxc2;
    }

    public final List zzp(zzaye zzaye2, Context object, zzatp zzatp2, zzatg object2) {
        boolean bl2;
        object2 = zzaye2.zzk();
        if (object2 != null && (bl2 = this.zzu)) {
            int n3 = zzaye2.zza();
            object2 = new Object();
            object = super.zzp(zzaye2, (Context)object, zzatp2, null);
            ((ArrayList)object2).addAll(object);
            object = new zzayw(zzaye2, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzatp2, n3, 24);
            ((ArrayList)object2).add(object);
            return object2;
        }
        return super.zzp(zzaye2, (Context)object, zzatp2, null);
    }
}

