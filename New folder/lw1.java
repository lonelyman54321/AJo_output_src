/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 *  android.view.inputmethod.EditorInfo
 */
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class lw1 {
    public static final lw1 a;

    static {
        lw1 lw12;
        a = lw12 = new Object();
    }

    public final void a(EditorInfo editorInfo, iw1 localeList) {
        Collection collection = iw1.c;
        int n3 = Intrinsics.areEqual(localeList, collection);
        if (n3 != 0) {
            px_2.b(editorInfo);
        } else {
            int n4 = yx_2.o((Iterable)localeList, 10);
            collection = new ArrayList(n4);
            localeList = localeList.a.iterator();
            while ((n4 = (int)(localeList.hasNext() ? 1 : 0)) != 0) {
                Locale locale = ((hw1)localeList.next()).a;
                ((ArrayList)collection).add(locale);
            }
            localeList = new LocaleList[]{};
            localeList = ((ArrayList)collection).toArray((T[])localeList);
            n3 = ((Locale[])localeList).length;
            localeList = ox_1.b(Arrays.copyOf(localeList, n3));
            ix_1.b(editorInfo, localeList);
        }
    }
}

