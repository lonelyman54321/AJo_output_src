/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$1;
import com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$HttpMethodVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class NetworkRequestMetric$HttpMethod
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ NetworkRequestMetric$HttpMethod[] $VALUES;
    public static final /* enum */ NetworkRequestMetric$HttpMethod CONNECT;
    public static final int CONNECT_VALUE = 9;
    public static final /* enum */ NetworkRequestMetric$HttpMethod DELETE;
    public static final int DELETE_VALUE = 4;
    public static final /* enum */ NetworkRequestMetric$HttpMethod GET;
    public static final int GET_VALUE = 1;
    public static final /* enum */ NetworkRequestMetric$HttpMethod HEAD;
    public static final int HEAD_VALUE = 5;
    public static final /* enum */ NetworkRequestMetric$HttpMethod HTTP_METHOD_UNKNOWN;
    public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
    public static final /* enum */ NetworkRequestMetric$HttpMethod OPTIONS;
    public static final int OPTIONS_VALUE = 7;
    public static final /* enum */ NetworkRequestMetric$HttpMethod PATCH;
    public static final int PATCH_VALUE = 6;
    public static final /* enum */ NetworkRequestMetric$HttpMethod POST;
    public static final int POST_VALUE = 3;
    public static final /* enum */ NetworkRequestMetric$HttpMethod PUT;
    public static final int PUT_VALUE = 2;
    public static final /* enum */ NetworkRequestMetric$HttpMethod TRACE;
    public static final int TRACE_VALUE = 8;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    private static /* synthetic */ NetworkRequestMetric$HttpMethod[] $values() {
        NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod = HTTP_METHOD_UNKNOWN;
        networkRequestMetric$HttpMethod = GET;
        networkRequestMetric$HttpMethod = PUT;
        networkRequestMetric$HttpMethod = POST;
        networkRequestMetric$HttpMethod = DELETE;
        networkRequestMetric$HttpMethod = HEAD;
        networkRequestMetric$HttpMethod = PATCH;
        networkRequestMetric$HttpMethod = OPTIONS;
        networkRequestMetric$HttpMethod = TRACE;
        networkRequestMetric$HttpMethod = CONNECT;
        NetworkRequestMetric$HttpMethod[] networkRequestMetric$HttpMethodArray = new NetworkRequestMetric$HttpMethod[]{networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod, networkRequestMetric$HttpMethod};
        return networkRequestMetric$HttpMethodArray;
    }

    static {
        Object object = new NetworkRequestMetric$HttpMethod("HTTP_METHOD_UNKNOWN", 0, 0);
        HTTP_METHOD_UNKNOWN = object;
        int n3 = 1;
        object = new NetworkRequestMetric$HttpMethod("GET", n3, n3);
        GET = object;
        n3 = 2;
        object = new NetworkRequestMetric$HttpMethod("PUT", n3, n3);
        PUT = object;
        n3 = 3;
        object = new NetworkRequestMetric$HttpMethod("POST", n3, n3);
        POST = object;
        n3 = 4;
        object = new NetworkRequestMetric$HttpMethod("DELETE", n3, n3);
        DELETE = object;
        n3 = 5;
        object = new NetworkRequestMetric$HttpMethod("HEAD", n3, n3);
        HEAD = object;
        n3 = 6;
        object = new NetworkRequestMetric$HttpMethod("PATCH", n3, n3);
        PATCH = object;
        n3 = 7;
        object = new NetworkRequestMetric$HttpMethod("OPTIONS", n3, n3);
        OPTIONS = object;
        n3 = 8;
        object = new NetworkRequestMetric$HttpMethod("TRACE", n3, n3);
        TRACE = object;
        n3 = 9;
        object = new NetworkRequestMetric$HttpMethod("CONNECT", n3, n3);
        CONNECT = object;
        $VALUES = NetworkRequestMetric$HttpMethod.$values();
        internalValueMap = object = new NetworkRequestMetric$HttpMethod$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NetworkRequestMetric$HttpMethod() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static NetworkRequestMetric$HttpMethod forNumber(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 9: {
                return CONNECT;
            }
            case 8: {
                return TRACE;
            }
            case 7: {
                return OPTIONS;
            }
            case 6: {
                return PATCH;
            }
            case 5: {
                return HEAD;
            }
            case 4: {
                return DELETE;
            }
            case 3: {
                return POST;
            }
            case 2: {
                return PUT;
            }
            case 1: {
                return GET;
            }
            case 0: 
        }
        return HTTP_METHOD_UNKNOWN;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return NetworkRequestMetric$HttpMethod$HttpMethodVerifier.INSTANCE;
    }

    public static NetworkRequestMetric$HttpMethod valueOf(int n3) {
        return NetworkRequestMetric$HttpMethod.forNumber(n3);
    }

    public static NetworkRequestMetric$HttpMethod valueOf(String string2) {
        return Enum.valueOf(NetworkRequestMetric$HttpMethod.class, string2);
    }

    public static NetworkRequestMetric$HttpMethod[] values() {
        return (NetworkRequestMetric$HttpMethod[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

