/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.InflateException
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.WindowId
 *  android.view.animation.AnimationUtils
 *  android.widget.ListView
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.transition.PathMotion;
import androidx.transition.Transition$b;
import androidx.transition.Transition$c;
import androidx.transition.Transition$d;
import androidx.transition.Transition$e;
import androidx.transition.Transition$f;
import androidx.transition.Transition$g;
import androidx.transition.Transition$h;
import androidx.transition.Transition$i;
import androidx.transition.Transition$j;
import androidx.transition.TransitionSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

public abstract class Transition
implements Cloneable {
    static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private static final PathMotion STRAIGHT_PATH_MOTION;
    private static ThreadLocal sRunningAnimators;
    private Animator[] mAnimatorCache;
    ArrayList mAnimators;
    boolean mCanRemoveViews;
    private Transition mCloneParent;
    ArrayList mCurrentAnimators;
    long mDuration;
    private Pr3 mEndValues;
    private ArrayList mEndValuesList;
    boolean mEnded;
    private Transition$f mEpicenterCallback;
    private TimeInterpolator mInterpolator;
    private ArrayList mListeners;
    private Transition$i[] mListenersCache;
    private int[] mMatchOrder;
    private String mName;
    private Jp mNameOverrides;
    int mNumInstances;
    TransitionSet mParent;
    private PathMotion mPathMotion;
    private boolean mPaused;
    Kr3 mPropagation;
    Transition$h mSeekController;
    long mSeekOffsetInParent;
    private long mStartDelay;
    private Pr3 mStartValues;
    private ArrayList mStartValuesList;
    private ArrayList mTargetChildExcludes;
    private ArrayList mTargetExcludes;
    private ArrayList mTargetIdChildExcludes;
    private ArrayList mTargetIdExcludes;
    ArrayList mTargetIds;
    private ArrayList mTargetNameExcludes;
    private ArrayList mTargetNames;
    private ArrayList mTargetTypeChildExcludes;
    private ArrayList mTargetTypeExcludes;
    private ArrayList mTargetTypes;
    ArrayList mTargets;
    long mTotalDuration;

    static {
        EMPTY_ANIMATOR_ARRAY = new Animator[0];
        DEFAULT_MATCH_ORDER = new int[]{2, 1, 3, 4};
        ThreadLocal threadLocal = new ThreadLocal();
        STRAIGHT_PATH_MOTION = threadLocal;
        sRunningAnimators = threadLocal = new ThreadLocal();
    }

    public Transition() {
        Animator[] animatorArray;
        long l2;
        Object object = this.getClass().getName();
        this.mName = object;
        this.mStartDelay = l2 = (long)-1;
        this.mDuration = l2;
        this.mInterpolator = null;
        Object object2 = new ArrayList();
        this.mTargetIds = object2;
        object2 = new ArrayList();
        this.mTargets = object2;
        this.mTargetNames = null;
        this.mTargetTypes = null;
        this.mTargetIdExcludes = null;
        this.mTargetExcludes = null;
        this.mTargetTypeExcludes = null;
        this.mTargetNameExcludes = null;
        this.mTargetIdChildExcludes = null;
        this.mTargetChildExcludes = null;
        this.mTargetTypeChildExcludes = null;
        this.mStartValues = object2 = new Pr3();
        this.mEndValues = object2 = new Pr3();
        this.mParent = null;
        object2 = DEFAULT_MATCH_ORDER;
        this.mMatchOrder = (int[])object2;
        this.mCanRemoveViews = false;
        this.mCurrentAnimators = animatorArray = new ArrayList();
        animatorArray = EMPTY_ANIMATOR_ARRAY;
        this.mAnimatorCache = animatorArray;
        this.mNumInstances = 0;
        this.mPaused = false;
        this.mEnded = false;
        this.mCloneParent = null;
        this.mListeners = null;
        object = new ArrayList();
        this.mAnimators = object;
        this.mPathMotion = object = STRAIGHT_PATH_MOTION;
    }

    public Transition(Context object, AttributeSet attributeSet) {
        Object object2;
        long l2;
        Object object3 = this.getClass().getName();
        this.mName = object3;
        this.mStartDelay = l2 = (long)-1;
        this.mDuration = l2;
        this.mInterpolator = null;
        Object object4 = new ArrayList();
        this.mTargetIds = object4;
        object4 = new ArrayList();
        this.mTargets = object4;
        this.mTargetNames = null;
        this.mTargetTypes = null;
        this.mTargetIdExcludes = null;
        this.mTargetExcludes = null;
        this.mTargetTypeExcludes = null;
        this.mTargetNameExcludes = null;
        this.mTargetIdChildExcludes = null;
        this.mTargetChildExcludes = null;
        this.mTargetTypeChildExcludes = null;
        this.mStartValues = object4 = new Pr3();
        this.mEndValues = object4 = new Pr3();
        this.mParent = null;
        object4 = DEFAULT_MATCH_ORDER;
        this.mMatchOrder = (int[])object4;
        int n3 = 0;
        object4 = null;
        this.mCanRemoveViews = false;
        this.mCurrentAnimators = object2 = new ArrayList();
        object2 = EMPTY_ANIMATOR_ARRAY;
        this.mAnimatorCache = object2;
        this.mNumInstances = 0;
        this.mPaused = false;
        this.mEnded = false;
        this.mCloneParent = null;
        this.mListeners = null;
        object3 = new ArrayList();
        this.mAnimators = object3;
        this.mPathMotion = object3 = STRAIGHT_PATH_MOTION;
        object3 = af3.a;
        object3 = object.obtainStyledAttributes(attributeSet, (int[])object3);
        attributeSet = (XmlResourceParser)attributeSet;
        object2 = "duration";
        int n4 = 1;
        int n7 = -1;
        int n8 = dt3.d((TypedArray)object3, (XmlPullParser)attributeSet, (String)object2, n4, n7);
        long l3 = n8;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 >= 0) {
            this.setDuration(l3);
        }
        if ((n8 = (int)(dt3.f((XmlPullParser)attributeSet, (String)(object2 = "startDelay")) ? 1 : 0)) != 0) {
            n8 = 2;
            n7 = object3.getInt(n8, n7);
        }
        l3 = n7;
        n7 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1));
        if (n7 > 0) {
            this.setStartDelay(l3);
        }
        if ((n8 = (int)(dt3.f((XmlPullParser)attributeSet, (String)(object2 = "interpolator")) ? 1 : 0)) != 0) {
            n3 = object3.getResourceId(0, 0);
        }
        if (n3 > 0) {
            object = AnimationUtils.loadInterpolator((Context)object, (int)n3);
            this.setInterpolator((TimeInterpolator)object);
        }
        if ((object = dt3.e((TypedArray)object3, (XmlPullParser)attributeSet, "matchOrder", n3 = 3)) != null) {
            object = Transition.parseMatchOrder((String)object);
            this.setMatchOrder((int[])object);
        }
        object3.recycle();
    }

    public static /* synthetic */ Transition access$000(Transition transition2) {
        return transition2.mCloneParent;
    }

    public static /* synthetic */ Transition access$002(Transition transition2, Transition transition3) {
        transition2.mCloneParent = transition3;
        return transition3;
    }

    private void addUnmatched(Jp object, Jp jp) {
        int n3;
        int n4;
        int n7;
        int n8 = 0;
        Object object2 = null;
        for (n7 = 0; n7 < (n4 = ((a53)object).c); ++n7) {
            Object object3 = (Or3)((a53)object).l(n7);
            Object object4 = ((Or3)object3).b;
            boolean bl2 = this.isValidTarget((View)object4);
            if (!bl2) continue;
            object4 = this.mStartValuesList;
            ((ArrayList)object4).add(object3);
            object3 = this.mEndValuesList;
            ((ArrayList)object3).add(null);
        }
        while (n8 < (n3 = jp.c)) {
            object = (Or3)jp.l(n8);
            object2 = ((Or3)object).b;
            n7 = (int)(this.isValidTarget((View)object2) ? 1 : 0);
            if (n7 != 0) {
                object2 = this.mEndValuesList;
                ((ArrayList)object2).add(object);
                object = this.mStartValuesList;
                ((ArrayList)object).add(null);
            }
            ++n8;
        }
    }

    private static void addViewValues(Pr3 object, View view, Or3 object2) {
        int n3;
        boolean bl2;
        int n4;
        Object object3;
        ((Pr3)object).a.put(view, object2);
        int bl22 = view.getId();
        if (bl22 >= 0) {
            object3 = ((Pr3)object).b;
            n4 = object3.indexOfKey(bl22);
            if (n4 >= 0) {
                object3.put(bl22, null);
            } else {
                object3.put(bl22, (Object)view);
            }
        }
        object2 = ViewCompat.a;
        object2 = ViewCompat$c.g(view);
        if (object2 != null) {
            object3 = ((Pr3)object).d;
            n4 = (int)(((a53)object3).containsKey(object2) ? 1 : 0);
            if (n4 != 0) {
                ((a53)object3).put(object2, null);
            } else {
                ((a53)object3).put(object2, view);
            }
        }
        if ((bl2 = (object2 = view.getParent()) instanceof ListView) && (n3 = (object3 = (object2 = (ListView)view.getParent()).getAdapter()).hasStableIds()) != 0) {
            object = ((Pr3)object).c;
            n3 = object2.getPositionForView(view);
            long l2 = object2.getItemIdAtPosition(n3);
            int n7 = ((pb1_0)object).i(l2);
            if (n7 >= 0) {
                view = (View)((pb1_0)object).f(l2);
                if (view != null) {
                    boolean bl3 = false;
                    object2 = null;
                    view.setHasTransientState(false);
                    ((pb1_0)object).l(l2, null);
                }
            } else {
                boolean bl4 = true;
                view.setHasTransientState(bl4);
                ((pb1_0)object).l(l2, view);
            }
        }
    }

    private static boolean alreadyContains(int[] nArray, int n3) {
        int n4 = nArray[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = nArray[i3];
            if (n7 != n4) continue;
            return true;
        }
        return false;
    }

    private void captureHierarchy(View view, boolean bl2) {
        int n3;
        Object object;
        Integer n4;
        int n7;
        if (view == null) {
            return;
        }
        int n8 = view.getId();
        Object object2 = this.mTargetIdExcludes;
        if (object2 != null && (n7 = ((ArrayList)object2).contains(n4 = Integer.valueOf(n8))) != 0) {
            return;
        }
        object2 = this.mTargetExcludes;
        if (object2 != null && (n7 = ((ArrayList)object2).contains(view)) != 0) {
            return;
        }
        object2 = this.mTargetTypeExcludes;
        int n10 = 0;
        n4 = null;
        if (object2 != null) {
            n7 = ((ArrayList)object2).size();
            object = null;
            for (n3 = 0; n3 < n7; ++n3) {
                Class clazz = (Class)this.mTargetTypeExcludes.get(n3);
                boolean bl3 = clazz.isInstance(view);
                if (!bl3) continue;
                return;
            }
        }
        if ((n7 = (object2 = view.getParent()) instanceof ViewGroup) != 0) {
            object2 = new Or3(view);
            if (bl2) {
                this.captureStartValues((Or3)object2);
            } else {
                this.captureEndValues((Or3)object2);
            }
            object = ((Or3)object2).c;
            ((ArrayList)object).add(this);
            this.capturePropagationValues((Or3)object2);
            if (bl2) {
                object = this.mStartValues;
                Transition.addViewValues((Pr3)object, view, (Or3)object2);
            } else {
                object = this.mEndValues;
                Transition.addViewValues((Pr3)object, view, (Or3)object2);
            }
        }
        if ((n7 = view instanceof ViewGroup) != 0) {
            Serializable serializable;
            object2 = this.mTargetIdChildExcludes;
            if (object2 != null && (n8 = (int)(((ArrayList)object2).contains(serializable = Integer.valueOf(n8)) ? 1 : 0)) != 0) {
                return;
            }
            serializable = this.mTargetChildExcludes;
            if (serializable != null && (n8 = (int)(((ArrayList)serializable).contains(view) ? 1 : 0)) != 0) {
                return;
            }
            serializable = this.mTargetTypeChildExcludes;
            if (serializable != null) {
                n8 = ((ArrayList)serializable).size();
                object2 = null;
                for (n7 = 0; n7 < n8; ++n7) {
                    object = (Class)this.mTargetTypeChildExcludes.get(n7);
                    n3 = (int)(((Class)object).isInstance(view) ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                }
            }
            view = (ViewGroup)view;
            while (n10 < (n8 = view.getChildCount())) {
                serializable = view.getChildAt(n10);
                this.captureHierarchy((View)serializable, bl2);
                ++n10;
            }
        }
    }

    private ArrayList excludeId(ArrayList arrayList, int n3, boolean bl2) {
        if (n3 > 0) {
            if (bl2) {
                Integer n4 = n3;
                arrayList = Transition$e.a(n4, arrayList);
            } else {
                Integer n7 = n3;
                arrayList = Transition$e.b(n7, arrayList);
            }
        }
        return arrayList;
    }

    private static ArrayList excludeObject(ArrayList arrayList, Object object, boolean bl2) {
        if (object != null) {
            arrayList = bl2 ? Transition$e.a(object, arrayList) : Transition$e.b(object, arrayList);
        }
        return arrayList;
    }

    private ArrayList excludeType(ArrayList arrayList, Class clazz, boolean bl2) {
        if (clazz != null) {
            arrayList = bl2 ? Transition$e.a(clazz, arrayList) : Transition$e.b(clazz, arrayList);
        }
        return arrayList;
    }

    private ArrayList excludeView(ArrayList arrayList, View view, boolean bl2) {
        if (view != null) {
            arrayList = bl2 ? Transition$e.a(view, arrayList) : Transition$e.b(view, arrayList);
        }
        return arrayList;
    }

    private static Jp getRunningAnimators() {
        Jp jp = (Jp)sRunningAnimators.get();
        if (jp == null) {
            jp = new Jp();
            ThreadLocal threadLocal = sRunningAnimators;
            threadLocal.set(jp);
        }
        return jp;
    }

    private static boolean isValidMatch(int n3) {
        int n4;
        int n7 = 1;
        if (n3 < n7 || n3 > (n4 = 4)) {
            n7 = 0;
        }
        return n7 != 0;
    }

    private static boolean isValueChanged(Or3 or3, Or3 or32, String string2) {
        boolean bl2;
        or3 = or3.a.get(string2);
        or32 = or32.a.get(string2);
        if (or3 == null && or32 == null) {
            bl2 = false;
            or3 = null;
        } else {
            boolean bl3 = true;
            bl2 = or3 != null && or32 != null ? ((Object)or3).equals(or32) ^ bl3 : true;
        }
        return bl2;
    }

    private void matchIds(Jp jp, Jp jp2, SparseArray sparseArray, SparseArray sparseArray2) {
        int n3 = sparseArray.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            View view;
            int n4;
            View view2 = (View)sparseArray.valueAt(i3);
            if (view2 == null || (n4 = this.isValidTarget(view2)) == 0 || (view = (View)sparseArray2.get(n4 = sparseArray.keyAt(i3))) == null || !(bl2 = this.isValidTarget(view))) continue;
            Object object = (Or3)jp.get(view2);
            Or3 or3 = (Or3)jp2.get(view);
            if (object == null || or3 == null) continue;
            ArrayList arrayList = this.mStartValuesList;
            arrayList.add(object);
            object = this.mEndValuesList;
            ((ArrayList)object).add(or3);
            jp.remove(view2);
            jp2.remove(view);
        }
    }

    private void matchInstances(Jp jp, Jp jp2) {
        for (int i3 = jp.c + -1; i3 >= 0; i3 += -1) {
            Object object;
            boolean bl2;
            Object object2 = (View)jp.h(i3);
            if (object2 == null || !(bl2 = this.isValidTarget((View)object2)) || (object2 = (Or3)jp2.remove(object2)) == null || !(bl2 = this.isValidTarget((View)(object = object2.b)))) continue;
            object = (Or3)jp.j(i3);
            ArrayList arrayList = this.mStartValuesList;
            arrayList.add(object);
            object = this.mEndValuesList;
            ((ArrayList)object).add(object2);
        }
    }

    private void matchItemIds(Jp jp, Jp jp2, pb1_0 pb1_02, pb1_0 pb1_03) {
        int n3 = pb1_02.n();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            long l2;
            View view;
            boolean bl3;
            View view2 = (View)pb1_02.o(i3);
            if (view2 == null || !(bl3 = this.isValidTarget(view2)) || (view = (View)pb1_03.f(l2 = pb1_02.k(i3))) == null || !(bl2 = this.isValidTarget(view))) continue;
            Object object = (Or3)jp.get(view2);
            Or3 or3 = (Or3)jp2.get(view);
            if (object == null || or3 == null) continue;
            ArrayList arrayList = this.mStartValuesList;
            arrayList.add(object);
            object = this.mEndValuesList;
            ((ArrayList)object).add(or3);
            jp.remove(view2);
            jp2.remove(view);
        }
    }

    private void matchNames(Jp jp, Jp jp2, Jp jp4, Jp jp5) {
        int n3 = jp4.c;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            boolean bl3;
            View view = (View)jp4.l(i3);
            if (view == null || !(bl3 = this.isValidTarget(view))) continue;
            Object object = jp4.h(i3);
            if ((object = (View)jp5.get(object)) == null || !(bl2 = this.isValidTarget((View)object))) continue;
            Object object2 = (Or3)jp.get(view);
            Or3 or3 = (Or3)jp2.get(object);
            if (object2 == null || or3 == null) continue;
            ArrayList arrayList = this.mStartValuesList;
            arrayList.add(object2);
            object2 = this.mEndValuesList;
            ((ArrayList)object2).add(or3);
            jp.remove(view);
            jp2.remove(object);
        }
    }

    private void matchStartAndEnd(Pr3 pr3, Pr3 pr32) {
        Object object;
        int n3;
        Jp jp = pr3.a;
        Jp jp2 = new a53(jp);
        Jp jp4 = pr32.a;
        jp = new a53(jp4);
        jp4 = null;
        for (int i3 = 0; i3 < (n3 = ((int[])(object = this.mMatchOrder)).length); ++i3) {
            int n4 = object[i3];
            n3 = 1;
            if (n4 != n3) {
                Object object2;
                n3 = 2;
                if (n4 != n3) {
                    n3 = 3;
                    if (n4 != n3) {
                        n3 = 4;
                        if (n4 != n3) continue;
                        object = pr3.c;
                        object2 = pr32.c;
                        this.matchItemIds(jp2, jp, (pb1_0)object, (pb1_0)object2);
                        continue;
                    }
                    object = pr3.b;
                    object2 = pr32.b;
                    this.matchIds(jp2, jp, (SparseArray)object, (SparseArray)object2);
                    continue;
                }
                object = pr3.d;
                object2 = pr32.d;
                this.matchNames(jp2, jp, (Jp)object, (Jp)object2);
                continue;
            }
            this.matchInstances(jp2, jp);
        }
        this.addUnmatched(jp2, jp);
    }

    private void notifyFromTransition(Transition transition2, Transition$j transition$j, boolean bl2) {
        int n3;
        Cloneable cloneable = this.mCloneParent;
        if (cloneable != null) {
            ((Transition)cloneable).notifyFromTransition(transition2, transition$j, bl2);
        }
        if ((cloneable = this.mListeners) != null && (n3 = ((ArrayList)cloneable).isEmpty()) == 0) {
            cloneable = this.mListeners;
            n3 = ((ArrayList)cloneable).size();
            Transition$i[] transition$iArray = this.mListenersCache;
            if (transition$iArray == null) {
                transition$iArray = new Transition$i[n3];
            }
            this.mListenersCache = null;
            transition$iArray = this.mListeners.toArray(transition$iArray);
            for (int i3 = 0; i3 < n3; ++i3) {
                Transition$i transition$i = transition$iArray[i3];
                transition$j.a(transition$i, transition2, bl2);
                transition$iArray[i3] = null;
            }
            this.mListenersCache = transition$iArray;
        }
    }

    private static int[] parseMatchOrder(String object) {
        int n3;
        Object object2 = new StringTokenizer((String)object, ",");
        int n4 = ((StringTokenizer)object2).countTokens();
        object = new int[n4];
        int n7 = 0;
        while ((n3 = ((StringTokenizer)object2).hasMoreTokens()) != 0) {
            Object object3;
            block8: {
                int n8;
                block4: {
                    boolean bl2;
                    block7: {
                        String string2;
                        block6: {
                            block5: {
                                block3: {
                                    object3 = ((StringTokenizer)object2).nextToken().trim();
                                    string2 = MATCH_ID_STR;
                                    bl2 = string2.equalsIgnoreCase((String)object3);
                                    n8 = 1;
                                    if (!bl2) break block3;
                                    n3 = 3;
                                    object[n7] = n3;
                                    break block4;
                                }
                                string2 = MATCH_INSTANCE_STR;
                                bl2 = string2.equalsIgnoreCase((String)object3);
                                if (!bl2) break block5;
                                object[n7] = n8;
                                break block4;
                            }
                            string2 = MATCH_NAME_STR;
                            bl2 = string2.equalsIgnoreCase((String)object3);
                            if (!bl2) break block6;
                            n3 = 2;
                            object[n7] = n3;
                            break block4;
                        }
                        string2 = MATCH_ITEM_ID_STR;
                        bl2 = string2.equalsIgnoreCase((String)object3);
                        if (!bl2) break block7;
                        n3 = 4;
                        object[n7] = n3;
                        break block4;
                    }
                    bl2 = ((String)object3).isEmpty();
                    if (!bl2) break block8;
                    n3 = ((Object)object).length - n8;
                    object3 = new int[n3];
                    System.arraycopy(object, 0, object3, 0, n7);
                    n7 += -1;
                    object = object3;
                }
                n7 += n8;
                continue;
            }
            object2 = cP.a("Unknown match type in matchOrder: '", (String)object3, "'");
            object = new InflateException((String)object2);
            throw object;
        }
        return object;
    }

    private void runAnimator(Animator animator2, Jp jp) {
        if (animator2 != null) {
            Transition$b transition$b = new Transition$b(this, jp);
            animator2.addListener((Animator.AnimatorListener)transition$b);
            this.animate(animator2);
        }
    }

    public Transition addListener(Transition$i transition$i) {
        ArrayList arrayList = this.mListeners;
        if (arrayList == null) {
            this.mListeners = arrayList = new ArrayList();
        }
        this.mListeners.add(transition$i);
        return this;
    }

    public Transition addTarget(int n3) {
        if (n3 != 0) {
            ArrayList arrayList = this.mTargetIds;
            Integer n4 = n3;
            arrayList.add(n4);
        }
        return this;
    }

    public Transition addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public Transition addTarget(Class clazz) {
        ArrayList arrayList = this.mTargetTypes;
        if (arrayList == null) {
            this.mTargetTypes = arrayList = new ArrayList();
        }
        this.mTargetTypes.add(clazz);
        return this;
    }

    public Transition addTarget(String string2) {
        ArrayList arrayList = this.mTargetNames;
        if (arrayList == null) {
            this.mTargetNames = arrayList = new ArrayList();
        }
        this.mTargetNames.add(string2);
        return this;
    }

    public void animate(Animator animator2) {
        if (animator2 == null) {
            this.end();
        } else {
            Object object;
            long l2;
            long l3;
            long l4 = this.getDuration();
            long l7 = l4 - (l3 = 0L);
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 >= 0) {
                l4 = this.getDuration();
                animator2.setDuration(l4);
            }
            if ((object2 = (l2 = (l4 = this.getStartDelay()) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
                l4 = this.getStartDelay();
                l3 = animator2.getStartDelay() + l4;
                animator2.setStartDelay(l3);
            }
            if ((object = this.getInterpolator()) != null) {
                object = this.getInterpolator();
                animator2.setInterpolator(object);
            }
            object = new Transition$c(this);
            animator2.addListener((Animator.AnimatorListener)object);
            animator2.start();
        }
    }

    public void cancel() {
        Object object = this.mCurrentAnimators;
        int n3 = ((ArrayList)object).size();
        Animator[] animatorArray = this.mCurrentAnimators;
        Animator animator2 = this.mAnimatorCache;
        animatorArray = animatorArray.toArray((T[])animator2);
        animator2 = EMPTY_ANIMATOR_ARRAY;
        this.mAnimatorCache = animator2;
        n3 += -1;
        while (n3 >= 0) {
            animator2 = animatorArray[n3];
            animatorArray[n3] = null;
            animator2.cancel();
            n3 += -1;
        }
        this.mAnimatorCache = animatorArray;
        object = Transition$j.c;
        this.notifyListeners((Transition$j)object, false);
    }

    public abstract void captureEndValues(Or3 var1);

    public void capturePropagationValues(Or3 object) {
        int n3;
        Object object2 = this.mPropagation;
        if (object2 != null && (n3 = (object2 = ((Or3)object).a).isEmpty()) == 0) {
            int n4;
            this.mPropagation.getClass();
            object2 = ue3_0.a;
            int n7 = 0;
            String string2 = null;
            for (Object object3 = 0; object3 < (n4 = 2); ++object3) {
                HashMap hashMap = ((Or3)object).a;
                String string3 = object2[object3];
                int n8 = hashMap.containsKey(string3);
                if (n8 != 0) continue;
                ((ue3_0)this.mPropagation).getClass();
                object = ((Or3)object).b;
                object2 = (Integer)hashMap.get("android:visibility:visibility");
                if (object2 == null) {
                    n3 = object.getVisibility();
                    object2 = n3;
                }
                string2 = "android:visibilityPropagation:visibility";
                hashMap.put(string2, object2);
                object2 = new int[n4];
                object.getLocationOnScreen((int[])object2);
                object3 = object2[0];
                n8 = Math.round(object.getTranslationX()) + object3;
                object2[0] = (String)n8;
                object3 = object.getWidth() / n4 + n8;
                object2[0] = (String)object3;
                n7 = 1;
                object3 = object2[n7];
                float f5 = object.getTranslationY();
                n8 = Math.round(f5) + object3;
                object2[n7] = (String)n8;
                int n10 = object.getHeight() / n4 + n8;
                object2[n7] = (String)n10;
                object = "android:visibilityPropagation:center";
                hashMap.put(object, object2);
                break;
            }
        }
    }

    public abstract void captureStartValues(Or3 var1);

    public void captureValues(ViewGroup object, boolean bl2) {
        int n3;
        Object object2;
        Object object3;
        this.clearValues(bl2);
        ArrayList arrayList = this.mTargetIds;
        int n4 = arrayList.size();
        int n7 = 0;
        if (n4 <= 0 && (n4 = (arrayList = this.mTargets).size()) <= 0 || (arrayList = this.mTargetNames) != null && (n4 = (int)(arrayList.isEmpty() ? 1 : 0)) == 0 || (arrayList = this.mTargetTypes) != null && (n4 = (int)(arrayList.isEmpty() ? 1 : 0)) == 0) {
            this.captureHierarchy((View)object, bl2);
        } else {
            int n8;
            arrayList = null;
            for (n4 = 0; n4 < (n8 = ((ArrayList)(object3 = this.mTargetIds)).size()); ++n4) {
                n8 = (Integer)this.mTargetIds.get(n4);
                object3 = object.findViewById(n8);
                if (object3 == null) continue;
                object2 = new Or3((View)object3);
                if (bl2) {
                    this.captureStartValues((Or3)object2);
                } else {
                    this.captureEndValues((Or3)object2);
                }
                Object object4 = ((Or3)object2).c;
                ((ArrayList)object4).add(this);
                this.capturePropagationValues((Or3)object2);
                if (bl2) {
                    object4 = this.mStartValues;
                    Transition.addViewValues((Pr3)object4, (View)object3, (Or3)object2);
                    continue;
                }
                object4 = this.mEndValues;
                Transition.addViewValues((Pr3)object4, (View)object3, (Or3)object2);
            }
            object = null;
            for (n3 = 0; n3 < (n4 = (arrayList = this.mTargets).size()); ++n3) {
                arrayList = (View)this.mTargets.get(n3);
                object3 = new Or3((View)arrayList);
                if (bl2) {
                    this.captureStartValues((Or3)object3);
                } else {
                    this.captureEndValues((Or3)object3);
                }
                object2 = ((Or3)object3).c;
                ((ArrayList)object2).add(this);
                this.capturePropagationValues((Or3)object3);
                if (bl2) {
                    object2 = this.mStartValues;
                    Transition.addViewValues((Pr3)object2, (View)arrayList, (Or3)object3);
                    continue;
                }
                object2 = this.mEndValues;
                Transition.addViewValues((Pr3)object2, (View)arrayList, (Or3)object3);
            }
        }
        if (!bl2 && (object = this.mNameOverrides) != null) {
            n3 = object.c;
            ArrayList<Object> arrayList2 = new ArrayList<Object>(n3);
            arrayList = null;
            for (n4 = 0; n4 < n3; ++n4) {
                object3 = (String)this.mNameOverrides.h(n4);
                object2 = this.mStartValues.d;
                object3 = (View)((a53)object2).remove(object3);
                arrayList2.add(object3);
            }
            while (n7 < n3) {
                arrayList = (View)arrayList2.get(n7);
                if (arrayList != null) {
                    object3 = (String)this.mNameOverrides.l(n7);
                    object2 = this.mStartValues.d;
                    ((a53)object2).put(object3, arrayList);
                }
                ++n7;
            }
        }
    }

    public void clearValues(boolean bl2) {
        if (bl2) {
            this.mStartValues.a.clear();
            this.mStartValues.b.clear();
            pb1_0 pb1_02 = this.mStartValues.c;
            pb1_02.d();
        } else {
            this.mEndValues.a.clear();
            this.mEndValues.b.clear();
            pb1_0 pb1_03 = this.mEndValues.c;
            pb1_03.d();
        }
    }

    public Transition clone() {
        Object object;
        Object object2;
        try {
            object2 = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            object = new RuntimeException(cloneNotSupportedException);
            throw object;
        }
        object2 = (Transition)object2;
        object = new ArrayList();
        ((Transition)object2).mAnimators = object;
        object = new Pr3();
        ((Transition)object2).mStartValues = object;
        object = new Pr3();
        ((Transition)object2).mEndValues = object;
        object = null;
        ((Transition)object2).mStartValuesList = null;
        ((Transition)object2).mEndValuesList = null;
        ((Transition)object2).mSeekController = null;
        ((Transition)object2).mCloneParent = this;
        ((Transition)object2).mListeners = null;
        return object2;
    }

    public Animator createAnimator(ViewGroup viewGroup, Or3 or3, Or3 or32) {
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void createAnimators(ViewGroup viewGroup, Pr3 pr3, Pr3 pr32, ArrayList arrayList, ArrayList arrayList2) {
        boolean bl2;
        Transition transition2 = this;
        ViewGroup viewGroup2 = viewGroup;
        Jp jp = Transition.getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int n3 = arrayList.size();
        Transition$h h3 = this.getRootTransition().mSeekController;
        if (h3 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            h3 = null;
        }
        long l2 = Long.MAX_VALUE;
        int n4 = 0;
        Object var16_19 = null;
        while (true) {
            int n7;
            int n8;
            block19: {
                void var21_38;
                long l3;
                Object object;
                Object object2;
                View view;
                int n10;
                Or3 or3;
                Or3 or32;
                Object object3;
                block22: {
                    block12: {
                        void var29_51;
                        boolean bl3;
                        int n14;
                        Object object4;
                        block21: {
                            block13: {
                                Animator animator2;
                                block15: {
                                    block16: {
                                        block20: {
                                            block17: {
                                                block18: {
                                                    block14: {
                                                        ArrayList arrayList3;
                                                        ArrayList arrayList4;
                                                        int n15;
                                                        if (n4 >= n3) break block13;
                                                        object3 = arrayList;
                                                        or32 = (Or3)arrayList.get(n4);
                                                        object4 = arrayList2;
                                                        or3 = (Or3)arrayList2.get(n4);
                                                        if (or32 != null && (n15 = (arrayList4 = or32.c).contains(transition2)) == 0) {
                                                            n10 = 0;
                                                            or32 = null;
                                                        }
                                                        if (or3 != null && (n15 = (arrayList3 = or3.c).contains(transition2)) == 0) {
                                                            or3 = null;
                                                        }
                                                        if (or32 == null && or3 == null || or32 != null && or3 != null && (n15 = transition2.isTransitionRequired(or32, or3)) == 0 || (animator2 = transition2.createAnimator(viewGroup2, or32, or3)) == null) break block14;
                                                        if (or3 == null) break block15;
                                                        view = or3.b;
                                                        object2 = this.getTransitionProperties();
                                                        n8 = n3;
                                                        if (object2 == null || (n3 = ((String[])object2).length) <= 0) break block16;
                                                        object = new Or3(view);
                                                        object3 = pr32;
                                                        object4 = (Or3)pr32.a.get(view);
                                                        if (object4 == null) break block17;
                                                        Animator animator3 = animator2;
                                                        object3 = null;
                                                        for (n14 = 0; n14 < (n15 = ((Animator)object2).length); ++n14) {
                                                            HashMap hashMap = ((Or3)object).a;
                                                            n7 = n4;
                                                            Animator animator4 = object2[n14];
                                                            Object object5 = object2;
                                                            object2 = ((Or3)object4).a.get(animator4);
                                                            hashMap.put(animator4, object2);
                                                            object2 = object5;
                                                        }
                                                        break block18;
                                                    }
                                                    n8 = n3;
                                                    n7 = n4;
                                                    break block19;
                                                }
                                                n7 = n4;
                                                break block20;
                                            }
                                            n7 = n4;
                                            Animator animator5 = animator2;
                                        }
                                        n4 = jp.c;
                                        object3 = null;
                                        break block21;
                                    }
                                    n7 = n4;
                                    Animator animator6 = animator2;
                                    object2 = animator2;
                                    n3 = 0;
                                    object = null;
                                    break block12;
                                }
                                n8 = n3;
                                n7 = n4;
                                Animator animator7 = animator2;
                                view = or32.b;
                                bl3 = false;
                                object2 = null;
                                break block22;
                            }
                            int n16 = sparseIntArray.size();
                            if (n16 != 0) {
                                view = null;
                                for (int i3 = 0; i3 < (n16 = sparseIntArray.size()); ++i3) {
                                    n16 = sparseIntArray.keyAt(i3);
                                    object = transition2.mAnimators;
                                    Animator animator8 = (Animator)((ArrayList)object).get(n16);
                                    Transition$d transition$d = (Transition$d)jp.get(animator8);
                                    n3 = sparseIntArray.valueAt(i3);
                                    long l4 = (long)n3 - l2;
                                    Animator animator9 = transition$d.f;
                                    l3 = animator9.getStartDelay() + l4;
                                    Animator animator10 = transition$d.f;
                                    animator10.setStartDelay(l3);
                                }
                            }
                            return;
                        }
                        for (n14 = 0; n14 < n4; ++n14) {
                            boolean bl4;
                            String string2;
                            object4 = (Animator)jp.h(n14);
                            object4 = (Transition$d)jp.get(object4);
                            object2 = ((Transition$d)object4).c;
                            if (object2 == null || (object2 = ((Transition$d)object4).a) != view || !(bl3 = ((String)(object2 = ((Transition$d)object4).b)).equals(string2 = this.getName())) || !(bl4 = ((Or3)(object4 = ((Transition$d)object4).c)).equals(object))) continue;
                            bl3 = false;
                            object2 = null;
                            break block12;
                        }
                        object2 = var29_51;
                    }
                    Animator animator11 = object2;
                    object2 = object;
                }
                if (var21_38 != null) {
                    void var21_40;
                    object = transition2.mPropagation;
                    if (object != null) {
                        l3 = ((Kr3)object).a(viewGroup2, transition2, or32, or3);
                        object = transition2.mAnimators;
                        n3 = ((ArrayList)object).size();
                        n10 = (int)l3;
                        sparseIntArray.put(n3, n10);
                        l2 = Math.min(l3, l2);
                    }
                    String string3 = this.getName();
                    object3 = viewGroup.getWindowId();
                    object = new Object();
                    ((Transition$d)object).a = view;
                    ((Transition$d)object).b = string3;
                    ((Transition$d)object).c = object2;
                    ((Transition$d)object).d = object3;
                    ((Transition$d)object).e = transition2;
                    ((Transition$d)object).f = var21_38;
                    if (bl2) {
                        view = new AnimatorSet();
                        view.play((Animator)var21_38);
                        View view2 = view;
                    }
                    jp.put((Object)var21_40, object);
                    object = transition2.mAnimators;
                    ((ArrayList)object).add(var21_40);
                }
            }
            n4 = n7 + 1;
            n3 = n8;
        }
    }

    public Lr3 createSeekController() {
        Transition$h transition$h;
        this.mSeekController = transition$h = new Transition$h(this);
        this.addListener(transition$h);
        return this.mSeekController;
    }

    public void end() {
        int n3 = this.mNumInstances;
        int n4 = 1;
        this.mNumInstances = n3 -= n4;
        if (n3 == 0) {
            pb1_0 pb1_02;
            int n7;
            jr3_0 jr3_02 = Transition$j.b;
            this.notifyListeners(jr3_02, false);
            jr3_02 = null;
            for (n3 = 0; n3 < (n7 = (pb1_02 = this.mStartValues.c).n()); ++n3) {
                pb1_02 = (View)this.mStartValues.c.o(n3);
                if (pb1_02 == null) continue;
                pb1_02.setHasTransientState(false);
            }
            jr3_02 = null;
            for (n3 = 0; n3 < (n7 = (pb1_02 = this.mEndValues.c).n()); ++n3) {
                pb1_02 = (View)this.mEndValues.c.o(n3);
                if (pb1_02 == null) continue;
                pb1_02.setHasTransientState(false);
            }
            this.mEnded = n4;
        }
    }

    public Transition excludeChildren(int n3, boolean bl2) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.mTargetIdChildExcludes;
        this.mTargetIdChildExcludes = arrayList = this.excludeId(arrayList2, n3, bl2);
        return this;
    }

    public Transition excludeChildren(View object, boolean bl2) {
        ArrayList arrayList = this.mTargetChildExcludes;
        object = this.excludeView(arrayList, (View)object, bl2);
        this.mTargetChildExcludes = object;
        return this;
    }

    public Transition excludeChildren(Class serializable, boolean bl2) {
        ArrayList arrayList = this.mTargetTypeChildExcludes;
        serializable = this.excludeType(arrayList, (Class)serializable, bl2);
        this.mTargetTypeChildExcludes = serializable;
        return this;
    }

    public Transition excludeTarget(int n3, boolean bl2) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.mTargetIdExcludes;
        this.mTargetIdExcludes = arrayList = this.excludeId(arrayList2, n3, bl2);
        return this;
    }

    public Transition excludeTarget(View object, boolean bl2) {
        ArrayList arrayList = this.mTargetExcludes;
        object = this.excludeView(arrayList, (View)object, bl2);
        this.mTargetExcludes = object;
        return this;
    }

    public Transition excludeTarget(Class serializable, boolean bl2) {
        ArrayList arrayList = this.mTargetTypeExcludes;
        serializable = this.excludeType(arrayList, (Class)serializable, bl2);
        this.mTargetTypeExcludes = serializable;
        return this;
    }

    public Transition excludeTarget(String object, boolean bl2) {
        this.mTargetNameExcludes = object = Transition.excludeObject(this.mTargetNameExcludes, object, bl2);
        return this;
    }

    public void forceToEnd(ViewGroup viewGroup) {
        Object object = Transition.getRunningAnimators();
        int n3 = ((a53)object).c;
        if (viewGroup != null && n3 != 0) {
            viewGroup = viewGroup.getWindowId();
            Jp jp = new a53((a53)object);
            ((a53)object).clear();
            n3 += -1;
            while (n3 >= 0) {
                boolean bl2;
                object = (Transition$d)jp.l(n3);
                View view = ((Transition$d)object).a;
                if (view != null && (bl2 = viewGroup.equals(object = ((Transition$d)object).d))) {
                    object = (Animator)jp.h(n3);
                    object.end();
                }
                n3 += -1;
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        Transition$f transition$f = this.mEpicenterCallback;
        if (transition$f == null) {
            return null;
        }
        return transition$f.a();
    }

    public Transition$f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public Or3 getMatchedTransitionValues(View object, boolean bl2) {
        int n3;
        Object object2;
        block6: {
            Cloneable cloneable = this.mParent;
            if (cloneable != null) {
                return ((Transition)cloneable).getMatchedTransitionValues((View)object, bl2);
            }
            cloneable = bl2 ? this.mStartValuesList : this.mEndValuesList;
            object2 = null;
            if (cloneable == null) {
                return null;
            }
            int n4 = ((ArrayList)cloneable).size();
            for (n3 = 0; n3 < n4; ++n3) {
                Or3 or3 = (Or3)((ArrayList)cloneable).get(n3);
                if (or3 == null) {
                    return null;
                }
                or3 = or3.b;
                if (or3 != object) {
                    continue;
                }
                break block6;
            }
            n3 = -1;
        }
        if (n3 >= 0) {
            object = bl2 ? this.mEndValuesList : this.mStartValuesList;
            object2 = object = object.get(n3);
            object2 = (Or3)object;
        }
        return object2;
    }

    public String getName() {
        return this.mName;
    }

    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    public Kr3 getPropagation() {
        return this.mPropagation;
    }

    public final Transition getRootTransition() {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getRootTransition();
        }
        return this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List getTargetIds() {
        return this.mTargetIds;
    }

    public List getTargetNames() {
        return this.mTargetNames;
    }

    public List getTargetTypes() {
        return this.mTargetTypes;
    }

    public List getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public Or3 getTransitionValues(View view, boolean bl2) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, bl2);
        }
        Pr3 pr3 = bl2 ? this.mStartValues : this.mEndValues;
        return (Or3)pr3.a.get(view);
    }

    public boolean hasAnimators() {
        return this.mCurrentAnimators.isEmpty() ^ true;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isTransitionRequired(Or3 or3, Or3 or32) {
        String string2;
        boolean bl2;
        boolean bl3 = false;
        if (or3 == null) return bl3;
        if (or32 == null) return bl3;
        Object object = this.getTransitionProperties();
        if (object != null) {
            int n3 = ((String[])object).length;
            int n4 = 0;
            while (n4 < n3) {
                Object object2 = object[n4];
                boolean bl4 = Transition.isValueChanged(or3, or32, (String)object2);
                if (bl4) return true;
                ++n4;
            }
            return bl3;
        }
        object = or3.a.keySet().iterator();
        do {
            if (!(bl2 = object.hasNext())) return bl3;
        } while (!(bl2 = Transition.isValueChanged(or3, or32, string2 = (String)object.next())));
        return true;
    }

    public boolean isValidTarget(View view) {
        Object object;
        int n3;
        int n4 = 1;
        int n7 = view.getId();
        Object object2 = this.mTargetIdExcludes;
        if (object2 != null && (n3 = ((ArrayList)object2).contains(object = Integer.valueOf(n7))) != 0) {
            return false;
        }
        object2 = this.mTargetExcludes;
        if (object2 != null && (n3 = ((ArrayList)object2).contains(view)) != 0) {
            return false;
        }
        object2 = this.mTargetTypeExcludes;
        if (object2 != null) {
            n3 = ((ArrayList)object2).size();
            object = null;
            for (int i3 = 0; i3 < n3; i3 += n4) {
                Class clazz = (Class)this.mTargetTypeExcludes.get(i3);
                boolean bl2 = clazz.isInstance(view);
                if (!bl2) continue;
                return false;
            }
        }
        if ((object2 = this.mTargetNameExcludes) != null) {
            object2 = ViewCompat.a;
            object2 = ViewCompat$c.g(view);
            if (object2 != null && (n3 = (int)(((ArrayList)(object2 = this.mTargetNameExcludes)).contains(object = ViewCompat$c.g(view)) ? 1 : 0)) != 0) {
                return false;
            }
        }
        if (!((n3 = ((ArrayList)(object2 = this.mTargetIds)).size()) != 0 || (n3 = ((ArrayList)(object2 = this.mTargets)).size()) != 0 || (object2 = this.mTargetTypes) != null && (n3 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0)) == 0 || (object2 = this.mTargetNames) != null && (n3 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0)) == 0)) {
            return n4 != 0;
        }
        object2 = this.mTargetIds;
        Serializable serializable = Integer.valueOf(n7);
        if ((n7 = (int)(((ArrayList)object2).contains(serializable) ? 1 : 0)) == 0 && (n7 = (int)(((ArrayList)(serializable = this.mTargets)).contains(view) ? 1 : 0)) == 0) {
            serializable = this.mTargetNames;
            if (serializable != null) {
                object2 = ViewCompat.a;
                object2 = ViewCompat$c.g(view);
                n7 = (int)(((ArrayList)serializable).contains(object2) ? 1 : 0);
                if (n7 != 0) {
                    return n4 != 0;
                }
            }
            if ((serializable = this.mTargetTypes) != null) {
                serializable = null;
                for (n7 = 0; n7 < (n3 = ((ArrayList)(object2 = this.mTargetTypes)).size()); n7 += n4) {
                    object2 = (Class)this.mTargetTypes.get(n7);
                    n3 = (int)(((Class)object2).isInstance(view) ? 1 : 0);
                    if (n3 == 0) continue;
                    return n4 != 0;
                }
            }
            return false;
        }
        return n4 != 0;
    }

    public void notifyListeners(Transition$j transition$j, boolean bl2) {
        this.notifyFromTransition(this, transition$j, bl2);
    }

    public void pause(View object) {
        int n3 = this.mEnded;
        if (n3 == 0) {
            object = this.mCurrentAnimators;
            n3 = ((ArrayList)object).size();
            Animator[] animatorArray = this.mCurrentAnimators;
            Animator[] animatorArray2 = this.mAnimatorCache;
            animatorArray = animatorArray.toArray(animatorArray2);
            this.mAnimatorCache = animatorArray2 = EMPTY_ANIMATOR_ARRAY;
            int n4 = 1;
            n3 -= n4;
            while (n3 >= 0) {
                Animator animator2 = animatorArray[n3];
                animatorArray[n3] = null;
                animator2.pause();
                n3 += -1;
            }
            this.mAnimatorCache = animatorArray;
            object = Transition$j.d;
            animatorArray = null;
            this.notifyListeners((Transition$j)object, false);
            this.mPaused = n4;
        }
    }

    public void playTransition(ViewGroup object) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7 = new ArrayList();
        this.mStartValuesList = object7;
        object7 = new ArrayList();
        this.mEndValuesList = object7;
        object7 = this.mStartValues;
        Pr3 pr3 = this.mEndValues;
        this.matchStartAndEnd((Pr3)object7, pr3);
        object7 = Transition.getRunningAnimators();
        int n3 = ((a53)object7).c;
        WindowId windowId = object.getWindowId();
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0) {
            boolean bl2;
            object6 = (Animator)((a53)object7).h(n3);
            if (object6 != null && (object5 = (Transition$d)((a53)object7).get(object6)) != null && (object4 = ((Transition$d)object5).a) != null && (bl2 = windowId.equals(object3 = ((Transition$d)object5).d))) {
                boolean bl3;
                object3 = this.getTransitionValues((View)object4, n4 != 0);
                object2 = this.getMatchedTransitionValues((View)object4, n4 != 0);
                if (object3 == null && object2 == null) {
                    object2 = object4 = this.mEndValues.a.get(object4);
                    object2 = (Or3)object4;
                }
                if ((object3 != null || object2 != null) && (bl3 = ((Transition)(object4 = ((Transition$d)object5).e)).isTransitionRequired((Or3)(object5 = ((Transition$d)object5).c), (Or3)object2))) {
                    object5 = ((Transition)object4).getRootTransition().mSeekController;
                    if (object5 != null) {
                        object6.cancel();
                        object5 = ((Transition)object4).mCurrentAnimators;
                        ((ArrayList)object5).remove(object6);
                        ((a53)object7).remove(object6);
                        object6 = ((Transition)object4).mCurrentAnimators;
                        int n7 = ((ArrayList)object6).size();
                        if (n7 == 0) {
                            object6 = Transition$j.c;
                            bl3 = false;
                            object5 = null;
                            ((Transition)object4).notifyListeners((Transition$j)object6, false);
                            n7 = (int)(((Transition)object4).mEnded ? 1 : 0);
                            if (n7 == 0) {
                                ((Transition)object4).mEnded = n4;
                                object6 = Transition$j.b;
                                ((Transition)object4).notifyListeners((Transition$j)object6, false);
                            }
                        }
                    } else {
                        bl3 = object6.isRunning();
                        if (!bl3 && !(bl3 = object6.isStarted())) {
                            ((a53)object7).remove(object6);
                        } else {
                            object6.cancel();
                        }
                    }
                }
            }
            n3 += -1;
        }
        object4 = this.mStartValues;
        object3 = this.mEndValues;
        object2 = this.mStartValuesList;
        ArrayList arrayList = this.mEndValuesList;
        object6 = this;
        object5 = object;
        this.createAnimators((ViewGroup)object, (Pr3)object4, (Pr3)object3, (ArrayList)object2, arrayList);
        object = this.mSeekController;
        if (object == null) {
            this.runAnimators();
        } else {
            int n8 = Build.VERSION.SDK_INT;
            int n10 = 34;
            if (n8 >= n10) {
                this.prepareAnimatorsForSeeking();
                object = this.mSeekController;
                object7 = object.g;
                long l2 = ((Transition)object7).getTotalDurationMillis();
                long l3 = 0L;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 == false) {
                    l3 = 1L;
                }
                l2 = object.a;
                ((Transition)object7).setCurrentPlayTimeMillis(l3, l2);
                object.a = l3;
                object = this.mSeekController;
                object.b = n4;
            }
        }
    }

    public void prepareAnimatorsForSeeking() {
        ArrayList arrayList;
        int n3;
        long l2;
        Jp jp = Transition.getRunningAnimators();
        this.mTotalDuration = l2 = 0L;
        for (int i3 = 0; i3 < (n3 = (arrayList = this.mAnimators).size()); ++i3) {
            long l3;
            TimeInterpolator timeInterpolator;
            long l4;
            arrayList = (Animator)this.mAnimators.get(i3);
            Object object = (Transition$d)jp.get(arrayList);
            if (arrayList == null || object == null) continue;
            long l7 = this.getDuration();
            object = ((Transition$d)object).f;
            Object object2 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
            if (object2 >= 0) {
                l7 = this.getDuration();
                object.setDuration(l7);
            }
            if ((object2 = (l4 = (l7 = this.getStartDelay()) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) {
                l7 = this.getStartDelay();
                long l8 = object.getStartDelay() + l7;
                object.setStartDelay(l8);
            }
            if ((timeInterpolator = this.getInterpolator()) != null) {
                timeInterpolator = this.getInterpolator();
                object.setInterpolator(timeInterpolator);
            }
            object = this.mCurrentAnimators;
            ((ArrayList)object).add(arrayList);
            long l12 = this.mTotalDuration;
            long l14 = Transition$g.a((Animator)arrayList);
            this.mTotalDuration = l3 = Math.max(l12, l14);
        }
        this.mAnimators.clear();
    }

    public Transition removeListener(Transition$i object) {
        int n3;
        Cloneable cloneable = this.mListeners;
        if (cloneable == null) {
            return this;
        }
        boolean bl2 = ((ArrayList)cloneable).remove(object);
        if (!bl2 && (cloneable = this.mCloneParent) != null) {
            ((Transition)cloneable).removeListener((Transition$i)object);
        }
        if ((n3 = ((ArrayList)(object = this.mListeners)).size()) == 0) {
            n3 = 0;
            object = null;
            this.mListeners = null;
        }
        return this;
    }

    public Transition removeTarget(int n3) {
        if (n3 != 0) {
            ArrayList arrayList = this.mTargetIds;
            Integer n4 = n3;
            arrayList.remove(n4);
        }
        return this;
    }

    public Transition removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public Transition removeTarget(Class clazz) {
        ArrayList arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(clazz);
        }
        return this;
    }

    public Transition removeTarget(String string2) {
        ArrayList arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(string2);
        }
        return this;
    }

    public void resume(View object) {
        int n3 = this.mPaused;
        if (n3 != 0) {
            n3 = this.mEnded;
            if (n3 == 0) {
                object = this.mCurrentAnimators;
                n3 = ((ArrayList)object).size();
                Animator[] animatorArray = this.mCurrentAnimators;
                Animator animator2 = this.mAnimatorCache;
                animatorArray = animatorArray.toArray((T[])animator2);
                animator2 = EMPTY_ANIMATOR_ARRAY;
                this.mAnimatorCache = animator2;
                n3 += -1;
                while (n3 >= 0) {
                    animator2 = animatorArray[n3];
                    animatorArray[n3] = null;
                    animator2.resume();
                    n3 += -1;
                }
                this.mAnimatorCache = animatorArray;
                object = Transition$j.e;
                this.notifyListeners((Transition$j)object, false);
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        boolean bl2;
        this.start();
        Jp jp = Transition.getRunningAnimators();
        Iterator iterator = this.mAnimators.iterator();
        while (bl2 = iterator.hasNext()) {
            Animator animator2 = (Animator)iterator.next();
            boolean bl3 = jp.containsKey(animator2);
            if (!bl3) continue;
            this.start();
            this.runAnimator(animator2, jp);
        }
        this.mAnimators.clear();
        this.end();
    }

    public void setCanRemoveViews(boolean bl2) {
        this.mCanRemoveViews = bl2;
    }

    public void setCurrentPlayTimeMillis(long l2, long l3) {
        long l4;
        long l7;
        long l8;
        Object object;
        long l12;
        float f5;
        Transition transition2 = this;
        long l14 = l2;
        long l15 = this.getTotalDurationMillis();
        int n3 = 0;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 < 0) {
            object2 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            object2 = 0;
            f5 = 0.0f;
        }
        long l16 = 0L;
        long l17 = l3 == l16 ? 0 : (l3 < l16 ? -1 : 1);
        if (l17 < 0 && (l12 = l14 == l16 ? 0 : (l14 < l16 ? -1 : 1)) >= 0 || (l12 = l3 == l15 ? 0 : (l3 < l15 ? -1 : 1)) > 0 && (l12 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1)) <= 0) {
            transition2.mEnded = false;
            object = Transition$j.a;
            transition2.notifyListeners((Transition$j)object, (boolean)object2);
        }
        object = transition2.mCurrentAnimators;
        l12 = ((ArrayList)object).size();
        Animator[] animatorArray = transition2.mCurrentAnimators;
        Animator animator2 = transition2.mAnimatorCache;
        animatorArray = animatorArray.toArray((T[])animator2);
        animator2 = EMPTY_ANIMATOR_ARRAY;
        transition2.mAnimatorCache = animator2;
        while (n3 < l12) {
            animator2 = animatorArray[n3];
            animatorArray[n3] = null;
            long l18 = Transition$g.a(animator2);
            l8 = object2;
            long l19 = Math.min(Math.max(l16, l14), l18);
            Transition$g.b(animator2, l19);
            ++n3;
        }
        l8 = object2;
        transition2.mAnimatorCache = animatorArray;
        n3 = (int)(l14 == l15 ? 0 : (l14 < l15 ? -1 : 1));
        if (n3 > 0 && (l7 = l3 == l15 ? 0 : (l3 < l15 ? -1 : 1)) <= 0 || (l4 = l14 == l16 ? 0 : (l14 < l16 ? -1 : 1)) < 0 && l17 >= 0) {
            if (n3 > 0) {
                boolean bl2;
                transition2.mEnded = bl2 = true;
            }
            jr3_0 jr3_02 = Transition$j.b;
            n3 = (int)l8;
            transition2.notifyListeners(jr3_02, (boolean)l8);
        }
    }

    public Transition setDuration(long l2) {
        this.mDuration = l2;
        return this;
    }

    public void setEpicenterCallback(Transition$f transition$f) {
        this.mEpicenterCallback = transition$f;
    }

    public Transition setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int ... object) {
        int n3;
        if (object != null && (n3 = ((int[])object).length) != 0) {
            int n4;
            for (n3 = 0; n3 < (n4 = ((int[])object).length); ++n3) {
                n4 = (int)(Transition.isValidMatch(object[n3]) ? 1 : 0);
                if (n4 != 0) {
                    n4 = (int)(Transition.alreadyContains(object, n3) ? 1 : 0);
                    if (n4 == 0) {
                        continue;
                    }
                    object = new IllegalArgumentException;
                    object("matches contains a duplicate value");
                    throw object;
                }
                object = new IllegalArgumentException;
                object("matches contains invalid value");
                throw object;
            }
            object = (int[])object.clone();
            this.mMatchOrder = object;
        } else {
            object = DEFAULT_MATCH_ORDER;
            this.mMatchOrder = object;
        }
    }

    public void setPathMotion(PathMotion pathMotion) {
        this.mPathMotion = pathMotion == null ? (pathMotion = STRAIGHT_PATH_MOTION) : pathMotion;
    }

    public void setPropagation(Kr3 kr3) {
        this.mPropagation = kr3;
    }

    public Transition setStartDelay(long l2) {
        this.mStartDelay = l2;
        return this;
    }

    public void start() {
        int n3 = this.mNumInstances;
        if (n3 == 0) {
            ir3_0 ir3_02 = Transition$j.a;
            this.notifyListeners(ir3_02, false);
            this.mEnded = false;
        }
        this.mNumInstances = n3 = this.mNumInstances + 1;
    }

    public String toString() {
        return this.toString("");
    }

    public String toString(String object) {
        long l2;
        String string2;
        StringBuilder stringBuilder = new StringBuilder((String)object);
        object = this.getClass().getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append("@");
        int n3 = this.hashCode();
        object = Integer.toHexString(n3);
        stringBuilder.append((String)object);
        stringBuilder.append(": ");
        long l3 = this.mDuration;
        object = ") ";
        long l4 = -1;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false) {
            string2 = "dur(";
            stringBuilder.append(string2);
            l3 = this.mDuration;
            stringBuilder.append(l3);
            stringBuilder.append((String)object);
        }
        if ((l7 = (l2 = (l3 = this.mStartDelay) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            string2 = "dly(";
            stringBuilder.append(string2);
            l3 = this.mStartDelay;
            stringBuilder.append(l3);
            stringBuilder.append((String)object);
        }
        if ((string2 = this.mInterpolator) != null) {
            stringBuilder.append("interp(");
            string2 = this.mInterpolator;
            stringBuilder.append((Object)string2);
            stringBuilder.append((String)object);
        }
        if ((n3 = ((ArrayList)(object = this.mTargetIds)).size()) > 0 || (n3 = ((ArrayList)(object = this.mTargets)).size()) > 0) {
            stringBuilder.append("tgts(");
            object = this.mTargetIds;
            n3 = ((ArrayList)object).size();
            string2 = ", ";
            int n4 = 0;
            if (n3 > 0) {
                ArrayList arrayList;
                int n7;
                object = null;
                for (n3 = 0; n3 < (n7 = (arrayList = this.mTargetIds).size()); ++n3) {
                    if (n3 > 0) {
                        stringBuilder.append(string2);
                    }
                    arrayList = this.mTargetIds.get(n3);
                    stringBuilder.append(arrayList);
                }
            }
            if ((n3 = ((ArrayList)(object = this.mTargets)).size()) > 0) {
                while (n4 < (n3 = ((ArrayList)(object = this.mTargets)).size())) {
                    if (n4 > 0) {
                        stringBuilder.append(string2);
                    }
                    object = this.mTargets.get(n4);
                    stringBuilder.append(object);
                    ++n4;
                }
            }
            object = ")";
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }
}

