/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.view.View
 */
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;

/*
 * Renamed from IW
 */
public final class iw_2 {
    public static final void a(FragmentActivity fragmentActivity, View object, int n3, int n4, int n7, int n8, Typeface typeface, Typeface typeface2, TapTargetView$Listener tapTargetView$Listener) {
        if (object != null) {
            String string2 = hv3_0.K(n7);
            SpannableString spannableString = new SpannableString((CharSequence)string2);
            string2 = new StyleSpan(0);
            int n10 = spannableString.length();
            int n14 = 33;
            spannableString.setSpan((Object)string2, 0, n10, n14);
            string2 = new ForegroundColorSpan(-1);
            n10 = spannableString.length();
            spannableString.setSpan((Object)string2, 0, n10, n14);
            n7 = spannableString.length();
            spannableString.setSpan((Object)typeface2, 0, n7, n14);
            String string3 = hv3_0.K(n4);
            string2 = new SpannableString((CharSequence)string3);
            n4 = string2.length();
            string2.setSpan((Object)typeface, 0, n4, n14);
            if (fragmentActivity != null) {
                object = TapTarget.forView((View)object, string2, (CharSequence)spannableString).outerCircleColor(n3);
                n3 = 1;
                object = ((TapTarget)object).drawShadow(n3 != 0).targetRadius(n8).cancelable(n3 != 0).transparentTarget(n3 != 0).titleTextSize(16);
                n4 = 12;
                object = ((TapTarget)object).descriptionTextSize(n4).tintTarget(n3 != 0);
                TapTargetView.showFor(fragmentActivity, (TapTarget)object, tapTargetView$Listener);
            }
        }
    }
}

