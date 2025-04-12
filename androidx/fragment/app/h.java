/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Resources$NotFoundException
 *  android.os.BadParcelableException
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.fragment.R$id;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$d;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.d;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.fragment.app.h$a;
import androidx.fragment.app.h$b;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$a;
import androidx.fragment.app.n$d;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.i$b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class h {
    public final f a;
    public final j b;
    public final Fragment c;
    public boolean d = false;
    public int e;

    public h(f f5, j j3, Fragment fragment) {
        this.e = -1;
        this.a = f5;
        this.b = j3;
        this.c = fragment;
    }

    public h(f f5, j object, Fragment fragment, Bundle bundle) {
        int n3;
        this.e = n3 = -1;
        this.a = f5;
        this.b = object;
        this.c = fragment;
        f5 = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        object = fragment.mTarget;
        object = object != null ? ((Fragment)object).mWho : null;
        fragment.mTargetWho = object;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        f5 = bundle.getBundle("arguments");
        fragment.mArguments = f5;
    }

    public h(f object, j object2, ClassLoader classLoader, d object3, Bundle bundle) {
        boolean bl2;
        int n3;
        this.e = -1;
        this.a = object;
        this.b = object2;
        object = (FragmentState)bundle.getParcelable("state");
        object2 = ((FragmentState)object).a;
        object2 = Fragment.instantiate(((FragmentManager$d)object3).b.x.b, (String)object2, null);
        object3 = ((FragmentState)object).b;
        ((Fragment)object2).mWho = object3;
        ((Fragment)object2).mFromLayout = n3 = ((FragmentState)object).c;
        ((Fragment)object2).mInDynamicContainer = n3 = ((FragmentState)object).d;
        ((Fragment)object2).mRestored = true;
        ((Fragment)object2).mFragmentId = n3 = ((FragmentState)object).e;
        ((Fragment)object2).mContainerId = n3 = ((FragmentState)object).f;
        object3 = ((FragmentState)object).g;
        ((Fragment)object2).mTag = object3;
        n3 = (int)(((FragmentState)object).h ? 1 : 0);
        ((Fragment)object2).mRetainInstance = n3;
        n3 = (int)(((FragmentState)object).i ? 1 : 0);
        ((Fragment)object2).mRemoving = n3;
        n3 = (int)(((FragmentState)object).j ? 1 : 0);
        ((Fragment)object2).mDetached = n3;
        n3 = (int)(((FragmentState)object).k ? 1 : 0);
        ((Fragment)object2).mHidden = n3;
        object3 = i$b.values();
        int n4 = ((FragmentState)object).l;
        ((Fragment)object2).mMaxState = object3 = object3[n4];
        ((Fragment)object2).mTargetWho = object3 = ((FragmentState)object).m;
        ((Fragment)object2).mTargetRequestCode = n3 = ((FragmentState)object).n;
        ((Fragment)object2).mUserVisibleHint = bl2 = ((FragmentState)object).o;
        this.c = object2;
        ((Fragment)object2).mSavedFragmentState = bundle;
        object = bundle.getBundle("arguments");
        if (object != null) {
            object.setClassLoader(classLoader);
        }
        ((Fragment)object2).setArguments((Bundle)object);
        object = "FragmentManager";
        int n7 = 2;
        bl2 = Log.isLoggable((String)object, (int)n7);
        if (bl2) {
            Objects.toString(object2);
        }
    }

    public final void a() {
        Object object;
        Fragment fragment;
        int n3;
        block5: {
            Object object2;
            Object object3;
            int n4;
            n3 = -1;
            fragment = this.c;
            object = FragmentManager.F((View)fragment.mContainer);
            Class<?> clazz = fragment.getParentFragment();
            if (object != null && (n4 = ((Fragment)object).equals(clazz)) == 0) {
                n4 = fragment.mContainerId;
                Class<WrongNestedHierarchyViolation> clazz2 = zw0_0.a;
                clazz2 = "fragment";
                Intrinsics.checkNotNullParameter(fragment, (String)((Object)clazz2));
                object3 = "expectedParentFragment";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(fragment, (String)((Object)clazz2));
                Intrinsics.checkNotNullParameter(object, (String)object3);
                clazz2 = new Class<WrongNestedHierarchyViolation>("Attempting to nest fragment ");
                ((StringBuilder)((Object)clazz2)).append(fragment);
                object3 = " within the view of parent fragment ";
                ((StringBuilder)((Object)clazz2)).append((String)object3);
                ((StringBuilder)((Object)clazz2)).append(object);
                ((StringBuilder)((Object)clazz2)).append(" via container with ID ");
                object = g30.a(n4, " without using parent's childFragmentManager", (StringBuilder)((Object)clazz2));
                object2 = new Violation(fragment, (String)object);
                zw0_0.c((Violation)object2);
                object = zw0_0.a(fragment);
                clazz = ((zW0$b)object).a;
                clazz2 = zW0$a.DETECT_WRONG_NESTED_HIERARCHY;
                n4 = (int)(clazz.contains(clazz2) ? 1 : 0);
                if (n4 != 0 && (n4 = (int)(zw0_0.e((zW0$b)object, clazz = fragment.getClass(), clazz2 = WrongNestedHierarchyViolation.class) ? 1 : 0)) != 0) {
                    zw0_0.b((zW0$b)object, (Violation)object2);
                }
            }
            object = this.b;
            object.getClass();
            clazz = fragment.mContainer;
            if (clazz != null) {
                int n7;
                object = ((j)object).a;
                int n8 = ((ArrayList)object).indexOf(fragment);
                for (n7 = n8 + -1; n7 >= 0; n7 += n3) {
                    object2 = (Fragment)((ArrayList)object).get(n7);
                    ViewGroup viewGroup = ((Fragment)object2).mContainer;
                    if (viewGroup != clazz || (object2 = ((Fragment)object2).mView) == null) continue;
                    n3 = clazz.indexOfChild((View)object2) + 1;
                    break block5;
                }
                while (++n8 < (n7 = ((ArrayList)object).size())) {
                    object3 = (Fragment)((ArrayList)object).get(n8);
                    object2 = ((Fragment)object3).mContainer;
                    if (object2 != clazz || (object3 = ((Fragment)object3).mView) == null) continue;
                    n3 = clazz.indexOfChild((View)object3);
                    break;
                }
            }
        }
        object = fragment.mContainer;
        fragment = fragment.mView;
        object.addView((View)fragment, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b() {
        Object object = "FragmentManager";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        Object object2 = this.c;
        if (bl2) {
            Objects.toString(object2);
        }
        object = ((Fragment)object2).mTarget;
        Object object3 = null;
        String string2 = " that does not belong to this FragmentManager!";
        String string3 = " declared target fragment ";
        String string4 = "Fragment ";
        Object object4 = this.b;
        if (object != null) {
            object = ((Fragment)object).mWho;
            object4 = ((j)object4).b;
            if ((object = (h)((HashMap)object4).get(object)) == null) {
                object3 = new StringBuilder(string4);
                ((StringBuilder)object3).append(object2);
                ((StringBuilder)object3).append(string3);
                object2 = ((Fragment)object2).mTarget;
                ((StringBuilder)object3).append(object2);
                ((StringBuilder)object3).append(string2);
                object2 = ((StringBuilder)object3).toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            ((Fragment)object2).mTargetWho = string2 = ((Fragment)object2).mTarget.mWho;
            ((Fragment)object2).mTarget = null;
            object3 = object;
        } else {
            object = ((Fragment)object2).mTargetWho;
            if (object != null) {
                object3 = object = ((j)object4).b.get(object);
                object3 = (h)object;
                if (object3 == null) {
                    object3 = new StringBuilder(string4);
                    ((StringBuilder)object3).append(object2);
                    ((StringBuilder)object3).append(string3);
                    object2 = ((Fragment)object2).mTargetWho;
                    object2 = h30_0.a((StringBuilder)object3, (String)object2, string2);
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
            }
        }
        if (object3 != null) {
            ((h)object3).i();
        }
        object = ((Fragment)object2).mFragmentManager;
        ((Fragment)object2).mHost = object3 = ((FragmentManager)object).x;
        ((Fragment)object2).mParentFragment = object = ((FragmentManager)object).z;
        object = this.a;
        ((f)object).g((Fragment)object2, false);
        ((Fragment)object2).performAttach();
        ((f)object).b((Fragment)object2, false);
    }

    public final int c() {
        Fragment fragment = this.c;
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null) {
            return fragment.mState;
        }
        int n3 = this.e;
        Object object = h$b.a;
        i$b i$b = fragment.mMaxState;
        int n4 = i$b.ordinal();
        int n7 = object[n4];
        n4 = 5;
        int n8 = -1;
        int n10 = 3;
        int n14 = 4;
        int n15 = 2;
        int n16 = 1;
        if (n7 != n16) {
            if (n7 != n15) {
                if (n7 != n10) {
                    if (n7 != n14) {
                        n3 = Math.min(n3, n8);
                    } else {
                        n7 = 0;
                        object = null;
                        n3 = Math.min(n3, 0);
                    }
                } else {
                    n3 = Math.min(n3, n16);
                }
            } else {
                n3 = Math.min(n3, n4);
            }
        }
        if ((n7 = (int)(fragment.mFromLayout ? 1 : 0)) != 0) {
            n7 = (int)(fragment.mInLayout ? 1 : 0);
            if (n7 != 0) {
                n3 = Math.max(this.e, n15);
                object = fragment.mView;
                if (object != null && (object = (Object)object.getParent()) == null) {
                    n3 = Math.min(n3, n15);
                }
            } else {
                n7 = this.e;
                if (n7 < n14) {
                    n7 = fragment.mState;
                    n3 = Math.min(n3, n7);
                } else {
                    n3 = Math.min(n3, n16);
                }
            }
        }
        if ((n7 = (int)(fragment.mInDynamicContainer ? 1 : 0)) != 0 && (object = (Object)fragment.mContainer) == null) {
            n3 = Math.min(n3, n14);
        }
        if ((n7 = (int)(fragment.mAdded ? 1 : 0)) == 0) {
            n3 = Math.min(n3, n16);
        }
        object = fragment.mContainer;
        Object object2 = null;
        if (object != null) {
            Object object3 = fragment.getParentFragmentManager();
            object = n.i((ViewGroup)object, (FragmentManager)object3);
            object.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            object3 = object.f(fragment);
            object3 = object3 != null ? ((n$c)object3).b : null;
            object = object.g(fragment);
            if (object != null) {
                object2 = object.b;
            }
            if (object3 == null) {
                n7 = -1;
            } else {
                object = n$d.$EnumSwitchMapping$0;
                int n17 = ((Enum)object3).ordinal();
                n7 = object[n17];
            }
            if (n7 != n8 && n7 != n16) {
                object2 = object3;
            }
        }
        if (object2 == (object = (Object)((Object)n$c$a.ADDING))) {
            n7 = 6;
            n3 = Math.min(n3, n7);
        } else {
            object = (Object)n$c$a.REMOVING;
            if (object2 == object) {
                n3 = Math.max(n3, n10);
            } else {
                n7 = (int)(fragment.mRemoving ? 1 : 0);
                if (n7 != 0) {
                    n7 = (int)(fragment.isInBackStack() ? 1 : 0);
                    n3 = n7 != 0 ? Math.min(n3, n16) : Math.min(n3, n8);
                }
            }
        }
        n7 = (int)(fragment.mDeferStart ? 1 : 0);
        if (n7 != 0 && (n7 = fragment.mState) < n4) {
            n3 = Math.min(n3, n14);
        }
        if ((n7 = (int)(fragment.mTransitioning ? 1 : 0)) != 0) {
            n3 = Math.max(n3, n10);
        }
        if ((n7 = (int)(Log.isLoggable((String)(object = "FragmentManager"), (int)n15) ? 1 : 0)) != 0) {
            Objects.toString(fragment);
        }
        return n3;
    }

    public final void d() {
        int n3;
        float f5;
        String string2;
        Object object = this.c;
        boolean bl2 = ((Fragment)object).mFromLayout;
        if (bl2) {
            return;
        }
        Object object2 = "FragmentManager";
        int n4 = 3;
        boolean bl3 = Log.isLoggable((String)object2, (int)n4);
        if (bl3) {
            Objects.toString(object);
        }
        Object object3 = ((Fragment)object).mSavedFragmentState;
        int n7 = 0;
        Object object4 = null;
        if (object3 != null) {
            string2 = "savedInstanceState";
            object3 = object3.getBundle(string2);
        } else {
            bl3 = false;
            object3 = null;
            f5 = 0.0f;
        }
        string2 = ((Fragment)object).performGetLayoutInflater((Bundle)object3);
        Object object5 = ((Fragment)object).mContainer;
        if (object5 != null) {
            object4 = object5;
        } else {
            n3 = ((Fragment)object).mContainerId;
            if (n3 != 0) {
                n7 = -1;
                if (n3 != n7) {
                    object4 = (ViewGroup)((Fragment)object).mFragmentManager.y.b(n3);
                    if (object4 == null) {
                        n3 = (int)(((Fragment)object).mRestored ? 1 : 0);
                        if (n3 == 0 && (n3 = (int)(((Fragment)object).mInDynamicContainer ? 1 : 0)) == 0) {
                            object2 = ((Fragment)object).getResources();
                            n4 = ((Fragment)object).mContainerId;
                            try {
                                object2 = object2.getResourceName(n4);
                            }
                            catch (Resources.NotFoundException notFoundException) {
                                object2 = "unknown";
                            }
                            object3 = new StringBuilder("No view found for id 0x");
                            object4 = Integer.toHexString(((Fragment)object).mContainerId);
                            ((StringBuilder)object3).append((String)object4);
                            ((StringBuilder)object3).append(" (");
                            ((StringBuilder)object3).append((String)object2);
                            ((StringBuilder)object3).append(") for fragment ");
                            ((StringBuilder)object3).append(object);
                            object = ((StringBuilder)object3).toString();
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                            throw illegalArgumentException;
                        }
                    } else {
                        n3 = object4 instanceof FragmentContainerView;
                        if (n3 == 0) {
                            object5 = zw0_0.a;
                            Intrinsics.checkNotNullParameter(object, "fragment");
                            Intrinsics.checkNotNullParameter(object4, "container");
                            object5 = new WrongFragmentContainerViolation((Fragment)object, (ViewGroup)object4);
                            zw0_0.c((Violation)object5);
                            zW0$b zW0$b = zw0_0.a((Fragment)object);
                            Object object6 = zW0$b.a;
                            Object object7 = zW0$a.DETECT_WRONG_FRAGMENT_CONTAINER;
                            boolean bl4 = object6.contains(object7);
                            if (bl4 && (bl4 = zw0_0.e(zW0$b, (Class)(object6 = object.getClass()), (Class)(object7 = WrongFragmentContainerViolation.class)))) {
                                zw0_0.b(zW0$b, (Violation)object5);
                            }
                        }
                    }
                } else {
                    object = tv0_1.b("Cannot create fragment ", (Fragment)object, " for a container view with no id");
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
            }
        }
        ((Fragment)object).mContainer = object4;
        ((Fragment)object).performCreateView((LayoutInflater)string2, (ViewGroup)object4, (Bundle)object3);
        string2 = ((Fragment)object).mView;
        n3 = 2;
        if (string2 != null) {
            if ((n4 = (int)(Log.isLoggable((String)object2, (int)n4) ? 1 : 0)) != 0) {
                Objects.toString(object);
            }
            Object object8 = ((Fragment)object).mView;
            string2 = null;
            object8.setSaveFromParentEnabled(false);
            object8 = ((Fragment)object).mView;
            int n8 = R$id.fragment_container_view_tag;
            object8.setTag(n8, object);
            if (object4 != null) {
                this.a();
            }
            if ((n4 = (int)(((Fragment)object).mHidden ? 1 : 0)) != 0) {
                object8 = ((Fragment)object).mView;
                n7 = 8;
                object8.setVisibility(n7);
            }
            if ((n4 = (int)((object8 = ((Fragment)object).mView).isAttachedToWindow() ? 1 : 0)) != 0) {
                object8 = ((Fragment)object).mView;
                object4 = ViewCompat.a;
                ViewCompat$b.c((View)object8);
            } else {
                object8 = ((Fragment)object).mView;
                object4 = new h$a((View)object8);
                object8.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object4);
            }
            ((Fragment)object).performViewCreated();
            object8 = this.a;
            object4 = ((Fragment)object).mView;
            ((f)object8).m((Fragment)object, (View)object4, (Bundle)object3, false);
            object8 = ((Fragment)object).mView;
            n4 = object8.getVisibility();
            f5 = ((Fragment)object).mView.getAlpha();
            ((Fragment)object).setPostOnViewCreatedAlpha(f5);
            object3 = ((Fragment)object).mContainer;
            if (object3 != null && n4 == 0) {
                object8 = ((Fragment)object).mView.findFocus();
                if (object8 != null) {
                    ((Fragment)object).setFocusedView((View)object8);
                    bl2 = Log.isLoggable((String)object2, (int)n3);
                    if (bl2) {
                        object8.toString();
                        Objects.toString(object);
                    }
                }
                object2 = ((Fragment)object).mView;
                n4 = 0;
                object8 = null;
                object2.setAlpha(0.0f);
            }
        }
        ((Fragment)object).mState = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e() {
        Object object;
        boolean bl2;
        Object object2;
        boolean bl3;
        Object object3;
        Object object4 = "FragmentManager";
        int n3 = 3;
        boolean bl4 = Log.isLoggable((String)object4, (int)n3);
        Fragment fragment = this.c;
        if (bl4) {
            Objects.toString(fragment);
        }
        bl4 = fragment.mRemoving;
        boolean bl5 = true;
        if (bl4 && !(bl4 = fragment.isInBackStack())) {
            bl4 = true;
        } else {
            bl4 = false;
            object3 = null;
        }
        j j3 = this.b;
        if (bl4 && !(bl3 = fragment.mBeingSaved)) {
            object2 = fragment.mWho;
            j3.i(null, (String)object2);
        }
        if (!bl4) {
            object2 = j3.d;
            HashMap hashMap = ((g)object2).a;
            String string2 = fragment.mWho;
            bl2 = hashMap.containsKey(string2);
            bl3 = bl2 && (bl2 = ((g)object2).d) ? ((g)object2).e : true;
            if (!bl3) {
                object4 = fragment.mTargetWho;
                if (object4 != null && (object4 = j3.b((String)object4)) != null && (n3 = (int)(((Fragment)object4).mRetainInstance ? 1 : 0)) != 0) {
                    fragment.mTarget = object4;
                }
                fragment.mState = 0;
                return;
            }
        }
        if (bl2 = (object2 = fragment.mHost) instanceof sD3) {
            object = j3.d;
            bl5 = ((g)object).e;
        } else {
            object2 = ((lw0_0)object2).b;
            bl2 = object2 instanceof Activity;
            if (bl2) {
                object2 = (Activity)object2;
                bl3 = object2.isChangingConfigurations();
                bl5 ^= bl3;
            }
        }
        if (bl4 && !(bl4 = fragment.mBeingSaved) || bl5) {
            object3 = j3.d;
            object3.getClass();
            boolean bl6 = Log.isLoggable((String)object4, (int)n3);
            if (bl6) {
                Objects.toString(fragment);
            }
            object4 = fragment.mWho;
            ((g)object3).d((String)object4, false);
        }
        fragment.performDestroy();
        this.a.d(fragment, false);
        object4 = j3.d().iterator();
        while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            Object object5 = (h)object4.next();
            if (object5 == null) continue;
            object3 = fragment.mWho;
            object5 = ((h)object5).c;
            object = ((Fragment)object5).mTargetWho;
            bl4 = ((String)object3).equals(object);
            if (!bl4) continue;
            ((Fragment)object5).mTarget = fragment;
            ((Fragment)object5).mTargetWho = null;
        }
        object4 = fragment.mTargetWho;
        if (object4 != null) {
            fragment.mTarget = object4 = j3.b((String)object4);
        }
        j3.h(this);
    }

    public final void f() {
        View view;
        String string2 = "FragmentManager";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        Fragment fragment = this.c;
        if (bl2) {
            Objects.toString(fragment);
        }
        if ((string2 = fragment.mContainer) != null && (view = fragment.mView) != null) {
            string2.removeView(view);
        }
        fragment.performDestroyView();
        this.a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.k(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        block7: {
            Fragment fragment;
            int n3;
            String string2;
            block6: {
                string2 = "FragmentManager";
                n3 = 3;
                boolean bl2 = Log.isLoggable((String)string2, (int)n3);
                fragment = this.c;
                if (bl2) {
                    Objects.toString(fragment);
                }
                fragment.performDetach();
                Object object = this.a;
                boolean bl3 = false;
                HashMap hashMap = null;
                ((f)object).e(fragment, false);
                fragment.mState = -1;
                object = null;
                fragment.mHost = null;
                fragment.mParentFragment = null;
                fragment.mFragmentManager = null;
                bl2 = fragment.mRemoving;
                if (bl2 && !(bl2 = fragment.isInBackStack())) break block6;
                object = this.b.d;
                hashMap = ((g)object).a;
                String string3 = fragment.mWho;
                bl3 = hashMap.containsKey(string3);
                boolean bl4 = true;
                if (bl3 && (bl3 = ((g)object).d)) {
                    bl4 = ((g)object).e;
                }
                if (!bl4) break block7;
            }
            boolean bl5 = Log.isLoggable((String)string2, (int)n3);
            if (bl5) {
                Objects.toString(fragment);
            }
            fragment.initState();
        }
    }

    public final void h() {
        Fragment fragment = this.c;
        int n3 = fragment.mFromLayout;
        if (n3 != 0 && (n3 = fragment.mInLayout) != 0 && (n3 = fragment.mPerformedCreateView) == 0) {
            String string2;
            String string3 = "FragmentManager";
            int n4 = 3;
            n3 = Log.isLoggable((String)string3, (int)n4);
            if (n3 != 0) {
                Objects.toString(fragment);
            }
            string3 = fragment.mSavedFragmentState;
            n4 = 0;
            Object object = null;
            if (string3 != null) {
                string2 = "savedInstanceState";
                string3 = string3.getBundle(string2);
            } else {
                n3 = 0;
                string3 = null;
            }
            string2 = fragment.performGetLayoutInflater((Bundle)string3);
            fragment.performCreateView((LayoutInflater)string2, null, (Bundle)string3);
            object = fragment.mView;
            if (object != null) {
                string2 = null;
                object.setSaveFromParentEnabled(false);
                object = fragment.mView;
                int n7 = R$id.fragment_container_view_tag;
                object.setTag(n7, (Object)fragment);
                n4 = (int)(fragment.mHidden ? 1 : 0);
                if (n4 != 0) {
                    object = fragment.mView;
                    n7 = 8;
                    object.setVisibility(n7);
                }
                fragment.performViewCreated();
                object = this.a;
                View view = fragment.mView;
                ((f)object).m(fragment, view, (Bundle)string3, false);
                fragment.mState = n3 = 2;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void i() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 185->193)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void j(ClassLoader object) {
        boolean bl2;
        Object object2;
        Object object3 = this.c;
        Object object4 = ((Fragment)object3).mSavedFragmentState;
        if (object4 == null) {
            return;
        }
        object4.setClassLoader((ClassLoader)object);
        object = ((Fragment)object3).mSavedFragmentState;
        object4 = "savedInstanceState";
        object = object.getBundle((String)object4);
        if (object == null) {
            object = ((Fragment)object3).mSavedFragmentState;
            object2 = new Bundle();
            object.putBundle((String)object4, (Bundle)object2);
        }
        try {
            object = ((Fragment)object3).mSavedFragmentState;
            object4 = "viewState";
        }
        catch (BadParcelableException badParcelableException) {
            object2 = new StringBuilder("Failed to restore view hierarchy state for fragment ");
            ((StringBuilder)object2).append(object3);
            object3 = ((StringBuilder)object2).toString();
            object4 = new IllegalStateException((String)object3, badParcelableException);
            throw object4;
        }
        object = object.getSparseParcelableArray((String)object4);
        ((Fragment)object3).mSavedViewState = object;
        object = ((Fragment)object3).mSavedFragmentState.getBundle("viewRegistryState");
        ((Fragment)object3).mSavedViewRegistryState = object;
        object = ((Fragment)object3).mSavedFragmentState;
        object4 = "state";
        object = (FragmentState)object.getParcelable((String)object4);
        if (object != null) {
            int n3;
            object4 = ((FragmentState)object).m;
            ((Fragment)object3).mTargetWho = object4;
            ((Fragment)object3).mTargetRequestCode = n3 = ((FragmentState)object).n;
            object4 = ((Fragment)object3).mSavedUserVisibleHint;
            if (object4 != null) {
                ((Fragment)object3).mUserVisibleHint = bl2 = ((Boolean)object4).booleanValue();
                bl2 = false;
                object = null;
                ((Fragment)object3).mSavedUserVisibleHint = null;
            } else {
                ((Fragment)object3).mUserVisibleHint = bl2 = ((FragmentState)object).o;
            }
        }
        if (!(bl2 = ((Fragment)object3).mUserVisibleHint)) {
            ((Fragment)object3).mDeferStart = bl2 = true;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k() {
        block2: {
            var1_1 = "FragmentManager";
            var2_2 = Log.isLoggable((String)var1_1, (int)3);
            var3_3 = this.c;
            if (var2_2) {
                Objects.toString(var3_3);
            }
            if ((var4_4 = var3_3.getFocusedView()) == null) break block2;
            var5_5 /* !! */  = var3_3.mView;
            if (var4_4 == var5_5 /* !! */ ) ** GOTO lbl13
            for (var5_5 /* !! */  = var4_4.getParent(); var5_5 /* !! */  != null; var5_5 /* !! */  = var5_5 /* !! */ .getParent()) {
                var6_6 = var3_3.mView;
                if (var5_5 /* !! */  != var6_6) continue;
lbl13:
                // 2 sources

                var4_4.requestFocus();
                var7_7 = 2;
                var8_8 = Log.isLoggable((String)var1_1, (int)var7_7);
                if (!var8_8) break;
                var4_4.toString();
                Objects.toString(var3_3);
                var1_1 = var3_3.mView.findFocus();
                Objects.toString(var1_1);
                break;
            }
        }
        var3_3.setFocusedView(null);
        var3_3.performResume();
        this.a.i(var3_3, false);
        var4_4 = this.b;
        var5_5 /* !! */  = var3_3.mWho;
        var4_4.i(null, (String)var5_5 /* !! */ );
        var3_3.mSavedFragmentState = null;
        var3_3.mSavedViewState = null;
        var3_3.mSavedViewRegistryState = null;
    }

    public final Bundle l() {
        Object object;
        Bundle bundle = new Bundle();
        Fragment fragment = this.c;
        int n3 = fragment.mState;
        int n4 = -1;
        if (n3 == n4 && (object = fragment.mSavedFragmentState) != null) {
            bundle.putAll((Bundle)object);
        }
        object = new FragmentState(fragment);
        String string2 = "state";
        bundle.putParcelable(string2, (Parcelable)object);
        n3 = fragment.mState;
        if (n3 > n4) {
            Object object2;
            object = new Bundle();
            fragment.performSaveInstanceState((Bundle)object);
            n4 = (int)(object.isEmpty() ? 1 : 0);
            if (n4 == 0) {
                object2 = "savedInstanceState";
                bundle.putBundle((String)object2, (Bundle)object);
            }
            object2 = this.a;
            string2 = null;
            ((f)object2).j(fragment, (Bundle)object, false);
            object = new Bundle();
            object2 = fragment.mSavedStateRegistryController;
            ((ys2_0)object2).c((Bundle)object);
            n4 = (int)(object.isEmpty() ? 1 : 0);
            if (n4 == 0) {
                object2 = "registryState";
                bundle.putBundle((String)object2, (Bundle)object);
            }
            if ((n4 = (int)((object = fragment.mChildFragmentManager.d0()).isEmpty() ? 1 : 0)) == 0) {
                object2 = "childFragmentManager";
                bundle.putBundle((String)object2, (Bundle)object);
            }
            if ((object = fragment.mView) != null) {
                this.m();
            }
            if ((object = fragment.mSavedViewState) != null) {
                object2 = "viewState";
                bundle.putSparseParcelableArray((String)object2, (SparseArray)object);
            }
            if ((object = fragment.mSavedViewRegistryState) != null) {
                object2 = "viewRegistryState";
                bundle.putBundle((String)object2, (Bundle)object);
            }
        }
        if ((fragment = fragment.mArguments) != null) {
            object = "arguments";
            bundle.putBundle((String)object, (Bundle)fragment);
        }
        return bundle;
    }

    public final void m() {
        Fragment fragment = this.c;
        Object object = fragment.mView;
        if (object == null) {
            return;
        }
        object = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        if (bl2) {
            Objects.toString(fragment);
            object = fragment.mView;
            Objects.toString(object);
        }
        object = new SparseArray();
        Object object2 = fragment.mView;
        object2.saveHierarchyState((SparseArray)object);
        n3 = object.size();
        if (n3 > 0) {
            fragment.mSavedViewState = object;
        }
        object = new Bundle();
        object2 = fragment.mViewLifecycleOwner.f;
        ((ys2_0)object2).c((Bundle)object);
        n3 = (int)(object.isEmpty() ? 1 : 0);
        if (n3 == 0) {
            fragment.mSavedViewRegistryState = object;
        }
    }
}

