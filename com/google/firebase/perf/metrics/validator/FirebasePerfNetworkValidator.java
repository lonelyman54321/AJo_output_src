/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.util.URLAllowlist;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod;
import java.net.URI;

final class FirebasePerfNetworkValidator
extends PerfMetricValidator {
    private static final int EMPTY_PORT = 255;
    private static final String HTTPS = "https";
    private static final String HTTP_SCHEMA = "http";
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Context appContext;
    private final NetworkRequestMetric networkMetric;

    public FirebasePerfNetworkValidator(NetworkRequestMetric networkRequestMetric, Context context) {
        this.appContext = context;
        this.networkMetric = networkRequestMetric;
    }

    private URI getResultUrl(String string2) {
        String string3;
        if (string2 == null) {
            return null;
        }
        try {
            return URI.create(string2);
        }
        catch (IllegalStateException illegalStateException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        AndroidLogger androidLogger = logger;
        string3 = ((Throwable)((Object)string3)).getMessage();
        Object[] objectArray = new Object[]{string3};
        androidLogger.warn("getResultUrl throws exception %s", objectArray);
        return null;
    }

    private boolean isAllowlisted(URI uRI, Context context) {
        if (uRI == null) {
            return false;
        }
        return URLAllowlist.isURLAllowlisted(uRI, context);
    }

    private boolean isBlank(String string2) {
        if (string2 == null) {
            return true;
        }
        return string2.trim().isEmpty();
    }

    private boolean isEmptyUrl(String string2) {
        return this.isBlank(string2);
    }

    private boolean isValidHost(String string2) {
        int n3;
        int n4;
        if (string2 != null && (n4 = this.isBlank(string2)) == 0 && (n3 = string2.length()) <= (n4 = 255)) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        return n3 != 0;
    }

    private boolean isValidHttpResponseCode(int n3) {
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    private boolean isValidPayload(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    private boolean isValidPort(int n3) {
        int n4 = -1;
        n3 = n3 != n4 && n3 <= 0 ? 0 : 1;
        return n3 != 0;
    }

    private boolean isValidScheme(String string2) {
        boolean bl2;
        boolean bl3 = false;
        if (string2 == null) {
            return false;
        }
        String string3 = HTTP_SCHEMA;
        boolean bl4 = string3.equalsIgnoreCase(string2);
        if (bl4 || (bl2 = (string3 = HTTPS).equalsIgnoreCase(string2))) {
            bl3 = true;
        }
        return bl3;
    }

    private boolean isValidTime(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    private boolean isValidUserInfo(String string2) {
        boolean bl2;
        if (string2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public boolean isValidHttpMethod(NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod) {
        boolean bl2;
        NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod2;
        if (networkRequestMetric$HttpMethod != null && networkRequestMetric$HttpMethod != (networkRequestMetric$HttpMethod2 = NetworkRequestMetric$HttpMethod.HTTP_METHOD_UNKNOWN)) {
            bl2 = true;
        } else {
            bl2 = false;
            networkRequestMetric$HttpMethod = null;
        }
        return bl2;
    }

    public boolean isValidPerfMetric() {
        long l2;
        long l3;
        long l4;
        Object object = this.networkMetric.getUrl();
        int n3 = this.isEmptyUrl((String)object);
        if (n3 != 0) {
            object = logger;
            CharSequence charSequence = new StringBuilder("URL is missing:");
            String string2 = this.networkMetric.getUrl();
            charSequence.append(string2);
            charSequence = charSequence.toString();
            ((AndroidLogger)object).warn((String)charSequence);
            return false;
        }
        object = this.networkMetric.getUrl();
        if ((object = this.getResultUrl((String)object)) == null) {
            logger.warn("URL cannot be parsed");
            return false;
        }
        Object object2 = this.appContext;
        boolean bl2 = this.isAllowlisted((URI)object, (Context)object2);
        if (!bl2) {
            object2 = logger;
            StringBuilder stringBuilder = new StringBuilder("URL fails allowlist rule: ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            ((AndroidLogger)object2).warn((String)object);
            return false;
        }
        object2 = ((URI)object).getHost();
        bl2 = this.isValidHost((String)object2);
        if (!bl2) {
            logger.warn("URL host is null or invalid");
            return false;
        }
        object2 = ((URI)object).getScheme();
        bl2 = this.isValidScheme((String)object2);
        if (!bl2) {
            logger.warn("URL scheme is null or invalid");
            return false;
        }
        object2 = ((URI)object).getUserInfo();
        bl2 = this.isValidUserInfo((String)object2);
        if (!bl2) {
            logger.warn("URL user info is null");
            return false;
        }
        n3 = ((URI)object).getPort();
        if ((n3 = (int)(this.isValidPort(n3) ? 1 : 0)) == 0) {
            logger.warn("URL port is less than or equal to 0");
            return false;
        }
        object = this.networkMetric;
        n3 = (int)(((NetworkRequestMetric)object).hasHttpMethod() ? 1 : 0);
        if (n3 != 0) {
            object = this.networkMetric.getHttpMethod();
        } else {
            n3 = 0;
            object = null;
        }
        n3 = (int)(this.isValidHttpMethod((NetworkRequestMetric$HttpMethod)object) ? 1 : 0);
        if (n3 == 0) {
            object = logger;
            object2 = new StringBuilder("HTTP Method is null or invalid: ");
            NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod = this.networkMetric.getHttpMethod();
            ((StringBuilder)object2).append(networkRequestMetric$HttpMethod);
            object2 = ((StringBuilder)object2).toString();
            ((AndroidLogger)object).warn((String)object2);
            return false;
        }
        object = this.networkMetric;
        n3 = (int)(((NetworkRequestMetric)object).hasHttpResponseCode() ? 1 : 0);
        if (n3 != 0) {
            object = this.networkMetric;
            n3 = ((NetworkRequestMetric)object).getHttpResponseCode();
            if ((n3 = (int)(this.isValidHttpResponseCode(n3) ? 1 : 0)) == 0) {
                object = logger;
                object2 = new StringBuilder("HTTP ResponseCode is a negative value:");
                int n4 = this.networkMetric.getHttpResponseCode();
                ((StringBuilder)object2).append(n4);
                object2 = ((StringBuilder)object2).toString();
                ((AndroidLogger)object).warn((String)object2);
                return false;
            }
        }
        if ((n3 = (int)(((NetworkRequestMetric)(object = this.networkMetric)).hasRequestPayloadBytes() ? 1 : 0)) != 0 && (n3 = (int)(this.isValidPayload(l4 = ((NetworkRequestMetric)(object = this.networkMetric)).getRequestPayloadBytes()) ? 1 : 0)) == 0) {
            object = logger;
            object2 = new StringBuilder("Request Payload is a negative value:");
            long l7 = this.networkMetric.getRequestPayloadBytes();
            ((StringBuilder)object2).append(l7);
            object2 = ((StringBuilder)object2).toString();
            ((AndroidLogger)object).warn((String)object2);
            return false;
        }
        object = this.networkMetric;
        n3 = (int)(((NetworkRequestMetric)object).hasResponsePayloadBytes() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(this.isValidPayload(l4 = ((NetworkRequestMetric)(object = this.networkMetric)).getResponsePayloadBytes()) ? 1 : 0)) == 0) {
            object = logger;
            object2 = new StringBuilder("Response Payload is a negative value:");
            long l8 = this.networkMetric.getResponsePayloadBytes();
            ((StringBuilder)object2).append(l8);
            object2 = ((StringBuilder)object2).toString();
            ((AndroidLogger)object).warn((String)object2);
            return false;
        }
        object = this.networkMetric;
        n3 = (int)(((NetworkRequestMetric)object).hasClientStartTimeUs() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)((l3 = (l4 = ((NetworkRequestMetric)(object = this.networkMetric)).getClientStartTimeUs()) - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) > 0) {
            long l12;
            object = this.networkMetric;
            n3 = (int)(((NetworkRequestMetric)object).hasTimeToRequestCompletedUs() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(this.isValidTime(l4 = ((NetworkRequestMetric)(object = this.networkMetric)).getTimeToRequestCompletedUs()) ? 1 : 0)) == 0) {
                object = logger;
                object2 = new StringBuilder("Time to complete the request is a negative value:");
                long l14 = this.networkMetric.getTimeToRequestCompletedUs();
                ((StringBuilder)object2).append(l14);
                object2 = ((StringBuilder)object2).toString();
                ((AndroidLogger)object).warn((String)object2);
                return false;
            }
            object = this.networkMetric;
            n3 = (int)(((NetworkRequestMetric)object).hasTimeToResponseInitiatedUs() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(this.isValidTime(l4 = ((NetworkRequestMetric)(object = this.networkMetric)).getTimeToResponseInitiatedUs()) ? 1 : 0)) == 0) {
                object = logger;
                object2 = new StringBuilder("Time from the start of the request to the start of the response is null or a negative value:");
                long l15 = this.networkMetric.getTimeToResponseInitiatedUs();
                ((StringBuilder)object2).append(l15);
                object2 = ((StringBuilder)object2).toString();
                ((AndroidLogger)object).warn((String)object2);
                return false;
            }
            object = this.networkMetric;
            n3 = (int)(((NetworkRequestMetric)object).hasTimeToResponseCompletedUs() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)((l12 = (l4 = ((NetworkRequestMetric)(object = this.networkMetric)).getTimeToResponseCompletedUs()) - l2) == 0L ? 0 : (l12 < 0L ? -1 : 1))) > 0) {
                object = this.networkMetric;
                n3 = (int)(((NetworkRequestMetric)object).hasHttpResponseCode() ? 1 : 0);
                if (n3 == 0) {
                    logger.warn("Did not receive a HTTP Response Code");
                    return false;
                }
                return true;
            }
            object = logger;
            object2 = new StringBuilder("Time from the start of the request to the end of the response is null, negative or zero:");
            long l16 = this.networkMetric.getTimeToResponseCompletedUs();
            ((StringBuilder)object2).append(l16);
            object2 = ((StringBuilder)object2).toString();
            ((AndroidLogger)object).warn((String)object2);
            return false;
        }
        object = logger;
        object2 = new StringBuilder("Start time of the request is null, or zero, or a negative value:");
        long l17 = this.networkMetric.getClientStartTimeUs();
        ((StringBuilder)object2).append(l17);
        object2 = ((StringBuilder)object2).toString();
        ((AndroidLogger)object).warn((String)object2);
        return false;
    }
}

