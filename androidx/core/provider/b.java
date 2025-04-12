/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentUris
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.content.pm.Signature
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build$VERSION
 *  android.os.Trace
 */
package androidx.core.provider;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import androidx.core.provider.b$b;
import androidx.core.provider.b$c;
import androidx.core.provider.b$d;
import androidx.core.provider.h$a;
import androidx.core.provider.h$b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class b {
    public static final WC1 a;
    public static final fV0 b;

    static {
        Object object = new WC1(2);
        a = object;
        b = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h$a a(Context object, List list) {
        block5: {
            Throwable throwable2;
            block6: {
                ArrayList arrayList = gp3_0.c("FontProvider.getFontFamilyResult");
                Trace.beginSection((String)((Object)arrayList));
                try {
                    int n3;
                    arrayList = new ArrayList();
                    for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
                        Object object2 = list.get(i3);
                        object2 = (gV0)object2;
                        Object object3 = object.getPackageManager();
                        Resources resources = object.getResources();
                        if ((object3 = androidx.core.provider.b.b(object3, object2, resources)) == null) {
                            object = new h$a();
                            break block5;
                        }
                        object3 = object3.authority;
                        object2 = androidx.core.provider.b.c(object, object2, (String)object3);
                        arrayList.add(object2);
                    }
                    object = new h$a(arrayList);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                Trace.endSection();
                return object;
            }
            Trace.endSection();
            throw throwable2;
        }
        Trace.endSection();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ProviderInfo b(PackageManager object, gV0 object2, Resources object3) {
        Throwable throwable2;
        block12: {
            Object object4;
            Object object5;
            block10: {
                String string2;
                block11: {
                    Object object6;
                    WC1 wC1;
                    Object object7;
                    block9: {
                        string2 = "Found content provider ";
                        object5 = "No package found for authority: ";
                        object7 = gp3_0.c("FontProvider.getProvider");
                        Trace.beginSection((String)object7);
                        object7 = ((gV0)object2).d;
                        object4 = ((gV0)object2).a;
                        object2 = ((gV0)object2).b;
                        if (object7 == null) {
                            object7 = iv0_0.b((Resources)object3, 0);
                        }
                        object3 = new Object();
                        ((b$d)object3).a = object4;
                        ((b$d)object3).b = object2;
                        ((b$d)object3).c = object7;
                        wC1 = a;
                        object6 = wC1.get(object3);
                        object6 = (ProviderInfo)object6;
                        if (object6 == null) break block9;
                        Trace.endSection();
                        return object6;
                    }
                    try {
                        object6 = object.resolveContentProvider((String)object4, 0);
                        if (object6 == null) break block10;
                        object5 = ((ProviderInfo)object6).packageName;
                        int n3 = ((String)object5).equals(object2);
                        if (n3 == 0) break block11;
                        object2 = ((ProviderInfo)object6).packageName;
                        int n4 = 64;
                        object = object.getPackageInfo((String)object2, n4);
                        object = object.signatures;
                        object2 = new ArrayList();
                        n4 = ((Signature[])object).length;
                        object5 = null;
                        for (n3 = 0; n3 < n4; object4 = (Object)object4.toByteArray(), ++n3) {
                            object4 = object[n3];
                            ((ArrayList)object2).add(object4);
                        }
                        object = b;
                        Collections.sort(object2, object);
                        string2 = null;
                        block6: for (n4 = 0; n4 < (n3 = object7.size()); ++n4) {
                            object4 = object7.get(n4);
                            object4 = (Collection)object4;
                            object5 = new Object(object4);
                            Collections.sort(object5, object);
                            int n7 = ((ArrayList)object2).size();
                            int n8 = ((ArrayList)object5).size();
                            if (n7 != n8) continue;
                            object4 = null;
                            for (n7 = 0; n7 < (n8 = ((ArrayList)object2).size()); ++n7) {
                                Object object8 = ((ArrayList)object2).get(n7);
                                object8 = (byte[])object8;
                                Object object9 = ((ArrayList)object5).get(n7);
                                n8 = (int)(Arrays.equals(object8, object9 = (Object)((byte[])object9)) ? 1 : 0);
                                if (n8 != 0) continue;
                                continue block6;
                            }
                            wC1.put(object3, object6);
                        }
                    }
                    catch (Throwable throwable2) {}
                    {
                        Trace.endSection();
                        return object6;
                    }
                    Trace.endSection();
                    return null;
                }
                object3 = new StringBuilder(string2);
                ((StringBuilder)object3).append((String)object4);
                string2 = ", but package was not ";
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append((String)object2);
                object2 = ((StringBuilder)object3).toString();
                object = new PackageManager.NameNotFoundException((String)object2);
                throw object;
                break block12;
            }
            object2 = new StringBuilder((String)object5);
            ((StringBuilder)object2).append((String)object4);
            object2 = ((StringBuilder)object2).toString();
            object = new PackageManager.NameNotFoundException((String)object2);
            throw object;
        }
        Trace.endSection();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h$b[] c(Context var0, gV0 var1_1, String var2_2) {
        block18: {
            block19: {
                var3_3 = var0;
                var4_7 = var2_2;
                var5_8 = "content";
                var6_9 = gp3_0.c("FontProvider.query");
                Trace.beginSection((String)var6_9);
                try {
                    var6_9 = new ArrayList();
                    var7_10 = new Uri.Builder();
                    var7_10 = var7_10.scheme((String)var5_8);
                    var7_10 = var7_10.authority(var2_2);
                    var7_10 = var7_10.build();
                    var8_11 = new Uri.Builder();
                    var5_8 = var8_11.scheme((String)var5_8);
                    var4_7 = var5_8.authority(var2_2);
                    var5_8 = "file";
                    var4_7 = var4_7.appendPath((String)var5_8);
                    var4_7 = var4_7.build();
                    var9_12 = Build.VERSION.SDK_INT;
                    var10_13 = 24;
                    var5_8 = var9_12 < var10_13 ? new b$b((Context)var0, (Uri)var7_10) : new b$c((Context)var0, (Uri)var7_10);
                    var10_13 = 0;
                    var8_11 = null;
                    var11_14 = "_id";
                    var12_15 = "file_id";
                    var13_16 = "font_ttc_index";
                    var14_17 = "font_variation_settings";
                    var15_18 = "font_weight";
                    var16_19 = "font_italic";
                    var17_20 = "result_code";
                }
                catch (Throwable var3_5) {
                    break block18;
                }
                var3_3 = new String[]{var11_14, var12_15, var13_16, var14_17, var15_18, var16_19, var17_20};
                var11_14 = "ContentQueryWrapper.query";
                var11_14 = gp3_0.c((String)var11_14);
                Trace.beginSection((String)var11_14);
                var11_14 = var1_1;
                {
                    catch (Throwable var3_4) {
                        break block19;
                    }
                    var11_14 = var1_1.c;
                    var11_14 = new String[]{var11_14};
                    var8_11 = var5_8.a((Uri)var7_10, (String[])var3_3, (String[])var11_14);
                    var3_3 = null;
                    if (var8_11 != null && (var18_21 = var8_11.getCount()) > 0) {
                        var6_9 = "result_code";
                        var19_22 = var8_11.getColumnIndex((String)var6_9);
                        var11_14 = new ArrayList();
                        var12_15 = "_id";
                        var20_23 = var8_11.getColumnIndex(var12_15);
                        var13_16 = "file_id";
                        var21_24 = var8_11.getColumnIndex(var13_16);
                        var14_17 = "font_ttc_index";
                        var22_25 = var8_11.getColumnIndex(var14_17);
                        var15_18 = "font_weight";
                        var23_26 = var8_11.getColumnIndex(var15_18);
                        var16_19 = "font_italic";
                        var24_27 = var8_11.getColumnIndex(var16_19);
                        while ((var25_28 = var8_11.moveToNext()) != 0) {
                            var25_28 = -1;
                            var27_30 = var19_22 != var25_28 ? (var26_29 = var8_11.getInt(var19_22)) : 0;
                            var28_31 = var22_25 != var25_28 ? (var26_29 = var8_11.getInt(var22_25)) : 0;
                            if (var21_24 == var25_28) {
                                var29_32 = var8_11.getLong(var20_23);
                                var31_33 = ContentUris.withAppendedId((Uri)var7_10, (long)var29_32);
                            } else {
                                var29_32 = var8_11.getLong(var21_24);
                                var31_33 = ContentUris.withAppendedId((Uri)var4_7, (long)var29_32);
                            }
                            var32_34 = var31_33;
                            if (var23_26 != var25_28) {
                                var33_35 = var26_29 = var8_11.getInt(var23_26);
                            } else {
                                var26_29 = 400;
                                var33_35 = 400;
                            }
                            var34_36 = var24_27 != var25_28 && (var25_28 = var8_11.getInt(var24_27)) == (var26_29 = 1);
                            var17_20 = new h$b(var32_34, var28_31, var33_35, var34_36, var27_30);
                            var11_14.add(var17_20);
                        }
                        var6_9 = var11_14;
                    }
                    if (var8_11 != null) {
                        var8_11.close();
                    }
                    var5_8.close();
                    var3_3 = new h$b[]{};
                    var3_3 = var6_9.toArray(var3_3);
                    var3_3 = (h$b[])var3_3;
                    Trace.endSection();
                    return var3_3;
                    finally {
                        Trace.endSection();
                    }
                }
            }
            if (var8_11 == null) ** GOTO lbl97
            {
                var8_11.close();
lbl97:
                // 2 sources

                var5_8.close();
                throw var3_4;
            }
        }
        Trace.endSection();
        throw var3_5;
    }
}

