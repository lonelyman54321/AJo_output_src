/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jm3
 */
public final class jm3_0 {
    public static final void a(TextView textView, ia3_2 object) {
        Object object2;
        int n3;
        Object object3;
        int n4;
        Object object4;
        int n7;
        Integer n8;
        Integer n10;
        int n14;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(object, "vectorTextViewParams");
        Integer n15 = ((ia3_2)object).m;
        Integer n16 = ((ia3_2)object).r;
        Context context = null;
        if (n15 == null) {
            n15 = ((ia3_2)object).q;
            if (n15 != null) {
                n14 = n15;
                n10 = textView.getContext().getResources();
                n14 = n10.getDimensionPixelSize(n14);
                n15 = n14;
            } else {
                n14 = 0;
                n15 = null;
            }
            if (n15 == null) {
                if (n16 != null) {
                    n14 = n16;
                    n10 = textView.getContext().getResources();
                    n14 = n10.getDimensionPixelSize(n14);
                    n15 = n14;
                } else {
                    n14 = 0;
                    n15 = null;
                }
            }
        }
        if ((n10 = ((ia3_2)object).l) == null) {
            int n17;
            n10 = ((ia3_2)object).p;
            if (n10 != null) {
                n17 = n10;
                n8 = textView.getContext().getResources();
                n17 = n8.getDimensionPixelSize(n17);
                n10 = n17;
            } else {
                n17 = 0;
                n10 = null;
            }
            if (n10 == null) {
                if (n16 != null) {
                    n7 = n16;
                    n7 = textView.getContext().getResources().getDimensionPixelSize(n7);
                    n10 = n7;
                } else {
                    n17 = 0;
                    n10 = null;
                }
            }
        }
        if ((n16 = ((ia3_2)object).e) == null) {
            n16 = ((ia3_2)object).a;
            if (n16 != null) {
                n7 = n16;
                n8 = textView.getContext();
                n16 = xn.a((Context)n8, n7);
            } else {
                n7 = 0;
                n16 = null;
            }
        }
        n8 = ((ia3_2)object).o;
        String string2 = "context";
        if (n16 != null) {
            object4 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(object4, string2);
            n16 = yt0_1.a((Drawable)n16, (Context)object4, n10, n15);
            yt0_1.b((Drawable)n16, n8);
        } else {
            n7 = 0;
            n16 = null;
        }
        object4 = ((ia3_2)object).f;
        if (object4 == null) {
            object4 = ((ia3_2)object).b;
            if (object4 != null) {
                n4 = ((Number)object4).intValue();
                object3 = textView.getContext();
                object4 = xn.a((Context)object3, n4);
            } else {
                n4 = 0;
                object4 = null;
            }
        }
        if (object4 != null) {
            object3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object4 = yt0_1.a((Drawable)object4, (Context)object3, n10, n15);
            yt0_1.b((Drawable)object4, n8);
        } else {
            n4 = 0;
            object4 = null;
        }
        object3 = ((ia3_2)object).g;
        if (object3 == null) {
            object3 = ((ia3_2)object).c;
            if (object3 != null) {
                n3 = ((Number)object3).intValue();
                object2 = textView.getContext();
                object3 = xn.a((Context)object2, n3);
            } else {
                n3 = 0;
                object3 = null;
            }
        }
        if (object3 != null) {
            object2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object3 = yt0_1.a((Drawable)object3, (Context)object2, n10, n15);
            yt0_1.b((Drawable)object3, n8);
        } else {
            n3 = 0;
            object3 = null;
        }
        object2 = ((ia3_2)object).h;
        if (object2 == null) {
            object2 = ((ia3_2)object).d;
            if (object2 != null) {
                int n18 = ((Number)object2).intValue();
                Context context2 = textView.getContext();
                object2 = xn.a(context2, n18);
            } else {
                boolean bl2 = false;
                object2 = null;
            }
        }
        if (object2 != null) {
            context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, string2);
            context = yt0_1.a((Drawable)object2, context, n10, n15);
            yt0_1.b((Drawable)context, n8);
        }
        if ((n14 = (int)(((ia3_2)object).i ? 1 : 0)) != 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)object4, (Drawable)context, (Drawable)n16, (Drawable)object3);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)n16, (Drawable)context, (Drawable)object4, (Drawable)object3);
        }
        n15 = ((ia3_2)object).k;
        if (n15 != null) {
            n14 = n15;
            textView.setCompoundDrawablePadding(n14);
        } else {
            n15 = ((ia3_2)object).n;
            if (n15 != null) {
                n14 = n15;
                n16 = textView.getContext().getResources();
                n14 = n16.getDimensionPixelSize(n14);
                textView.setCompoundDrawablePadding(n14);
            }
        }
        object = ((ia3_2)object).j;
        textView.setContentDescription((CharSequence)object);
    }
}

