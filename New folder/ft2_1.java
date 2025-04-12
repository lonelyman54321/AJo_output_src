/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.view.ScrollCaptureCallback
 *  android.view.ScrollCaptureTarget
 *  android.view.View
 */
import android.graphics.Point;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Comparator;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from FT2
 */
public final class ft2_1
implements H20$a {
    public final ParcelableSnapshotMutableState a;

    public ft2_1() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.a = parcelableSnapshotMutableState = J83.g(Boolean.FALSE);
    }

    public final void a() {
        Boolean bl2 = Boolean.TRUE;
        this.a.setValue(bl2);
    }

    public final void b() {
        Boolean bl2 = Boolean.FALSE;
        this.a.setValue(bl2);
    }

    public final void c(View view, LY2 rect, CoroutineContext object, Consumer consumer) {
        ft2$a_0 ft2$a_0;
        int n3 = 1;
        int n4 = 16;
        Object object2 = new GT2[n4];
        WR1 wR1 = new WR1((Object[])object2);
        rect = rect.a();
        String string2 = "add(Ljava/lang/Object;)Z";
        int n7 = 8;
        int n8 = 1;
        Class<WR1> clazz = WR1.class;
        String string3 = "add";
        object2 = ft2$a_0;
        ft2$a_0 = new AdaptedFunctionReference(n8, wR1, clazz, string3, string2, n7);
        HT2.i((GY2)rect, 0, ft2$a_0);
        rect = new Function1[2];
        rect[0] = object2 = FT2$b.c;
        Object object3 = FT2$c.c;
        rect[n3] = object3;
        Intrinsics.checkNotNullParameter(rect, "selectors");
        object3 = new p00_0((Function1[])rect);
        wR1.p((Comparator)object3);
        int n10 = wR1.k();
        if (n10 != 0) {
            n10 = 0;
            rect = null;
        } else {
            n10 = wR1.c - n3;
            object3 = wR1.a;
            rect = object3[n10];
        }
        rect = (GT2)rect;
        if (rect == null) {
            return;
        }
        object = d.a((CoroutineContext)object);
        object2 = rect.a;
        Vi1 vi1 = rect.c;
        object3 = new H20((GY2)object2, vi1, (c80)object, this);
        rect = (w32_0)rect.d;
        rect = ap1_0.d((zp1)rect).G((zp1)rect, n3 != 0);
        int n14 = vi1.a;
        n3 = vi1.b;
        long l2 = Ti1.a(n14, n3);
        rect = cf_2.d(Wi1.a((aG2)rect));
        n3 = (int)(l2 >> 32);
        n4 = (int)(l2 & 0xFFFFFFFFL);
        object = new Point(n3, n4);
        view = ET2.a(view, rect, (Point)object, (ScrollCaptureCallback)object3);
        rect = cf_2.d(vi1);
        DT2.a((ScrollCaptureTarget)view, rect);
        Ug.a(consumer, view);
    }
}

