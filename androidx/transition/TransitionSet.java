/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.util.AndroidRuntimeException
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.Transition$f;
import androidx.transition.Transition$i;
import androidx.transition.Transition$j;
import androidx.transition.TransitionSet$a;
import androidx.transition.TransitionSet$b;
import androidx.transition.TransitionSet$c;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class TransitionSet
extends Transition {
    public ArrayList a;
    public boolean b;
    public int c;
    public boolean d;
    public int e;

    public TransitionSet() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        this.b = true;
        this.d = false;
        this.e = 0;
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        this.b = true;
        this.d = false;
        this.e = 0;
        int[] nArray = af3.g;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        attributeSet = (XmlResourceParser)attributeSet;
        int n3 = dt3.d((TypedArray)context, (XmlPullParser)attributeSet, "transitionOrdering", 0, 0);
        this.i(n3);
        context.recycle();
    }

    public final Transition addListener(Transition$i transition$i) {
        return (TransitionSet)super.addListener(transition$i);
    }

    public final Transition addTarget(int n3) {
        Cloneable cloneable;
        int n4;
        for (int i3 = 0; i3 < (n4 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).addTarget(n3);
        }
        return (TransitionSet)super.addTarget(n3);
    }

    public final Transition addTarget(View view) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).addTarget(view);
        }
        return (TransitionSet)super.addTarget(view);
    }

    public final Transition addTarget(Class clazz) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).addTarget(clazz);
        }
        return (TransitionSet)super.addTarget(clazz);
    }

    public final Transition addTarget(String string2) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).addTarget(string2);
        }
        return (TransitionSet)super.addTarget(string2);
    }

    public final void b(Transition transition2) {
        int n3;
        Object object = this.a;
        ((ArrayList)object).add(transition2);
        transition2.mParent = this;
        long l2 = this.mDuration;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            transition2.setDuration(l2);
        }
        if ((n3 = this.e & 1) != 0) {
            object = this.getInterpolator();
            transition2.setInterpolator((TimeInterpolator)object);
        }
        if ((n3 = this.e & 2) != 0) {
            object = this.getPropagation();
            transition2.setPropagation((Kr3)object);
        }
        if ((n3 = this.e & 4) != 0) {
            object = this.getPathMotion();
            transition2.setPathMotion((PathMotion)object);
        }
        if ((n3 = this.e & 8) != 0) {
            object = this.getEpicenterCallback();
            transition2.setEpicenterCallback((Transition$f)object);
        }
    }

    public final void cancel() {
        super.cancel();
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            transition2.cancel();
        }
    }

    public final void captureEndValues(Or3 or3) {
        Object object = or3.b;
        boolean bl2 = this.isValidTarget((View)object);
        if (bl2) {
            boolean bl3;
            object = this.a.iterator();
            while (bl3 = object.hasNext()) {
                Object object2;
                Transition transition2 = (Transition)object.next();
                boolean bl4 = transition2.isValidTarget((View)(object2 = or3.b));
                if (!bl4) continue;
                transition2.captureEndValues(or3);
                object2 = or3.c;
                ((ArrayList)object2).add(transition2);
            }
        }
    }

    public final void capturePropagationValues(Or3 or3) {
        super.capturePropagationValues(or3);
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            transition2.capturePropagationValues(or3);
        }
    }

    public final void captureStartValues(Or3 or3) {
        Object object = or3.b;
        boolean bl2 = this.isValidTarget((View)object);
        if (bl2) {
            boolean bl3;
            object = this.a.iterator();
            while (bl3 = object.hasNext()) {
                Object object2;
                Transition transition2 = (Transition)object.next();
                boolean bl4 = transition2.isValidTarget((View)(object2 = or3.b));
                if (!bl4) continue;
                transition2.captureStartValues(or3);
                object2 = or3.c;
                ((ArrayList)object2).add(transition2);
            }
        }
    }

    public final Transition clone() {
        ArrayList arrayList;
        TransitionSet transitionSet = (TransitionSet)super.clone();
        transitionSet.a = arrayList = new ArrayList();
        arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = ((Transition)this.a.get(i3)).clone();
            ArrayList arrayList2 = transitionSet.a;
            arrayList2.add(transition2);
            transition2.mParent = transitionSet;
        }
        return transitionSet;
    }

    public final void createAnimators(ViewGroup viewGroup, Pr3 pr3, Pr3 pr32, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = this;
        long l2 = this.getStartDelay();
        ArrayList arrayList3 = this.a;
        int n3 = arrayList3.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object e2 = transitionSet.a.get(i3);
            Object object = e2;
            object = (Transition)e2;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 > 0 && ((object2 = (Object)transitionSet.b) != false || i3 == 0)) {
                long l7 = ((Transition)object).getStartDelay();
                long l8 = l7 - l3;
                object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 > 0) {
                    ((Transition)object).setStartDelay(l7 += l2);
                } else {
                    ((Transition)object).setStartDelay(l2);
                }
            }
            ((Transition)object).createAnimators(viewGroup, pr3, pr32, arrayList, arrayList2);
        }
    }

    public final Transition d(int n3) {
        ArrayList arrayList;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (arrayList = this.a).size())) {
            return (Transition)this.a.get(n3);
        }
        return null;
    }

    public final void e(Transition transition2) {
        this.a.remove(transition2);
        transition2.mParent = null;
    }

    public final Transition excludeTarget(int n3, boolean bl2) {
        Cloneable cloneable;
        int n4;
        for (int i3 = 0; i3 < (n4 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).excludeTarget(n3, bl2);
        }
        return super.excludeTarget(n3, bl2);
    }

    public final Transition excludeTarget(View view, boolean bl2) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).excludeTarget(view, bl2);
        }
        return super.excludeTarget(view, bl2);
    }

    public final Transition excludeTarget(Class clazz, boolean bl2) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).excludeTarget(clazz, bl2);
        }
        return super.excludeTarget(clazz, bl2);
    }

    public final Transition excludeTarget(String string2, boolean bl2) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).excludeTarget(string2, bl2);
        }
        return super.excludeTarget(string2, bl2);
    }

    public final void f(long l2) {
        ArrayList arrayList;
        super.setDuration(l2);
        long l3 = this.mDuration;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 >= 0 && (arrayList = this.a) != null) {
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Transition transition2 = (Transition)this.a.get(i3);
                transition2.setDuration(l2);
            }
        }
    }

    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            transition2.forceToEnd(viewGroup);
        }
    }

    public final TransitionSet g(TimeInterpolator timeInterpolator) {
        int n3;
        this.e = n3 = this.e | 1;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Transition transition2 = (Transition)this.a.get(i3);
                transition2.setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet)super.setInterpolator(timeInterpolator);
    }

    public final boolean hasAnimators() {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            n3 = (int)(((Transition)cloneable).hasAnimators() ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(int n3) {
        int n4 = 1;
        if (n3 == 0) {
            this.b = n4;
            return;
        }
        if (n3 == n4) {
            n3 = 0;
            Object var3_3 = null;
            this.b = false;
            return;
        }
        String string2 = hj0_0.a(n3, "Invalid parameter for TransitionSet ordering: ");
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(string2);
        throw androidRuntimeException;
    }

    public final boolean isSeekingSupported() {
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            boolean bl2 = transition2.isSeekingSupported();
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final void pause(View view) {
        super.pause(view);
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            transition2.pause(view);
        }
    }

    public final void prepareAnimatorsForSeeking() {
        Cloneable cloneable;
        int n3;
        long l2;
        this.mTotalDuration = l2 = 0L;
        TransitionSet$b transitionSet$b = new TransitionSet$b(this);
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            long l3;
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).addListener(transitionSet$b);
            ((Transition)cloneable).prepareAnimatorsForSeeking();
            long l4 = ((Transition)cloneable).getTotalDurationMillis();
            boolean bl2 = this.b;
            if (bl2) {
                long l7;
                l3 = this.mTotalDuration;
                this.mTotalDuration = l7 = Math.max(l3, l4);
                continue;
            }
            ((Transition)cloneable).mSeekOffsetInParent = l3 = this.mTotalDuration;
            this.mTotalDuration = l3 += l4;
        }
    }

    public final Transition removeListener(Transition$i transition$i) {
        return (TransitionSet)super.removeListener(transition$i);
    }

    public final Transition removeTarget(int n3) {
        Cloneable cloneable;
        int n4;
        for (int i3 = 0; i3 < (n4 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).removeTarget(n3);
        }
        return (TransitionSet)super.removeTarget(n3);
    }

    public final Transition removeTarget(View view) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).removeTarget(view);
        }
        return (TransitionSet)super.removeTarget(view);
    }

    public final Transition removeTarget(Class clazz) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).removeTarget(clazz);
        }
        return (TransitionSet)super.removeTarget(clazz);
    }

    public final Transition removeTarget(String string2) {
        Cloneable cloneable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(cloneable = this.a)).size()); ++i3) {
            cloneable = (Transition)this.a.get(i3);
            ((Transition)cloneable).removeTarget(string2);
        }
        return (TransitionSet)super.removeTarget(string2);
    }

    public final void resume(View view) {
        super.resume(view);
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            transition2.resume(view);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void runAnimators() {
        int n3;
        Transition transition2;
        int n4;
        Object object = this.a;
        boolean n42 = ((ArrayList)object).isEmpty();
        if (n42) {
            this.start();
            this.end();
            return;
        }
        object = new Object();
        ((TransitionSet$c)object).a = this;
        Object object2 = this.a.iterator();
        while ((n4 = object2.hasNext()) != 0) {
            transition2 = (Transition)object2.next();
            transition2.addListener((Transition$i)object);
        }
        object = this.a;
        this.c = n3 = ((ArrayList)object).size();
        boolean bl2 = this.b;
        if (!bl2) {
            int n7;
            void var2_6;
            boolean bl3 = true;
            while (var2_6 < (n7 = ((ArrayList)(object2 = this.a)).size())) {
                object2 = this.a;
                n4 = var2_6 + -1;
                object2 = (Transition)((ArrayList)object2).get(n4);
                transition2 = (Transition)this.a.get((int)var2_6);
                TransitionSet$a transitionSet$a = new TransitionSet$a(transition2);
                ((Transition)object2).addListener(transitionSet$a);
                ++var2_6;
            }
            object = this.a;
            n7 = 0;
            object2 = null;
            if ((object = (Transition)((ArrayList)object).get(0)) != null) {
                ((Transition)object).runAnimators();
            }
        } else {
            boolean bl4;
            object = this.a.iterator();
            while (bl4 = object.hasNext()) {
                object2 = (Transition)object.next();
                ((Transition)object2).runAnimators();
            }
        }
    }

    public final void setCanRemoveViews(boolean bl2) {
        super.setCanRemoveViews(bl2);
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            transition2.setCanRemoveViews(bl2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void setCurrentPlayTimeMillis(long var1_1, long var3_2) {
        block16: {
            block17: {
                var5_3 = this;
                var6_4 = var1_1;
                var8_5 = var3_2;
                var10_6 = this.getTotalDurationMillis();
                var12_7 = this.mParent;
                var13_8 = 0L;
                if (var12_7 != null && ((var15_9 = var1_1 == var13_8 ? 0 : (var1_1 < var13_8 ? -1 : 1)) < 0 && (var15_9 = (int)(var3_2 == var13_8 ? 0 : (var3_2 < var13_8 ? -1 : 1))) < 0 || (var15_9 = (int)(var6_4 == var10_6 ? 0 : (var6_4 < var10_6 ? -1 : 1))) > 0 && (var15_9 = (int)(var8_5 == var10_6 ? 0 : (var8_5 < var10_6 ? -1 : 1))) > 0)) {
                    return;
                }
                var15_9 = 1;
                var16_10 = 0;
                var17_11 /* !! */  = null;
                var18_12 /* !! */  = (long)(var6_4 == var8_5 ? 0 : (var6_4 < var8_5 ? -1 : 1));
                if (var18_12 /* !! */  < 0) {
                    var19_13 = 1;
                    var20_14 = 1.4E-45f;
                } else {
                    var19_13 = 0;
                    var20_14 = 0.0f;
                }
                var21_15 = var6_4 == var13_8 ? 0 : (var6_4 < var13_8 ? -1 : 1);
                if (var21_15 >= 0 && (var22_16 = var8_5 == var13_8 ? 0 : (var8_5 < var13_8 ? -1 : 1)) < 0 || (var22_16 = var6_4 == var10_6 ? 0 : (var6_4 < var10_6 ? -1 : 1)) <= 0 && (var22_16 = var8_5 == var10_6 ? 0 : (var8_5 < var10_6 ? -1 : 1)) > 0) {
                    var5_3.mEnded = false;
                    var23_17 = Transition$j.a;
                    var5_3.notifyListeners((Transition$j)var23_17, (boolean)var19_13);
                }
                if ((var22_16 = (long)var5_3.b) != false) {
                    while (var16_10 < (var18_12 /* !! */  = (long)(var24_18 = var5_3.a).size())) {
                        var24_18 = (Transition)var5_3.a.get(var16_10);
                        var24_18.setCurrentPlayTimeMillis(var6_4, var8_5);
                        ++var16_10;
                    }
                    while (true) {
                        var25_21 /* !! */  = var19_13;
                        var26_22 = var21_15;
                        break block16;
                        break;
                    }
                }
                for (var16_10 = 1; var16_10 < (var22_16 = (long)(var23_17 = var5_3.a).size()); ++var16_10) {
                    var23_17 = (Transition)var5_3.a.get(var16_10);
                    var27_23 = var23_17.mSeekOffsetInParent;
                    cfr_temp_0 = var27_23 - var8_5;
                    var25_21 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var25_21 /* !! */  <= 0) continue;
lbl40:
                    // 2 sources

                    while (true) {
                        var16_10 -= var15_9;
                        break block17;
                        break;
                    }
                }
                var17_11 /* !! */  = var5_3.a;
                var16_10 = var17_11 /* !! */ .size();
                ** while (true)
            }
            if (var18_12 /* !! */  >= 0) {
                while (true) {
                    if (var16_10 >= (var18_12 /* !! */  = (long)(var24_19 = var5_3.a).size())) ** continue;
                    var24_19 = (Transition)var5_3.a.get(var16_10);
                    var27_23 = var24_19.mSeekOffsetInParent;
                    var25_21 /* !! */  = var19_13;
                    var26_22 = var21_15;
                    var29_24 = var6_4 - var27_23;
                    cfr_temp_1 = var29_24 - var13_8;
                    var31_26 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var31_26 /* !! */  >= 0) {
                        var27_23 = var8_5 - var27_23;
                        var24_19.setCurrentPlayTimeMillis(var29_24, var27_23);
                        ++var16_10;
                        continue;
                    }
                    break;
                }
            } else {
                var25_21 /* !! */  = var19_13;
                var26_22 = var21_15;
                while (var16_10 >= 0) {
                    var24_20 = (Transition)var5_3.a.get(var16_10);
                    var29_25 = var24_20.mSeekOffsetInParent;
                    var27_23 = var6_4 - var29_25;
                    var29_25 = var8_5 - var29_25;
                    var24_20.setCurrentPlayTimeMillis(var27_23, var29_25);
                    var18_12 /* !! */  = var27_23 == var13_8 ? 0 : (var27_23 < var13_8 ? -1 : 1);
                    if (var18_12 /* !! */  >= 0) break;
                    var16_10 += -1;
                }
            }
        }
        var17_11 /* !! */  = var5_3.mParent;
        if (var17_11 /* !! */  != null && ((var16_10 = (int)(var6_4 == var10_6 ? 0 : (var6_4 < var10_6 ? -1 : 1))) > 0 && (var32_27 = var8_5 == var10_6 ? 0 : (var8_5 < var10_6 ? -1 : 1)) <= 0 || var26_22 < 0 && (var32_27 = var8_5 == var13_8 ? 0 : (var8_5 < var13_8 ? -1 : 1)) >= 0)) {
            if (var16_10 > 0) {
                var5_3.mEnded = var15_9;
            }
            var33_28 = Transition$j.b;
            var15_9 = var25_21 /* !! */ ;
            var5_3.notifyListeners(var33_28, (boolean)var25_21 /* !! */ );
        }
    }

    public final void setEpicenterCallback(Transition$f transition$f) {
        int n3;
        super.setEpicenterCallback(transition$f);
        this.e = n3 = this.e | 8;
        ArrayList arrayList = this.a;
        n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            transition2.setEpicenterCallback(transition$f);
        }
    }

    public final void setPathMotion(PathMotion pathMotion) {
        int n3;
        super.setPathMotion(pathMotion);
        this.e = n3 = this.e | 4;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            Cloneable cloneable;
            int n4;
            arrayList = null;
            for (n3 = 0; n3 < (n4 = ((ArrayList)(cloneable = this.a)).size()); ++n3) {
                cloneable = (Transition)this.a.get(n3);
                ((Transition)cloneable).setPathMotion(pathMotion);
            }
        }
    }

    public final void setPropagation(Kr3 kr3) {
        int n3;
        super.setPropagation(kr3);
        this.e = n3 = this.e | 2;
        ArrayList arrayList = this.a;
        n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Transition transition2 = (Transition)this.a.get(i3);
            transition2.setPropagation(kr3);
        }
    }

    public final Transition setStartDelay(long l2) {
        return (TransitionSet)super.setStartDelay(l2);
    }

    public final String toString(String string2) {
        Object object;
        int n3;
        CharSequence charSequence = super.toString(string2);
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.a)).size()); ++i3) {
            charSequence = nn_2.a((String)charSequence, "\n");
            object = (Transition)this.a.get(i3);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append(string2);
            String string3 = "  ";
            charSequence2.append(string3);
            charSequence2 = charSequence2.toString();
            object = ((Transition)object).toString((String)charSequence2);
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

