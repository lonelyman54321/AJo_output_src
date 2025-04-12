/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 */
package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1bSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1sSDK;
import com.appsflyer.internal.AFg1vSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFg1xSDK;
import com.appsflyer.internal.AFg1ySDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1tSDK;
import com.appsflyer.internal.AFi1vSDK;
import com.appsflyer.internal.AFi1wSDK;
import com.appsflyer.internal.AFi1ySDK;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

public final class AFg1zSDK
extends AFe1eSDK {
    private final AFg1ySDK areAllFieldsValid;
    public AFi1ySDK component1;
    public final AFg1xSDK component2;
    public AFf1bSDK component3;
    private final AFd1qSDK component4;
    private final String copy;
    private final AFg1wSDK copydefault;
    private final AFg1sSDK equals;
    private final AFg1vSDK hashCode;
    private final AFe1qSDK toString;

    public AFg1zSDK(AFg1ySDK aFg1ySDK, AFd1qSDK aFd1qSDK, AFg1wSDK aFg1wSDK, AFg1vSDK aFg1vSDK, AFe1qSDK aFe1qSDK, AFg1sSDK aFg1sSDK, String string2, AFg1xSDK aFg1xSDK) {
        AFf1zSDK aFf1zSDK = AFf1zSDK.getRevenue;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{};
        super(aFf1zSDK, aFf1zSDKArray, "UpdateRemoteConfiguration");
        this.component3 = null;
        this.areAllFieldsValid = aFg1ySDK;
        this.component4 = aFd1qSDK;
        this.copydefault = aFg1wSDK;
        this.hashCode = aFg1vSDK;
        this.toString = aFe1qSDK;
        this.equals = aFg1sSDK;
        this.copy = string2;
        this.component2 = aFg1xSDK;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AFf1bSDK areAllFieldsValid() {
        IOException iOException2;
        Object object;
        int n3;
        int n4;
        Object object2;
        int n7;
        Object object3;
        Object object4;
        Object object5;
        long l2;
        Object object6;
        block13: {
            Throwable throwable2;
            block12: {
                AFh1vSDK aFh1vSDK;
                Object object7;
                block11: {
                    Object object8;
                    Object object9;
                    Object object10;
                    boolean bl2;
                    int n8;
                    Object object11;
                    block17: {
                        int n10;
                        block16: {
                            block14: {
                                block15: {
                                    object6 = this;
                                    object11 = " seconds";
                                    l2 = System.currentTimeMillis();
                                    object5 = this.copy;
                                    object4 = this.copydefault;
                                    n8 = 1;
                                    object3 = new Object[n8];
                                    n7 = 0;
                                    object2 = null;
                                    object3[0] = object4;
                                    bl2 = System.identityHashCode(object4);
                                    n4 = -1684451992;
                                    n3 = 1684451992;
                                    object4 = (String)AFg1wSDK.getCurrencyIso4217Code((Object[])object3, n4, n3, (int)(bl2 ? 1 : 0));
                                    object3 = "Dev key is not set, SDK is not started.";
                                    if (object4 == null || (n10 = ((String)(object = ((String)object4).trim())).length()) == 0) break block14;
                                    if (object5 != null) break block15;
                                    object5 = AFLogger.INSTANCE;
                                    object4 = AFh1vSDK.component1;
                                    object = "Can't create CDN token, domain or version is not provided.";
                                    ((AFh1uSDK)object5).w((AFh1vSDK)((Object)object4), (String)object);
                                    break block16;
                                }
                                object = this.component4.getMonetizationNetwork.AFAdRevenueData.getPackageName();
                                object7 = "appsflyersdk.com";
                                object5 = new String[]{object7, object5, object};
                                object = object5 = AFb1jSDK.getMonetizationNetwork(TextUtils.join((CharSequence)"\u2063", (Object[])object5), (String)object4);
                                break block17;
                            }
                            object5 = AFLogger.INSTANCE;
                            object4 = AFh1vSDK.component1;
                            ((AFh1uSDK)object5).w((AFh1vSDK)((Object)object4), (String)object3);
                        }
                        n10 = 0;
                        object = null;
                    }
                    if (object == null) {
                        object11 = AFLogger.INSTANCE;
                        object5 = AFh1vSDK.component1;
                        ((AFh1uSDK)object11).v((AFh1vSDK)((Object)object5), "can't create CDN token, skipping fetch config");
                        return AFf1bSDK.getMediationNetwork;
                    }
                    try {
                        object5 = ((AFg1zSDK)object6).equals;
                        int n14 = ((AFg1sSDK)object5).getRevenue();
                        if (n14 == 0) {
                            object11 = AFLogger.INSTANCE;
                            object5 = AFh1vSDK.component1;
                            object4 = "active config is valid, skipping fetch";
                            ((AFh1uSDK)object11).d((AFh1vSDK)((Object)object5), (String)object4);
                            return AFf1bSDK.getRevenue;
                        }
                        object7 = AFLogger.INSTANCE;
                        aFh1vSDK = AFh1vSDK.component1;
                        object5 = "Cached config is expired, updating...";
                        ((AFh1uSDK)object7).i(aFh1vSDK, (String)object5);
                        object5 = ((AFg1zSDK)object6).equals;
                        n14 = ((AFg1sSDK)object5).getCurrencyIso4217Code();
                        object4 = ((AFg1zSDK)object6).equals;
                        bl2 = ((AFg1sSDK)object4).getMediationNetwork();
                        object10 = ((AFg1zSDK)object6).toString;
                        int n15 = 1500;
                        object5 = ((AFe1qSDK)object10).getCurrencyIso4217Code(n14 != 0, bl2, (String)object, n15);
                        object9 = ((AFe1tSDK)object5).getMonetizationNetwork();
                        n14 = ((AFe1kSDK)object9).isSuccessful();
                        if (n14 == 0) {
                            AFe1kSDK aFe1kSDK = object9;
                            n7 = 0;
                            object2 = null;
                            n4 = 0;
                            Object var22_26 = null;
                            object5 = this;
                            object4 = object;
                            long l3 = l2;
                            AFe1kSDK aFe1kSDK2 = object9;
                            this.getRevenue((String)object, l2, null, null, (AFe1kSDK)object9);
                            object5 = "failed to fetch remote config from CDN with status code: ";
                            object11 = new StringBuilder((String)object5);
                            n14 = ((AFe1kSDK)object9).getStatusCode();
                            ((StringBuilder)object11).append(n14);
                            object11 = object11.toString();
                            ((AFh1uSDK)object7).w(aFh1vSDK, (String)object11);
                            return AFf1bSDK.getMediationNetwork;
                        }
                        object5 = ((AFe1kSDK)object9).getBody();
                        object5 = (AFi1vSDK)object5;
                        object4 = "x-amz-meta-af-auth-v1";
                        object4 = ((AFe1kSDK)object9).getRevenue((String)object4);
                        object10 = "CF-Cache-Status";
                        object10 = ((AFe1kSDK)object9).getRevenue((String)object10);
                        object8 = ((AFg1zSDK)object6).copydefault;
                        Object object12 = new Object[n8];
                        object12[0] = object8;
                        n7 = System.identityHashCode(object8);
                        n4 = -1684451992;
                        object12 = AFg1wSDK.getCurrencyIso4217Code((Object[])object12, n4, n3, n7);
                        if ((object12 = (String)object12) == null || (n7 = ((String)(object2 = ((String)object12).trim())).length()) == 0) break block11;
                        object3 = ((AFg1zSDK)object6).areAllFieldsValid;
                        n8 = (int)(((AFi1tSDK)(object4 = ((AFg1ySDK)object3).getMediationNetwork((AFi1vSDK)object5, (String)object4, (String)object, (String)object12))).AFAdRevenueData() ? 1 : 0);
                        if (n8 != 0) {
                            object12 = ((AFg1zSDK)object6).equals;
                            long l4 = ((AFg1sSDK)object12).AFAdRevenueData();
                            object8 = "using max-age fallback: ";
                            object2 = new StringBuilder((String)object8);
                            ((StringBuilder)object2).append(l4);
                            ((StringBuilder)object2).append((String)object11);
                            object2 = object2.toString();
                            ((AFh1uSDK)object7).v(aFh1vSDK, (String)object2);
                            long l7 = System.currentTimeMillis();
                            Object object13 = ((AFg1zSDK)object6).hashCode;
                            object6 = ((AFi1vSDK)object5).AFAdRevenueData;
                            AFe1kSDK aFe1kSDK = object9;
                            object9 = Charset.defaultCharset();
                            object6 = ((String)object6).getBytes((Charset)object9);
                            n15 = 2;
                            object6 = Base64.encodeToString((byte[])object6, (int)n15);
                            object9 = ((AFg1vSDK)object13).getMediationNetwork;
                            Object object14 = object10;
                            object10 = "af_remote_config";
                            object9.AFAdRevenueData((String)object10, (String)object6);
                            ((AFg1vSDK)object13).AFAdRevenueData = object6 = ((AFg1vSDK)object13).getRevenue;
                            object6 = ((AFg1vSDK)object13).getMediationNetwork;
                            object9 = "af_rc_timestamp";
                            object6.getMonetizationNetwork((String)object9, l7);
                            object6 = ((AFg1vSDK)object13).getMediationNetwork;
                            object9 = "af_rc_max_age";
                            object6.getMonetizationNetwork((String)object9, l4);
                            ((AFg1vSDK)object13).getRevenue = object5;
                            ((AFg1vSDK)object13).getCurrencyIso4217Code = l7;
                            ((AFg1vSDK)object13).getMonetizationNetwork = l4;
                            object2 = "Config successfully updated, timeToLive: ";
                            object5 = new StringBuilder((String)object2);
                            ((StringBuilder)object5).append(l4);
                            ((StringBuilder)object5).append((String)object11);
                            object11 = object5.toString();
                            ((AFh1uSDK)object7).d(aFh1vSDK, (String)object11);
                            object2 = ((AFi1tSDK)object4).getCurrencyIso4217Code;
                            object5 = this;
                            object4 = object;
                            l4 = l2;
                            object8 = object14;
                            object13 = aFe1kSDK;
                            this.getRevenue((String)object, l2, (AFi1wSDK)((Object)object2), (String)object14, aFe1kSDK);
                            return AFf1bSDK.getCurrencyIso4217Code;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                    catch (IOException iOException2) {
                        break block13;
                    }
                    AFe1kSDK aFe1kSDK = object9;
                    Object object15 = object10;
                    object2 = ((AFi1tSDK)object4).getCurrencyIso4217Code;
                    object5 = this;
                    object4 = object;
                    long l8 = l2;
                    object8 = object10;
                    AFe1kSDK aFe1kSDK3 = object9;
                    this.getRevenue((String)object, l2, (AFi1wSDK)((Object)object2), (String)object10, (AFe1kSDK)object9);
                    object11 = "fetched config is not valid (MITM?) refuse to use it.";
                    ((AFh1uSDK)object7).w(aFh1vSDK, (String)object11);
                    return AFf1bSDK.getMediationNetwork;
                }
                ((AFh1uSDK)object7).w(aFh1vSDK, (String)object3);
                return AFf1bSDK.getMediationNetwork;
            }
            object5 = AFLogger.INSTANCE;
            object4 = AFh1vSDK.component1;
            CharSequence charSequence = new StringBuilder("failed to update remote config: ");
            object3 = throwable2.getMessage();
            charSequence.append((String)object3);
            charSequence = ((Object)charSequence).toString();
            object3 = throwable2;
            ((AFh1uSDK)object5).e((AFh1vSDK)((Object)object4), (String)charSequence, throwable2, true, false, false);
            n3 = 0;
            Object var28_41 = null;
            object6 = null;
            n7 = 0;
            object2 = null;
            n4 = 0;
            Object var22_27 = null;
            object5 = this;
            object4 = object;
            long l12 = l2;
            this.getMonetizationNetwork((String)object, l2, null, null, null, null, throwable2);
            object5 = throwable2.getCause();
            boolean bl3 = object5 instanceof InterruptedException;
            if (!bl3) {
                return AFf1bSDK.getMediationNetwork;
            }
            throw (InterruptedException)throwable2.getCause();
        }
        object5 = AFLogger.INSTANCE;
        object4 = AFh1vSDK.component1;
        CharSequence charSequence = new StringBuilder("failed to fetch remote config: ");
        object3 = iOException2.getMessage();
        charSequence.append((String)object3);
        charSequence = ((Object)charSequence).toString();
        n4 = 0;
        Object var22_28 = null;
        n3 = 0;
        Object var28_42 = null;
        n7 = 1;
        object3 = iOException2;
        ((AFh1uSDK)object5).e((AFh1vSDK)((Object)object4), (String)charSequence, iOException2, n7 != 0, false, false);
        boolean bl4 = iOException2 instanceof ParsingException;
        if (bl4) {
            object5 = iOException2;
            object2 = object5 = ((ParsingException)iOException2).getRawResponse();
        } else {
            n7 = 0;
            object2 = null;
        }
        n3 = 0;
        var28_42 = null;
        object6 = null;
        n4 = 0;
        var22_28 = null;
        object5 = this;
        object4 = object;
        long l14 = l2;
        this.getMonetizationNetwork((String)object, l2, (AFe1kSDK)object2, null, null, null, iOException2);
        object5 = ((Throwable)iOException2).getCause();
        bl4 = object5 instanceof InterruptedIOException;
        if (!bl4) {
            return AFf1bSDK.getMediationNetwork;
        }
        throw (InterruptedIOException)((Throwable)iOException2).getCause();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void getMonetizationNetwork(String string2, long l2, AFe1kSDK aFe1kSDK, AFi1vSDK aFi1vSDK, AFi1wSDK aFi1wSDK, String string3, Throwable throwable) {
        long l3;
        Object object;
        int n3;
        int n4;
        long l4;
        Object object2 = aFe1kSDK;
        Object object3 = aFi1vSDK;
        Object object4 = throwable;
        if (aFe1kSDK != null) {
            AFe1nSDK aFe1nSDK = aFe1kSDK.AFAdRevenueData;
            l4 = aFe1nSDK.getRevenue;
            n3 = n4 = aFe1kSDK.getStatusCode();
        } else {
            l4 = 0L;
            n4 = 0;
            object2 = null;
            n3 = 0;
        }
        n4 = object4 instanceof HttpException;
        if (n4 != 0) {
            object2 = throwable.getCause();
            object4 = ((HttpException)object4).getMetrics();
            long l7 = ((AFe1nSDK)object4).getRevenue;
            object = object2;
            l3 = l7;
        } else {
            object = object4;
            l3 = l4;
        }
        if (object3 != null) {
            object2 = ((AFi1vSDK)object3).getMediationNetwork;
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object5 = object2;
        long l8 = System.currentTimeMillis() - l2;
        object2 = new AFi1ySDK((String)object5, string2, l3, l8, n3, aFi1wSDK, string3, (Throwable)object);
        object3 = this;
        this.component1 = object2;
    }

    private void getRevenue(String string2, long l2, AFi1wSDK aFi1wSDK, String string3, AFe1kSDK aFe1kSDK) {
        AFi1vSDK aFi1vSDK;
        Object object;
        if (aFe1kSDK != null) {
            object = (AFi1vSDK)aFe1kSDK.getBody();
            aFi1vSDK = object;
        } else {
            aFi1vSDK = null;
        }
        String string4 = string3 != null ? string3 : null;
        object = this;
        this.getMonetizationNetwork(string2, l2, aFe1kSDK, aFi1vSDK, aFi1wSDK, string4, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1cSDK AFAdRevenueData() {
        AFf1bSDK aFf1bSDK;
        try {
            AFf1bSDK aFf1bSDK2;
            this.component3 = aFf1bSDK2 = this.areAllFieldsValid();
            AFf1bSDK aFLogger = AFf1bSDK.getMediationNetwork;
            if (aFf1bSDK2 == aFLogger) {
                return AFe1cSDK.getMonetizationNetwork;
            }
            return AFe1cSDK.getRevenue;
        }
        catch (InterruptedIOException interruptedIOException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (SocketTimeoutException socketTimeoutException) {
            AFf1bSDK aFf1bSDK2;
            this.component3 = aFf1bSDK2 = AFf1bSDK.getMediationNetwork;
            return AFe1cSDK.getMediationNetwork;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.component1;
        aFLogger.e(aFh1vSDK, "RC update config failed", (Throwable)((Object)aFf1bSDK), false, false, false);
        this.component3 = aFf1bSDK = AFf1bSDK.getMediationNetwork;
        return AFe1cSDK.getMediationNetwork;
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final long getMonetizationNetwork() {
        return 1500L;
    }
}

