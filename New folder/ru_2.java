/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.widget.ImageView
 */
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon$a;
import com.skydoves.balloon.Balloon$b;
import com.skydoves.balloon.a;
import com.skydoves.balloon.a$a$a;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.safe.JuspayWebView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ru
 */
public final class ru_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ View d;

    public /* synthetic */ ru_2(Object object, Object object2, View view, int n3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = view;
    }

    public final void run() {
        int n3;
        int n4;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6 = this.b;
        Object object7 = this.d;
        Object object8 = this.c;
        int n7 = this.a;
        switch (n7) {
            default: {
                object8 = (String)object8;
                object7 = (JuspayWebView)((Object)object7);
                DuiInterface.j((DuiInterface)object6, (String)object8, (JuspayWebView)((Object)object7));
                return;
            }
            case 0: 
        }
        object6 = (Balloon)object6;
        Intrinsics.checkNotNullParameter(object6, "this$0");
        object8 = (View)object8;
        Intrinsics.checkNotNullParameter(object8, "$anchor");
        object7 = (ImageView)object7;
        Intrinsics.checkNotNullParameter(object7, "$this_with");
        object6.getClass();
        Balloon$a balloon$a = ((Balloon)object6).b;
        Object object9 = balloon$a.o;
        Object object10 = wp_2.ALIGN_FIXED;
        int n8 = 0;
        int n10 = 1;
        float f5 = Float.MIN_VALUE;
        if (object9 != object10) {
            a a2;
            int n14;
            Object object11;
            object9 = new Rect();
            object8.getGlobalVisibleRect((Rect)object9);
            object10 = new int[]{0, 0};
            ((Balloon)object6).d.getContentView().getLocationOnScreen((int[])object10);
            object5 = (Object)balloon$a.p;
            object4 = com.skydoves.balloon.a.TOP;
            object3 = "value";
            if (object5 == object4 && (object11 = object10[n10]) < (n14 = ((Rect)object9).bottom)) {
                object5 = (Object)com.skydoves.balloon.a.BOTTOM;
                Intrinsics.checkNotNullParameter(object5, (String)object3);
                balloon$a.p = (a)((Object)object5);
            } else {
                a2 = com.skydoves.balloon.a.BOTTOM;
                if (object5 == a2 && (object2 = (Object)object10[n10]) > (object11 = (Object)((Rect)object9).top)) {
                    Intrinsics.checkNotNullParameter(object4, (String)object3);
                    balloon$a.p = object4;
                }
            }
            object5 = (Object)balloon$a.p;
            object4 = com.skydoves.balloon.a.START;
            if (object5 == object4 && (object11 = object10[0]) < (n14 = ((Rect)object9).right)) {
                object9 = com.skydoves.balloon.a.END;
                Intrinsics.checkNotNullParameter(object9, (String)object3);
                balloon$a.p = object9;
            } else {
                int n15;
                a2 = com.skydoves.balloon.a.END;
                if (object5 == a2 && (object = (Object)object10[0]) > (n15 = ((Rect)object9).left)) {
                    Intrinsics.checkNotNullParameter(object4, (String)object3);
                    balloon$a.p = object4;
                }
            }
            ((Balloon)object6).q();
        }
        object9 = com.skydoves.balloon.a.Companion;
        object10 = balloon$a.p;
        ((Object)object9).getClass();
        object9 = "<this>";
        Intrinsics.checkNotNullParameter(object10, (String)object9);
        object2 = balloon$a.T;
        int n16 = 2;
        float f6 = 2.8E-45f;
        if (object2 != 0) {
            object5 = a$a$a.$EnumSwitchMapping$0;
            n4 = ((Enum)object10).ordinal();
            object2 = object5[n4];
            if (object2 != n10) {
                if (object2 == n16) {
                    object10 = com.skydoves.balloon.a.START;
                }
            } else {
                object10 = com.skydoves.balloon.a.END;
            }
        }
        object5 = Balloon$b.$EnumSwitchMapping$0;
        object = ((Enum)object10).ordinal();
        object = object5[object];
        object2 = 23;
        object3 = ((Balloon)object6).c;
        if (object != n10) {
            if (object != n16) {
                n16 = 3;
                f6 = 4.2E-45f;
                if (object != n16) {
                    n16 = 4;
                    f6 = 5.6E-45f;
                    if (object == n16) {
                        object = 1119092736;
                        object7.setRotation(90.0f);
                        object10 = ((yu_1)object3).d;
                        float f7 = object10.getX();
                        object4 = ((yu_1)object3).d;
                        n4 = object4.getWidth();
                        float f8 = n4;
                        f7 += f8;
                        f5 = n10;
                        object7.setX(f7 -= f5);
                        float f11 = ((Balloon)object6).l((View)object8);
                        object7.setY(f11);
                        n3 = Build.VERSION.SDK_INT;
                        if (n3 >= object2) {
                            object4.getWidth();
                            object7.getY();
                            balloon$a.getClass();
                            ou_1.a((ImageView)object7);
                        }
                    }
                } else {
                    object = -1028390912;
                    object7.setRotation(-90.0f);
                    object10 = ((yu_1)object3).d;
                    float f12 = object10.getX();
                    n16 = balloon$a.l;
                    f6 = n16;
                    f12 -= f6;
                    f5 = n10;
                    object7.setX(f12 += f5);
                    float f14 = ((Balloon)object6).l((View)object8);
                    object7.setY(f14);
                    n3 = Build.VERSION.SDK_INT;
                    if (n3 >= object2) {
                        object7.getY();
                        balloon$a.getClass();
                        ou_1.a((ImageView)object7);
                    }
                }
            } else {
                object = 0;
                float f15 = 0.0f;
                object10 = null;
                object7.setRotation(0.0f);
                float f16 = ((Balloon)object6).j((View)object8);
                object7.setX(f16);
                object6 = ((yu_1)object3).d;
                f16 = object6.getY();
                int n17 = balloon$a.l;
                float f17 = n17;
                f16 -= f17;
                f17 = n10;
                object7.setY(f16 += f17);
                n3 = Build.VERSION.SDK_INT;
                if (n3 >= object2) {
                    object7.getX();
                    balloon$a.getClass();
                    ou_1.a((ImageView)object7);
                }
            }
        } else {
            object7.setRotation(180.0f);
            float f18 = ((Balloon)object6).j((View)object8);
            object7.setX(f18);
            object6 = ((yu_1)object3).d;
            f18 = object6.getY();
            object8 = ((yu_1)object3).d;
            object = object8.getHeight();
            float f19 = object;
            f18 += f19;
            f19 = n10;
            object7.setY(f18 -= f19);
            f18 = balloon$a.r;
            object10 = ViewCompat.a;
            ViewCompat$c.m(object7, f18);
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= object2) {
                object7.getX();
                object8.getHeight();
                balloon$a.getClass();
                ou_1.a((ImageView)object7);
            }
        }
        n3 = balloon$a.j;
        Intrinsics.checkNotNullParameter(object7, (String)object9);
        if (n3 == 0) {
            n8 = 8;
        }
        object7.setVisibility(n8);
    }
}

