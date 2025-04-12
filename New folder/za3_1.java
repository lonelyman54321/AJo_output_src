/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Resources$Theme
 *  android.util.TypedValue
 *  android.view.ViewGroup
 *  android.view.ViewGroup$OnHierarchyChangeListener
 */
import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from za3
 */
public final class za3_1
extends Aa3 {
    public final za3$a_0 b;

    public za3_1(Activity activity) {
        za3$a_0 za3$a_0;
        Intrinsics.checkNotNullParameter(activity, "activity");
        super(activity);
        this.b = za3$a_0 = new za3$a_0(this, activity);
    }

    public final void a() {
        Activity activity = this.a;
        Object object = activity.getTheme();
        Intrinsics.checkNotNullExpressionValue(object, "activity.theme");
        TypedValue typedValue = new TypedValue();
        this.b((Resources.Theme)object, typedValue);
        activity = (ViewGroup)activity.getWindow().getDecorView();
        object = this.b;
        activity.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener)object);
    }
}

