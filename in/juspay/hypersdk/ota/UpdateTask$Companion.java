/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.URLUtil
 */
package in.juspay.hypersdk.ota;

import android.webkit.URLUtil;
import in.juspay.hyper.core.ExecutorManager;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class UpdateTask$Companion {
    private UpdateTask$Companion() {
    }

    public /* synthetic */ UpdateTask$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ Future access$doAsync(UpdateTask$Companion updateTask$Companion, Callable callable) {
        return updateTask$Companion.doAsync(callable);
    }

    public static final /* synthetic */ List access$setDifference(UpdateTask$Companion updateTask$Companion, List list, List list2) {
        return updateTask$Companion.setDifference(list, list2);
    }

    private final Future doAsync(Callable callable) {
        return ExecutorManager.doAsync(callable);
    }

    private final List setDifference(List collection, List collection2) {
        collection = CollectionsKt.o0(collection);
        collection2 = CollectionsKt.o0(collection2);
        return CollectionsKt.k0(q03_0.g((Set)collection, (Set)collection2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void closeQuietly(Closeable closeable) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(closeable, string2);
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final String fileName(URL object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = URLUtil.guessFileName((String)((URL)object).toString(), null, null);
        Intrinsics.checkNotNullExpressionValue(object, "guessFileName(this.toString(), null, null)");
        return object;
    }

    public final String utf8(InputStream closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        Object object = Charsets.UTF_8;
        InputStreamReader inputStreamReader = new InputStreamReader((InputStream)closeable, (Charset)object);
        int n3 = 8192;
        closeable = new BufferedReader(inputStreamReader, n3);
        try {
            object = vm3_0.b((Reader)closeable);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b(closeable, throwable);
                throw throwable2;
            }
        }
        xj3_1.b(closeable, null);
        return object;
    }
}

