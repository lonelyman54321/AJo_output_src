/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.InstrURLConnectionBase;
import com.google.firebase.perf.util.Timer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

public final class InstrHttpURLConnection
extends HttpURLConnection {
    private final InstrURLConnectionBase delegate;

    public InstrHttpURLConnection(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        Object object = httpURLConnection.getURL();
        super((URL)object);
        this.delegate = object = new InstrURLConnectionBase(httpURLConnection, timer, networkRequestMetricBuilder);
    }

    public void addRequestProperty(String string2, String string3) {
        this.delegate.addRequestProperty(string2, string3);
    }

    public void connect() {
        this.delegate.connect();
    }

    public void disconnect() {
        this.delegate.disconnect();
    }

    public boolean equals(Object object) {
        return this.delegate.equals(object);
    }

    public boolean getAllowUserInteraction() {
        return this.delegate.getAllowUserInteraction();
    }

    public int getConnectTimeout() {
        return this.delegate.getConnectTimeout();
    }

    public Object getContent() {
        return this.delegate.getContent();
    }

    public Object getContent(Class[] classArray) {
        return this.delegate.getContent(classArray);
    }

    public String getContentEncoding() {
        return this.delegate.getContentEncoding();
    }

    public int getContentLength() {
        return this.delegate.getContentLength();
    }

    public long getContentLengthLong() {
        return this.delegate.getContentLengthLong();
    }

    public String getContentType() {
        return this.delegate.getContentType();
    }

    public long getDate() {
        return this.delegate.getDate();
    }

    public boolean getDefaultUseCaches() {
        return this.delegate.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.delegate.getDoInput();
    }

    public boolean getDoOutput() {
        return this.delegate.getDoOutput();
    }

    public InputStream getErrorStream() {
        return this.delegate.getErrorStream();
    }

    public long getExpiration() {
        return this.delegate.getExpiration();
    }

    public String getHeaderField(int n3) {
        return this.delegate.getHeaderField(n3);
    }

    public String getHeaderField(String string2) {
        return this.delegate.getHeaderField(string2);
    }

    public long getHeaderFieldDate(String string2, long l2) {
        return this.delegate.getHeaderFieldDate(string2, l2);
    }

    public int getHeaderFieldInt(String string2, int n3) {
        return this.delegate.getHeaderFieldInt(string2, n3);
    }

    public String getHeaderFieldKey(int n3) {
        return this.delegate.getHeaderFieldKey(n3);
    }

    public long getHeaderFieldLong(String string2, long l2) {
        return this.delegate.getHeaderFieldLong(string2, l2);
    }

    public Map getHeaderFields() {
        return this.delegate.getHeaderFields();
    }

    public long getIfModifiedSince() {
        return this.delegate.getIfModifiedSince();
    }

    public InputStream getInputStream() {
        return this.delegate.getInputStream();
    }

    public boolean getInstanceFollowRedirects() {
        return this.delegate.getInstanceFollowRedirects();
    }

    public long getLastModified() {
        return this.delegate.getLastModified();
    }

    public OutputStream getOutputStream() {
        return this.delegate.getOutputStream();
    }

    public Permission getPermission() {
        return this.delegate.getPermission();
    }

    public int getReadTimeout() {
        return this.delegate.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.delegate.getRequestMethod();
    }

    public Map getRequestProperties() {
        return this.delegate.getRequestProperties();
    }

    public String getRequestProperty(String string2) {
        return this.delegate.getRequestProperty(string2);
    }

    public int getResponseCode() {
        return this.delegate.getResponseCode();
    }

    public String getResponseMessage() {
        return this.delegate.getResponseMessage();
    }

    public URL getURL() {
        return this.delegate.getURL();
    }

    public boolean getUseCaches() {
        return this.delegate.getUseCaches();
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public void setAllowUserInteraction(boolean bl2) {
        this.delegate.setAllowUserInteraction(bl2);
    }

    public void setChunkedStreamingMode(int n3) {
        this.delegate.setChunkedStreamingMode(n3);
    }

    public void setConnectTimeout(int n3) {
        this.delegate.setConnectTimeout(n3);
    }

    public void setDefaultUseCaches(boolean bl2) {
        this.delegate.setDefaultUseCaches(bl2);
    }

    public void setDoInput(boolean bl2) {
        this.delegate.setDoInput(bl2);
    }

    public void setDoOutput(boolean bl2) {
        this.delegate.setDoOutput(bl2);
    }

    public void setFixedLengthStreamingMode(int n3) {
        this.delegate.setFixedLengthStreamingMode(n3);
    }

    public void setFixedLengthStreamingMode(long l2) {
        this.delegate.setFixedLengthStreamingMode(l2);
    }

    public void setIfModifiedSince(long l2) {
        this.delegate.setIfModifiedSince(l2);
    }

    public void setInstanceFollowRedirects(boolean bl2) {
        this.delegate.setInstanceFollowRedirects(bl2);
    }

    public void setReadTimeout(int n3) {
        this.delegate.setReadTimeout(n3);
    }

    public void setRequestMethod(String string2) {
        this.delegate.setRequestMethod(string2);
    }

    public void setRequestProperty(String string2, String string3) {
        this.delegate.setRequestProperty(string2, string3);
    }

    public void setUseCaches(boolean bl2) {
        this.delegate.setUseCaches(bl2);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public boolean usingProxy() {
        return this.delegate.usingProxy();
    }
}

