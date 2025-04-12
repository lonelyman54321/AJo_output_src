/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 */
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class mw1 {
    public static final mw1 a;

    static {
        mw1 mw12;
        a = mw12 = new Object();
    }

    public final Object a(iw1 localeArray) {
        int n3 = yx_2.o((Iterable)localeArray, 10);
        ArrayList<Locale> arrayList = new ArrayList<Locale>(n3);
        localeArray = localeArray.iterator();
        while ((n3 = (int)(localeArray.hasNext() ? 1 : 0)) != 0) {
            Locale locale = ((hw1)localeArray.next()).a;
            arrayList.add(locale);
        }
        localeArray = new Locale[]{};
        localeArray = arrayList.toArray(localeArray);
        int n4 = localeArray.length;
        return kx_1.b(ox_1.b(Arrays.copyOf(localeArray, n4)));
    }

    public final void b(kj_0 kj_02, iw1 localeList) {
        int n3 = yx_2.o((Iterable)localeList, 10);
        ArrayList<Locale> arrayList = new ArrayList<Locale>(n3);
        localeList = localeList.iterator();
        while ((n3 = (int)(localeList.hasNext() ? 1 : 0)) != 0) {
            Locale locale = ((hw1)localeList.next()).a;
            arrayList.add(locale);
        }
        localeList = new LocaleList[]{};
        localeList = arrayList.toArray((T[])localeList);
        int n4 = ((Locale[])localeList).length;
        localeList = ox_1.b(Arrays.copyOf(localeList, n4));
        jx_0.b(kj_02, localeList);
    }
}

