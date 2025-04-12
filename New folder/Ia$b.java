/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.CountDownTimer
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 */
import android.content.Context;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import java.util.concurrent.TimeUnit;

public final class Ia$b
extends CountDownTimer {
    public final /* synthetic */ ia_0 a;

    public Ia$b(ia_0 ia_02, long l2) {
        this.a = ia_02;
        super(l2, 1000L);
    }

    public final void onFinish() {
        this.a.n0();
    }

    public final void onTick(long object) {
        String string2;
        Object object2;
        String string3;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        boolean n8 = false;
        Object object3 = TimeUnit.MILLISECONDS;
        Object object4 = object3.toDays((long)object);
        long l2 = TimeUnit.DAYS.toMillis((long)object4);
        object -= l2;
        l2 = object3.toHours((long)object);
        TimeUnit timeUnit = TimeUnit.HOURS;
        long l3 = timeUnit.toMillis(l2);
        object -= l3;
        l3 = object3.toMinutes((long)object);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long l4 = timeUnit2.toMillis(l3);
        object -= l4;
        object = (TimeUnit)object3.toSeconds((long)object);
        int n10 = 4;
        object3 = new long[n10];
        object3[0] = (TimeUnit)((Object)object4);
        object3[n7] = (TimeUnit)l2;
        object3[n4] = (TimeUnit)l3;
        object3[n3] = object;
        object = object3[0];
        object4 = 0L;
        String string4 = "";
        String string5 = "0";
        long l7 = 10;
        Object object5 = object == object4 ? 0 : (object < object4 ? -1 : 1);
        if (object5 > 0) {
            string3 = "d:";
            object2 = object == l7 ? 0 : (object < l7 ? -1 : 1);
            string2 = object2 < 0 ? Ov2.a((long)object, string5, string3) : UX.b((long)object, string3);
            string4 = kp1_0.c(string4, string2);
        }
        object = object3[n7];
        string3 = "h:";
        object2 = object == l7 ? 0 : (object < l7 ? -1 : 1);
        string2 = object2 < 0 ? Ov2.a((long)object, string5, string3) : UX.b((long)object, string3);
        string2 = Ft2.a(string4, string2);
        object4 = (Object)object3[n4];
        Object object6 = "m:";
        n4 = object4 == l7 ? 0 : (object4 < l7 ? -1 : 1);
        object6 = n4 < 0 ? Ov2.a(object4, string5, (String)object6) : UX.b(object4, (String)object6);
        string2 = Ft2.a(string2, (String)object6);
        TimeUnit timeUnit3 = object3[n3];
        object6 = "s";
        reference var6_6 = timeUnit3 == l7 ? 0 : (timeUnit3 < l7 ? -1 : 1);
        object6 = var6_6 < 0 ? Ov2.a((long)timeUnit3, string5, (String)object6) : UX.b((long)timeUnit3, (String)object6);
        string2 = Ft2.a(string2, (String)object6);
        object6 = this.a;
        Object object7 = ((a51)object6).getContext();
        if (object7 != null) {
            object7 = hv3_0.K(R$string.dod_deals_ends_in_header);
            String string6 = " ";
            string2 = n1.a((String)object7, string6, string2);
            n3 = hv3_0.K(R$string.dod_deals_ends_in_header).length() + n7;
            n4 = string2.length();
            SpannableString spannableString = new SpannableString((CharSequence)string2);
            string4 = ((Fragment)object6).requireContext();
            n10 = R$color.accent_color_2;
            int n14 = t70.getColor((Context)string4, n10);
            string2 = new ForegroundColorSpan(n14);
            int n15 = 33;
            spannableString.setSpan((Object)string2, n3, n4, n15);
            string2 = spannableString.toString();
            n3 = 0;
            object7 = null;
            ((ia_0)object6).Eb(string2, null);
        }
    }
}

