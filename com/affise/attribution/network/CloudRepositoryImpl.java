/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.exceptions.CloudException;
import com.affise.attribution.exceptions.NetworkException;
import com.affise.attribution.network.CloudRepository;
import com.affise.attribution.network.CloudRepositoryImpl$Companion;
import com.affise.attribution.network.HttpClient;
import com.affise.attribution.network.HttpClient$DefaultImpls;
import com.affise.attribution.network.HttpClient$Method;
import com.affise.attribution.network.HttpResponse;
import com.affise.attribution.parameters.base.PropertyProvider;
import com.affise.attribution.parameters.providers.UserAgentProvider;
import com.affise.attribution.utils.HttpUtilsKt;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class CloudRepositoryImpl
implements CloudRepository {
    private static final int ATTEMPTS_TO_SEND = 3;
    public static final CloudRepositoryImpl$Companion Companion;
    private final Converter converter;
    private final HttpClient httpClient;
    private final UserAgentProvider userAgentProvider;

    static {
        CloudRepositoryImpl$Companion cloudRepositoryImpl$Companion;
        Companion = cloudRepositoryImpl$Companion = new CloudRepositoryImpl$Companion(null);
    }

    public CloudRepositoryImpl(HttpClient httpClient2, UserAgentProvider userAgentProvider2, Converter converter) {
        Intrinsics.checkNotNullParameter(httpClient2, "httpClient");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.httpClient = httpClient2;
        this.userAgentProvider = userAgentProvider2;
        this.converter = converter;
    }

    private final Map createHeaders() {
        Object object = this.userAgentProvider;
        if (object == null || (object = (String)((PropertyProvider)object).provideWithDefault()) == null) {
            object = "";
        }
        Pair pair = new Pair("User-Agent", object);
        object = new Pair("Content-Type", "application/json; charset=utf-8");
        Pair[] pairArray = new Pair[]{pair, object};
        return fh1_2.i(pairArray);
    }

    public HttpResponse createRequest(String object, List list) {
        Intrinsics.checkNotNullParameter(object, "url");
        Intrinsics.checkNotNullParameter(list, "data");
        HttpClient httpClient2 = this.httpClient;
        URL uRL = new URL((String)object);
        HttpClient$Method httpClient$Method = HttpClient$Method.POST;
        Object object2 = object = this.converter.convert(list);
        object2 = (String)object;
        Map map2 = this.createHeaders();
        return HttpClient$DefaultImpls.executeRequest$default(httpClient2, uRL, httpClient$Method, (String)object2, map2, false, 16, null);
    }

    public void send(List object, String string2) {
        Intrinsics.checkNotNullParameter(object, "data");
        String string3 = "url";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = 3;
        boolean bl2 = false;
        NetworkException networkException = null;
        int n4 = 3;
        while (n4 != 0 && !bl2) {
            Object object2 = this.createRequest(string2, (List)object);
            boolean bl3 = HttpUtilsKt.isHttpValid((HttpResponse)object2);
            boolean bl4 = true;
            if (bl3) {
                bl2 = true;
                continue;
            }
            if ((n4 += -1) != 0) continue;
            n4 = ((HttpResponse)object2).getCode();
            if ((object2 = ((HttpResponse)object2).getBody()) == null) {
                object2 = "";
            }
            networkException = new NetworkException(n4, (String)object2);
            object = new CloudException(string2, (Throwable)networkException, n3, bl4);
            throw object;
        }
    }
}

