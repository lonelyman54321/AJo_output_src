/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.network;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class HttpClientProvider {
    public static final HttpClientProvider INSTANCE;
    private static da1_2 ajioHttpClient;

    static {
        HttpClientProvider httpClientProvider;
        INSTANCE = httpClientProvider = new HttpClientProvider();
    }

    private HttpClientProvider() {
    }

    public static /* synthetic */ Unit a(x72_0 x72_02, b72_0 b72_02) {
        return HttpClientProvider.initializeHttpClient$lambda$1$lambda$0(x72_02, b72_02);
    }

    public static /* synthetic */ Unit b(x72_0 x72_02, la1_2 la1_22) {
        return HttpClientProvider.initializeHttpClient$lambda$1(x72_02, la1_22);
    }

    private static final Unit initializeHttpClient$lambda$1(x72_0 object, la1_2 la1_22) {
        Intrinsics.checkNotNullParameter(object, "$okHttpClient");
        Intrinsics.checkNotNullParameter(la1_22, "$this$HttpClient");
        ba1_1 ba1_12 = new ba1_1((x72_0)object);
        la1_22.getClass();
        Intrinsics.checkNotNullParameter(ba1_12, "block");
        object = la1_22.d;
        ia1_2 ia1_22 = new ia1_2((Function1)object, ba1_12);
        la1_22.d = ia1_22;
        return Unit.a;
    }

    private static final Unit initializeHttpClient$lambda$1$lambda$0(x72_0 x72_02, b72_0 b72_02) {
        Intrinsics.checkNotNullParameter(x72_02, "$okHttpClient");
        Intrinsics.checkNotNullParameter(b72_02, "$this$engine");
        b72_02.b = x72_02;
        return Unit.a;
    }

    public final da1_2 getHttpClient() {
        da1_2 da1_22 = ajioHttpClient;
        if (da1_22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioHttpClient");
            da1_22 = null;
        }
        return da1_22;
    }

    public final void initializeHttpClient(x72_0 object) {
        Intrinsics.checkNotNullParameter(object, "okHttpClient");
        Object object2 = u72_0.a;
        Object object3 = new vc_1(object, 1);
        Intrinsics.checkNotNullParameter(object2, "engineFactory");
        Intrinsics.checkNotNullParameter(object3, "block");
        object = new la1_2();
        ((vc_1)object3).invoke(object);
        object3 = ((la1_2)object).d;
        object2 = ((u72_0)object2).a((Function1)object3);
        object3 = new da1_2((ma1_1)object2, (la1_2)object, true);
        object = i$a.a;
        object = ((da1_2)object3).e.get((CoroutineContext$a)object);
        Intrinsics.checkNotNull(object);
        object = (i)object;
        ya1_2 ya1_22 = new ya1_2((ma1_1)object2);
        object.G(ya1_22);
        ajioHttpClient = object3;
    }
}

