/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AndroidRuntimeException
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 */
package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment$1;
import androidx.fragment.app.Fragment$3;
import androidx.fragment.app.Fragment$4;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.Fragment$a;
import androidx.fragment.app.Fragment$b;
import androidx.fragment.app.Fragment$c;
import androidx.fragment.app.Fragment$d;
import androidx.fragment.app.Fragment$e;
import androidx.fragment.app.Fragment$f;
import androidx.fragment.app.Fragment$g;
import androidx.fragment.app.Fragment$h;
import androidx.fragment.app.Fragment$i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import androidx.fragment.app.l;
import androidx.fragment.app.n;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.A;
import androidx.lifecycle.E$a;
import androidx.lifecycle.E$a$a;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b_0;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public class Fragment
implements ComponentCallbacks,
View.OnCreateContextMenuListener,
mu1_1,
sD3,
f,
zs2_1 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = 255;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    Fragment$h mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    E$b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    lw0_0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    o mLifecycleRegistry;
    i$b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final Fragment$i mSavedStateAttachListener;
    ys2_0 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray mSavedViewState;
    int mState = -1;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    l mViewLifecycleOwner;
    zr1_1 mViewLifecycleOwnerLiveData;
    String mWho;

    static {
        Object object;
        USE_DEFAULT_TRANSITION = object = new Object();
    }

    public Fragment() {
        boolean bl2;
        Object object = UUID.randomUUID().toString();
        this.mWho = object;
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = object = new FragmentManager();
        this.mMenuVisible = bl2 = true;
        this.mUserVisibleHint = bl2;
        this.mPostponedDurationRunnable = object = new Fragment$1(this);
        object = i$b.RESUMED;
        this.mMaxState = object;
        object = new zr1_1();
        this.mViewLifecycleOwnerLiveData = object;
        object = new AtomicInteger();
        this.mNextLocalRequestCode = object;
        object = new ArrayList();
        this.mOnPreAttachedListeners = object;
        object = new Fragment$b(this);
        this.mSavedStateAttachListener = object;
        this.initLifecycle();
    }

    public Fragment(int n3) {
        this();
        this.mContentLayoutId = n3;
    }

    public static /* synthetic */ void Na(Fragment fragment) {
        fragment.lambda$performCreateView$0();
    }

    private Fragment$h ensureAnimationInfo() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            float f5;
            Object object;
            fragment$h = new Object();
            fragment$h.i = null;
            fragment$h.j = object = USE_DEFAULT_TRANSITION;
            fragment$h.k = null;
            fragment$h.l = object;
            fragment$h.m = null;
            fragment$h.n = object;
            fragment$h.q = null;
            fragment$h.r = null;
            fragment$h.s = f5 = 1.0f;
            fragment$h.t = null;
            this.mAnimationInfo = fragment$h;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        i$b i$b = this.mMaxState;
        Object object = i$b.INITIALIZED;
        if (i$b != object && (object = this.mParentFragment) != null) {
            int n3 = i$b.ordinal();
            int n4 = this.mParentFragment.getMinimumMaxLifecycleState();
            return Math.min(n3, n4);
        }
        return i$b.ordinal();
    }

    private Fragment getTargetFragment(boolean bl2) {
        Object object;
        Object object2;
        if (bl2) {
            object2 = zw0_0.a;
            object2 = "fragment";
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Class clazz = new Class("Attempting to get target fragment from fragment ");
            ((StringBuilder)((Object)clazz)).append(this);
            clazz = ((StringBuilder)((Object)clazz)).toString();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object = new Violation(this, (String)((Object)clazz));
            zw0_0.c((Violation)object);
            object2 = zw0_0.a(this);
            clazz = ((zW0$b)object2).a;
            Object object3 = zW0$a.DETECT_TARGET_FRAGMENT_USAGE;
            boolean bl3 = clazz.contains(object3);
            if (bl3 && (bl3 = zw0_0.e((zW0$b)object2, clazz = this.getClass(), (Class)(object3 = GetTargetFragmentUsageViolation.class)))) {
                zw0_0.b((zW0$b)object2, (Violation)object);
            }
        }
        if ((object2 = this.mTarget) != null) {
            return object2;
        }
        object2 = this.mFragmentManager;
        if (object2 != null && (object = this.mTargetWho) != null) {
            return ((FragmentManager)object2).c.b((String)object);
        }
        return null;
    }

    private void initLifecycle() {
        Object object = new o(this);
        this.mLifecycleRegistry = object;
        Intrinsics.checkNotNullParameter(this, "owner");
        this.mSavedStateRegistryController = object = new ys2_0(this);
        this.mDefaultFactory = null;
        object = this.mOnPreAttachedListeners;
        Fragment$i fragment$i = this.mSavedStateAttachListener;
        boolean bl2 = ((ArrayList)object).contains(fragment$i);
        if (!bl2) {
            object = this.mSavedStateAttachListener;
            this.registerOnPreAttachListener((Fragment$i)object);
        }
    }

    public static Fragment instantiate(Context context, String string2) {
        return Fragment.instantiate(context, string2, null);
    }

    public static Fragment instantiate(Context object, String string2, Bundle object2) {
        InstantiationException instantiationException2;
        String string3;
        String string4;
        block17: {
            IllegalAccessException illegalAccessException2;
            block16: {
                NoSuchMethodException noSuchMethodException2;
                block15: {
                    InvocationTargetException invocationTargetException2;
                    block14: {
                        block13: {
                            string4 = ": make sure class name exists, is public, and has an empty constructor that is public";
                            string3 = "Unable to instantiate fragment ";
                            object = object.getClassLoader();
                            object = d.b((ClassLoader)object, string2);
                            Object object3 = null;
                            object = ((Class)object).getConstructor(null);
                            object = ((Constructor)object).newInstance(null);
                            object = (Fragment)object;
                            if (object2 == null) break block13;
                            object3 = object.getClass();
                            object3 = ((Class)object3).getClassLoader();
                            object2.setClassLoader((ClassLoader)object3);
                            try {
                                ((Fragment)object).setArguments((Bundle)object2);
                            }
                            catch (InvocationTargetException invocationTargetException2) {
                                break block14;
                            }
                            catch (NoSuchMethodException noSuchMethodException2) {
                                break block15;
                            }
                            catch (IllegalAccessException illegalAccessException2) {
                                break block16;
                            }
                            catch (InstantiationException instantiationException2) {
                                break block17;
                            }
                        }
                        return object;
                    }
                    string2 = cP.a(string3, string2, ": calling Fragment constructor caused an exception");
                    object2 = new RuntimeException(string2, invocationTargetException2);
                    throw object2;
                }
                string2 = cP.a(string3, string2, ": could not find Fragment constructor");
                object2 = new RuntimeException(string2, noSuchMethodException2);
                throw object2;
            }
            string2 = cP.a(string3, string2, string4);
            object2 = new RuntimeException(string2, illegalAccessException2);
            throw object2;
        }
        string2 = cP.a(string3, string2, string4);
        object2 = new RuntimeException(string2, instantiationException2);
        throw object2;
    }

    private void lambda$performCreateView$0() {
        l l2 = this.mViewLifecycleOwner;
        Bundle bundle = this.mSavedViewRegistryState;
        l2.f.b(bundle);
        this.mSavedViewRegistryState = null;
    }

    private I3 prepareCallInternal(x3 object, NX0 object2, w3 w34) {
        int n3 = this.mState;
        int n4 = 1;
        if (n3 <= n4) {
            AtomicReference atomicReference = new AtomicReference();
            Fragment$g fragment$g = new Fragment$g(this, (NX0)object2, atomicReference, (x3)object, w34);
            this.registerOnPreAttachListener(fragment$g);
            object2 = new Fragment$a(atomicReference, (x3)object);
            return object2;
        }
        object2 = tv0_1.b("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        object = new IllegalStateException((String)object2);
        throw object;
    }

    private void registerOnPreAttachListener(Fragment$i fragment$i) {
        int n3 = this.mState;
        if (n3 >= 0) {
            fragment$i.a();
        } else {
            ArrayList arrayList = this.mOnPreAttachedListeners;
            arrayList.add(fragment$i);
        }
    }

    private void restoreViewState() {
        String string2 = "FragmentManager";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            this.toString();
        }
        string2 = this.mView;
        n3 = 0;
        if (string2 != null) {
            string2 = this.mSavedFragmentState;
            if (string2 != null) {
                String string3 = "savedInstanceState";
                string2 = string2.getBundle(string3);
            } else {
                bl2 = false;
                string2 = null;
            }
            this.restoreViewState((Bundle)string2);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean bl2) {
        Object object;
        Object object2 = this.mAnimationInfo;
        if (object2 != null) {
            object = null;
            ((Fragment$h)object2).u = false;
        }
        if ((object2 = this.mView) != null && (object2 = this.mContainer) != null && (object = this.mFragmentManager) != null) {
            Handler handler;
            object2 = n.i((ViewGroup)object2, (FragmentManager)object);
            ((n)object2).k();
            if (bl2) {
                handler = this.mHost.c;
                object = new Fragment$4((n)object2);
                handler.post((Runnable)object);
            } else {
                ((n)object2).e();
            }
            handler = this.mPostponedHandler;
            if (handler != null) {
                object2 = this.mPostponedDurationRunnable;
                handler.removeCallbacks((Runnable)object2);
                bl2 = false;
                handler = null;
                this.mPostponedHandler = null;
            }
        }
    }

    public cw0_0 createFragmentContainer() {
        Fragment$c fragment$c = new Fragment$c(this);
        return fragment$c;
    }

    public void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        Object object;
        printWriter.print(string2);
        printWriter.print("mFragmentId=#");
        Object object2 = Integer.toHexString(this.mFragmentId);
        printWriter.print((String)object2);
        printWriter.print(" mContainerId=#");
        object2 = Integer.toHexString(this.mContainerId);
        printWriter.print((String)object2);
        printWriter.print(" mTag=");
        object2 = this.mTag;
        printWriter.println((String)object2);
        printWriter.print(string2);
        printWriter.print("mState=");
        int n3 = this.mState;
        printWriter.print(n3);
        printWriter.print(" mWho=");
        object2 = this.mWho;
        printWriter.print((String)object2);
        printWriter.print(" mBackStackNesting=");
        n3 = this.mBackStackNesting;
        printWriter.println(n3);
        printWriter.print(string2);
        printWriter.print("mAdded=");
        n3 = (int)(this.mAdded ? 1 : 0);
        printWriter.print(n3 != 0);
        printWriter.print(" mRemoving=");
        n3 = this.mRemoving;
        printWriter.print(n3 != 0);
        printWriter.print(" mFromLayout=");
        n3 = this.mFromLayout;
        printWriter.print(n3 != 0);
        printWriter.print(" mInLayout=");
        n3 = this.mInLayout;
        printWriter.println(n3 != 0);
        printWriter.print(string2);
        printWriter.print("mHidden=");
        n3 = this.mHidden;
        printWriter.print(n3 != 0);
        printWriter.print(" mDetached=");
        n3 = this.mDetached;
        printWriter.print(n3 != 0);
        printWriter.print(" mMenuVisible=");
        n3 = this.mMenuVisible;
        printWriter.print(n3 != 0);
        printWriter.print(" mHasMenu=");
        n3 = this.mHasMenu;
        printWriter.println(n3 != 0);
        printWriter.print(string2);
        printWriter.print("mRetainInstance=");
        n3 = this.mRetainInstance;
        printWriter.print(n3 != 0);
        printWriter.print(" mUserVisibleHint=");
        n3 = this.mUserVisibleHint;
        printWriter.println(n3 != 0);
        object2 = this.mFragmentManager;
        if (object2 != null) {
            printWriter.print(string2);
            printWriter.print("mFragmentManager=");
            object2 = this.mFragmentManager;
            printWriter.println(object2);
        }
        if ((object2 = this.mHost) != null) {
            printWriter.print(string2);
            printWriter.print("mHost=");
            object2 = this.mHost;
            printWriter.println(object2);
        }
        if ((object2 = this.mParentFragment) != null) {
            printWriter.print(string2);
            printWriter.print("mParentFragment=");
            object2 = this.mParentFragment;
            printWriter.println(object2);
        }
        if ((object2 = this.mArguments) != null) {
            printWriter.print(string2);
            printWriter.print("mArguments=");
            object2 = this.mArguments;
            printWriter.println(object2);
        }
        if ((object2 = this.mSavedFragmentState) != null) {
            printWriter.print(string2);
            printWriter.print("mSavedFragmentState=");
            object2 = this.mSavedFragmentState;
            printWriter.println(object2);
        }
        if ((object2 = this.mSavedViewState) != null) {
            printWriter.print(string2);
            printWriter.print("mSavedViewState=");
            object2 = this.mSavedViewState;
            printWriter.println(object2);
        }
        if ((object2 = this.mSavedViewRegistryState) != null) {
            printWriter.print(string2);
            printWriter.print("mSavedViewRegistryState=");
            object2 = this.mSavedViewRegistryState;
            printWriter.println(object2);
        }
        n3 = 0;
        object2 = this.getTargetFragment(false);
        if (object2 != null) {
            printWriter.print(string2);
            object = "mTarget=";
            printWriter.print((String)object);
            printWriter.print(object2);
            object2 = " mTargetRequestCode=";
            printWriter.print((String)object2);
            n3 = this.mTargetRequestCode;
            printWriter.println(n3);
        }
        printWriter.print(string2);
        object2 = "mPopDirection=";
        printWriter.print((String)object2);
        n3 = this.getPopDirection();
        printWriter.println(n3 != 0);
        n3 = this.getEnterAnim();
        if (n3 != 0) {
            printWriter.print(string2);
            object2 = "getEnterAnim=";
            printWriter.print((String)object2);
            n3 = this.getEnterAnim();
            printWriter.println(n3);
        }
        if ((n3 = this.getExitAnim()) != 0) {
            printWriter.print(string2);
            object2 = "getExitAnim=";
            printWriter.print((String)object2);
            n3 = this.getExitAnim();
            printWriter.println(n3);
        }
        if ((n3 = this.getPopEnterAnim()) != 0) {
            printWriter.print(string2);
            object2 = "getPopEnterAnim=";
            printWriter.print((String)object2);
            n3 = this.getPopEnterAnim();
            printWriter.println(n3);
        }
        if ((n3 = this.getPopExitAnim()) != 0) {
            printWriter.print(string2);
            object2 = "getPopExitAnim=";
            printWriter.print((String)object2);
            n3 = this.getPopExitAnim();
            printWriter.println(n3);
        }
        if ((object2 = this.mContainer) != null) {
            printWriter.print(string2);
            printWriter.print("mContainer=");
            object2 = this.mContainer;
            printWriter.println(object2);
        }
        if ((object2 = this.mView) != null) {
            printWriter.print(string2);
            printWriter.print("mView=");
            object2 = this.mView;
            printWriter.println(object2);
        }
        if ((object2 = this.getAnimatingAway()) != null) {
            printWriter.print(string2);
            printWriter.print("mAnimatingAway=");
            object2 = this.getAnimatingAway();
            printWriter.println(object2);
        }
        if ((object2 = this.getContext()) != null) {
            object2 = Uv1.a(this);
            ((vv1_1)object2).b(string2, fileDescriptor, printWriter, stringArray);
        }
        printWriter.print(string2);
        object2 = new StringBuilder("Child ");
        object = this.mChildFragmentManager;
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(":");
        object2 = ((StringBuilder)object2).toString();
        printWriter.println((String)object2);
        object2 = this.mChildFragmentManager;
        string2 = Ft2.a(string2, "  ");
        ((FragmentManager)object2).v(string2, fileDescriptor, printWriter, stringArray);
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public Fragment findFragmentByWho(String string2) {
        String string3 = this.mWho;
        boolean bl2 = string2.equals(string3);
        if (bl2) {
            return this;
        }
        return this.mChildFragmentManager.c.c(string2);
    }

    public String generateActivityResultKey() {
        StringBuilder stringBuilder = new StringBuilder("fragment_");
        String string2 = this.mWho;
        stringBuilder.append(string2);
        stringBuilder.append("_rq#");
        int n3 = this.mNextLocalRequestCode.getAndIncrement();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final FragmentActivity getActivity() {
        Object object = this.mHost;
        object = object == null ? null : (FragmentActivity)((lw0_0)object).a;
        return object;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Object object = this.mAnimationInfo;
        boolean bl2 = object != null && (object = ((Fragment$h)object).p) != null ? (Boolean)object : true;
        return bl2;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Object object = this.mAnimationInfo;
        boolean bl2 = object != null && (object = ((Fragment$h)object).o) != null ? (Boolean)object : true;
        return bl2;
    }

    public View getAnimatingAway() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return null;
        }
        fragment$h.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        Object object = this.mHost;
        if (object != null) {
            return this.mChildFragmentManager;
        }
        String string2 = tv0_1.b("Fragment ", this, " has not been attached yet.");
        object = new IllegalStateException(string2);
        throw object;
    }

    public Context getContext() {
        lw0_0 lw0_02 = this.mHost;
        lw0_02 = lw0_02 == null ? null : lw0_02.b;
        return lw0_02;
    }

    public Wd0 getDefaultViewModelCreationExtras() {
        int n3;
        Object object;
        boolean bl2;
        Object object2;
        block5: {
            object2 = this.requireContext().getApplicationContext();
            while (bl2 = object2 instanceof ContextWrapper) {
                bl2 = object2 instanceof Application;
                if (bl2) {
                    object2 = (Application)object2;
                    break block5;
                }
                object2 = ((ContextWrapper)object2).getBaseContext();
            }
            object2 = null;
        }
        if (object2 == null && (bl2 = Log.isLoggable((String)(object = "FragmentManager"), (int)(n3 = 3)))) {
            object = this.requireContext().getApplicationContext();
            Objects.toString(object);
        }
        n3 = 0;
        E$a$a e$a$a = null;
        object = new or1_2(0);
        if (object2 != null) {
            e$a$a = E$a.c;
            ((or1_2)object).b(e$a$a, object2);
        }
        object2 = A.a;
        ((or1_2)object).b((Wd0$b)object2, this);
        object2 = A.b;
        ((or1_2)object).b((Wd0$b)object2, this);
        object2 = this.getArguments();
        if (object2 != null) {
            object2 = A.c;
            e$a$a = this.getArguments();
            ((or1_2)object).b((Wd0$b)object2, e$a$a);
        }
        return object;
    }

    public E$b getDefaultViewModelProviderFactory() {
        Object object = this.mFragmentManager;
        if (object != null) {
            object = this.mDefaultFactory;
            if (object == null) {
                int n3;
                Object object2;
                boolean bl2;
                block5: {
                    object = this.requireContext().getApplicationContext();
                    while (bl2 = object instanceof ContextWrapper) {
                        bl2 = object instanceof Application;
                        if (bl2) {
                            object = (Application)object;
                            break block5;
                        }
                        object = ((ContextWrapper)object).getBaseContext();
                    }
                    object = null;
                }
                if (object == null && (bl2 = Log.isLoggable((String)(object2 = "FragmentManager"), (int)(n3 = 3)))) {
                    object2 = this.requireContext().getApplicationContext();
                    Objects.toString(object2);
                }
                Bundle bundle = this.getArguments();
                this.mDefaultFactory = object2 = new b_0((Application)object, this, bundle);
            }
            return this.mDefaultFactory;
        }
        object = new IllegalStateException("Can't access ViewModels from detached fragment");
        throw object;
    }

    public int getEnterAnim() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return 0;
        }
        return fragment$h.b;
    }

    public Object getEnterTransition() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return null;
        }
        return fragment$h.i;
    }

    public e23 getEnterTransitionCallback() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return null;
        }
        return fragment$h.q;
    }

    public int getExitAnim() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return 0;
        }
        return fragment$h.c;
    }

    public Object getExitTransition() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return null;
        }
        return fragment$h.k;
    }

    public e23 getExitTransitionCallback() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return null;
        }
        return fragment$h.r;
    }

    public View getFocusedView() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return null;
        }
        return fragment$h.t;
    }

    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        Object object = this.mHost;
        object = object == null ? null : ((lw0_0)object).e();
        return object;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            layoutInflater = this.performGetLayoutInflater(null);
        }
        return layoutInflater;
    }

    public LayoutInflater getLayoutInflater(Bundle object) {
        object = this.mHost;
        if (object != null) {
            object = ((lw0_0)object).f();
            e e2 = this.mChildFragmentManager.f;
            object.setFactory2((LayoutInflater.Factory2)e2);
            return object;
        }
        object = new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        throw object;
    }

    public i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public Uv1 getLoaderManager() {
        return Uv1.a(this);
    }

    public int getNextTransition() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return 0;
        }
        return fragment$h.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        Object object = this.mFragmentManager;
        if (object != null) {
            return object;
        }
        String string2 = tv0_1.b("Fragment ", this, " not associated with a fragment manager.");
        object = new IllegalStateException(string2);
        throw object;
    }

    public boolean getPopDirection() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return false;
        }
        return fragment$h.a;
    }

    public int getPopEnterAnim() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return 0;
        }
        return fragment$h.d;
    }

    public int getPopExitAnim() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return 0;
        }
        return fragment$h.e;
    }

    public float getPostOnViewCreatedAlpha() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return 1.0f;
        }
        return fragment$h.s;
    }

    public Object getReenterTransition() {
        Object object = this.mAnimationInfo;
        if (object == null) {
            return null;
        }
        object = ((Fragment$h)object).l;
        Object object2 = USE_DEFAULT_TRANSITION;
        if (object == object2) {
            object = this.getExitTransition();
        }
        return object;
    }

    public final Resources getResources() {
        return this.requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        Object object = zw0_0.a;
        object = "fragment";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Intrinsics.checkNotNullParameter(this, (String)object);
        Class clazz = new Class("Attempting to get retain instance for fragment ");
        ((StringBuilder)((Object)clazz)).append(this);
        clazz = ((StringBuilder)((Object)clazz)).toString();
        Intrinsics.checkNotNullParameter(this, (String)object);
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new Violation(this, (String)((Object)clazz));
        zw0_0.c(getRetainInstanceUsageViolation);
        object = zw0_0.a(this);
        clazz = ((zW0$b)object).a;
        Object object2 = zW0$a.DETECT_RETAIN_INSTANCE_USAGE;
        boolean bl2 = clazz.contains(object2);
        if (bl2 && (bl2 = zw0_0.e((zW0$b)object, clazz = this.getClass(), (Class)(object2 = GetRetainInstanceUsageViolation.class)))) {
            zw0_0.b((zW0$b)object, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        Object object = this.mAnimationInfo;
        if (object == null) {
            return null;
        }
        object = ((Fragment$h)object).j;
        Object object2 = USE_DEFAULT_TRANSITION;
        if (object == object2) {
            object = this.getEnterTransition();
        }
        return object;
    }

    public final xs2_1 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return null;
        }
        return fragment$h.m;
    }

    public Object getSharedElementReturnTransition() {
        Object object = this.mAnimationInfo;
        if (object == null) {
            return null;
        }
        object = ((Fragment$h)object).n;
        Object object2 = USE_DEFAULT_TRANSITION;
        if (object == object2) {
            object = this.getSharedElementEnterTransition();
        }
        return object;
    }

    public ArrayList getSharedElementSourceNames() {
        Object object = this.mAnimationInfo;
        if (object != null && (object = ((Fragment$h)object).g) != null) {
            return object;
        }
        object = new Object();
        return object;
    }

    public ArrayList getSharedElementTargetNames() {
        Object object = this.mAnimationInfo;
        if (object != null && (object = ((Fragment$h)object).h) != null) {
            return object;
        }
        object = new Object();
        return object;
    }

    public final String getString(int n3) {
        return this.getResources().getString(n3);
    }

    public final String getString(int n3, Object ... objectArray) {
        return this.getResources().getString(n3, objectArray);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        return this.getTargetFragment(true);
    }

    public final int getTargetRequestCode() {
        Object object = zw0_0.a;
        object = "fragment";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Intrinsics.checkNotNullParameter(this, (String)object);
        Class clazz = new Class("Attempting to get target request code from fragment ");
        ((StringBuilder)((Object)clazz)).append(this);
        clazz = ((StringBuilder)((Object)clazz)).toString();
        Intrinsics.checkNotNullParameter(this, (String)object);
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new Violation(this, (String)((Object)clazz));
        zw0_0.c(getTargetFragmentRequestCodeUsageViolation);
        object = zw0_0.a(this);
        clazz = ((zW0$b)object).a;
        Object object2 = zW0$a.DETECT_TARGET_FRAGMENT_USAGE;
        boolean bl2 = clazz.contains(object2);
        if (bl2 && (bl2 = zw0_0.e((zW0$b)object, clazz = this.getClass(), (Class)(object2 = GetTargetFragmentRequestCodeUsageViolation.class)))) {
            zw0_0.b((zW0$b)object, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int n3) {
        return this.getResources().getText(n3);
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public mu1_1 getViewLifecycleOwner() {
        Object object = this.mViewLifecycleOwner;
        if (object != null) {
            return object;
        }
        String string2 = tv0_1.b("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()");
        object = new IllegalStateException(string2);
        throw object;
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public rd3_0 getViewModelStore() {
        Object object = this.mFragmentManager;
        if (object != null) {
            Object object2;
            int n3;
            int n4 = this.getMinimumMaxLifecycleState();
            if (n4 != (n3 = (object2 = i$b.INITIALIZED).ordinal())) {
                object = this.mFragmentManager.P.c;
                object2 = this.mWho;
                if ((object2 = (rd3_0)((HashMap)object).get(object2)) == null) {
                    object2 = new rd3_0();
                    String string2 = this.mWho;
                    ((HashMap)object).put(string2, object2);
                }
                return object2;
            }
            object = new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            throw object;
        }
        object = new IllegalStateException("Can't access ViewModels from detached fragment");
        throw object;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        String string2;
        this.initLifecycle();
        this.mPreviousWho = string2 = this.mWho;
        this.mWho = string2 = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        tw0_0 tw0_02 = new FragmentManager();
        this.mChildFragmentManager = tw0_02;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        boolean bl2;
        lw0_0 lw0_02 = this.mHost;
        if (lw0_02 != null && (bl2 = this.mAdded)) {
            bl2 = true;
        } else {
            bl2 = false;
            lw0_02 = null;
        }
        return bl2;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        boolean bl2;
        block6: {
            block5: {
                boolean bl3 = this.mHidden;
                if (bl3) break block5;
                FragmentManager fragmentManager = this.mFragmentManager;
                bl2 = false;
                if (fragmentManager == null) break block6;
                Fragment fragment = this.mParentFragment;
                fragmentManager.getClass();
                if (fragment == null) {
                    bl3 = false;
                    fragmentManager = null;
                } else {
                    bl3 = fragment.isHidden();
                }
                if (!bl3) break block6;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final boolean isInBackStack() {
        int n3 = this.mBackStackNesting;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        boolean bl2;
        block3: {
            block2: {
                boolean bl3 = this.mMenuVisible;
                if (!bl3) break block2;
                Object object = this.mFragmentManager;
                bl2 = true;
                if (object == null || (bl3 = (object = this.mParentFragment) == null ? true : ((Fragment)object).isMenuVisible())) break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean isPostponed() {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return false;
        }
        return fragment$h.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        int n3 = this.mState;
        int n4 = 7;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.S();
    }

    public final boolean isVisible() {
        View view;
        int n3 = this.isAdded();
        if (n3 != 0 && (n3 = this.isHidden()) == 0 && (view = this.mView) != null && (view = view.getWindowToken()) != null && (n3 = (view = this.mView).getVisibility()) == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.U();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        String string2 = "FragmentManager";
        n4 = 2;
        n3 = (int)(Log.isLoggable((String)string2, (int)n4) ? 1 : 0);
        if (n3 != 0) {
            this.toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context object) {
        boolean bl2;
        this.mCalled = bl2 = true;
        object = this.mHost;
        if (object == null) {
            bl2 = false;
            object = null;
        } else {
            object = object.a;
        }
        if (object != null) {
            this.mCalled = false;
            this.onAttach((Activity)object);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        int n3;
        this.mCalled = n3 = 1;
        this.restoreChildFragmentState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        int n4 = fragmentManager.w;
        if (n4 < n3) {
            n4 = 0;
            fragmentManager.I = false;
            fragmentManager.J = false;
            g g3 = fragmentManager.P;
            g3.f = false;
            fragmentManager.u(n3);
        }
    }

    public Animation onCreateAnimation(int n3, boolean bl2, int n4) {
        return null;
    }

    public Animator onCreateAnimator(int n3, boolean bl2, int n4) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n3 = this.mContentLayoutId;
        if (n3 != 0) {
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return this.getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean bl2) {
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context object, AttributeSet attributeSet, Bundle bundle) {
        boolean bl2;
        this.mCalled = bl2 = true;
        object = this.mHost;
        if (object == null) {
            bl2 = false;
            object = null;
        } else {
            object = object.a;
        }
        if (object != null) {
            this.mCalled = false;
            this.onInflate((Activity)object, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean bl2) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu2) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean bl2) {
    }

    public void onPrepareOptionsMenu(Menu menu2) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean bl2) {
    }

    public void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle object) {
        this.mChildFragmentManager.U();
        this.mState = 3;
        String string2 = null;
        this.mCalled = false;
        this.onActivityCreated((Bundle)object);
        boolean bl2 = this.mCalled;
        if (bl2) {
            this.restoreViewState();
            object = this.mChildFragmentManager;
            ((FragmentManager)object).I = false;
            ((FragmentManager)object).J = false;
            ((FragmentManager)object).P.f = false;
            ((FragmentManager)object).u(4);
            return;
        }
        string2 = tv0_1.b("Fragment ", this, " did not call through to super.onActivityCreated()");
        object = new AndroidRuntimeException(string2);
        throw object;
    }

    public void performAttach() {
        Object object;
        boolean bl2;
        Object object2 = this.mOnPreAttachedListeners.iterator();
        while (bl2 = object2.hasNext()) {
            object = (Fragment$i)object2.next();
            ((Fragment$i)object).a();
        }
        this.mOnPreAttachedListeners.clear();
        object2 = this.mChildFragmentManager;
        object = this.mHost;
        Object object3 = this.createFragmentContainer();
        ((FragmentManager)object2).b((lw0_0)object, (cw0_0)object3, this);
        object2 = null;
        this.mState = 0;
        this.mCalled = false;
        object = this.mHost.b;
        this.onAttach((Context)object);
        bl2 = this.mCalled;
        if (bl2) {
            boolean bl3;
            object = this.mFragmentManager.q.iterator();
            while (bl3 = object.hasNext()) {
                object3 = (uW0)object.next();
                object3.a(this);
            }
            object = this.mChildFragmentManager;
            ((FragmentManager)object).I = false;
            ((FragmentManager)object).J = false;
            ((FragmentManager)object).P.f = false;
            ((FragmentManager)object).u(0);
            return;
        }
        object = tv0_1.b("Fragment ", this, " did not call through to super.onAttach()");
        object2 = new AndroidRuntimeException((String)object);
        throw object2;
    }

    public void performConfigurationChanged(Configuration configuration) {
        this.onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        boolean bl2 = this.mHidden;
        if (!bl2) {
            bl2 = this.onContextItemSelected(menuItem);
            if (bl2) {
                return true;
            }
            return this.mChildFragmentManager.j(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle object) {
        int n3;
        Object object2 = this.mChildFragmentManager;
        object2.U();
        this.mState = n3 = 1;
        this.mCalled = false;
        o o3 = this.mLifecycleRegistry;
        Fragment$d fragment$d = new Fragment$d(this);
        o3.a(fragment$d);
        this.onCreate((Bundle)object);
        this.mIsCreated = n3;
        boolean bl2 = this.mCalled;
        if (bl2) {
            object = this.mLifecycleRegistry;
            object2 = i$a.ON_CREATE;
            ((o)object).f((i$a)((Object)object2));
            return;
        }
        object2 = tv0_1.b("Fragment ", this, " did not call through to super.onCreate()");
        object = new AndroidRuntimeException((String)object2);
        throw object;
    }

    public boolean performCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        boolean bl2 = this.mHidden;
        boolean bl3 = false;
        if (!bl2) {
            bl2 = this.mHasMenu;
            if (bl2 && (bl2 = this.mMenuVisible)) {
                this.onCreateOptionsMenu(menu2, menuInflater);
                bl3 = true;
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            boolean bl4 = fragmentManager.k(menu2, menuInflater);
            bl3 |= bl4;
        }
        return bl3;
    }

    public void performCreateView(LayoutInflater object, ViewGroup object2, Bundle bundle) {
        block6: {
            block5: {
                block4: {
                    l l2;
                    boolean bl2;
                    this.mChildFragmentManager.U();
                    this.mPerformedCreateView = bl2 = true;
                    rd3_0 rd3_02 = this.getViewModelStore();
                    SV0 sV0 = new SV0(this, 0);
                    this.mViewLifecycleOwner = l2 = new l(this, rd3_02, sV0);
                    object = this.onCreateView((LayoutInflater)object, (ViewGroup)object2, bundle);
                    this.mView = object;
                    if (object == null) break block4;
                    this.mViewLifecycleOwner.b();
                    object = "FragmentManager";
                    int n3 = 3;
                    boolean bl3 = Log.isLoggable((String)object, (int)n3);
                    if (bl3) {
                        object = this.mView;
                        Objects.toString(object);
                        this.toString();
                    }
                    object = this.mView;
                    object2 = this.mViewLifecycleOwner;
                    VD3.b((View)object, (mu1_1)object2);
                    object = this.mView;
                    object2 = this.mViewLifecycleOwner;
                    ae3_0.b((View)object, (sD3)object2);
                    object = this.mView;
                    object2 = this.mViewLifecycleOwner;
                    ZD3.b((View)object, (zs2_1)object2);
                    object = this.mViewLifecycleOwnerLiveData;
                    object2 = this.mViewLifecycleOwner;
                    ((LiveData)object).k(object2);
                    break block5;
                }
                object = this.mViewLifecycleOwner.e;
                if (object != null) break block6;
                boolean bl4 = false;
                object = null;
                this.mViewLifecycleOwner = null;
            }
            return;
        }
        object = new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        throw object;
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        Object object = this.mLifecycleRegistry;
        Object object2 = i$a.ON_DESTROY;
        object.f((i$a)((Object)object2));
        object = null;
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.onDestroy();
        boolean bl2 = this.mCalled;
        if (bl2) {
            return;
        }
        object2 = tv0_1.b("Fragment ", this, " did not call through to super.onDestroy()");
        object = new AndroidRuntimeException((String)object2);
        throw object;
    }

    public void performDestroyView() {
        boolean bl2;
        Object object = this.mChildFragmentManager;
        int n3 = 1;
        ((FragmentManager)object).u(n3);
        object = this.mView;
        if (object != null) {
            object = this.mViewLifecycleOwner;
            ((l)object).b();
            object = ((l)object).e.d;
            Enum enum_ = i$b.CREATED;
            bl2 = ((i$b)((Object)object)).isAtLeast((i$b)enum_);
            if (bl2) {
                object = this.mViewLifecycleOwner;
                enum_ = i$a.ON_DESTROY;
                ((l)object).a((i$a)enum_);
            }
        }
        this.mState = n3;
        bl2 = false;
        object = null;
        this.mCalled = false;
        this.onDestroyView();
        n3 = (int)(this.mCalled ? 1 : 0);
        if (n3 != 0) {
            ca3 ca32 = Uv1.a((mu1_1)this).b.a;
            int n4 = ca32.j();
            for (int i3 = 0; i3 < n4; ++i3) {
                vv1$a_0 vv1$a_0 = (vv1$a_0)ca32.k(i3);
                vv1$a_0.l();
            }
            this.mPerformedCreateView = false;
            return;
        }
        String string2 = tv0_1.b("Fragment ", this, " did not call through to super.onDestroyView()");
        object = new AndroidRuntimeException(string2);
        throw object;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        this.onDetach();
        Object object = null;
        this.mLayoutInflater = null;
        boolean bl2 = this.mCalled;
        if (bl2) {
            object = this.mChildFragmentManager;
            boolean bl3 = ((FragmentManager)object).K;
            if (!bl3) {
                ((FragmentManager)object).l();
                this.mChildFragmentManager = object = new FragmentManager();
            }
            return;
        }
        String string2 = tv0_1.b("Fragment ", this, " did not call through to super.onDetach()");
        object = new AndroidRuntimeException(string2);
        throw object;
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        bundle = this.onGetLayoutInflater(bundle);
        this.mLayoutInflater = bundle;
        return bundle;
    }

    public void performLowMemory() {
        this.onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean bl2) {
        this.onMultiWindowModeChanged(bl2);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        boolean bl2 = this.mHidden;
        if (!bl2) {
            bl2 = this.mHasMenu;
            if (bl2 && (bl2 = this.mMenuVisible) && (bl2 = this.onOptionsItemSelected(menuItem))) {
                return true;
            }
            return this.mChildFragmentManager.p(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu2) {
        boolean bl2 = this.mHidden;
        if (!bl2) {
            bl2 = this.mHasMenu;
            if (bl2 && (bl2 = this.mMenuVisible)) {
                this.onOptionsMenuClosed(menu2);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.q(menu2);
        }
    }

    public void performPause() {
        Object object;
        Object object2 = this.mChildFragmentManager;
        int n3 = 5;
        ((FragmentManager)object2).u(n3);
        object2 = this.mView;
        if (object2 != null) {
            object2 = this.mViewLifecycleOwner;
            object = i$a.ON_PAUSE;
            ((l)object2).a((i$a)((Object)object));
        }
        object2 = this.mLifecycleRegistry;
        object = i$a.ON_PAUSE;
        ((o)object2).f((i$a)((Object)object));
        this.mState = 6;
        object2 = null;
        this.mCalled = false;
        this.onPause();
        boolean bl2 = this.mCalled;
        if (bl2) {
            return;
        }
        object = tv0_1.b("Fragment ", this, " did not call through to super.onPause()");
        object2 = new AndroidRuntimeException((String)object);
        throw object2;
    }

    public void performPictureInPictureModeChanged(boolean bl2) {
        this.onPictureInPictureModeChanged(bl2);
    }

    public boolean performPrepareOptionsMenu(Menu menu2) {
        boolean bl2 = this.mHidden;
        boolean bl3 = false;
        if (!bl2) {
            bl2 = this.mHasMenu;
            if (bl2 && (bl2 = this.mMenuVisible)) {
                this.onPrepareOptionsMenu(menu2);
                bl3 = true;
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            boolean bl4 = fragmentManager.t(menu2);
            bl3 |= bl4;
        }
        return bl3;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean bl2;
        FragmentManager fragmentManager = this.mFragmentManager;
        fragmentManager.getClass();
        boolean bl3 = FragmentManager.R(this);
        Object object = this.mIsPrimaryNavigationFragment;
        if (object == null || (bl2 = ((Boolean)object).booleanValue()) != bl3) {
            object = bl3;
            this.mIsPrimaryNavigationFragment = object;
            this.onPrimaryNavigationFragmentChanged(bl3);
            fragmentManager = this.mChildFragmentManager;
            fragmentManager.n0();
            object = fragmentManager.A;
            fragmentManager.r((Fragment)object);
        }
    }

    public void performResume() {
        int n3;
        this.mChildFragmentManager.U();
        Object object = this.mChildFragmentManager;
        object.z(true);
        this.mState = n3 = 7;
        String string2 = null;
        this.mCalled = false;
        this.onResume();
        boolean bl2 = this.mCalled;
        if (bl2) {
            Object object2 = this.mLifecycleRegistry;
            i$a i$a = i$a.ON_RESUME;
            ((o)object2).f(i$a);
            object2 = this.mView;
            if (object2 != null) {
                object2 = this.mViewLifecycleOwner.e;
                ((o)object2).f(i$a);
            }
            object2 = this.mChildFragmentManager;
            ((FragmentManager)object2).I = false;
            ((FragmentManager)object2).J = false;
            ((FragmentManager)object2).P.f = false;
            ((FragmentManager)object2).u(n3);
            return;
        }
        string2 = tv0_1.b("Fragment ", this, " did not call through to super.onResume()");
        object = new AndroidRuntimeException(string2);
        throw object;
    }

    public void performSaveInstanceState(Bundle bundle) {
        this.onSaveInstanceState(bundle);
    }

    public void performStart() {
        int n3;
        this.mChildFragmentManager.U();
        Object object = this.mChildFragmentManager;
        object.z(true);
        this.mState = n3 = 5;
        String string2 = null;
        this.mCalled = false;
        this.onStart();
        boolean bl2 = this.mCalled;
        if (bl2) {
            Object object2 = this.mLifecycleRegistry;
            i$a i$a = i$a.ON_START;
            ((o)object2).f(i$a);
            object2 = this.mView;
            if (object2 != null) {
                object2 = this.mViewLifecycleOwner.e;
                ((o)object2).f(i$a);
            }
            object2 = this.mChildFragmentManager;
            ((FragmentManager)object2).I = false;
            ((FragmentManager)object2).J = false;
            ((FragmentManager)object2).P.f = false;
            ((FragmentManager)object2).u(n3);
            return;
        }
        string2 = tv0_1.b("Fragment ", this, " did not call through to super.onStart()");
        object = new AndroidRuntimeException(string2);
        throw object;
    }

    public void performStop() {
        int n3;
        Object object = this.mChildFragmentManager;
        ((FragmentManager)object).J = n3 = 1;
        Object object2 = ((FragmentManager)object).P;
        object2.f = n3;
        n3 = 4;
        ((FragmentManager)object).u(n3);
        object = this.mView;
        if (object != null) {
            object = this.mViewLifecycleOwner;
            object2 = i$a.ON_STOP;
            ((l)object).a((i$a)((Object)object2));
        }
        object = this.mLifecycleRegistry;
        object2 = i$a.ON_STOP;
        ((o)object).f((i$a)((Object)object2));
        this.mState = n3;
        object = null;
        this.mCalled = false;
        this.onStop();
        boolean bl2 = this.mCalled;
        if (bl2) {
            return;
        }
        String string2 = tv0_1.b("Fragment ", this, " did not call through to super.onStop()");
        object = new AndroidRuntimeException(string2);
        throw object;
    }

    public void performViewCreated() {
        String string2;
        Bundle bundle = this.mSavedFragmentState;
        if (bundle != null) {
            string2 = "savedInstanceState";
            bundle = bundle.getBundle(string2);
        } else {
            bundle = null;
        }
        string2 = this.mView;
        this.onViewCreated((View)string2, bundle);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        this.ensureAnimationInfo().u = true;
    }

    public final void postponeEnterTransition(long l2, TimeUnit timeUnit) {
        Runnable runnable2;
        boolean bl2;
        Object object = this.ensureAnimationInfo();
        ((Fragment$h)object).u = bl2 = true;
        object = this.mPostponedHandler;
        if (object != null) {
            runnable2 = this.mPostponedDurationRunnable;
            object.removeCallbacks(runnable2);
        }
        if ((object = this.mFragmentManager) != null) {
            object = ((FragmentManager)object).x.c;
            this.mPostponedHandler = object;
        } else {
            runnable2 = Looper.getMainLooper();
            object = new Handler((Looper)runnable2);
            this.mPostponedHandler = object;
        }
        object = this.mPostponedHandler;
        runnable2 = this.mPostponedDurationRunnable;
        object.removeCallbacks(runnable2);
        object = this.mPostponedHandler;
        runnable2 = this.mPostponedDurationRunnable;
        l2 = timeUnit.toMillis(l2);
        object.postDelayed(runnable2, l2);
    }

    public FragmentActivity q() {
        return this.getActivity();
    }

    public final I3 registerForActivityResult(x3 x32, K3 k3, w3 w34) {
        Fragment$f fragment$f = new Fragment$f(k3);
        return this.prepareCallInternal(x32, fragment$f, w34);
    }

    public final I3 registerForActivityResult(x3 x32, w3 w34) {
        Fragment$e fragment$e = new Fragment$e(this);
        return this.prepareCallInternal(x32, fragment$e, w34);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener)this);
    }

    public final void requestPermissions(String[] object, int n3) {
        Object object2 = this.mHost;
        if (object2 != null) {
            object2 = this.getParentFragmentManager();
            Object object3 = ((FragmentManager)object2).F;
            if (object3 != null) {
                String string2 = this.mWho;
                object3 = new FragmentManager$LaunchedFragmentInfo(string2, n3);
                ((FragmentManager)object2).G.addLast(object3);
                N3 n32 = ((FragmentManager)object2).F;
                n32.a(object);
            } else {
                ((FragmentManager)object2).x.getClass();
                Intrinsics.checkNotNullParameter(this, "fragment");
                String string3 = "permissions";
                Intrinsics.checkNotNullParameter(object, string3);
            }
            return;
        }
        String string4 = tv0_1.b("Fragment ", this, " not attached to Activity");
        object = new IllegalStateException(string4);
        throw object;
    }

    public final FragmentActivity requireActivity() {
        Object object = this.getActivity();
        if (object != null) {
            return object;
        }
        String string2 = tv0_1.b("Fragment ", this, " not attached to an activity.");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final Bundle requireArguments() {
        Object object = this.getArguments();
        if (object != null) {
            return object;
        }
        String string2 = tv0_1.b("Fragment ", this, " does not have any arguments.");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final Context requireContext() {
        Object object = this.getContext();
        if (object != null) {
            return object;
        }
        String string2 = tv0_1.b("Fragment ", this, " not attached to a context.");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final FragmentManager requireFragmentManager() {
        return this.getParentFragmentManager();
    }

    public final Object requireHost() {
        Object object = this.getHost();
        if (object != null) {
            return object;
        }
        String string2 = tv0_1.b("Fragment ", this, " not attached to a host.");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final Fragment requireParentFragment() {
        Object object = this.getParentFragment();
        if (object == null) {
            object = this.getContext();
            String string2 = "Fragment ";
            if (object == null) {
                string2 = tv0_1.b(string2, this, " is not attached to any Fragment or host");
                object = new IllegalStateException(string2);
                throw object;
            }
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(this);
            stringBuilder.append(" is not a child Fragment, it is directly attached to ");
            string2 = this.getContext();
            stringBuilder.append((Object)string2);
            string2 = stringBuilder.toString();
            object = new IllegalStateException(string2);
            throw object;
        }
        return object;
    }

    public final View requireView() {
        Object object = this.getView();
        if (object != null) {
            return object;
        }
        String string2 = tv0_1.b("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView().");
        object = new IllegalStateException(string2);
        throw object;
    }

    public void restoreChildFragmentState() {
        String string2;
        Object object = this.mSavedFragmentState;
        if (object != null && (object = object.getBundle(string2 = "childFragmentManager")) != null) {
            this.mChildFragmentManager.c0((Bundle)object);
            object = this.mChildFragmentManager;
            string2 = null;
            ((FragmentManager)object).I = false;
            ((FragmentManager)object).J = false;
            g g3 = ((FragmentManager)object).P;
            g3.f = false;
            int n3 = 1;
            ((FragmentManager)object).u(n3);
        }
    }

    public final void restoreViewState(Bundle object) {
        Object object2 = this.mSavedViewState;
        if (object2 != null) {
            View view = this.mView;
            view.restoreHierarchyState(object2);
            object2 = null;
            this.mSavedViewState = null;
        }
        object2 = null;
        this.mCalled = false;
        this.onViewStateRestored((Bundle)object);
        boolean bl2 = this.mCalled;
        if (bl2) {
            object = this.mView;
            if (object != null) {
                object = this.mViewLifecycleOwner;
                object2 = i$a.ON_CREATE;
                ((l)object).a((i$a)((Object)object2));
            }
            return;
        }
        object2 = tv0_1.b("Fragment ", this, " did not call through to super.onViewStateRestored()");
        object = new AndroidRuntimeException((String)object2);
        throw object;
    }

    public void setAllowEnterTransitionOverlap(boolean bl2) {
        Boolean bl3;
        Fragment$h fragment$h = this.ensureAnimationInfo();
        fragment$h.p = bl3 = Boolean.valueOf(bl2);
    }

    public void setAllowReturnTransitionOverlap(boolean bl2) {
        Boolean bl3;
        Fragment$h fragment$h = this.ensureAnimationInfo();
        fragment$h.o = bl3 = Boolean.valueOf(bl2);
    }

    public void setAnimations(int n3, int n4, int n7, int n8) {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null && n3 == 0 && n4 == 0 && n7 == 0 && n8 == 0) {
            return;
        }
        this.ensureAnimationInfo().b = n3;
        this.ensureAnimationInfo().c = n4;
        this.ensureAnimationInfo().d = n7;
        this.ensureAnimationInfo().e = n8;
    }

    public void setArguments(Bundle object) {
        boolean bl2;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && (bl2 = this.isStateSaved())) {
            object = new IllegalStateException("Fragment already added and state has been saved");
            throw object;
        }
        this.mArguments = object;
    }

    public void setEnterSharedElementCallback(e23 e232) {
        this.ensureAnimationInfo().q = e232;
    }

    public void setEnterTransition(Object object) {
        this.ensureAnimationInfo().i = object;
    }

    public void setExitSharedElementCallback(e23 e232) {
        this.ensureAnimationInfo().r = e232;
    }

    public void setExitTransition(Object object) {
        this.ensureAnimationInfo().k = object;
    }

    public void setFocusedView(View view) {
        this.ensureAnimationInfo().t = view;
    }

    public void setHasOptionsMenu(boolean bl2) {
        boolean bl3 = this.mHasMenu;
        if (bl3 != bl2) {
            this.mHasMenu = bl2;
            bl2 = this.isAdded();
            if (bl2 && !(bl2 = this.isHidden())) {
                lw0_0 lw0_02 = this.mHost;
                lw0_02.i();
            }
        }
    }

    public void setInitialSavedState(Fragment$SavedState object) {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            if (object == null || (object = ((Fragment$SavedState)object).a) == null) {
                object = null;
            }
            this.mSavedFragmentState = object;
            return;
        }
        object = new IllegalStateException("Fragment already added");
        throw object;
    }

    public void setMenuVisibility(boolean bl2) {
        boolean bl3 = this.mMenuVisible;
        if (bl3 != bl2) {
            this.mMenuVisible = bl2;
            bl2 = this.mHasMenu;
            if (bl2 && (bl2 = this.isAdded()) && !(bl2 = this.isHidden())) {
                lw0_0 lw0_02 = this.mHost;
                lw0_02.i();
            }
        }
    }

    public void setNextTransition(int n3) {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null && n3 == 0) {
            return;
        }
        this.ensureAnimationInfo();
        this.mAnimationInfo.f = n3;
    }

    public void setPopDirection(boolean bl2) {
        Fragment$h fragment$h = this.mAnimationInfo;
        if (fragment$h == null) {
            return;
        }
        this.ensureAnimationInfo().a = bl2;
    }

    public void setPostOnViewCreatedAlpha(float f5) {
        this.ensureAnimationInfo().s = f5;
    }

    public void setReenterTransition(Object object) {
        this.ensureAnimationInfo().l = object;
    }

    public void setRetainInstance(boolean bl2) {
        Object object = zw0_0.a;
        object = "fragment";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Intrinsics.checkNotNullParameter(this, (String)object);
        Class clazz = new Class("Attempting to set retain instance for fragment ");
        ((StringBuilder)((Object)clazz)).append(this);
        clazz = ((StringBuilder)((Object)clazz)).toString();
        Intrinsics.checkNotNullParameter(this, (String)object);
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new Violation(this, (String)((Object)clazz));
        zw0_0.c(setRetainInstanceUsageViolation);
        object = zw0_0.a(this);
        clazz = ((zW0$b)object).a;
        Object object2 = zW0$a.DETECT_RETAIN_INSTANCE_USAGE;
        boolean bl3 = clazz.contains(object2);
        if (bl3 && (bl3 = zw0_0.e((zW0$b)object, clazz = this.getClass(), (Class)(object2 = SetRetainInstanceUsageViolation.class)))) {
            zw0_0.b((zW0$b)object, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = bl2;
        object = this.mFragmentManager;
        if (object != null) {
            if (bl2) {
                g g3 = ((FragmentManager)object).P;
                g3.b(this);
            } else {
                g g5 = ((FragmentManager)object).P;
                g5.e(this);
            }
        } else {
            this.mRetainInstanceChangedWhileDetached = bl2 = true;
        }
    }

    public void setReturnTransition(Object object) {
        this.ensureAnimationInfo().j = object;
    }

    public void setSharedElementEnterTransition(Object object) {
        this.ensureAnimationInfo().m = object;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        this.ensureAnimationInfo();
        Fragment$h fragment$h = this.mAnimationInfo;
        fragment$h.g = arrayList;
        fragment$h.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object object) {
        this.ensureAnimationInfo().n = object;
    }

    public void setTargetFragment(Fragment object, int n3) {
        boolean bl2;
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation;
        Class<?> clazz;
        Object object2;
        if (object != null) {
            object2 = zw0_0.a;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            object2 = "targetFragment";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            clazz = "fragment";
            Intrinsics.checkNotNullParameter(this, (String)((Object)clazz));
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = new StringBuilder("Attempting to set target fragment ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" with request code ");
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append(" for fragment ");
            ((StringBuilder)object2).append(this);
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(this, (String)((Object)clazz));
            setTargetFragmentUsageViolation = new Violation(this, (String)object2);
            zw0_0.c(setTargetFragmentUsageViolation);
            object2 = zw0_0.a(this);
            clazz = ((zW0$b)object2).a;
            Object object3 = zW0$a.DETECT_TARGET_FRAGMENT_USAGE;
            bl2 = clazz.contains(object3);
            if (bl2 && (bl2 = zw0_0.e((zW0$b)object2, clazz = this.getClass(), (Class)(object3 = SetTargetFragmentUsageViolation.class)))) {
                zw0_0.b((zW0$b)object2, setTargetFragmentUsageViolation);
            }
        }
        object2 = this.mFragmentManager;
        setTargetFragmentUsageViolation = null;
        if (object != null) {
            clazz = ((Fragment)object).mFragmentManager;
        } else {
            bl2 = false;
            clazz = null;
        }
        if (object2 != null && clazz != null && object2 != clazz) {
            object = tv0_1.b("Fragment ", (Fragment)object, " must share the same FragmentManager to be set as a target fragment");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        object2 = object;
        while (object2 != null) {
            bl2 = ((Fragment)object2).equals(this);
            if (!bl2) {
                bl2 = false;
                clazz = null;
                object2 = super.getTargetFragment(false);
                continue;
            }
            object2 = new StringBuilder("Setting ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" as the target of ");
            ((StringBuilder)object2).append(this);
            ((StringBuilder)object2).append(" would create a target cycle");
            object = ((StringBuilder)object2).toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        if (object == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else {
            object2 = this.mFragmentManager;
            if (object2 != null && (object2 = ((Fragment)object).mFragmentManager) != null) {
                this.mTargetWho = object = ((Fragment)object).mWho;
                this.mTarget = null;
            } else {
                this.mTargetWho = null;
                this.mTarget = object;
            }
        }
        this.mTargetRequestCode = n3;
    }

    public void setUserVisibleHint(boolean bl2) {
        Object object = zw0_0.a;
        object = "fragment";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = new StringBuilder("Attempting to set user visible hint to ");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(" for fragment ");
        ((StringBuilder)object).append(this);
        object = ((StringBuilder)object).toString();
        SetUserVisibleHintViolation setUserVisibleHintViolation = new Violation(this, (String)object);
        zw0_0.c(setUserVisibleHintViolation);
        object = zw0_0.a(this);
        Object object2 = ((zW0$b)object).a;
        Object object3 = zW0$a.DETECT_SET_USER_VISIBLE_HINT;
        boolean bl3 = object2.contains(object3);
        if (bl3 && (bl3 = zw0_0.e((zW0$b)object, (Class)(object2 = this.getClass()), (Class)(object3 = SetUserVisibleHintViolation.class)))) {
            zw0_0.b((zW0$b)object, setUserVisibleHintViolation);
        }
        int n3 = this.mUserVisibleHint;
        boolean bl4 = false;
        setUserVisibleHintViolation = null;
        bl3 = true;
        int n4 = 5;
        if (n3 == 0 && bl2 && (n3 = this.mState) < n4 && (object = this.mFragmentManager) != null && (n3 = (int)(this.isAdded() ? 1 : 0)) != 0 && (n3 = (int)(this.mIsCreated ? 1 : 0)) != 0) {
            object = this.mFragmentManager;
            h h3 = ((FragmentManager)object).g(this);
            Fragment fragment = h3.c;
            boolean bl5 = fragment.mDeferStart;
            if (bl5) {
                bl5 = ((FragmentManager)object).b;
                if (bl5) {
                    ((FragmentManager)object).L = bl3;
                } else {
                    fragment.mDeferStart = false;
                    h3.i();
                }
            }
        }
        this.mUserVisibleHint = bl2;
        n3 = this.mState;
        if (n3 < n4 && !bl2) {
            bl4 = true;
        }
        this.mDeferStart = bl4;
        object = this.mSavedFragmentState;
        if (object != null) {
            Boolean bl6;
            this.mSavedUserVisibleHint = bl6 = Boolean.valueOf(bl2);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String string2) {
        lw0_0 lw0_02 = this.mHost;
        if (lw0_02 != null) {
            return lw0_02.g(string2);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        this.startActivity(intent, null);
    }

    public void startActivity(Intent object, Bundle object2) {
        lw0_0 lw0_02 = this.mHost;
        if (lw0_02 != null) {
            lw0_02.h(this, (Intent)object, -1, (Bundle)object2);
            return;
        }
        object2 = tv0_1.b("Fragment ", this, " not attached to Activity");
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public void startActivityForResult(Intent intent, int n3) {
        this.startActivityForResult(intent, n3, null);
    }

    public void startActivityForResult(Intent object, int n3, Bundle bundle) {
        Object object2 = this.mHost;
        if (object2 != null) {
            object2 = this.getParentFragmentManager();
            Object object3 = ((FragmentManager)object2).D;
            if (object3 != null) {
                String string2 = this.mWho;
                object3 = new FragmentManager$LaunchedFragmentInfo(string2, n3);
                Object object4 = ((FragmentManager)object2).G;
                ((ArrayDeque)object4).addLast(object3);
                if (bundle != null) {
                    object4 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
                    object.putExtra((String)object4, bundle);
                }
                object4 = ((FragmentManager)object2).D;
                ((N3)object4).a(object);
            } else {
                object2 = ((FragmentManager)object2).x;
                ((lw0_0)object2).h(this, (Intent)object, n3, bundle);
            }
            return;
        }
        String string3 = tv0_1.b("Fragment ", this, " not attached to Activity");
        object = new IllegalStateException(string3);
        throw object;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8, Bundle bundle) {
        Object object;
        Object object2;
        block10: {
            Object object3;
            block13: {
                block14: {
                    block12: {
                        int n10;
                        int n14;
                        Bundle bundle2;
                        int n15;
                        block11: {
                            Object object4;
                            Fragment fragment = this;
                            object2 = intentSender;
                            n15 = n3;
                            bundle2 = bundle;
                            object = this.mHost;
                            if (object == null) break block10;
                            object = "FragmentManager";
                            n14 = 2;
                            n10 = Log.isLoggable((String)object, (int)n14);
                            if (n10 != 0) {
                                this.toString();
                                Objects.toString(intentSender);
                                Objects.toString(intent);
                                Objects.toString(bundle);
                            }
                            object3 = this.getParentFragmentManager();
                            Object object5 = ((FragmentManager)object3).E;
                            if (object5 == null) break block11;
                            if (bundle2 != null) {
                                if (intent == null) {
                                    object5 = new Intent();
                                    object4 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
                                    boolean bl2 = true;
                                    object5.putExtra((String)object4, bl2);
                                } else {
                                    object5 = intent;
                                }
                                boolean n17 = Log.isLoggable((String)object, (int)n14);
                                if (n17) {
                                    bundle.toString();
                                    object5.toString();
                                    Objects.toString(this);
                                }
                                object4 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
                                object5.putExtra((String)object4, bundle2);
                            } else {
                                object5 = intent;
                            }
                            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                            int n16 = n4;
                            object4 = new IntentSenderRequest(intentSender, (Intent)object5, n4, n7);
                            object5 = fragment.mWho;
                            object2 = new FragmentManager$LaunchedFragmentInfo((String)object5, n3);
                            ArrayDeque arrayDeque = ((FragmentManager)object3).G;
                            arrayDeque.addLast(object2);
                            boolean bl2 = Log.isLoggable((String)object, (int)n14);
                            if (bl2) {
                                this.toString();
                            }
                            object = ((FragmentManager)object3).E;
                            ((N3)object).a(object4);
                            break block12;
                        }
                        int n16 = n4;
                        object = ((FragmentManager)object3).x;
                        object.getClass();
                        Intrinsics.checkNotNullParameter(this, "fragment");
                        String string2 = "intent";
                        Intrinsics.checkNotNullParameter(intentSender, string2);
                        n14 = -1;
                        object3 = "Starting intent sender with a requestCode requires a FragmentActivity host";
                        if (n15 != n14) break block13;
                        object = ((lw0_0)object).a;
                        if (object == null) break block14;
                        object2 = intentSender;
                        n15 = n3;
                        string2 = intent;
                        n10 = n4;
                        int n17 = n8;
                        bundle2 = bundle;
                        object.startIntentSenderForResult(intentSender, n3, intent, n4, n7, n8, bundle);
                    }
                    return;
                }
                object2 = object3.toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object2 = object3.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = tv0_1.b("Fragment ", this, " not attached to Activity");
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public void startPostponedEnterTransition() {
        Object object = this.mAnimationInfo;
        if (object != null) {
            object = this.ensureAnimationInfo();
            boolean bl2 = ((Fragment$h)object).u;
            if (bl2) {
                object = this.mHost;
                if (object == null) {
                    object = this.ensureAnimationInfo();
                    Object var3_3 = null;
                    ((Fragment$h)object).u = false;
                } else {
                    Object object2;
                    object = Looper.myLooper();
                    if (object != (object2 = this.mHost.c.getLooper())) {
                        object = this.mHost.c;
                        object2 = new Fragment$3(this);
                        object.postAtFrontOfQueue((Runnable)object2);
                    } else {
                        bl2 = true;
                        this.callStartTransitionListener(bl2);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        String string2 = this.getClass().getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append("{");
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append("} (");
        string2 = this.mWho;
        stringBuilder.append(string2);
        int n3 = this.mFragmentId;
        if (n3 != 0) {
            stringBuilder.append(" id=0x");
            n3 = this.mFragmentId;
            string2 = Integer.toHexString(n3);
            stringBuilder.append(string2);
        }
        if ((string2 = this.mTag) != null) {
            stringBuilder.append(" tag=");
            string2 = this.mTag;
            stringBuilder.append(string2);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public gc3_2 z7() {
        return (gc3_2)this.getContext();
    }
}

