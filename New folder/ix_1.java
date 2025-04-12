/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 *  android.view.inputmethod.EditorInfo
 */
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 * Renamed from IX
 */
public final class ix_1 {
    public static /* bridge */ /* synthetic */ Stream a(Stream stream, Predicate predicate) {
        return stream.filter(predicate);
    }

    public static /* bridge */ /* synthetic */ void b(EditorInfo editorInfo, LocaleList localeList) {
        editorInfo.hintLocales = localeList;
    }
}

