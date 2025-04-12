/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.jiobannerads;

import android.content.Context;
import com.ril.ajio.jiobannerads.MockRepository;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class MockRepository$Companion {
    private MockRepository$Companion() {
    }

    public /* synthetic */ MockRepository$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ String access$loadJSONFromAsset(MockRepository$Companion mockRepository$Companion, Context context, String string2) {
        return mockRepository$Companion.loadJSONFromAsset(context, string2);
    }

    private final String loadJSONFromAsset(Context object, String object2) {
        try {
            object = object.getAssets();
        }
        catch (IOException iOException) {
            return null;
        }
        object = object.open((String)object2);
        object2 = "open(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = ((InputStream)object).available();
        object2 = new byte[n3];
        ((InputStream)object).read((byte[])object2);
        ((InputStream)object).close();
        Object object3 = "UTF-8";
        object3 = Charset.forName((String)object3);
        String string2 = "forName(...)";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object = new String((byte[])object2, (Charset)object3);
        return object;
    }

    public final MockRepository getInstance() {
        return MockRepository.access$getInstance$cp();
    }
}

