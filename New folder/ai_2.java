/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.c;

/*
 * Renamed from ai
 */
public final class ai_2 {
    public static final CopyOnWriteArraySet a;
    public static final Map b;

    static {
        Serializable serializable = new CopyOnWriteArraySet();
        a = serializable;
        serializable = new LinkedHashMap();
        Class<x72_0> clazz = x72_0.class;
        Object object = clazz.getPackage();
        object = object != null ? ((Package)object).getName() : null;
        if (object != null) {
            String string2 = "OkHttp";
            serializable.put(object, string2);
        }
        clazz = clazz.getName();
        Intrinsics.checkNotNullExpressionValue(clazz, "OkHttpClient::class.java.name");
        serializable.put(clazz, "okhttp.OkHttpClient");
        clazz = f91_0.class.getName();
        Intrinsics.checkNotNullExpressionValue(clazz, "Http2::class.java.name");
        serializable.put(clazz, "okhttp.Http2");
        clazz = c.class.getName();
        Intrinsics.checkNotNullExpressionValue(clazz, "TaskRunner::class.java.name");
        serializable.put(clazz, "okhttp.TaskRunner");
        serializable.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = fh1_2.o((Map)((Object)serializable));
    }
}

