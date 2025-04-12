/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.EditText
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

public final class Lz1$b
implements TextWatcher {
    public final EditText a;
    public final /* synthetic */ lz1_2 b;

    public Lz1$b(lz1_2 lz1_22, EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "currentField");
        this.b = lz1_22;
        this.a = editText;
    }

    public final void afterTextChanged(Editable object) {
        Object object2 = "editable";
        Intrinsics.checkNotNullParameter(object, object2);
        object = object.toString();
        int n3 = object.length();
        int n4 = 1;
        n3 -= n4;
        int n7 = 0;
        lz1_2 lz1_22 = null;
        boolean bl2 = false;
        while (n7 <= n3) {
            int n8 = !bl2 ? n7 : n3;
            n8 = object.charAt(n8);
            int n10 = 32;
            n8 = Intrinsics.compare(n8, n10);
            n8 = n8 <= 0 ? 1 : 0;
            if (!bl2) {
                if (n8 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n7;
                continue;
            }
            if (n8 == 0) break;
            n3 += -1;
        }
        object = ((Object)object.subSequence(n7, n3 += n4)).toString();
        object2 = this.a;
        n3 = object2.getId();
        n4 = R$id.login_new_user_mobile_tiet;
        lz1_22 = this.b;
        if (n3 == n4) {
            object2 = lz1_22.r;
            if (object2 != null) {
                object2 = ((TextInputLayout)((Object)object2)).getError();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null && (object2 = lz1_22.r) != null) {
                ((TextInputLayout)((Object)object2)).setError(null);
            }
            lz1_22.u = object;
            object = lz1_22.r;
            if (object != null) {
                n3 = R$string.login_new_user_mobile_helper;
                object2 = hv3_0.K(n3);
                object.setHelperText((CharSequence)object2);
            }
        } else {
            n4 = R$id.login_new_user_name_tiet;
            if (n3 == n4) {
                object = lz1_22.n;
                if (object != null) {
                    object.setError(null);
                }
            } else {
                n4 = R$id.login_new_user_email_tiet;
                if (n3 == n4) {
                    object2 = lz1_22.p;
                    if (object2 != null) {
                        ((TextInputLayout)((Object)object2)).setError(null);
                    }
                    lz1_22.v = object;
                } else {
                    n4 = R$id.login_new_user_password_tiet;
                    if (n3 == n4) {
                        boolean bl3;
                        object2 = lz1_22.t;
                        if (object2 != null) {
                            ((TextInputLayout)((Object)object2)).setError(null);
                        }
                        if ((n3 = object.length()) >= (n4 = 8)) {
                            object2 = lz1_22.x;
                            if (object2 != null) {
                                n4 = R$drawable.rounded_rect_1a00bf76;
                                object2.setBackgroundResource(n4);
                            }
                            if ((object2 = lz1_22.x) != null) {
                                n4 = hv3_0.m(R$color.accent_color_2);
                                object2.setTextColor(n4);
                            }
                        } else {
                            object2 = lz1_22.x;
                            if (object2 != null) {
                                n4 = R$drawable.rounded_grey_refresh;
                                object2.setBackgroundResource(n4);
                            }
                            if ((object2 = lz1_22.x) != null) {
                                n4 = hv3_0.m(R$color.accent_color_18);
                                object2.setTextColor(n4);
                            }
                        }
                        if ((n3 = (int)(((Matcher)(object2 = Pattern.compile("[!@#$%^*()_\\-+]").matcher((CharSequence)object))).find() ? 1 : 0)) != 0) {
                            object2 = lz1_22.y;
                            if (object2 != null) {
                                n4 = R$drawable.rounded_rect_1a00bf76;
                                object2.setBackgroundResource(n4);
                            }
                            if ((object2 = lz1_22.y) != null) {
                                n4 = hv3_0.m(R$color.accent_color_2);
                                object2.setTextColor(n4);
                            }
                        } else {
                            object2 = lz1_22.y;
                            if (object2 != null) {
                                n4 = R$drawable.rounded_grey_refresh;
                                object2.setBackgroundResource(n4);
                            }
                            if ((object2 = lz1_22.y) != null) {
                                n4 = hv3_0.m(R$color.accent_color_18);
                                object2.setTextColor(n4);
                            }
                        }
                        if ((n3 = (int)(((Matcher)(object2 = Pattern.compile("[a-zA-Z]").matcher((CharSequence)object))).find() ? 1 : 0)) != 0) {
                            object2 = lz1_22.z;
                            if (object2 != null) {
                                n4 = R$drawable.rounded_rect_1a00bf76;
                                object2.setBackgroundResource(n4);
                            }
                            if ((object2 = lz1_22.z) != null) {
                                n4 = hv3_0.m(R$color.accent_color_2);
                                object2.setTextColor(n4);
                            }
                        } else {
                            object2 = lz1_22.z;
                            if (object2 != null) {
                                n4 = R$drawable.rounded_grey_refresh;
                                object2.setBackgroundResource(n4);
                            }
                            if ((object2 = lz1_22.z) != null) {
                                n4 = hv3_0.m(R$color.accent_color_18);
                                object2.setTextColor(n4);
                            }
                        }
                        if (bl3 = (object = ((Pattern)(object2 = Pattern.compile("[0-9]"))).matcher((CharSequence)object)).find()) {
                            object = lz1_22.A;
                            if (object != null) {
                                n3 = R$drawable.rounded_rect_1a00bf76;
                                object.setBackgroundResource(n3);
                            }
                            if ((object = lz1_22.A) != null) {
                                n3 = hv3_0.m(R$color.accent_color_2);
                                object.setTextColor(n3);
                            }
                        } else {
                            object = lz1_22.A;
                            if (object != null) {
                                n3 = R$drawable.rounded_grey_refresh;
                                object.setBackgroundResource(n3);
                            }
                            if ((object = lz1_22.A) != null) {
                                n3 = hv3_0.m(R$color.accent_color_18);
                                object.setTextColor(n3);
                            }
                        }
                    }
                }
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

