/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.LayoutInflater$Factory2
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$styleable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$d;
import androidx.fragment.app.d;
import androidx.fragment.app.e$a;
import androidx.fragment.app.h;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.Intrinsics;

public final class e
implements LayoutInflater.Factory2 {
    public final FragmentManager a;

    public e(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final View onCreateView(View object, String object2, Context object3, AttributeSet object4) {
        block22: {
            int n3;
            String string2;
            int n4;
            block25: {
                Object object5;
                Object object6;
                Class<?> clazz;
                Object object7;
                block24: {
                    boolean bl2;
                    int n7;
                    String string3;
                    block23: {
                        boolean bl3;
                        object7 = FragmentContainerView.class.getName();
                        boolean bl4 = ((String)object7).equals(object2);
                        clazz = this.a;
                        if (bl4) {
                            object = new FragmentContainerView((Context)object3, (AttributeSet)object4, (FragmentManager)((Object)clazz));
                            return object;
                        }
                        object7 = "fragment";
                        boolean n8 = ((String)object7).equals(object2);
                        object6 = null;
                        if (!n8) {
                            return null;
                        }
                        object2 = object4.getAttributeValue(null, "class");
                        object5 = R$styleable.Fragment;
                        object5 = object3.obtainStyledAttributes((AttributeSet)object4, (int[])object5);
                        if (object2 == null) {
                            int n10 = R$styleable.Fragment_android_name;
                            object2 = object5.getString(n10);
                        }
                        n4 = R$styleable.Fragment_android_id;
                        int n14 = -1;
                        n4 = object5.getResourceId(n4, n14);
                        int n15 = R$styleable.Fragment_android_tag;
                        string2 = object5.getString(n15);
                        object5.recycle();
                        if (object2 == null) break block22;
                        object5 = object3.getClassLoader();
                        n3 = 0;
                        object5 = d.a((ClassLoader)object5, (String)object2);
                        Class<Fragment> clazz2 = Fragment.class;
                        try {
                            bl3 = clazz2.isAssignableFrom((Class<?>)object5);
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            bl3 = false;
                            object5 = null;
                        }
                        if (!bl3) break block22;
                        if (object != null) {
                            n3 = object.getId();
                        }
                        if (n3 == n14 && n4 == n14 && string2 == null) {
                            object3 = new StringBuilder();
                            object4 = object4.getPositionDescription();
                            ((StringBuilder)object3).append((String)object4);
                            ((StringBuilder)object3).append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                            ((StringBuilder)object3).append((String)object2);
                            object2 = ((StringBuilder)object3).toString();
                            object = new IllegalArgumentException((String)object2);
                            throw object;
                        }
                        if (n4 != n14) {
                            object5 = ((FragmentManager)((Object)clazz)).D(n4);
                        } else {
                            bl3 = false;
                            object5 = null;
                        }
                        if (object5 == null && string2 != null) {
                            object5 = ((FragmentManager)((Object)clazz)).E(string2);
                        }
                        if (object5 == null && n3 != n14) {
                            object5 = ((FragmentManager)((Object)clazz)).D(n3);
                        }
                        string3 = "FragmentManager";
                        n7 = 2;
                        bl2 = true;
                        if (object5 != null) break block23;
                        object5 = ((FragmentManager)((Object)clazz)).M();
                        object3.getClassLoader();
                        object3 = ((FragmentManager$d)object5).b.x.b;
                        object5 = Fragment.instantiate((Context)object3, (String)object2, null);
                        ((Fragment)object5).mFromLayout = bl2;
                        int bl6 = n4 != 0 ? n4 : n3;
                        ((Fragment)object5).mFragmentId = bl6;
                        ((Fragment)object5).mContainerId = n3;
                        ((Fragment)object5).mTag = string2;
                        ((Fragment)object5).mInLayout = bl2;
                        ((Fragment)object5).mFragmentManager = clazz;
                        ((Fragment)object5).mHost = object3 = ((FragmentManager)((Object)clazz)).x;
                        object3 = ((lw0_0)object3).b;
                        object6 = ((Fragment)object5).mSavedFragmentState;
                        ((Fragment)object5).onInflate((Context)object3, (AttributeSet)object4, (Bundle)object6);
                        object3 = ((FragmentManager)((Object)clazz)).a((Fragment)object5);
                        boolean bl7 = Log.isLoggable((String)string3, (int)n7);
                        if (bl7) {
                            ((Fragment)object5).toString();
                            Integer.toHexString(n4);
                        }
                        break block24;
                    }
                    boolean bl4 = ((Fragment)object5).mInLayout;
                    if (bl4) break block25;
                    ((Fragment)object5).mInLayout = bl2;
                    ((Fragment)object5).mFragmentManager = clazz;
                    ((Fragment)object5).mHost = object3 = ((FragmentManager)((Object)clazz)).x;
                    object3 = ((lw0_0)object3).b;
                    object6 = ((Fragment)object5).mSavedFragmentState;
                    ((Fragment)object5).onInflate((Context)object3, (AttributeSet)object4, (Bundle)object6);
                    object3 = ((FragmentManager)((Object)clazz)).g((Fragment)object5);
                    boolean bl5 = Log.isLoggable((String)string3, (int)n7);
                    if (bl5) {
                        ((Fragment)object5).toString();
                        Integer.toHexString(n4);
                    }
                }
                object = (ViewGroup)object;
                object4 = zw0_0.a;
                Intrinsics.checkNotNullParameter(object5, (String)object7);
                object4 = new FragmentTagUsageViolation((Fragment)object5, (ViewGroup)object);
                zw0_0.c((Violation)object4);
                object7 = zw0_0.a((Fragment)object5);
                clazz = ((zW0$b)object7).a;
                object6 = zW0$a.DETECT_FRAGMENT_TAG_USAGE;
                boolean bl6 = clazz.contains(object6);
                if (bl6 && (bl6 = zw0_0.e((zW0$b)object7, clazz = object5.getClass(), (Class)(object6 = FragmentTagUsageViolation.class)))) {
                    zw0_0.b((zW0$b)object7, (Violation)object4);
                }
                ((Fragment)object5).mContainer = object;
                ((h)object3).i();
                ((h)object3).h();
                object = ((Fragment)object5).mView;
                if (object != null) {
                    if (n4 != 0) {
                        object.setId(n4);
                    }
                    if ((object = ((Fragment)object5).mView.getTag()) == null) {
                        object = ((Fragment)object5).mView;
                        object.setTag((Object)string2);
                    }
                    object = ((Fragment)object5).mView;
                    object2 = new e$a(this, (h)object3);
                    object.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object2);
                    return ((Fragment)object5).mView;
                }
                object2 = cP.a("Fragment ", (String)object2, " did not create a view.");
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object3 = new StringBuilder();
            object4 = object4.getPositionDescription();
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(": Duplicate id 0x");
            object4 = Integer.toHexString(n4);
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(", tag ");
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(", or parent id 0x");
            object4 = Integer.toHexString(n3);
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(" with another fragment for ");
            ((StringBuilder)object3).append((String)object2);
            object2 = ((StringBuilder)object3).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        return null;
    }

    public final View onCreateView(String string2, Context context, AttributeSet attributeSet) {
        return this.onCreateView(null, string2, context, attributeSet);
    }
}

