/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.Display
 *  androidx.window.extensions.layout.DisplayFeature
 *  androidx.window.extensions.layout.FoldingFeature
 *  androidx.window.extensions.layout.WindowLayoutInfo
 */
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import androidx.window.extensions.layout.DisplayFeature;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class bI0 {
    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static n31_0 a(Activity object, FoldingFeature foldingFeature) {
        void var0_11;
        int n3;
        int n4;
        FA fA;
        String string2;
        JU0$b jU0$b;
        n31_0 n31_02;
        int n7;
        Rect rect;
        Object object2;
        Object object3;
        block23: {
            Rect rect2;
            block27: {
                String string3;
                int n8;
                block26: {
                    int n10;
                    Object object4;
                    block25: {
                        block24: {
                            object3 = "activity";
                            Intrinsics.checkNotNullParameter(object, (String)object3);
                            object2 = "oemFeature";
                            Intrinsics.checkNotNullParameter(rect, (String)object2);
                            int n14 = rect.getType();
                            int n15 = 2;
                            n7 = 1;
                            n31_02 = null;
                            if (n14 != n7) {
                                if (n14 != n15) {
                                    return null;
                                }
                                object2 = N31$a.c;
                            } else {
                                object2 = N31$a.b;
                            }
                            int n16 = rect.getState();
                            if (n16 != n7) {
                                if (n16 != n15) {
                                    return null;
                                }
                                jU0$b = JU0$b.c;
                            } else {
                                jU0$b = JU0$b.b;
                            }
                            object4 = rect.getBounds();
                            string2 = "oemFeature.bounds";
                            Intrinsics.checkNotNullExpressionValue(object4, string2);
                            fA = new FA((Rect)object4);
                            object4 = kh3_2.a;
                            object4.getClass();
                            Intrinsics.checkNotNullParameter(object, (String)object3);
                            n8 = Build.VERSION.SDK_INT;
                            n10 = 30;
                            if (n8 < n10) break block24;
                            Intrinsics.checkNotNullParameter(object, (String)object3);
                            Rect rect3 = f3.a(e3.a(object.getWindowManager()));
                            object3 = "activity.windowManager.currentWindowMetrics.bounds";
                            Intrinsics.checkNotNullExpressionValue(rect3, (String)object3);
                            break block23;
                        }
                        n10 = 29;
                        if (n8 >= n10) {
                            Intrinsics.checkNotNullParameter(object, (String)object3);
                            object3 = object.getResources().getConfiguration();
                            object4 = Configuration.class;
                            String string4 = "windowConfiguration";
                            try {
                                object4 = ((Class)object4).getDeclaredField(string4);
                                ((AccessibleObject)object4).setAccessible(n7 != 0);
                                object3 = ((Field)object4).get(object3);
                                Object object5 = object3.getClass();
                                object4 = "getBounds";
                                object5 = ((Class)object5).getDeclaredMethod((String)object4, null);
                                object3 = ((Method)object5).invoke(object3, null);
                                if (object3 == null) {
                                    object5 = "null cannot be cast to non-null type android.graphics.Rect";
                                    object3 = new NullPointerException((String)object5);
                                    throw object3;
                                }
                                object3 = (Rect)object3;
                                Object object6 = object4 = new Rect((Rect)object3);
                                break block23;
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                Rect rect4 = kh3_2.a(object);
                                break block23;
                            }
                            catch (NoSuchMethodException noSuchMethodException) {
                                Rect rect5 = kh3_2.a(object);
                                break block23;
                            }
                            catch (NoSuchFieldException noSuchFieldException) {
                                Rect rect6 = kh3_2.a(object);
                                break block23;
                            }
                        }
                        n7 = 28;
                        if (n8 < n7) break block25;
                        Rect rect7 = kh3_2.a(object);
                        break block23;
                    }
                    n7 = 24;
                    string3 = "defaultDisplay";
                    if (n8 < n7) break block26;
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    rect2 = new Rect();
                    object4 = object.getWindowManager().getDefaultDisplay();
                    object4.getRectSize(rect2);
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    n4 = (int)(d3.a(object) ? 1 : 0);
                    if (n4 == 0) {
                        Intrinsics.checkNotNullExpressionValue(object4, string3);
                        object3 = kh3_2.c((Display)object4);
                        n3 = kh3_2.b((Context)object);
                        n8 = rect2.bottom + n3;
                        n10 = ((Point)object3).y;
                        if (n8 == n10) {
                            rect2.bottom = n8;
                            break block27;
                        } else {
                            n8 = rect2.right + n3;
                            if (n8 == (n3 = ((Point)object3).x)) {
                                rect2.right = n8;
                            }
                        }
                    }
                    break block27;
                }
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Display display = object.getWindowManager().getDefaultDisplay();
                Intrinsics.checkNotNullExpressionValue(display, string3);
                object3 = kh3_2.c(display);
                rect2 = new Rect();
                n8 = ((Point)object3).x;
                if (n8 != 0 && (n4 = ((Point)object3).y) != 0) {
                    rect2.right = n8;
                    rect2.bottom = n4;
                } else {
                    display.getRectSize(rect2);
                }
            }
            Rect rect8 = rect2;
            break block23;
            catch (InvocationTargetException invocationTargetException) {}
            Rect rect9 = kh3_2.a(object);
        }
        Intrinsics.checkNotNullParameter(var0_11, "bounds");
        object3 = new FA((Rect)var0_11);
        Intrinsics.checkNotNullParameter(object3, "_bounds");
        Rect rect10 = ((FA)object3).c();
        n4 = fA.a();
        if (n4 == 0 && (n4 = fA.b()) == 0) {
            return n31_02;
        }
        n4 = fA.b();
        if (n4 != (n7 = rect10.width()) && (n4 = fA.a()) != (n7 = rect10.height())) {
            return n31_02;
        }
        n4 = fA.b();
        if (n4 < (n7 = rect10.width()) && (n4 = fA.a()) < (n7 = rect10.height())) {
            return n31_02;
        }
        n4 = fA.b();
        if (n4 == (n7 = rect10.width()) && (n4 = fA.a()) == (n3 = rect10.height())) {
            return n31_02;
        }
        rect = rect.getBounds();
        Intrinsics.checkNotNullExpressionValue(rect, string2);
        FA fA2 = new FA(rect);
        return new n31_0(fA2, (N31$a)object2, jU0$b);
    }

    public static gH3 b(Activity object, WindowLayoutInfo object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "activity");
        Intrinsics.checkNotNullParameter(object2, "info");
        object2 = object2.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(object2, "info.displayFeatures");
        object2 = (Iterable)object2;
        ArrayList<DisplayFeature> arrayList = new ArrayList<DisplayFeature>();
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = (DisplayFeature)object2.next();
            boolean bl3 = object3 instanceof FoldingFeature;
            if (bl3) {
                String string2 = "feature";
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                object3 = (FoldingFeature)object3;
                object3 = bI0.a(object, (FoldingFeature)object3);
            } else {
                bl2 = false;
                object3 = null;
            }
            if (object3 == null) continue;
            arrayList.add((DisplayFeature)object3);
        }
        object = new gH3(arrayList);
        return object;
    }
}

