/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.g;

/*
 * Renamed from On0
 */
public final class on0_2
extends bg2$d_0 {
    public final Long a;
    public final k70_0 b;
    public final /* synthetic */ Object c;

    public on0_2(db1_2 object, k70_0 k70_02, Object object2) {
        this.c = object2;
        object = ((db1_2)object).c;
        object2 = ja1_1.a;
        object2 = "Content-Length";
        object = ((xe3_2)object).e((String)object2);
        if (object != null) {
            long l2 = Long.parseLong((String)object);
            object = l2;
        } else {
            object = null;
        }
        this.a = object;
        if (k70_02 == null) {
            object = k70$a.a;
            k70_02 = k70$a.b;
        }
        this.b = k70_02;
    }

    public final Long a() {
        return this.a;
    }

    public final k70_0 b() {
        return this.b;
    }

    public final uf_1 e() {
        InputStream inputStream = (InputStream)this.c;
        g g3 = ir0_2.a;
        g3 = em0_2.b;
        Object object = xe_0.a;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(inputStream, (String)object2);
        Intrinsics.checkNotNullParameter(g3, "context");
        Intrinsics.checkNotNullParameter(object, "pool");
        Intrinsics.checkNotNullParameter(inputStream, (String)object2);
        object2 = new ci1_2(inputStream);
        object = new xe2_1((ci1_2)object2, g3);
        return object;
    }
}

