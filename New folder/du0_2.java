/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build$VERSION
 */
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from du0
 */
public final class du0_2
extends im2
implements ti2_0 {
    public final Drawable a;
    public final ParcelableSnapshotMutableIntState b;
    public final ParcelableSnapshotMutableState c;
    public final hh3_2 d;

    public du0_2(Drawable drawable2) {
        long l2;
        int n3;
        Intrinsics.checkNotNullParameter(drawable2, "drawable");
        this.a = drawable2;
        Object object = Pv2.b(0);
        this.b = object;
        object = fu0_2.a;
        int n4 = drawable2.getIntrinsicWidth();
        if (n4 >= 0 && (n4 = drawable2.getIntrinsicHeight()) >= 0) {
            n4 = drawable2.getIntrinsicWidth();
            float f5 = n4;
            n3 = drawable2.getIntrinsicHeight();
            float f6 = n3;
            l2 = bo1_1.a(f5, f6);
        } else {
            l2 = 9205357640488583168L;
        }
        C63 c63 = new C63(l2);
        this.c = object = J83.g(c63);
        object = new cu0_2(this);
        this.d = object = yr1_2.b((Function0)object);
        n4 = drawable2.getIntrinsicWidth();
        if (n4 >= 0 && (n4 = drawable2.getIntrinsicHeight()) >= 0) {
            n4 = drawable2.getIntrinsicWidth();
            n3 = drawable2.getIntrinsicHeight();
            drawable2.setBounds(0, 0, n4, n3);
        }
    }

    public final boolean applyAlpha(float f5) {
        int n3 = 255;
        float f6 = n3;
        int n4 = f.g(ok1_1.b(f5 * f6), 0, n3);
        this.a.setAlpha(n4);
        return true;
    }

    public final boolean applyColorFilter(TX tX) {
        tX = tX != null ? tX.a : null;
        this.a.setColorFilter((ColorFilter)tX);
        return true;
    }

    public final boolean applyLayoutDirection(bp1_0 object) {
        Object object2 = "layoutDirection";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        int n7 = 0;
        if (n3 >= n4) {
            object2 = du0$a_0.$EnumSwitchMapping$0;
            Object object3 = object.ordinal();
            n3 = 1;
            if ((object3 = (Object)object2[object3]) != n3) {
                n4 = 2;
                if (object3 == n4) {
                    n7 = 1;
                } else {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
            }
            return mn0_0.a(this.a, n7);
        }
        return false;
    }

    public final long getIntrinsicSize-NH-jbRc() {
        return ((C63)this.c.getValue()).a;
    }

    public final void onAbandoned() {
        this.onForgotten();
    }

    public final void onDraw(Kt0 kt0) {
        Intrinsics.checkNotNullParameter(kt0, "<this>");
        iL iL2 = kt0.M0().a();
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.b;
        parcelableSnapshotMutableIntState.o();
        long l2 = kt0.l();
        float f5 = C63.d(l2);
        int n3 = ok1_1.b(f5);
        long l3 = kt0.l();
        float f6 = C63.b(l3);
        int n4 = ok1_1.b(f6);
        Drawable drawable2 = this.a;
        drawable2.setBounds(0, 0, n3, n4);
        try {
            iL2.p();
            kt0 = Nf.a(iL2);
            drawable2.draw((Canvas)kt0);
            return;
        }
        finally {
            iL2.h();
        }
    }

    public final void onForgotten() {
        Drawable drawable2 = this.a;
        boolean bl2 = drawable2 instanceof Animatable;
        if (bl2) {
            Drawable drawable3 = drawable2;
            drawable3 = (Animatable)drawable2;
            drawable3.stop();
        }
        drawable2.setVisible(false, false);
        drawable2.setCallback(null);
    }

    public final void onRemembered() {
        Drawable.Callback callback2 = (Drawable.Callback)this.d.getValue();
        Drawable drawable2 = this.a;
        drawable2.setCallback(callback2);
        boolean bl2 = true;
        drawable2.setVisible(bl2, bl2);
        bl2 = drawable2 instanceof Animatable;
        if (bl2) {
            drawable2 = (Animatable)drawable2;
            drawable2.start();
        }
    }
}

