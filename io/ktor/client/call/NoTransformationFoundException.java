/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.call;

import kotlin.jvm.internal.Intrinsics;

public final class NoTransformationFoundException
extends UnsupportedOperationException {
    public final String a;

    public NoTransformationFoundException(jb1_2 object, yn1_2 object2, yn1_2 object3) {
        Intrinsics.checkNotNullParameter(object, "response");
        Intrinsics.checkNotNullParameter(object2, "from");
        Intrinsics.checkNotNullParameter(object3, "to");
        StringBuilder stringBuilder = new StringBuilder("\n        Expected response body of the type '");
        stringBuilder.append(object3);
        stringBuilder.append("' but was '");
        stringBuilder.append(object2);
        stringBuilder.append("'\n        In response from `");
        object2 = mb1_1.b((jb1_2)object).getUrl();
        stringBuilder.append(object2);
        stringBuilder.append("`\n        Response status `");
        object2 = ((jb1_2)object).e();
        stringBuilder.append(object2);
        stringBuilder.append("`\n        Response header `ContentType: ");
        object2 = object.getHeaders();
        object3 = ja1_1.a;
        object2 = object2.get("Content-Type");
        stringBuilder.append((String)object2);
        stringBuilder.append("` \n        Request header `Accept: ");
        object = mb1_1.b((jb1_2)object).getHeaders().get("Accept");
        stringBuilder.append((String)object);
        stringBuilder.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.a = object = ee3_2.b(stringBuilder.toString());
    }

    public final String getMessage() {
        return this.a;
    }
}

