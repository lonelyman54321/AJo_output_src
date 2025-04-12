/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.GraphRequest$b;
import com.facebook.b$d;
import com.facebook.f;
import kotlin.jvm.internal.Intrinsics;

public final class C1
implements GraphRequest$b {
    public final /* synthetic */ b$d a;

    public /* synthetic */ C1(b$d b$d) {
        this.a = b$d;
    }

    public final void b(f object) {
        b$d b$d = this.a;
        Intrinsics.checkNotNullParameter(b$d, "$refreshResult");
        Object object2 = "response";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((f)object).d;
        if (object != null) {
            int n3;
            object2 = object.optString("access_token");
            b$d.a = object2;
            b$d.b = n3 = object.optInt("expires_at");
            b$d.c = n3 = object.optInt("expires_in");
            long l2 = object.optLong("data_access_expiration_time");
            b$d.d = object2 = Long.valueOf(l2);
            object2 = "graph_domain";
            b$d.e = object = object.optString((String)object2, null);
        }
    }
}

