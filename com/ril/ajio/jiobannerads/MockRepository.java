/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.jiobannerads;

import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.jiobannerads.MockRepository$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class MockRepository {
    public static final int $stable;
    public static final MockRepository$Companion Companion;
    private static final MockRepository instance;

    static {
        Object object = new MockRepository$Companion(null);
        Companion = object;
        instance = object = new MockRepository();
    }

    private MockRepository() {
    }

    public static final /* synthetic */ MockRepository access$getInstance$cp() {
        return instance;
    }

    public final Object getData(Class clazz, String string2) {
        Intrinsics.checkNotNullParameter(string2, "fileName");
        MockRepository$Companion mockRepository$Companion = Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        string2 = MockRepository$Companion.access$loadJSONFromAsset(mockRepository$Companion, (Context)aJIOApplication, string2);
        return Z90.a(clazz, string2);
    }
}

