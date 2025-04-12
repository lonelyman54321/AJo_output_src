/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.Property
 */
package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import com.google.android.material.animation.MotionTiming;
import java.util.ArrayList;
import java.util.List;

public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final a53 propertyValues;
    private final a53 timings;

    public MotionSpec() {
        a53 a532;
        this.timings = a532 = new a53();
        this.propertyValues = a532 = new a53();
    }

    private static void addInfoFromAnimator(MotionSpec object, Animator object2) {
        boolean bl2 = object2 instanceof ObjectAnimator;
        if (bl2) {
            object2 = (ObjectAnimator)object2;
            String string2 = object2.getPropertyName();
            PropertyValuesHolder[] propertyValuesHolderArray = object2.getValues();
            ((MotionSpec)object).setPropertyValues(string2, propertyValuesHolderArray);
            string2 = object2.getPropertyName();
            object2 = MotionTiming.createFromAnimator((ValueAnimator)object2);
            ((MotionSpec)object).setTiming(string2, (MotionTiming)object2);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Animator must be an ObjectAnimator: ");
        stringBuilder.append(object2);
        object2 = stringBuilder.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    private PropertyValuesHolder[] clonePropertyValuesHolder(PropertyValuesHolder[] propertyValuesHolderArray) {
        int n3;
        int n4 = propertyValuesHolderArray.length;
        PropertyValuesHolder[] propertyValuesHolderArray2 = new PropertyValuesHolder[n4];
        for (int i3 = 0; i3 < (n3 = propertyValuesHolderArray.length); ++i3) {
            PropertyValuesHolder propertyValuesHolder;
            propertyValuesHolderArray2[i3] = propertyValuesHolder = propertyValuesHolderArray[i3].clone();
        }
        return propertyValuesHolderArray2;
    }

    public static MotionSpec createFromAttribute(Context context, TypedArray typedArray, int n3) {
        boolean bl2 = typedArray.hasValue(n3);
        if (bl2) {
            bl2 = false;
            int n4 = typedArray.getResourceId(n3, 0);
            if (n4 != 0) {
                return MotionSpec.createFromResource(context, n4);
            }
        }
        return null;
    }

    public static MotionSpec createFromResource(Context object, int n3) {
        try {
            object = AnimatorInflater.loadAnimator((Context)object, (int)n3);
        }
        catch (Exception exception) {
            Integer.toHexString(n3);
            return null;
        }
        boolean bl2 = object instanceof AnimatorSet;
        if (bl2) {
            object = (AnimatorSet)object;
            object = object.getChildAnimations();
            return MotionSpec.createSpecFromAnimators((List)object);
        }
        if (object != null) {
            ArrayList<Context> arrayList = new ArrayList<Context>();
            arrayList.add((Context)object);
            return MotionSpec.createSpecFromAnimators(arrayList);
        }
        return null;
    }

    private static MotionSpec createSpecFromAnimators(List list) {
        MotionSpec motionSpec = new MotionSpec();
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Animator animator2 = (Animator)list.get(i3);
            MotionSpec.addInfoFromAnimator(motionSpec, animator2);
        }
        return motionSpec;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof MotionSpec;
        if (!bl2) {
            return false;
        }
        object = (MotionSpec)object;
        a53 a532 = this.timings;
        object = ((MotionSpec)object).timings;
        return a532.equals(object);
    }

    public ObjectAnimator getAnimator(String string2, Object object, Property property) {
        PropertyValuesHolder[] propertyValuesHolderArray = this.getPropertyValues(string2);
        object = ObjectAnimator.ofPropertyValuesHolder((Object)object, (PropertyValuesHolder[])propertyValuesHolderArray);
        object.setProperty(property);
        this.getTiming(string2).apply((Animator)object);
        return object;
    }

    public PropertyValuesHolder[] getPropertyValues(String propertyValuesHolderArray) {
        boolean bl2 = this.hasPropertyValues((String)propertyValuesHolderArray);
        if (bl2) {
            propertyValuesHolderArray = (PropertyValuesHolder[])this.propertyValues.get(propertyValuesHolderArray);
            return this.clonePropertyValuesHolder(propertyValuesHolderArray);
        }
        propertyValuesHolderArray = new IllegalArgumentException();
        throw propertyValuesHolderArray;
    }

    public MotionTiming getTiming(String object) {
        boolean bl2 = this.hasTiming((String)object);
        if (bl2) {
            return (MotionTiming)this.timings.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public long getTotalDuration() {
        a53 a532 = this.timings;
        int n3 = a532.c;
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            MotionTiming motionTiming = (MotionTiming)this.timings.l(i3);
            long l3 = motionTiming.getDelay();
            long l4 = motionTiming.getDuration() + l3;
            l2 = Math.max(l2, l4);
        }
        return l2;
    }

    public boolean hasPropertyValues(String object) {
        boolean bl2;
        a53 a532 = this.propertyValues;
        if ((object = a532.get(object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean hasTiming(String object) {
        boolean bl2;
        a53 a532 = this.timings;
        if ((object = a532.get(object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String string2, PropertyValuesHolder[] propertyValuesHolderArray) {
        this.propertyValues.put(string2, propertyValuesHolderArray);
    }

    public void setTiming(String string2, MotionTiming motionTiming) {
        this.timings.put(string2, motionTiming);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n");
        Object object = this.getClass().getName();
        stringBuilder.append((String)object);
        stringBuilder.append('{');
        object = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append((String)object);
        stringBuilder.append(" timings: ");
        object = this.timings;
        stringBuilder.append(object);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

