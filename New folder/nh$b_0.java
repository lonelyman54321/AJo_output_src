/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.view.View
 *  android.widget.TextView
 */
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from nH$b
 */
public final class nh$b_0
extends CountDownTimer {
    public final /* synthetic */ nh_2 a;

    public nh$b_0(nh_2 nh_22, long l2) {
        this.a = nh_22;
        super(l2, 1000L);
    }

    public final void onFinish() {
        View view = this.a.a.a;
        if (view != null) {
            int n3 = 8;
            view.setVisibility(n3);
        }
    }

    public final void onTick(long l2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7 = l2;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        int n8 = 0;
        Object object8 = null;
        nh_2 nh_22 = this.a;
        nh_22.getClass();
        Object object9 = TimeUnit.MILLISECONDS;
        long l3 = object9.toDays(l2);
        long l4 = TimeUnit.DAYS.toMillis(l3);
        object7 = l2 - l4;
        l4 = object9.toHours((long)object7);
        TimeUnit timeUnit = TimeUnit.HOURS;
        long l7 = timeUnit.toMillis(l4);
        object7 -= l7;
        l7 = object9.toMinutes((long)object7);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long l8 = timeUnit2.toMillis(l7);
        object7 -= l8;
        object7 = object9.toSeconds((long)object7);
        int n10 = 4;
        object9 = new long[n10];
        object9[0] = (TimeUnit)l3;
        object9[n7] = (TimeUnit)l4;
        object9[n4] = (TimeUnit)l7;
        object9[n3] = (TimeUnit)((Object)object7);
        object7 = (Object)object9[0];
        l3 = 0L;
        String string2 = "0";
        long l12 = 9;
        long l14 = object7 == l3 ? 0 : (object7 < l3 ? -1 : 1);
        if (l14 > 0) {
            Object object10;
            object6 = nh_22.a.c;
            if (object6 != null) {
                object6.setVisibility(0);
            }
            if ((object6 = nh_22.a.d) != null) {
                object6.setVisibility(0);
            }
            if ((n8 = (object10 = (object7 = (Object)((Object)object9[0])) - l12) == 0L ? 0 : (object10 < 0L ? -1 : 1)) > 0) {
                object8 = nh_22.a.c;
                if (object8 != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((long)object7);
                    object6 = stringBuilder.toString();
                    object8.setText((CharSequence)object6);
                }
            } else {
                object8 = nh_22.a.c;
                if (object8 != null) {
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append((long)object7);
                    object6 = stringBuilder.toString();
                    object8.setText((CharSequence)object6);
                }
            }
        } else {
            object6 = nh_22.a.c;
            int n14 = 8;
            if (object6 != null) {
                object6.setVisibility(n14);
            }
            if ((object6 = nh_22.a.d) != null) {
                object6.setVisibility(n14);
            }
        }
        if ((n7 = (int)((object5 = (object7 = (Object)((Object)object9[n7])) - l12) == 0L ? 0 : (object5 < 0L ? -1 : 1))) > 0) {
            object4 = nh_22.a.e;
            if (object4 != null) {
                object8 = new StringBuilder();
                ((StringBuilder)object8).append((long)object7);
                object6 = ((StringBuilder)object8).toString();
                object4.setText((CharSequence)object6);
            }
        } else {
            object4 = nh_22.a.e;
            if (object4 != null) {
                object8 = new StringBuilder(string2);
                ((StringBuilder)object8).append((long)object7);
                object6 = ((StringBuilder)object8).toString();
                object4.setText((CharSequence)object6);
            }
        }
        if ((n4 = (int)((object3 = (object7 = (Object)((Object)object9[n4])) - l12) == 0L ? 0 : (object3 < 0L ? -1 : 1))) > 0) {
            object2 = nh_22.a.f;
            if (object2 != null) {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((long)object7);
                object6 = ((StringBuilder)object4).toString();
                object2.setText((CharSequence)object6);
            }
        } else {
            object2 = nh_22.a.f;
            if (object2 != null) {
                object4 = new StringBuilder(string2);
                ((StringBuilder)object4).append((long)object7);
                object6 = ((StringBuilder)object4).toString();
                object2.setText((CharSequence)object6);
            }
        }
        if ((n3 = (int)((object = (object7 = (Object)((Object)object9[n3])) - l12) == 0L ? 0 : (object < 0L ? -1 : 1))) > 0) {
            TextView textView = nh_22.a.g;
            if (textView != null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((long)object7);
                object6 = ((StringBuilder)object2).toString();
                textView.setText((CharSequence)object6);
            }
        } else {
            TextView textView = nh_22.a.g;
            if (textView != null) {
                object2 = new StringBuilder(string2);
                ((StringBuilder)object2).append((long)object7);
                object6 = ((StringBuilder)object2).toString();
                textView.setText((CharSequence)object6);
            }
        }
    }
}

