/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.TextView
 */
import android.content.Context;
import android.widget.TextView;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zN0
 */
public final class zn0_1
implements LibraryVersionComponent$VersionExtractor {
    public static String a(Locale object, String string2, String string3, Locale locale, String string4) {
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = string3.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(object, string4);
        return object;
    }

    public static void b(Object[] object, int n3, String string2, String string3, TextView textView) {
        object = Arrays.copyOf(object, n3);
        object = String.format(string2, object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        textView.setText((CharSequence)object);
    }

    public String extract(Object object) {
        return FirebaseCommonRegistrar.c((Context)object);
    }
}

