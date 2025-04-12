/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  androidx.window.sidecar.SidecarDeviceState
 *  androidx.window.sidecar.SidecarDisplayFeature
 *  androidx.window.sidecar.SidecarWindowLayoutInfo
 */
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class v43 {
    public final ha3$b a;

    public v43(int n3) {
        ha3$b ha3$b = ha3$b.QUIET;
        Intrinsics.checkNotNullParameter((Object)ha3$b, "verificationMode");
        this.a = ha3$b;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        int n3;
        boolean bl2 = Intrinsics.areEqual(sidecarDeviceState, sidecarDeviceState2);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        bl2 = false;
        if (sidecarDeviceState == null) {
            return false;
        }
        if (sidecarDeviceState2 == null) {
            return false;
        }
        int n4 = v43$a.b(sidecarDeviceState);
        if (n4 != (n3 = v43$a.b(sidecarDeviceState2))) {
            bl3 = false;
        }
        return bl3;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        int n3;
        boolean bl2 = Intrinsics.areEqual(sidecarDisplayFeature, sidecarDisplayFeature2);
        if (bl2) {
            return true;
        }
        bl2 = false;
        if (sidecarDisplayFeature == null) {
            return false;
        }
        if (sidecarDisplayFeature2 == null) {
            return false;
        }
        int n4 = sidecarDisplayFeature.getType();
        if (n4 != (n3 = sidecarDisplayFeature2.getType())) {
            return false;
        }
        sidecarDisplayFeature = sidecarDisplayFeature.getRect();
        sidecarDisplayFeature2 = sidecarDisplayFeature2.getRect();
        return Intrinsics.areEqual(sidecarDisplayFeature, sidecarDisplayFeature2);
    }

    public static boolean c(List list, List list2) {
        int n3;
        boolean bl2 = true;
        if (list == list2) {
            return bl2;
        }
        if (list == null) {
            return false;
        }
        if (list2 == null) {
            return false;
        }
        int n4 = list.size();
        if (n4 != (n3 = list2.size())) {
            return false;
        }
        n4 = list.size();
        n3 = 0;
        SidecarDisplayFeature sidecarDisplayFeature = null;
        while (n3 < n4) {
            int n7 = n3 + 1;
            SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature)list.get(n3);
            if ((n3 = (int)(v43.b(sidecarDisplayFeature2, sidecarDisplayFeature = (SidecarDisplayFeature)list2.get(n3)) ? 1 : 0)) == 0) {
                return false;
            }
            n3 = n7;
        }
        return bl2;
    }

    public static boolean d(SidecarWindowLayoutInfo object, SidecarWindowLayoutInfo object2) {
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            return true;
        }
        bl2 = false;
        if (object == null) {
            return false;
        }
        if (object2 == null) {
            return false;
        }
        object = v43$a.c(object);
        object2 = v43$a.c(object2);
        return v43.c((List)object, (List)object2);
    }

    public final gH3 e(SidecarWindowLayoutInfo object, SidecarDeviceState object2) {
        String string2 = "state";
        Intrinsics.checkNotNullParameter(object2, string2);
        if (object == null) {
            object2 = xx_2.f();
            object = new gH3((List)object2);
            return object;
        }
        string2 = new SidecarDeviceState();
        int n3 = v43$a.b(object2);
        v43$a.d((SidecarDeviceState)string2, n3);
        object = v43$a.c(object);
        object = this.f((List)object, (SidecarDeviceState)string2);
        object2 = new gH3((List)object);
        return object2;
    }

    public final ArrayList f(List object, SidecarDeviceState sidecarDeviceState) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "deviceState");
        object = (Iterable)object;
        ArrayList<SidecarDisplayFeature> arrayList = new ArrayList<SidecarDisplayFeature>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (SidecarDisplayFeature)object.next();
            if ((object2 = this.g((SidecarDisplayFeature)object2, sidecarDeviceState)) == null) continue;
            arrayList.add((SidecarDisplayFeature)object2);
        }
        return arrayList;
    }

    public final n31_0 g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState object) {
        block4: {
            FA fA;
            Object object2;
            Object object3;
            block6: {
                block5: {
                    Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "feature");
                    Intrinsics.checkNotNullParameter(object, "deviceState");
                    Intrinsics.checkNotNullExpressionValue("v43", "TAG");
                    object3 = this.a;
                    object3 = ha3$a.a(sidecarDisplayFeature, (ha3$b)((Object)object3));
                    object2 = w43_0.c;
                    object3 = ((wz3_0)object3).c("Type must be either TYPE_FOLD or TYPE_HINGE", (Function1)object2);
                    object2 = x43.c;
                    object3 = ((ha3)object3).c("Feature bounds must not be 0", (Function1)object2);
                    object2 = y43_0.c;
                    object3 = ((ha3)object3).c("TYPE_FOLD must have 0 area", (Function1)object2);
                    object2 = z43_0.c;
                    object3 = (SidecarDisplayFeature)((ha3)object3).c("Feature be pinned to either left or top", (Function1)object2).a();
                    fA = null;
                    if (object3 == null) {
                        return null;
                    }
                    int n3 = object3.getType();
                    int n4 = 2;
                    int n7 = 1;
                    if (n3 != n7) {
                        if (n3 != n4) {
                            return null;
                        }
                        object3 = N31$a.c;
                    } else {
                        object3 = N31$a.b;
                    }
                    int n8 = v43$a.b(object);
                    if (n8 == 0 || n8 == n7) break block4;
                    if (n8 == n4) break block5;
                    object2 = JU0$b.b;
                    n7 = 3;
                    if (n8 != n7 && n8 == (n7 = 4)) break block4;
                    break block6;
                }
                object2 = JU0$b.c;
            }
            sidecarDisplayFeature = sidecarDisplayFeature.getRect();
            Intrinsics.checkNotNullExpressionValue(sidecarDisplayFeature, "feature.rect");
            fA = new FA((Rect)sidecarDisplayFeature);
            object = new n31_0(fA, (N31$a)object3, (JU0$b)object2);
            return object;
        }
        return null;
    }
}

