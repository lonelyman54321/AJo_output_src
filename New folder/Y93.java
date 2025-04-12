/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Spannable
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.LocaleSpan
 *  android.text.style.RelativeSizeSpan
 */
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.List;
import java.util.Locale;

public final class Y93 {
    /*
     * Enabled aggressive block sorting
     */
    public static final float a(long l2, float f5, Vo0 vo0) {
        float f6;
        long l3 = Dm3.b(l2);
        long l4 = 0x100000000L;
        double d2 = 2.121995791E-314;
        boolean bl2 = Fm3.a(l3, l4);
        if (bl2) {
            float f7 = vo0.H0();
            double d5 = f7;
            l4 = 4607407598781385933L;
            d2 = 1.05;
            double d7 = d5 - d2;
            Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object <= 0) {
                return vo0.h0(l2);
            }
            l3 = vo0.O(f5);
            f6 = Dm3.c(l2);
            float f8 = Dm3.c(l3);
            f6 /= f8;
            return f6 *= f5;
        } else {
            l4 = 0x200000000L;
            d2 = 4.243991582E-314;
            boolean bl3 = Fm3.a(l3, l4);
            if (!bl3) {
                return 0.0f / 0.0f;
            }
            f6 = Dm3.c(l2);
        }
        return f6 *= f5;
    }

    public static final void b(Spannable spannable, long l2, int n3, int n4) {
        long l3 = 16;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            int n7 = zx_0.i(l2);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n7);
            n7 = 33;
            spannable.setSpan((Object)foregroundColorSpan, n3, n4, n7);
        }
    }

    public static final void c(Spannable spannable, long l2, Vo0 vo0, int n3, int n4) {
        long l3 = Dm3.b(l2);
        long l4 = 0x100000000L;
        boolean bl2 = Fm3.a(l3, l4);
        int n7 = 33;
        if (bl2) {
            float f5 = vo0.h0(l2);
            int n8 = ok1_1.b(f5);
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(n8, false);
            spannable.setSpan((Object)absoluteSizeSpan, n3, n4, n7);
        } else {
            long l7 = 0x200000000L;
            boolean bl3 = Fm3.a(l3, l7);
            if (bl3) {
                float f6 = Dm3.c(l2);
                vo0 = new RelativeSizeSpan(f6);
                spannable.setSpan((Object)vo0, n3, n4, n7);
            }
        }
    }

    public static final void d(Spannable spannable, iw1 object, int n3, int n4) {
        if (object != null) {
            int n7 = Build.VERSION.SDK_INT;
            int n8 = 24;
            if (n7 >= n8) {
                mw1 mw12 = mw1.a;
                object = mw12.a((iw1)object);
            } else {
                List list = ((iw1)object).a;
                n7 = (int)(list.isEmpty() ? 1 : 0);
                object = n7 != 0 ? jt2_0.a.a().a() : ((iw1)object).a();
                object = ((hw1)object).a;
                list = new LocaleSpan((Locale)object);
                object = list;
            }
            n7 = 33;
            spannable.setSpan(object, n3, n4, n7);
        }
    }
}

