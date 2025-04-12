/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.firebase.perf.network;

import android.os.Build;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.InstrHttpInputStream;
import com.google.firebase.perf.network.InstrHttpOutputStream;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.util.Map;

class InstrURLConnectionBase {
    private static final String USER_AGENT_PROPERTY = "User-Agent";
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final HttpURLConnection httpUrlConnection;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private long timeRequestedInMicros;
    private long timeToResponseInitiatedInMicros;
    private final Timer timer;

    public InstrURLConnectionBase(HttpURLConnection object, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        long l2;
        this.timeRequestedInMicros = l2 = (long)-1;
        this.timeToResponseInitiatedInMicros = l2;
        this.httpUrlConnection = object;
        this.networkMetricBuilder = networkRequestMetricBuilder;
        this.timer = timer;
        object = ((URLConnection)object).getURL().toString();
        networkRequestMetricBuilder.setUrl((String)object);
    }

    private void updateRequestInfo() {
        Object object;
        long l2 = this.timeRequestedInMicros;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            this.timer.reset();
            object = this.timer;
            this.timeRequestedInMicros = l2 = ((Timer)object).getMicros();
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            networkRequestMetricBuilder.setRequestStartTimeMicros(l2);
        }
        if ((object = this.getRequestMethod()) != null) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            networkRequestMetricBuilder.setHttpMethod((String)object);
        } else {
            boolean bl2 = this.getDoOutput();
            if (bl2) {
                object = this.networkMetricBuilder;
                String string2 = "POST";
                ((NetworkRequestMetricBuilder)object).setHttpMethod(string2);
            } else {
                object = this.networkMetricBuilder;
                String string3 = "GET";
                ((NetworkRequestMetricBuilder)object).setHttpMethod(string3);
            }
        }
    }

    public void addRequestProperty(String string2, String string3) {
        this.httpUrlConnection.addRequestProperty(string2, string3);
    }

    public void connect() {
        Object object;
        long l2 = this.timeRequestedInMicros;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            this.timer.reset();
            object = this.timer;
            this.timeRequestedInMicros = l2 = ((Timer)object).getMicros();
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            networkRequestMetricBuilder.setRequestStartTimeMicros(l2);
        }
        try {
            object = this.httpUrlConnection;
        }
        catch (IOException iOException) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            l3 = this.timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l3);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        ((URLConnection)object).connect();
    }

    public void disconnect() {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l2 = this.timer.getDurationMicros();
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l2);
        this.networkMetricBuilder.build();
        this.httpUrlConnection.disconnect();
    }

    public boolean equals(Object object) {
        return this.httpUrlConnection.equals(object);
    }

    public boolean getAllowUserInteraction() {
        return this.httpUrlConnection.getAllowUserInteraction();
    }

    public int getConnectTimeout() {
        return this.httpUrlConnection.getConnectTimeout();
    }

    public Object getContent() {
        this.updateRequestInfo();
        Object object = this.networkMetricBuilder;
        Object object2 = this.httpUrlConnection;
        int n3 = ((HttpURLConnection)object2).getResponseCode();
        ((NetworkRequestMetricBuilder)object).setHttpResponseCode(n3);
        try {
            object = this.httpUrlConnection;
        }
        catch (IOException iOException) {
            object2 = this.networkMetricBuilder;
            long l2 = this.timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)object2).setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        object = ((URLConnection)object).getContent();
        n3 = object instanceof InputStream;
        if (n3 != 0) {
            object2 = this.networkMetricBuilder;
            Object object3 = this.httpUrlConnection.getContentType();
            ((NetworkRequestMetricBuilder)object2).setResponseContentType((String)object3);
            object = (InputStream)object;
            object3 = this.networkMetricBuilder;
            Timer timer = this.timer;
            object = object2 = new InstrHttpInputStream((InputStream)object, (NetworkRequestMetricBuilder)object3, timer);
        } else {
            object2 = this.networkMetricBuilder;
            Object object4 = this.httpUrlConnection.getContentType();
            ((NetworkRequestMetricBuilder)object2).setResponseContentType((String)object4);
            object2 = this.networkMetricBuilder;
            int n4 = this.httpUrlConnection.getContentLength();
            long l3 = n4;
            ((NetworkRequestMetricBuilder)object2).setResponsePayloadBytes(l3);
            object2 = this.networkMetricBuilder;
            object4 = this.timer;
            l3 = ((Timer)object4).getDurationMicros();
            ((NetworkRequestMetricBuilder)object2).setTimeToResponseCompletedMicros(l3);
            object2 = this.networkMetricBuilder;
            ((NetworkRequestMetricBuilder)object2).build();
        }
        return object;
    }

    public Object getContent(Class[] object) {
        this.updateRequestInfo();
        Object object2 = this.networkMetricBuilder;
        Object object3 = this.httpUrlConnection;
        int n3 = ((HttpURLConnection)object3).getResponseCode();
        ((NetworkRequestMetricBuilder)object2).setHttpResponseCode(n3);
        try {
            object2 = this.httpUrlConnection;
        }
        catch (IOException iOException) {
            object2 = this.networkMetricBuilder;
            long l2 = this.timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)object2).setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        object = ((URLConnection)object2).getContent((Class<?>[])object);
        boolean bl2 = object instanceof InputStream;
        if (bl2) {
            object2 = this.networkMetricBuilder;
            object3 = this.httpUrlConnection.getContentType();
            ((NetworkRequestMetricBuilder)object2).setResponseContentType((String)object3);
            object = (InputStream)object;
            object3 = this.networkMetricBuilder;
            Timer timer = this.timer;
            object2 = new InstrHttpInputStream((InputStream)object, (NetworkRequestMetricBuilder)object3, timer);
            object = object2;
        } else {
            object2 = this.networkMetricBuilder;
            object3 = this.httpUrlConnection.getContentType();
            ((NetworkRequestMetricBuilder)object2).setResponseContentType((String)object3);
            object2 = this.networkMetricBuilder;
            n3 = this.httpUrlConnection.getContentLength();
            long l3 = n3;
            ((NetworkRequestMetricBuilder)object2).setResponsePayloadBytes(l3);
            object2 = this.networkMetricBuilder;
            object3 = this.timer;
            l3 = ((Timer)object3).getDurationMicros();
            ((NetworkRequestMetricBuilder)object2).setTimeToResponseCompletedMicros(l3);
            object2 = this.networkMetricBuilder;
            ((NetworkRequestMetricBuilder)object2).build();
        }
        return object;
    }

    public String getContentEncoding() {
        this.updateRequestInfo();
        return this.httpUrlConnection.getContentEncoding();
    }

    public int getContentLength() {
        this.updateRequestInfo();
        return this.httpUrlConnection.getContentLength();
    }

    public long getContentLengthLong() {
        long l2;
        this.updateRequestInfo();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            HttpURLConnection httpURLConnection = this.httpUrlConnection;
            l2 = bi1_0.a(httpURLConnection);
        } else {
            l2 = 0L;
        }
        return l2;
    }

    public String getContentType() {
        this.updateRequestInfo();
        return this.httpUrlConnection.getContentType();
    }

    public long getDate() {
        this.updateRequestInfo();
        return this.httpUrlConnection.getDate();
    }

    public boolean getDefaultUseCaches() {
        return this.httpUrlConnection.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.httpUrlConnection.getDoInput();
    }

    public boolean getDoOutput() {
        return this.httpUrlConnection.getDoOutput();
    }

    public InputStream getErrorStream() {
        this.updateRequestInfo();
        Object object = this.networkMetricBuilder;
        Object object2 = this.httpUrlConnection;
        int n3 = ((HttpURLConnection)object2).getResponseCode();
        try {
            ((NetworkRequestMetricBuilder)object).setHttpResponseCode(n3);
        }
        catch (IOException iOException) {
            object = logger;
            object2 = "IOException thrown trying to obtain the response code";
            ((AndroidLogger)object).debug((String)object2);
        }
        object = this.httpUrlConnection.getErrorStream();
        if (object != null) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            Timer timer = this.timer;
            object2 = new InstrHttpInputStream((InputStream)object, networkRequestMetricBuilder, timer);
            return object2;
        }
        return object;
    }

    public long getExpiration() {
        this.updateRequestInfo();
        return this.httpUrlConnection.getExpiration();
    }

    public String getHeaderField(int n3) {
        this.updateRequestInfo();
        return this.httpUrlConnection.getHeaderField(n3);
    }

    public String getHeaderField(String string2) {
        this.updateRequestInfo();
        return this.httpUrlConnection.getHeaderField(string2);
    }

    public long getHeaderFieldDate(String string2, long l2) {
        this.updateRequestInfo();
        return this.httpUrlConnection.getHeaderFieldDate(string2, l2);
    }

    public int getHeaderFieldInt(String string2, int n3) {
        this.updateRequestInfo();
        return this.httpUrlConnection.getHeaderFieldInt(string2, n3);
    }

    public String getHeaderFieldKey(int n3) {
        this.updateRequestInfo();
        return this.httpUrlConnection.getHeaderFieldKey(n3);
    }

    public long getHeaderFieldLong(String string2, long l2) {
        long l3;
        this.updateRequestInfo();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            HttpURLConnection httpURLConnection = this.httpUrlConnection;
            l3 = ci1_0.a(httpURLConnection, string2, l2);
        } else {
            l3 = 0L;
        }
        return l3;
    }

    public Map getHeaderFields() {
        this.updateRequestInfo();
        return this.httpUrlConnection.getHeaderFields();
    }

    public long getIfModifiedSince() {
        return this.httpUrlConnection.getIfModifiedSince();
    }

    public InputStream getInputStream() {
        IOException iOException2;
        Object object;
        block8: {
            Object object2;
            block7: {
                this.updateRequestInfo();
                object2 = this.networkMetricBuilder;
                int n3 = this.httpUrlConnection.getResponseCode();
                ((NetworkRequestMetricBuilder)object2).setHttpResponseCode(n3);
                object2 = this.networkMetricBuilder;
                object = this.httpUrlConnection.getContentType();
                ((NetworkRequestMetricBuilder)object2).setResponseContentType((String)object);
                try {
                    object2 = this.httpUrlConnection;
                }
                catch (IOException iOException2) {}
                object2 = ((URLConnection)object2).getInputStream();
                if (object2 == null) break block7;
                NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
                Timer timer = this.timer;
                object = new InstrHttpInputStream((InputStream)object2, networkRequestMetricBuilder, timer);
                return object;
                break block8;
            }
            return object2;
        }
        object = this.networkMetricBuilder;
        long l2 = this.timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)object).setTimeToResponseCompletedMicros(l2);
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        throw iOException2;
    }

    public boolean getInstanceFollowRedirects() {
        return this.httpUrlConnection.getInstanceFollowRedirects();
    }

    public long getLastModified() {
        this.updateRequestInfo();
        return this.httpUrlConnection.getLastModified();
    }

    public OutputStream getOutputStream() {
        Object object;
        IOException iOException2;
        block8: {
            Object object2;
            block7: {
                try {
                    object2 = this.httpUrlConnection;
                }
                catch (IOException iOException2) {}
                object2 = ((URLConnection)object2).getOutputStream();
                if (object2 == null) break block7;
                NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
                Timer timer = this.timer;
                object = new InstrHttpOutputStream((OutputStream)object2, networkRequestMetricBuilder, timer);
                return object;
                break block8;
            }
            return object2;
        }
        object = this.networkMetricBuilder;
        long l2 = this.timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)object).setTimeToResponseCompletedMicros(l2);
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        throw iOException2;
    }

    public Permission getPermission() {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = this.httpUrlConnection;
        }
        catch (IOException iOException) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            long l2 = this.timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        return httpURLConnection.getPermission();
    }

    public int getReadTimeout() {
        return this.httpUrlConnection.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.httpUrlConnection.getRequestMethod();
    }

    public Map getRequestProperties() {
        return this.httpUrlConnection.getRequestProperties();
    }

    public String getRequestProperty(String string2) {
        return this.httpUrlConnection.getRequestProperty(string2);
    }

    public int getResponseCode() {
        NetworkRequestMetricBuilder networkRequestMetricBuilder;
        Object object;
        this.updateRequestInfo();
        long l2 = this.timeToResponseInitiatedInMicros;
        long l3 = -1;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            object = this.timer;
            this.timeToResponseInitiatedInMicros = l2 = ((Timer)object).getDurationMicros();
            NetworkRequestMetricBuilder networkRequestMetricBuilder2 = this.networkMetricBuilder;
            networkRequestMetricBuilder2.setTimeToResponseInitiatedMicros(l2);
        }
        try {
            object = this.httpUrlConnection;
        }
        catch (IOException iOException) {
            networkRequestMetricBuilder = this.networkMetricBuilder;
            l3 = this.timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l3);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        int n3 = ((HttpURLConnection)object).getResponseCode();
        networkRequestMetricBuilder = this.networkMetricBuilder;
        networkRequestMetricBuilder.setHttpResponseCode(n3);
        return n3;
    }

    public String getResponseMessage() {
        NetworkRequestMetricBuilder networkRequestMetricBuilder;
        Object object;
        Object object2;
        this.updateRequestInfo();
        long l2 = this.timeToResponseInitiatedInMicros;
        long l3 = -1;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            object2 = this.timer;
            this.timeToResponseInitiatedInMicros = l2 = ((Timer)object2).getDurationMicros();
            object = this.networkMetricBuilder;
            ((NetworkRequestMetricBuilder)object).setTimeToResponseInitiatedMicros(l2);
        }
        try {
            object2 = this.httpUrlConnection;
        }
        catch (IOException iOException) {
            networkRequestMetricBuilder = this.networkMetricBuilder;
            l3 = this.timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l3);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        object2 = ((HttpURLConnection)object2).getResponseMessage();
        networkRequestMetricBuilder = this.networkMetricBuilder;
        object = this.httpUrlConnection;
        int n3 = ((HttpURLConnection)object).getResponseCode();
        networkRequestMetricBuilder.setHttpResponseCode(n3);
        return object2;
    }

    public URL getURL() {
        return this.httpUrlConnection.getURL();
    }

    public boolean getUseCaches() {
        return this.httpUrlConnection.getUseCaches();
    }

    public int hashCode() {
        return this.httpUrlConnection.hashCode();
    }

    public void setAllowUserInteraction(boolean bl2) {
        this.httpUrlConnection.setAllowUserInteraction(bl2);
    }

    public void setChunkedStreamingMode(int n3) {
        this.httpUrlConnection.setChunkedStreamingMode(n3);
    }

    public void setConnectTimeout(int n3) {
        this.httpUrlConnection.setConnectTimeout(n3);
    }

    public void setDefaultUseCaches(boolean bl2) {
        this.httpUrlConnection.setDefaultUseCaches(bl2);
    }

    public void setDoInput(boolean bl2) {
        this.httpUrlConnection.setDoInput(bl2);
    }

    public void setDoOutput(boolean bl2) {
        this.httpUrlConnection.setDoOutput(bl2);
    }

    public void setFixedLengthStreamingMode(int n3) {
        this.httpUrlConnection.setFixedLengthStreamingMode(n3);
    }

    public void setFixedLengthStreamingMode(long l2) {
        this.httpUrlConnection.setFixedLengthStreamingMode(l2);
    }

    public void setIfModifiedSince(long l2) {
        this.httpUrlConnection.setIfModifiedSince(l2);
    }

    public void setInstanceFollowRedirects(boolean bl2) {
        this.httpUrlConnection.setInstanceFollowRedirects(bl2);
    }

    public void setReadTimeout(int n3) {
        this.httpUrlConnection.setReadTimeout(n3);
    }

    public void setRequestMethod(String string2) {
        this.httpUrlConnection.setRequestMethod(string2);
    }

    public void setRequestProperty(String string2, String string3) {
        Object object = USER_AGENT_PROPERTY;
        boolean bl2 = ((String)object).equalsIgnoreCase(string2);
        if (bl2) {
            object = this.networkMetricBuilder;
            ((NetworkRequestMetricBuilder)object).setUserAgent(string3);
        }
        this.httpUrlConnection.setRequestProperty(string2, string3);
    }

    public void setUseCaches(boolean bl2) {
        this.httpUrlConnection.setUseCaches(bl2);
    }

    public String toString() {
        return ((Object)this.httpUrlConnection).toString();
    }

    public boolean usingProxy() {
        return this.httpUrlConnection.usingProxy();
    }
}

