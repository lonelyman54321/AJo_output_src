/*
 * Decompiled with CFR 0.152.
 */
package ai.haptik.android.wrapper.sdk.model;

import ai.haptik.android.wrapper.sdk.model.Response$a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Response {
    public static final Response$a Companion;
    private static final String NO_INTERNET = "Internet is not available";
    private static final String SDK_NOT_INITIALIZED = "Haptik SDK is not initialized";
    private final String message;
    private final boolean status;

    static {
        Response$a response$a;
        Companion = response$a = new Object();
    }

    public Response(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        this.status = bl2;
        this.message = string2;
    }

    public /* synthetic */ Response(boolean bl2, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            string2 = "";
        }
        this(bl2, string2);
    }

    public static final /* synthetic */ String access$getNO_INTERNET$cp() {
        return NO_INTERNET;
    }

    public static final /* synthetic */ String access$getSDK_NOT_INITIALIZED$cp() {
        return SDK_NOT_INITIALIZED;
    }

    public static /* synthetic */ Response copy$default(Response response, boolean bl2, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = response.status;
        }
        if ((n3 &= 2) != 0) {
            string2 = response.message;
        }
        return response.copy(bl2, string2);
    }

    public final boolean component1() {
        return this.status;
    }

    public final String component2() {
        return this.message;
    }

    public final Response copy(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Response response = new Response(bl2, string2);
        return response;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Response;
        if (!bl3) {
            return false;
        }
        object = (Response)object;
        bl3 = this.status;
        boolean bl4 = ((Response)object).status;
        if (bl3 != bl4) {
            return false;
        }
        String string2 = this.message;
        object = ((Response)object).message;
        boolean bl5 = Intrinsics.areEqual(string2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3 = (int)(this.status ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
        }
        return this.message.hashCode() + (n3 *= 31);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response(status=");
        boolean bl2 = this.status;
        stringBuilder.append(bl2);
        stringBuilder.append(", message=");
        String string2 = this.message;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

