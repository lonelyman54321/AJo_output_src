/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.translation.ViewTranslationCallback
 */
import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sg
 */
public final class sg_0
implements ViewTranslationCallback {
    public static final sg_0 a;

    static {
        sg_0 sg_02;
        a = sg_02 = new Object();
    }

    public final boolean onClearTranslation(View object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        object = ((AndroidComposeView)object).getContentCaptureManager$ui_release();
        object.getClass();
        Object[] objectArray = Pg$a.SHOW_ORIGINAL;
        object.g = objectArray;
        object = object.c();
        objectArray = object.c;
        object = object.a;
        int n3 = ((View)object).length + -2;
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                reference var5_5 = object[n4];
                reference var7_6 = var5_5 ^ (long)-1;
                int n7 = 7;
                var7_6 = var7_6 << n7 & var5_5;
                long l2 = -9187201950435737472L;
                reference cfr_temp_0 = (var7_6 &= l2) - l2;
                Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object2 != false) {
                    int n8 = ~(n4 - n3) >>> 31;
                    int n10 = 8;
                    n8 = 8 - n8;
                    for (n7 = 0; n7 < n8; ++n7) {
                        long l3 = 0xFFL & var5_5;
                        long l4 = 128L;
                        long l7 = l3 - l4;
                        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object3 < 0) {
                            int n14 = (n4 << 3) + n7;
                            Object object4 = ((KY2)objectArray[n14]).a.d;
                            Object object5 = MY2.x;
                            if ((object5 = AY2.a((zy2_0)object4, (TY2)object5)) != null && (object4 = (H1)AY2.a((zy2_0)object4, (TY2)(object5 = yY2.l))) != null && (object4 = (Function0)((H1)object4).b) != null) {
                                object4 = (Boolean)object4.invoke();
                            }
                        }
                        var5_5 >>= n10;
                    }
                    if (n8 != n10) break;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        object = ((AndroidComposeView)object).getContentCaptureManager$ui_release();
        object.getClass();
        Object[] objectArray = Pg$a.SHOW_ORIGINAL;
        object.g = objectArray;
        object = object.c();
        objectArray = object.c;
        object = object.a;
        int n3 = ((View)object).length + -2;
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                reference var5_5 = object[n4];
                reference var7_6 = var5_5 ^ (long)-1;
                int n7 = 7;
                var7_6 = var7_6 << n7 & var5_5;
                long l2 = -9187201950435737472L;
                reference cfr_temp_0 = (var7_6 &= l2) - l2;
                Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object2 != false) {
                    int n8 = ~(n4 - n3) >>> 31;
                    int n10 = 8;
                    n8 = 8 - n8;
                    for (n7 = 0; n7 < n8; ++n7) {
                        long l3 = 0xFFL & var5_5;
                        long l4 = 128L;
                        long l7 = l3 - l4;
                        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object3 < 0) {
                            Boolean bl2;
                            int n14 = (n4 << 3) + n7;
                            Object object4 = ((KY2)objectArray[n14]).a.d;
                            Object object5 = MY2.x;
                            object2 = Intrinsics.areEqual(object5 = AY2.a((zy2_0)object4, (TY2)object5), bl2 = Boolean.TRUE);
                            if (object2 != false && (object4 = (H1)AY2.a((zy2_0)object4, (TY2)(object5 = yY2.k))) != null && (object4 = (Function1)((H1)object4).b) != null) {
                                object5 = Boolean.FALSE;
                                object4 = (Boolean)object4.invoke(object5);
                            }
                        }
                        var5_5 >>= n10;
                    }
                    if (n8 != n10) break;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        object = ((AndroidComposeView)object).getContentCaptureManager$ui_release();
        object.getClass();
        Object[] objectArray = Pg$a.SHOW_TRANSLATED;
        object.g = objectArray;
        object = object.c();
        objectArray = object.c;
        object = object.a;
        int n3 = ((View)object).length + -2;
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                reference var5_5 = object[n4];
                reference var7_6 = var5_5 ^ (long)-1;
                int n7 = 7;
                var7_6 = var7_6 << n7 & var5_5;
                long l2 = -9187201950435737472L;
                reference cfr_temp_0 = (var7_6 &= l2) - l2;
                Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object2 != false) {
                    int n8 = ~(n4 - n3) >>> 31;
                    int n10 = 8;
                    n8 = 8 - n8;
                    for (n7 = 0; n7 < n8; ++n7) {
                        long l3 = 0xFFL & var5_5;
                        long l4 = 128L;
                        long l7 = l3 - l4;
                        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object3 < 0) {
                            Boolean bl2;
                            int n14 = (n4 << 3) + n7;
                            Object object4 = ((KY2)objectArray[n14]).a.d;
                            Object object5 = MY2.x;
                            object2 = Intrinsics.areEqual(object5 = AY2.a((zy2_0)object4, (TY2)object5), bl2 = Boolean.FALSE);
                            if (object2 != false && (object4 = (H1)AY2.a((zy2_0)object4, (TY2)(object5 = yY2.k))) != null && (object4 = (Function1)((H1)object4).b) != null) {
                                object5 = Boolean.TRUE;
                                object4 = (Boolean)object4.invoke(object5);
                            }
                        }
                        var5_5 >>= n10;
                    }
                    if (n8 != n10) break;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return true;
    }
}

