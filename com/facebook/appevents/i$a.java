/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.appevents.i;
import com.facebook.appevents.i$a$a;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class i$a {
    public static void a(Q92 q92, String string2, String string3, Bundle bundle, i i3) {
        Intrinsics.checkNotNullParameter((Object)q92, "typeOfParameter");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        Intrinsics.checkNotNullParameter(bundle, "customEventsParams");
        Intrinsics.checkNotNullParameter(i3, "operationalData");
        bm2_1 bm2_12 = i$a.d(q92, string2);
        int[] nArray = i$a$a.$EnumSwitchMapping$0;
        int n3 = bm2_12.ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    i3.a(q92, string2, string3);
                    bundle.putCharSequence(string2, (CharSequence)string3);
                }
            } else {
                i3.a(q92, string2, string3);
            }
        } else {
            bundle.putCharSequence(string2, (CharSequence)string3);
        }
    }

    public static Pair b(Q92 object, String string2, String string3, Bundle bundle, i i3) {
        Intrinsics.checkNotNullParameter(object, "typeOfParameter");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        bm2_1 bm2_12 = i$a.d(object, string2);
        int[] nArray = i$a$a.$EnumSwitchMapping$0;
        int n3 = bm2_12.ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    if (i3 == null) {
                        i3 = new i();
                    }
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    i3.a((Q92)((Object)object), string2, string3);
                    bundle.putCharSequence(string2, (CharSequence)string3);
                }
            } else {
                if (i3 == null) {
                    i3 = new i();
                }
                i3.a((Q92)((Object)object), string2, string3);
            }
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence(string2, (CharSequence)string3);
        }
        object = new Pair(bundle, i3);
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object c(Q92 var0, String var1_1, Bundle var2_2, i var3_3) {
        Intrinsics.checkNotNullParameter((Object)var0 /* !! */ , "typeOfParameter");
        var4_4 = "key";
        Intrinsics.checkNotNullParameter(var1_1, var4_4);
        var5_5 = null;
        if (var3_3 == null) ** GOTO lbl-1000
        var6_6 = "type";
        Intrinsics.checkNotNullParameter((Object)var0 /* !! */ , var6_6);
        Intrinsics.checkNotNullParameter(var1_1, var4_4);
        var3_3 = var3_3.a;
        var7_7 = var3_3.containsKey((Object)var0 /* !! */ );
        if (var7_7 && (var0 /* !! */  = (Map)var3_3.get((Object)var0 /* !! */ )) != null) {
            var0 /* !! */  = var0 /* !! */ .get(var1_1);
        } else lbl-1000:
        // 2 sources

        {
            var0 /* !! */  = null;
        }
        if (var2_2 != null) {
            var5_5 = var2_2.getCharSequence(var1_1);
        }
        if (var0 /* !! */  == null) {
            var0 /* !! */  = var5_5;
        }
        return var0 /* !! */ ;
    }

    public static bm2_1 d(Q92 object, String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "typeOfParameter");
        Intrinsics.checkNotNullParameter(string2, "parameter");
        Map map2 = i.d;
        Set set = (Pair)map2.get(object);
        Object object2 = null;
        set = set != null ? (Set)((Pair)((Object)set)).a : null;
        object = (Pair)map2.get(object);
        if (object != null) {
            object2 = object = ((Pair)object).b;
            object2 = (Set)object;
        }
        if (set != null && (bl2 = set.contains(string2))) {
            return bm2_1.OperationalData;
        }
        if (object2 != null && (bl2 = object2.contains(string2))) {
            return bm2_1.CustomAndOperationalData;
        }
        return bm2_1.CustomData;
    }
}

