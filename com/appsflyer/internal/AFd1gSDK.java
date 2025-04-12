/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1uSDK;
import com.appsflyer.internal.AFe1xSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public abstract class AFd1gSDK {
    public int AFAdRevenueData;
    public Map getCurrencyIso4217Code;
    public byte[] getMediationNetwork;
    private final boolean getRevenue;

    public AFd1gSDK(byte[] byArray, Map map2, int n3) {
        Intrinsics.checkNotNullParameter(byArray, "");
        this.getMediationNetwork = byArray;
        this.getCurrencyIso4217Code = map2;
        this.AFAdRevenueData = n3;
        this.getRevenue = true;
    }

    private final boolean AFAdRevenueData(HttpURLConnection httpURLConnection, long l2) {
        boolean bl2;
        httpURLConnection.setRequestMethod("POST");
        Object object = httpURLConnection.getRequestMethod();
        Object object2 = httpURLConnection.getURL();
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(":");
        ((StringBuilder)object3).append(object2);
        object = ((StringBuilder)object3).toString();
        Object object4 = new StringBuilder((String)object);
        ((StringBuilder)object4).append("\n length: ");
        object2 = this.getMediationNetwork;
        object3 = Charsets.UTF_8;
        object = new String((byte[])object2, (Charset)object3);
        int n3 = ((String)object).length();
        ((StringBuilder)object4).append(n3);
        object = this.getCurrencyIso4217Code;
        if (object != null) {
            object = object.entrySet().iterator();
            while (bl2 = object.hasNext()) {
                object2 = object.next();
                ((StringBuilder)object4).append("\n ");
                object3 = (String)object2.getKey();
                ((StringBuilder)object4).append((String)object3);
                object3 = ": ";
                ((StringBuilder)object4).append((String)object3);
                object2 = (String)object2.getValue();
                ((StringBuilder)object4).append((String)object2);
            }
        }
        n3 = httpURLConnection.hashCode();
        object3 = "HTTP: [";
        object2 = new StringBuilder((String)object3);
        ((StringBuilder)object2).append(n3);
        object = "] ";
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(object4);
        object4 = ((StringBuilder)object2).toString();
        object4 = this.getMonetizationNetwork((String)object4);
        bl2 = this.getMediationNetwork();
        if (bl2) {
            AFLogger.afRDLog((String)object4);
        } else {
            AFLogger.afVerboseLog((String)object4);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        int n4 = this.AFAdRevenueData;
        httpURLConnection.setReadTimeout(n4);
        n4 = this.AFAdRevenueData;
        httpURLConnection.setConnectTimeout(n4);
        object4 = this.getCurrencyIso4217Code().getMediationNetwork;
        object2 = "Content-Type";
        httpURLConnection.addRequestProperty((String)object2, (String)object4);
        object4 = this.getCurrencyIso4217Code;
        if (object4 != null) {
            object4 = object4.entrySet().iterator();
            while (bl2 = object4.hasNext()) {
                object2 = object4.next();
                String string2 = (String)object2.getKey();
                object2 = (String)object2.getValue();
                httpURLConnection.addRequestProperty(string2, (String)object2);
            }
        }
        httpURLConnection.setDoOutput(true);
        n4 = this.getMediationNetwork.length;
        object4 = String.valueOf(n4);
        httpURLConnection.setRequestProperty("Content-Length", (String)object4);
        object4 = httpURLConnection.getOutputStream();
        object2 = "";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
        bl2 = object4 instanceof BufferedOutputStream;
        if (bl2) {
            object4 = (BufferedOutputStream)object4;
        } else {
            int n7 = 8192;
            object4 = object2 = new BufferedOutputStream((OutputStream)object4, n7);
        }
        object2 = this.getMediationNetwork;
        ((OutputStream)object4).write((byte[])object2);
        ((OutputStream)object4).close();
        object4 = AFd1gSDK.getRevenue(httpURLConnection);
        long l3 = System.currentTimeMillis() - l2;
        int n8 = httpURLConnection.getResponseCode();
        String string3 = httpURLConnection.getResponseMessage();
        object2 = "response code:";
        String string4 = " ";
        String string5 = "\n\tbody:";
        CharSequence charSequence = Fh3.a(n8, (String)object2, string4, string3, string5);
        charSequence.append((String)object4);
        charSequence.append("\n\ttook ");
        charSequence.append(l3);
        string3 = "ms";
        charSequence.append(string3);
        charSequence = charSequence.toString();
        int n10 = httpURLConnection.hashCode();
        object4 = new StringBuilder((String)object3);
        ((StringBuilder)object4).append(n10);
        ((StringBuilder)object4).append((String)object);
        ((StringBuilder)object4).append((String)charSequence);
        charSequence = ((StringBuilder)object4).toString();
        charSequence = this.getMonetizationNetwork((String)charSequence);
        n10 = (int)(this.getMediationNetwork() ? 1 : 0);
        if (n10 != 0) {
            AFLogger.afRDLog((String)charSequence);
        } else {
            AFLogger.afVerboseLog((String)charSequence);
        }
        return AFe1xSDK.getCurrencyIso4217Code(httpURLConnection);
    }

    private static String getRevenue(HttpURLConnection object) {
        int n3;
        String string2;
        Object object2;
        Object object3;
        Object object4 = "";
        try {
            object = ((URLConnection)object).getInputStream();
        }
        catch (Throwable throwable) {
            object3 = AFLogger.INSTANCE;
            object2 = AFh1vSDK.component2;
            string2 = throwable.getMessage();
            if (string2 == null) {
                string2 = object4;
            }
            n3 = 0;
            int n4 = 96;
            AFh1uSDK.e$default((AFh1uSDK)object3, object2, string2, throwable, false, false, false, false, n4, null);
            object = ((HttpURLConnection)object).getErrorStream();
        }
        if (object != null) {
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            object3 = Charsets.UTF_8;
            object2 = new InputStreamReader((InputStream)object, (Charset)object3);
            int n7 = 8192;
            object = new BufferedReader((Reader)object2, n7);
            Intrinsics.checkNotNullParameter(object, "<this>");
            object2 = new ArrayList();
            object3 = new um3_0((ArrayList)object2);
            vm3_0.a((BufferedReader)object, (Function1)object3);
            string2 = null;
            Object var2_3 = null;
            n3 = 63;
            object3 = CollectionsKt.R((Iterable)object2, null, null, null, null, n3);
            ((Reader)object).close();
            if (object3 != null) {
                object4 = object3;
            }
        }
        return object4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean AFAdRevenueData() {
        Throwable throwable4;
        Object object;
        block12: {
            int n3;
            String string2;
            long l2;
            long l3;
            String string3;
            String string4;
            block11: {
                Object object2;
                String string5 = "";
                string4 = "HTTP: [";
                string3 = "error: ";
                l3 = System.currentTimeMillis();
                object = null;
                try {
                    object2 = this.getRevenue();
                    Intrinsics.checkNotNullParameter(object2, string5);
                    URL uRL = new URL((String)object2);
                    object2 = uRL.openConnection();
                    Intrinsics.checkNotNull(object2, string5);
                    object2 = (HttpURLConnection)object2;
                }
                catch (Throwable throwable2) {
                    // empty catch block
                    break block11;
                }
                try {
                    boolean bl2 = this.AFAdRevenueData((HttpURLConnection)object2, l3);
                    if (object2 == null) return bl2;
                    ((HttpURLConnection)object2).disconnect();
                    return bl2;
                }
                catch (Throwable throwable3) {
                    object = object2;
                }
            }
            try {
                l2 = System.currentTimeMillis() - l3;
            }
            catch (Throwable throwable4) {
                break block12;
            }
            String string6 = ((Throwable)((Object)string2)).getMessage();
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append((Object)string2);
            string2 = "\n\ttook ";
            stringBuilder.append(string2);
            stringBuilder.append(l2);
            string2 = "ms\n\t";
            stringBuilder.append(string2);
            stringBuilder.append(string6);
            string2 = stringBuilder.toString();
            string3 = null;
            if (object != null) {
                n3 = object.hashCode();
            } else {
                n3 = 0;
                string6 = null;
            }
            stringBuilder = new StringBuilder(string4);
            stringBuilder.append(n3);
            string4 = "] ";
            stringBuilder.append(string4);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            string2 = this.getMonetizationNetwork(string2);
            boolean bl3 = this.getMediationNetwork();
            if (bl3) {
                AFLogger.afRDLog(string2);
            } else {
                AFLogger.afVerboseLog(string2);
            }
            if (object == null) return false;
            ((HttpURLConnection)object).disconnect();
            return false;
        }
        if (object == null) throw throwable4;
        ((HttpURLConnection)object).disconnect();
        throw throwable4;
    }

    public abstract AFe1uSDK getCurrencyIso4217Code();

    public boolean getMediationNetwork() {
        return this.getRevenue;
    }

    public abstract String getMonetizationNetwork(String var1);

    public abstract String getRevenue();
}

