/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageFormat
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFd1bSDK;
import com.appsflyer.internal.AFd1eSDK;
import com.appsflyer.internal.AFd1eSDK$AFa1vSDK;
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1iSDK$1;
import com.appsflyer.internal.AFd1iSDK$2;
import com.appsflyer.internal.AFd1iSDK$3;
import com.appsflyer.internal.AFd1iSDK$4;
import com.appsflyer.internal.AFd1iSDK$5;
import com.appsflyer.internal.AFd1iSDK$8;
import com.appsflyer.internal.AFd1iSDK$9;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFe1xSDK;
import com.appsflyer.internal.AFf1aSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFh1dSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFk1sSDK;
import com.appsflyer.internal.g_0;
import com.appsflyer.internal.h_0;
import com.appsflyer.internal.i;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

public final class AFd1iSDK
implements AFd1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;
    private static long copydefault = 4316357171685541830L;
    private static char equals = '\u2e75';
    private static int hashCode = 0;
    private static int toString = -2046375994;
    private AFd1kSDK AFAdRevenueData;
    private final String areAllFieldsValid;
    private AFd1eSDK$AFa1vSDK component1;
    private final rq1_2 component2;
    private final rq1_2 component3;
    private final rq1_2 component4;
    private final rq1_2 getCurrencyIso4217Code;
    private final rq1_2 getMediationNetwork;
    private final rq1_2 getMonetizationNetwork;
    private final rq1_2 getRevenue;

    public AFd1iSDK(AFd1kSDK object) {
        Intrinsics.checkNotNullParameter(object, "");
        this.AFAdRevenueData = object;
        object = new AFd1iSDK$3(this);
        this.getMonetizationNetwork = object = yr1_2.b((Function0)object);
        object = new AFd1iSDK$5(this);
        this.getCurrencyIso4217Code = object = yr1_2.b((Function0)object);
        object = new AFd1iSDK$2(this);
        this.getRevenue = object = yr1_2.b((Function0)object);
        object = new AFd1iSDK$9(this);
        this.getMediationNetwork = object = yr1_2.b((Function0)object);
        object = new AFd1iSDK$4(this);
        this.component4 = object = yr1_2.b((Function0)object);
        this.areAllFieldsValid = "6.15.2";
        object = new AFd1iSDK$1(this);
        this.component2 = object = yr1_2.b((Function0)object);
        object = new AFd1iSDK$8(this);
        this.component3 = object = yr1_2.b((Function0)object);
    }

    private final AFd1qSDK AFAdRevenueData() {
        int n3 = copy + 115;
        hashCode = n3 % 128;
        if ((n3 %= 2) == 0) {
            int n4;
            AFd1qSDK aFd1qSDK = (AFd1qSDK)this.getCurrencyIso4217Code.getValue();
            int n7 = hashCode + 1;
            copy = n4 = n7 % 128;
            if ((n7 %= 2) != 0) {
                return aFd1qSDK;
            }
            throw null;
        }
        AFd1qSDK aFd1qSDK = (AFd1qSDK)this.getCurrencyIso4217Code.getValue();
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] object) {
        object = (AFd1iSDK)object[0];
        copy = (hashCode + 81) % 128;
        ExecutorService executorService = super.areAllFieldsValid();
        h_0 h_02 = new h_0((AFd1iSDK)object);
        executorService.execute(h_02);
        int n3 = copy + 5;
        hashCode = n3 % 128;
        executorService = null;
        if ((n3 %= 2) == 0) {
            return null;
        }
        throw null;
    }

    private static final void AFAdRevenueData(AFd1iSDK aFd1iSDK) {
        int n3;
        hashCode = (copy + 23) % 128;
        String string2 = "";
        Intrinsics.checkNotNullParameter(aFd1iSDK, string2);
        aFd1iSDK.copydefault();
        int n4 = copy + 119;
        hashCode = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            n4 = 61 / 0;
        }
    }

    private static final void AFAdRevenueData(AFd1iSDK object, Throwable throwable, String string2) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(throwable, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object2 = ((AFd1iSDK)object).component3();
        if (object2 != null) {
            int n3;
            int n4;
            int n7 = hashCode + 67;
            copy = n4 = n7 % 128;
            if ((n7 %= 2) == 0 ? (n3 = ((AFd1iSDK)object).getMediationNetwork((AFh1dSDK)object2)) == 0 : (n3 = ((AFd1iSDK)object).getMediationNetwork((AFh1dSDK)object2)) == (n7 = 1)) {
                hashCode = n3 = (copy + 71) % 128;
                object = ((AFd1iSDK)object).getRevenue();
                object.getCurrencyIso4217Code(throwable, string2);
            }
        }
    }

    private final boolean AFAdRevenueData(AFh1dSDK aFh1dSDK) {
        int n3;
        int n4 = 1;
        hashCode = n3 = (copy + 103) % 128;
        long l2 = System.currentTimeMillis();
        Object object = new Object[n4];
        object[0] = this;
        int n7 = System.identityHashCode(this);
        int n8 = -1274433155;
        int n10 = 1274433157;
        object = (AFd1rSDK)AFd1iSDK.getRevenue((Object[])object, n8, n10, n7);
        String string2 = "af_send_exc_to_server_window";
        long l3 = -1;
        long l4 = object.getMediationNetwork(string2, l3);
        long l7 = aFh1dSDK.AFAdRevenueData;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l8 = timeUnit.toSeconds(l2);
        long l12 = l7 - l8;
        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 < 0) {
            hashCode = (copy + 85) % 128;
            return false;
        }
        Object object3 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (object3 != false) {
            int n14;
            int n15 = copy + 21;
            hashCode = n14 = n15 % 128;
            if ((n15 %= 2) == 0) {
                n15 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1));
                if (n15 >= 0) {
                    int n16;
                    Object object4;
                    Object object5 = new Object[n4];
                    object5[0] = this;
                    n3 = System.identityHashCode(this);
                    n4 = (object5 = (AFd1rSDK)AFd1iSDK.getRevenue((Object[])object5, n8, n10, n3)).getMediationNetwork((String)(object4 = "af_send_exc_min"), n16 = -1);
                    if (n4 != n16) {
                        copy = (hashCode + 63) % 128;
                        object4 = this.getRevenue();
                        n3 = object4.getMediationNetwork();
                        if (n3 >= n4) {
                            return this.getCurrencyIso4217Code(aFh1dSDK);
                        }
                    }
                    return false;
                }
            } else {
                throw null;
            }
        }
        return false;
    }

    private static void a(char c2, String string2, String string3, String string4, int n3, Object[] objectArray) {
        int n4;
        Object object;
        Object object2;
        int n7;
        int n8 = 2;
        if (string4 != null) {
            int n10;
            n7 = $11 + 45;
            $10 = n10 = n7 % 128;
            if ((n7 %= n8) != 0) {
                object2 = string4.toCharArray();
                n10 = 4 / 0;
            } else {
                object2 = string4.toCharArray();
            }
        } else {
            object2 = string4;
        }
        object2 = (char[])object2;
        if (string3 != null) {
            object = string3.toCharArray();
            $10 = n4 = ($11 + 15) % 128;
        } else {
            object = string3;
        }
        object = (char[])object;
        Object object3 = string2 != null ? (Object)string2.toCharArray() : string2;
        object3 = (char[])object3;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        int n14 = ((Object)object3).length;
        char[] cArray = new char[n14];
        int n15 = ((Object)object2).length;
        char[] cArray2 = new char[n15];
        System.arraycopy(object3, 0, cArray, 0, n14);
        System.arraycopy(object2, 0, cArray2, 0, n15);
        cArray[0] = n7 = (int)((char)(cArray[0] ^ c2));
        n7 = cArray2[n8];
        n4 = n3;
        n4 = (char)n3;
        cArray2[n8] = n7 = (int)((char)(n7 + n4));
        n8 = ((Object)object).length;
        object2 = new char[n8];
        aFk1sSDK.getMediationNetwork = 0;
        while ((n4 = aFk1sSDK.getMediationNetwork) < n8) {
            $11 = ($10 + 119) % 128;
            n14 = (n4 + 2) % 4;
            n15 = (n4 + 3) % 4;
            int n16 = n4 % 4;
            n16 = cArray[n16] * 32718;
            n14 = cArray2[n14];
            n16 += n14;
            char c3 = (char)-1;
            n16 = (char)(n16 % c3);
            aFk1sSDK.getMonetizationNetwork = (char)n16;
            int n17 = (cArray[n15] * 32718 + n14) / c3;
            cArray2[n15] = n14 = (int)((char)n17);
            cArray[n15] = n16;
            long l2 = object[n4] ^ n16;
            long l3 = copydefault;
            long l4 = 4316357171685541830L;
            l2 ^= (l3 ^= l4);
            l3 = (int)((long)toString ^ l4);
            l2 ^= l3;
            l3 = (char)((long)equals ^ l4);
            n14 = (char)(l2 ^= l3);
            object2[n4] = n14;
            aFk1sSDK.getMediationNetwork = ++n4;
        }
        String string5 = new String((char[])object2);
        objectArray[0] = string5;
    }

    public static /* synthetic */ void a(AFd1iSDK aFd1iSDK, Throwable throwable, String string2) {
        AFd1iSDK.AFAdRevenueData(aFd1iSDK, throwable, string2);
    }

    private final ExecutorService areAllFieldsValid() {
        int n3;
        int n4;
        copy = n4 = (hashCode + 97) % 128;
        ExecutorService executorService = (ExecutorService)this.component4.getValue();
        int n7 = hashCode + 57;
        copy = n3 = n7 % 128;
        if ((n7 %= 2) != 0) {
            return executorService;
        }
        throw null;
    }

    public static /* synthetic */ void b(AFd1iSDK aFd1iSDK) {
        AFd1iSDK.getMonetizationNetwork(aFd1iSDK);
    }

    public static /* synthetic */ void c(AFd1iSDK aFd1iSDK) {
        AFd1iSDK.getMediationNetwork(aFd1iSDK);
    }

    private final AFg1wSDK component1() {
        hashCode = (copy + 39) % 128;
        AFg1wSDK aFg1wSDK = (AFg1wSDK)this.getMediationNetwork.getValue();
        hashCode = (copy + 47) % 128;
        return aFg1wSDK;
    }

    private AFd1bSDK component2() {
        int n3 = hashCode + 7;
        copy = n3 % 128;
        if ((n3 %= 2) != 0) {
            int n4;
            AFd1bSDK aFd1bSDK = (AFd1bSDK)this.component3.getValue();
            int n7 = copy + 69;
            hashCode = n4 = n7 % 128;
            if ((n7 %= 2) == 0) {
                return aFd1bSDK;
            }
            throw null;
        }
        AFd1bSDK aFd1bSDK = (AFd1bSDK)this.component3.getValue();
        throw null;
    }

    private final AFh1dSDK component3() {
        int n3 = 1;
        Object object = new Object[n3];
        object[0] = this;
        int n4 = System.identityHashCode(this);
        int n7 = -1136684343;
        int n8 = 1136684347;
        object = ((AFf1aSDK)AFd1iSDK.getRevenue((Object[])object, (int)n7, (int)n8, (int)n4)).getCurrencyIso4217Code.getRevenue;
        n4 = 0;
        if (object != null) {
            int n10;
            n7 = copy;
            n8 = n7 + 23;
            hashCode = n10 = n8 % 128;
            if ((n8 %= 2) == 0) {
                object = object.getRevenue;
                if (object != null) {
                    hashCode = (n7 + 77) % 128;
                    object = object.getMediationNetwork;
                    hashCode = (n7 + 75) % 128;
                    return object;
                }
            } else {
                object = object.getRevenue;
                throw null;
            }
        }
        return null;
    }

    private final AFd1rSDK component4() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        return (AFd1rSDK)AFd1iSDK.getRevenue(objectArray, -1274433155, 1274433157, n3);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void copy() {
        int n3 = 1;
        int n4 = 0;
        String string2 = null;
        synchronized (this) {
            Throwable throwable2;
            block11: {
                Object object;
                block12: {
                    block9: {
                        AFh1dSDK aFh1dSDK;
                        block10: {
                            aFh1dSDK = this.component3();
                            if (aFh1dSDK == null) break block9;
                            int n7 = aFh1dSDK.getMonetizationNetwork;
                            int n8 = -1;
                            int n10 = 1274433157;
                            int n14 = -1274433155;
                            if (n7 == n8) {
                                object = new Object[n3];
                                object[0] = this;
                                n4 = System.identityHashCode(this);
                                object = AFd1iSDK.getRevenue((Object[])object, n14, n10, n4);
                                object = (AFd1rSDK)object;
                                string2 = "af_send_exc_to_server_window";
                                object.AFAdRevenueData(string2);
                                break block10;
                            }
                            object = new Object[n3];
                            object[0] = this;
                            n4 = System.identityHashCode(this);
                            object = AFd1iSDK.getRevenue((Object[])object, n14, n10, n4);
                            string2 = "af_send_exc_to_server_window";
                            long l2 = -1;
                            long l3 = (object = (AFd1rSDK)object).getMediationNetwork(string2, l2);
                            long l4 = l3 - l2;
                            n10 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                            if (n10 != 0) break block10;
                            n3 = copy + 17;
                            hashCode = n4 = n3 % 128;
                            if ((n3 %= 2) == 0) {
                                this.getRevenue(aFh1dSDK);
                                break block10;
                            }
                            this.getRevenue(aFh1dSDK);
                            n3 = 0;
                            object = null;
                            {
                                catch (Throwable throwable2) {
                                    break block11;
                                }
                            }
                            throw null;
                        }
                        n4 = (int)(this.getMediationNetwork(aFh1dSDK) ? 1 : 0);
                        break block12;
                    }
                    n3 = copy + 85;
                    hashCode = n3 %= 128;
                }
                object = this.component1;
                if (object != null) {
                    object.onConfigurationChanged(n4 != 0);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    private final void copydefault() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 37->40)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ void d(AFd1iSDK aFd1iSDK) {
        AFd1iSDK.AFAdRevenueData(aFd1iSDK);
    }

    private final void equals() {
        block5: {
            Object object;
            block7: {
                block9: {
                    Object object2;
                    int n3;
                    int n4;
                    int n7;
                    int n8;
                    block10: {
                        int n10;
                        int n14;
                        int n15;
                        block8: {
                            block6: {
                                block4: {
                                    n8 = 2;
                                    n7 = 1;
                                    n4 = 0;
                                    n3 = copy + 111;
                                    hashCode = n15 = n3 % 128;
                                    if ((n3 %= n8) == 0) break block4;
                                    object = this.component3();
                                    n15 = 77 / 0;
                                    if (object == null) break block5;
                                    break block6;
                                }
                                object = this.component3();
                                if (object == null) break block5;
                            }
                            n15 = copy + n7;
                            hashCode = n14 = n15 % 128;
                            if ((n15 %= n8) != 0) break block7;
                            n15 = (int)(this.AFAdRevenueData((AFh1dSDK)object) ? 1 : 0);
                            if (n15 != n7) {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1vSDK aFh1vSDK = AFh1vSDK.values;
                                AFh1uSDK.v$default(aFLogger, aFh1vSDK, "skipping", false, 4, null);
                                return;
                            }
                            n15 = hashCode + 15;
                            copy = n15 % 128;
                            n14 = 1684451992;
                            n10 = -1684451992;
                            if ((n15 %= n8) != 0) break block8;
                            object2 = this.component1();
                            Object[] objectArray = new Object[n7];
                            objectArray[0] = object2;
                            n15 = System.identityHashCode(object2);
                            object2 = (String)AFg1wSDK.getCurrencyIso4217Code(objectArray, n10, n14, n15);
                            n14 = 0 / 0;
                            if (object2 == null) break block9;
                            break block10;
                        }
                        object2 = this.component1();
                        Object[] objectArray = new Object[n7];
                        objectArray[0] = object2;
                        n15 = System.identityHashCode(object2);
                        if ((object2 = (String)AFg1wSDK.getCurrencyIso4217Code(objectArray, n10, n14, n15)) == null) break block9;
                    }
                    object = this.getMonetizationNetwork((AFh1dSDK)object);
                    List list = this.getRevenue().getMonetizationNetwork();
                    Object object3 = new Object[n8];
                    object3[0] = object;
                    object3[n7] = list;
                    long l2 = System.currentTimeMillis();
                    n4 = (int)l2;
                    n7 = 563165298;
                    n3 = -563165297;
                    object3 = (Map)AFd1iSDK.getRevenue(object3, n7, n3, n4);
                    Object object4 = new JSONObject((Map)object3);
                    object3 = object4.toString();
                    object4 = "";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                    this.getCurrencyIso4217Code((String)object3, (String)object2);
                }
                return;
            }
            this.AFAdRevenueData((AFh1dSDK)object);
            throw null;
        }
    }

    public static final /* synthetic */ AFd1kSDK getCurrencyIso4217Code(AFd1iSDK aFd1iSDK) {
        Object[] objectArray = new Object[]{aFd1iSDK};
        int n3 = (int)System.currentTimeMillis();
        return (AFd1kSDK)AFd1iSDK.getRevenue(objectArray, 83028355, -83028355, n3);
    }

    private final void getCurrencyIso4217Code(String object, String object2) {
        copy = (hashCode + 37) % 128;
        Object object3 = Charsets.UTF_8;
        object3 = ((String)object).getBytes((Charset)object3);
        Intrinsics.checkNotNullExpressionValue(object3, "");
        object = AFb1jSDK.getMonetizationNetwork((String)object, (String)object2);
        object2 = new Pair("Authorization", object);
        object = eh1_2.d((Pair)object2);
        this.component2().getMediationNetwork((byte[])object3, (Map)object, 2000);
        hashCode = (copy + 3) % 128;
    }

    private final boolean getCurrencyIso4217Code(AFh1dSDK object) {
        int n3;
        new AFe1vSDK();
        String string2 = this.areAllFieldsValid;
        object = ((AFh1dSDK)object).getCurrencyIso4217Code;
        String string3 = "";
        Intrinsics.checkNotNullExpressionValue(object, string3);
        boolean bl2 = AFe1vSDK.getMonetizationNetwork(string2, (String)object);
        int n4 = copy + 65;
        hashCode = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return bl2;
        }
        throw null;
    }

    private final AFf1aSDK getMediationNetwork() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        return (AFf1aSDK)AFd1iSDK.getRevenue(objectArray, -1136684343, 1136684347, n3);
    }

    private static final void getMediationNetwork(AFd1iSDK aFd1iSDK) {
        int n3;
        int n4 = copy + 1;
        hashCode = n3 = n4 % 128;
        String string2 = "";
        if ((n4 %= 2) == 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, string2);
            aFd1iSDK.equals();
            copy = (hashCode + 121) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(aFd1iSDK, string2);
        aFd1iSDK.equals();
        throw null;
    }

    private final boolean getMediationNetwork(AFh1dSDK aFh1dSDK) {
        int n3;
        int n4 = 1;
        int n7 = 0;
        int n8 = hashCode + 111;
        copy = n3 = n8 % 128;
        String string2 = "af_send_exc_to_server_window";
        int n10 = 1274433157;
        int n14 = -1274433155;
        long l2 = -1;
        if ((n8 %= 2) != 0) {
            long l3 = System.currentTimeMillis();
            Object object = new Object[n4];
            object[0] = this;
            n8 = System.identityHashCode(this);
            long l4 = ((AFd1rSDK)AFd1iSDK.getRevenue(object, n14, n10, n8)).getMediationNetwork(string2, l2);
            long l7 = aFh1dSDK.AFAdRevenueData;
            object = TimeUnit.MILLISECONDS;
            long l8 = object.toSeconds(l3);
            long l12 = l7 - l8;
            n4 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
            if (n4 < 0) {
                return false;
            }
            n4 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1));
            if (n4 != 0) {
                copy = (hashCode + 93) % 128;
                n4 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
                if (n4 >= 0) {
                    return this.getCurrencyIso4217Code(aFh1dSDK);
                }
            }
            return false;
        }
        long l14 = System.currentTimeMillis();
        Object[] objectArray = new Object[n4];
        objectArray[0] = this;
        n7 = System.identityHashCode(this);
        ((AFd1rSDK)AFd1iSDK.getRevenue(objectArray, n14, n10, n7)).getMediationNetwork(string2, l2);
        long cfr_ignored_1 = aFh1dSDK.AFAdRevenueData;
        TimeUnit.MILLISECONDS.toSeconds(l14);
        throw null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] object) {
        int n3;
        object = (AFd1iSDK)object[0];
        int n4 = hashCode + 107;
        copy = n3 = n4 % 128;
        object = (AFf1aSDK)object.getMonetizationNetwork.getValue();
        if ((n4 %= 2) == 0) {
            n4 = 73 / 0;
        }
        copy = (hashCode + 119) % 128;
        return object;
    }

    private final Map getMonetizationNetwork(AFh1dSDK object) {
        int n3 = 1;
        Object object2 = "";
        int c2 = TextUtils.indexOf((CharSequence)object2, (CharSequence)object2);
        char c3 = (char)(35385 - c2);
        int n4 = ImageFormat.getBitsPerPixel((int)0) + -609003129;
        Object object3 = new Object[n3];
        Object object4 = object3;
        AFd1iSDK.a(c3, "\u86fe\ub359\u39db\uef8a", "\u88d8\ua07e\ubfaf\uffe4\ub3b2", "\u0000\u0000\u0000\u0000", n4, (Object[])object3);
        object3 = ((String)object3[0]).intern();
        object2 = Build.BRAND;
        Pair pair = new Pair(object3, object2);
        object3 = Build.MODEL;
        object2 = new Pair("model", object3);
        object3 = this.AFAdRevenueData().getMonetizationNetwork.AFAdRevenueData.getPackageName();
        Pair pair2 = new Pair("app_id", object3);
        object3 = new AFb1aSDK();
        object3 = ((AFb1aSDK)object3).getMediationNetwork();
        Pair pair3 = new Pair("p_ex", object3);
        object3 = String.valueOf(Build.VERSION.SDK_INT);
        Pair pair4 = new Pair("api", object3);
        object3 = this.areAllFieldsValid;
        object4 = new Pair("sdk", object3);
        object3 = this.AFAdRevenueData();
        Object object5 = ((AFd1qSDK)object3).getMonetizationNetwork;
        object3 = ((AFd1qSDK)object3).getRevenue;
        object3 = AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)object5, (AFd1rSDK)object3);
        object5 = new Pair("uid", object3);
        object = ((AFh1dSDK)object).getRevenue();
        object3 = new Pair("exc_config", object);
        object = new Pair[8];
        object[0] = pair;
        object[n3] = object2;
        object[2] = pair2;
        object[3] = pair3;
        object[4] = pair4;
        object[5] = object4;
        object[6] = object5;
        object[7] = object3;
        object = fh1_2.i((Pair[])object);
        hashCode = (copy + 85) % 128;
        return object;
    }

    private static final void getMonetizationNetwork(AFd1iSDK aFd1iSDK) {
        int n3;
        int n4 = hashCode + 87;
        copy = n3 = n4 % 128;
        String string2 = "";
        if ((n4 %= 2) != 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, string2);
            aFd1iSDK.copy();
            return;
        }
        Intrinsics.checkNotNullParameter(aFd1iSDK, string2);
        aFd1iSDK.copy();
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] object) {
        int n3;
        object = (AFd1iSDK)object[0];
        int n4 = copy + 73;
        hashCode = n3 = n4 % 128;
        object = object.AFAdRevenueData;
        if ((n4 %= 2) != 0) {
            n4 = 25 / 0;
        }
        return object;
    }

    public static Object getRevenue(Object[] object, int n3, int n4, int n7) {
        int n8 = 2;
        int n10 = 1;
        int n14 = n3 * -589;
        int n15 = n4 * 591 + n14;
        n14 = ~n4;
        int n16 = ~n7;
        int n17 = ~(n14 | n16);
        n14 = ~(n14 | n3) | n17;
        n17 = ~(n16 | n3);
        n14 |= n17;
        n17 = (n3 ^= 0xFFFFFFFF) | n4;
        n7 = (~(n7 | n17) | n14) * 590 + n15;
        n14 = n14 * -1180 + n7;
        n3 = ~(n3 | n16);
        if ((n3 = (n3 | (n4 = ~(n4 | n16))) * 590 + n14) != n10) {
            if (n3 != n8) {
                n4 = 3;
                object = n3 != n4 ? (n3 != (n4 = 4) ? AFd1iSDK.getRevenue(object) : AFd1iSDK.getMonetizationNetwork(object)) : AFd1iSDK.AFAdRevenueData(object);
            } else {
                object = (AFd1iSDK)object[0];
                hashCode = (copy + 85) % 128;
                object = (AFd1rSDK)object.getRevenue.getValue();
                copy = n3 = (hashCode + 23) % 128;
            }
        } else {
            Object object2 = (Map)object[0];
            object = (List)object[n10];
            copy = n4 = (hashCode + 89) % 128;
            Pair pair = new Pair("deviceInfo", object2);
            object = AFe1xSDK.getMonetizationNetwork((List)object);
            String string2 = "excs";
            object2 = new Pair(string2, object);
            object = new Pair[n8];
            object[0] = pair;
            object[n10] = object2;
            object = fh1_2.i(object);
            hashCode = n3 = (copy + 35) % 128;
        }
        return object;
    }

    private static Map getRevenue(Map map2, List list) {
        Object[] objectArray = new Object[]{map2, list};
        int n3 = (int)System.currentTimeMillis();
        return (Map)AFd1iSDK.getRevenue(objectArray, 563165298, -563165297, n3);
    }

    private final void getRevenue(AFh1dSDK object) {
        copy = (hashCode + 115) % 128;
        int n3 = ((AFh1dSDK)object).getMediationNetwork;
        int n4 = ((AFh1dSDK)object).getMonetizationNetwork;
        long l2 = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        long l3 = n4;
        long l4 = timeUnit.toMillis(l3) + l2;
        object = new Object[]{this};
        int n7 = System.identityHashCode(this);
        object = (AFd1rSDK)AFd1iSDK.getRevenue((Object[])object, -1274433155, 1274433157, n7);
        object.getMonetizationNetwork("af_send_exc_to_server_window", l4);
        object.AFAdRevenueData("af_send_exc_min", n3);
        copy = (hashCode + 65) % 128;
    }

    public final void getCurrencyIso4217Code() {
        int n3;
        int n4 = copy + 15;
        hashCode = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            ExecutorService executorService = this.areAllFieldsValid();
            i i3 = new i(this);
            executorService.execute(i3);
            n4 = 44 / 0;
        } else {
            ExecutorService executorService = this.areAllFieldsValid();
            i i8 = new i(this);
            executorService.execute(i8);
        }
    }

    public final void getCurrencyIso4217Code(AFd1eSDK$AFa1vSDK object) {
        int n3;
        int n4 = hashCode + 105;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            this.component1 = object;
            object = this.areAllFieldsValid();
            g_0 g_02 = new g_0(this);
            object.execute(g_02);
            return;
        }
        this.component1 = object;
        object = this.areAllFieldsValid();
        g_0 g_03 = new g_0(this);
        object.execute(g_03);
        throw null;
    }

    public final void getMonetizationNetwork() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        AFd1iSDK.getRevenue(objectArray, -1727873549, 1727873552, n3);
    }

    public final AFd1hSDK getRevenue() {
        copy = (hashCode + 121) % 128;
        AFd1hSDK aFd1hSDK = (AFd1hSDK)this.component2.getValue();
        copy = (hashCode + 37) % 128;
        return aFd1hSDK;
    }

    public final void getRevenue(Throwable throwable, String string2) {
        int n3;
        int n4;
        copy = n4 = (hashCode + 97) % 128;
        Object object = "";
        Intrinsics.checkNotNullParameter(throwable, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = this.areAllFieldsValid();
        int n7 = 1;
        sf0_1 sf0_12 = new sf0_1(this, n7, throwable, string2);
        object.execute(sf0_12);
        int n8 = copy + 95;
        hashCode = n3 = n8 % 128;
        if ((n8 %= 2) != 0) {
            n8 = 78 / 0;
        }
    }
}

