/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oH
 */
public final class oh_2 {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final long h;

    public oh_2(View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, long l2) {
        this.a = view;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.g = textView6;
        this.h = l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof oh_2;
        if (!bl3) {
            return false;
        }
        object = (oh_2)object;
        View view = this.a;
        View view2 = ((oh_2)object).a;
        bl3 = Intrinsics.areEqual(view, view2);
        if (!bl3) {
            return false;
        }
        view2 = this.b;
        view = ((oh_2)object).b;
        bl3 = Intrinsics.areEqual(view2, view);
        if (!bl3) {
            return false;
        }
        view2 = this.c;
        view = ((oh_2)object).c;
        bl3 = Intrinsics.areEqual(view2, view);
        if (!bl3) {
            return false;
        }
        view2 = this.d;
        view = ((oh_2)object).d;
        bl3 = Intrinsics.areEqual(view2, view);
        if (!bl3) {
            return false;
        }
        view2 = this.e;
        view = ((oh_2)object).e;
        bl3 = Intrinsics.areEqual(view2, view);
        if (!bl3) {
            return false;
        }
        view2 = this.f;
        view = ((oh_2)object).f;
        bl3 = Intrinsics.areEqual(view2, view);
        if (!bl3) {
            return false;
        }
        view2 = this.g;
        view = ((oh_2)object).g;
        bl3 = Intrinsics.areEqual(view2, view);
        if (!bl3) {
            return false;
        }
        long l2 = this.h;
        long l3 = ((oh_2)object).h;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        View view = this.a;
        if (view == null) {
            n4 = 0;
            view = null;
        } else {
            n4 = view.hashCode();
        }
        n4 *= 31;
        TextView textView = this.b;
        if (textView == null) {
            n3 = 0;
            textView = null;
        } else {
            n3 = textView.hashCode();
        }
        n4 = (n4 + n3) * 31;
        textView = this.c;
        if (textView == null) {
            n3 = 0;
            textView = null;
        } else {
            n3 = textView.hashCode();
        }
        n4 = (n4 + n3) * 31;
        textView = this.d;
        if (textView == null) {
            n3 = 0;
            textView = null;
        } else {
            n3 = textView.hashCode();
        }
        n4 = (n4 + n3) * 31;
        textView = this.e;
        if (textView == null) {
            n3 = 0;
            textView = null;
        } else {
            n3 = textView.hashCode();
        }
        n4 = (n4 + n3) * 31;
        textView = this.f;
        if (textView == null) {
            n3 = 0;
            textView = null;
        } else {
            n3 = textView.hashCode();
        }
        n4 = (n4 + n3) * 31;
        textView = this.g;
        if (textView != null) {
            n7 = textView.hashCode();
        }
        n4 = (n4 + n7) * 31;
        long l2 = this.h;
        long l3 = l2 >>> 32;
        n7 = (int)(l2 ^ l3);
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CMSTimerViewData(container=");
        View view = this.a;
        stringBuilder.append(view);
        stringBuilder.append(", infoTV=");
        view = this.b;
        stringBuilder.append(view);
        stringBuilder.append(", daysTV=");
        view = this.c;
        stringBuilder.append(view);
        stringBuilder.append(", daysPostfixTV=");
        view = this.d;
        stringBuilder.append(view);
        stringBuilder.append(", hoursTV=");
        view = this.e;
        stringBuilder.append(view);
        stringBuilder.append(", minutesTV=");
        view = this.f;
        stringBuilder.append(view);
        stringBuilder.append(", secondsTV=");
        view = this.g;
        stringBuilder.append(view);
        stringBuilder.append(", endTime=");
        long l2 = this.h;
        stringBuilder.append(l2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

