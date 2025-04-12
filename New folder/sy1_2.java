/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.widget.TextView
 */
import android.os.CountDownTimer;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SY1
 */
public final class sy1_2
extends CountDownTimer {
    public final TextView a;
    public final cs0_2 b;
    public long[] c;

    public sy1_2(long l2, TextView textView, cs0_2 cs0_22) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        super(l2, 1000L);
        this.a = textView;
        this.b = cs0_22;
    }

    public final long[] a() {
        long[] lArray = this.c;
        if (lArray != null) {
            return lArray;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dateTime");
        return null;
    }

    public final void onFinish() {
        cs0_2 cs0_22 = this.b;
        if (cs0_22 != null) {
            cs0_22.n0();
        }
    }

    public final void onTick(long l2) {
        long l3;
        Object object;
        long l4;
        long l7;
        Object object2;
        Object object3;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        int n8 = 0;
        StringBuilder stringBuilder = null;
        Object object4 = TimeUnit.MILLISECONDS;
        long l8 = object4.toDays(l2);
        long l12 = TimeUnit.DAYS.toMillis(l8);
        l2 -= l12;
        l12 = object4.toHours(l2);
        TimeUnit timeUnit = TimeUnit.HOURS;
        long l14 = timeUnit.toMillis(l12);
        l2 -= l14;
        l14 = object4.toMinutes(l2);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long l15 = timeUnit2.toMillis(l14);
        l2 -= l15;
        l2 = object4.toSeconds(l2);
        int n10 = 4;
        object4 = new long[n10];
        object4[0] = (TimeUnit)l8;
        object4[n7] = (TimeUnit)l12;
        object4[n4] = (TimeUnit)l14;
        object4[n3] = (TimeUnit)l2;
        Intrinsics.checkNotNullParameter(object4, "<set-?>");
        this.c = (long[])object4;
        Object object5 = this.a();
        long l16 = object5[0];
        l2 = 0L;
        String string2 = "";
        String string3 = "0";
        long l17 = 10;
        long l18 = l16 == l2 ? 0 : (l16 < l2 ? -1 : 1);
        if (l18 > 0) {
            l16 = this.a()[0];
            object5 = "d ";
            object3 = l16 == l17 ? 0 : (l16 < l17 ? -1 : 1);
            if (object3 < 0) {
                object2 = this.a();
                l7 = object2[0];
                string2 = Ov2.a(l7, string3, (String)object5);
            } else {
                object2 = this.a();
                l7 = object2[0];
                string2 = Ov2.a(l7, string2, (String)object5);
            }
        }
        l7 = this.a()[n7];
        object5 = "h ";
        object3 = l7 == l17 ? 0 : (l7 < l17 ? -1 : 1);
        if (object3 < 0) {
            l4 = this.a()[n7];
            object2 = new StringBuilder;
            ((StringBuilder)object2)();
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append(l4);
            ((StringBuilder)object2).append((String)object5);
            object5 = ((StringBuilder)object2).toString();
        } else {
            l4 = this.a()[n7];
            object2 = new StringBuilder;
            ((StringBuilder)object2)();
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(l4);
            ((StringBuilder)object2).append((String)object5);
            object5 = ((StringBuilder)object2).toString();
        }
        l4 = this.a()[n4];
        object2 = "m ";
        n10 = (int)(l4 == l17 ? 0 : (l4 < l17 ? -1 : 1));
        if (n10 < 0) {
            object = this.a();
            l3 = object[n4];
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object5);
            stringBuilder.append(string3);
            stringBuilder.append(l3);
            stringBuilder.append((String)object2);
            object5 = stringBuilder.toString();
        } else {
            object = this.a();
            l3 = object[n4];
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object5);
            stringBuilder.append(l3);
            stringBuilder.append((String)object2);
            object5 = stringBuilder.toString();
        }
        l3 = this.a()[n3];
        object2 = "s";
        n8 = l3 == l17 ? 0 : (l3 < l17 ? -1 : 1);
        if (n8 < 0) {
            long[] lArray = this.a();
            long l19 = lArray[n3];
            object = new StringBuilder;
            ((StringBuilder)object)();
            ((StringBuilder)object).append((String)object5);
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(l19);
            ((StringBuilder)object).append((String)object2);
            object5 = ((StringBuilder)object).toString();
        } else {
            long[] lArray = this.a();
            long l20 = lArray[n3];
            object = new StringBuilder;
            ((StringBuilder)object)();
            ((StringBuilder)object).append((String)object5);
            ((StringBuilder)object).append(l20);
            ((StringBuilder)object).append((String)object2);
            object5 = ((StringBuilder)object).toString();
        }
        this.a.setText((CharSequence)object5);
    }
}

