/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 */
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zh
 */
public final class zh_0
implements it2_1 {
    public LocaleList a;
    public iw1 b;
    public final x30_0 c;

    public zh_0() {
        x30_0 x30_02;
        this.c = x30_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final iw1 a() {
        LocaleList localeList = Wh.a();
        x30_0 x30_02 = this.c;
        synchronized (x30_02) {
            Object object;
            iw1 iw12;
            block6: {
                iw12 = this.b;
                if (iw12 == null || localeList != (object = this.a)) break block6;
                return iw12;
            }
            try {
                int n3 = Xh.a(localeList);
                object = new ArrayList(n3);
                int n4 = 0;
                while (true) {
                    if (n4 >= n3) {
                        iw12 = new iw1((List)object);
                        this.a = localeList;
                        this.b = iw12;
                        return iw12;
                    }
                    Locale locale = Yh.a(localeList, n4);
                    hw1 hw12 = new hw1(locale);
                    ((ArrayList)object).add(hw12);
                    ++n4;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Locale b(String object) {
        object = Locale.forLanguageTag((String)object);
        Intrinsics.areEqual(((Locale)object).toLanguageTag(), "und");
        return object;
    }
}

