/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.network;

import com.ril.ajio.kmm.shared.network.HttpClientProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AJioServiceLocator {
    public static final AJioServiceLocator INSTANCE;
    private static final da1_2 httpApiClient;

    static {
        Object object = new AJioServiceLocator();
        INSTANCE = object;
        object = HttpClientProvider.INSTANCE.getHttpClient();
        Object object2 = new Object();
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "block");
        la1_2 la1_22 = new la1_2();
        Object object3 = ((da1_2)object).b;
        la1_22.b((la1_2)object3);
        ((o0_0)object2).invoke(la1_22);
        object3 = ((da1_2)object).a;
        boolean bl2 = ((da1_2)object).c;
        httpApiClient = object2 = new da1_2((ma1_1)object3, la1_22, bl2);
    }

    private AJioServiceLocator() {
    }

    public static /* synthetic */ Unit a(la1_2 la1_22) {
        return AJioServiceLocator.httpApiClient$lambda$3(la1_22);
    }

    public static /* synthetic */ Unit b(a70_0 a70_02) {
        return AJioServiceLocator.httpApiClient$lambda$3$lambda$1(a70_02);
    }

    public static /* synthetic */ Unit c(ql1_2 ql1_22) {
        return AJioServiceLocator.httpApiClient$lambda$3$lambda$1$lambda$0(ql1_22);
    }

    public static /* synthetic */ Unit d(bx1_1 bx1_12) {
        return AJioServiceLocator.httpApiClient$lambda$3$lambda$2(bx1_12);
    }

    private static final Unit httpApiClient$lambda$3(la1_2 la1_22) {
        Intrinsics.checkNotNullParameter(la1_22, "$this$config");
        nv_2 nv_22 = e70_0.d;
        Function1 function1 = new q0(0);
        la1_22.a(nv_22, function1);
        nv_22 = fx1_1.c;
        function1 = new r0(0);
        la1_22.a(nv_22, function1);
        return Unit.a;
    }

    private static final Unit httpApiClient$lambda$3$lambda$1(a70_0 a70_02) {
        Intrinsics.checkNotNullParameter(a70_02, "$this$install");
        Object object = new p0(0);
        object = sm1_1.a((Function1)object);
        k70_0 k70_02 = k70$a.a;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(a70_02, (String)object2);
        Intrinsics.checkNotNullParameter(object, "json");
        String string2 = "contentType";
        Intrinsics.checkNotNullParameter(k70_02, string2);
        Intrinsics.checkNotNullParameter(a70_02, (String)object2);
        Intrinsics.checkNotNullParameter(k70_02, string2);
        Intrinsics.checkNotNullParameter(object, "format");
        object2 = new no1_2((ml1_2)object);
        object = new Object();
        a70_02.a(k70_02, (no1_2)object2, (Function1)object);
        return Unit.a;
    }

    private static final Unit httpApiClient$lambda$3$lambda$1$lambda$0(ql1_2 ql1_22) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(ql1_22, "$this$Json");
        ql1_22.c = bl2 = true;
        ql1_22.d = bl2;
        ql1_22.e = bl2;
        return Unit.a;
    }

    private static final Unit httpApiClient$lambda$3$lambda$2(bx1_1 bx1_12) {
        Intrinsics.checkNotNullParameter(bx1_12, "$this$install");
        Intrinsics.checkNotNullParameter(tx1$a_0.a, "<this>");
        Object object = new yx1_2();
        bx1_12.getClass();
        Intrinsics.checkNotNullParameter(object, "value");
        bx1_12.c = object;
        object = fw1_2.ALL;
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        bx1_12.e = object;
        return Unit.a;
    }

    public final da1_2 getHttpApiClient() {
        return httpApiClient;
    }
}

