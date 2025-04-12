/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.snackbar.Snackbar;
import com.ril.ajio.R$string;

/*
 * Renamed from aB0
 */
public final class ab0_0 {
    public static final aB0$a Companion;
    public Snackbar a;

    static {
        aB0$a aB0$a;
        Companion = aB0$a = new Object();
    }

    public static String a(int n3) {
        String string2;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 6;
                    if (n3 != n4) {
                        n3 = R$string.api_alert_title;
                        string2 = hv3_0.K(n3);
                    } else {
                        n3 = R$string.api_alert_title;
                        string2 = hv3_0.K(n3);
                    }
                } else {
                    n3 = R$string.api_alert_title;
                    string2 = hv3_0.K(n3);
                }
            } else {
                n3 = R$string.server_alert_title;
                string2 = hv3_0.K(n3);
            }
        } else {
            n3 = R$string.internet_alert_title;
            string2 = hv3_0.K(n3);
        }
        return string2;
    }
}

