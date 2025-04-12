/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.URLUtil
 */
package in.juspay.hypersdk.ota;

import android.webkit.URLUtil;
import in.juspay.hyper.core.ExecutorManager;
import java.io.Closeable;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class ApplicationManager$Companion {
    private ApplicationManager$Companion() {
    }

    public /* synthetic */ ApplicationManager$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ Future access$doAsync(ApplicationManager$Companion applicationManager$Companion, Callable callable) {
        return applicationManager$Companion.doAsync(callable);
    }

    public static final /* synthetic */ String access$sanitizeClientId(ApplicationManager$Companion applicationManager$Companion, String string2) {
        return applicationManager$Companion.sanitizeClientId(string2);
    }

    public static final /* synthetic */ List access$setDifference(ApplicationManager$Companion applicationManager$Companion, List list, List list2) {
        return applicationManager$Companion.setDifference(list, list2);
    }

    public static final /* synthetic */ String access$toUnzippedName(ApplicationManager$Companion applicationManager$Companion, String string2) {
        return applicationManager$Companion.toUnzippedName(string2);
    }

    private final Future doAsync(Callable callable) {
        return ExecutorManager.doAsync(callable);
    }

    private final String sanitizeClientId(String string2) {
        Object object = new char[]{'_'};
        string2 = (String)StringsKt.Z(string2, object).get(0);
        object = Locale.ROOT;
        string2 = string2.toLowerCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return string2;
    }

    private final List setDifference(List collection, List collection2) {
        collection = CollectionsKt.o0(collection);
        collection2 = CollectionsKt.o0(collection2);
        return CollectionsKt.k0(q03_0.g((Set)collection, (Set)collection2));
    }

    private final String toUnzippedName(String string2) {
        String string3 = ".zip";
        boolean bl2 = b.h(string2, string3, false);
        if (bl2) {
            String string4 = ".jsa";
            string2 = b.n(string2, string3, string4, false);
        }
        return string2;
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
}

