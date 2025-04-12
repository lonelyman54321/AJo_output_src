/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package in.juspay.hypersdk.services;

import android.content.Context;
import com.jio.jioads.adinterfaces.a;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Workspace$Companion {
    private Workspace$Companion() {
    }

    public /* synthetic */ Workspace$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ File access$mkCacheRoot(Workspace$Companion workspace$Companion, Context context, String string2) {
        return workspace$Companion.mkCacheRoot(context, string2);
    }

    public static final /* synthetic */ File access$mkRoot(Workspace$Companion workspace$Companion, Context context, String string2) {
        return workspace$Companion.mkRoot(context, string2);
    }

    private final File mkCacheRoot(Context object, String string2) {
        File file = new File((File)(object = object.getCacheDir()), string2);
        boolean bl2 = file.exists();
        if (!bl2) {
            file.mkdirs();
        }
        return file;
    }

    private final File mkRoot(Context object, String string2) {
        String string3 = "/";
        File file = null;
        int n3 = StringsKt.F(string2, string3, false);
        if (n3 != 0) {
            char c2 = '/';
            n3 = StringsKt.N(string2, c2, 0, false, 6);
            String string4 = string2.substring(0, n3);
            String string5 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
            Intrinsics.checkNotNullExpressionValue(string4, string5);
            object = object.getDir(string4, 0);
            string2 = string2.substring(++n3);
            string3 = "this as java.lang.String).substring(startIndex)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            file = new File((File)object, string2);
            boolean bl2 = file.exists();
            if (!bl2) {
                file.mkdirs();
            }
            return file;
        }
        object = object.getDir(string2, 0);
        Intrinsics.checkNotNullExpressionValue(object, "ctx.getDir(workspacePath, Context.MODE_PRIVATE)");
        return object;
    }

    public final String trimFileSeparator(String string2) {
        int n3 = -1;
        int n4 = 1;
        String string3 = "path";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n7 = 2;
        char[] cArray = new char[n7];
        cArray[0] = 32;
        cArray[1] = 47;
        String string4 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string4);
        String string5 = "chars";
        Intrinsics.checkNotNullParameter(cArray, string5);
        int n8 = string2.length() - n4;
        int n10 = 0;
        boolean bl2 = false;
        while (n10 <= n8) {
            int n14;
            int n15;
            block5: {
                n15 = !bl2 ? n10 : n8;
                n15 = string2.charAt(n15);
                Intrinsics.checkNotNullParameter(cArray, string4);
                Intrinsics.checkNotNullParameter(cArray, string4);
                for (n14 = 0; n14 < n7; n14 += n4) {
                    char c2 = cArray[n14];
                    if (n15 != c2) {
                        continue;
                    }
                    break block5;
                }
                n14 = -1;
            }
            n15 = n14 >= 0 ? 1 : 0;
            if (!bl2) {
                if (n15 == 0) {
                    bl2 = true;
                    continue;
                }
                n10 += n4;
                continue;
            }
            if (n15 == 0) break;
            n8 += n3;
        }
        return a.a(n8, n4, n10, string2);
    }
}

