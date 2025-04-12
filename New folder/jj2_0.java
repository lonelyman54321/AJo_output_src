/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JJ2
 */
public final class jj2_0 {
    public final Uri a;
    public final Map b;
    public final String c;

    public jj2_0(Uri uri, Map map2, String string2) {
        Intrinsics.checkNotNullParameter(uri, "url");
        Intrinsics.checkNotNullParameter(map2, "headers");
        this.a = uri;
        this.b = map2;
        this.c = string2;
    }
}

