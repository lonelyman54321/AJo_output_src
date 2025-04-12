/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CB2
 */
public final class cb2_0 {
    public static final fn3_0 a(String string2, String string3, String string4) {
        String string5 = string2;
        String string6 = string3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!(bl2 || (bl2 = TextUtils.isEmpty((CharSequence)string3)) || (bl2 = TextUtils.isEmpty((CharSequence)string4)))) {
            fn3_0 fn3_02 = new Object();
            Intrinsics.checkNotNull(string2);
            long l2 = k7.z(string2);
            Intrinsics.checkNotNull(string3);
            long l3 = k7.z(string3);
            Intrinsics.checkNotNull(string4);
            long l4 = k7.z(string4);
            boolean bl3 = true;
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 < 0) {
                fn3_02.c = bl3;
                fn3_02.b = "Sale has ended";
                return fn3_02;
            }
            String string7 = "yyyy-MM-dd'T'HH:mm:ss";
            String string8 = "dd MMMM, hh:mm aaa";
            long l8 = 86400000L;
            String string9 = "dd MMM";
            String string10 = " ";
            Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (object > 0) {
                long l12 = (l2 -= l4) - l8;
                Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 < 0) {
                    fn3_02.a = true;
                    object2 = R$string.textview_coupon_discount__sale_start_time_msg2;
                    fn3_02.b = string6 = hv3_0.K((int)object2).toString();
                    fn3_02.f = l2;
                    fn3_02.e = string5 = k7.c(string2.concat(string10), string9, string7);
                } else {
                    object2 = R$string.textview_coupon_discount__sale_start_time_msg1;
                    string6 = hv3_0.K((int)object2);
                    String string11 = k7.c(string2.concat(string10), string8, string7);
                    fn3_02.b = string6 = n1.a(string6, string10, string11);
                    fn3_02.e = string5 = k7.c(string2.concat(string10), string9, string7);
                }
            } else if (l7 > 0) {
                boolean bl4;
                fn3_02.d = bl4 = true;
                long l14 = (l3 -= l4) - l8;
                Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object3 < 0) {
                    fn3_02.a = bl4;
                    fn3_02.b = string6 = "Sale ends in ";
                    fn3_02.f = l3;
                    fn3_02.e = string5 = k7.c(string2.concat(string10), string9, string7);
                } else {
                    int n3 = R$string.textview_coupon_discount__sale_end_time_msg1;
                    string5 = hv3_0.K(n3);
                    String string12 = k7.c(string3.concat(string10), string8, string7);
                    fn3_02.b = string5 = n1.a(string5, string10, string12);
                    fn3_02.e = string5 = k7.c(string3.concat(string10), string9, string7);
                }
            }
            return fn3_02;
        }
        return null;
    }

    public static final void b(int n3, int n4) {
        Object object;
        String string2;
        if (n3 > 0 && n4 > 0) {
            return;
        }
        String string3 = " must be greater than zero.";
        if (n3 != n4) {
            String string4 = "Both size ";
            String string5 = " and step ";
            string2 = z41.a(string4, string5, string3, n3, n4);
        } else {
            object = "size ";
            string2 = Gj0.b(n3, (String)object, string3);
        }
        string2 = string2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

