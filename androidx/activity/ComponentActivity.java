/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Trace
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity$ReportFullyDrawnExecutorImpl;
import androidx.activity.ComponentActivity$b;
import androidx.activity.ComponentActivity$c;
import androidx.activity.ComponentActivity$d;
import androidx.activity.ComponentActivity$e;
import androidx.activity.ComponentActivity$f;
import androidx.activity.ComponentActivity$g;
import androidx.activity.ComponentActivity$h;
import androidx.activity.ComponentActivity$i;
import androidx.activity.R$id;
import androidx.lifecycle.A;
import androidx.lifecycle.E$a;
import androidx.lifecycle.E$b;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.w;
import androidx.lifecycle.w$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public class ComponentActivity
extends androidx.core.app.ComponentActivity
implements sD3,
f,
zs2_1,
h82_0,
O3,
s82,
j92_0,
I82,
O82,
WN1 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final ComponentActivity$c Companion;
    private rd3_0 _viewModelStore;
    private final K3 activityResultRegistry;
    private int contentLayoutId;
    private final r70 contextAwareHelper;
    private final rq1_2 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final rq1_2 fullyDrawnReporter$delegate;
    private final ZN1 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final rq1_2 onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList onConfigurationChangedListeners;
    private final CopyOnWriteArrayList onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList onNewIntentListeners;
    private final CopyOnWriteArrayList onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList onTrimMemoryListeners;
    private final CopyOnWriteArrayList onUserLeaveHintListeners;
    private final ComponentActivity$e reportFullyDrawnExecutor;
    private final ys2_0 savedStateRegistryController;

    static {
        ComponentActivity$c componentActivity$c;
        Companion = componentActivity$c = new Object();
    }

    public ComponentActivity() {
        Object object = new r70();
        this.contextAwareHelper = object;
        Object object2 = new V00(this);
        this.menuHostHelper = object = new ZN1((Runnable)object2);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.savedStateRegistryController = object = new ys2_0(this);
        this.reportFullyDrawnExecutor = object2 = this.createFullyDrawnExecutor();
        object2 = new ComponentActivity$h(this);
        this.fullyDrawnReporter$delegate = object2 = yr1_2.b((Function0)object2);
        this.nextLocalRequestCode = object2 = new AtomicInteger();
        this.activityResultRegistry = object2 = new ComponentActivity$f(this);
        object2 = new CopyOnWriteArrayList();
        this.onConfigurationChangedListeners = object2;
        object2 = new CopyOnWriteArrayList();
        this.onTrimMemoryListeners = object2;
        object2 = new CopyOnWriteArrayList();
        this.onNewIntentListeners = object2;
        object2 = new CopyOnWriteArrayList();
        this.onMultiWindowModeChangedListeners = object2;
        object2 = new CopyOnWriteArrayList();
        this.onPictureInPictureModeChangedListeners = object2;
        object2 = new CopyOnWriteArrayList();
        this.onUserLeaveHintListeners = object2;
        object2 = this.getLifecycle();
        if (object2 != null) {
            object2 = this.getLifecycle();
            n n3 = new W00(this);
            ((i)object2).a(n3);
            object2 = this.getLifecycle();
            super(this);
            ((i)object2).a(n3);
            object2 = this.getLifecycle();
            super(this);
            ((i)object2).a(n3);
            ((ys2_0)object).a();
            A.b(this);
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 23;
            if (n4 <= n7) {
                object = this.getLifecycle();
                object2 = new Te1(this);
                ((i)object).a((lu1)object2);
            }
            object = this.getSavedStateRegistry();
            object2 = new Y00(this);
            ((xs2_1)object).c(ACTIVITY_RESULT_TAG, (xS2$b)object2);
            object = new Z00(this);
            this.addOnContextAvailableListener((u82_0)object);
            object = new ComponentActivity$g(this);
            this.defaultViewModelProviderFactory$delegate = object = yr1_2.b((Function0)object);
            object = new ComponentActivity$i(this);
            this.onBackPressedDispatcher$delegate = object = yr1_2.b((Function0)object);
            return;
        }
        object2 = "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public ComponentActivity(int n3) {
        this();
        this.contentLayoutId = n3;
    }

    private static final void _init_$lambda$2(ComponentActivity componentActivity, mu1_1 object, i$a i$a) {
        String string2 = "<anonymous parameter 0>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        object = i$a.ON_STOP;
        if (i$a == object && (componentActivity = componentActivity.getWindow()) != null && (componentActivity = componentActivity.peekDecorView()) != null) {
            componentActivity.cancelPendingInputEvents();
        }
    }

    private static final void _init_$lambda$3(ComponentActivity object, mu1_1 object2, i$a i$a) {
        String string2 = "<anonymous parameter 0>";
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        object2 = i$a.ON_DESTROY;
        if (i$a == object2) {
            object2 = ((ComponentActivity)object).contextAwareHelper;
            i$a = null;
            ((r70)object2).b = null;
            boolean bl2 = object.isChangingConfigurations();
            if (!bl2) {
                object2 = ((ComponentActivity)object).getViewModelStore();
                ((rd3_0)object2).a();
            }
            object = ((ComponentActivity)object).reportFullyDrawnExecutor;
            object.h();
        }
    }

    private static final Bundle _init_$lambda$4(ComponentActivity object) {
        Bundle bundle = new Bundle();
        object = ((ComponentActivity)object).activityResultRegistry;
        object.getClass();
        Intrinsics.checkNotNullParameter(bundle, "outState");
        Object object2 = ((K3)object).b;
        Collection collection = ((LinkedHashMap)object2).values();
        Bundle bundle2 = new ArrayList(collection);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", bundle2);
        object2 = ((LinkedHashMap)object2).keySet();
        bundle2 = new ArrayList(object2);
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", bundle2);
        object2 = ((K3)object).d;
        bundle2 = new ArrayList(object2);
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", bundle2);
        object = ((K3)object).g;
        bundle2 = new Bundle((Bundle)object);
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", bundle2);
        return bundle;
    }

    private static final void _init_$lambda$5(ComponentActivity object, Context object2) {
        Intrinsics.checkNotNullParameter(object2, "it");
        object2 = ((ComponentActivity)object).getSavedStateRegistry();
        Object object3 = ACTIVITY_RESULT_TAG;
        object2 = ((xs2_1)object2).a((String)object3);
        if (object2 != null) {
            object = ((ComponentActivity)object).activityResultRegistry;
            object.getClass();
            object3 = object2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList arrayList = object2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (arrayList != null && object3 != null) {
                ArrayList arrayList2;
                ArrayList arrayList3 = object2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (arrayList3 != null) {
                    arrayList2 = ((K3)object).d;
                    arrayList2.addAll(arrayList3);
                }
                object2 = object2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                arrayList3 = ((K3)object).g;
                if (object2 != null) {
                    arrayList3.putAll((Bundle)object2);
                }
                int n3 = arrayList.size();
                arrayList2 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    int n4;
                    Object object4;
                    Object object5 = (String)arrayList.get(i3);
                    LinkedHashMap linkedHashMap = ((K3)object).b;
                    boolean bl2 = linkedHashMap.containsKey(object5);
                    LinkedHashMap linkedHashMap2 = ((K3)object).a;
                    if (bl2) {
                        object4 = (Integer)linkedHashMap.remove(object5);
                        n4 = arrayList3.containsKey((String)object5);
                        if (n4 == 0) {
                            object5 = TypeIntrinsics.asMutableMap(linkedHashMap2);
                            object5.remove(object4);
                        }
                    }
                    object5 = ((ArrayList)object3).get(i3);
                    Intrinsics.checkNotNullExpressionValue(object5, "rcs[i]");
                    n4 = ((Number)object5).intValue();
                    object4 = arrayList.get(i3);
                    Intrinsics.checkNotNullExpressionValue(object4, "keys[i]");
                    object4 = (String)object4;
                    Integer n7 = n4;
                    linkedHashMap2.put(n7, object4);
                    object5 = n4;
                    linkedHashMap.put(object4, object5);
                }
            }
        }
    }

    public static final /* synthetic */ void access$addObserverForBackInvoker(ComponentActivity componentActivity, d82_0 d82_02) {
        componentActivity.addObserverForBackInvoker(d82_02);
    }

    public static final /* synthetic */ void access$ensureViewModelStore(ComponentActivity componentActivity) {
        componentActivity.ensureViewModelStore();
    }

    public static final /* synthetic */ ComponentActivity$e access$getReportFullyDrawnExecutor$p(ComponentActivity componentActivity) {
        return componentActivity.reportFullyDrawnExecutor;
    }

    public static final /* synthetic */ void access$onBackPressed$s1027565324(ComponentActivity componentActivity) {
        super.onBackPressed();
    }

    private final void addObserverForBackInvoker(d82_0 d82_02) {
        i i3 = this.getLifecycle();
        a10_0 a10_02 = new a10_0(this, d82_02);
        i3.a(a10_02);
    }

    private static final void addObserverForBackInvoker$lambda$7(d82_0 d82_02, ComponentActivity componentActivity, mu1_1 object, i$a i$a) {
        String string2 = "<anonymous parameter 0>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        object = i$a.ON_CREATE;
        if (i$a == object) {
            componentActivity = ComponentActivity$b.a(componentActivity);
            d82_02.getClass();
            object = "invoker";
            Intrinsics.checkNotNullParameter(componentActivity, (String)object);
            d82_02.f = componentActivity;
            boolean bl2 = d82_02.h;
            d82_02.e(bl2);
        }
    }

    private final ComponentActivity$e createFullyDrawnExecutor() {
        ComponentActivity$ReportFullyDrawnExecutorImpl componentActivity$ReportFullyDrawnExecutorImpl = new ComponentActivity$ReportFullyDrawnExecutorImpl(this);
        return componentActivity$ReportFullyDrawnExecutorImpl;
    }

    private final void ensureViewModelStore() {
        Object object = this._viewModelStore;
        if (object == null) {
            object = (ComponentActivity$d)this.getLastNonConfigurationInstance();
            if (object != null) {
                this._viewModelStore = object = ((ComponentActivity$d)object).b;
            }
            if ((object = this._viewModelStore) == null) {
                this._viewModelStore = object = new rd3_0();
            }
        }
    }

    public static /* synthetic */ void f2(d82_0 d82_02, ComponentActivity componentActivity, mu1_1 mu1_12, i$a i$a) {
        ComponentActivity.addObserverForBackInvoker$lambda$7(d82_02, componentActivity, mu1_12, i$a);
    }

    public static /* synthetic */ void g2(ComponentActivity componentActivity, Context context) {
        ComponentActivity._init_$lambda$5(componentActivity, context);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public static /* synthetic */ void h2(ComponentActivity componentActivity) {
        ComponentActivity.menuHostHelper$lambda$0(componentActivity);
    }

    public static /* synthetic */ void i2(ComponentActivity componentActivity, mu1_1 mu1_12, i$a i$a) {
        ComponentActivity._init_$lambda$2(componentActivity, mu1_12, i$a);
    }

    public static /* synthetic */ void j2(ComponentActivity componentActivity, mu1_1 mu1_12, i$a i$a) {
        ComponentActivity._init_$lambda$3(componentActivity, mu1_12, i$a);
    }

    public static /* synthetic */ Bundle k2(ComponentActivity componentActivity) {
        return ComponentActivity._init_$lambda$4(componentActivity);
    }

    private static final void menuHostHelper$lambda$0(ComponentActivity componentActivity) {
        componentActivity.invalidateMenu();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initializeViewTreeOwners();
        ComponentActivity$e componentActivity$e = this.reportFullyDrawnExecutor;
        View view2 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view2, "window.decorView");
        componentActivity$e.K(view2);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(fo1_0 fo1_02) {
        Intrinsics.checkNotNullParameter(fo1_02, "provider");
        ZN1 zN1 = this.menuHostHelper;
        zN1.b.add(fo1_02);
        zN1.a.run();
    }

    public void addMenuProvider(fo1_0 fo1_02, mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(fo1_02, "provider");
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
        this.menuHostHelper.a(fo1_02, mu1_12);
    }

    public void addMenuProvider(fo1_0 fo1_02, mu1_1 mu1_12, i$b i$b) {
        Intrinsics.checkNotNullParameter(fo1_02, "provider");
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
        Intrinsics.checkNotNullParameter((Object)i$b, "state");
        this.menuHostHelper.b(fo1_02, mu1_12, i$b);
    }

    public final void addOnConfigurationChangedListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onConfigurationChangedListeners.add(p60_02);
    }

    public final void addOnContextAvailableListener(u82_0 u82_02) {
        String string2 = "listener";
        Intrinsics.checkNotNullParameter(u82_02, string2);
        r70 r702 = this.contextAwareHelper;
        r702.getClass();
        Intrinsics.checkNotNullParameter(u82_02, string2);
        string2 = r702.b;
        if (string2 != null) {
            u82_02.a((Context)string2);
        }
        r702.a.add(u82_02);
    }

    public final void addOnMultiWindowModeChangedListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onMultiWindowModeChangedListeners.add(p60_02);
    }

    public final void addOnNewIntentListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onNewIntentListeners.add(p60_02);
    }

    public final void addOnPictureInPictureModeChangedListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onPictureInPictureModeChangedListeners.add(p60_02);
    }

    public final void addOnTrimMemoryListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onTrimMemoryListeners.add(p60_02);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "listener");
        this.onUserLeaveHintListeners.add(runnable2);
    }

    public final K3 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public Wd0 getDefaultViewModelCreationExtras() {
        Object object;
        or1_2 or1_22 = new or1_2(0);
        Object object2 = this.getApplication();
        if (object2 != null) {
            object2 = E$a.c;
            object = this.getApplication();
            String string2 = "application";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            or1_22.b((Wd0$b)object2, object);
        }
        object2 = A.a;
        or1_22.b((Wd0$b)object2, this);
        object2 = A.b;
        or1_22.b((Wd0$b)object2, this);
        object2 = this.getIntent();
        object2 = object2 != null ? object2.getExtras() : null;
        if (object2 != null) {
            object = A.c;
            or1_22.b((Wd0$b)object, object2);
        }
        return or1_22;
    }

    public E$b getDefaultViewModelProviderFactory() {
        return (E$b)this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public qX0 getFullyDrawnReporter() {
        return (qX0)this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        Object object = (ComponentActivity$d)this.getLastNonConfigurationInstance();
        object = object != null ? ((ComponentActivity$d)object).a : null;
        return object;
    }

    public i getLifecycle() {
        return super.getLifecycle();
    }

    public final d82_0 getOnBackPressedDispatcher() {
        return (d82_0)this.onBackPressedDispatcher$delegate.getValue();
    }

    public final xs2_1 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    public rd3_0 getViewModelStore() {
        Object object = this.getApplication();
        if (object != null) {
            this.ensureViewModelStore();
            object = this._viewModelStore;
            Intrinsics.checkNotNull(object);
            return object;
        }
        String string2 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public void initializeViewTreeOwners() {
        View view = this.getWindow().getDecorView();
        String string2 = "window.decorView";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        VD3.b(view, this);
        view = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view, string2);
        ae3_0.b(view, this);
        view = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view, string2);
        ZD3.b(view, this);
        view = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view, string2);
        YD3.a(view, this);
        view = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view, string2);
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        int n3 = R$id.report_drawn;
        view.setTag(n3, (Object)this);
    }

    public void invalidateMenu() {
        this.invalidateOptionsMenu();
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        K3 k3 = this.activityResultRegistry;
        boolean bl2 = k3.a(n3, n4, intent);
        if (!bl2) {
            super.onActivityResult(n3, n4, intent);
        }
    }

    public void onBackPressed() {
        this.getOnBackPressedDispatcher().d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator iterator = this.onConfigurationChangedListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            p60_0 p60_02 = (p60_0)iterator.next();
            p60_02.accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean bl2;
        this.savedStateRegistryController.b(bundle);
        Object object = this.contextAwareHelper;
        object.getClass();
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        ((r70)object).b = this;
        object = ((r70)object).a.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (u82_0)object.next();
            object2.a((Context)this);
        }
        super.onCreate(bundle);
        int n3 = w.b;
        w$b.b(this);
        n3 = this.contentLayoutId;
        if (n3 != 0) {
            this.setContentView(n3);
        }
    }

    public boolean onCreatePanelMenu(int n3, Menu menu2) {
        String string2 = "menu";
        Intrinsics.checkNotNullParameter(menu2, string2);
        if (n3 == 0) {
            boolean bl2;
            super.onCreatePanelMenu(n3, menu2);
            Object object = this.menuHostHelper;
            string2 = this.getMenuInflater();
            object = ((ZN1)object).b.iterator();
            while (bl2 = object.hasNext()) {
                fo1_0 fo1_02 = (fo1_0)object.next();
                fo1_02.d(menu2, (MenuInflater)string2);
            }
        }
        return true;
    }

    public boolean onMenuItemSelected(int n3, MenuItem menuItem) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        boolean bl2 = super.onMenuItemSelected(n3, menuItem);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        bl2 = false;
        string2 = null;
        if (n3 == 0) {
            block3: {
                boolean bl4;
                Iterator iterator = this.menuHostHelper.b.iterator();
                while (bl4 = iterator.hasNext()) {
                    fo1_0 fo1_02 = (fo1_0)iterator.next();
                    bl4 = fo1_02.c(menuItem);
                    if (!bl4) continue;
                    break block3;
                }
                bl3 = false;
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public void onMultiWindowModeChanged(boolean bl2) {
        boolean bl3;
        boolean bl4 = this.dispatchingOnMultiWindowModeChanged;
        if (bl4) {
            return;
        }
        Iterator iterator = this.onMultiWindowModeChangedListeners.iterator();
        while (bl3 = iterator.hasNext()) {
            p60_0 p60_02 = (p60_0)iterator.next();
            WQ1 wQ1 = new WQ1(bl2);
            p60_02.accept(wQ1);
        }
    }

    public void onMultiWindowModeChanged(boolean bl2, Configuration configuration) {
        boolean bl3;
        String string2 = "newConfig";
        Intrinsics.checkNotNullParameter(configuration, string2);
        this.dispatchingOnMultiWindowModeChanged = true;
        Iterator iterator = null;
        super.onMultiWindowModeChanged(bl2, configuration);
        iterator = this.onMultiWindowModeChangedListeners.iterator();
        while (bl3 = iterator.hasNext()) {
            p60_0 p60_02 = (p60_0)iterator.next();
            Intrinsics.checkNotNullParameter(configuration, string2);
            WQ1 wQ1 = new WQ1(bl2);
            p60_02.accept(wQ1);
        }
        return;
        finally {
            this.dispatchingOnMultiWindowModeChanged = false;
        }
    }

    public void onNewIntent(Intent intent) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator iterator = this.onNewIntentListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            p60_0 p60_02 = (p60_0)iterator.next();
            p60_02.accept(intent);
        }
    }

    public void onPanelClosed(int n3, Menu menu2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Iterator iterator = this.menuHostHelper.b.iterator();
        while (bl2 = iterator.hasNext()) {
            fo1_0 fo1_02 = (fo1_0)iterator.next();
            fo1_02.a(menu2);
        }
        super.onPanelClosed(n3, menu2);
    }

    public void onPictureInPictureModeChanged(boolean bl2) {
        boolean bl3;
        boolean bl4 = this.dispatchingOnPictureInPictureModeChanged;
        if (bl4) {
            return;
        }
        Iterator iterator = this.onPictureInPictureModeChangedListeners.iterator();
        while (bl3 = iterator.hasNext()) {
            p60_0 p60_02 = (p60_0)iterator.next();
            bs2_0 bs2_02 = new bs2_0(bl2);
            p60_02.accept(bs2_02);
        }
    }

    public void onPictureInPictureModeChanged(boolean bl2, Configuration configuration) {
        boolean bl3;
        String string2 = "newConfig";
        Intrinsics.checkNotNullParameter(configuration, string2);
        this.dispatchingOnPictureInPictureModeChanged = true;
        Iterator iterator = null;
        super.onPictureInPictureModeChanged(bl2, configuration);
        iterator = this.onPictureInPictureModeChangedListeners.iterator();
        while (bl3 = iterator.hasNext()) {
            p60_0 p60_02 = (p60_0)iterator.next();
            Intrinsics.checkNotNullParameter(configuration, string2);
            bs2_0 bs2_02 = new bs2_0(bl2);
            p60_02.accept(bs2_02);
        }
        return;
        finally {
            this.dispatchingOnPictureInPictureModeChanged = false;
        }
    }

    public boolean onPreparePanel(int n3, View object, Menu menu2) {
        String string2 = "menu";
        Intrinsics.checkNotNullParameter(menu2, string2);
        if (n3 == 0) {
            boolean bl2;
            super.onPreparePanel(n3, (View)object, menu2);
            Iterator iterator = this.menuHostHelper.b.iterator();
            while (bl2 = iterator.hasNext()) {
                object = (fo1_0)iterator.next();
                object.b(menu2);
            }
        }
        return true;
    }

    public void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        int n4;
        Intrinsics.checkNotNullParameter(stringArray, "permissions");
        Intrinsics.checkNotNullParameter(nArray, "grantResults");
        K3 k3 = this.activityResultRegistry;
        Intent intent = new Intent();
        intent = intent.putExtra("androidx.activity.result.contract.extra.PERMISSIONS", stringArray);
        String string2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";
        intent = intent.putExtra(string2, nArray);
        int n7 = -1;
        int n8 = k3.a(n3, n7, intent);
        if (n8 == 0 && (n8 = Build.VERSION.SDK_INT) >= (n4 = 23)) {
            super.onRequestPermissionsResult(n3, stringArray, nArray);
        }
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        ComponentActivity$d componentActivity$d;
        Object object = this.onRetainCustomNonConfigurationInstance();
        rd3_0 rd3_02 = this._viewModelStore;
        if (rd3_02 == null && (componentActivity$d = (ComponentActivity$d)this.getLastNonConfigurationInstance()) != null) {
            rd3_02 = componentActivity$d.b;
        }
        if (rd3_02 == null && object == null) {
            return null;
        }
        componentActivity$d = new ComponentActivity$d();
        componentActivity$d.a = object;
        componentActivity$d.b = rd3_02;
        return componentActivity$d;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        i i3 = this.getLifecycle();
        boolean bl2 = i3 instanceof o;
        if (bl2) {
            i3 = this.getLifecycle();
            Intrinsics.checkNotNull(i3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            i3 = (o)i3;
            i$b i$b = i$b.CREATED;
            ((o)i3).h(i$b);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    public void onTrimMemory(int n3) {
        boolean bl2;
        super.onTrimMemory(n3);
        Iterator iterator = this.onTrimMemoryListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            p60_0 p60_02 = (p60_0)iterator.next();
            Integer n4 = n3;
            p60_02.accept(n4);
        }
    }

    public void onUserLeaveHint() {
        boolean bl2;
        super.onUserLeaveHint();
        Iterator iterator = this.onUserLeaveHintListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            Runnable runnable2 = (Runnable)iterator.next();
            runnable2.run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final I3 registerForActivityResult(x3 x32, K3 k3, w3 w34) {
        Intrinsics.checkNotNullParameter(x32, "contract");
        Intrinsics.checkNotNullParameter(k3, "registry");
        Intrinsics.checkNotNullParameter(w34, "callback");
        CharSequence charSequence = new StringBuilder("activity_rq#");
        int n3 = this.nextLocalRequestCode.getAndIncrement();
        charSequence.append(n3);
        charSequence = charSequence.toString();
        return k3.c((String)charSequence, this, x32, w34);
    }

    public final I3 registerForActivityResult(x3 x32, w3 w34) {
        Intrinsics.checkNotNullParameter(x32, "contract");
        Intrinsics.checkNotNullParameter(w34, "callback");
        K3 k3 = this.activityResultRegistry;
        return this.registerForActivityResult(x32, k3, w34);
    }

    public void removeMenuProvider(fo1_0 fo1_02) {
        Intrinsics.checkNotNullParameter(fo1_02, "provider");
        this.menuHostHelper.c(fo1_02);
    }

    public final void removeOnConfigurationChangedListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onConfigurationChangedListeners.remove(p60_02);
    }

    public final void removeOnContextAvailableListener(u82_0 u82_02) {
        String string2 = "listener";
        Intrinsics.checkNotNullParameter(u82_02, string2);
        r70 r702 = this.contextAwareHelper;
        r702.getClass();
        Intrinsics.checkNotNullParameter(u82_02, string2);
        r702.a.remove(u82_02);
    }

    public final void removeOnMultiWindowModeChangedListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onMultiWindowModeChangedListeners.remove(p60_02);
    }

    public final void removeOnNewIntentListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onNewIntentListeners.remove(p60_02);
    }

    public final void removeOnPictureInPictureModeChangedListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onPictureInPictureModeChangedListeners.remove(p60_02);
    }

    public final void removeOnTrimMemoryListener(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        this.onTrimMemoryListeners.remove(p60_02);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "listener");
        this.onUserLeaveHintListeners.remove(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reportFullyDrawn() {
        Throwable throwable2;
        block3: {
            Object object;
            block2: {
                try {
                    boolean bl2 = gp3_0.b();
                    if (!bl2) break block2;
                    object = "reportFullyDrawn() for ComponentActivity";
                    object = gp3_0.c((String)object);
                    Trace.beginSection((String)object);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            super.reportFullyDrawn();
            object = this.getFullyDrawnReporter();
            ((qX0)object).a();
            Trace.endSection();
            return;
        }
        Trace.endSection();
        throw throwable2;
    }

    public void setContentView(int n3) {
        this.initializeViewTreeOwners();
        ComponentActivity$e componentActivity$e = this.reportFullyDrawnExecutor;
        View view = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view, "window.decorView");
        componentActivity$e.K(view);
        super.setContentView(n3);
    }

    public void setContentView(View view) {
        this.initializeViewTreeOwners();
        ComponentActivity$e componentActivity$e = this.reportFullyDrawnExecutor;
        View view2 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view2, "window.decorView");
        componentActivity$e.K(view2);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initializeViewTreeOwners();
        ComponentActivity$e componentActivity$e = this.reportFullyDrawnExecutor;
        View view2 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view2, "window.decorView");
        componentActivity$e.K(view2);
        super.setContentView(view, layoutParams);
    }

    public void startActivityForResult(Intent intent, int n3) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, n3);
    }

    public void startActivityForResult(Intent intent, int n3, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, n3, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8) {
        Intrinsics.checkNotNullParameter(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, n3, intent, n4, n7, n8);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, n3, intent, n4, n7, n8, bundle);
    }
}

