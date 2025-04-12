/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.LongSparseArray
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.util.SparseIntArray
 *  android.util.SparseLongArray
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 */
package androidx.databinding;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.MergedDataBinderMapper;
import androidx.databinding.ViewDataBinding$7;
import androidx.databinding.ViewDataBinding$h;
import androidx.databinding.ViewDataBinding$j;
import androidx.databinding.ViewDataBinding$k;
import androidx.databinding.a;
import androidx.databinding.b;
import androidx.databinding.b$a;
import androidx.databinding.c;
import androidx.databinding.c$a;
import androidx.databinding.d;
import androidx.databinding.e;
import androidx.databinding.library.R$id;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Map;

public abstract class ViewDataBinding
extends a
implements BC3 {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final Vd0 CREATE_LIST_LISTENER;
    private static final Vd0 CREATE_LIVE_DATA_LISTENER;
    private static final Vd0 CREATE_MAP_LISTENER;
    private static final Vd0 CREATE_PROPERTY_LISTENER;
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final b$a REBIND_NOTIFIER;
    private static final int REBOUND = 3;
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER;
    static int SDK_INT;
    private static final boolean USE_CHOREOGRAPHER;
    private static final ReferenceQueue sReferenceQueue;
    protected final ai0_0 mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private mu1_1 mLifecycleOwner;
    private if3_0[] mLocalFieldObservers;
    private ViewDataBinding$j mOnStartListener;
    private boolean mPendingRebind;
    private b mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;

    static {
        SDK_INT = Build.VERSION.SDK_INT;
        USE_CHOREOGRAPHER = true;
        Object object = new Object();
        CREATE_PROPERTY_LISTENER = object;
        object = new Object();
        CREATE_LIST_LISTENER = object;
        object = new Object();
        CREATE_MAP_LISTENER = object;
        object = new Object();
        CREATE_LIVE_DATA_LISTENER = object;
        REBIND_NOTIFIER = object = new Object();
        object = new ReferenceQueue();
        sReferenceQueue = object;
        object = new Object();
        ROOT_REATTACHED_LISTENER = object;
    }

    public ViewDataBinding(ai0_0 object, View view, int n3) {
        ViewDataBinding$7 viewDataBinding$7 = new ViewDataBinding$7(this);
        this.mRebindRunnable = viewDataBinding$7;
        viewDataBinding$7 = null;
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = object;
        object = new if3_0[n3];
        this.mLocalFieldObservers = object;
        this.mRoot = view;
        object = Looper.myLooper();
        if (object != null) {
            boolean bl2 = USE_CHOREOGRAPHER;
            if (bl2) {
                object = Choreographer.getInstance();
                this.mChoreographer = object;
                super(this);
                this.mFrameCallback = object;
            } else {
                bl2 = false;
                this.mFrameCallback = null;
                view = Looper.myLooper();
                super((Looper)view);
                this.mUIThreadHandler = object;
            }
            return;
        }
        super("DataBinding must be created in view's UI Thread");
        throw object;
    }

    public ViewDataBinding(Object object, View view, int n3) {
        object = ViewDataBinding.checkAndCastToBindingComponent(object);
        this((ai0_0)object, view, n3);
    }

    public static /* synthetic */ boolean access$002(ViewDataBinding viewDataBinding, boolean bl2) {
        viewDataBinding.mRebindHalted = bl2;
        return bl2;
    }

    public static /* synthetic */ Runnable access$100(ViewDataBinding viewDataBinding) {
        return viewDataBinding.mRebindRunnable;
    }

    public static /* synthetic */ boolean access$202(ViewDataBinding viewDataBinding, boolean bl2) {
        viewDataBinding.mPendingRebind = bl2;
        return bl2;
    }

    public static /* synthetic */ void access$300() {
        ViewDataBinding.processReferenceQueue();
    }

    public static /* synthetic */ View access$400(ViewDataBinding viewDataBinding) {
        return viewDataBinding.mRoot;
    }

    public static /* synthetic */ View.OnAttachStateChangeListener access$500() {
        return ROOT_REATTACHED_LISTENER;
    }

    public static ViewDataBinding bind(Object object, View view, int n3) {
        object = ViewDataBinding.checkAndCastToBindingComponent(object);
        return bi0_0.a.b((ai0_0)object, view, n3);
    }

    private static ai0_0 checkAndCastToBindingComponent(Object object) {
        if (object == null) {
            return null;
        }
        boolean bl2 = object instanceof ai0_0;
        if (bl2) {
            return (ai0_0)object;
        }
        object = new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        throw object;
    }

    private void executeBindingsInternal() {
        int n3;
        b b2;
        int n4 = (int)(this.mIsExecutingPendingBindings ? 1 : 0);
        if (n4 != 0) {
            this.requestRebind();
            return;
        }
        n4 = this.hasPendingBindings();
        if (n4 == 0) {
            return;
        }
        n4 = 1;
        this.mIsExecutingPendingBindings = n4;
        this.mRebindHalted = false;
        b b3 = this.mRebindCallbacks;
        if (b3 != null) {
            b3.e(n4, this);
            n4 = (int)(this.mRebindHalted ? 1 : 0);
            if (n4 != 0) {
                b2 = this.mRebindCallbacks;
                n3 = 2;
                b2.e(n3, this);
            }
        }
        if ((n4 = this.mRebindHalted) == 0) {
            this.executeBindings();
            b2 = this.mRebindCallbacks;
            if (b2 != null) {
                n3 = 3;
                b2.e(n3, this);
            }
        }
        this.mIsExecutingPendingBindings = false;
    }

    public static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    private static int findIncludeIndex(String charSequence, int n3, ViewDataBinding$h stringArray, int n4) {
        int n7 = charSequence.indexOf(47) + 1;
        int n8 = charSequence.length() + -2;
        charSequence = charSequence.subSequence(n7, n8);
        stringArray = stringArray.a[n4];
        n4 = stringArray.length;
        while (n3 < n4) {
            String string2 = stringArray[n3];
            n7 = (int)(TextUtils.equals((CharSequence)charSequence, (CharSequence)string2) ? 1 : 0);
            if (n7 != 0) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    private static int findLastMatching(ViewGroup viewGroup, int n3) {
        String string2 = (String)viewGroup.getChildAt(n3).getTag();
        int n4 = string2.length() + -1;
        String string3 = string2.substring(0, n4);
        int n7 = string3.length();
        int n8 = viewGroup.getChildCount();
        for (int i3 = n3 + 1; i3 < n8; ++i3) {
            int n10;
            boolean bl2;
            Object object = viewGroup.getChildAt(i3);
            Object object2 = object.getTag();
            int n14 = object2 instanceof String;
            if (n14 != 0) {
                object = (String)object.getTag();
            } else {
                bl2 = false;
                object = null;
            }
            if (object == null || (n14 = ((String)object).startsWith(string3)) == 0) continue;
            n14 = ((String)object).length();
            if (n14 == (n10 = string2.length())) {
                n14 = ((String)object).length() + -1;
                if ((n14 = (int)((String)object).charAt(n14)) == (n10 = 48)) {
                    return n3;
                }
            }
            if (!(bl2 = ViewDataBinding.isNumeric((String)object, n7))) continue;
            n3 = i3;
        }
        return n3;
    }

    public static ViewDataBinding getBinding(View view) {
        if (view != null) {
            int n3 = R$id.dataBinding;
            return (ViewDataBinding)view.getTag(n3);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    public static int getColorFromResource(View view, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            view = view.getContext();
            return QC3.a(n3, (Context)view);
        }
        return view.getResources().getColor(n3);
    }

    public static ColorStateList getColorStateListFromResource(View view, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            view = view.getContext();
            return PC3.a(n3, (Context)view);
        }
        return view.getResources().getColorStateList(n3);
    }

    public static Drawable getDrawableFromResource(View view, int n3) {
        return view.getContext().getDrawable(n3);
    }

    public static Object getFrom(Map map2, Object object) {
        if (map2 == null) {
            return null;
        }
        return map2.get(object);
    }

    public static byte getFromArray(byte[] byArray, int n3) {
        int n4;
        if (byArray != null && n3 >= 0 && n3 < (n4 = byArray.length)) {
            return byArray[n3];
        }
        return 0;
    }

    public static char getFromArray(char[] cArray, int n3) {
        int n4;
        if (cArray != null && n3 >= 0 && n3 < (n4 = cArray.length)) {
            return cArray[n3];
        }
        return '\u0000';
    }

    public static double getFromArray(double[] dArray, int n3) {
        int n4;
        if (dArray != null && n3 >= 0 && n3 < (n4 = dArray.length)) {
            return dArray[n3];
        }
        return 0.0;
    }

    public static float getFromArray(float[] fArray, int n3) {
        int n4;
        if (fArray != null && n3 >= 0 && n3 < (n4 = fArray.length)) {
            return fArray[n3];
        }
        return 0.0f;
    }

    public static int getFromArray(int[] nArray, int n3) {
        int n4;
        if (nArray != null && n3 >= 0 && n3 < (n4 = nArray.length)) {
            return nArray[n3];
        }
        return 0;
    }

    public static long getFromArray(long[] lArray, int n3) {
        int n4;
        if (lArray != null && n3 >= 0 && n3 < (n4 = lArray.length)) {
            return lArray[n3];
        }
        return 0L;
    }

    public static Object getFromArray(Object[] objectArray, int n3) {
        int n4;
        if (objectArray != null && n3 >= 0 && n3 < (n4 = objectArray.length)) {
            return objectArray[n3];
        }
        return null;
    }

    public static short getFromArray(short[] sArray, int n3) {
        int n4;
        if (sArray != null && n3 >= 0 && n3 < (n4 = sArray.length)) {
            return sArray[n3];
        }
        return 0;
    }

    public static boolean getFromArray(boolean[] blArray, int n3) {
        int n4;
        if (blArray != null && n3 >= 0 && n3 < (n4 = blArray.length)) {
            return blArray[n3];
        }
        return false;
    }

    public static int getFromList(SparseIntArray sparseIntArray, int n3) {
        if (sparseIntArray != null && n3 >= 0) {
            return sparseIntArray.get(n3);
        }
        return 0;
    }

    public static long getFromList(SparseLongArray sparseLongArray, int n3) {
        if (sparseLongArray != null && n3 >= 0) {
            return sparseLongArray.get(n3);
        }
        return 0L;
    }

    public static Object getFromList(LongSparseArray longSparseArray, int n3) {
        if (longSparseArray != null && n3 >= 0) {
            long l2 = n3;
            return longSparseArray.get(l2);
        }
        return null;
    }

    public static Object getFromList(SparseArray sparseArray, int n3) {
        if (sparseArray != null && n3 >= 0) {
            return sparseArray.get(n3);
        }
        return null;
    }

    public static Object getFromList(List list, int n3) {
        int n4;
        if (list != null && n3 >= 0 && n3 < (n4 = list.size())) {
            return list.get(n3);
        }
        return null;
    }

    public static Object getFromList(pb1_0 pb1_02, int n3) {
        if (pb1_02 != null && n3 >= 0) {
            long l2 = n3;
            return pb1_02.f(l2);
        }
        return null;
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray, int n3) {
        if (sparseBooleanArray != null && n3 >= 0) {
            return sparseBooleanArray.get(n3);
        }
        return false;
    }

    public static ViewDataBinding inflateInternal(LayoutInflater object, int n3, ViewGroup viewGroup, boolean bl2, Object object2) {
        int n4 = 1;
        object2 = ViewDataBinding.checkAndCastToBindingComponent(object2);
        int n7 = viewGroup != null && bl2 ? 1 : 0;
        int n8 = n7 != 0 ? viewGroup.getChildCount() : 0;
        object = object.inflate(n3, viewGroup, bl2);
        DataBinderMapperImpl dataBinderMapperImpl = bi0_0.a;
        if (n7 != 0) {
            int n10 = viewGroup.getChildCount();
            n7 = n10 - n8;
            if (n7 == n4) {
                object = viewGroup.getChildAt(n10 -= n4);
                object = dataBinderMapperImpl.b((ai0_0)object2, (View)object, n3);
            } else {
                object = new View[n7];
                for (int i3 = 0; i3 < n7; i3 += n4) {
                    View view;
                    int n14 = i3 + n8;
                    object[i3] = view = viewGroup.getChildAt(n14);
                }
                object = dataBinderMapperImpl.c((ai0_0)object2, (View[])object, n3);
            }
        } else {
            object = dataBinderMapperImpl.b((ai0_0)object2, (View)object, n3);
        }
        return object;
    }

    private static boolean isNumeric(String string2, int n3) {
        int n4 = string2.length();
        if (n4 == n3) {
            return false;
        }
        while (n3 < n4) {
            boolean bl2 = Character.isDigit(string2.charAt(n3));
            if (!bl2) {
                return false;
            }
            ++n3;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void mapBindings(ai0_0 ai0_02, View view, Object[] objectArray, ViewDataBinding$h viewDataBinding$h, SparseIntArray sparseIntArray, boolean bl2) {
        Object[] objectArray2;
        int n3;
        Object object;
        int n4;
        int n7;
        ai0_0 ai0_03 = ai0_02;
        View view2 = view;
        ViewDataBinding$h viewDataBinding$h2 = viewDataBinding$h;
        SparseIntArray sparseIntArray2 = sparseIntArray;
        Object object2 = ViewDataBinding.getBinding(view);
        if (object2 != null) {
            return;
        }
        object2 = view.getTag();
        int n8 = object2 instanceof String;
        if (n8 != 0) {
            object2 = (String)object2;
        } else {
            n7 = 0;
            object2 = null;
        }
        int n10 = 1;
        String string2 = "layout";
        n8 = -1;
        if (bl2 && object2 != null && (n4 = ((String)object2).startsWith(string2)) != 0) {
            boolean bl3;
            n4 = ((String)object2).lastIndexOf(95);
            if (n4 > 0 && (bl3 = ViewDataBinding.isNumeric((String)object2, n4 += n10))) {
                n7 = ViewDataBinding.parseTagInt((String)object2, n4);
                object = objectArray[n7];
                if (object == null) {
                    objectArray[n7] = view2;
                }
                if (viewDataBinding$h2 == null) {
                    n7 = -1;
                }
                n4 = 1;
            } else {
                n7 = -1;
                n4 = 0;
                object = null;
            }
            n3 = n7;
        } else if (object2 != null && (n4 = ((String)object2).startsWith((String)(object = BINDING_TAG_PREFIX))) != 0) {
            n4 = BINDING_NUMBER_START;
            n7 = ViewDataBinding.parseTagInt((String)object2, n4);
            object = objectArray[n7];
            if (object == null) {
                objectArray[n7] = view2;
            }
            if (viewDataBinding$h2 == null) {
                n7 = -1;
            }
            n3 = n7;
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
            n3 = -1;
        }
        if (n4 == 0 && (n7 = view.getId()) > 0 && sparseIntArray2 != null && (n7 = sparseIntArray2.get(n7, n8)) >= 0 && (objectArray2 = objectArray[n7]) == null) {
            objectArray[n7] = view2;
        }
        if ((n7 = view2 instanceof ViewGroup) != 0) {
            View view3 = view2;
            view3 = (ViewGroup)view2;
            int n14 = view3.getChildCount();
            int n15 = 0;
            Object var7_8 = null;
            n7 = 0;
            object2 = null;
            while (n15 < n14) {
                int n16;
                int n17;
                Object object3;
                Object object4;
                Object object5;
                objectArray2 = view3.getChildAt(n15);
                if (n3 >= 0 && (n4 = (object = objectArray2.getTag()) instanceof String) != 0 && (object5 = ((String)(object = (String)objectArray2.getTag())).endsWith((String)(object4 = "_0"))) != 0 && (object5 = ((String)object).startsWith(string2)) != 0 && (object5 = ((String)object).indexOf(47)) > 0 && (n4 = ViewDataBinding.findIncludeIndex((String)object, n7, viewDataBinding$h2, n3)) >= 0) {
                    n7 = n4 + 1;
                    object4 = viewDataBinding$h2.b[n3];
                    object5 = object4[n4];
                    object3 = viewDataBinding$h2.c[n3];
                    n4 = object3[n4];
                    n17 = ViewDataBinding.findLastMatching((ViewGroup)view3, n15);
                    if (n17 == n15) {
                        object3 = bi0_0.a;
                        objectArray[object5] = object = ((MergedDataBinderMapper)object3).b(ai0_03, (View)objectArray2, n4);
                        n10 = n15;
                        n16 = n7;
                    } else {
                        int n18;
                        int n19 = (n17 -= n15) + 1;
                        View[] viewArray = new View[n19];
                        for (n10 = 0; n10 < n19; ++n10) {
                            n18 = n7;
                            n7 = n15 + n10;
                            object2 = view3.getChildAt(n7);
                            viewArray[n10] = object2;
                            n7 = n18;
                        }
                        n18 = n7;
                        objectArray[object5] = object2 = bi0_0.a.c(ai0_03, viewArray, n4);
                        n16 = n7;
                        n10 = n15 += n17;
                    }
                    n15 = 1;
                } else {
                    n10 = n15;
                    n16 = n7;
                    n15 = 0;
                    Object var7_10 = null;
                }
                if (n15 == 0) {
                    n17 = 0;
                    object3 = null;
                    ai0_0 ai0_04 = ai0_02;
                    object2 = objectArray2;
                    objectArray2 = objectArray;
                    object = viewDataBinding$h;
                    object4 = sparseIntArray;
                    ViewDataBinding.mapBindings(ai0_02, (View)object2, objectArray, viewDataBinding$h, sparseIntArray, false);
                }
                n15 = n10 + 1;
                n7 = n16;
                n10 = 1;
            }
        }
    }

    public static Object[] mapBindings(ai0_0 ai0_02, View view, int n3, ViewDataBinding$h viewDataBinding$h, SparseIntArray sparseIntArray) {
        Object[] objectArray = new Object[n3];
        ViewDataBinding.mapBindings(ai0_02, view, objectArray, viewDataBinding$h, sparseIntArray, true);
        return objectArray;
    }

    public static Object[] mapBindings(ai0_0 ai0_02, View[] viewArray, int n3, ViewDataBinding$h viewDataBinding$h, SparseIntArray sparseIntArray) {
        Object[] objectArray = new Object[n3];
        int n4 = 0;
        for (int i3 = 0; i3 < (n4 = viewArray.length); ++i3) {
            View view = viewArray[i3];
            boolean bl2 = true;
            ViewDataBinding.mapBindings(ai0_02, view, objectArray, viewDataBinding$h, sparseIntArray, bl2);
        }
        return objectArray;
    }

    public static byte parse(String string2, byte by2) {
        try {
            return Byte.parseByte(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return by2;
        }
    }

    public static char parse(String string2, char c2) {
        boolean bl2;
        if (string2 != null && !(bl2 = string2.isEmpty())) {
            return string2.charAt(0);
        }
        return c2;
    }

    public static double parse(String string2, double d2) {
        try {
            return Double.parseDouble(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return d2;
        }
    }

    public static float parse(String string2, float f5) {
        try {
            return Float.parseFloat(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return f5;
        }
    }

    public static int parse(String string2, int n3) {
        try {
            return Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return n3;
        }
    }

    public static long parse(String string2, long l2) {
        try {
            return Long.parseLong(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    public static short parse(String string2, short s7) {
        try {
            return Short.parseShort(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return s7;
        }
    }

    public static boolean parse(String string2, boolean bl2) {
        if (string2 == null) {
            return bl2;
        }
        return Boolean.parseBoolean(string2);
    }

    private static int parseTagInt(String string2, int n3) {
        int n4 = string2.length();
        int n7 = 0;
        while (n3 < n4) {
            n7 *= 10;
            int n8 = string2.charAt(n3) + -48;
            n7 += n8;
            ++n3;
        }
        return n7;
    }

    private static void processReferenceQueue() {
        if3_0 if3_02;
        while ((if3_02 = sReferenceQueue.poll()) != null) {
            boolean bl2 = if3_02 instanceof if3_0;
            if (!bl2) continue;
            if3_02 = if3_02;
            if3_02.a();
        }
    }

    public static byte safeUnbox(Byte by2) {
        byte by4;
        if (by2 == null) {
            by4 = 0;
            by2 = null;
        } else {
            by4 = by2;
        }
        return by4;
    }

    public static char safeUnbox(Character c2) {
        char c3;
        if (c2 == null) {
            c3 = '\u0000';
            c2 = null;
        } else {
            c3 = c2.charValue();
        }
        return c3;
    }

    public static double safeUnbox(Double d2) {
        double d5 = d2 == null ? 0.0 : d2;
        return d5;
    }

    public static float safeUnbox(Float f5) {
        float f6;
        if (f5 == null) {
            f6 = 0.0f;
            f5 = null;
        } else {
            f6 = f5.floatValue();
        }
        return f6;
    }

    public static int safeUnbox(Integer n3) {
        int n4;
        if (n3 == null) {
            n4 = 0;
            n3 = null;
        } else {
            n4 = n3;
        }
        return n4;
    }

    public static long safeUnbox(Long l2) {
        long l3 = l2 == null ? 0L : l2;
        return l3;
    }

    public static short safeUnbox(Short s7) {
        short s8;
        if (s7 == null) {
            s8 = 0;
            s7 = null;
        } else {
            s8 = s7;
        }
        return s8;
    }

    public static boolean safeUnbox(Boolean bl2) {
        boolean bl3;
        if (bl2 == null) {
            bl3 = false;
            bl2 = null;
        } else {
            bl3 = bl2;
        }
        return bl3;
    }

    public static void setBindingInverseListener(ViewDataBinding viewDataBinding, kk1_0 kk1_02, ViewDataBinding$k viewDataBinding$k) {
        if (kk1_02 != viewDataBinding$k) {
            if (kk1_02 != null) {
                kk1_02 = (ViewDataBinding$k)kk1_02;
                viewDataBinding.removeOnPropertyChangedCallback((c$a)((Object)kk1_02));
            }
            if (viewDataBinding$k != null) {
                viewDataBinding.addOnPropertyChangedCallback(viewDataBinding$k);
            }
        }
    }

    public static void setTo(LongSparseArray longSparseArray, int n3, Object object) {
        int n4;
        if (longSparseArray != null && n3 >= 0 && n3 < (n4 = longSparseArray.size())) {
            long l2 = n3;
            longSparseArray.put(l2, object);
        }
    }

    public static void setTo(SparseArray sparseArray, int n3, Object object) {
        int n4;
        if (sparseArray != null && n3 >= 0 && n3 < (n4 = sparseArray.size())) {
            sparseArray.put(n3, object);
        }
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray, int n3, boolean bl2) {
        int n4;
        if (sparseBooleanArray != null && n3 >= 0 && n3 < (n4 = sparseBooleanArray.size())) {
            sparseBooleanArray.put(n3, bl2);
        }
    }

    public static void setTo(SparseIntArray sparseIntArray, int n3, int n4) {
        int n7;
        if (sparseIntArray != null && n3 >= 0 && n3 < (n7 = sparseIntArray.size())) {
            sparseIntArray.put(n3, n4);
        }
    }

    public static void setTo(SparseLongArray sparseLongArray, int n3, long l2) {
        int n4;
        if (sparseLongArray != null && n3 >= 0 && n3 < (n4 = sparseLongArray.size())) {
            sparseLongArray.put(n3, l2);
        }
    }

    public static void setTo(List list, int n3, Object object) {
        int n4;
        if (list != null && n3 >= 0 && n3 < (n4 = list.size())) {
            list.set(n3, object);
        }
    }

    public static void setTo(Map map2, Object object, Object object2) {
        if (map2 == null) {
            return;
        }
        map2.put(object, object2);
    }

    public static void setTo(pb1_0 pb1_02, int n3, Object object) {
        int n4;
        if (pb1_02 != null && n3 >= 0 && n3 < (n4 = pb1_02.n())) {
            long l2 = n3;
            pb1_02.l(l2, object);
        }
    }

    public static void setTo(byte[] byArray, int n3, byte by2) {
        int n4;
        if (byArray != null && n3 >= 0 && n3 < (n4 = byArray.length)) {
            byArray[n3] = by2;
        }
    }

    public static void setTo(char[] cArray, int n3, char c2) {
        int n4;
        if (cArray != null && n3 >= 0 && n3 < (n4 = cArray.length)) {
            cArray[n3] = c2;
        }
    }

    public static void setTo(double[] dArray, int n3, double d2) {
        int n4;
        if (dArray != null && n3 >= 0 && n3 < (n4 = dArray.length)) {
            dArray[n3] = d2;
        }
    }

    public static void setTo(float[] fArray, int n3, float f5) {
        int n4;
        if (fArray != null && n3 >= 0 && n3 < (n4 = fArray.length)) {
            fArray[n3] = f5;
        }
    }

    public static void setTo(int[] nArray, int n3, int n4) {
        int n7;
        if (nArray != null && n3 >= 0 && n3 < (n7 = nArray.length)) {
            nArray[n3] = n4;
        }
    }

    public static void setTo(long[] lArray, int n3, long l2) {
        int n4;
        if (lArray != null && n3 >= 0 && n3 < (n4 = lArray.length)) {
            lArray[n3] = l2;
        }
    }

    public static void setTo(Object[] objectArray, int n3, Object object) {
        int n4;
        if (objectArray != null && n3 >= 0 && n3 < (n4 = objectArray.length)) {
            objectArray[n3] = object;
        }
    }

    public static void setTo(short[] sArray, int n3, short s7) {
        int n4;
        if (sArray != null && n3 >= 0 && n3 < (n4 = sArray.length)) {
            sArray[n3] = s7;
        }
    }

    public static void setTo(boolean[] blArray, int n3, boolean bl2) {
        int n4;
        if (blArray != null && n3 >= 0 && n3 < (n4 = blArray.length)) {
            blArray[n3] = bl2;
        }
    }

    public void addOnRebindCallback(U82 u82) {
        b b2 = this.mRebindCallbacks;
        if (b2 == null) {
            b$a b$a = REBIND_NOTIFIER;
            this.mRebindCallbacks = b2 = new b(b$a);
        }
        this.mRebindCallbacks.b(u82);
    }

    public void ensureBindingComponentIsNotNull(Class object) {
        Object object2 = this.mBindingComponent;
        if (object2 != null) {
            return;
        }
        object2 = new StringBuilder("Required DataBindingComponent is null in class ");
        String string2 = this.getClass().getSimpleName();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(". A BindingAdapter in ");
        object = ((Class)object).getCanonicalName();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
        object = ((StringBuilder)object2).toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public abstract void executeBindings();

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            this.executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    public void forceExecuteBindings() {
        this.executeBindings();
    }

    public mu1_1 getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public Object getObservedField(int n3) {
        if3_0[] if3_0Array = this.mLocalFieldObservers;
        if3_0 if3_02 = if3_0Array[n3];
        if (if3_02 == null) {
            return null;
        }
        return if3_02.c;
    }

    public View getRoot() {
        return this.mRoot;
    }

    public void handleFieldChange(int n3, Object object, int n4) {
        boolean bl2 = this.mInLiveDataRegisterObserver;
        if (!bl2 && !(bl2 = this.mInStateFlowRegisterObserver) && (n3 = (int)(this.onFieldChange(n3, object, n4) ? 1 : 0)) != 0) {
            this.requestRebind();
        }
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    public abstract boolean onFieldChange(int var1, Object var2, int var3);

    public void registerTo(int n3, Object object, Vd0 object2) {
        if (object == null) {
            return;
        }
        Object object3 = this.mLocalFieldObservers[n3];
        if (object3 == null) {
            object3 = sReferenceQueue;
            object3 = object2.a(this, n3, (ReferenceQueue)object3);
            object2 = this.mLocalFieldObservers;
            object2[n3] = object3;
            mu1_1 mu1_12 = this.mLifecycleOwner;
            if (mu1_12 != null) {
                object2 = ((if3_0)object3).a;
                object2.a(mu1_12);
            }
        }
        ((if3_0)object3).a();
        ((if3_0)object3).c = object;
        ((if3_0)object3).a.d(object);
    }

    public void removeOnRebindCallback(U82 u82) {
        b b2 = this.mRebindCallbacks;
        if (b2 != null) {
            b2.i(u82);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void requestRebind() {
        Object object;
        boolean bl2;
        Object object2 = this.mContainingBinding;
        if (object2 != null) {
            ((ViewDataBinding)object2).requestRebind();
            return;
        }
        object2 = this.mLifecycleOwner;
        if (object2 != null && !(bl2 = ((i$b)((Object)(object2 = object2.getLifecycle().b()))).isAtLeast((i$b)((Object)(object = i$b.STARTED))))) {
            return;
        }
        // MONITORENTER : this
        bl2 = this.mPendingRebind;
        if (bl2) {
            // MONITOREXIT : this
            return;
        }
        this.mPendingRebind = bl2 = true;
        // MONITOREXIT : this
        bl2 = USE_CHOREOGRAPHER;
        if (bl2) {
            object2 = this.mChoreographer;
            object = this.mFrameCallback;
            object2.postFrameCallback((Choreographer.FrameCallback)object);
            return;
        }
        object2 = this.mUIThreadHandler;
        object = this.mRebindRunnable;
        object2.post((Runnable)object);
    }

    public void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    public void setLifecycleOwner(mu1_1 mu1_12) {
        ViewDataBinding$j viewDataBinding$j;
        boolean cfr_ignored_0 = mu1_12 instanceof Fragment;
        Object object = this.mLifecycleOwner;
        if (object == mu1_12) {
            return;
        }
        if (object != null) {
            object = object.getLifecycle();
            viewDataBinding$j = this.mOnStartListener;
            ((i)object).c(viewDataBinding$j);
        }
        this.mLifecycleOwner = mu1_12;
        if (mu1_12 != null) {
            object = this.mOnStartListener;
            if (object == null) {
                int n3 = 0;
                viewDataBinding$j = null;
                this.mOnStartListener = object = new ViewDataBinding$j(this, null);
            }
            object = mu1_12.getLifecycle();
            viewDataBinding$j = this.mOnStartListener;
            ((i)object).a(viewDataBinding$j);
        }
        for (if3_0 if3_02 : this.mLocalFieldObservers) {
            if (if3_02 == null) continue;
            z62_0 z62_02 = if3_02.a;
            z62_02.a(mu1_12);
        }
    }

    public void setRootTag(View view) {
        int n3 = R$id.dataBinding;
        view.setTag(n3, (Object)this);
    }

    public void setRootTag(View[] viewArray) {
        for (View view : viewArray) {
            int n3 = R$id.dataBinding;
            view.setTag(n3, (Object)this);
        }
    }

    public abstract boolean setVariable(int var1, Object var2);

    public void unbind() {
        for (if3_0 if3_02 : this.mLocalFieldObservers) {
            if (if3_02 == null) continue;
            if3_02.a();
        }
    }

    public boolean unregisterFrom(int n3) {
        if3_0[] if3_0Array = this.mLocalFieldObservers;
        if3_0 if3_02 = if3_0Array[n3];
        if (if3_02 != null) {
            return if3_02.a();
        }
        return false;
    }

    public boolean updateLiveDataRegistration(int n3, LiveData liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            Vd0 vd0 = CREATE_LIVE_DATA_LISTENER;
            n3 = (int)(this.updateRegistration(n3, liveData, vd0) ? 1 : 0);
            return n3 != 0;
        }
        finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    public boolean updateRegistration(int n3, c c2) {
        Vd0 vd0 = CREATE_PROPERTY_LISTENER;
        return this.updateRegistration(n3, c2, vd0);
    }

    public boolean updateRegistration(int n3, d d2) {
        Vd0 vd0 = CREATE_LIST_LISTENER;
        return this.updateRegistration(n3, d2, vd0);
    }

    public boolean updateRegistration(int n3, e e2) {
        Vd0 vd0 = CREATE_MAP_LISTENER;
        return this.updateRegistration(n3, e2, vd0);
    }

    public boolean updateRegistration(int n3, Object object, Vd0 vd0) {
        if (object == null) {
            return this.unregisterFrom(n3);
        }
        Object object2 = this.mLocalFieldObservers[n3];
        boolean bl2 = true;
        if (object2 == null) {
            this.registerTo(n3, object, vd0);
            return bl2;
        }
        object2 = ((if3_0)object2).c;
        if (object2 == object) {
            return false;
        }
        this.unregisterFrom(n3);
        this.registerTo(n3, object, vd0);
        return bl2;
    }
}

