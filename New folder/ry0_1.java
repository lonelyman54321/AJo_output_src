/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RY0
 */
public final class ry0_1
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ry0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        int n3 = this.a;
        switch (n3) {
            default: {
                float f5 = ((Float)object).floatValue();
                object2 = (String)object2;
                Intrinsics.checkNotNullParameter(object2, "userCount");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(f5);
                stringBuilder.append("|");
                stringBuilder.append((String)object2);
                object = stringBuilder.toString();
                ((CartEntry)this.b).setAggregateRating((String)object);
                return Unit.a;
            }
            case 0: 
        }
        object = (Boolean)object;
        n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        object2 = (Boolean)object2;
        boolean n4 = (Boolean)object2;
        vy0_0 vy0_02 = (vy0_0)this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(vy0_02, string2);
        boolean bl3 = true;
        if (n4) {
            vy0_02.p = n3;
            object2 = vy0_02.Pa();
            if (object2 != null && (object2 = ((F12)object2).d) != null) {
                ((bv2_0)object2).I = object;
            }
        } else {
            vy0_02.p = (n3 != 0 || (bl2 = vy0_02.p)) && !n4 ? bl3 : false;
        }
        bl2 = vy0_02.p;
        int n7 = 1065353216;
        float f5 = 1.0f;
        if (bl2) {
            object = vy0_02.h;
            if (object != null) {
                object.setAlpha(f5);
            }
            vy0_02.n = bl3;
            object = vy0_02.h;
            if (object != null) {
                object.setClickable(bl3);
            }
            if ((object = vy0_02.Pa()) != null && (object = ((F12)object).d) != null) {
                object = ((bv2_0)object).I;
                object2 = Boolean.FALSE;
                bl2 = Intrinsics.areEqual(object, object2);
            } else {
                bl2 = false;
                float f7 = 0.0f;
                object = null;
            }
            if (bl2) {
                vy0_02.o = false;
                object = vy0_02.i;
                if (object != null) {
                    int n8 = R$drawable.rounded_rect_4_black_stroke;
                    object.setBackgroundResource(n8);
                }
                if ((object = vy0_02.i) != null) {
                    int n10 = R$color.accent_color_11;
                    object.setImageResource(n10);
                }
                if ((object = vy0_02.i) != null) {
                    int n14 = R$string.filter_checkbox_unselected_text;
                    object2 = vy0_02.getString(n14);
                    object.setContentDescription((CharSequence)object2);
                }
            }
        } else {
            object = cp_1.Companion;
            bl2 = km_1.b((cp$a)object);
            if (bl2) {
                object = vy0_02.h;
                if (object != null) {
                    object.setAlpha(f5);
                }
            } else {
                object = vy0_02.h;
                if (object != null) {
                    int n15 = 0x3F000000;
                    f5 = 0.5f;
                    object.setAlpha(f5);
                }
            }
            vy0_02.n = false;
            object = vy0_02.h;
            if (object != null) {
                object.setClickable(false);
            }
            vy0_02.o = bl3;
            object = vy0_02.i;
            if (object != null) {
                int n16 = R$drawable.rounded_rect_black_bg;
                object.setBackgroundResource(n16);
            }
            if ((object = vy0_02.i) != null) {
                int n17 = R$drawable.ic_done;
                object.setImageResource(n17);
            }
            if ((object = vy0_02.i) != null) {
                int n18 = R$string.filter_checkbox_selected_text;
                object2 = vy0_02.getString(n18);
                object.setContentDescription((CharSequence)object2);
            }
        }
        return Unit.a;
    }
}

