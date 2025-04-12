/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;

/*
 * Renamed from Eb1
 */
public final class eb1_0
extends AA0 {
    public final void bind(bg3_0 bg3_02, Object object) {
        long l2;
        object = (HttpTransaction)object;
        long l3 = ((HttpTransaction)object).getId();
        int n3 = 1;
        bg3_02.m0(n3, l3);
        Object object2 = ((HttpTransaction)object).getRequestDate();
        int n4 = 2;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getRequestDate();
            l2 = (Long)object2;
            bg3_02.m0(n4, l2);
        }
        object2 = ((HttpTransaction)object).getResponseDate();
        n4 = 3;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseDate();
            l2 = (Long)object2;
            bg3_02.m0(n4, l2);
        }
        object2 = ((HttpTransaction)object).getTookMs();
        n4 = 4;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getTookMs();
            l2 = (Long)object2;
            bg3_02.m0(n4, l2);
        }
        object2 = ((HttpTransaction)object).getProtocol();
        n4 = 5;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getProtocol();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getMethod();
        n4 = 6;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getMethod();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getUrl();
        n4 = 7;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getUrl();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getHost();
        n4 = 8;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getHost();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getPath();
        n4 = 9;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getPath();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getScheme();
        n4 = 10;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getScheme();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getResponseTlsVersion();
        n4 = 11;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseTlsVersion();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getResponseCipherSuite();
        n4 = 12;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseCipherSuite();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getRequestPayloadSize();
        n4 = 13;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getRequestPayloadSize();
            l2 = (Long)object2;
            bg3_02.m0(n4, l2);
        }
        object2 = ((HttpTransaction)object).getRequestContentType();
        n4 = 14;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getRequestContentType();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getRequestHeaders();
        n4 = 15;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getRequestHeaders();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getRequestBody();
        n4 = 16;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getRequestBody();
            bg3_02.c0(n4, (String)object2);
        }
        int n7 = ((HttpTransaction)object).isRequestBodyPlainText();
        l2 = n7;
        bg3_02.m0(17, l2);
        object2 = ((HttpTransaction)object).getResponseCode();
        n4 = 18;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseCode();
            int n8 = (Integer)object2;
            l2 = n8;
            bg3_02.m0(n4, l2);
        }
        object2 = ((HttpTransaction)object).getResponseMessage();
        n4 = 19;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseMessage();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getError();
        n4 = 20;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getError();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getResponsePayloadSize();
        n4 = 21;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponsePayloadSize();
            l2 = (Long)object2;
            bg3_02.m0(n4, l2);
        }
        object2 = ((HttpTransaction)object).getResponseContentType();
        n4 = 22;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseContentType();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getResponseHeaders();
        n4 = 23;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseHeaders();
            bg3_02.c0(n4, (String)object2);
        }
        object2 = ((HttpTransaction)object).getResponseBody();
        n4 = 24;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseBody();
            bg3_02.c0(n4, (String)object2);
        }
        int n10 = ((HttpTransaction)object).isResponseBodyPlainText();
        l2 = n10;
        bg3_02.m0(25, l2);
        object2 = ((HttpTransaction)object).getResponseImageData();
        n4 = 26;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            object2 = ((HttpTransaction)object).getResponseImageData();
            bg3_02.q0(n4, (byte[])object2);
        }
        long l4 = ((HttpTransaction)object).getId();
        bg3_02.m0(27, l4);
    }

    public final String createQuery() {
        return "UPDATE OR REPLACE `transactions` SET `id` = ?,`requestDate` = ?,`responseDate` = ?,`tookMs` = ?,`protocol` = ?,`method` = ?,`url` = ?,`host` = ?,`path` = ?,`scheme` = ?,`responseTlsVersion` = ?,`responseCipherSuite` = ?,`requestPayloadSize` = ?,`requestContentType` = ?,`requestHeaders` = ?,`requestBody` = ?,`isRequestBodyPlainText` = ?,`responseCode` = ?,`responseMessage` = ?,`error` = ?,`responsePayloadSize` = ?,`responseContentType` = ?,`responseHeaders` = ?,`responseBody` = ?,`isResponseBodyPlainText` = ?,`responseImageData` = ? WHERE `id` = ?";
    }
}

