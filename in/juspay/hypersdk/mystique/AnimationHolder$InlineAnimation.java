/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TimeInterpolator
 *  android.util.Property
 *  android.view.View
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.BounceInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 *  android.view.animation.PathInterpolator
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.mystique;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import in.juspay.hypersdk.mystique.AnimationHolder;
import in.juspay.hypersdk.mystique.AnimationHolder$CallbackHolder;
import in.juspay.hypersdk.mystique.AnimationHolder$InlineAnimation$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.json.JSONObject;

class AnimationHolder$InlineAnimation {
    private static final String DELAY = "delay";
    private static final String DURATION = "duration";
    private static final String FROM_ALPHA = "fromAlpha";
    private static final String FROM_ROTATION = "fromRotation";
    private static final String FROM_ROTATION_X = "fromRotationX";
    private static final String FROM_ROTATION_Y = "fromRotationY";
    private static final String FROM_SCALE_X = "fromScaleX";
    private static final String FROM_SCALE_Y = "fromScaleY";
    private static final String FROM_X = "fromX";
    private static final String FROM_Y = "fromY";
    private static final String INTERPOLATOR = "interpolator";
    private static final String REPEAT_COUNT = "repeatCount";
    private static final String REPEAT_MODE = "repeatMode";
    private static final String TAG = "tag";
    private static final String TO_ALPHA = "toAlpha";
    private static final String TO_ROTATION = "toRotation";
    private static final String TO_ROTATION_X = "toRotationX";
    private static final String TO_ROTATION_Y = "toRotationY";
    private static final String TO_SCALE_X = "toScaleX";
    private static final String TO_SCALE_Y = "toScaleY";
    private static final String TO_X = "toX";
    private static final String TO_Y = "toY";
    private ObjectAnimator animator;
    private ArrayList holders;
    private JSONObject newProperties;
    private JSONObject properties;
    final /* synthetic */ AnimationHolder this$0;
    private final WeakReference viewRef;

    public AnimationHolder$InlineAnimation(AnimationHolder weakReference, JSONObject jSONObject, View view) {
        this.this$0 = weakReference;
        weakReference = new WeakReference<View>();
        this.holders = weakReference;
        this.viewRef = weakReference = new WeakReference<View>(view);
        this.properties = jSONObject;
    }

    private void createAnimator() {
        Object object;
        Object object2 = this.viewRef.get();
        if (object2 == null) {
            return;
        }
        object2 = (View)this.viewRef.get();
        this.holders = object = new ArrayList();
        this.animator = object = new ObjectAnimator();
        object.setTarget(object2);
        object = this.animator;
        Object object3 = this.getInterpolator();
        object.setInterpolator((TimeInterpolator)object3);
        object = this.animator;
        object3 = this.this$0;
        Object object4 = this.properties;
        float f5 = 1.0f;
        long l2 = (int)AnimationHolder.access$400((AnimationHolder)object3, (JSONObject)object4, DURATION, 0.0f, f5);
        object.setDuration(l2);
        object = this.animator;
        object3 = this.this$0;
        object4 = this.properties;
        String string2 = DELAY;
        float f6 = AnimationHolder.access$400((AnimationHolder)object3, (JSONObject)object4, string2, 0.0f, f5);
        int n3 = (int)f6;
        l2 = n3;
        object.setStartDelay(l2);
        object = this.this$0;
        object3 = this.properties;
        object4 = REPEAT_COUNT;
        float f7 = AnimationHolder.access$400((AnimationHolder)object, (JSONObject)object3, (String)object4, 0.0f, f5);
        int n4 = (int)f7;
        this.animator.setRepeatCount(n4);
        object = this.properties;
        object3 = REPEAT_MODE;
        n4 = (int)(object.has((String)object3) ? 1 : 0);
        if (n4 != 0) {
            object = this.this$0;
            object4 = this.properties;
            string2 = null;
            object = AnimationHolder.access$000((AnimationHolder)object, (JSONObject)object4, (String)object3, null);
            n4 = (int)("reverse".equals(object) ? 1 : 0);
            object3 = this.animator;
            if (n4 != 0) {
                n4 = 2;
                f7 = 2.8E-45f;
            } else {
                n4 = 1;
                f7 = Float.MIN_VALUE;
            }
            object3.setRepeatMode(n4);
        }
        object = View.ALPHA;
        f6 = object2.getAlpha();
        object4 = new String[]{FROM_ALPHA, TO_ALPHA};
        this.createPropertyHolder((Property)object, f6, (String)object4);
        object = View.ROTATION;
        f6 = object2.getRotation();
        object4 = new String[]{FROM_ROTATION, TO_ROTATION};
        this.createPropertyHolder((Property)object, f6, (String)object4);
        object = View.ROTATION_X;
        f6 = object2.getRotationX();
        object4 = new String[]{FROM_ROTATION_X, TO_ROTATION_X};
        this.createPropertyHolder((Property)object, f6, (String)object4);
        object = View.ROTATION_Y;
        f6 = object2.getRotationY();
        object4 = new String[]{FROM_ROTATION_Y, TO_ROTATION_Y};
        this.createPropertyHolder((Property)object, f6, (String)object4);
        object = View.SCALE_X;
        f6 = object2.getScaleX();
        object4 = new String[]{FROM_SCALE_X, TO_SCALE_X};
        this.createPropertyHolder((Property)object, f6, (String)object4);
        object = View.SCALE_Y;
        f6 = object2.getScaleY();
        object4 = new String[]{FROM_SCALE_Y, TO_SCALE_Y};
        this.createPropertyHolder((Property)object, f6, (String)object4);
        object = View.TRANSLATION_X;
        f6 = object2.getTranslationX();
        string2 = TO_X;
        object4 = new String[]{FROM_X, string2};
        this.createPropertyHolder((Property)object, f6, (String)object4);
        object = View.TRANSLATION_Y;
        float f8 = object2.getTranslationY();
        object4 = TO_Y;
        object3 = new String[]{FROM_Y, object4};
        this.createPropertyHolder((Property)object, f8, (String[])object3);
        int n7 = this.holders.size();
        object2 = new PropertyValuesHolder[n7];
        f7 = 0.0f;
        object = null;
        for (n4 = 0; n4 < (n3 = ((ArrayList)(object3 = this.holders)).size()); ++n4) {
            object3 = (PropertyValuesHolder)this.holders.get(n4);
            object2[n4] = object3;
        }
        this.animator.setValues(object2);
    }

    private void createPropertyHolder(Property property, float f5, String ... stringArray) {
        int n3;
        float f6;
        AnimationHolder animationHolder = this.this$0;
        Object object = this.properties;
        int n4 = AnimationHolder.access$500(animationHolder, object, stringArray);
        if (n4 == 0) {
            return;
        }
        animationHolder = View.TRANSLATION_Y;
        if (property != animationHolder && property != (animationHolder = View.TRANSLATION_X)) {
            n4 = 1065353216;
            f6 = 1.0f;
        } else {
            animationHolder = this.this$0;
            f6 = AnimationHolder.access$600(animationHolder);
        }
        int n7 = stringArray.length;
        object = new float[n7];
        for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
            AnimationHolder animationHolder2 = this.this$0;
            JSONObject jSONObject = this.properties;
            String string2 = stringArray[i3];
            float f7 = AnimationHolder.access$400(animationHolder2, jSONObject, string2, f5, f6);
            object[i3] = (JSONObject)f7;
        }
        ArrayList arrayList = this.holders;
        property = PropertyValuesHolder.ofFloat((Property)property, (float[])object);
        arrayList.add(property);
    }

    private Interpolator getInterpolator() {
        int n3 = 3;
        Object object = 4.2E-45f;
        int n4 = 2;
        Object object2 = 2.8E-45f;
        Object object3 = 0.0f;
        int n7 = 1;
        Object object4 = Float.MIN_VALUE;
        PathInterpolator pathInterpolator = this.this$0;
        Object object5 = this.properties;
        String string2 = INTERPOLATOR;
        String string3 = "linear";
        pathInterpolator = AnimationHolder.access$000((AnimationHolder)pathInterpolator, object5, string2, string3);
        pathInterpolator.getClass();
        int n8 = -1;
        int n10 = pathInterpolator.hashCode();
        switch (n10) {
            default: {
                break;
            }
            case 1360213211: {
                string2 = "easeinout";
                n10 = (int)(pathInterpolator.equals(string2) ? 1 : 0);
                if (n10 == 0) break;
                n8 = 3;
                break;
            }
            case -1310315117: {
                string2 = "easein";
                n10 = (int)(pathInterpolator.equals(string2) ? 1 : 0);
                if (n10 == 0) break;
                n8 = 2;
                break;
            }
            case -1383205240: {
                string2 = "bounce";
                n10 = (int)(pathInterpolator.equals(string2) ? 1 : 0);
                if (n10 == 0) break;
                n8 = 1;
                break;
            }
            case -1965056864: {
                string2 = "easeout";
                n10 = (int)(pathInterpolator.equals(string2) ? 1 : 0);
                if (n10 == 0) break;
                n8 = 0;
                object5 = null;
            }
        }
        switch (n8) {
            default: {
                object5 = ",";
                n10 = (int)(pathInterpolator.contains((CharSequence)object5) ? 1 : 0);
                if (n10 != 0) {
                    int n14;
                    pathInterpolator = pathInterpolator.split((String)object5);
                    n8 = 4;
                    object5 = new float[n8];
                    object5[0] = (JSONObject)0.0f;
                    object5[n7] = (JSONObject)0.0f;
                    object5[n4] = (JSONObject)0.0f;
                    object5[n3] = (JSONObject)0.0f;
                    string2 = null;
                    for (n10 = 0; n10 < (n14 = ((String[])pathInterpolator).length); n10 += n7) {
                        string3 = pathInterpolator[n10];
                        float f5 = Float.parseFloat(string3);
                        object5[n10] = (JSONObject)f5;
                    }
                    object3 = object5[0];
                    object4 = object5[n7];
                    object2 = object5[n4];
                    object = object5[n3];
                    pathInterpolator = new PathInterpolator(object3, object4, object2, object);
                    return pathInterpolator;
                }
                LinearInterpolator linearInterpolator = new LinearInterpolator();
                return linearInterpolator;
            }
            case 3: {
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                return accelerateDecelerateInterpolator;
            }
            case 2: {
                AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
                return accelerateInterpolator;
            }
            case 1: {
                BounceInterpolator bounceInterpolator = new BounceInterpolator();
                return bounceInterpolator;
            }
            case 0: 
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        return decelerateInterpolator;
    }

    private boolean isSame(JSONObject jSONObject) {
        boolean bl2;
        Object object = this.this$0;
        Object object2 = this.properties;
        object = AnimationHolder.access$100((AnimationHolder)object, (JSONObject)object2);
        object2 = AnimationHolder.access$100(this.this$0, jSONObject).iterator();
        while (true) {
            boolean bl3 = object2.hasNext();
            bl2 = false;
            if (!bl3) break;
            String string2 = (String)object2.next();
            boolean bl4 = object.contains(string2);
            if (!bl4) {
                return false;
            }
            Object object3 = this.this$0;
            Object object4 = this.properties;
            bl4 = ((String)(object3 = AnimationHolder.access$000((AnimationHolder)object3, object4, string2, ""))).equals(object4 = AnimationHolder.access$000(this.this$0, jSONObject, string2, null));
            if (!bl4) {
                return false;
            }
            object.remove(string2);
        }
        int n3 = object.size();
        if (n3 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    private void resetAnimation() {
        Property property = View.ALPHA;
        String[] stringArray = new String[]{FROM_ALPHA, TO_ALPHA};
        float f5 = 1.0f;
        this.resetProperty(property, f5, stringArray);
        property = View.ROTATION;
        stringArray = new String[]{FROM_ROTATION, TO_ROTATION};
        this.resetProperty(property, 0.0f, stringArray);
        property = View.ROTATION_X;
        stringArray = new String[]{FROM_ROTATION_X, TO_ROTATION_X};
        this.resetProperty(property, 0.0f, stringArray);
        property = View.ROTATION_Y;
        stringArray = new String[]{FROM_ROTATION_Y, TO_ROTATION_Y};
        this.resetProperty(property, 0.0f, stringArray);
        property = View.SCALE_X;
        stringArray = new String[]{FROM_SCALE_X, TO_SCALE_X};
        this.resetProperty(property, f5, stringArray);
        property = View.SCALE_Y;
        stringArray = new String[]{FROM_SCALE_Y, TO_SCALE_Y};
        this.resetProperty(property, f5, stringArray);
        property = View.TRANSLATION_X;
        stringArray = new String[]{FROM_X, TO_X};
        this.resetProperty(property, 0.0f, stringArray);
        property = View.TRANSLATION_Y;
        stringArray = new String[]{FROM_Y, TO_Y};
        this.resetProperty(property, 0.0f, stringArray);
    }

    private void resetProperty(Property property, float f5, String ... view) {
        boolean bl2;
        AnimationHolder animationHolder = this.this$0;
        Object object = this.properties;
        boolean bl3 = AnimationHolder.access$500(animationHolder, object, (String[])view);
        if (!bl3) {
            return;
        }
        animationHolder = this.newProperties;
        if (animationHolder != null && (bl2 = AnimationHolder.access$500((AnimationHolder)(object = this.this$0), (JSONObject)animationHolder, (String[])view))) {
            return;
        }
        view = (View)this.viewRef.get();
        Float f6 = Float.valueOf(f5);
        property.set((Object)view, (Object)f6);
    }

    private void setEventListeners() {
        Object object = AnimationHolder.access$200(this.this$0);
        if (object == null) {
            return;
        }
        object = AnimationHolder.access$300(this.this$0);
        Object object2 = this.viewRef.get();
        if ((object = (AnimationHolder$CallbackHolder)((WeakHashMap)object).get(object2)) != null && ((object2 = ((AnimationHolder$CallbackHolder)object).getOnEnd()) != null || (object2 = ((AnimationHolder$CallbackHolder)object).getOnStart()) != null)) {
            object2 = this.animator;
            AnimationHolder$InlineAnimation$1 animationHolder$InlineAnimation$1 = new AnimationHolder$InlineAnimation$1(this, (AnimationHolder$CallbackHolder)object);
            object2.addListener((Animator.AnimatorListener)animationHolder$InlineAnimation$1);
        }
    }

    public String getName() {
        AnimationHolder animationHolder = this.this$0;
        JSONObject jSONObject = this.properties;
        return AnimationHolder.access$000(animationHolder, jSONObject, "name", "");
    }

    public String getTag() {
        AnimationHolder animationHolder = this.this$0;
        JSONObject jSONObject = this.properties;
        return AnimationHolder.access$000(animationHolder, jSONObject, TAG, "untagged");
    }

    public void remove() {
        this.stop();
        this.resetAnimation();
    }

    public void start() {
        this.createAnimator();
        this.setEventListeners();
        this.animator.start();
    }

    public void stop() {
        ObjectAnimator objectAnimator = this.animator;
        boolean bl2 = objectAnimator.isRunning();
        if (bl2) {
            objectAnimator = this.animator;
            objectAnimator.cancel();
        }
    }

    public void update(JSONObject jSONObject, Boolean bl2) {
        boolean bl3 = bl2;
        if (!bl3 && (bl3 = this.isSame(jSONObject))) {
            return;
        }
        this.stop();
        this.newProperties = jSONObject;
        this.resetAnimation();
        this.newProperties = null;
        this.properties = jSONObject;
        this.start();
    }
}

