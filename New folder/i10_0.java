/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.window.OnBackInvokedDispatcher
 */
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from i10
 */
public class i10_0
extends Dialog
implements mu1_1,
h82_0,
zs2_1 {
    private o _lifecycleRegistry;
    private final d82_0 onBackPressedDispatcher;
    private final ys2_0 savedStateRegistryController;

    public i10_0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, 0, 2, null);
    }

    public i10_0(Context object, int n3) {
        Intrinsics.checkNotNullParameter(object, "context");
        super(object, n3);
        Intrinsics.checkNotNullParameter(this, "owner");
        super(this);
        this.savedStateRegistryController = object;
        Og og = new Og(this, 1);
        super(og);
        this.onBackPressedDispatcher = object;
    }

    public /* synthetic */ i10_0(Context context, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 &= 2) != 0) {
            n3 = 0;
        }
        this(context, n3);
    }

    public static /* synthetic */ void a(i10_0 i10_02) {
        i10_0.onBackPressedDispatcher$lambda$1(i10_02);
    }

    private final o getLifecycleRegistry() {
        o o3 = this._lifecycleRegistry;
        if (o3 == null) {
            this._lifecycleRegistry = o3 = new o(this);
        }
        return o3;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static final void onBackPressedDispatcher$lambda$1(i10_0 i10_02) {
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public i getLifecycle() {
        return this.getLifecycleRegistry();
    }

    public final d82_0 getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    public xs2_1 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    public void initializeViewTreeOwners() {
        Window window = this.getWindow();
        Intrinsics.checkNotNull(window);
        window = window.getDecorView();
        String string2 = "window!!.decorView";
        Intrinsics.checkNotNullExpressionValue(window, string2);
        VD3.b((View)window, this);
        window = this.getWindow();
        Intrinsics.checkNotNull(window);
        window = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(window, string2);
        YD3.a((View)window, this);
        window = this.getWindow();
        Intrinsics.checkNotNull(window);
        window = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(window, string2);
        ZD3.b((View)window, this);
    }

    public void onBackPressed() {
        this.onBackPressedDispatcher.d();
    }

    public void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        int bl2 = Build.VERSION.SDK_INT;
        int bl3 = 33;
        if (bl2 >= bl3) {
            object2 = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = h10_0.a(this);
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            object2.getClass();
            String string2 = "invoker";
            Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, string2);
            ((d82_0)object2).f = onBackInvokedDispatcher;
            boolean bl4 = ((d82_0)object2).h;
            ((d82_0)object2).e(bl4);
        }
        this.savedStateRegistryController.b((Bundle)object);
        object = this.getLifecycleRegistry();
        object2 = i$a.ON_CREATE;
        ((o)object).f((i$a)((Object)object2));
    }

    public Bundle onSaveInstanceState() {
        Bundle bundle = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundle, "super.onSaveInstanceState()");
        this.savedStateRegistryController.c(bundle);
        return bundle;
    }

    public void onStart() {
        super.onStart();
        o o3 = this.getLifecycleRegistry();
        i$a i$a = i$a.ON_RESUME;
        o3.f(i$a);
    }

    public void onStop() {
        o o3 = this.getLifecycleRegistry();
        i$a i$a = i$a.ON_DESTROY;
        o3.f(i$a);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    public void setContentView(int n3) {
        this.initializeViewTreeOwners();
        super.setContentView(n3);
    }

    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.initializeViewTreeOwners();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}

