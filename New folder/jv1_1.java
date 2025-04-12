/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import com.ril.ajio.R$color;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JV1
 */
public final class jv1_1
implements TextWatcher {
    public final /* synthetic */ iv1_2 a;

    public jv1_1(iv1_2 iv1_22) {
        this.a = iv1_22;
    }

    public final void afterTextChanged(Editable object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "editable");
        object = this.a;
        Object object2 = object.c;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponBox");
            n3 = 0;
            object2 = null;
        }
        object2 = object2.getText().toString();
        n3 = ((String)object2).length();
        int n4 = 8;
        String string2 = "applyCouponBtn";
        if (n3 == 0) {
            object2 = cp_1.Companion;
            n3 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(og1_1.b() ? 1 : 0)) != 0) {
                object2 = object.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                int n7 = hv3_0.m(R$color.luxe_color_989898);
                object2.setTextColor(n7);
                object2 = object.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object2;
                }
                n3 = hv3_0.m(R$color.luxe_color_F5F5F5);
                object3.setBackgroundColor(n3);
                object = object.g;
                if (object != null) {
                    object.setVisibility(n4);
                }
            }
        } else {
            object2 = cp_1.Companion;
            n3 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(og1_1.b() ? 1 : 0)) != 0) {
                object2 = object.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                int n8 = hv3_0.m(R$color.luxe_color_E0E0E0);
                object2.setTextColor(n8);
                object2 = object.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                int n10 = hv3_0.m(R$color.luxe_color_121212);
                object2.setBackgroundColor(n10);
                object2 = object.g;
                if (object2 != null) {
                    n10 = 0;
                    string2 = null;
                    object2.setVisibility(0);
                }
            }
            object2 = object.d;
            string2 = "couponValidationAlert";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            if ((n3 = object2.getVisibility()) == 0) {
                object = object.d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object;
                }
                object3.setVisibility(n4);
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

