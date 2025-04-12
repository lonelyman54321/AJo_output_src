/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

public final class xA1$b
implements TextWatcher {
    public final /* synthetic */ xA1 a;

    public xA1$b(xA1 xA12) {
        this.a = xA12;
    }

    public final void afterTextChanged(Editable object) {
        boolean bl2;
        int n3;
        Intrinsics.checkNotNullParameter(object, "editable");
        xA1 xA12 = this.a;
        Object object2 = xA12.j;
        if (object2 != null) {
            n3 = 0;
            ((TextInputLayout)((Object)object2)).setError(null);
        }
        object = object.toString();
        int n4 = object.length();
        n3 = 1;
        n4 -= n3;
        int n7 = 0;
        boolean bl3 = false;
        while (n7 <= n4) {
            int n8 = !bl3 ? n7 : n4;
            n8 = object.charAt(n8);
            int n10 = 32;
            n8 = Intrinsics.compare(n8, n10);
            n8 = n8 <= 0 ? 1 : 0;
            if (!bl3) {
                if (n8 == 0) {
                    bl3 = true;
                    continue;
                }
                ++n7;
                continue;
            }
            if (n8 == 0) break;
            n4 += -1;
        }
        n4 += n3;
        if ((n4 = ((String)(object = ((Object)object.subSequence(n7, n4)).toString())).length()) >= (n3 = 8)) {
            object2 = xA12.q;
            if (object2 != null) {
                n3 = R$drawable.rounded_rect_1a00bf76;
                object2.setBackgroundResource(n3);
            }
            if ((object2 = xA12.q) != null) {
                n3 = hv3_0.m(R$color.accent_color_2);
                object2.setTextColor(n3);
            }
        } else {
            object2 = xA12.q;
            if (object2 != null) {
                n3 = R$drawable.rounded_grey_refresh;
                object2.setBackgroundResource(n3);
            }
            if ((object2 = xA12.q) != null) {
                n3 = hv3_0.m(R$color.accent_color_18);
                object2.setTextColor(n3);
            }
        }
        if ((n4 = (int)(((Matcher)(object2 = Pattern.compile("[!@#$%^*()_\\-+]").matcher((CharSequence)object))).find() ? 1 : 0)) != 0) {
            object2 = xA12.r;
            if (object2 != null) {
                n3 = R$drawable.rounded_rect_1a00bf76;
                object2.setBackgroundResource(n3);
            }
            if ((object2 = xA12.r) != null) {
                n3 = hv3_0.m(R$color.accent_color_2);
                object2.setTextColor(n3);
            }
        } else {
            object2 = xA12.r;
            if (object2 != null) {
                n3 = R$drawable.rounded_grey_refresh;
                object2.setBackgroundResource(n3);
            }
            if ((object2 = xA12.r) != null) {
                n3 = hv3_0.m(R$color.accent_color_18);
                object2.setTextColor(n3);
            }
        }
        if ((n4 = (int)(((Matcher)(object2 = Pattern.compile("[a-zA-Z]").matcher((CharSequence)object))).find() ? 1 : 0)) != 0) {
            object2 = xA12.s;
            if (object2 != null) {
                n3 = R$drawable.rounded_rect_1a00bf76;
                object2.setBackgroundResource(n3);
            }
            if ((object2 = xA12.s) != null) {
                n3 = hv3_0.m(R$color.accent_color_2);
                object2.setTextColor(n3);
            }
        } else {
            object2 = xA12.s;
            if (object2 != null) {
                n3 = R$drawable.rounded_grey_refresh;
                object2.setBackgroundResource(n3);
            }
            if ((object2 = xA12.s) != null) {
                n3 = hv3_0.m(R$color.accent_color_18);
                object2.setTextColor(n3);
            }
        }
        if (bl2 = ((Matcher)(object = ((Pattern)(object2 = Pattern.compile("[0-9]"))).matcher((CharSequence)object))).find()) {
            object = xA12.t;
            if (object != null) {
                n4 = R$drawable.rounded_rect_1a00bf76;
                object.setBackgroundResource(n4);
            }
            if ((object = xA12.t) != null) {
                int n14 = hv3_0.m(R$color.accent_color_2);
                object.setTextColor(n14);
            }
        } else {
            object = xA12.t;
            if (object != null) {
                n4 = R$drawable.rounded_grey_refresh;
                object.setBackgroundResource(n4);
            }
            if ((object = xA12.t) != null) {
                int n15 = hv3_0.m(R$color.accent_color_18);
                object.setTextColor(n15);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }
}

