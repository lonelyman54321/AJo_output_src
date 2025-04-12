/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.ContextThemeWrapper
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewOutlineProvider
 *  android.view.Window
 */
import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.R$id;
import androidx.compose.ui.R$style;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oq0
 */
public final class oq0_0
extends i10_0 {
    public Function0 a;
    public jq0 b;
    public final View c;
    public final eq0_0 d;
    public final int e;

    public oq0_0(Function0 object, jq0 object2, View object3, bp1_0 bp1_02, Vo0 vo0, UUID object4) {
        Context context = object3.getContext();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        n3 = n3 < n4 && !(n3 = (int)(((jq0)object2).e ? 1 : 0)) ? R$style.FloatingDialogWindowTheme : R$style.DialogWindowTheme;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n3);
        context = null;
        n3 = 2;
        n4 = 0;
        Object object5 = null;
        super((Context)contextThemeWrapper, 0, n3, null);
        this.a = object;
        this.b = object2;
        this.c = object3;
        int n7 = 8;
        float f5 = n7;
        object2 = this.getWindow();
        if (object2 != null) {
            int bl2;
            contextThemeWrapper = object2.getAttributes();
            this.e = bl2 = contextThemeWrapper.softInputMode & 0xF0;
            boolean bl3 = true;
            object2.requestFeature((int)(bl3 ? 1 : 0));
            object2.setBackgroundDrawableResource(17170445);
            n3 = (int)(this.b.e ? 1 : 0);
            ag3_1.a((Window)object2, n3 != 0);
            Context context2 = this.getContext();
            eq0_0 eq0_02 = new eq0_0(context2, (Window)object2);
            int n8 = R$id.compose_view_saveable_id_tag;
            String string2 = "Dialog:";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object4);
            object4 = stringBuilder.toString();
            eq0_02.setTag(n8, object4);
            eq0_02.setClipChildren(false);
            f5 = vo0.J0(f5);
            eq0_02.setElevation(f5);
            object = new ViewOutlineProvider();
            eq0_02.setOutlineProvider((ViewOutlineProvider)object);
            this.d = eq0_02;
            object = object2.getDecorView();
            boolean bl4 = object instanceof ViewGroup;
            if (bl4) {
                object5 = object;
                object5 = (ViewGroup)object;
            }
            if (object5 != null) {
                oq0_0.b((ViewGroup)object5);
            }
            this.setContentView((View)eq0_02);
            object = VD3.a((View)object3);
            VD3.b((View)eq0_02, (mu1_1)object);
            object = ae3_0.a((View)object3);
            ae3_0.b((View)eq0_02, (sD3)object);
            object = ZD3.a((View)object3);
            ZD3.b((View)eq0_02, (zs2_1)object);
            object = this.a;
            object2 = this.b;
            this.c((Function0)object, (jq0)object2, bp1_02);
            object = this.getOnBackPressedDispatcher();
            object2 = new oq0$b_0(this);
            Intrinsics.checkNotNullParameter(object, "<this>");
            Intrinsics.checkNotNullParameter(object2, "onBackPressed");
            object3 = new g82(bl3, (oq0$b_0)object2);
            ((d82_0)object).a(this, (W72)object3);
            return;
        }
        object2 = "Dialog has no window".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        int n3 = viewGroup instanceof eq0_0;
        if (n3 != 0) {
            return;
        }
        n3 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = viewGroup.getChildAt(i3);
            boolean bl2 = object instanceof ViewGroup;
            object = bl2 ? (ViewGroup)object : null;
            if (object == null) continue;
            oq0_0.b((ViewGroup)object);
        }
    }

    public final void c(Function0 object, jq0 jq02, bp1_0 bp1_02) {
        int n3;
        this.a = object;
        this.b = jq02;
        object = jq02.c;
        View view = this.c;
        int n4 = xi.c(view);
        int[] nArray = ax2_0.$EnumSwitchMapping$0;
        Object object2 = ((Enum)object).ordinal();
        object2 = nArray[object2];
        int n7 = 0;
        nArray = null;
        int n8 = 2;
        int n10 = 1;
        if (object2 != n10) {
            if (object2 != n8) {
                n3 = 3;
                if (object2 != n3) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
            } else {
                n4 = 1;
            }
        } else {
            n4 = 0;
            view = null;
        }
        object = this.getWindow();
        Intrinsics.checkNotNull(object);
        n3 = 8192;
        n4 = n4 != 0 ? 8192 : -8193;
        object.setFlags(n4, n3);
        object = oq0$c.$EnumSwitchMapping$0;
        int n14 = bp1_02.ordinal();
        object2 = object[n14];
        if (object2 != n10) {
            if (object2 == n8) {
                n7 = 1;
            } else {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
        }
        object = this.d;
        object.setLayoutDirection(n7);
        n14 = (int)(jq02.d ? 1 : 0);
        if (n14 != 0 && (n4 = (int)(((eq0_0)object).k ? 1 : 0)) == 0 && (view = this.getWindow()) != null) {
            n7 = -2;
            view.setLayout(n7, n7);
        }
        ((eq0_0)object).k = n14;
        object2 = Build.VERSION.SDK_INT;
        n14 = 31;
        if (object2 < n14) {
            object2 = jq02.e;
            if (object2 != 0) {
                object = this.getWindow();
                if (object != null) {
                    int n15 = this.e;
                    object.setSoftInputMode(n15);
                }
            } else {
                object = this.getWindow();
                if (object != null) {
                    int n16 = 16;
                    object.setSoftInputMode(n16);
                }
            }
        }
    }

    public final void cancel() {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl2 = super.onTouchEvent(motionEvent);
        if (bl2) {
            Object object = this.b;
            boolean bl3 = ((jq0)object).b;
            if (bl3) {
                object = this.a;
                object.invoke();
            }
        }
        return bl2;
    }
}

