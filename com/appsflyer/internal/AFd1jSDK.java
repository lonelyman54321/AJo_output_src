/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1vSDK;
import com.appsflyer.internal.AFd1dSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFd1fSDK$AFa1zSDK;
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1jSDK
implements AFd1hSDK {
    private final AFd1nSDK AFAdRevenueData;

    public AFd1jSDK(AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.AFAdRevenueData = aFd1nSDK;
    }

    private final File getRevenue() {
        Object object = this.AFAdRevenueData.AFAdRevenueData;
        if (object != null) {
            String string2;
            File file = new File((File)(object = object.getFilesDir()), string2 = "AFExceptionsCache");
            boolean bl2 = file.exists();
            if (!bl2) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    public final boolean AFAdRevenueData() {
        String[] stringArray = new String[]{};
        return this.getCurrencyIso4217Code(stringArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getCurrencyIso4217Code(Throwable object, String charSequence) {
        String string2 = "Could not cache exception\n ";
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = "";
        Intrinsics.checkNotNullParameter(charSequence, (String)object2);
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Exception exception2;
                Object object3;
                Object object4;
                CharSequence charSequence2;
                block10: {
                    block9: {
                        boolean bl2;
                        block7: {
                            block6: {
                                try {
                                    object2 = this.getRevenue();
                                    charSequence2 = null;
                                    if (object2 == null) break block6;
                                    object4 = "6.15.2";
                                    object3 = new File((File)object2, (String)object4);
                                    boolean bl3 = ((File)object3).exists();
                                    if (!bl3) {
                                        ((File)object3).mkdirs();
                                    }
                                    break block7;
                                }
                                catch (Throwable throwable2) {
                                    break block8;
                                }
                            }
                            bl2 = false;
                            object3 = null;
                        }
                        if (object3 == null) return charSequence2;
                        try {
                            int n3;
                            object = AFd1dSDK.getMonetizationNetwork((Throwable)object, (String)charSequence);
                            charSequence = ((AFd1fSDK)object).getMediationNetwork;
                            object2 = new File((File)object3, (String)charSequence);
                            bl2 = ((File)object2).exists();
                            if (!bl2) break block9;
                            object3 = AFd1fSDK.AFa1zSDK;
                            object3 = om0_2.b((File)object2);
                            if ((object3 = AFd1fSDK$AFa1zSDK.getMediationNetwork((String)object3)) == null) break block9;
                            ((AFd1fSDK)object3).getCurrencyIso4217Code = n3 = ((AFd1fSDK)object3).getCurrencyIso4217Code + 1;
                            object = object3;
                        }
                        catch (Exception exception2) {
                            break block10;
                        }
                    }
                    object = ((AFd1fSDK)object).getMonetizationNetwork();
                    om0_2.c((File)object2, (String)object);
                    return charSequence;
                }
                object3 = AFLogger.INSTANCE;
                object4 = AFh1vSDK.values;
                String string3 = exception2.getMessage();
                charSequence = new StringBuilder(string2);
                ((StringBuilder)charSequence).append(string3);
                String string4 = ((StringBuilder)charSequence).toString();
                int n4 = 4;
                AFh1uSDK.v$default((AFh1uSDK)object3, (AFh1vSDK)((Object)object4), string4, false, n4, null);
                return charSequence2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean getCurrencyIso4217Code(String ... object) {
        Object object2 = "delete all exceptions except for: ";
        Serializable serializable = "";
        Intrinsics.checkNotNullParameter(object, (String)((Object)serializable));
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                int n3;
                int n4;
                try {
                    serializable = this.getRevenue();
                    n4 = 1;
                    if (serializable == null) return n4 != 0;
                    n3 = ((String[])object).length;
                    if (n3 == 0) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1vSDK aFh1vSDK = AFh1vSDK.values;
                        String string2 = "delete all exceptions";
                        boolean bl3 = false;
                        Object var10_15 = null;
                        int n7 = 4;
                        AFh1uSDK.v$default(aFLogger, aFh1vSDK, string2, false, n7, null);
                        return qm0_1.d((File)serializable) != 0;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                Object object3 = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.values;
                String string3 = ", ";
                int n8 = 62;
                string3 = tp_2.G(n8, string3, (Object[])object);
                Comparable<StringBuilder> comparable = new Comparable<StringBuilder>((String)object2);
                ((StringBuilder)comparable).append(string3);
                string3 = ((StringBuilder)comparable).toString();
                boolean bl4 = false;
                n8 = 0;
                comparable = null;
                int n10 = 4;
                AFh1uSDK.v$default((AFh1uSDK)object3, aFh1vSDK, string3, false, n10, null);
                object2 = ((File)serializable).listFiles();
                if (object2 == null) return n4 != 0;
                serializable = "";
                Intrinsics.checkNotNullExpressionValue(object2, (String)((Object)serializable));
                serializable = new Serializable();
                n3 = ((File[])object2).length;
                aFh1vSDK = null;
                string3 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    comparable = object2[i3];
                    String string4 = ((File)comparable).getName();
                    n10 = (int)(tp_2.w((Object[])object, string4) ? 1 : 0);
                    if (n10 != 0) continue;
                    serializable.add(comparable);
                }
                int n14 = 10;
                n14 = yx_2.o(serializable, n14);
                object = new ArrayList(n14);
                object2 = serializable.iterator();
                while (bl2 = object2.hasNext()) {
                    serializable = object2.next();
                    serializable = (File)serializable;
                    object3 = "";
                    Intrinsics.checkNotNullExpressionValue(serializable, (String)object3);
                    bl2 = qm0_1.d(serializable);
                    serializable = bl2;
                    ((ArrayList)object).add(serializable);
                }
                object = CollectionsKt.o0((Iterable)object);
                n14 = (int)((object = (Collection)object).isEmpty() ? 1 : 0);
                if (n14 != 0) {
                    object = Boolean.TRUE;
                    object = O03.b(object);
                }
                if ((n14 = (object = (Set)object).size()) != n4) return 0 != 0;
                object = (Iterable)object;
                object = CollectionsKt.K((Iterable)object);
                boolean bl5 = (Boolean)(object = (Boolean)object);
                if (!bl5) return 0 != 0;
                return n4 != 0;
            }
            throw throwable2;
        }
    }

    public final int getMediationNetwork() {
        int n3;
        Iterator iterator = ((Iterable)this.getMonetizationNetwork()).iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            AFd1fSDK aFd1fSDK = (AFd1fSDK)iterator.next();
            n3 = aFd1fSDK.getCurrencyIso4217Code;
            n4 += n3;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List getMonetizationNetwork() {
        synchronized (this) {
            block13: {
                block10: {
                    block12: {
                        block16: {
                            block14: {
                                block17: {
                                    block15: {
                                        block11: {
                                            try {
                                                var1_1 = this.getRevenue();
                                                var2_3 /* !! */  = null;
                                                if (var1_1 == null || (var1_1 = var1_1.listFiles()) == null) break block10;
                                                var3_4 /* !! */  = new ArrayList<ArrayList<Object>>();
                                                var4_5 = ((File[])var1_1).length;
                                                var5_6 = 0;
lbl9:
                                                // 2 sources

                                                while (var5_6 < var4_5) {
                                                    var6_7 /* !! */  = var1_1[var5_6];
                                                    break block11;
                                                }
                                                break block12;
                                            }
                                            catch (Throwable var1_2) {
                                                break block13;
                                            }
                                        }
                                        try {
                                            var6_7 /* !! */  = var6_7 /* !! */ .listFiles();
                                            if (var6_7 /* !! */  == null) break block14;
                                            var7_9 = "";
                                            Intrinsics.checkNotNullExpressionValue(var6_7 /* !! */ , (String)var7_9);
                                            var7_9 = new ArrayList<Object>();
                                            var8_10 = var6_7 /* !! */ .length;
                                            var9_11 = 0;
                                            var10_12 /* !! */  = null;
lbl25:
                                            // 2 sources

                                            while (var9_11 < var8_10) {
                                                var11_13 = var6_7 /* !! */ [var9_11];
                                                var12_14 = AFd1fSDK.AFa1zSDK;
                                                var12_14 = "";
                                                Intrinsics.checkNotNullExpressionValue(var11_13, (String)var12_14);
                                                var11_13 = om0_2.b((File)var11_13);
                                                var11_13 = AFd1fSDK$AFa1zSDK.getMediationNetwork((String)var11_13);
                                                if (var11_13 == null) break block15;
                                                var7_9.add(var11_13);
                                                break block15;
                                            }
                                            break block16;
                                        }
                                        catch (Throwable var6_8) {
                                            break block17;
                                        }
                                    }
                                    ++var9_11;
                                    ** GOTO lbl25
                                }
                                var7_9 = AFLogger.INSTANCE;
                                var13_15 = AFh1vSDK.values;
                                var6_7 /* !! */  = var6_8.getMessage();
                                var10_12 /* !! */  = new StringBuilder();
                                var11_13 = "Could not get stored exceptions\n ";
                                var10_12 /* !! */ .append((String)var11_13);
                                var10_12 /* !! */ .append((String)var6_7 /* !! */ );
                                var10_12 /* !! */  = var10_12 /* !! */ .toString();
                                var11_13 = null;
                                var14_16 = 4;
                                AFh1uSDK.v$default(var7_9, var13_15, (String)var10_12 /* !! */ , false, var14_16, null);
                            }
                            var7_9 = null;
                        }
                        if (var7_9 != null) {
                            var3_4 /* !! */ .add(var7_9);
                        }
                        ++var5_6;
                        ** GOTO lbl9
                    }
                    var1_1 = "<this>";
                    Intrinsics.checkNotNullParameter(var3_4 /* !! */ , (String)var1_1);
                    var2_3 /* !! */  = new ArrayList();
                    var1_1 = var3_4 /* !! */ .iterator();
                    while (var15_17 = var1_1.hasNext()) {
                        var3_4 /* !! */  = var1_1.next();
                        var3_4 /* !! */  = var3_4 /* !! */ ;
                        cx_2.r(var3_4 /* !! */ , var2_3 /* !! */ );
                    }
                }
                if (var2_3 /* !! */  != null) return var2_3 /* !! */ ;
                return mz0_2.a;
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getMonetizationNetwork(int n3, int n4) {
        synchronized (this) {
            ArrayList<File[]> arrayList;
            block5: {
                boolean bl2;
                int n7;
                Object object;
                Object object2;
                try {
                    object2 = this.getRevenue();
                    if (object2 == null || (object2 = object2.listFiles()) == null) break block5;
                    object = "";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                    object = new ArrayList();
                    n7 = ((File[])object2).length;
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (int i3 = 0; i3 < n7; ++i3) {
                    File file = object2[i3];
                    String string2 = file.getName();
                    String string3 = "";
                    Intrinsics.checkNotNullExpressionValue(string2, string3);
                    int n8 = AFc1vSDK.getMonetizationNetwork(string2);
                    if (n3 <= n8 && n8 <= n4) continue;
                    object.add(file);
                }
                n4 = 10;
                n4 = yx_2.o(object, n4);
                arrayList = new ArrayList<File[]>(n4);
                Iterator iterator = object.iterator();
                while (bl2 = iterator.hasNext()) {
                    object2 = iterator.next();
                    object2 = (File)object2;
                    object = "";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                    bl2 = qm0_1.d((File)object2);
                    object2 = bl2;
                    arrayList.add((File[])object2);
                }
            }
            arrayList = Unit.a;
            return;
        }
    }
}

